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
