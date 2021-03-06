/*
 * Copyright 2019, Momentum Ideas, Co. All rights reserved.
 *
 * Source and object computer code contained herein is the private intellectual
 * property of Momentum Ideas Co., a Delaware Corporation. Use of this
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
// source: checkin/v1beta1/CheckinService_Beta1.proto

package io.bloombox.schema.services.checkin.v1beta1;

public final class CheckinServiceBeta1 {
  private CheckinServiceBeta1() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_services_checkin_v1beta1_Ping_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_services_checkin_v1beta1_Ping_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_services_checkin_v1beta1_Ping_Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_services_checkin_v1beta1_Ping_Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_services_checkin_v1beta1_Ping_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_services_checkin_v1beta1_Ping_Response_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_services_checkin_v1beta1_Ping_Operation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_services_checkin_v1beta1_Ping_Operation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_services_checkin_v1beta1_CheckinUser_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_services_checkin_v1beta1_CheckinUser_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_services_checkin_v1beta1_CheckinEnrollment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_services_checkin_v1beta1_CheckinEnrollment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_services_checkin_v1beta1_CheckinResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_services_checkin_v1beta1_CheckinResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_services_checkin_v1beta1_IDCheckin_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_services_checkin_v1beta1_IDCheckin_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_services_checkin_v1beta1_IDCheckin_Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_services_checkin_v1beta1_IDCheckin_Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_services_checkin_v1beta1_IDCheckin_Operation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_services_checkin_v1beta1_IDCheckin_Operation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_services_checkin_v1beta1_CardCheckin_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_services_checkin_v1beta1_CardCheckin_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_services_checkin_v1beta1_CardCheckin_Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_services_checkin_v1beta1_CardCheckin_Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_services_checkin_v1beta1_CardCheckin_Operation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_services_checkin_v1beta1_CardCheckin_Operation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*checkin/v1beta1/CheckinService_Beta1.p" +
      "roto\022!bloombox.services.checkin.v1beta1\032" +
      "\023identity/User.proto\032\026identity/UserKey.p" +
      "roto\032\034services/ServiceStatus.proto\032\027pers" +
      "on/PersonName.proto\032\034google/api/annotati" +
      "ons.proto\"\343\001\n\004Ping\032\t\n\007Request\032<\n\010Respons" +
      "e\0220\n\006status\030\001 \001(\0162 .bloombox.services.Se" +
      "rviceStatus\032\221\001\n\tOperation\022@\n\007request\030\001 \001" +
      "(\0132/.bloombox.services.checkin.v1beta1.P" +
      "ing.Request\022B\n\010response\030\002 \001(\01320.bloombox" +
      ".services.checkin.v1beta1.Ping.Response\"" +
      "\214\001\n\013CheckinUser\022\'\n\003key\030\001 \001(\0132\032.bloombox." +
      "identity.UserKey\022+\n\005flags\030\002 \001(\0132\034.bloomb" +
      "ox.identity.UserFlags\022\'\n\004name\030\003 \001(\0132\031.op" +
      "encannabis.person.Name\"!\n\021CheckinEnrollm" +
      "ent\022\014\n\004code\030\001 \001(\t\"\377\001\n\017CheckinResponse\022\017\n" +
      "\007success\030\001 \001(\010\022\023\n\013must_enroll\030\002 \001(\010\022>\n\005e" +
      "rror\030\003 \001(\0162/.bloombox.services.checkin.v" +
      "1beta1.CheckinError\022<\n\004user\030\004 \001(\0132..bloo" +
      "mbox.services.checkin.v1beta1.CheckinUse" +
      "r\022H\n\nenrollment\030\005 \001(\01324.bloombox.service" +
      "s.checkin.v1beta1.CheckinEnrollment\"\371\001\n\t" +
      "IDCheckin\032Q\n\007Request\022\013\n\003raw\030\001 \001(\t\022\r\n\005sco" +
      "pe\030\002 \001(\t\022\025\n\rserial_number\030\003 \001(\t\022\023\n\013finge" +
      "rprint\030\004 \001(\t\032\230\001\n\tOperation\022E\n\007request\030\001 " +
      "\001(\01324.bloombox.services.checkin.v1beta1." +
      "IDCheckin.Request\022D\n\010response\030\002 \001(\01322.bl" +
      "oombox.services.checkin.v1beta1.CheckinR" +
      "esponse\"\212\002\n\013CardCheckin\032^\n\007Request\022\021\n\tca" +
      "rd_type\030\001 \001(\t\022\017\n\007payload\030\002 \001(\t\022\021\n\tsignat" +
      "ure\030\003 \001(\t\022\r\n\005agent\030\004 \001(\t\022\r\n\005scope\030\005 \001(\t\032" +
      "\232\001\n\tOperation\022G\n\007request\030\001 \001(\01326.bloombo" +
      "x.services.checkin.v1beta1.CardCheckin.R" +
      "equest\022D\n\010response\030\002 \001(\01322.bloombox.serv" +
      "ices.checkin.v1beta1.CheckinResponse*\356\002\n" +
      "\014CheckinError\022\014\n\010NO_ERROR\020\000\022\020\n\014ID_NOT_FO" +
      "UND\020\001\022\016\n\nID_EXPIRED\020\002\022\016\n\nID_INVALID\020\003\022\027\n" +
      "\023ID_TYPE_UNSUPPORTED\020\004\022\025\n\021CARD_TYPE_INVA" +
      "LID\020\005\022\020\n\014CARD_EXPIRED\020\006\022\022\n\016CARD_SUSPENDE" +
      "D\020\007\022\022\n\016USER_SUSPENDED\020\010\022\025\n\021PARTNER_SUSPE" +
      "NDED\020\t\022\023\n\017PARTNER_INVALID\020\n\022\024\n\020LOCATION_" +
      "INVALID\020\013\022\030\n\024JURISDICTION_INVALID\020\014\022\034\n\030J" +
      "URISDICTION_UNSUPPORTED\020\r\022\021\n\rUSER_UNDERA" +
      "GE\020\016\022\031\n\025USER_CHECKIN_CONFLICT\020\017\022\014\n\010INTER" +
      "NAL\020c2\226\004\n\007Checkin\022\210\001\n\004Ping\022/.bloombox.se" +
      "rvices.checkin.v1beta1.Ping.Request\0320.bl" +
      "oombox.services.checkin.v1beta1.Ping.Res" +
      "ponse\"\035\202\323\344\223\002\027\022\025/checkin/v1beta1/ping\022\341\001\n" +
      "\016Identification\0224.bloombox.services.chec" +
      "kin.v1beta1.IDCheckin.Request\0322.bloombox" +
      ".services.checkin.v1beta1.CheckinRespons" +
      "e\"e\202\323\344\223\002_\"9/checkin/v1beta1/{scope=partn" +
      "ers/*/locations/*}/global:id:\001*Z\037\"\032/chec" +
      "kin/v1beta1/global:id:\001*\022\233\001\n\004Card\0226.bloo" +
      "mbox.services.checkin.v1beta1.CardChecki" +
      "n.Request\0322.bloombox.services.checkin.v1" +
      "beta1.CheckinResponse\"\'\202\323\344\223\002!\"\034/checkin/" +
      "v1beta1/global:card:\001*B7\n+io.bloombox.sc" +
      "hema.services.checkin.v1beta1H\001P\001\242\002\003BBSb" +
      "\006proto3"
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
          io.bloombox.schema.identity.AppUser.getDescriptor(),
          io.bloombox.schema.identity.AppUserKey.getDescriptor(),
          io.bloombox.schema.services.ServiceStatusOuterClass.getDescriptor(),
          io.opencannabis.schema.person.PersonName.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_bloombox_services_checkin_v1beta1_Ping_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bloombox_services_checkin_v1beta1_Ping_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_services_checkin_v1beta1_Ping_descriptor,
        new java.lang.String[] { });
    internal_static_bloombox_services_checkin_v1beta1_Ping_Request_descriptor =
      internal_static_bloombox_services_checkin_v1beta1_Ping_descriptor.getNestedTypes().get(0);
    internal_static_bloombox_services_checkin_v1beta1_Ping_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_services_checkin_v1beta1_Ping_Request_descriptor,
        new java.lang.String[] { });
    internal_static_bloombox_services_checkin_v1beta1_Ping_Response_descriptor =
      internal_static_bloombox_services_checkin_v1beta1_Ping_descriptor.getNestedTypes().get(1);
    internal_static_bloombox_services_checkin_v1beta1_Ping_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_services_checkin_v1beta1_Ping_Response_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_bloombox_services_checkin_v1beta1_Ping_Operation_descriptor =
      internal_static_bloombox_services_checkin_v1beta1_Ping_descriptor.getNestedTypes().get(2);
    internal_static_bloombox_services_checkin_v1beta1_Ping_Operation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_services_checkin_v1beta1_Ping_Operation_descriptor,
        new java.lang.String[] { "Request", "Response", });
    internal_static_bloombox_services_checkin_v1beta1_CheckinUser_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_bloombox_services_checkin_v1beta1_CheckinUser_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_services_checkin_v1beta1_CheckinUser_descriptor,
        new java.lang.String[] { "Key", "Flags", "Name", });
    internal_static_bloombox_services_checkin_v1beta1_CheckinEnrollment_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_bloombox_services_checkin_v1beta1_CheckinEnrollment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_services_checkin_v1beta1_CheckinEnrollment_descriptor,
        new java.lang.String[] { "Code", });
    internal_static_bloombox_services_checkin_v1beta1_CheckinResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_bloombox_services_checkin_v1beta1_CheckinResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_services_checkin_v1beta1_CheckinResponse_descriptor,
        new java.lang.String[] { "Success", "MustEnroll", "Error", "User", "Enrollment", });
    internal_static_bloombox_services_checkin_v1beta1_IDCheckin_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_bloombox_services_checkin_v1beta1_IDCheckin_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_services_checkin_v1beta1_IDCheckin_descriptor,
        new java.lang.String[] { });
    internal_static_bloombox_services_checkin_v1beta1_IDCheckin_Request_descriptor =
      internal_static_bloombox_services_checkin_v1beta1_IDCheckin_descriptor.getNestedTypes().get(0);
    internal_static_bloombox_services_checkin_v1beta1_IDCheckin_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_services_checkin_v1beta1_IDCheckin_Request_descriptor,
        new java.lang.String[] { "Raw", "Scope", "SerialNumber", "Fingerprint", });
    internal_static_bloombox_services_checkin_v1beta1_IDCheckin_Operation_descriptor =
      internal_static_bloombox_services_checkin_v1beta1_IDCheckin_descriptor.getNestedTypes().get(1);
    internal_static_bloombox_services_checkin_v1beta1_IDCheckin_Operation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_services_checkin_v1beta1_IDCheckin_Operation_descriptor,
        new java.lang.String[] { "Request", "Response", });
    internal_static_bloombox_services_checkin_v1beta1_CardCheckin_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_bloombox_services_checkin_v1beta1_CardCheckin_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_services_checkin_v1beta1_CardCheckin_descriptor,
        new java.lang.String[] { });
    internal_static_bloombox_services_checkin_v1beta1_CardCheckin_Request_descriptor =
      internal_static_bloombox_services_checkin_v1beta1_CardCheckin_descriptor.getNestedTypes().get(0);
    internal_static_bloombox_services_checkin_v1beta1_CardCheckin_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_services_checkin_v1beta1_CardCheckin_Request_descriptor,
        new java.lang.String[] { "CardType", "Payload", "Signature", "Agent", "Scope", });
    internal_static_bloombox_services_checkin_v1beta1_CardCheckin_Operation_descriptor =
      internal_static_bloombox_services_checkin_v1beta1_CardCheckin_descriptor.getNestedTypes().get(1);
    internal_static_bloombox_services_checkin_v1beta1_CardCheckin_Operation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_services_checkin_v1beta1_CardCheckin_Operation_descriptor,
        new java.lang.String[] { "Request", "Response", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.bloombox.schema.identity.AppUser.getDescriptor();
    io.bloombox.schema.identity.AppUserKey.getDescriptor();
    io.bloombox.schema.services.ServiceStatusOuterClass.getDescriptor();
    io.opencannabis.schema.person.PersonName.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
