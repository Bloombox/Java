// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: content/MaterialsData.proto

package io.opencannabis.schema.content;

public final class MaterialsContent {
  private MaterialsContent() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_content_MaterialsData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_content_MaterialsData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033content/MaterialsData.proto\022\024opencanna" +
      "bis.content\032\022structs/Grow.proto\032\023structs" +
      "/Shelf.proto\032\025structs/Species.proto\032\026str" +
      "ucts/Genetics.proto\032/products/distributi" +
      "on/DistributionChannel.proto\"\220\002\n\rMateria" +
      "lsData\022.\n\007species\030\001 \001(\0162\035.opencannabis.s" +
      "tructs.Species\0220\n\010genetics\030\002 \001(\0132\036.openc" +
      "annabis.structs.Genetics\022(\n\004grow\030\003 \001(\0162\032" +
      ".opencannabis.structs.Grow\022*\n\005shelf\030\004 \001(" +
      "\0162\033.opencannabis.structs.Shelf\022G\n\007channe" +
      "l\030\005 \003(\01326.opencannabis.products.distribu" +
      "tion.DistributionPolicyB<\n\036io.opencannab" +
      "is.schema.contentB\020MaterialsContentH\001P\001\242" +
      "\002\003OCSb\006proto3"
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
          io.opencannabis.schema.product.struct.MaterialGrow.getDescriptor(),
          io.opencannabis.schema.product.struct.MaterialShelf.getDescriptor(),
          io.opencannabis.schema.product.struct.MaterialSpecies.getDescriptor(),
          io.opencannabis.schema.product.struct.GeneticsStructs.getDescriptor(),
          io.opencannabis.schema.product.DistributionChannel.getDescriptor(),
        }, assigner);
    internal_static_opencannabis_content_MaterialsData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opencannabis_content_MaterialsData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_content_MaterialsData_descriptor,
        new java.lang.String[] { "Species", "Genetics", "Grow", "Shelf", "Channel", });
    io.opencannabis.schema.product.struct.MaterialGrow.getDescriptor();
    io.opencannabis.schema.product.struct.MaterialShelf.getDescriptor();
    io.opencannabis.schema.product.struct.MaterialSpecies.getDescriptor();
    io.opencannabis.schema.product.struct.GeneticsStructs.getDescriptor();
    io.opencannabis.schema.product.DistributionChannel.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
