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
// source: structs/pricing/SaleDescriptor.proto

package io.opencannabis.schema.product.struct;

public final class ProductDiscount {
  private ProductDiscount() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_structs_pricing_PercentageDiscount_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_structs_pricing_PercentageDiscount_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_structs_pricing_BOGODiscount_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_structs_pricing_BOGODiscount_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_structs_pricing_LoyaltyDiscount_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_structs_pricing_LoyaltyDiscount_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_structs_pricing_SaleDescriptor_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_structs_pricing_SaleDescriptor_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$structs/pricing/SaleDescriptor.proto\022\034" +
      "opencannabis.structs.pricing\032\026temporal/I" +
      "nstant.proto\"&\n\022PercentageDiscount\022\020\n\010di" +
      "scount\030\024 \001(\r\"/\n\014BOGODiscount\022\017\n\007trigger\030" +
      "\025 \001(\r\022\016\n\006reward\030\026 \001(\r\"2\n\017LoyaltyDiscount" +
      "\022\017\n\007trigger\030\027 \001(\r\022\016\n\006reward\030\030 \001(\r\"\377\002\n\016Sa" +
      "leDescriptor\0224\n\004type\030\001 \001(\0162&.opencannabi" +
      "s.structs.pricing.SaleType\0221\n\teffective\030" +
      "\002 \001(\0132\036.opencannabis.temporal.Instant\0222\n" +
      "\nexpiration\030\003 \001(\0132\036.opencannabis.tempora" +
      "l.Instant\022J\n\016percentage_off\030\004 \001(\01320.open" +
      "cannabis.structs.pricing.PercentageDisco" +
      "untH\000\022:\n\004bogo\030\005 \001(\0132*.opencannabis.struc" +
      "ts.pricing.BOGODiscountH\000\022@\n\007loyalty\030\006 \001" +
      "(\0132-.opencannabis.structs.pricing.Loyalt" +
      "yDiscountH\000B\006\n\004sale*P\n\010SaleType\022\030\n\024PERCE" +
      "NTAGE_REDUCTION\020\000\022\023\n\017VALUE_REDUCTION\020\001\022\010" +
      "\n\004BOGO\020\002\022\013\n\007LOYALTY\020\003BB\n%io.opencannabis" +
      ".schema.product.structB\017ProductDiscountH" +
      "\001P\001\242\002\003OCSb\006proto3"
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
          io.opencannabis.schema.temporal.InstantOuterClass.getDescriptor(),
        }, assigner);
    internal_static_opencannabis_structs_pricing_PercentageDiscount_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opencannabis_structs_pricing_PercentageDiscount_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_structs_pricing_PercentageDiscount_descriptor,
        new java.lang.String[] { "Discount", });
    internal_static_opencannabis_structs_pricing_BOGODiscount_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opencannabis_structs_pricing_BOGODiscount_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_structs_pricing_BOGODiscount_descriptor,
        new java.lang.String[] { "Trigger", "Reward", });
    internal_static_opencannabis_structs_pricing_LoyaltyDiscount_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_opencannabis_structs_pricing_LoyaltyDiscount_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_structs_pricing_LoyaltyDiscount_descriptor,
        new java.lang.String[] { "Trigger", "Reward", });
    internal_static_opencannabis_structs_pricing_SaleDescriptor_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_opencannabis_structs_pricing_SaleDescriptor_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_structs_pricing_SaleDescriptor_descriptor,
        new java.lang.String[] { "Type", "Effective", "Expiration", "PercentageOff", "Bogo", "Loyalty", "Sale", });
    io.opencannabis.schema.temporal.InstantOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
