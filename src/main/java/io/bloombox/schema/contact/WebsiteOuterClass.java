// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: contact/Website.proto

package io.bloombox.schema.contact;

public final class WebsiteOuterClass {
  private WebsiteOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_contact_Website_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_contact_Website_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025contact/Website.proto\022\007contact\032\016bq_fie" +
      "ld.proto\"v\n\007Website\022$\n\003uri\030\001 \001(\tB\027\212@\024URI" +
      " for the website.\0222\n\005title\030\002 \001(\tB#\212@ Tit" +
      "le from the HTML page at URI.\022\021\n\004icon\030\003 " +
      "\001(\014B\003\200@\001B \n\032io.bloombox.schema.contactH\001" +
      "P\001b\006proto3"
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
          gen_bq_schema.BqField.getDescriptor(),
        }, assigner);
    internal_static_contact_Website_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_contact_Website_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_contact_Website_descriptor,
        new java.lang.String[] { "Uri", "Title", "Icon", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(gen_bq_schema.BqField.description);
    registry.add(gen_bq_schema.BqField.ignore);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    gen_bq_schema.BqField.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
