// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: structs/pricing/PricingDescriptor.proto

package io.opencannabis.schema.product.struct;

public interface PricingDescriptorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opencannabis.structs.pricing.PricingDescriptor)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Type of pricing tier this descriptor is specifying.
   * </pre>
   *
   * <code>.opencannabis.structs.pricing.PricingType type = 1;</code>
   */
  int getTypeValue();
  /**
   * <pre>
   * Type of pricing tier this descriptor is specifying.
   * </pre>
   *
   * <code>.opencannabis.structs.pricing.PricingType type = 1;</code>
   */
  io.opencannabis.schema.product.struct.PricingType getType();

  /**
   * <pre>
   * Unit-based pricing information, with no variance in price change.
   * </pre>
   *
   * <code>.opencannabis.structs.pricing.UnitPricingDescriptor unit = 20;</code>
   */
  boolean hasUnit();
  /**
   * <pre>
   * Unit-based pricing information, with no variance in price change.
   * </pre>
   *
   * <code>.opencannabis.structs.pricing.UnitPricingDescriptor unit = 20;</code>
   */
  io.opencannabis.schema.product.struct.UnitPricingDescriptor getUnit();
  /**
   * <pre>
   * Unit-based pricing information, with no variance in price change.
   * </pre>
   *
   * <code>.opencannabis.structs.pricing.UnitPricingDescriptor unit = 20;</code>
   */
  io.opencannabis.schema.product.struct.UnitPricingDescriptorOrBuilder getUnitOrBuilder();

  /**
   * <pre>
   * Weight-based pricing information, with prices assgined to specific or known weights.
   * </pre>
   *
   * <code>.opencannabis.structs.pricing.WeightedPricingDescriptor weighted = 21;</code>
   */
  boolean hasWeighted();
  /**
   * <pre>
   * Weight-based pricing information, with prices assgined to specific or known weights.
   * </pre>
   *
   * <code>.opencannabis.structs.pricing.WeightedPricingDescriptor weighted = 21;</code>
   */
  io.opencannabis.schema.product.struct.WeightedPricingDescriptor getWeighted();
  /**
   * <pre>
   * Weight-based pricing information, with prices assgined to specific or known weights.
   * </pre>
   *
   * <code>.opencannabis.structs.pricing.WeightedPricingDescriptor weighted = 21;</code>
   */
  io.opencannabis.schema.product.struct.WeightedPricingDescriptorOrBuilder getWeightedOrBuilder();

  public io.opencannabis.schema.product.struct.PricingDescriptor.TierCase getTierCase();
}
