// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: devices/v1beta1/DevicesService_Beta1.proto

package io.bloombox.schema.services.devices.v1beta1;

public final class DevicesServiceBeta1 {
  private DevicesServiceBeta1() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_devices_v1beta1_DeviceAssignment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_devices_v1beta1_DeviceAssignment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_devices_v1beta1_DeviceActivation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_devices_v1beta1_DeviceActivation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_devices_v1beta1_Ping_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_devices_v1beta1_Ping_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_devices_v1beta1_Ping_Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_devices_v1beta1_Ping_Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_devices_v1beta1_Ping_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_devices_v1beta1_Ping_Response_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_devices_v1beta1_Ping_Operation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_devices_v1beta1_Ping_Operation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_devices_v1beta1_Activation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_devices_v1beta1_Activation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_devices_v1beta1_Activation_Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_devices_v1beta1_Activation_Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_devices_v1beta1_Activation_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_devices_v1beta1_Activation_Response_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_devices_v1beta1_Activation_Operation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_devices_v1beta1_Activation_Operation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*devices/v1beta1/DevicesService_Beta1.p" +
      "roto\022\030services.devices.v1beta1\032\034services" +
      "/ServiceStatus.proto\032\034google/api/annotat" +
      "ions.proto\"i\n\020DeviceAssignment\022\017\n\007partne" +
      "r\030\001 \001(\t\022\020\n\010location\030\002 \001(\t\0222\n\004role\030\003 \001(\0162" +
      "$.services.devices.v1beta1.DeviceRole\"r\n" +
      "\020DeviceActivation\022\014\n\004uuid\030\001 \001(\t\022\020\n\010hostn" +
      "ame\030\002 \001(\t\022>\n\nassignment\030\003 \001(\0132*.services" +
      ".devices.v1beta1.DeviceAssignment\"\307\001\n\004Pi" +
      "ng\032\t\n\007Request\0323\n\010Response\022\'\n\006status\030\001 \001(" +
      "\0162\027.services.ServiceStatus\032\177\n\tOperation\022" +
      "7\n\007request\030\001 \001(\0132&.services.devices.v1be" +
      "ta1.Ping.Request\0229\n\010response\030\002 \001(\0132\'.ser" +
      "vices.devices.v1beta1.Ping.Response\"\333\002\n\n" +
      "Activation\032.\n\007Request\022\016\n\006serial\030\001 \001(\t\022\023\n" +
      "\013fingerprint\030\002 \001(\t\032\216\001\n\010Response\022\016\n\006activ" +
      "e\030\001 \001(\010\0224\n\005error\030\002 \001(\0162%.services.device" +
      "s.v1beta1.DeviceError\022<\n\010manifest\030\003 \001(\0132" +
      "*.services.devices.v1beta1.DeviceActivat" +
      "ion\032\213\001\n\tOperation\022=\n\007request\030\001 \001(\0132,.ser" +
      "vices.devices.v1beta1.Activation.Request" +
      "\022?\n\010response\030\002 \001(\0132-.services.devices.v1" +
      "beta1.Activation.Response*\033\n\013DeviceError" +
      "\022\014\n\010NO_ERROR\020\000*=\n\nDeviceRole\022\016\n\nUNASSIGN" +
      "ED\020\000\022\006\n\002TV\020\001\022\013\n\007CHECKIN\020\002\022\n\n\006BEACON\020\0032\232\002" +
      "\n\007Devices\022v\n\004Ping\022&.services.devices.v1b" +
      "eta1.Ping.Request\032\'.services.devices.v1b" +
      "eta1.Ping.Response\"\035\202\323\344\223\002\027\022\025/devices/v1b" +
      "eta1/ping\022\226\001\n\010Activate\022,.services.device" +
      "s.v1beta1.Activation.Request\032-.services." +
      "devices.v1beta1.Activation.Response\"-\202\323\344" +
      "\223\002\'\"\"/devices/v1beta1/{serial}:activate:" +
      "\001*B1\n+io.bloombox.schema.services.device" +
      "s.v1beta1H\001P\001b\006proto3"
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
    internal_static_services_devices_v1beta1_DeviceAssignment_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_services_devices_v1beta1_DeviceAssignment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_devices_v1beta1_DeviceAssignment_descriptor,
        new java.lang.String[] { "Partner", "Location", "Role", });
    internal_static_services_devices_v1beta1_DeviceActivation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_services_devices_v1beta1_DeviceActivation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_devices_v1beta1_DeviceActivation_descriptor,
        new java.lang.String[] { "Uuid", "Hostname", "Assignment", });
    internal_static_services_devices_v1beta1_Ping_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_services_devices_v1beta1_Ping_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_devices_v1beta1_Ping_descriptor,
        new java.lang.String[] { });
    internal_static_services_devices_v1beta1_Ping_Request_descriptor =
      internal_static_services_devices_v1beta1_Ping_descriptor.getNestedTypes().get(0);
    internal_static_services_devices_v1beta1_Ping_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_devices_v1beta1_Ping_Request_descriptor,
        new java.lang.String[] { });
    internal_static_services_devices_v1beta1_Ping_Response_descriptor =
      internal_static_services_devices_v1beta1_Ping_descriptor.getNestedTypes().get(1);
    internal_static_services_devices_v1beta1_Ping_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_devices_v1beta1_Ping_Response_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_services_devices_v1beta1_Ping_Operation_descriptor =
      internal_static_services_devices_v1beta1_Ping_descriptor.getNestedTypes().get(2);
    internal_static_services_devices_v1beta1_Ping_Operation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_devices_v1beta1_Ping_Operation_descriptor,
        new java.lang.String[] { "Request", "Response", });
    internal_static_services_devices_v1beta1_Activation_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_services_devices_v1beta1_Activation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_devices_v1beta1_Activation_descriptor,
        new java.lang.String[] { });
    internal_static_services_devices_v1beta1_Activation_Request_descriptor =
      internal_static_services_devices_v1beta1_Activation_descriptor.getNestedTypes().get(0);
    internal_static_services_devices_v1beta1_Activation_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_devices_v1beta1_Activation_Request_descriptor,
        new java.lang.String[] { "Serial", "Fingerprint", });
    internal_static_services_devices_v1beta1_Activation_Response_descriptor =
      internal_static_services_devices_v1beta1_Activation_descriptor.getNestedTypes().get(1);
    internal_static_services_devices_v1beta1_Activation_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_devices_v1beta1_Activation_Response_descriptor,
        new java.lang.String[] { "Active", "Error", "Manifest", });
    internal_static_services_devices_v1beta1_Activation_Operation_descriptor =
      internal_static_services_devices_v1beta1_Activation_descriptor.getNestedTypes().get(2);
    internal_static_services_devices_v1beta1_Activation_Operation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_devices_v1beta1_Activation_Operation_descriptor,
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
