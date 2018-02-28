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
// source: security/IdentityToken.proto

package io.bloombox.schema.security;

public final class IdentityTokenOuterClass {
  private IdentityTokenOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_security_IdentityToken_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_security_IdentityToken_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034security/IdentityToken.proto\022\030bloombox" +
      ".schema.security\"l\n\rIdentityToken\022\013\n\003uid" +
      "\030\001 \001(\t\022\017\n\007encoded\030\002 \001(\t\022=\n\006issuer\030\003 \001(\0162" +
      "-.bloombox.schema.security.IdentityToken" +
      "Issuer*<\n\023IdentityTokenIssuer\022\014\n\010INTERNA" +
      "L\020\000\022\014\n\010FIREBASE\020\001\022\t\n\005AUTH0\020\002B\'\n\033io.bloom" +
      "box.schema.securityH\001P\001\242\002\003BBSb\006proto3"
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
    internal_static_bloombox_schema_security_IdentityToken_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bloombox_schema_security_IdentityToken_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_security_IdentityToken_descriptor,
        new java.lang.String[] { "Uid", "Encoded", "Issuer", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
