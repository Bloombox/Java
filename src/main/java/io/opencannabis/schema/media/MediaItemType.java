// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: media/MediaType.proto

package io.opencannabis.schema.media;

public final class MediaItemType {
  private MediaItemType() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_media_MediaType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_media_MediaType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_media_ImageType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_media_ImageType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_media_DocumentType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_media_DocumentType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_media_VideoType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_media_VideoType_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025media/MediaType.proto\022\022opencannabis.me" +
      "dia\032\016bq_field.proto\"\212\004\n\tMediaType\022u\n\004kin" +
      "d\030\001 \001(\0162\".opencannabis.media.MediaType.K" +
      "indBC\212@@Specifies the generic kind of me" +
      "dia being described or attached.\022h\n\nimag" +
      "e_type\030e \001(\0132\035.opencannabis.media.ImageT" +
      "ypeB3\212@0Specifies content for an image-b" +
      "ased media item.H\000\022q\n\rdocument_type\030\311\001 \001" +
      "(\0132 .opencannabis.media.DocumentTypeB5\212@" +
      "2Specifies content for a document-based " +
      "media item.H\000\022h\n\nvideo_type\030\255\002 \001(\0132\035.ope" +
      "ncannabis.media.VideoTypeB2\212@/Specifies " +
      "content for a video-based media item.H\000\"" +
      "4\n\004Kind\022\010\n\004LINK\020\000\022\t\n\005IMAGE\020\001\022\014\n\010DOCUMENT" +
      "\020\002\022\t\n\005VIDEO\020\003B\t\n\007content\"\272\001\n\tImageType\022r" +
      "\n\004kind\030\001 \001(\0162\'.opencannabis.media.ImageT" +
      "ype.ImageKindB;\212@8Specifies the format o" +
      "f the attached or described image.\"9\n\tIm" +
      "ageKind\022\007\n\003PNG\020\000\022\007\n\003JPG\020\001\022\007\n\003GIF\020\002\022\007\n\003SV" +
      "G\020\003\022\010\n\004WEBP\020\004\"\233\002\n\014DocumentType\022{\n\004kind\030\001" +
      " \001(\0162-.opencannabis.media.DocumentType.D" +
      "ocumentKindB>\212@;Specifies the kind of do" +
      "cument being attached or described.\022T\n\nc" +
      "ompressed\030\002 \001(\010B@\212@=Specifies whether th" +
      "e attached document is compressed or not" +
      ".\"8\n\014DocumentKind\022\007\n\003TXT\020\000\022\010\n\004HTML\020\001\022\007\n\003" +
      "PDF\020\002\022\014\n\010MARKDOWN\020\003\"\247\001\n\tVideoType\022r\n\004kin" +
      "d\030\001 \001(\0162\'.opencannabis.media.VideoType.V" +
      "ideoKindB;\212@8Specifies the kind of video" +
      " being attached or described.\"&\n\tVideoKi" +
      "nd\022\007\n\003MP4\020\000\022\007\n\003FLV\020\001\022\007\n\003HLS\020\002B7\n\034io.open" +
      "cannabis.schema.mediaB\rMediaItemTypeH\001P\001" +
      "\242\002\003OCSb\006proto3"
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
    internal_static_opencannabis_media_MediaType_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opencannabis_media_MediaType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_media_MediaType_descriptor,
        new java.lang.String[] { "Kind", "ImageType", "DocumentType", "VideoType", "Content", });
    internal_static_opencannabis_media_ImageType_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opencannabis_media_ImageType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_media_ImageType_descriptor,
        new java.lang.String[] { "Kind", });
    internal_static_opencannabis_media_DocumentType_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_opencannabis_media_DocumentType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_media_DocumentType_descriptor,
        new java.lang.String[] { "Kind", "Compressed", });
    internal_static_opencannabis_media_VideoType_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_opencannabis_media_VideoType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_media_VideoType_descriptor,
        new java.lang.String[] { "Kind", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(gen_bq_schema.BqField.description);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    gen_bq_schema.BqField.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
