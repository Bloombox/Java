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

public interface UnitPricingDescriptorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opencannabis.structs.pricing.UnitPricingDescriptor)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Unit price value.
   * </pre>
   *
   * <code>.opencannabis.commerce.CurrencyValue price = 1;</code>
   */
  boolean hasPrice();
  /**
   * <pre>
   * Unit price value.
   * </pre>
   *
   * <code>.opencannabis.commerce.CurrencyValue price = 1;</code>
   */
  io.opencannabis.schema.currency.CommerceCurrency.CurrencyValue getPrice();
  /**
   * <pre>
   * Unit price value.
   * </pre>
   *
   * <code>.opencannabis.commerce.CurrencyValue price = 1;</code>
   */
  io.opencannabis.schema.currency.CommerceCurrency.CurrencyValueOrBuilder getPriceOrBuilder();

  /**
   * <pre>
   * Availability flags for this unit-priced tier.
   * </pre>
   *
   * <code>.opencannabis.structs.pricing.PricingTierAvailability status = 2;</code>
   */
  boolean hasStatus();
  /**
   * <pre>
   * Availability flags for this unit-priced tier.
   * </pre>
   *
   * <code>.opencannabis.structs.pricing.PricingTierAvailability status = 2;</code>
   */
  io.opencannabis.schema.product.struct.PricingTierAvailability getStatus();
  /**
   * <pre>
   * Availability flags for this unit-priced tier.
   * </pre>
   *
   * <code>.opencannabis.structs.pricing.PricingTierAvailability status = 2;</code>
   */
  io.opencannabis.schema.product.struct.PricingTierAvailabilityOrBuilder getStatusOrBuilder();

  /**
   * <pre>
   * Discounts that should apply to this tier.
   * </pre>
   *
   * <code>repeated .opencannabis.structs.pricing.SaleDescriptor discounts = 3;</code>
   */
  java.util.List<io.opencannabis.schema.product.struct.SaleDescriptor> 
      getDiscountsList();
  /**
   * <pre>
   * Discounts that should apply to this tier.
   * </pre>
   *
   * <code>repeated .opencannabis.structs.pricing.SaleDescriptor discounts = 3;</code>
   */
  io.opencannabis.schema.product.struct.SaleDescriptor getDiscounts(int index);
  /**
   * <pre>
   * Discounts that should apply to this tier.
   * </pre>
   *
   * <code>repeated .opencannabis.structs.pricing.SaleDescriptor discounts = 3;</code>
   */
  int getDiscountsCount();
  /**
   * <pre>
   * Discounts that should apply to this tier.
   * </pre>
   *
   * <code>repeated .opencannabis.structs.pricing.SaleDescriptor discounts = 3;</code>
   */
  java.util.List<? extends io.opencannabis.schema.product.struct.SaleDescriptorOrBuilder> 
      getDiscountsOrBuilderList();
  /**
   * <pre>
   * Discounts that should apply to this tier.
   * </pre>
   *
   * <code>repeated .opencannabis.structs.pricing.SaleDescriptor discounts = 3;</code>
   */
  io.opencannabis.schema.product.struct.SaleDescriptorOrBuilder getDiscountsOrBuilder(
      int index);
}
