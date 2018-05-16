// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: geo/Location.proto

package io.opencannabis.schema.geo;

public interface LocationAccuracyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opencannabis.geo.LocationAccuracy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Specifies whether this accuracy rating is an estimate.
   * </pre>
   *
   * <code>bool estimate = 1 [(.gen_bq_schema.description) = "Specifies whether this accuracy rating is an estimate."];</code>
   */
  boolean getEstimate();

  /**
   * <pre>
   * Distance value for the accuracy specified.
   * </pre>
   *
   * <code>.opencannabis.geo.DistanceValue value = 2 [(.gen_bq_schema.description) = "Distance value for the accuracy specified."];</code>
   */
  boolean hasValue();
  /**
   * <pre>
   * Distance value for the accuracy specified.
   * </pre>
   *
   * <code>.opencannabis.geo.DistanceValue value = 2 [(.gen_bq_schema.description) = "Distance value for the accuracy specified."];</code>
   */
  io.opencannabis.schema.geo.DistanceValue getValue();
  /**
   * <pre>
   * Distance value for the accuracy specified.
   * </pre>
   *
   * <code>.opencannabis.geo.DistanceValue value = 2 [(.gen_bq_schema.description) = "Distance value for the accuracy specified."];</code>
   */
  io.opencannabis.schema.geo.DistanceValueOrBuilder getValueOrBuilder();
}
