// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: structs/Genetics.proto

package io.opencannabis.schema.product.struct;

public final class GeneticsStructs {
  private GeneticsStructs() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_structs_Genetics_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_structs_Genetics_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026structs/Genetics.proto\022\024opencannabis.s" +
      "tructs\032\022content/Name.proto\032\025base/Product" +
      "Key.proto\"r\n\010Genetics\0221\n\004male\030\001 \001(\0132#.op" +
      "encannabis.base.ProductReference\0223\n\006fema" +
      "le\030\002 \001(\0132#.opencannabis.base.ProductRefe" +
      "renceBB\n%io.opencannabis.schema.product." +
      "structB\017GeneticsStructsH\001P\001\242\002\003OCSb\006proto" +
      "3"
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
          io.opencannabis.schema.content.NameContent.getDescriptor(),
          io.opencannabis.schema.base.BaseProductKey.getDescriptor(),
        }, assigner);
    internal_static_opencannabis_structs_Genetics_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opencannabis_structs_Genetics_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_structs_Genetics_descriptor,
        new java.lang.String[] { "Male", "Female", });
    io.opencannabis.schema.content.NameContent.getDescriptor();
    io.opencannabis.schema.base.BaseProductKey.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
