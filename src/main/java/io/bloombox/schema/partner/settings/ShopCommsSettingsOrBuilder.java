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
// source: partner/settings/PartnerLocationSettings.proto

package io.bloombox.schema.partner.settings;

public interface ShopCommsSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bloombox.schema.partner.settings.ShopCommsSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Internal communications settings. This includes dispensary owners/operators/staff and other internal stakeholders.
   * </pre>
   *
   * <code>.bloombox.schema.partner.settings.CommsSettingsPayload internal = 1;</code>
   */
  boolean hasInternal();
  /**
   * <pre>
   * Internal communications settings. This includes dispensary owners/operators/staff and other internal stakeholders.
   * </pre>
   *
   * <code>.bloombox.schema.partner.settings.CommsSettingsPayload internal = 1;</code>
   */
  io.bloombox.schema.partner.settings.CommsSettingsPayload getInternal();
  /**
   * <pre>
   * Internal communications settings. This includes dispensary owners/operators/staff and other internal stakeholders.
   * </pre>
   *
   * <code>.bloombox.schema.partner.settings.CommsSettingsPayload internal = 1;</code>
   */
  io.bloombox.schema.partner.settings.CommsSettingsPayloadOrBuilder getInternalOrBuilder();

  /**
   * <pre>
   * External communications settings. This specifies settings that apply when communicating with end-users, consumers,
   * customers, and so on.
   * </pre>
   *
   * <code>.bloombox.schema.partner.settings.CommsSettingsPayload external = 2;</code>
   */
  boolean hasExternal();
  /**
   * <pre>
   * External communications settings. This specifies settings that apply when communicating with end-users, consumers,
   * customers, and so on.
   * </pre>
   *
   * <code>.bloombox.schema.partner.settings.CommsSettingsPayload external = 2;</code>
   */
  io.bloombox.schema.partner.settings.CommsSettingsPayload getExternal();
  /**
   * <pre>
   * External communications settings. This specifies settings that apply when communicating with end-users, consumers,
   * customers, and so on.
   * </pre>
   *
   * <code>.bloombox.schema.partner.settings.CommsSettingsPayload external = 2;</code>
   */
  io.bloombox.schema.partner.settings.CommsSettingsPayloadOrBuilder getExternalOrBuilder();
}
