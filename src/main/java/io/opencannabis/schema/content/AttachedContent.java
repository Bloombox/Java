// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: content/ProductContent.proto

package io.opencannabis.schema.content;

public final class AttachedContent {
  private AttachedContent() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_content_ProductTimestamps_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_content_ProductTimestamps_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_content_ProductContent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_content_ProductContent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034content/ProductContent.proto\022\024opencann" +
      "abis.content\032\022content/Name.proto\032\025conten" +
      "t/Content.proto\032\023content/Brand.proto\032\026te" +
      "mporal/Instant.proto\032\025media/MediaItem.pr" +
      "oto\032\032structs/ProductFlags.proto\032$structs" +
      "/labtesting/TestResults.proto\032\'structs/p" +
      "ricing/PricingDescriptor.proto\"\251\001\n\021Produ" +
      "ctTimestamps\022/\n\007created\030\001 \001(\0132\036.opencann" +
      "abis.temporal.Instant\0220\n\010modified\030\002 \001(\0132" +
      "\036.opencannabis.temporal.Instant\0221\n\tpubli" +
      "shed\030\003 \001(\0132\036.opencannabis.temporal.Insta" +
      "nt\"\206\004\n\016ProductContent\022(\n\004name\030\001 \001(\0132\032.op" +
      "encannabis.content.Name\022*\n\005brand\030\002 \001(\0132\033" +
      ".opencannabis.content.Brand\022.\n\007summary\030\003" +
      " \001(\0132\035.opencannabis.content.Content\022,\n\005u" +
      "sage\030\004 \001(\0132\035.opencannabis.content.Conten" +
      "t\022-\n\006dosage\030\005 \001(\0132\035.opencannabis.content" +
      ".Content\022,\n\005media\030\006 \003(\0132\035.opencannabis.m" +
      "edia.MediaItem\022=\n\007pricing\030\007 \001(\0132,.openca" +
      "nnabis.structs.pricing.ProductPricing\022=\n" +
      "\007testing\030\010 \001(\0132,.opencannabis.structs.la" +
      "btesting.TestResults\0220\n\005flags\030\t \003(\0162!.op" +
      "encannabis.structs.ProductFlag\0223\n\002ts\030\n \001" +
      "(\0132\'.opencannabis.content.ProductTimesta" +
      "mpsB;\n\036io.opencannabis.schema.contentB\017A" +
      "ttachedContentH\001P\001\242\002\003OCSb\006proto3"
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
          io.opencannabis.schema.content.GenericContent.getDescriptor(),
          io.opencannabis.schema.content.BrandContent.getDescriptor(),
          io.opencannabis.schema.temporal.InstantOuterClass.getDescriptor(),
          io.opencannabis.schema.media.AttachedMedia.getDescriptor(),
          io.opencannabis.schema.product.struct.BaseStructs.getDescriptor(),
          io.opencannabis.schema.product.struct.testing.LabTesting.getDescriptor(),
          io.opencannabis.schema.product.struct.ProductPricingSpec.getDescriptor(),
        }, assigner);
    internal_static_opencannabis_content_ProductTimestamps_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opencannabis_content_ProductTimestamps_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_content_ProductTimestamps_descriptor,
        new java.lang.String[] { "Created", "Modified", "Published", });
    internal_static_opencannabis_content_ProductContent_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opencannabis_content_ProductContent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_content_ProductContent_descriptor,
        new java.lang.String[] { "Name", "Brand", "Summary", "Usage", "Dosage", "Media", "Pricing", "Testing", "Flags", "Ts", });
    io.opencannabis.schema.content.NameContent.getDescriptor();
    io.opencannabis.schema.content.GenericContent.getDescriptor();
    io.opencannabis.schema.content.BrandContent.getDescriptor();
    io.opencannabis.schema.temporal.InstantOuterClass.getDescriptor();
    io.opencannabis.schema.media.AttachedMedia.getDescriptor();
    io.opencannabis.schema.product.struct.BaseStructs.getDescriptor();
    io.opencannabis.schema.product.struct.testing.LabTesting.getDescriptor();
    io.opencannabis.schema.product.struct.ProductPricingSpec.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
