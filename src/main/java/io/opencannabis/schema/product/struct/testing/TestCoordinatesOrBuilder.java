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

public interface TestCoordinatesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opencannabis.structs.labtesting.TestCoordinates)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Specifies the 'zone' value for a set of test results. This is usually used as/by a floor or greenhouse ID.
   * </pre>
   *
   * <code>string zone = 1;</code>
   */
  java.lang.String getZone();
  /**
   * <pre>
   * Specifies the 'zone' value for a set of test results. This is usually used as/by a floor or greenhouse ID.
   * </pre>
   *
   * <code>string zone = 1;</code>
   */
  com.google.protobuf.ByteString
      getZoneBytes();

  /**
   * <pre>
   * Specifies the 'lot' value for a set of test results. This is usually used as/by a room or section ID.
   * </pre>
   *
   * <code>string lot = 2;</code>
   */
  java.lang.String getLot();
  /**
   * <pre>
   * Specifies the 'lot' value for a set of test results. This is usually used as/by a room or section ID.
   * </pre>
   *
   * <code>string lot = 2;</code>
   */
  com.google.protobuf.ByteString
      getLotBytes();

  /**
   * <pre>
   * Specifies the 'batch' value for a set of test results. This is usually used as/by a row or tray ID for individual
   * plants or test sample products.
   * </pre>
   *
   * <code>string batch = 3;</code>
   */
  java.lang.String getBatch();
  /**
   * <pre>
   * Specifies the 'batch' value for a set of test results. This is usually used as/by a row or tray ID for individual
   * plants or test sample products.
   * </pre>
   *
   * <code>string batch = 3;</code>
   */
  com.google.protobuf.ByteString
      getBatchBytes();

  /**
   * <pre>
   * Unique ID given to the sample that was tested. This may represent individual plants or products, grouped lots or
   * batches, or even random selections from entire zones.
   * </pre>
   *
   * <code>string sample_id = 4;</code>
   */
  java.lang.String getSampleId();
  /**
   * <pre>
   * Unique ID given to the sample that was tested. This may represent individual plants or products, grouped lots or
   * batches, or even random selections from entire zones.
   * </pre>
   *
   * <code>string sample_id = 4;</code>
   */
  com.google.protobuf.ByteString
      getSampleIdBytes();
}
