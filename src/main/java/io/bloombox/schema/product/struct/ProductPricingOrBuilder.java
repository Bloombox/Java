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

package io.bloombox.schema.product.struct;

public interface ProductPricingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:structs.pricing.ProductPricing)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .structs.pricing.SaleDescriptor discounts = 1;</code>
   */
  java.util.List<io.bloombox.schema.product.struct.SaleDescriptor> 
      getDiscountsList();
  /**
   * <code>repeated .structs.pricing.SaleDescriptor discounts = 1;</code>
   */
  io.bloombox.schema.product.struct.SaleDescriptor getDiscounts(int index);
  /**
   * <code>repeated .structs.pricing.SaleDescriptor discounts = 1;</code>
   */
  int getDiscountsCount();
  /**
   * <code>repeated .structs.pricing.SaleDescriptor discounts = 1;</code>
   */
  java.util.List<? extends io.bloombox.schema.product.struct.SaleDescriptorOrBuilder> 
      getDiscountsOrBuilderList();
  /**
   * <code>repeated .structs.pricing.SaleDescriptor discounts = 1;</code>
   */
  io.bloombox.schema.product.struct.SaleDescriptorOrBuilder getDiscountsOrBuilder(
      int index);

  /**
   * <code>repeated .structs.pricing.PricingDescriptor manifest = 2;</code>
   */
  java.util.List<io.bloombox.schema.product.struct.PricingDescriptor> 
      getManifestList();
  /**
   * <code>repeated .structs.pricing.PricingDescriptor manifest = 2;</code>
   */
  io.bloombox.schema.product.struct.PricingDescriptor getManifest(int index);
  /**
   * <code>repeated .structs.pricing.PricingDescriptor manifest = 2;</code>
   */
  int getManifestCount();
  /**
   * <code>repeated .structs.pricing.PricingDescriptor manifest = 2;</code>
   */
  java.util.List<? extends io.bloombox.schema.product.struct.PricingDescriptorOrBuilder> 
      getManifestOrBuilderList();
  /**
   * <code>repeated .structs.pricing.PricingDescriptor manifest = 2;</code>
   */
  io.bloombox.schema.product.struct.PricingDescriptorOrBuilder getManifestOrBuilder(
      int index);
}
