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
// source: inventory/InventoryLocation.proto

package io.opencannabis.schema.inventory;

public interface InventoryLocationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opencannabis.inventory.InventoryLocation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Key representing this inventory location.
   * </pre>
   *
   * <code>.opencannabis.inventory.InventoryLocationKey key = 1 [(.core.field) = { ... }</code>
   */
  boolean hasKey();
  /**
   * <pre>
   * Key representing this inventory location.
   * </pre>
   *
   * <code>.opencannabis.inventory.InventoryLocationKey key = 1 [(.core.field) = { ... }</code>
   */
  io.opencannabis.schema.inventory.InventoryLocationKey getKey();
  /**
   * <pre>
   * Key representing this inventory location.
   * </pre>
   *
   * <code>.opencannabis.inventory.InventoryLocationKey key = 1 [(.core.field) = { ... }</code>
   */
  io.opencannabis.schema.inventory.InventoryLocationKeyOrBuilder getKeyOrBuilder();

  /**
   * <pre>
   * Specifies the type of this inventory location.
   * </pre>
   *
   * <code>.opencannabis.inventory.InventoryLocationType type = 2;</code>
   */
  int getTypeValue();
  /**
   * <pre>
   * Specifies the type of this inventory location.
   * </pre>
   *
   * <code>.opencannabis.inventory.InventoryLocationType type = 2;</code>
   */
  io.opencannabis.schema.inventory.InventoryLocationType getType();

  /**
   * <pre>
   * Human-readable label for this location.
   * </pre>
   *
   * <code>string name = 3;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Human-readable label for this location.
   * </pre>
   *
   * <code>string name = 3;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Physical and digital contact and location info.
   * </pre>
   *
   * <code>.opencannabis.contact.ContactInfo contact = 4;</code>
   */
  boolean hasContact();
  /**
   * <pre>
   * Physical and digital contact and location info.
   * </pre>
   *
   * <code>.opencannabis.contact.ContactInfo contact = 4;</code>
   */
  io.opencannabis.schema.contact.GenericContact.ContactInfo getContact();
  /**
   * <pre>
   * Physical and digital contact and location info.
   * </pre>
   *
   * <code>.opencannabis.contact.ContactInfo contact = 4;</code>
   */
  io.opencannabis.schema.contact.GenericContact.ContactInfoOrBuilder getContactOrBuilder();
}
