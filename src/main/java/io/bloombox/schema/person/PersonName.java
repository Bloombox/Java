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
// source: person/PersonName.proto

package io.bloombox.schema.person;

public final class PersonName {
  private PersonName() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_person_Name_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_person_Name_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027person/PersonName.proto\022\006person\032\016bq_fi" +
      "eld.proto\"\326\002\n\004Name\022N\n\tfull_name\030\001 \001(\tB;\212" +
      "@8Person\'s full name, if a fulltext valu" +
      "e should override.\0226\n\nfirst_name\030\002 \001(\tB\"" +
      "\212@\037Person\'s given, or first, name.\0225\n\tla" +
      "st_name\030\003 \001(\tB\"\212@\037Person\'s family, or la" +
      "st, name.\022-\n\013middle_name\030\004 \001(\tB\030\212@\025Perso" +
      "n\'s middle name.\022.\n\006prefix\030\005 \001(\tB\036\212@\033Pre" +
      "fix for a person\'s name.\0220\n\007postfix\030\006 \001(" +
      "\tB\037\212@\034Postfix for a person\'s name.B\037\n\031io",
      ".bloombox.schema.personH\001P\001b\006proto3"
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
        }, assigner);
    internal_static_person_Name_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_person_Name_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_person_Name_descriptor,
        new java.lang.String[] { "FullName", "FirstName", "LastName", "MiddleName", "Prefix", "Postfix", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(gen_bq_schema.BqField.description);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    gen_bq_schema.BqField.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
