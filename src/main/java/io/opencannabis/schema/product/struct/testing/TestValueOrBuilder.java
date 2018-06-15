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
// source: structs/labtesting/TestValue.proto

package io.opencannabis.schema.product.struct.testing;

public interface TestValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opencannabis.structs.labtesting.TestValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.opencannabis.structs.labtesting.TestValueType type = 1;</code>
   */
  int getTypeValue();
  /**
   * <code>.opencannabis.structs.labtesting.TestValueType type = 1;</code>
   */
  io.opencannabis.schema.product.struct.testing.TestValueType getType();

  /**
   * <code>.opencannabis.structs.labtesting.TestValue.TestError error = 2;</code>
   */
  boolean hasError();
  /**
   * <code>.opencannabis.structs.labtesting.TestValue.TestError error = 2;</code>
   */
  io.opencannabis.schema.product.struct.testing.TestValue.TestError getError();
  /**
   * <code>.opencannabis.structs.labtesting.TestValue.TestError error = 2;</code>
   */
  io.opencannabis.schema.product.struct.testing.TestValue.TestErrorOrBuilder getErrorOrBuilder();

  /**
   * <code>double measurement = 10;</code>
   */
  double getMeasurement();

  /**
   * <code>bool present = 20;</code>
   */
  boolean getPresent();

  public io.opencannabis.schema.product.struct.testing.TestValue.ValueCase getValueCase();
}
