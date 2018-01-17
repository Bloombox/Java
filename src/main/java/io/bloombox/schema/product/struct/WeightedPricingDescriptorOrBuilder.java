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

public interface WeightedPricingDescriptorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:structs.pricing.WeightedPricingDescriptor)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.structs.pricing.PricingWeightTier weight = 1;</code>
   */
  int getWeightValue();
  /**
   * <code>.structs.pricing.PricingWeightTier weight = 1;</code>
   */
  io.bloombox.schema.product.struct.PricingWeightTier getWeight();

  /**
   * <code>.structs.pricing.UnitPricingDescriptor tier = 2;</code>
   */
  boolean hasTier();
  /**
   * <code>.structs.pricing.UnitPricingDescriptor tier = 2;</code>
   */
  io.bloombox.schema.product.struct.UnitPricingDescriptor getTier();
  /**
   * <code>.structs.pricing.UnitPricingDescriptor tier = 2;</code>
   */
  io.bloombox.schema.product.struct.UnitPricingDescriptorOrBuilder getTierOrBuilder();

  /**
   * <code>float weight_in_grams = 3;</code>
   */
  float getWeightInGrams();
}
