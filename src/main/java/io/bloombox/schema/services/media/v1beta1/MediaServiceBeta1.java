// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: media/v1beta1/MediaService_Beta1.proto

package io.bloombox.schema.services.media.v1beta1;

public final class MediaServiceBeta1 {
  private MediaServiceBeta1() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_media_v1beta1_MediaFile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_media_v1beta1_MediaFile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_media_v1beta1_MediaContent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_media_v1beta1_MediaContent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_media_v1beta1_UploadTransaction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_media_v1beta1_UploadTransaction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_media_v1beta1_OperationResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_media_v1beta1_OperationResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_media_v1beta1_ListMedia_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_media_v1beta1_ListMedia_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_media_v1beta1_ListMedia_Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_media_v1beta1_ListMedia_Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_media_v1beta1_ListMedia_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_media_v1beta1_ListMedia_Response_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_media_v1beta1_GetMedia_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_media_v1beta1_GetMedia_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_media_v1beta1_GetMedia_Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_media_v1beta1_GetMedia_Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_media_v1beta1_GetMedia_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_media_v1beta1_GetMedia_Response_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_media_v1beta1_UploadMedia_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_media_v1beta1_UploadMedia_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_media_v1beta1_UploadMedia_Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_media_v1beta1_UploadMedia_Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_media_v1beta1_UploadMedia_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_media_v1beta1_UploadMedia_Response_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_media_v1beta1_AttachMedia_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_media_v1beta1_AttachMedia_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_media_v1beta1_AttachMedia_Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_media_v1beta1_AttachMedia_Request_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&media/v1beta1/MediaService_Beta1.proto" +
      "\022&bloombox.schema.services.media.v1beta1" +
      "\032\024media/MediaKey.proto\032\025media/MediaType." +
      "proto\032\025media/MediaItem.proto\032\033google/pro" +
      "tobuf/empty.proto\032\034google/api/annotation" +
      "s.proto\032(protoc-gen-swagger/options/swag" +
      "ger.proto\"/\n\tMediaFile\022\020\n\010filename\030\001 \001(\t" +
      "\022\020\n\010mimetype\030\002 \001(\t\"\247\001\n\014MediaContent\022\017\n\007c" +
      "ontent\030\001 \001(\014\022+\n\004type\030\002 \001(\0132\035.opencannabi" +
      "s.media.MediaType\022A\n\004file\030\003 \001(\01321.bloomb" +
      "ox.schema.services.media.v1beta1.MediaFi" +
      "leH\000\022\016\n\004blob\030\004 \001(\010H\000B\006\n\004spec\"2\n\021UploadTr" +
      "ansaction\022\016\n\006target\030\001 \001(\t\022\r\n\005token\030\002 \001(\t" +
      "\"<\n\017OperationResult\022)\n\003key\030\001 \001(\0132\034.openc" +
      "annabis.media.MediaKey\"_\n\tListMedia\032\030\n\007R" +
      "equest\022\r\n\005scope\030\001 \001(\t\0328\n\010Response\022,\n\005med" +
      "ia\030\001 \003(\0132\035.opencannabis.media.MediaItem\"" +
      "\211\001\n\010GetMedia\032C\n\007Request\022\r\n\005scope\030\001 \001(\t\022)" +
      "\n\003key\030\002 \001(\0132\034.opencannabis.media.MediaKe" +
      "y\0328\n\010Response\022,\n\005media\030\001 \001(\0132\035.opencanna" +
      "bis.media.MediaItem\"\331\002\n\013UploadMedia\032\222\001\n\007" +
      "Request\022\r\n\005scope\030\001 \001(\t\0221\n\007subject\030\002 \001(\0132" +
      " .opencannabis.media.MediaSubject\022E\n\007con" +
      "tent\030\003 \001(\01324.bloombox.schema.services.me" +
      "dia.v1beta1.MediaContent\032\264\001\n\010Response\022P\n" +
      "\013transaction\030\001 \001(\01329.bloombox.schema.ser" +
      "vices.media.v1beta1.UploadTransactionH\000\022" +
      "I\n\006result\030\002 \001(\01327.bloombox.schema.servic" +
      "es.media.v1beta1.OperationResultH\000B\013\n\top" +
      "eration\"6\n\013AttachMedia\032\'\n\007Request\022\r\n\005sco" +
      "pe\030\001 \001(\t\022\r\n\005token\030\002 \001(\t*\224\001\n\nMediaError\022\014" +
      "\n\010NO_ERROR\020\000\022\023\n\017PARTNER_INVALID\020\001\022\024\n\020LOC" +
      "ATION_INVALID\020\002\022\021\n\rACCESS_DENIED\020\003\022\023\n\017ME" +
      "DIA_NOT_FOUND\020\004\022\021\n\rMEDIA_INVALID\020\005\022\022\n\016IN" +
      "TERNAL_ERROR\020c2\311\010\n\005Media\022\203\002\n\004List\0229.bloo" +
      "mbox.schema.services.media.v1beta1.ListM" +
      "edia.Request\032:.bloombox.schema.services." +
      "media.v1beta1.ListMedia.Response\"\203\001\202\323\344\223\002" +
      "2\022-/media/v1beta1/{scope=partners/*/loca" +
      "tions/*}:\001*\222AH\022\nList Media\0324List media i" +
      "tems for a given partner/location scope." +
      "*\004List\022\204\002\n\010Retrieve\0228.bloombox.schema.se" +
      "rvices.media.v1beta1.GetMedia.Request\0329." +
      "bloombox.schema.services.media.v1beta1.G" +
      "etMedia.Response\"\202\001\202\323\344\223\002;\0226/media/v1beta" +
      "1/{scope=partners/*/locations/*}/{key.id" +
      "}:\001*\222A>\022\016Retrieve Media\032\"Retrieve an ind" +
      "ividual media item.*\010Retrieve\022\255\002\n\006Upload" +
      "\022;.bloombox.schema.services.media.v1beta" +
      "1.UploadMedia.Request\032<.bloombox.schema." +
      "services.media.v1beta1.UploadMedia.Respo" +
      "nse\"\247\001\202\323\344\223\0029\"4/media/v1beta1/{scope=part" +
      "ners/*/locations/*}/upload:\001*\222Ae\022\014Create" +
      " Media\032MProvision a new media item recor" +
      "d, and update its data with an initial v" +
      "alue.*\006Upload\022\202\002\n\006Attach\022;.bloombox.sche" +
      "ma.services.media.v1beta1.AttachMedia.Re" +
      "quest\032\026.google.protobuf.Empty\"\242\001\202\323\344\223\002A\032<" +
      "/media/v1beta1/{scope=partners/*/locatio" +
      "ns/*}/upload/{token}:\001*\222AX\022\014Attach Media" +
      "\032@Notify the platform that uploaded medi" +
      "a is ready to be attached.*\006AttachB\211\004\n)i" +
      "o.bloombox.schema.services.media.v1beta1" +
      "H\001P\001\242\002\003BBS\222A\320\003\022h\n\tMedia API\032\031https://blo" +
      "ombox.io/terms\"7\n\010Bloombox\022\023https://bloo" +
      "mbox.io\032\026developers@bloombox.io2\007v1beta1" +
      "\032\022api.bloombox.cloud*\001\0022\020application/jso" +
      "n:\020application/jsonZ\320\001\nd\n\013ApiKeyParam\022U\010" +
      "\002\022JParameter for identifying API key own" +
      "ed by the invoking project or system.\032\003k" +
      "ey \001\nh\n\014ApiKeyHeader\022X\010\002\022GHeader for ide" +
      "ntifying API key owned by the invoking p" +
      "roject or system.\032\tX-API-Key \001b\021\n\017\n\013ApiK" +
      "eyParam\022\000b\022\n\020\n\014ApiKeyHeader\022\000r/\n\rBloombo" +
      "x APIs\022\036https://apidocs.bloombox.cloudb\006" +
      "proto3"
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
          io.opencannabis.schema.media.MediaItemKey.getDescriptor(),
          io.opencannabis.schema.media.MediaItemType.getDescriptor(),
          io.opencannabis.schema.media.AttachedMedia.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          grpc.gateway.protoc_gen_swagger.options.Swagger.getDescriptor(),
        }, assigner);
    internal_static_bloombox_schema_services_media_v1beta1_MediaFile_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bloombox_schema_services_media_v1beta1_MediaFile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_media_v1beta1_MediaFile_descriptor,
        new java.lang.String[] { "Filename", "Mimetype", });
    internal_static_bloombox_schema_services_media_v1beta1_MediaContent_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_bloombox_schema_services_media_v1beta1_MediaContent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_media_v1beta1_MediaContent_descriptor,
        new java.lang.String[] { "Content", "Type", "File", "Blob", "Spec", });
    internal_static_bloombox_schema_services_media_v1beta1_UploadTransaction_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_bloombox_schema_services_media_v1beta1_UploadTransaction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_media_v1beta1_UploadTransaction_descriptor,
        new java.lang.String[] { "Target", "Token", });
    internal_static_bloombox_schema_services_media_v1beta1_OperationResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_bloombox_schema_services_media_v1beta1_OperationResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_media_v1beta1_OperationResult_descriptor,
        new java.lang.String[] { "Key", });
    internal_static_bloombox_schema_services_media_v1beta1_ListMedia_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_bloombox_schema_services_media_v1beta1_ListMedia_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_media_v1beta1_ListMedia_descriptor,
        new java.lang.String[] { });
    internal_static_bloombox_schema_services_media_v1beta1_ListMedia_Request_descriptor =
      internal_static_bloombox_schema_services_media_v1beta1_ListMedia_descriptor.getNestedTypes().get(0);
    internal_static_bloombox_schema_services_media_v1beta1_ListMedia_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_media_v1beta1_ListMedia_Request_descriptor,
        new java.lang.String[] { "Scope", });
    internal_static_bloombox_schema_services_media_v1beta1_ListMedia_Response_descriptor =
      internal_static_bloombox_schema_services_media_v1beta1_ListMedia_descriptor.getNestedTypes().get(1);
    internal_static_bloombox_schema_services_media_v1beta1_ListMedia_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_media_v1beta1_ListMedia_Response_descriptor,
        new java.lang.String[] { "Media", });
    internal_static_bloombox_schema_services_media_v1beta1_GetMedia_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_bloombox_schema_services_media_v1beta1_GetMedia_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_media_v1beta1_GetMedia_descriptor,
        new java.lang.String[] { });
    internal_static_bloombox_schema_services_media_v1beta1_GetMedia_Request_descriptor =
      internal_static_bloombox_schema_services_media_v1beta1_GetMedia_descriptor.getNestedTypes().get(0);
    internal_static_bloombox_schema_services_media_v1beta1_GetMedia_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_media_v1beta1_GetMedia_Request_descriptor,
        new java.lang.String[] { "Scope", "Key", });
    internal_static_bloombox_schema_services_media_v1beta1_GetMedia_Response_descriptor =
      internal_static_bloombox_schema_services_media_v1beta1_GetMedia_descriptor.getNestedTypes().get(1);
    internal_static_bloombox_schema_services_media_v1beta1_GetMedia_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_media_v1beta1_GetMedia_Response_descriptor,
        new java.lang.String[] { "Media", });
    internal_static_bloombox_schema_services_media_v1beta1_UploadMedia_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_bloombox_schema_services_media_v1beta1_UploadMedia_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_media_v1beta1_UploadMedia_descriptor,
        new java.lang.String[] { });
    internal_static_bloombox_schema_services_media_v1beta1_UploadMedia_Request_descriptor =
      internal_static_bloombox_schema_services_media_v1beta1_UploadMedia_descriptor.getNestedTypes().get(0);
    internal_static_bloombox_schema_services_media_v1beta1_UploadMedia_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_media_v1beta1_UploadMedia_Request_descriptor,
        new java.lang.String[] { "Scope", "Subject", "Content", });
    internal_static_bloombox_schema_services_media_v1beta1_UploadMedia_Response_descriptor =
      internal_static_bloombox_schema_services_media_v1beta1_UploadMedia_descriptor.getNestedTypes().get(1);
    internal_static_bloombox_schema_services_media_v1beta1_UploadMedia_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_media_v1beta1_UploadMedia_Response_descriptor,
        new java.lang.String[] { "Transaction", "Result", "Operation", });
    internal_static_bloombox_schema_services_media_v1beta1_AttachMedia_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_bloombox_schema_services_media_v1beta1_AttachMedia_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_media_v1beta1_AttachMedia_descriptor,
        new java.lang.String[] { });
    internal_static_bloombox_schema_services_media_v1beta1_AttachMedia_Request_descriptor =
      internal_static_bloombox_schema_services_media_v1beta1_AttachMedia_descriptor.getNestedTypes().get(0);
    internal_static_bloombox_schema_services_media_v1beta1_AttachMedia_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_media_v1beta1_AttachMedia_Request_descriptor,
        new java.lang.String[] { "Scope", "Token", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(grpc.gateway.protoc_gen_swagger.options.Swagger.openapiv2Operation);
    registry.add(grpc.gateway.protoc_gen_swagger.options.Swagger.openapiv2Swagger);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.opencannabis.schema.media.MediaItemKey.getDescriptor();
    io.opencannabis.schema.media.MediaItemType.getDescriptor();
    io.opencannabis.schema.media.AttachedMedia.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    grpc.gateway.protoc_gen_swagger.options.Swagger.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
