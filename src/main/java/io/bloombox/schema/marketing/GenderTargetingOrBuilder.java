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

public interface GenderTargetingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bloombox.schema.marketing.GenderTargeting)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Specify a specific gender to target.
   * </pre>
   *
   * <code>.opencannabis.person.Gender target = 1;</code>
   */
  int getTargetValue();
  /**
   * <pre>
   * Specify a specific gender to target.
   * </pre>
   *
   * <code>.opencannabis.person.Gender target = 1;</code>
   */
  io.opencannabis.schema.person.Gender getTarget();
}
