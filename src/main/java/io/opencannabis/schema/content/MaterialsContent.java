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
// source: content/MaterialsData.proto

package io.opencannabis.schema.content;

public final class MaterialsContent {
  private MaterialsContent() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_content_MaterialsData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_content_MaterialsData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033content/MaterialsData.proto\022\024opencanna" +
      "bis.content\032\022structs/Grow.proto\032\023structs" +
      "/Shelf.proto\032\025structs/Species.proto\032\026str" +
      "ucts/Genetics.proto\032$structs/labtesting/" +
      "TestResults.proto\032/products/distribution" +
      "/DistributionChannel.proto\"\315\002\n\rMaterials" +
      "Data\022.\n\007species\030\001 \001(\0162\035.opencannabis.str" +
      "ucts.Species\0220\n\010genetics\030\002 \001(\0132\036.opencan" +
      "nabis.structs.Genetics\022(\n\004grow\030\003 \001(\0162\032.o" +
      "pencannabis.structs.Grow\022*\n\005shelf\030\004 \001(\0162" +
      "\033.opencannabis.structs.Shelf\022G\n\007channel\030" +
      "\005 \003(\01326.opencannabis.products.distributi" +
      "on.DistributionPolicy\022;\n\005tests\030\006 \001(\0132,.o" +
      "pencannabis.structs.labtesting.TestResul" +
      "tsB<\n\036io.opencannabis.schema.contentB\020Ma" +
      "terialsContentH\001P\001\242\002\003OCSb\006proto3"
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
          io.opencannabis.schema.product.struct.MaterialGrow.getDescriptor(),
          io.opencannabis.schema.product.struct.MaterialShelf.getDescriptor(),
          io.opencannabis.schema.product.struct.MaterialSpecies.getDescriptor(),
          io.opencannabis.schema.product.struct.GeneticsStructs.getDescriptor(),
          io.opencannabis.schema.product.struct.testing.LabTesting.getDescriptor(),
          io.opencannabis.schema.product.DistributionChannel.getDescriptor(),
        }, assigner);
    internal_static_opencannabis_content_MaterialsData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opencannabis_content_MaterialsData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_content_MaterialsData_descriptor,
        new java.lang.String[] { "Species", "Genetics", "Grow", "Shelf", "Channel", "Tests", });
    io.opencannabis.schema.product.struct.MaterialGrow.getDescriptor();
    io.opencannabis.schema.product.struct.MaterialShelf.getDescriptor();
    io.opencannabis.schema.product.struct.MaterialSpecies.getDescriptor();
    io.opencannabis.schema.product.struct.GeneticsStructs.getDescriptor();
    io.opencannabis.schema.product.struct.testing.LabTesting.getDescriptor();
    io.opencannabis.schema.product.DistributionChannel.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
