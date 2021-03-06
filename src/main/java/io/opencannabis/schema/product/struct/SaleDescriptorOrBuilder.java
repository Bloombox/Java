/*
 * Copyright 2019, Momentum Ideas Co.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
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
   * Sale metadata.
   * </pre>
   *
   * <code>.opencannabis.structs.pricing.SaleType type = 1;</code>
   */
  int getTypeValue();
  /**
   * <pre>
   * Sale metadata.
   * </pre>
   *
   * <code>.opencannabis.structs.pricing.SaleType type = 1;</code>
   */
  io.opencannabis.schema.product.struct.SaleType getType();

  /**
   * <pre>
   * Represents the date that the discount can be applied.
   * </pre>
   *
   * <code>.opencannabis.temporal.Instant effective = 2;</code>
   */
  boolean hasEffective();
  /**
   * <pre>
   * Represents the date that the discount can be applied.
   * </pre>
   *
   * <code>.opencannabis.temporal.Instant effective = 2;</code>
   */
  io.opencannabis.schema.temporal.TemporalInstant.Instant getEffective();
  /**
   * <pre>
   * Represents the date that the discount can be applied.
   * </pre>
   *
   * <code>.opencannabis.temporal.Instant effective = 2;</code>
   */
  io.opencannabis.schema.temporal.TemporalInstant.InstantOrBuilder getEffectiveOrBuilder();

  /**
   * <pre>
   * Represents the final date that the discount can be applied.
   * </pre>
   *
   * <code>.opencannabis.temporal.Instant expiration = 3;</code>
   */
  boolean hasExpiration();
  /**
   * <pre>
   * Represents the final date that the discount can be applied.
   * </pre>
   *
   * <code>.opencannabis.temporal.Instant expiration = 3;</code>
   */
  io.opencannabis.schema.temporal.TemporalInstant.Instant getExpiration();
  /**
   * <pre>
   * Represents the final date that the discount can be applied.
   * </pre>
   *
   * <code>.opencannabis.temporal.Instant expiration = 3;</code>
   */
  io.opencannabis.schema.temporal.TemporalInstant.InstantOrBuilder getExpirationOrBuilder();

  /**
   * <pre>
   * Represents the percentage value to be discounted.
   * </pre>
   *
   * <code>.opencannabis.structs.pricing.PercentageDiscount percentage_off = 4;</code>
   */
  boolean hasPercentageOff();
  /**
   * <pre>
   * Represents the percentage value to be discounted.
   * </pre>
   *
   * <code>.opencannabis.structs.pricing.PercentageDiscount percentage_off = 4;</code>
   */
  io.opencannabis.schema.product.struct.PercentageDiscount getPercentageOff();
  /**
   * <pre>
   * Represents the percentage value to be discounted.
   * </pre>
   *
   * <code>.opencannabis.structs.pricing.PercentageDiscount percentage_off = 4;</code>
   */
  io.opencannabis.schema.product.struct.PercentageDiscountOrBuilder getPercentageOffOrBuilder();

  /**
   * <pre>
   * Represents that the discount is buy one get one.
   * </pre>
   *
   * <code>.opencannabis.structs.pricing.BOGODiscount bogo = 5;</code>
   */
  boolean hasBogo();
  /**
   * <pre>
   * Represents that the discount is buy one get one.
   * </pre>
   *
   * <code>.opencannabis.structs.pricing.BOGODiscount bogo = 5;</code>
   */
  io.opencannabis.schema.product.struct.BOGODiscount getBogo();
  /**
   * <pre>
   * Represents that the discount is buy one get one.
   * </pre>
   *
   * <code>.opencannabis.structs.pricing.BOGODiscount bogo = 5;</code>
   */
  io.opencannabis.schema.product.struct.BOGODiscountOrBuilder getBogoOrBuilder();

  /**
   * <pre>
   * Represents that the discount is using accrued loyalty rewards.
   * </pre>
   *
   * <code>.opencannabis.structs.pricing.LoyaltyDiscount loyalty = 6;</code>
   */
  boolean hasLoyalty();
  /**
   * <pre>
   * Represents that the discount is using accrued loyalty rewards.
   * </pre>
   *
   * <code>.opencannabis.structs.pricing.LoyaltyDiscount loyalty = 6;</code>
   */
  io.opencannabis.schema.product.struct.LoyaltyDiscount getLoyalty();
  /**
   * <pre>
   * Represents that the discount is using accrued loyalty rewards.
   * </pre>
   *
   * <code>.opencannabis.structs.pricing.LoyaltyDiscount loyalty = 6;</code>
   */
  io.opencannabis.schema.product.struct.LoyaltyDiscountOrBuilder getLoyaltyOrBuilder();

  public io.opencannabis.schema.product.struct.SaleDescriptor.SaleCase getSaleCase();
}
