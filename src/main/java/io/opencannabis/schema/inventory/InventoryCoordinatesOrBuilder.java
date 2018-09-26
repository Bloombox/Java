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
// source: inventory/InventoryProduct.proto

package io.opencannabis.schema.inventory;

public interface InventoryCoordinatesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opencannabis.inventory.InventoryCoordinates)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Location code. Specifies a physical location where the inventory product is held. This is the highest-resolution
   * property specifying inventory coordinates. Optional.
   * </pre>
   *
   * <code>string location = 1;</code>
   */
  java.lang.String getLocation();
  /**
   * <pre>
   * Location code. Specifies a physical location where the inventory product is held. This is the highest-resolution
   * property specifying inventory coordinates. Optional.
   * </pre>
   *
   * <code>string location = 1;</code>
   */
  com.google.protobuf.ByteString
      getLocationBytes();

  /**
   * <pre>
   * Zone code. This property is usually meant to be nested under the value for `location` - i.e., a zone code inside
   * given location code. Optional.
   * </pre>
   *
   * <code>string zone = 2;</code>
   */
  java.lang.String getZone();
  /**
   * <pre>
   * Zone code. This property is usually meant to be nested under the value for `location` - i.e., a zone code inside
   * given location code. Optional.
   * </pre>
   *
   * <code>string zone = 2;</code>
   */
  com.google.protobuf.ByteString
      getZoneBytes();

  /**
   * <pre>
   * Rack code. This property is optional and is usually meant to be nested under the value for `zone` - i.e., a rack
   * code or number is inside a given zone which is inside a given location. Optional.
   * </pre>
   *
   * <code>string rack = 3;</code>
   */
  java.lang.String getRack();
  /**
   * <pre>
   * Rack code. This property is optional and is usually meant to be nested under the value for `zone` - i.e., a rack
   * code or number is inside a given zone which is inside a given location. Optional.
   * </pre>
   *
   * <code>string rack = 3;</code>
   */
  com.google.protobuf.ByteString
      getRackBytes();

  /**
   * <pre>
   * Shelf code. This property is optional and is usually meant to be nested under the value for `rack` - i.e., a shelf
   * code or number is inside a given rack which is inside a zone which is inside a location. Optional.
   * </pre>
   *
   * <code>string shelf = 4;</code>
   */
  java.lang.String getShelf();
  /**
   * <pre>
   * Shelf code. This property is optional and is usually meant to be nested under the value for `rack` - i.e., a shelf
   * code or number is inside a given rack which is inside a zone which is inside a location. Optional.
   * </pre>
   *
   * <code>string shelf = 4;</code>
   */
  com.google.protobuf.ByteString
      getShelfBytes();

  /**
   * <pre>
   * Bin code. This property is optional and is usually meant to be global, although it may be nested as well if bins
   * are anonymous in the target partner system.
   * </pre>
   *
   * <code>string bin = 5;</code>
   */
  java.lang.String getBin();
  /**
   * <pre>
   * Bin code. This property is optional and is usually meant to be global, although it may be nested as well if bins
   * are anonymous in the target partner system.
   * </pre>
   *
   * <code>string bin = 5;</code>
   */
  com.google.protobuf.ByteString
      getBinBytes();

  /**
   * <pre>
   * Batch code. Used to correlate test results and other data. Optional. Usually meant to be used as a global property,
   * but can be nested under any of the other inventory coordinate values. How this property is used is determined by
   * the hosting/invoking/subject partner.
   * </pre>
   *
   * <code>string batch = 6;</code>
   */
  java.lang.String getBatch();
  /**
   * <pre>
   * Batch code. Used to correlate test results and other data. Optional. Usually meant to be used as a global property,
   * but can be nested under any of the other inventory coordinate values. How this property is used is determined by
   * the hosting/invoking/subject partner.
   * </pre>
   *
   * <code>string batch = 6;</code>
   */
  com.google.protobuf.ByteString
      getBatchBytes();
}
