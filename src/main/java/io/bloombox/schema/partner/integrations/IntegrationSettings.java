// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: partner/integrations/IntegrationSettings.proto

package io.bloombox.schema.partner.integrations;

public final class IntegrationSettings {
  private IntegrationSettings() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_partner_integrations_GenericIntegrationSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_partner_integrations_GenericIntegrationSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_partner_integrations_LocationIntegrationSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_partner_integrations_LocationIntegrationSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_partner_integrations_LocationIntegrationSettings_GenericEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_partner_integrations_LocationIntegrationSettings_GenericEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_partner_integrations_PartnerIntegrationSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_partner_integrations_PartnerIntegrationSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.partner/integrations/IntegrationSettin" +
      "gs.proto\022$bloombox.schema.partner.integr" +
      "ations\032\026temporal/Instant.proto\032,partner/" +
      "integrations/GreenbitsSettings.proto\"\302\001\n" +
      "\032GenericIntegrationSettings\022I\n\007partner\030\001" +
      " \001(\01628.bloombox.schema.partner.integrati" +
      "ons.IntegrationPartner\022\017\n\007enabled\030\002 \001(\010\022" +
      "\023\n\013fully_setup\030\003 \001(\010\0223\n\013last_tested\030\004 \001(" +
      "\0132\036.opencannabis.temporal.Instant\"\226\003\n\033Lo" +
      "cationIntegrationSettings\022N\n\014integration" +
      "s\030\001 \003(\01628.bloombox.schema.partner.integr" +
      "ations.IntegrationPartner\022_\n\007generic\030\002 \003" +
      "(\0132N.bloombox.schema.partner.integration" +
      "s.LocationIntegrationSettings.GenericEnt" +
      "ry\022T\n\tgreenbits\030\n \001(\0132A.bloombox.schema." +
      "partner.integrations.greenbits.Greenbits" +
      "Settings\032p\n\014GenericEntry\022\013\n\003key\030\001 \001(\t\022O\n" +
      "\005value\030\002 \001(\0132@.bloombox.schema.partner.i" +
      "ntegrations.GenericIntegrationSettings:\002" +
      "8\001\"\034\n\032PartnerIntegrationSettings*|\n\022Inte" +
      "grationPartner\022\014\n\010INTERNAL\020\000\022\013\n\007SALSIFY\020" +
      "\001\022\010\n\004KEEN\020\002\022\r\n\tGREENBITS\020\003\022\r\n\tMAILCHIMP\020" +
      "\004\022\n\n\006TWILIO\020\005\022\013\n\007ONFLEET\020\006\022\n\n\006GSUITE\020\007B3" +
      "\n\'io.bloombox.schema.partner.integration" +
      "sH\001P\001\242\002\003BBSb\006proto3"
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
          io.opencannabis.schema.temporal.InstantOuterClass.getDescriptor(),
          io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettingsOuterClass.getDescriptor(),
        }, assigner);
    internal_static_bloombox_schema_partner_integrations_GenericIntegrationSettings_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bloombox_schema_partner_integrations_GenericIntegrationSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_partner_integrations_GenericIntegrationSettings_descriptor,
        new java.lang.String[] { "Partner", "Enabled", "FullySetup", "LastTested", });
    internal_static_bloombox_schema_partner_integrations_LocationIntegrationSettings_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_bloombox_schema_partner_integrations_LocationIntegrationSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_partner_integrations_LocationIntegrationSettings_descriptor,
        new java.lang.String[] { "Integrations", "Generic", "Greenbits", });
    internal_static_bloombox_schema_partner_integrations_LocationIntegrationSettings_GenericEntry_descriptor =
      internal_static_bloombox_schema_partner_integrations_LocationIntegrationSettings_descriptor.getNestedTypes().get(0);
    internal_static_bloombox_schema_partner_integrations_LocationIntegrationSettings_GenericEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_partner_integrations_LocationIntegrationSettings_GenericEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_bloombox_schema_partner_integrations_PartnerIntegrationSettings_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_bloombox_schema_partner_integrations_PartnerIntegrationSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_partner_integrations_PartnerIntegrationSettings_descriptor,
        new java.lang.String[] { });
    io.opencannabis.schema.temporal.InstantOuterClass.getDescriptor();
    io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettingsOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
