// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: security/AuthToken.proto

package io.bloombox.schema.security;

public final class AuthTokenOuterClass {
  private AuthTokenOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_security_AuthToken_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_security_AuthToken_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030security/AuthToken.proto\022\030bloombox.sch" +
      "ema.security\"\034\n\tAuthToken\022\017\n\007encoded\030\001 \001" +
      "(\tB\'\n\033io.bloombox.schema.securityH\001P\001\242\002\003" +
      "BBSb\006proto3"
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
    internal_static_bloombox_schema_security_AuthToken_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bloombox_schema_security_AuthToken_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_security_AuthToken_descriptor,
        new java.lang.String[] { "Encoded", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
