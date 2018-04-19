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
// source: partner/settings/PartnerSettings.proto

package io.bloombox.schema.partner.settings;

public interface PartnerEventAlertingSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bloombox.schema.partner.settings.PartnerEventAlertingSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Specifies 'promo' notifications.
   * </pre>
   *
   * <code>bool promo = 1;</code>
   */
  boolean getPromo();

  /**
   * <pre>
   * Specifies 'security' notifications.
   * </pre>
   *
   * <code>bool security = 2;</code>
   */
  boolean getSecurity();

  /**
   * <pre>
   * Specifies 'volume' notifications.
   * </pre>
   *
   * <code>bool volume = 3;</code>
   */
  boolean getVolume();
}
