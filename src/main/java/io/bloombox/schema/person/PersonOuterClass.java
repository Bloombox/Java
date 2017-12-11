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
// source: person/Person.proto

package io.bloombox.schema.person;

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
    internal_static_person_Person_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_person_Person_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023person/Person.proto\022\006person\032\016bq_field." +
      "proto\032\023temporal/Date.proto\032\031contact/Cont" +
      "actInfo.proto\032\027person/PersonName.proto\"\374" +
      "\002\n\006Person\022A\n\004name\030\001 \001(\0132\014.person.NameB%\212" +
      "@\"Person\'s primary name information.\022`\n\n" +
      "legal_name\030\002 \001(\0132\014.person.NameB>\212@;Perso" +
      "n\'s legal name, if it differs from their" +
      " primary name.\022J\n\016alternate_name\030\003 \001(\0132\014" +
      ".person.NameB$\212@!Person\'s optional alter" +
      "nate name.\022G\n\007contact\030\004 \001(\0132\024.contact.Co",
      "ntactInfoB \212@\035Person\'s contact informati" +
      "on.\0228\n\rdate_of_birth\030\005 \001(\0132\016.temporal.Da" +
      "teB\021\212@\016Date of birth.B\037\n\031io.bloombox.sch" +
      "ema.personH\001P\001b\006proto3"
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
          io.bloombox.schema.temporal.DateOuterClass.getDescriptor(),
          io.bloombox.schema.contact.ContactInfoOuterClass.getDescriptor(),
          io.bloombox.schema.person.PersonName.getDescriptor(),
        }, assigner);
    internal_static_person_Person_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_person_Person_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_person_Person_descriptor,
        new java.lang.String[] { "Name", "LegalName", "AlternateName", "Contact", "DateOfBirth", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(gen_bq_schema.BqField.description);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    gen_bq_schema.BqField.getDescriptor();
    io.bloombox.schema.temporal.DateOuterClass.getDescriptor();
    io.bloombox.schema.contact.ContactInfoOuterClass.getDescriptor();
    io.bloombox.schema.person.PersonName.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
