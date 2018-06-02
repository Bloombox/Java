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

public interface SaleDescriptorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opencannabis.structs.pricing.SaleDescriptor)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * sale metadata
   * </pre>
   *
   * <code>.opencannabis.structs.pricing.SaleType type = 1;</code>
   */
  int getTypeValue();
  /**
   * <pre>
   * sale metadata
   * </pre>
   *
   * <code>.opencannabis.structs.pricing.SaleType type = 1;</code>
   */
  io.opencannabis.schema.product.struct.SaleType getType();

  /**
   * <code>.opencannabis.temporal.Instant effective = 2;</code>
   */
  boolean hasEffective();
  /**
   * <code>.opencannabis.temporal.Instant effective = 2;</code>
   */
  io.opencannabis.schema.temporal.Instant getEffective();
  /**
   * <code>.opencannabis.temporal.Instant effective = 2;</code>
   */
  io.opencannabis.schema.temporal.InstantOrBuilder getEffectiveOrBuilder();

  /**
   * <code>.opencannabis.temporal.Instant expiration = 3;</code>
   */
  boolean hasExpiration();
  /**
   * <code>.opencannabis.temporal.Instant expiration = 3;</code>
   */
  io.opencannabis.schema.temporal.Instant getExpiration();
  /**
   * <code>.opencannabis.temporal.Instant expiration = 3;</code>
   */
  io.opencannabis.schema.temporal.InstantOrBuilder getExpirationOrBuilder();

  /**
   * <code>.opencannabis.structs.pricing.PercentageDiscount percentage_off = 4;</code>
   */
  boolean hasPercentageOff();
  /**
   * <code>.opencannabis.structs.pricing.PercentageDiscount percentage_off = 4;</code>
   */
  io.opencannabis.schema.product.struct.PercentageDiscount getPercentageOff();
  /**
   * <code>.opencannabis.structs.pricing.PercentageDiscount percentage_off = 4;</code>
   */
  io.opencannabis.schema.product.struct.PercentageDiscountOrBuilder getPercentageOffOrBuilder();

  /**
   * <code>.opencannabis.structs.pricing.BOGODiscount bogo = 5;</code>
   */
  boolean hasBogo();
  /**
   * <code>.opencannabis.structs.pricing.BOGODiscount bogo = 5;</code>
   */
  io.opencannabis.schema.product.struct.BOGODiscount getBogo();
  /**
   * <code>.opencannabis.structs.pricing.BOGODiscount bogo = 5;</code>
   */
  io.opencannabis.schema.product.struct.BOGODiscountOrBuilder getBogoOrBuilder();

  /**
   * <code>.opencannabis.structs.pricing.LoyaltyDiscount loyalty = 6;</code>
   */
  boolean hasLoyalty();
  /**
   * <code>.opencannabis.structs.pricing.LoyaltyDiscount loyalty = 6;</code>
   */
  io.opencannabis.schema.product.struct.LoyaltyDiscount getLoyalty();
  /**
   * <code>.opencannabis.structs.pricing.LoyaltyDiscount loyalty = 6;</code>
   */
  io.opencannabis.schema.product.struct.LoyaltyDiscountOrBuilder getLoyaltyOrBuilder();

  public io.opencannabis.schema.product.struct.SaleDescriptor.SaleCase getSaleCase();
}
