// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: structs/pricing/PricingDescriptor.proto

package io.opencannabis.schema.product.struct;

public interface PricingTierAvailabilityOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opencannabis.structs.pricing.PricingTierAvailability)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Specifies whether a particular pricing tier is offered at all. This would be interpreted to indicate whether a
   * particular pricing tier is 'ever available' or 'ever offered.'
   * </pre>
   *
   * <code>bool offered = 1;</code>
   */
  boolean getOffered();

  /**
   * <pre>
   * Specifies whether a particular pricing tier is currently available. This would be interpreted to indicate whether a
   * particular pricing tier is 'currently available,' 'currently in stock,' or 'currently offered.'
   * </pre>
   *
   * <code>bool available = 2;</code>
   */
  boolean getAvailable();
}
