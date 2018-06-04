// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: security/access/PartnerPermissions.proto

package io.bloombox.schema.security.access;

public final class PartnerPermissions {
  private PartnerPermissions() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_security_access_PartnerAccess_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_security_access_PartnerAccess_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_security_access_LocationAccess_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_security_access_LocationAccess_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(security/access/PartnerPermissions.pro" +
      "to\022\037bloombox.schema.security.access\032\026tem" +
      "poral/Instant.proto\"\231\002\n\rPartnerAccess\022\016\n" +
      "\006active\030\001 \001(\010\022\022\n\ngranted_by\030\002 \001(\t\0222\n\ngra" +
      "nted_at\030\003 \001(\0132\036.opencannabis.temporal.In" +
      "stant\022F\n\nprivileges\030\004 \003(\01622.bloombox.sch" +
      "ema.security.access.PartnerPermission\022B\n" +
      "\tlocations\030\005 \003(\0132/.bloombox.schema.secur" +
      "ity.access.LocationAccess\022\025\n\rall_locatio" +
      "ns\030\006 \001(\010\022\r\n\005admin\030d \001(\010\"w\n\016LocationAcces" +
      "s\022\016\n\006active\030\001 \001(\010\022\022\n\ngranted_by\030\002 \001(\t\0222\n" +
      "\ngranted_at\030\003 \001(\0132\036.opencannabis.tempora" +
      "l.Instant\022\r\n\005admin\030d \001(\010*T\n\021PartnerPermi" +
      "ssion\022\t\n\005OWNER\020\000\022\016\n\nSUPERVISOR\020\001\022\013\n\007BILL" +
      "ING\020\002\022\t\n\005AUDIT\020\003\022\014\n\010READONLY\020\004B.\n\"io.blo" +
      "ombox.schema.security.accessH\001P\001\242\002\003BBSb\006" +
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
          io.opencannabis.schema.temporal.TemporalInstant.getDescriptor(),
        }, assigner);
    internal_static_bloombox_schema_security_access_PartnerAccess_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bloombox_schema_security_access_PartnerAccess_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_security_access_PartnerAccess_descriptor,
        new java.lang.String[] { "Active", "GrantedBy", "GrantedAt", "Privileges", "Locations", "AllLocations", "Admin", });
    internal_static_bloombox_schema_security_access_LocationAccess_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_bloombox_schema_security_access_LocationAccess_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_security_access_LocationAccess_descriptor,
        new java.lang.String[] { "Active", "GrantedBy", "GrantedAt", "Admin", });
    io.opencannabis.schema.temporal.TemporalInstant.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
