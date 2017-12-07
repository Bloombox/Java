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
// source: identity/User.proto

package io.bloombox.schema.identity;

public interface ConsumerProfileOrBuilder extends
    // @@protoc_insertion_point(interface_extends:identity.ConsumerProfile)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Profile active/inactive flag.
   * </pre>
   *
   * <code>bool active = 1;</code>
   */
  boolean getActive();

  /**
   * <pre>
   * Enumerates favorite dispensaries for a user.
   * </pre>
   *
   * <code>repeated string favorite_dispensaries = 2;</code>
   */
  java.util.List<java.lang.String>
      getFavoriteDispensariesList();
  /**
   * <pre>
   * Enumerates favorite dispensaries for a user.
   * </pre>
   *
   * <code>repeated string favorite_dispensaries = 2;</code>
   */
  int getFavoriteDispensariesCount();
  /**
   * <pre>
   * Enumerates favorite dispensaries for a user.
   * </pre>
   *
   * <code>repeated string favorite_dispensaries = 2;</code>
   */
  java.lang.String getFavoriteDispensaries(int index);
  /**
   * <pre>
   * Enumerates favorite dispensaries for a user.
   * </pre>
   *
   * <code>repeated string favorite_dispensaries = 2;</code>
   */
  com.google.protobuf.ByteString
      getFavoriteDispensariesBytes(int index);

  /**
   * <pre>
   * Specifies enrollment source attribution information.
   * </pre>
   *
   * <code>.identity.EnrollmentSource enrollment_source = 3;</code>
   */
  int getEnrollmentSourceValue();
  /**
   * <pre>
   * Specifies enrollment source attribution information.
   * </pre>
   *
   * <code>.identity.EnrollmentSource enrollment_source = 3;</code>
   */
  io.bloombox.schema.identity.EnrollmentSource getEnrollmentSource();

  /**
   * <pre>
   * Arbitrary string for the channel through which this user enrolled.
   * </pre>
   *
   * <code>string enrollment_channel = 4;</code>
   */
  java.lang.String getEnrollmentChannel();
  /**
   * <pre>
   * Arbitrary string for the channel through which this user enrolled.
   * </pre>
   *
   * <code>string enrollment_channel = 4;</code>
   */
  com.google.protobuf.ByteString
      getEnrollmentChannelBytes();

  /**
   * <pre>
   * Preferences attached to a consumer account.
   * </pre>
   *
   * <code>.identity.ConsumerPreferences preferences = 5;</code>
   */
  boolean hasPreferences();
  /**
   * <pre>
   * Preferences attached to a consumer account.
   * </pre>
   *
   * <code>.identity.ConsumerPreferences preferences = 5;</code>
   */
  io.bloombox.schema.identity.ConsumerPreferences getPreferences();
  /**
   * <pre>
   * Preferences attached to a consumer account.
   * </pre>
   *
   * <code>.identity.ConsumerPreferences preferences = 5;</code>
   */
  io.bloombox.schema.identity.ConsumerPreferencesOrBuilder getPreferencesOrBuilder();
}
