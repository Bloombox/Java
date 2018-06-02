/*
 * Copyright 2018, Bloombox, LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
      "ations\032\026temporal/Instant.proto\032(partner/" +
      "integrations/TreezSettings.proto\032)partne" +
      "r/integrations/TwilioSettings.proto\032*par" +
      "tner/integrations/OnFleetSettings.proto\032" +
      "+partner/integrations/SendgridSettings.p" +
      "roto\032,partner/integrations/MailchimpSett" +
      "ings.proto\032,partner/integrations/Greenbi" +
      "tsSettings.proto\"\302\001\n\032GenericIntegrationS" +
      "ettings\022I\n\007partner\030\001 \001(\01628.bloombox.sche" +
      "ma.partner.integrations.IntegrationPartn" +
      "er\022\017\n\007enabled\030\002 \001(\010\022\023\n\013fully_setup\030\003 \001(\010" +
      "\0223\n\013last_tested\030\004 \001(\0132\036.opencannabis.tem" +
      "poral.Instant\"\246\006\n\033LocationIntegrationSet" +
      "tings\022N\n\014integrations\030\001 \003(\01628.bloombox.s" +
      "chema.partner.integrations.IntegrationPa" +
      "rtner\022_\n\007generic\030\002 \003(\0132N.bloombox.schema" +
      ".partner.integrations.LocationIntegratio" +
      "nSettings.GenericEntry\022T\n\tgreenbits\030\n \001(" +
      "\0132A.bloombox.schema.partner.integrations" +
      ".greenbits.GreenbitsSettings\022T\n\tmailchim" +
      "p\030\013 \001(\0132A.bloombox.schema.partner.integr" +
      "ations.mailchimp.MailchimpSettings\022Q\n\010se" +
      "ndgrid\030\014 \001(\0132?.bloombox.schema.partner.i" +
      "ntegrations.sendgrid.SendgridSettings\022K\n" +
      "\006twilio\030\r \001(\0132;.bloombox.schema.partner." +
      "integrations.twilio.TwilioSettings\022N\n\007on" +
      "fleet\030\016 \001(\0132=.bloombox.schema.partner.in" +
      "tegrations.onfleet.OnFleetSettings\022H\n\005tr" +
      "eez\030\017 \001(\01329.bloombox.schema.partner.inte" +
      "grations.treez.TreezSettings\032p\n\014GenericE" +
      "ntry\022\013\n\003key\030\001 \001(\t\022O\n\005value\030\002 \001(\0132@.bloom" +
      "box.schema.partner.integrations.GenericI" +
      "ntegrationSettings:\0028\001\"\034\n\032PartnerIntegra" +
      "tionSettings*\225\001\n\022IntegrationPartner\022\014\n\010I" +
      "NTERNAL\020\000\022\013\n\007SALSIFY\020\001\022\010\n\004KEEN\020\002\022\r\n\tGREE" +
      "NBITS\020\003\022\r\n\tMAILCHIMP\020\004\022\014\n\010SENDGRID\020\005\022\n\n\006" +
      "TWILIO\020\006\022\013\n\007ONFLEET\020\007\022\n\n\006GSUITE\020\010\022\t\n\005TRE" +
      "EZ\020\tB3\n\'io.bloombox.schema.partner.integ" +
      "rationsH\001P\001\242\002\003BBSb\006proto3"
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
          io.bloombox.schema.partner.integrations.treez.TreezSettingsOuterClass.getDescriptor(),
          io.bloombox.schema.partner.integrations.twilio.TwilioSettingsOuterClass.getDescriptor(),
          io.bloombox.schema.partner.integrations.onfleet.OnFleetSettingsOuterClass.getDescriptor(),
          io.bloombox.schema.partner.integrations.sendgrid.SendgridSettingsOuterClass.getDescriptor(),
          io.bloombox.schema.partner.integrations.mailchimp.MailchimpSettingsOuterClass.getDescriptor(),
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
        new java.lang.String[] { "Integrations", "Generic", "Greenbits", "Mailchimp", "Sendgrid", "Twilio", "Onfleet", "Treez", });
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
    io.bloombox.schema.partner.integrations.treez.TreezSettingsOuterClass.getDescriptor();
    io.bloombox.schema.partner.integrations.twilio.TwilioSettingsOuterClass.getDescriptor();
    io.bloombox.schema.partner.integrations.onfleet.OnFleetSettingsOuterClass.getDescriptor();
    io.bloombox.schema.partner.integrations.sendgrid.SendgridSettingsOuterClass.getDescriptor();
    io.bloombox.schema.partner.integrations.mailchimp.MailchimpSettingsOuterClass.getDescriptor();
    io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettingsOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
