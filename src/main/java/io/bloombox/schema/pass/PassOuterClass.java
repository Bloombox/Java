// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: identity/pass/Pass.proto

package io.bloombox.schema.pass;

public final class PassOuterClass {
  private PassOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_identity_pass_Pass_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_identity_pass_Pass_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030identity/pass/Pass.proto\022\035bloombox.sch" +
      "ema.identity.pass\032\033identity/pass/PassKey" +
      ".proto\032\026temporal/Instant.proto\"\312\001\n\004Pass\022" +
      "3\n\003key\030\001 \001(\0132&.bloombox.schema.identity." +
      "pass.PassKey\022\r\n\005token\030\002 \001(\t\022\013\n\003uri\030\003 \001(\t" +
      "\022\016\n\006active\030\004 \001(\010\022.\n\006issued\030\005 \001(\0132\036.openc" +
      "annabis.temporal.Instant\0221\n\tsuspended\030\006 " +
      "\001(\0132\036.opencannabis.temporal.InstantB#\n\027i" +
      "o.bloombox.schema.passH\001P\001\242\002\003BBSb\006proto3"
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
          io.bloombox.schema.pass.PassKeyOuterClass.getDescriptor(),
          io.opencannabis.schema.temporal.InstantOuterClass.getDescriptor(),
        }, assigner);
    internal_static_bloombox_schema_identity_pass_Pass_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bloombox_schema_identity_pass_Pass_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_identity_pass_Pass_descriptor,
        new java.lang.String[] { "Key", "Token", "Uri", "Active", "Issued", "Suspended", });
    io.bloombox.schema.pass.PassKeyOuterClass.getDescriptor();
    io.opencannabis.schema.temporal.InstantOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
