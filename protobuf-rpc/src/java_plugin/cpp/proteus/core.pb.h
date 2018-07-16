// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proteus/core.proto

#ifndef PROTOBUF_INCLUDED_proteus_2fcore_2eproto
#define PROTOBUF_INCLUDED_proteus_2fcore_2eproto

#include <string>

#include <google/protobuf/stubs/common.h>

#if GOOGLE_PROTOBUF_VERSION < 3006000
#error This file was generated by a newer version of protoc which is
#error incompatible with your Protocol Buffer headers.  Please update
#error your headers.
#endif
#if 3006000 < GOOGLE_PROTOBUF_MIN_PROTOC_VERSION
#error This file was generated by an older version of protoc which is
#error incompatible with your Protocol Buffer headers.  Please
#error regenerate this file with a newer version of protoc.
#endif

#include <google/protobuf/io/coded_stream.h>
#include <google/protobuf/arena.h>
#include <google/protobuf/arenastring.h>
#include <google/protobuf/generated_message_table_driven.h>
#include <google/protobuf/generated_message_util.h>
#include <google/protobuf/inlined_string_field.h>
#include <google/protobuf/metadata.h>
#include <google/protobuf/message.h>
#include <google/protobuf/repeated_field.h>  // IWYU pragma: export
#include <google/protobuf/extension_set.h>  // IWYU pragma: export
#include <google/protobuf/unknown_field_set.h>
#include <google/protobuf/descriptor.pb.h>
// @@protoc_insertion_point(includes)
#define PROTOBUF_INTERNAL_EXPORT_protobuf_proteus_2fcore_2eproto 

namespace protobuf_proteus_2fcore_2eproto {
// Internal implementation detail -- do not use these members.
struct TableStruct {
  static const ::google::protobuf::internal::ParseTableField entries[];
  static const ::google::protobuf::internal::AuxillaryParseTableField aux[];
  static const ::google::protobuf::internal::ParseTable schema[1];
  static const ::google::protobuf::internal::FieldMetadata field_metadata[];
  static const ::google::protobuf::internal::SerializationTable serialization_table[];
  static const ::google::protobuf::uint32 offsets[];
};
void AddDescriptors();
}  // namespace protobuf_proteus_2fcore_2eproto
namespace io {
namespace netifi {
namespace proteus {
class ProteusOptions;
class ProteusOptionsDefaultTypeInternal;
extern ProteusOptionsDefaultTypeInternal _ProteusOptions_default_instance_;
}  // namespace proteus
}  // namespace netifi
}  // namespace io
namespace google {
namespace protobuf {
template<> ::io::netifi::proteus::ProteusOptions* Arena::CreateMaybeMessage<::io::netifi::proteus::ProteusOptions>(Arena*);
}  // namespace protobuf
}  // namespace google
namespace io {
namespace netifi {
namespace proteus {

// ===================================================================

class ProteusOptions : public ::google::protobuf::Message /* @@protoc_insertion_point(class_definition:io.netifi.proteus.ProteusOptions) */ {
 public:
  ProteusOptions();
  virtual ~ProteusOptions();

  ProteusOptions(const ProteusOptions& from);

  inline ProteusOptions& operator=(const ProteusOptions& from) {
    CopyFrom(from);
    return *this;
  }
  #if LANG_CXX11
  ProteusOptions(ProteusOptions&& from) noexcept
    : ProteusOptions() {
    *this = ::std::move(from);
  }

  inline ProteusOptions& operator=(ProteusOptions&& from) noexcept {
    if (GetArenaNoVirtual() == from.GetArenaNoVirtual()) {
      if (this != &from) InternalSwap(&from);
    } else {
      CopyFrom(from);
    }
    return *this;
  }
  #endif
  static const ::google::protobuf::Descriptor* descriptor();
  static const ProteusOptions& default_instance();

  static void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  static inline const ProteusOptions* internal_default_instance() {
    return reinterpret_cast<const ProteusOptions*>(
               &_ProteusOptions_default_instance_);
  }
  static constexpr int kIndexInFileMessages =
    0;

  void Swap(ProteusOptions* other);
  friend void swap(ProteusOptions& a, ProteusOptions& b) {
    a.Swap(&b);
  }

  // implements Message ----------------------------------------------

  inline ProteusOptions* New() const final {
    return CreateMaybeMessage<ProteusOptions>(NULL);
  }

  ProteusOptions* New(::google::protobuf::Arena* arena) const final {
    return CreateMaybeMessage<ProteusOptions>(arena);
  }
  void CopyFrom(const ::google::protobuf::Message& from) final;
  void MergeFrom(const ::google::protobuf::Message& from) final;
  void CopyFrom(const ProteusOptions& from);
  void MergeFrom(const ProteusOptions& from);
  void Clear() final;
  bool IsInitialized() const final;

  size_t ByteSizeLong() const final;
  bool MergePartialFromCodedStream(
      ::google::protobuf::io::CodedInputStream* input) final;
  void SerializeWithCachedSizes(
      ::google::protobuf::io::CodedOutputStream* output) const final;
  ::google::protobuf::uint8* InternalSerializeWithCachedSizesToArray(
      bool deterministic, ::google::protobuf::uint8* target) const final;
  int GetCachedSize() const final { return _cached_size_.Get(); }

  private:
  void SharedCtor();
  void SharedDtor();
  void SetCachedSize(int size) const final;
  void InternalSwap(ProteusOptions* other);
  private:
  inline ::google::protobuf::Arena* GetArenaNoVirtual() const {
    return NULL;
  }
  inline void* MaybeArenaPtr() const {
    return NULL;
  }
  public:

  ::google::protobuf::Metadata GetMetadata() const final;

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // bool fire_and_forget = 1;
  void clear_fire_and_forget();
  static const int kFireAndForgetFieldNumber = 1;
  bool fire_and_forget() const;
  void set_fire_and_forget(bool value);

  // @@protoc_insertion_point(class_scope:io.netifi.proteus.ProteusOptions)
 private:

  ::google::protobuf::internal::InternalMetadataWithArena _internal_metadata_;
  bool fire_and_forget_;
  mutable ::google::protobuf::internal::CachedSize _cached_size_;
  friend struct ::protobuf_proteus_2fcore_2eproto::TableStruct;
};
// ===================================================================

static const int kOptionsFieldNumber = 70001;
extern ::google::protobuf::internal::ExtensionIdentifier< ::google::protobuf::MethodOptions,
    ::google::protobuf::internal::MessageTypeTraits< ::io::netifi::proteus::ProteusOptions >, 11, false >
  options;

// ===================================================================

#ifdef __GNUC__
  #pragma GCC diagnostic push
  #pragma GCC diagnostic ignored "-Wstrict-aliasing"
#endif  // __GNUC__
// ProteusOptions

// bool fire_and_forget = 1;
inline void ProteusOptions::clear_fire_and_forget() {
  fire_and_forget_ = false;
}
inline bool ProteusOptions::fire_and_forget() const {
  // @@protoc_insertion_point(field_get:io.netifi.proteus.ProteusOptions.fire_and_forget)
  return fire_and_forget_;
}
inline void ProteusOptions::set_fire_and_forget(bool value) {
  
  fire_and_forget_ = value;
  // @@protoc_insertion_point(field_set:io.netifi.proteus.ProteusOptions.fire_and_forget)
}

#ifdef __GNUC__
  #pragma GCC diagnostic pop
#endif  // __GNUC__

// @@protoc_insertion_point(namespace_scope)

}  // namespace proteus
}  // namespace netifi
}  // namespace io

// @@protoc_insertion_point(global_scope)

#endif  // PROTOBUF_INCLUDED_proteus_2fcore_2eproto
