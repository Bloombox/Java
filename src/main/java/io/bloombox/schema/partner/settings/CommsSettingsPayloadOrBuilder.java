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

public interface CommsSettingsPayloadOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bloombox.schema.partner.settings.CommsSettingsPayload)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Specifies the type communications this settings payload should apply to. Sometimes left unspecified when this
   * message is used as a map value, since this value is used as its key.
   * </pre>
   *
   * <code>.bloombox.schema.partner.settings.ShopCommsType type = 1;</code>
   */
  int getTypeValue();
  /**
   * <pre>
   * Specifies the type communications this settings payload should apply to. Sometimes left unspecified when this
   * message is used as a map value, since this value is used as its key.
   * </pre>
   *
   * <code>.bloombox.schema.partner.settings.ShopCommsType type = 1;</code>
   */
  io.bloombox.schema.partner.settings.ShopCommsType getType();

  /**
   * <pre>
   * Specifies contacts attached to this type of shop communication. In an internal context, these represent the full
   * set of contacts reached-out-to when things occur. In an external context, these are like a BCC function.
   * </pre>
   *
   * <code>repeated .bloombox.schema.partner.settings.ShopContactTarget contacts = 2;</code>
   */
  java.util.List<io.bloombox.schema.partner.settings.ShopContactTarget> 
      getContactsList();
  /**
   * <pre>
   * Specifies contacts attached to this type of shop communication. In an internal context, these represent the full
   * set of contacts reached-out-to when things occur. In an external context, these are like a BCC function.
   * </pre>
   *
   * <code>repeated .bloombox.schema.partner.settings.ShopContactTarget contacts = 2;</code>
   */
  io.bloombox.schema.partner.settings.ShopContactTarget getContacts(int index);
  /**
   * <pre>
   * Specifies contacts attached to this type of shop communication. In an internal context, these represent the full
   * set of contacts reached-out-to when things occur. In an external context, these are like a BCC function.
   * </pre>
   *
   * <code>repeated .bloombox.schema.partner.settings.ShopContactTarget contacts = 2;</code>
   */
  int getContactsCount();
  /**
   * <pre>
   * Specifies contacts attached to this type of shop communication. In an internal context, these represent the full
   * set of contacts reached-out-to when things occur. In an external context, these are like a BCC function.
   * </pre>
   *
   * <code>repeated .bloombox.schema.partner.settings.ShopContactTarget contacts = 2;</code>
   */
  java.util.List<? extends io.bloombox.schema.partner.settings.ShopContactTargetOrBuilder> 
      getContactsOrBuilderList();
  /**
   * <pre>
   * Specifies contacts attached to this type of shop communication. In an internal context, these represent the full
   * set of contacts reached-out-to when things occur. In an external context, these are like a BCC function.
   * </pre>
   *
   * <code>repeated .bloombox.schema.partner.settings.ShopContactTarget contacts = 2;</code>
   */
  io.bloombox.schema.partner.settings.ShopContactTargetOrBuilder getContactsOrBuilder(
      int index);

  /**
   * <pre>
   * Specifies settings for where messages should come from when they are sent for shop communications, including email
   * (source email address), and SMS (source phone number).
   * </pre>
   *
   * <code>.bloombox.schema.partner.settings.CommsSenderSettings sender = 3;</code>
   */
  boolean hasSender();
  /**
   * <pre>
   * Specifies settings for where messages should come from when they are sent for shop communications, including email
   * (source email address), and SMS (source phone number).
   * </pre>
   *
   * <code>.bloombox.schema.partner.settings.CommsSenderSettings sender = 3;</code>
   */
  io.bloombox.schema.partner.settings.CommsSenderSettings getSender();
  /**
   * <pre>
   * Specifies settings for where messages should come from when they are sent for shop communications, including email
   * (source email address), and SMS (source phone number).
   * </pre>
   *
   * <code>.bloombox.schema.partner.settings.CommsSenderSettings sender = 3;</code>
   */
  io.bloombox.schema.partner.settings.CommsSenderSettingsOrBuilder getSenderOrBuilder();
}
