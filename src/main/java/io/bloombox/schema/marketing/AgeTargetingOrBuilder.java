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
// source: marketing/Targeting.proto

package io.bloombox.schema.marketing;

public interface AgeTargetingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bloombox.schema.marketing.AgeTargeting)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Whether the age range must strictly apply to all users, rejecting users that cannot verifiably be included.
   * </pre>
   *
   * <code>bool strict = 1;</code>
   */
  boolean getStrict();

  /**
   * <pre>
   * Minimum age.
   * </pre>
   *
   * <code>uint32 minimum = 2;</code>
   */
  int getMinimum();

  /**
   * <pre>
   * Maximum age.
   * </pre>
   *
   * <code>uint32 maximum = 3;</code>
   */
  int getMaximum();
}
