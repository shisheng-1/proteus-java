package io.netifi.proteus.tags;

import com.google.common.collect.ForwardingMap;
import com.google.common.collect.Table;
import com.google.common.collect.Tables;
import java.util.*;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import org.agrona.collections.*;
import org.roaringbitmap.longlong.LongIterator;
import org.roaringbitmap.longlong.Roaring64NavigableMap;
import reactor.core.publisher.DirectProcessor;
import reactor.core.publisher.Flux;

public class IndexableMapWrapper<K, V> extends ForwardingMap<K, V> implements IndexableMap<K, V> {
  private final Map<K, V> delegate;
  private final DirectProcessor<Event<K>> events;
  private final Long2ObjectHashMap<K> indexToKey;
  private final Object2LongHashMap<K> keyToIndex;
  private final Object2ObjectHashMap<K, Tags> keyToTags;
  private final Table<CharSequence, CharSequence, Roaring64NavigableMap> tagIndexes;

  private static final AtomicLongFieldUpdater<IndexableMapWrapper> KEY_INDEX =
      AtomicLongFieldUpdater.newUpdater(IndexableMapWrapper.class, "keyIndex");
  volatile long keyIndex;

  public IndexableMapWrapper(Map<K, V> delegate) {
    this.delegate = delegate;
    this.events = DirectProcessor.create();
    this.indexToKey = new Long2ObjectHashMap<>();
    this.keyToIndex = new Object2LongHashMap<>(-1);
    this.keyToTags = new Object2ObjectHashMap<>();
    this.tagIndexes =
        Tables.newCustomTable(new Object2ObjectHashMap<>(), Object2ObjectHashMap::new);
  }

  /**
   * Wraps an map
   *
   * @param target the map to wrapped
   * @param <K>
   * @param <V>
   * @return a IndexableMap
   */
  public static <K, V> IndexableMapWrapper<K, V> wrap(Map<K, V> target) {
    return new IndexableMapWrapper<>(target);
  }

  @Override
  public boolean contains(Tags tags) {
    Roaring64NavigableMap result = null;
    synchronized (this) {
      for (Entry<CharSequence, CharSequence> entry : tags) {
        Roaring64NavigableMap bitmap = tagIndexes.get(entry.getKey(), entry.getValue());

        if (bitmap == null) {
          return false;
        }

        if (result == null) {
          result = bitmap;
        } else {
          result.and(bitmap);
        }

        if (result.isEmpty()) {
          return false;
        }
      }
    }

    if (result == null) {
      return false;
    }

    return !result.isEmpty();
  }

  @Override
  public Iterable<Entry<K, V>> query(Tags tags) {
    Roaring64NavigableMap result = null;
    synchronized (this) {
      for (Entry<CharSequence, CharSequence> entry : tags) {
        Roaring64NavigableMap bitmap = tagIndexes.get(entry.getKey(), entry.getValue());

        if (bitmap == null) {
          return Collections.emptyList();
        }

        if (result == null) {
          result = bitmap;
        } else {
          result.and(bitmap);
        }

        if (result.isEmpty()) {
          return Collections.emptyList();
        }
      }
    }

    if (result == null) {
      return Collections.emptyList();
    }

    return new QueryResultIterable(result.getLongIterator());
  }

  private synchronized Entry<K, V> getEntry(long keyIndex) {
    K k = indexToKey.get(keyIndex);
    V v = delegate.get(k);
    return new SimpleImmutableEntry<>(k, v);
  }

  @Override
  public Flux<Event<K>> events() {
    return events;
  }

  @Override
  public Flux<Event<K>> events(Tags tags) {
    Objects.requireNonNull(tags);

    return events.filter(
        event -> {
          Tags eventTags = event.getTags();
          if (eventTags == null) {
            return false;
          }

          for (Entry<CharSequence, CharSequence> entry : tags) {
            if (!eventTags.contains(entry.getKey(), entry.getValue())) {
              return false;
            }
          }

          return true;
        });
  }

  @Override
  public Flux<Event<K>> eventsByTagKeys(CharSequence... tags) {
    Objects.requireNonNull(tags);

    return events.filter(
        event -> {
          Tags eventTags = event.getTags();
          if (eventTags == null) {
            return false;
          }

          for (CharSequence key : tags) {
            if (!eventTags.contains(key)) {
              return false;
            }
          }

          return true;
        });
  }

  @Override
  protected Map<K, V> delegate() {
    return delegate;
  }

  @Override
  public V put(K key, V value) {
    return put(key, value, EmptyTags.INSTANCE);
  }

  @Override
  public void putAll(Map<? extends K, ? extends V> map) {
    standardPutAll(map);
  }

  @Override
  public V put(K key, V value, Tags tags) {
    synchronized (this) {
      long keyIndex = keyToIndex.getValue(key);
      if (keyIndex == keyToIndex.missingValue()) {
        keyIndex = getNextKeyIndex();
        indexToKey.put(keyIndex, key);
        keyToIndex.put(key, keyIndex);
        keyToTags.put(key, tags);
      } else {
        // Remove old tags
        Tags oldTags = keyToTags.put(key, tags);
        if (oldTags != null) {
          removeTags(keyIndex, oldTags);
        }
      }

      for (Entry<CharSequence, CharSequence> entry : tags) {
        Roaring64NavigableMap bitmap = tagIndexes.get(entry.getKey(), entry.getValue());
        if (bitmap == null) {
          bitmap = new Roaring64NavigableMap();
          tagIndexes.put(entry.getKey(), entry.getValue(), bitmap);
        }

        bitmap.add(keyIndex);
      }
    }

    V oldValue = delegate.put(key, value);

    Event.EventType type = oldValue == null ? Event.EventType.ADD : Event.EventType.UPDATE;
    Event<K> kEvent = Event.of(type, key, tags);
    events.onNext(kEvent);

    return oldValue;
  }

  private void removeTags(long keyIndex, Tags tags) {
    Objects.requireNonNull(tags);
    for (Entry<CharSequence, CharSequence> entry : tags) {
      Roaring64NavigableMap bitmap = tagIndexes.get(entry.getKey(), entry.getValue());

      if (bitmap != null) {
        bitmap.removeLong(keyIndex);

        if (bitmap.isEmpty()) {
          tagIndexes.remove(entry.getKey(), entry.getValue());
        }
      }
    }
  }

  @Override
  public V remove(Object key) {
    V remove = delegate.remove(key);

    if (remove != null) {
      Event<K> event;
      synchronized (this) {
        long keyIndex = keyToIndex.removeKey((K) key);
        indexToKey.remove(keyIndex);

        Tags tags = keyToTags.remove(key);
        if (tags != null) {
          removeTags(keyIndex, tags);
        }

        event = Event.of(Event.EventType.REMOVE, (K) key, tags);
      }

      events.onNext(event);
    }

    return remove;
  }

  @Override
  public void clear() {
    standardClear();
  }

  private long getNextKeyIndex() {
    return KEY_INDEX.incrementAndGet(this);
  }

  private class QueryResultIterable implements Iterable<Entry<K, V>>, Iterator<Entry<K, V>> {
    private final LongIterator queryResults;

    QueryResultIterable(LongIterator queryResults) {
      this.queryResults = queryResults;
    }

    @Override
    public Iterator<Entry<K, V>> iterator() {
      return this;
    }

    @Override
    public boolean hasNext() {
      return queryResults.hasNext();
    }

    @Override
    public Entry<K, V> next() {
      if (queryResults.hasNext()) {
        long next = queryResults.next();
        return getEntry(next);
      } else {
        throw new NoSuchElementException();
      }
    }
  }
}
