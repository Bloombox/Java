/*
 * Copyright 2018, Bloombox, LLC. All rights reserved.
 *
 * Source and object computer code contained herein is the private intellectual
 * property of Bloombox, a California Limited Liability Corporation. Use of this
 * code in source form requires permission in writing before use or the
 * assembly, distribution, or publishing of derivative works, for commercial
 * purposes or any other purpose, from a duly authorized officer of Momentum
 * Ideas Co.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
    internal_static_bloombox_schema_services_media_v1beta1_MediaSubject_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_media_v1beta1_MediaSubject_fieldAccessorTable;
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
      "\032\025base/ProductKey.proto\032\024media/MediaKey." +
      "proto\032\025media/MediaType.proto\032\030partner/Pa" +
      "rtnerKey.proto\032\035partner/PartnerLocation." +
      "proto\032\033google/protobuf/empty.proto\032\034goog" +
      "le/api/annotations.proto\032(protoc-gen-swa" +
      "gger/options/swagger.proto\"\347\001\n\014MediaSubj" +
      "ect\022\014\n\004name\030\001 \001(\t\0220\n\007product\030\002 \001(\0132\035.ope" +
      "ncannabis.base.ProductKeyH\000\0226\n\007partner\030\003" +
      " \001(\0132#.bloombox.schema.partner.PartnerKe" +
      "yH\000\022?\n\010location\030\004 \001(\0132+.bloombox.schema." +
      "partner.PartnerLocationKeyH\000\022\020\n\006global\030\005" +
      " \001(\010H\000B\014\n\nattachment\"/\n\tMediaFile\022\020\n\010fil" +
      "ename\030\001 \001(\t\022\020\n\010mimetype\030\002 \001(\t\"\247\001\n\014MediaC" +
      "ontent\022\017\n\007content\030\001 \001(\014\022+\n\004type\030\002 \001(\0132\035." +
      "opencannabis.media.MediaType\022A\n\004file\030\003 \001" +
      "(\01321.bloombox.schema.services.media.v1be" +
      "ta1.MediaFileH\000\022\016\n\004blob\030\004 \001(\010H\000B\006\n\004spec\"" +
      "2\n\021UploadTransaction\022\016\n\006target\030\001 \001(\t\022\r\n\005" +
      "token\030\002 \001(\t\"<\n\017OperationResult\022)\n\003key\030\001 " +
      "\001(\0132\034.opencannabis.media.MediaKey\"\355\002\n\013Up" +
      "loadMedia\032\246\001\n\007Request\022\r\n\005scope\030\001 \001(\t\022E\n\007" +
      "subject\030\002 \001(\01324.bloombox.schema.services" +
      ".media.v1beta1.MediaSubject\022E\n\007content\030\003" +
      " \001(\01324.bloombox.schema.services.media.v1" +
      "beta1.MediaContent\032\264\001\n\010Response\022P\n\013trans" +
      "action\030\001 \001(\01329.bloombox.schema.services." +
      "media.v1beta1.UploadTransactionH\000\022I\n\006res" +
      "ult\030\002 \001(\01327.bloombox.schema.services.med" +
      "ia.v1beta1.OperationResultH\000B\013\n\toperatio" +
      "n\"6\n\013AttachMedia\032\'\n\007Request\022\r\n\005scope\030\001 \001" +
      "(\t\022\r\n\005token\030\002 \001(\t*\224\001\n\nMediaError\022\014\n\010NO_E" +
      "RROR\020\000\022\023\n\017PARTNER_INVALID\020\001\022\024\n\020LOCATION_" +
      "INVALID\020\002\022\021\n\rACCESS_DENIED\020\003\022\023\n\017MEDIA_NO" +
      "T_FOUND\020\004\022\021\n\rMEDIA_INVALID\020\005\022\022\n\016INTERNAL" +
      "_ERROR\020c2\320\004\n\005Media\022\270\002\n\006Upload\022;.bloombox" +
      ".schema.services.media.v1beta1.UploadMed" +
      "ia.Request\032<.bloombox.schema.services.me" +
      "dia.v1beta1.UploadMedia.Response\"\262\001\202\323\344\223\002" +
      "9\"4/media/v1beta1/{scope=partners/*/loca" +
      "tions/*}/upload:\001*\222Ap\022\027Create a new medi" +
      "a item\032MProvision a new media item recor" +
      "d, and update its data with an initial v" +
      "alue.*\006Upload\022\213\002\n\006Attach\022;.bloombox.sche" +
      "ma.services.media.v1beta1.AttachMedia.Re" +
      "quest\032\026.google.protobuf.Empty\"\253\001\202\323\344\223\002A\032<" +
      "/media/v1beta1/{scope=partners/*/locatio" +
      "ns/*}/upload/{token}:\001*\222Aa\022\025Attach uploa" +
      "ded media\032@Notify the platform that uplo" +
      "aded media is ready to be attached.*\006Att" +
      "achB\211\004\n)io.bloombox.schema.services.medi" +
      "a.v1beta1H\001P\001\242\002\003BBS\222A\320\003\022h\n\tMedia API\032\031ht" +
      "tps://bloombox.io/terms\"7\n\010Bloombox\022\023htt" +
      "ps://bloombox.io\032\026developers@bloombox.io" +
      "2\007v1beta1\032\022api.bloombox.cloud*\001\0022\020applic" +
      "ation/json:\020application/jsonZ\320\001\nd\n\013ApiKe" +
      "yParam\022U\010\002\022JParameter for identifying AP" +
      "I key owned by the invoking project or s" +
      "ystem.\032\003key \001\nh\n\014ApiKeyHeader\022X\010\002\022GHeade" +
      "r for identifying API key owned by the i" +
      "nvoking project or system.\032\tX-API-Key \001b" +
      "\021\n\017\n\013ApiKeyParam\022\000b\022\n\020\n\014ApiKeyHeader\022\000r/" +
      "\n\rBloombox APIs\022\036https://apidocs.bloombo" +
      "x.cloudb\006proto3"
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
          io.opencannabis.schema.base.BaseProductKey.getDescriptor(),
          io.opencannabis.schema.media.MediaItemKey.getDescriptor(),
          io.opencannabis.schema.media.MediaItemType.getDescriptor(),
          io.bloombox.schema.partner.PartnerKeyOuterClass.getDescriptor(),
          io.bloombox.schema.partner.PartnerLocationOuterClass.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          grpc.gateway.protoc_gen_swagger.options.Swagger.getDescriptor(),
        }, assigner);
    internal_static_bloombox_schema_services_media_v1beta1_MediaSubject_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bloombox_schema_services_media_v1beta1_MediaSubject_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_media_v1beta1_MediaSubject_descriptor,
        new java.lang.String[] { "Name", "Product", "Partner", "Location", "Global", "Attachment", });
    internal_static_bloombox_schema_services_media_v1beta1_MediaFile_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_bloombox_schema_services_media_v1beta1_MediaFile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_media_v1beta1_MediaFile_descriptor,
        new java.lang.String[] { "Filename", "Mimetype", });
    internal_static_bloombox_schema_services_media_v1beta1_MediaContent_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_bloombox_schema_services_media_v1beta1_MediaContent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_media_v1beta1_MediaContent_descriptor,
        new java.lang.String[] { "Content", "Type", "File", "Blob", "Spec", });
    internal_static_bloombox_schema_services_media_v1beta1_UploadTransaction_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_bloombox_schema_services_media_v1beta1_UploadTransaction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_media_v1beta1_UploadTransaction_descriptor,
        new java.lang.String[] { "Target", "Token", });
    internal_static_bloombox_schema_services_media_v1beta1_OperationResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_bloombox_schema_services_media_v1beta1_OperationResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_media_v1beta1_OperationResult_descriptor,
        new java.lang.String[] { "Key", });
    internal_static_bloombox_schema_services_media_v1beta1_UploadMedia_descriptor =
      getDescriptor().getMessageTypes().get(5);
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
      getDescriptor().getMessageTypes().get(6);
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
    io.opencannabis.schema.base.BaseProductKey.getDescriptor();
    io.opencannabis.schema.media.MediaItemKey.getDescriptor();
    io.opencannabis.schema.media.MediaItemType.getDescriptor();
    io.bloombox.schema.partner.PartnerKeyOuterClass.getDescriptor();
    io.bloombox.schema.partner.PartnerLocationOuterClass.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    grpc.gateway.protoc_gen_swagger.options.Swagger.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
