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
// source: partner/integrations/MailchimpSettings.proto

package io.bloombox.schema.partner.integrations.mailchimp;

public final class MailchimpSettingsOuterClass {
  private MailchimpSettingsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_partner_integrations_mailchimp_MailchimpIntegrationFeatures_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_partner_integrations_mailchimp_MailchimpIntegrationFeatures_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_partner_integrations_mailchimp_MailchimpLists_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_partner_integrations_mailchimp_MailchimpLists_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_partner_integrations_mailchimp_MailchimpSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_partner_integrations_mailchimp_MailchimpSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,partner/integrations/MailchimpSettings" +
      ".proto\022.bloombox.schema.partner.integrat" +
      "ions.mailchimp\"S\n\034MailchimpIntegrationFe" +
      "atures\022\017\n\007signups\030\001 \001(\010\022\020\n\010segments\030\002 \001(" +
      "\010\022\020\n\010ordering\030\003 \001(\010\"2\n\016MailchimpLists\022\r\n" +
      "\005comms\030\001 \001(\t\022\021\n\tmarketing\030\002 \001(\t\"\323\001\n\021Mail" +
      "chimpSettings\022\017\n\007api_key\030\001 \001(\t\022^\n\010featur" +
      "es\030\n \001(\0132L.bloombox.schema.partner.integ" +
      "rations.mailchimp.MailchimpIntegrationFe" +
      "atures\022M\n\005lists\030\013 \001(\0132>.bloombox.schema." +
      "partner.integrations.mailchimp.Mailchimp" +
      "ListsB=\n1io.bloombox.schema.partner.inte" +
      "grations.mailchimpH\001P\001\242\002\003BBSb\006proto3"
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
    internal_static_bloombox_schema_partner_integrations_mailchimp_MailchimpIntegrationFeatures_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bloombox_schema_partner_integrations_mailchimp_MailchimpIntegrationFeatures_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_partner_integrations_mailchimp_MailchimpIntegrationFeatures_descriptor,
        new java.lang.String[] { "Signups", "Segments", "Ordering", });
    internal_static_bloombox_schema_partner_integrations_mailchimp_MailchimpLists_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_bloombox_schema_partner_integrations_mailchimp_MailchimpLists_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_partner_integrations_mailchimp_MailchimpLists_descriptor,
        new java.lang.String[] { "Comms", "Marketing", });
    internal_static_bloombox_schema_partner_integrations_mailchimp_MailchimpSettings_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_bloombox_schema_partner_integrations_mailchimp_MailchimpSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_partner_integrations_mailchimp_MailchimpSettings_descriptor,
        new java.lang.String[] { "ApiKey", "Features", "Lists", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
