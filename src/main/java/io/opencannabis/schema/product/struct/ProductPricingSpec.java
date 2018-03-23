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
// source: structs/pricing/PricingDescriptor.proto

package io.opencannabis.schema.product.struct;

public final class ProductPricingSpec {
  private ProductPricingSpec() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_structs_pricing_PricingTierAvailability_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_structs_pricing_PricingTierAvailability_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_structs_pricing_UnitPricingDescriptor_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_structs_pricing_UnitPricingDescriptor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_structs_pricing_WeightedPricingDescriptor_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_structs_pricing_WeightedPricingDescriptor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_structs_pricing_PricingDescriptor_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_structs_pricing_PricingDescriptor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_structs_pricing_ProductPricing_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_structs_pricing_ProductPricing_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'structs/pricing/PricingDescriptor.prot" +
      "o\022\034opencannabis.structs.pricing\032\027commerc" +
      "e/Currency.proto\032$structs/pricing/SaleDe" +
      "scriptor.proto\"=\n\027PricingTierAvailabilit" +
      "y\022\017\n\007offered\030\001 \001(\010\022\021\n\tavailable\030\002 \001(\010\"\324\001" +
      "\n\025UnitPricingDescriptor\0223\n\005price\030\001 \001(\0132$" +
      ".opencannabis.commerce.CurrencyValue\022E\n\006" +
      "status\030\002 \001(\01325.opencannabis.structs.pric" +
      "ing.PricingTierAvailability\022?\n\tdiscounts" +
      "\030\003 \003(\0132,.opencannabis.structs.pricing.Sa" +
      "leDescriptor\"\270\001\n\031WeightedPricingDescript" +
      "or\022?\n\006weight\030\001 \001(\0162/.opencannabis.struct" +
      "s.pricing.PricingWeightTier\022A\n\004tier\030\002 \001(" +
      "\01323.opencannabis.structs.pricing.UnitPri" +
      "cingDescriptor\022\027\n\017weight_in_grams\030\003 \001(\002\"" +
      "\346\001\n\021PricingDescriptor\0227\n\004type\030\001 \001(\0162).op" +
      "encannabis.structs.pricing.PricingType\022C" +
      "\n\004unit\030\024 \001(\01323.opencannabis.structs.pric" +
      "ing.UnitPricingDescriptorH\000\022K\n\010weighted\030" +
      "\025 \001(\01327.opencannabis.structs.pricing.Wei" +
      "ghtedPricingDescriptorH\000B\006\n\004tier\"\224\001\n\016Pro" +
      "ductPricing\022?\n\tdiscounts\030\001 \003(\0132,.opencan" +
      "nabis.structs.pricing.SaleDescriptor\022A\n\010" +
      "manifest\030\002 \003(\0132/.opencannabis.structs.pr" +
      "icing.PricingDescriptor*%\n\013PricingType\022\010" +
      "\n\004UNIT\020\000\022\014\n\010WEIGHTED\020\001*\234\001\n\021PricingWeight" +
      "Tier\022\t\n\005OTHER\020\000\022\010\n\004GRAM\020\001\022\014\n\010HALFGRAM\020\002\022" +
      "\017\n\013QUARTERGRAM\020\003\022\007\n\003DUB\020\004\022\n\n\006EIGHTH\020\005\022\013\n" +
      "\007QUARTER\020\006\022\010\n\004HALF\020\007\022\t\n\005OUNCE\020\010\022\t\n\005POUND" +
      "\020\t\022\010\n\004KILO\020\n\022\007\n\003TON\020\013BE\n%io.opencannabis" +
      ".schema.product.structB\022ProductPricingSp" +
      "ecH\001P\001\242\002\003OCSb\006proto3"
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
          io.opencannabis.schema.currency.CommerceCurrency.getDescriptor(),
          io.opencannabis.schema.product.struct.ProductDiscount.getDescriptor(),
        }, assigner);
    internal_static_opencannabis_structs_pricing_PricingTierAvailability_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opencannabis_structs_pricing_PricingTierAvailability_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_structs_pricing_PricingTierAvailability_descriptor,
        new java.lang.String[] { "Offered", "Available", });
    internal_static_opencannabis_structs_pricing_UnitPricingDescriptor_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opencannabis_structs_pricing_UnitPricingDescriptor_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_structs_pricing_UnitPricingDescriptor_descriptor,
        new java.lang.String[] { "Price", "Status", "Discounts", });
    internal_static_opencannabis_structs_pricing_WeightedPricingDescriptor_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_opencannabis_structs_pricing_WeightedPricingDescriptor_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_structs_pricing_WeightedPricingDescriptor_descriptor,
        new java.lang.String[] { "Weight", "Tier", "WeightInGrams", });
    internal_static_opencannabis_structs_pricing_PricingDescriptor_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_opencannabis_structs_pricing_PricingDescriptor_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_structs_pricing_PricingDescriptor_descriptor,
        new java.lang.String[] { "Type", "Unit", "Weighted", "Tier", });
    internal_static_opencannabis_structs_pricing_ProductPricing_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_opencannabis_structs_pricing_ProductPricing_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_structs_pricing_ProductPricing_descriptor,
        new java.lang.String[] { "Discounts", "Manifest", });
    io.opencannabis.schema.currency.CommerceCurrency.getDescriptor();
    io.opencannabis.schema.product.struct.ProductDiscount.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
