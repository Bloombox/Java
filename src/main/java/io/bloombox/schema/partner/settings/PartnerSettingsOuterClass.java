// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: partner/settings/PartnerSettings.proto

package io.bloombox.schema.partner.settings;

public final class PartnerSettingsOuterClass {
  private PartnerSettingsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_partner_settings_PartnerNotificationTarget_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_partner_settings_PartnerNotificationTarget_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_partner_settings_PartnerEventAlertingSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_partner_settings_PartnerEventAlertingSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_partner_settings_PartnerAlertSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_partner_settings_PartnerAlertSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_partner_settings_BetaSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_partner_settings_BetaSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_partner_settings_FeatureStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_partner_settings_FeatureStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_partner_settings_SearchSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_partner_settings_SearchSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_partner_settings_PartnerSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_partner_settings_PartnerSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&partner/settings/PartnerSettings.proto" +
      "\022 bloombox.schema.partner.settings\032\031cont" +
      "act/PhoneNumber.proto\032\032contact/EmailAddr" +
      "ess.proto\032.partner/integrations/Integrat" +
      "ionSettings.proto\"\241\001\n\031PartnerNotificatio" +
      "nTarget\022\020\n\010disabled\030\001 \001(\010\0222\n\005phone\030\n \001(\013" +
      "2!.opencannabis.contact.PhoneNumberH\000\0223\n" +
      "\005email\030\013 \001(\0132\".opencannabis.contact.Emai" +
      "lAddressH\000B\t\n\007contact\"O\n\034PartnerEventAle" +
      "rtingSettings\022\r\n\005promo\030\001 \001(\010\022\020\n\010security" +
      "\030\002 \001(\010\022\016\n\006volume\030\003 \001(\010\"\267\001\n\024PartnerAlertS" +
      "ettings\022N\n\006events\030\001 \001(\0132>.bloombox.schem" +
      "a.partner.settings.PartnerEventAlertingS" +
      "ettings\022O\n\nrecipients\030\002 \003(\0132;.bloombox.s" +
      "chema.partner.settings.PartnerNotificati" +
      "onTarget\"/\n\014BetaSettings\022\016\n\006enable\030\001 \001(\010" +
      "\022\017\n\007sandbox\030\002 \001(\010\"`\n\rFeatureStatus\022\021\n\tan" +
      "alytics\030\001 \001(\010\022\014\n\004beta\030\002 \001(\010\022\017\n\007offline\030\003" +
      " \001(\010\022\014\n\004shop\030\004 \001(\010\022\017\n\007checkin\030\005 \001(\010\"0\n\016S" +
      "earchSettings\022\017\n\007enabled\030\001 \001(\010\022\r\n\005media\030" +
      "\002 \001(\010\"\360\002\n\017PartnerSettings\022F\n\006alerts\030\001 \001(" +
      "\01326.bloombox.schema.partner.settings.Par" +
      "tnerAlertSettings\022<\n\004beta\030\002 \001(\0132..bloomb" +
      "ox.schema.partner.settings.BetaSettings\022" +
      "A\n\010features\030\003 \001(\0132/.bloombox.schema.part" +
      "ner.settings.FeatureStatus\022@\n\006search\030\004 \001" +
      "(\01320.bloombox.schema.partner.settings.Se" +
      "archSettings\022R\n\010partners\030\007 \001(\0132@.bloombo" +
      "x.schema.partner.integrations.PartnerInt" +
      "egrationSettingsB/\n#io.bloombox.schema.p" +
      "artner.settingsH\001P\001\242\002\003BBSb\006proto3"
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
          io.opencannabis.schema.contact.PhoneNumberOuterClass.getDescriptor(),
          io.opencannabis.schema.contact.EmailAddressOuterClass.getDescriptor(),
          io.bloombox.schema.partner.integrations.IntegrationSettings.getDescriptor(),
        }, assigner);
    internal_static_bloombox_schema_partner_settings_PartnerNotificationTarget_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bloombox_schema_partner_settings_PartnerNotificationTarget_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_partner_settings_PartnerNotificationTarget_descriptor,
        new java.lang.String[] { "Disabled", "Phone", "Email", "Contact", });
    internal_static_bloombox_schema_partner_settings_PartnerEventAlertingSettings_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_bloombox_schema_partner_settings_PartnerEventAlertingSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_partner_settings_PartnerEventAlertingSettings_descriptor,
        new java.lang.String[] { "Promo", "Security", "Volume", });
    internal_static_bloombox_schema_partner_settings_PartnerAlertSettings_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_bloombox_schema_partner_settings_PartnerAlertSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_partner_settings_PartnerAlertSettings_descriptor,
        new java.lang.String[] { "Events", "Recipients", });
    internal_static_bloombox_schema_partner_settings_BetaSettings_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_bloombox_schema_partner_settings_BetaSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_partner_settings_BetaSettings_descriptor,
        new java.lang.String[] { "Enable", "Sandbox", });
    internal_static_bloombox_schema_partner_settings_FeatureStatus_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_bloombox_schema_partner_settings_FeatureStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_partner_settings_FeatureStatus_descriptor,
        new java.lang.String[] { "Analytics", "Beta", "Offline", "Shop", "Checkin", });
    internal_static_bloombox_schema_partner_settings_SearchSettings_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_bloombox_schema_partner_settings_SearchSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_partner_settings_SearchSettings_descriptor,
        new java.lang.String[] { "Enabled", "Media", });
    internal_static_bloombox_schema_partner_settings_PartnerSettings_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_bloombox_schema_partner_settings_PartnerSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_partner_settings_PartnerSettings_descriptor,
        new java.lang.String[] { "Alerts", "Beta", "Features", "Search", "Partners", });
    io.opencannabis.schema.contact.PhoneNumberOuterClass.getDescriptor();
    io.opencannabis.schema.contact.EmailAddressOuterClass.getDescriptor();
    io.bloombox.schema.partner.integrations.IntegrationSettings.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
