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
// source: content/ProductContent.proto

package io.bloombox.schema.content;

public final class AttachedContent {
  private AttachedContent() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_content_ProductTimestamps_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_content_ProductTimestamps_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_content_ProductContent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_content_ProductContent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034content/ProductContent.proto\022\007content\032" +
      "\022content/Name.proto\032\025content/Content.pro" +
      "to\032\023content/Brand.proto\032\026temporal/Instan" +
      "t.proto\032\025media/MediaItem.proto\032\032structs/" +
      "ProductFlags.proto\032$structs/labtesting/T" +
      "estResults.proto\032\'structs/pricing/Pricin" +
      "gDescriptor.proto\"\202\001\n\021ProductTimestamps\022" +
      "\"\n\007created\030\001 \001(\0132\021.temporal.Instant\022#\n\010m" +
      "odified\030\002 \001(\0132\021.temporal.Instant\022$\n\tpubl" +
      "ished\030\003 \001(\0132\021.temporal.Instant\"\204\003\n\016Produ" +
      "ctContent\022\033\n\004name\030\001 \001(\0132\r.content.Name\022\035" +
      "\n\005brand\030\002 \001(\0132\016.content.Brand\022!\n\007summary" +
      "\030\003 \001(\0132\020.content.Content\022\037\n\005usage\030\004 \001(\0132" +
      "\020.content.Content\022 \n\006dosage\030\005 \001(\0132\020.cont" +
      "ent.Content\022\037\n\005media\030\006 \003(\0132\020.media.Media" +
      "Item\0220\n\007pricing\030\007 \001(\0132\037.structs.pricing." +
      "ProductPricing\0220\n\007testing\030\010 \001(\0132\037.struct" +
      "s.labtesting.TestResults\022#\n\005flags\030\t \003(\0162" +
      "\024.structs.ProductFlag\022&\n\002ts\030\n \001(\0132\032.cont" +
      "ent.ProductTimestampsB4\n\032io.bloombox.sch" +
      "ema.contentB\017AttachedContentH\001P\001\370\001\001b\006pro" +
      "to3"
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
          io.bloombox.schema.content.GenericContent.getDescriptor(),
          io.bloombox.schema.content.BrandContent.getDescriptor(),
          io.bloombox.schema.temporal.InstantOuterClass.getDescriptor(),
          io.bloombox.schema.media.AttachedMedia.getDescriptor(),
          io.bloombox.schema.product.struct.BaseStructs.getDescriptor(),
          io.bloombox.schema.product.struct.testing.LabTesting.getDescriptor(),
          io.bloombox.schema.product.struct.ProductPricingSpec.getDescriptor(),
        }, assigner);
    internal_static_content_ProductTimestamps_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_content_ProductTimestamps_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_content_ProductTimestamps_descriptor,
        new java.lang.String[] { "Created", "Modified", "Published", });
    internal_static_content_ProductContent_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_content_ProductContent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_content_ProductContent_descriptor,
        new java.lang.String[] { "Name", "Brand", "Summary", "Usage", "Dosage", "Media", "Pricing", "Testing", "Flags", "Ts", });
    io.bloombox.schema.content.NameContent.getDescriptor();
    io.bloombox.schema.content.GenericContent.getDescriptor();
    io.bloombox.schema.content.BrandContent.getDescriptor();
    io.bloombox.schema.temporal.InstantOuterClass.getDescriptor();
    io.bloombox.schema.media.AttachedMedia.getDescriptor();
    io.bloombox.schema.product.struct.BaseStructs.getDescriptor();
    io.bloombox.schema.product.struct.testing.LabTesting.getDescriptor();
    io.bloombox.schema.product.struct.ProductPricingSpec.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
