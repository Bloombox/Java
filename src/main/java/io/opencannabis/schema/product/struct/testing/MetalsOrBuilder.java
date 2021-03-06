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
// source: structs/labtesting/TestResults.proto

package io.opencannabis.schema.product.struct.testing;

public interface MetalsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opencannabis.structs.labtesting.Metals)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Flag indicating the product is heavy-metal-free.
   * </pre>
   *
   * <code>bool metal_free = 1;</code>
   */
  boolean getMetalFree();

  /**
   * <pre>
   * Measurements for specific, named, heavy metal values.
   * </pre>
   *
   * <code>map&lt;string, .opencannabis.structs.labtesting.TestValue&gt; measurements = 2;</code>
   */
  int getMeasurementsCount();
  /**
   * <pre>
   * Measurements for specific, named, heavy metal values.
   * </pre>
   *
   * <code>map&lt;string, .opencannabis.structs.labtesting.TestValue&gt; measurements = 2;</code>
   */
  boolean containsMeasurements(
      java.lang.String key);
  /**
   * Use {@link #getMeasurementsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, io.opencannabis.schema.product.struct.testing.TestValue>
  getMeasurements();
  /**
   * <pre>
   * Measurements for specific, named, heavy metal values.
   * </pre>
   *
   * <code>map&lt;string, .opencannabis.structs.labtesting.TestValue&gt; measurements = 2;</code>
   */
  java.util.Map<java.lang.String, io.opencannabis.schema.product.struct.testing.TestValue>
  getMeasurementsMap();
  /**
   * <pre>
   * Measurements for specific, named, heavy metal values.
   * </pre>
   *
   * <code>map&lt;string, .opencannabis.structs.labtesting.TestValue&gt; measurements = 2;</code>
   */

  io.opencannabis.schema.product.struct.testing.TestValue getMeasurementsOrDefault(
      java.lang.String key,
      io.opencannabis.schema.product.struct.testing.TestValue defaultValue);
  /**
   * <pre>
   * Measurements for specific, named, heavy metal values.
   * </pre>
   *
   * <code>map&lt;string, .opencannabis.structs.labtesting.TestValue&gt; measurements = 2;</code>
   */

  io.opencannabis.schema.product.struct.testing.TestValue getMeasurementsOrThrow(
      java.lang.String key);
}
