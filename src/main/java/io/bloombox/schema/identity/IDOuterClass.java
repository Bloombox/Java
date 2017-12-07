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
// source: identity/ID.proto

package io.bloombox.schema.identity;

public final class IDOuterClass {
  private IDOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_identity_ID_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_identity_ID_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021identity/ID.proto\022\010identity\032\023temporal/" +
      "Date.proto\032\027identity/ids/USDL.proto\032\033ide" +
      "ntity/ids/Passport.proto\"\330\001\n\002ID\022\036\n\004type\030" +
      "\001 \001(\0162\020.identity.IDType\022\n\n\002id\030\002 \001(\t\022#\n\013e" +
      "xpire_date\030\003 \001(\0132\016.temporal.Date\022\"\n\nbirt" +
      "h_date\030\004 \001(\0132\016.temporal.Date\022%\n\007license\030" +
      "\024 \001(\0132\022.identity.ids.USDLH\000\022*\n\010passport\030" +
      "\025 \001(\0132\026.identity.ids.PassportH\000B\n\n\010docum" +
      "ent* \n\006IDType\022\010\n\004USDL\020\000\022\014\n\010PASSPORT\020\001B!\n" +
      "\033io.bloombox.schema.identityH\001P\001b\006proto3"
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
          io.bloombox.schema.temporal.DateOuterClass.getDescriptor(),
          io.bloombox.schema.identity.ids.USDLOuterClass.getDescriptor(),
          io.bloombox.schema.identity.ids.PassportOuterClass.getDescriptor(),
        }, assigner);
    internal_static_identity_ID_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_identity_ID_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_identity_ID_descriptor,
        new java.lang.String[] { "Type", "Id", "ExpireDate", "BirthDate", "License", "Passport", "Document", });
    io.bloombox.schema.temporal.DateOuterClass.getDescriptor();
    io.bloombox.schema.identity.ids.USDLOuterClass.getDescriptor();
    io.bloombox.schema.identity.ids.PassportOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
