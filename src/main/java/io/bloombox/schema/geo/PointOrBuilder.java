/*
 * Copyright 2017, Bloombox, LLC.
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
// source: geo/Point.proto

package io.bloombox.schema.geo;

public interface PointOrBuilder extends
    // @@protoc_insertion_point(interface_extends:geo.Point)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>double latitude = 1;</code>
   */
  double getLatitude();

  /**
   * <code>double longitude = 2;</code>
   */
  double getLongitude();

  /**
   * <code>double elevation = 3;</code>
   */
  double getElevation();

  /**
   * <code>double accuracy = 4;</code>
   */
  double getAccuracy();
}
