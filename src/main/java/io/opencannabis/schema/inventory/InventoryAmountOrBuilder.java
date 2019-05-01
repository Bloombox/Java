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
// source: inventory/InventoryProduct.proto

package io.opencannabis.schema.inventory;

public interface InventoryAmountOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opencannabis.inventory.InventoryAmount)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Type of pricing/inventory to employ for this product. Can either be `UNIT` or `WEIGHTED` pricing.
   * </pre>
   *
   * <code>.opencannabis.structs.pricing.PricingType type = 1;</code>
   */
  int getTypeValue();
  /**
   * <pre>
   * Type of pricing/inventory to employ for this product. Can either be `UNIT` or `WEIGHTED` pricing.
   * </pre>
   *
   * <code>.opencannabis.structs.pricing.PricingType type = 1;</code>
   */
  io.opencannabis.schema.product.struct.PricingType getType();

  /**
   * <pre>
   * The inventory item is unit-based, i.e., just individual items.
   * </pre>
   *
   * <code>bool unit = 2;</code>
   */
  boolean getUnit();

  /**
   * <pre>
   * The inventory item is weight-based, i.e., a certain amount of grams or pounds.
   * </pre>
   *
   * <code>.opencannabis.structs.pricing.PricingWeightTier weight = 3;</code>
   */
  int getWeightValue();
  /**
   * <pre>
   * The inventory item is weight-based, i.e., a certain amount of grams or pounds.
   * </pre>
   *
   * <code>.opencannabis.structs.pricing.PricingWeightTier weight = 3;</code>
   */
  io.opencannabis.schema.product.struct.PricingWeightTier getWeight();

  /**
   * <pre>
   * Actual amount specified for the given inventory.
   * </pre>
   *
   * <code>uint64 quantity = 4;</code>
   */
  long getQuantity();

  public io.opencannabis.schema.inventory.InventoryAmount.BasisCase getBasisCase();
}
