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
// source: structs/Genetics.proto

package io.bloombox.schema.product.struct;

public final class GeneticsStructs {
  private GeneticsStructs() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_structs_Genetics_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_structs_Genetics_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026structs/Genetics.proto\022\007structs\032\022conte" +
      "nt/Name.proto\032\025base/ProductKey.proto\"X\n\010" +
      "Genetics\022$\n\004male\030\001 \001(\0132\026.base.ProductRef" +
      "erence\022&\n\006female\030\002 \001(\0132\026.base.ProductRef" +
      "erenceB;\n!io.bloombox.schema.product.str" +
      "uctB\017GeneticsStructsH\001P\001\370\001\001b\006proto3"
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
          io.bloombox.schema.content.NameContent.getDescriptor(),
          io.bloombox.schema.base.BaseProductKey.getDescriptor(),
        }, assigner);
    internal_static_structs_Genetics_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_structs_Genetics_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_structs_Genetics_descriptor,
        new java.lang.String[] { "Male", "Female", });
    io.bloombox.schema.content.NameContent.getDescriptor();
    io.bloombox.schema.base.BaseProductKey.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
