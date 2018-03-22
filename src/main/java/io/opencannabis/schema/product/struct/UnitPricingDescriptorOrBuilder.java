// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: structs/pricing/PricingDescriptor.proto

package io.opencannabis.schema.product.struct;

public interface UnitPricingDescriptorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opencannabis.structs.pricing.UnitPricingDescriptor)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>float price_value = 1;</code>
   */
  float getPriceValue();

  /**
   * <code>.opencannabis.structs.pricing.PricingTierAvailability status = 2;</code>
   */
  boolean hasStatus();
  /**
   * <code>.opencannabis.structs.pricing.PricingTierAvailability status = 2;</code>
   */
  io.opencannabis.schema.product.struct.PricingTierAvailability getStatus();
  /**
   * <code>.opencannabis.structs.pricing.PricingTierAvailability status = 2;</code>
   */
  io.opencannabis.schema.product.struct.PricingTierAvailabilityOrBuilder getStatusOrBuilder();

  /**
   * <code>repeated .opencannabis.structs.pricing.SaleDescriptor discounts = 3;</code>
   */
  java.util.List<io.opencannabis.schema.product.struct.SaleDescriptor> 
      getDiscountsList();
  /**
   * <code>repeated .opencannabis.structs.pricing.SaleDescriptor discounts = 3;</code>
   */
  io.opencannabis.schema.product.struct.SaleDescriptor getDiscounts(int index);
  /**
   * <code>repeated .opencannabis.structs.pricing.SaleDescriptor discounts = 3;</code>
   */
  int getDiscountsCount();
  /**
   * <code>repeated .opencannabis.structs.pricing.SaleDescriptor discounts = 3;</code>
   */
  java.util.List<? extends io.opencannabis.schema.product.struct.SaleDescriptorOrBuilder> 
      getDiscountsOrBuilderList();
  /**
   * <code>repeated .opencannabis.structs.pricing.SaleDescriptor discounts = 3;</code>
   */
  io.opencannabis.schema.product.struct.SaleDescriptorOrBuilder getDiscountsOrBuilder(
      int index);
}
