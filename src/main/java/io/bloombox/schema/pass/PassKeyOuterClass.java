// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: identity/pass/PassKey.proto

package io.bloombox.schema.pass;

public final class PassKeyOuterClass {
  private PassKeyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_identity_pass_PassKey_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_identity_pass_PassKey_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033identity/pass/PassKey.proto\022\ridentity." +
      "pass\"7\n\007PassKey\022\017\n\007encoded\030\001 \001(\t\022\016\n\006seri" +
      "al\030\002 \001(\t\022\013\n\003uid\030\003 \001(\tB\035\n\027io.bloombox.sch" +
      "ema.passH\001P\001b\006proto3"
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
    internal_static_identity_pass_PassKey_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_identity_pass_PassKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_identity_pass_PassKey_descriptor,
        new java.lang.String[] { "Encoded", "Serial", "Uid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
