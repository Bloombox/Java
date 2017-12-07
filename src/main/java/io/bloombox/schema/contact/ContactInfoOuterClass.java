/*
 * Copyright 2017, Bloombox, LLC.
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
// source: contact/ContactInfo.proto

package io.bloombox.schema.contact;

public final class ContactInfoOuterClass {
  private ContactInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_contact_ContactInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_contact_ContactInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031contact/ContactInfo.proto\022\007contact\032\022ge" +
      "o/Location.proto\032\031contact/PhoneNumber.pr" +
      "oto\032\032contact/EmailAddress.proto\032\025contact" +
      "/Website.proto\"\234\001\n\013ContactInfo\022\037\n\010locati" +
      "on\030\001 \001(\0132\r.geo.Location\022#\n\005phone\030\002 \001(\0132\024" +
      ".contact.PhoneNumber\022$\n\005email\030\003 \001(\0132\025.co" +
      "ntact.EmailAddress\022!\n\007website\030\004 \001(\0132\020.co" +
      "ntact.WebsiteB \n\032io.bloombox.schema.cont" +
      "actH\001P\001b\006proto3"
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
          io.bloombox.schema.geo.LocationOuterClass.getDescriptor(),
          io.bloombox.schema.contact.PhoneNumberOuterClass.getDescriptor(),
          io.bloombox.schema.contact.EmailAddressOuterClass.getDescriptor(),
          io.bloombox.schema.contact.WebsiteOuterClass.getDescriptor(),
        }, assigner);
    internal_static_contact_ContactInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_contact_ContactInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_contact_ContactInfo_descriptor,
        new java.lang.String[] { "Location", "Phone", "Email", "Website", });
    io.bloombox.schema.geo.LocationOuterClass.getDescriptor();
    io.bloombox.schema.contact.PhoneNumberOuterClass.getDescriptor();
    io.bloombox.schema.contact.EmailAddressOuterClass.getDescriptor();
    io.bloombox.schema.contact.WebsiteOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
