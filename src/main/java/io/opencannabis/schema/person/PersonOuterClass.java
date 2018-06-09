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
// source: person/Person.proto

package io.opencannabis.schema.person;

public final class PersonOuterClass {
  private PersonOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_person_Person_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_person_Person_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023person/Person.proto\022\023opencannabis.pers" +
      "on\032\016bq_field.proto\032\023temporal/Date.proto\032" +
      "\031contact/ContactInfo.proto\032\027person/Perso" +
      "nName.proto\"\366\003\n\006Person\022N\n\004name\030\001 \001(\0132\031.o" +
      "pencannabis.person.NameB%\212@\"Person\'s pri" +
      "mary name information.\022m\n\nlegal_name\030\002 \001" +
      "(\0132\031.opencannabis.person.NameB>\212@;Person" +
      "\'s legal name, if it differs from their " +
      "primary name.\022W\n\016alternate_name\030\003 \001(\0132\031." +
      "opencannabis.person.NameB$\212@!Person\'s op" +
      "tional alternate name.\022T\n\007contact\030\004 \001(\0132" +
      "!.opencannabis.contact.ContactInfoB \212@\035P" +
      "erson\'s contact information.\022E\n\rdate_of_" +
      "birth\030\005 \001(\0132\033.opencannabis.temporal.Date" +
      "B\021\212@\016Date of birth.\0227\n\006gender\030\006 \001(\0162\033.op" +
      "encannabis.person.GenderB\n\212@\007Gender.*:\n\006" +
      "Gender\022\017\n\013UNSPECIFIED\020\000\022\010\n\004MALE\020\001\022\n\n\006FEM" +
      "ALE\020\002\022\t\n\005OTHER\020\003B)\n\035io.opencannabis.sche" +
      "ma.personH\001P\001\242\002\003OCSb\006proto3"
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
          gen_bq_schema.BqField.getDescriptor(),
          io.opencannabis.schema.temporal.TemporalDate.getDescriptor(),
          io.opencannabis.schema.contact.GenericContact.getDescriptor(),
          io.opencannabis.schema.person.PersonName.getDescriptor(),
        }, assigner);
    internal_static_opencannabis_person_Person_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opencannabis_person_Person_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_person_Person_descriptor,
        new java.lang.String[] { "Name", "LegalName", "AlternateName", "Contact", "DateOfBirth", "Gender", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(gen_bq_schema.BqField.description);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    gen_bq_schema.BqField.getDescriptor();
    io.opencannabis.schema.temporal.TemporalDate.getDescriptor();
    io.opencannabis.schema.contact.GenericContact.getDescriptor();
    io.opencannabis.schema.person.PersonName.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
