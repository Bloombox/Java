// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: media/MediaItem.proto

package io.opencannabis.schema.media;

public final class AttachedMedia {
  private AttachedMedia() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_media_MediaItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_media_MediaItem_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025media/MediaItem.proto\022\022opencannabis.me" +
      "dia\032\024core/Datamodel.proto\032\024media/MediaKe" +
      "y.proto\032\025media/MediaType.proto\"\217\003\n\tMedia" +
      "Item\022`\n\003key\030\001 \001(\0132\034.opencannabis.media.M" +
      "ediaKeyB5\302\265\003\002\010\001\302\265\003+\022)Key uniquely identi" +
      "fying this media item.\022T\n\004type\030\002 \001(\0132\035.o" +
      "pencannabis.media.MediaTypeB\'\302\265\003#\022!Type " +
      "of media this is describing.\0221\n\004name\030\003 \001" +
      "(\tB#\302\265\003\037\022\035Friendly name for this media.\022" +
      ".\n\003uri\030\004 \001(\tB!\302\265\003\035\022\033Absolute URI to this" +
      " media.\022X\n\013serving_uri\030\005 \001(\tBC\302\265\003?\022=ervi" +
      "ng URI for this media, if it differs fro" +
      "m the origin URI.:\r\202\367\002\t\010\002\022\005mediaB7\n\034io.o" +
      "pencannabis.schema.mediaB\rAttachedMediaH" +
      "\001P\001\242\002\003OCSb\006proto3"
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
          core.Datamodel.getDescriptor(),
          io.opencannabis.schema.media.MediaItemKey.getDescriptor(),
          io.opencannabis.schema.media.MediaItemType.getDescriptor(),
        }, assigner);
    internal_static_opencannabis_media_MediaItem_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opencannabis_media_MediaItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_media_MediaItem_descriptor,
        new java.lang.String[] { "Key", "Type", "Name", "Uri", "ServingUri", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(core.Datamodel.db);
    registry.add(core.Datamodel.field);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    core.Datamodel.getDescriptor();
    io.opencannabis.schema.media.MediaItemKey.getDescriptor();
    io.opencannabis.schema.media.MediaItemType.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
