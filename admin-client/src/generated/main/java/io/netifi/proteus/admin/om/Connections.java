// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: admin.proto

package io.netifi.proteus.admin.om;

/**
 * Protobuf type {@code io.netifi.proteus.admin.om.Connections}
 */
public  final class Connections extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.netifi.proteus.admin.om.Connections)
    ConnectionsOrBuilder {
  // Use Connections.newBuilder() to construct.
  private Connections(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Connections() {
    connections_ = java.util.Collections.emptyList();
    metadata_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    class__ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Connections(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              connections_ = new java.util.ArrayList<io.netifi.proteus.admin.om.Connection>();
              mutable_bitField0_ |= 0x00000001;
            }
            connections_.add(
                input.readMessage(io.netifi.proteus.admin.om.Connection.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              metadata_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            metadata_.add(s);
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            class__ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        connections_ = java.util.Collections.unmodifiableList(connections_);
      }
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        metadata_ = metadata_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.netifi.proteus.admin.om.ProteusAdmin.internal_static_io_netifi_proteus_admin_om_Connections_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.netifi.proteus.admin.om.ProteusAdmin.internal_static_io_netifi_proteus_admin_om_Connections_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.netifi.proteus.admin.om.Connections.class, io.netifi.proteus.admin.om.Connections.Builder.class);
  }

  private int bitField0_;
  public static final int CONNECTIONS_FIELD_NUMBER = 1;
  private java.util.List<io.netifi.proteus.admin.om.Connection> connections_;
  /**
   * <code>repeated .io.netifi.proteus.admin.om.Connection connections = 1;</code>
   */
  public java.util.List<io.netifi.proteus.admin.om.Connection> getConnectionsList() {
    return connections_;
  }
  /**
   * <code>repeated .io.netifi.proteus.admin.om.Connection connections = 1;</code>
   */
  public java.util.List<? extends io.netifi.proteus.admin.om.ConnectionOrBuilder> 
      getConnectionsOrBuilderList() {
    return connections_;
  }
  /**
   * <code>repeated .io.netifi.proteus.admin.om.Connection connections = 1;</code>
   */
  public int getConnectionsCount() {
    return connections_.size();
  }
  /**
   * <code>repeated .io.netifi.proteus.admin.om.Connection connections = 1;</code>
   */
  public io.netifi.proteus.admin.om.Connection getConnections(int index) {
    return connections_.get(index);
  }
  /**
   * <code>repeated .io.netifi.proteus.admin.om.Connection connections = 1;</code>
   */
  public io.netifi.proteus.admin.om.ConnectionOrBuilder getConnectionsOrBuilder(
      int index) {
    return connections_.get(index);
  }

  public static final int METADATA_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList metadata_;
  /**
   * <code>repeated string metadata = 2;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getMetadataList() {
    return metadata_;
  }
  /**
   * <code>repeated string metadata = 2;</code>
   */
  public int getMetadataCount() {
    return metadata_.size();
  }
  /**
   * <code>repeated string metadata = 2;</code>
   */
  public java.lang.String getMetadata(int index) {
    return metadata_.get(index);
  }
  /**
   * <code>repeated string metadata = 2;</code>
   */
  public com.google.protobuf.ByteString
      getMetadataBytes(int index) {
    return metadata_.getByteString(index);
  }

  public static final int CLASS_FIELD_NUMBER = 3;
  private volatile java.lang.Object class__;
  /**
   * <code>optional string class = 3;</code>
   */
  public java.lang.String getClass_() {
    java.lang.Object ref = class__;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      class__ = s;
      return s;
    }
  }
  /**
   * <code>optional string class = 3;</code>
   */
  public com.google.protobuf.ByteString
      getClass_Bytes() {
    java.lang.Object ref = class__;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      class__ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < connections_.size(); i++) {
      output.writeMessage(1, connections_.get(i));
    }
    for (int i = 0; i < metadata_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, metadata_.getRaw(i));
    }
    if (!getClass_Bytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, class__);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < connections_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, connections_.get(i));
    }
    {
      int dataSize = 0;
      for (int i = 0; i < metadata_.size(); i++) {
        dataSize += computeStringSizeNoTag(metadata_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getMetadataList().size();
    }
    if (!getClass_Bytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, class__);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.netifi.proteus.admin.om.Connections)) {
      return super.equals(obj);
    }
    io.netifi.proteus.admin.om.Connections other = (io.netifi.proteus.admin.om.Connections) obj;

    boolean result = true;
    result = result && getConnectionsList()
        .equals(other.getConnectionsList());
    result = result && getMetadataList()
        .equals(other.getMetadataList());
    result = result && getClass_()
        .equals(other.getClass_());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (getConnectionsCount() > 0) {
      hash = (37 * hash) + CONNECTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getConnectionsList().hashCode();
    }
    if (getMetadataCount() > 0) {
      hash = (37 * hash) + METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getMetadataList().hashCode();
    }
    hash = (37 * hash) + CLASS_FIELD_NUMBER;
    hash = (53 * hash) + getClass_().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.netifi.proteus.admin.om.Connections parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.netifi.proteus.admin.om.Connections parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.netifi.proteus.admin.om.Connections parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.netifi.proteus.admin.om.Connections parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.netifi.proteus.admin.om.Connections parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.netifi.proteus.admin.om.Connections parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.netifi.proteus.admin.om.Connections parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.netifi.proteus.admin.om.Connections parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.netifi.proteus.admin.om.Connections parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.netifi.proteus.admin.om.Connections parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.netifi.proteus.admin.om.Connections prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code io.netifi.proteus.admin.om.Connections}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.netifi.proteus.admin.om.Connections)
      io.netifi.proteus.admin.om.ConnectionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.netifi.proteus.admin.om.ProteusAdmin.internal_static_io_netifi_proteus_admin_om_Connections_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.netifi.proteus.admin.om.ProteusAdmin.internal_static_io_netifi_proteus_admin_om_Connections_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.netifi.proteus.admin.om.Connections.class, io.netifi.proteus.admin.om.Connections.Builder.class);
    }

    // Construct using io.netifi.proteus.admin.om.Connections.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getConnectionsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (connectionsBuilder_ == null) {
        connections_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        connectionsBuilder_.clear();
      }
      metadata_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      class__ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.netifi.proteus.admin.om.ProteusAdmin.internal_static_io_netifi_proteus_admin_om_Connections_descriptor;
    }

    public io.netifi.proteus.admin.om.Connections getDefaultInstanceForType() {
      return io.netifi.proteus.admin.om.Connections.getDefaultInstance();
    }

    public io.netifi.proteus.admin.om.Connections build() {
      io.netifi.proteus.admin.om.Connections result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.netifi.proteus.admin.om.Connections buildPartial() {
      io.netifi.proteus.admin.om.Connections result = new io.netifi.proteus.admin.om.Connections(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (connectionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          connections_ = java.util.Collections.unmodifiableList(connections_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.connections_ = connections_;
      } else {
        result.connections_ = connectionsBuilder_.build();
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        metadata_ = metadata_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.metadata_ = metadata_;
      result.class__ = class__;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.netifi.proteus.admin.om.Connections) {
        return mergeFrom((io.netifi.proteus.admin.om.Connections)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.netifi.proteus.admin.om.Connections other) {
      if (other == io.netifi.proteus.admin.om.Connections.getDefaultInstance()) return this;
      if (connectionsBuilder_ == null) {
        if (!other.connections_.isEmpty()) {
          if (connections_.isEmpty()) {
            connections_ = other.connections_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureConnectionsIsMutable();
            connections_.addAll(other.connections_);
          }
          onChanged();
        }
      } else {
        if (!other.connections_.isEmpty()) {
          if (connectionsBuilder_.isEmpty()) {
            connectionsBuilder_.dispose();
            connectionsBuilder_ = null;
            connections_ = other.connections_;
            bitField0_ = (bitField0_ & ~0x00000001);
            connectionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getConnectionsFieldBuilder() : null;
          } else {
            connectionsBuilder_.addAllMessages(other.connections_);
          }
        }
      }
      if (!other.metadata_.isEmpty()) {
        if (metadata_.isEmpty()) {
          metadata_ = other.metadata_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureMetadataIsMutable();
          metadata_.addAll(other.metadata_);
        }
        onChanged();
      }
      if (!other.getClass_().isEmpty()) {
        class__ = other.class__;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.netifi.proteus.admin.om.Connections parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.netifi.proteus.admin.om.Connections) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.netifi.proteus.admin.om.Connection> connections_ =
      java.util.Collections.emptyList();
    private void ensureConnectionsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        connections_ = new java.util.ArrayList<io.netifi.proteus.admin.om.Connection>(connections_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.netifi.proteus.admin.om.Connection, io.netifi.proteus.admin.om.Connection.Builder, io.netifi.proteus.admin.om.ConnectionOrBuilder> connectionsBuilder_;

    /**
     * <code>repeated .io.netifi.proteus.admin.om.Connection connections = 1;</code>
     */
    public java.util.List<io.netifi.proteus.admin.om.Connection> getConnectionsList() {
      if (connectionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(connections_);
      } else {
        return connectionsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .io.netifi.proteus.admin.om.Connection connections = 1;</code>
     */
    public int getConnectionsCount() {
      if (connectionsBuilder_ == null) {
        return connections_.size();
      } else {
        return connectionsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .io.netifi.proteus.admin.om.Connection connections = 1;</code>
     */
    public io.netifi.proteus.admin.om.Connection getConnections(int index) {
      if (connectionsBuilder_ == null) {
        return connections_.get(index);
      } else {
        return connectionsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .io.netifi.proteus.admin.om.Connection connections = 1;</code>
     */
    public Builder setConnections(
        int index, io.netifi.proteus.admin.om.Connection value) {
      if (connectionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConnectionsIsMutable();
        connections_.set(index, value);
        onChanged();
      } else {
        connectionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .io.netifi.proteus.admin.om.Connection connections = 1;</code>
     */
    public Builder setConnections(
        int index, io.netifi.proteus.admin.om.Connection.Builder builderForValue) {
      if (connectionsBuilder_ == null) {
        ensureConnectionsIsMutable();
        connections_.set(index, builderForValue.build());
        onChanged();
      } else {
        connectionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .io.netifi.proteus.admin.om.Connection connections = 1;</code>
     */
    public Builder addConnections(io.netifi.proteus.admin.om.Connection value) {
      if (connectionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConnectionsIsMutable();
        connections_.add(value);
        onChanged();
      } else {
        connectionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .io.netifi.proteus.admin.om.Connection connections = 1;</code>
     */
    public Builder addConnections(
        int index, io.netifi.proteus.admin.om.Connection value) {
      if (connectionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConnectionsIsMutable();
        connections_.add(index, value);
        onChanged();
      } else {
        connectionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .io.netifi.proteus.admin.om.Connection connections = 1;</code>
     */
    public Builder addConnections(
        io.netifi.proteus.admin.om.Connection.Builder builderForValue) {
      if (connectionsBuilder_ == null) {
        ensureConnectionsIsMutable();
        connections_.add(builderForValue.build());
        onChanged();
      } else {
        connectionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .io.netifi.proteus.admin.om.Connection connections = 1;</code>
     */
    public Builder addConnections(
        int index, io.netifi.proteus.admin.om.Connection.Builder builderForValue) {
      if (connectionsBuilder_ == null) {
        ensureConnectionsIsMutable();
        connections_.add(index, builderForValue.build());
        onChanged();
      } else {
        connectionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .io.netifi.proteus.admin.om.Connection connections = 1;</code>
     */
    public Builder addAllConnections(
        java.lang.Iterable<? extends io.netifi.proteus.admin.om.Connection> values) {
      if (connectionsBuilder_ == null) {
        ensureConnectionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, connections_);
        onChanged();
      } else {
        connectionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .io.netifi.proteus.admin.om.Connection connections = 1;</code>
     */
    public Builder clearConnections() {
      if (connectionsBuilder_ == null) {
        connections_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        connectionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .io.netifi.proteus.admin.om.Connection connections = 1;</code>
     */
    public Builder removeConnections(int index) {
      if (connectionsBuilder_ == null) {
        ensureConnectionsIsMutable();
        connections_.remove(index);
        onChanged();
      } else {
        connectionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .io.netifi.proteus.admin.om.Connection connections = 1;</code>
     */
    public io.netifi.proteus.admin.om.Connection.Builder getConnectionsBuilder(
        int index) {
      return getConnectionsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .io.netifi.proteus.admin.om.Connection connections = 1;</code>
     */
    public io.netifi.proteus.admin.om.ConnectionOrBuilder getConnectionsOrBuilder(
        int index) {
      if (connectionsBuilder_ == null) {
        return connections_.get(index);  } else {
        return connectionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .io.netifi.proteus.admin.om.Connection connections = 1;</code>
     */
    public java.util.List<? extends io.netifi.proteus.admin.om.ConnectionOrBuilder> 
         getConnectionsOrBuilderList() {
      if (connectionsBuilder_ != null) {
        return connectionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(connections_);
      }
    }
    /**
     * <code>repeated .io.netifi.proteus.admin.om.Connection connections = 1;</code>
     */
    public io.netifi.proteus.admin.om.Connection.Builder addConnectionsBuilder() {
      return getConnectionsFieldBuilder().addBuilder(
          io.netifi.proteus.admin.om.Connection.getDefaultInstance());
    }
    /**
     * <code>repeated .io.netifi.proteus.admin.om.Connection connections = 1;</code>
     */
    public io.netifi.proteus.admin.om.Connection.Builder addConnectionsBuilder(
        int index) {
      return getConnectionsFieldBuilder().addBuilder(
          index, io.netifi.proteus.admin.om.Connection.getDefaultInstance());
    }
    /**
     * <code>repeated .io.netifi.proteus.admin.om.Connection connections = 1;</code>
     */
    public java.util.List<io.netifi.proteus.admin.om.Connection.Builder> 
         getConnectionsBuilderList() {
      return getConnectionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.netifi.proteus.admin.om.Connection, io.netifi.proteus.admin.om.Connection.Builder, io.netifi.proteus.admin.om.ConnectionOrBuilder> 
        getConnectionsFieldBuilder() {
      if (connectionsBuilder_ == null) {
        connectionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.netifi.proteus.admin.om.Connection, io.netifi.proteus.admin.om.Connection.Builder, io.netifi.proteus.admin.om.ConnectionOrBuilder>(
                connections_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        connections_ = null;
      }
      return connectionsBuilder_;
    }

    private com.google.protobuf.LazyStringList metadata_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureMetadataIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        metadata_ = new com.google.protobuf.LazyStringArrayList(metadata_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated string metadata = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getMetadataList() {
      return metadata_.getUnmodifiableView();
    }
    /**
     * <code>repeated string metadata = 2;</code>
     */
    public int getMetadataCount() {
      return metadata_.size();
    }
    /**
     * <code>repeated string metadata = 2;</code>
     */
    public java.lang.String getMetadata(int index) {
      return metadata_.get(index);
    }
    /**
     * <code>repeated string metadata = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMetadataBytes(int index) {
      return metadata_.getByteString(index);
    }
    /**
     * <code>repeated string metadata = 2;</code>
     */
    public Builder setMetadata(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureMetadataIsMutable();
      metadata_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string metadata = 2;</code>
     */
    public Builder addMetadata(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureMetadataIsMutable();
      metadata_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string metadata = 2;</code>
     */
    public Builder addAllMetadata(
        java.lang.Iterable<java.lang.String> values) {
      ensureMetadataIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, metadata_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string metadata = 2;</code>
     */
    public Builder clearMetadata() {
      metadata_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string metadata = 2;</code>
     */
    public Builder addMetadataBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureMetadataIsMutable();
      metadata_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object class__ = "";
    /**
     * <code>optional string class = 3;</code>
     */
    public java.lang.String getClass_() {
      java.lang.Object ref = class__;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        class__ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string class = 3;</code>
     */
    public com.google.protobuf.ByteString
        getClass_Bytes() {
      java.lang.Object ref = class__;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        class__ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string class = 3;</code>
     */
    public Builder setClass_(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      class__ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string class = 3;</code>
     */
    public Builder clearClass_() {
      
      class__ = getDefaultInstance().getClass_();
      onChanged();
      return this;
    }
    /**
     * <code>optional string class = 3;</code>
     */
    public Builder setClass_Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      class__ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:io.netifi.proteus.admin.om.Connections)
  }

  // @@protoc_insertion_point(class_scope:io.netifi.proteus.admin.om.Connections)
  private static final io.netifi.proteus.admin.om.Connections DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.netifi.proteus.admin.om.Connections();
  }

  public static io.netifi.proteus.admin.om.Connections getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Connections>
      PARSER = new com.google.protobuf.AbstractParser<Connections>() {
    public Connections parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Connections(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Connections> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Connections> getParserForType() {
    return PARSER;
  }

  public io.netifi.proteus.admin.om.Connections getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

