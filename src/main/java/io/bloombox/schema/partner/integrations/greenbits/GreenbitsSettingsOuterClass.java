// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: partner/integrations/GreenbitsSettings.proto

package io.bloombox.schema.partner.integrations.greenbits;

public final class GreenbitsSettingsOuterClass {
  private GreenbitsSettingsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_partner_integrations_greenbits_GreenbitsIntegrationFeatures_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_partner_integrations_greenbits_GreenbitsIntegrationFeatures_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_partner_integrations_greenbits_GreenbitsSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_partner_integrations_greenbits_GreenbitsSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,partner/integrations/GreenbitsSettings" +
      ".proto\022.bloombox.schema.partner.integrat" +
      "ions.greenbits\"B\n\034GreenbitsIntegrationFe" +
      "atures\022\021\n\tcustomers\030\001 \001(\010\022\017\n\007checkin\030\002 \001" +
      "(\010\"\256\001\n\021GreenbitsSettings\022\024\n\014organization" +
      "\030\001 \001(\t\022\017\n\007api_key\030\002 \001(\t\022\022\n\nauth_token\030\003 " +
      "\001(\t\022^\n\010features\030\n \001(\0132L.bloombox.schema." +
      "partner.integrations.greenbits.Greenbits" +
      "IntegrationFeaturesB=\n1io.bloombox.schem" +
      "a.partner.integrations.greenbitsH\001P\001\242\002\003B" +
      "BSb\006proto3"
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
        }, assigner);
    internal_static_bloombox_schema_partner_integrations_greenbits_GreenbitsIntegrationFeatures_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bloombox_schema_partner_integrations_greenbits_GreenbitsIntegrationFeatures_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_partner_integrations_greenbits_GreenbitsIntegrationFeatures_descriptor,
        new java.lang.String[] { "Customers", "Checkin", });
    internal_static_bloombox_schema_partner_integrations_greenbits_GreenbitsSettings_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_bloombox_schema_partner_integrations_greenbits_GreenbitsSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_partner_integrations_greenbits_GreenbitsSettings_descriptor,
        new java.lang.String[] { "Organization", "ApiKey", "AuthToken", "Features", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
