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
    internal_static_bloombox_schema_services_checkin_v1beta1_Ping_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_checkin_v1beta1_Ping_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_checkin_v1beta1_Ping_Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_checkin_v1beta1_Ping_Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_checkin_v1beta1_Ping_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_checkin_v1beta1_Ping_Response_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_checkin_v1beta1_Ping_Operation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_checkin_v1beta1_Ping_Operation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_checkin_v1beta1_CheckinUser_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_checkin_v1beta1_CheckinUser_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_checkin_v1beta1_CheckinEnrollment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_checkin_v1beta1_CheckinEnrollment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_checkin_v1beta1_CheckinResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_checkin_v1beta1_CheckinResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_checkin_v1beta1_IDCheckin_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_checkin_v1beta1_IDCheckin_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_checkin_v1beta1_IDCheckin_Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_checkin_v1beta1_IDCheckin_Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_checkin_v1beta1_IDCheckin_Operation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_checkin_v1beta1_IDCheckin_Operation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_checkin_v1beta1_CardCheckin_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_checkin_v1beta1_CardCheckin_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_checkin_v1beta1_CardCheckin_Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_checkin_v1beta1_CardCheckin_Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_checkin_v1beta1_CardCheckin_Operation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_checkin_v1beta1_CardCheckin_Operation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*checkin/v1beta1/CheckinService_Beta1.p" +
      "roto\022(bloombox.schema.services.checkin.v" +
      "1beta1\032\023identity/User.proto\032\034services/Se" +
      "rviceStatus.proto\032\027person/PersonName.pro" +
      "to\032\034google/api/annotations.proto\"\370\001\n\004Pin" +
      "g\032\t\n\007Request\032C\n\010Response\0227\n\006status\030\001 \001(\016" +
      "2\'.bloombox.schema.services.ServiceStatu" +
      "s\032\237\001\n\tOperation\022G\n\007request\030\001 \001(\01326.bloom" +
      "box.schema.services.checkin.v1beta1.Ping" +
      ".Request\022I\n\010response\030\002 \001(\01327.bloombox.sc" +
      "hema.services.checkin.v1beta1.Ping.Respo" +
      "nse\"\232\001\n\013CheckinUser\022.\n\003key\030\001 \001(\0132!.bloom" +
      "box.schema.identity.UserKey\0222\n\005flags\030\002 \001" +
      "(\0132#.bloombox.schema.identity.UserFlags\022" +
      "\'\n\004name\030\003 \001(\0132\031.opencannabis.person.Name" +
      "\"!\n\021CheckinEnrollment\022\014\n\004code\030\001 \001(\t\"\224\002\n\017" +
      "CheckinResponse\022\017\n\007success\030\001 \001(\010\022\023\n\013must" +
      "_enroll\030\002 \001(\010\022E\n\005error\030\003 \001(\01626.bloombox." +
      "schema.services.checkin.v1beta1.CheckinE" +
      "rror\022C\n\004user\030\004 \001(\01325.bloombox.schema.ser" +
      "vices.checkin.v1beta1.CheckinUser\022O\n\nenr" +
      "ollment\030\005 \001(\0132;.bloombox.schema.services" +
      ".checkin.v1beta1.CheckinEnrollment\"\207\002\n\tI" +
      "DCheckin\032Q\n\007Request\022\013\n\003raw\030\001 \001(\t\022\r\n\005scop" +
      "e\030\002 \001(\t\022\025\n\rserial_number\030\003 \001(\t\022\023\n\013finger" +
      "print\030\004 \001(\t\032\246\001\n\tOperation\022L\n\007request\030\001 \001" +
      "(\0132;.bloombox.schema.services.checkin.v1" +
      "beta1.IDCheckin.Request\022K\n\010response\030\002 \001(" +
      "\01329.bloombox.schema.services.checkin.v1b" +
      "eta1.CheckinResponse\"\230\002\n\013CardCheckin\032^\n\007" +
      "Request\022\021\n\tcard_type\030\001 \001(\t\022\017\n\007payload\030\002 " +
      "\001(\t\022\021\n\tsignature\030\003 \001(\t\022\r\n\005agent\030\004 \001(\t\022\r\n" +
      "\005scope\030\005 \001(\t\032\250\001\n\tOperation\022N\n\007request\030\001 " +
      "\001(\0132=.bloombox.schema.services.checkin.v" +
      "1beta1.CardCheckin.Request\022K\n\010response\030\002" +
      " \001(\01329.bloombox.schema.services.checkin." +
      "v1beta1.CheckinResponse*\305\002\n\014CheckinError" +
      "\022\014\n\010NO_ERROR\020\000\022\020\n\014ID_NOT_FOUND\020\001\022\016\n\nID_E" +
      "XPIRED\020\002\022\016\n\nID_INVALID\020\003\022\027\n\023ID_TYPE_UNSU" +
      "PPORTED\020\004\022\025\n\021CARD_TYPE_INVALID\020\005\022\020\n\014CARD" +
      "_EXPIRED\020\006\022\022\n\016CARD_SUSPENDED\020\007\022\022\n\016USER_S" +
      "USPENDED\020\010\022\025\n\021PARTNER_SUSPENDED\020\t\022\023\n\017PAR" +
      "TNER_INVALID\020\n\022\024\n\020LOCATION_INVALID\020\013\022\030\n\024" +
      "JURISDICTION_INVALID\020\014\022\034\n\030JURISDICTION_U" +
      "NSUPPORTED\020\r\022\021\n\rUSER_UNDERAGE\020\0162\300\004\n\007Chec" +
      "kin\022\226\001\n\004Ping\0226.bloombox.schema.services." +
      "checkin.v1beta1.Ping.Request\0327.bloombox." +
      "schema.services.checkin.v1beta1.Ping.Res" +
      "ponse\"\035\202\323\344\223\002\027\022\025/checkin/v1beta1/ping\022\357\001\n" +
      "\016Identification\022;.bloombox.schema.servic" +
      "es.checkin.v1beta1.IDCheckin.Request\0329.b" +
      "loombox.schema.services.checkin.v1beta1." +
      "CheckinResponse\"e\202\323\344\223\002_\"9/checkin/v1beta" +
      "1/{scope=partners/*/locations/*}/global:" +
      "id:\001*Z\037\"\032/checkin/v1beta1/global:id:\001*\022\251" +
      "\001\n\004Card\022=.bloombox.schema.services.check" +
      "in.v1beta1.CardCheckin.Request\0329.bloombo" +
      "x.schema.services.checkin.v1beta1.Checki" +
      "nResponse\"\'\202\323\344\223\002!\"\034/checkin/v1beta1/glob" +
      "al:card:\001*B7\n+io.bloombox.schema.service" +
      "s.checkin.v1beta1H\001P\001\242\002\003BBSb\006proto3"
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
          io.bloombox.schema.identity.UserOuterClass.getDescriptor(),
          io.bloombox.schema.services.ServiceStatusOuterClass.getDescriptor(),
          io.opencannabis.schema.person.PersonName.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_bloombox_schema_services_checkin_v1beta1_Ping_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bloombox_schema_services_checkin_v1beta1_Ping_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_checkin_v1beta1_Ping_descriptor,
        new java.lang.String[] { });
    internal_static_bloombox_schema_services_checkin_v1beta1_Ping_Request_descriptor =
      internal_static_bloombox_schema_services_checkin_v1beta1_Ping_descriptor.getNestedTypes().get(0);
    internal_static_bloombox_schema_services_checkin_v1beta1_Ping_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_checkin_v1beta1_Ping_Request_descriptor,
        new java.lang.String[] { });
    internal_static_bloombox_schema_services_checkin_v1beta1_Ping_Response_descriptor =
      internal_static_bloombox_schema_services_checkin_v1beta1_Ping_descriptor.getNestedTypes().get(1);
    internal_static_bloombox_schema_services_checkin_v1beta1_Ping_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_checkin_v1beta1_Ping_Response_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_bloombox_schema_services_checkin_v1beta1_Ping_Operation_descriptor =
      internal_static_bloombox_schema_services_checkin_v1beta1_Ping_descriptor.getNestedTypes().get(2);
    internal_static_bloombox_schema_services_checkin_v1beta1_Ping_Operation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_checkin_v1beta1_Ping_Operation_descriptor,
        new java.lang.String[] { "Request", "Response", });
    internal_static_bloombox_schema_services_checkin_v1beta1_CheckinUser_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_bloombox_schema_services_checkin_v1beta1_CheckinUser_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_checkin_v1beta1_CheckinUser_descriptor,
        new java.lang.String[] { "Key", "Flags", "Name", });
    internal_static_bloombox_schema_services_checkin_v1beta1_CheckinEnrollment_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_bloombox_schema_services_checkin_v1beta1_CheckinEnrollment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_checkin_v1beta1_CheckinEnrollment_descriptor,
        new java.lang.String[] { "Code", });
    internal_static_bloombox_schema_services_checkin_v1beta1_CheckinResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_bloombox_schema_services_checkin_v1beta1_CheckinResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_checkin_v1beta1_CheckinResponse_descriptor,
        new java.lang.String[] { "Success", "MustEnroll", "Error", "User", "Enrollment", });
    internal_static_bloombox_schema_services_checkin_v1beta1_IDCheckin_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_bloombox_schema_services_checkin_v1beta1_IDCheckin_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_checkin_v1beta1_IDCheckin_descriptor,
        new java.lang.String[] { });
    internal_static_bloombox_schema_services_checkin_v1beta1_IDCheckin_Request_descriptor =
      internal_static_bloombox_schema_services_checkin_v1beta1_IDCheckin_descriptor.getNestedTypes().get(0);
    internal_static_bloombox_schema_services_checkin_v1beta1_IDCheckin_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_checkin_v1beta1_IDCheckin_Request_descriptor,
        new java.lang.String[] { "Raw", "Scope", "SerialNumber", "Fingerprint", });
    internal_static_bloombox_schema_services_checkin_v1beta1_IDCheckin_Operation_descriptor =
      internal_static_bloombox_schema_services_checkin_v1beta1_IDCheckin_descriptor.getNestedTypes().get(1);
    internal_static_bloombox_schema_services_checkin_v1beta1_IDCheckin_Operation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_checkin_v1beta1_IDCheckin_Operation_descriptor,
        new java.lang.String[] { "Request", "Response", });
    internal_static_bloombox_schema_services_checkin_v1beta1_CardCheckin_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_bloombox_schema_services_checkin_v1beta1_CardCheckin_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_checkin_v1beta1_CardCheckin_descriptor,
        new java.lang.String[] { });
    internal_static_bloombox_schema_services_checkin_v1beta1_CardCheckin_Request_descriptor =
      internal_static_bloombox_schema_services_checkin_v1beta1_CardCheckin_descriptor.getNestedTypes().get(0);
    internal_static_bloombox_schema_services_checkin_v1beta1_CardCheckin_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_checkin_v1beta1_CardCheckin_Request_descriptor,
        new java.lang.String[] { "CardType", "Payload", "Signature", "Agent", "Scope", });
    internal_static_bloombox_schema_services_checkin_v1beta1_CardCheckin_Operation_descriptor =
      internal_static_bloombox_schema_services_checkin_v1beta1_CardCheckin_descriptor.getNestedTypes().get(1);
    internal_static_bloombox_schema_services_checkin_v1beta1_CardCheckin_Operation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_checkin_v1beta1_CardCheckin_Operation_descriptor,
        new java.lang.String[] { "Request", "Response", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.bloombox.schema.identity.UserOuterClass.getDescriptor();
    io.bloombox.schema.services.ServiceStatusOuterClass.getDescriptor();
    io.opencannabis.schema.person.PersonName.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
