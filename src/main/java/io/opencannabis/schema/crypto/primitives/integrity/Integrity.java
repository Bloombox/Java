// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: crypto/primitives/Integrity.proto

package io.opencannabis.schema.crypto.primitives.integrity;

public final class Integrity {
  private Integrity() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_crypto_primitives_integrity_Hash_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_crypto_primitives_integrity_Hash_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_crypto_primitives_integrity_HashedData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_crypto_primitives_integrity_HashedData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!crypto/primitives/Integrity.proto\022(ope" +
      "ncannabis.crypto.primitives.integrity\"\211\001" +
      "\n\004Hash\022J\n\talgorithm\030\001 \001(\01627.opencannabis" +
      ".crypto.primitives.integrity.HashAlgorit" +
      "hm\022\r\n\003raw\030\002 \001(\014H\000\022\r\n\003hex\030\003 \001(\tH\000\022\r\n\003b64\030" +
      "\004 \001(\tH\000B\010\n\006digest\"X\n\nHashedData\022\014\n\004data\030" +
      "\001 \001(\014\022<\n\004hash\030\002 \001(\0132..opencannabis.crypt" +
      "o.primitives.integrity.Hash*R\n\rHashAlgor" +
      "ithm\022\010\n\004SHA1\020\000\022\007\n\003MD5\020\001\022\n\n\006SHA256\020\002\022\n\n\006S" +
      "HA384\020\003\022\n\n\006SHA512\020\004\022\n\n\006MURMUR\020\006B>\n2io.op" +
      "encannabis.schema.crypto.primitives.inte" +
      "grityH\001P\001\242\002\003OCSb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_opencannabis_crypto_primitives_integrity_Hash_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opencannabis_crypto_primitives_integrity_Hash_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_crypto_primitives_integrity_Hash_descriptor,
        new java.lang.String[] { "Algorithm", "Raw", "Hex", "B64", "Digest", });
    internal_static_opencannabis_crypto_primitives_integrity_HashedData_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opencannabis_crypto_primitives_integrity_HashedData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_crypto_primitives_integrity_HashedData_descriptor,
        new java.lang.String[] { "Data", "Hash", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
