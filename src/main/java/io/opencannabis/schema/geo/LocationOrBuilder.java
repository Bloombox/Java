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

public interface LocationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opencannabis.geo.Location)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name for this location, if applicable.
   * </pre>
   *
   * <code>.opencannabis.content.Name name = 1 [(.gen_bq_schema.description) = "Name for this location, if applicable."];</code>
   */
  boolean hasName();
  /**
   * <pre>
   * Name for this location, if applicable.
   * </pre>
   *
   * <code>.opencannabis.content.Name name = 1 [(.gen_bq_schema.description) = "Name for this location, if applicable."];</code>
   */
  io.opencannabis.schema.content.NameContent.Name getName();
  /**
   * <pre>
   * Name for this location, if applicable.
   * </pre>
   *
   * <code>.opencannabis.content.Name name = 1 [(.gen_bq_schema.description) = "Name for this location, if applicable."];</code>
   */
  io.opencannabis.schema.content.NameContent.NameOrBuilder getNameOrBuilder();

  /**
   * <pre>
   * Address for this location, if applicable.
   * </pre>
   *
   * <code>.opencannabis.geo.Address address = 2 [(.gen_bq_schema.description) = "Address for this location, if applicable."];</code>
   */
  boolean hasAddress();
  /**
   * <pre>
   * Address for this location, if applicable.
   * </pre>
   *
   * <code>.opencannabis.geo.Address address = 2 [(.gen_bq_schema.description) = "Address for this location, if applicable."];</code>
   */
  io.opencannabis.schema.geo.Address getAddress();
  /**
   * <pre>
   * Address for this location, if applicable.
   * </pre>
   *
   * <code>.opencannabis.geo.Address address = 2 [(.gen_bq_schema.description) = "Address for this location, if applicable."];</code>
   */
  io.opencannabis.schema.geo.AddressOrBuilder getAddressOrBuilder();

  /**
   * <pre>
   * Geopoint (latitude/longitude) for this location.
   * </pre>
   *
   * <code>.opencannabis.geo.Point point = 3 [(.gen_bq_schema.description) = "Geopoint (latitude/longitude) for this location."];</code>
   */
  boolean hasPoint();
  /**
   * <pre>
   * Geopoint (latitude/longitude) for this location.
   * </pre>
   *
   * <code>.opencannabis.geo.Point point = 3 [(.gen_bq_schema.description) = "Geopoint (latitude/longitude) for this location."];</code>
   */
  io.opencannabis.schema.geo.Point getPoint();
  /**
   * <pre>
   * Geopoint (latitude/longitude) for this location.
   * </pre>
   *
   * <code>.opencannabis.geo.Point point = 3 [(.gen_bq_schema.description) = "Geopoint (latitude/longitude) for this location."];</code>
   */
  io.opencannabis.schema.geo.PointOrBuilder getPointOrBuilder();

  /**
   * <pre>
   * Specifies the accuracy estimate, if known.
   * </pre>
   *
   * <code>.opencannabis.geo.LocationAccuracy accuracy = 4 [(.gen_bq_schema.description) = "Specifies the accuracy estimate, if known."];</code>
   */
  boolean hasAccuracy();
  /**
   * <pre>
   * Specifies the accuracy estimate, if known.
   * </pre>
   *
   * <code>.opencannabis.geo.LocationAccuracy accuracy = 4 [(.gen_bq_schema.description) = "Specifies the accuracy estimate, if known."];</code>
   */
  io.opencannabis.schema.geo.LocationAccuracy getAccuracy();
  /**
   * <pre>
   * Specifies the accuracy estimate, if known.
   * </pre>
   *
   * <code>.opencannabis.geo.LocationAccuracy accuracy = 4 [(.gen_bq_schema.description) = "Specifies the accuracy estimate, if known."];</code>
   */
  io.opencannabis.schema.geo.LocationAccuracyOrBuilder getAccuracyOrBuilder();
}
