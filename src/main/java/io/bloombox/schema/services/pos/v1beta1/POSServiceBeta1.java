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
// source: pos/v1beta1/POSService_Beta1.proto

package io.bloombox.schema.services.pos.v1beta1;

public final class POSServiceBeta1 {
  private POSServiceBeta1() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_pos_v1beta1_Ping_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_pos_v1beta1_Ping_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_pos_v1beta1_Ping_Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_pos_v1beta1_Ping_Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_pos_v1beta1_Ping_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_pos_v1beta1_Ping_Response_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_pos_v1beta1_Ping_Operation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_pos_v1beta1_Ping_Operation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"pos/v1beta1/POSService_Beta1.proto\022$bl" +
      "oombox.schema.services.pos.v1beta1\032\034serv" +
      "ices/ServiceStatus.proto\032\034google/api/ann" +
      "otations.proto\"\360\001\n\004Ping\032\t\n\007Request\032C\n\010Re" +
      "sponse\0227\n\006status\030\001 \001(\0162\'.bloombox.schema" +
      ".services.ServiceStatus\032\227\001\n\tOperation\022C\n" +
      "\007request\030\001 \001(\01322.bloombox.schema.service" +
      "s.pos.v1beta1.Ping.Request\022E\n\010response\030\002" +
      " \001(\01323.bloombox.schema.services.pos.v1be" +
      "ta1.Ping.Response*\262\001\n\010POSError\022\013\n\007UNKNOW" +
      "N\020\000\022\026\n\022INVALID_COLLECTION\020\001\022\023\n\017INVALID_P" +
      "ARTNER\020\002\022\024\n\020INVALID_LOCATION\020\003\022\022\n\016INVALI" +
      "D_DEVICE\020\004\022\025\n\021PARTNER_NOT_FOUND\020\005\022\026\n\022LOC" +
      "ATION_NOT_FOUND\020\006\022\023\n\017INVALID_PAYLOAD\020c2\226" +
      "\001\n\013PointOfSale\022\206\001\n\004Ping\0222.bloombox.schem" +
      "a.services.pos.v1beta1.Ping.Request\0323.bl" +
      "oombox.schema.services.pos.v1beta1.Ping." +
      "Response\"\025\202\323\344\223\002\017\022\r/v1beta1/pingB3\n\'io.bl" +
      "oombox.schema.services.pos.v1beta1H\001P\001\242\002" +
      "\003BBSb\006proto3"
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
          io.bloombox.schema.services.ServiceStatusOuterClass.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_bloombox_schema_services_pos_v1beta1_Ping_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bloombox_schema_services_pos_v1beta1_Ping_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_pos_v1beta1_Ping_descriptor,
        new java.lang.String[] { });
    internal_static_bloombox_schema_services_pos_v1beta1_Ping_Request_descriptor =
      internal_static_bloombox_schema_services_pos_v1beta1_Ping_descriptor.getNestedTypes().get(0);
    internal_static_bloombox_schema_services_pos_v1beta1_Ping_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_pos_v1beta1_Ping_Request_descriptor,
        new java.lang.String[] { });
    internal_static_bloombox_schema_services_pos_v1beta1_Ping_Response_descriptor =
      internal_static_bloombox_schema_services_pos_v1beta1_Ping_descriptor.getNestedTypes().get(1);
    internal_static_bloombox_schema_services_pos_v1beta1_Ping_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_pos_v1beta1_Ping_Response_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_bloombox_schema_services_pos_v1beta1_Ping_Operation_descriptor =
      internal_static_bloombox_schema_services_pos_v1beta1_Ping_descriptor.getNestedTypes().get(2);
    internal_static_bloombox_schema_services_pos_v1beta1_Ping_Operation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_pos_v1beta1_Ping_Operation_descriptor,
        new java.lang.String[] { "Request", "Response", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.bloombox.schema.services.ServiceStatusOuterClass.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
