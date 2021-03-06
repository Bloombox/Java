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
// source: inventory/InventoryProduct.proto

package io.opencannabis.schema.inventory;

public interface InventoryStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opencannabis.inventory.InventoryState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Status of the inventory item. Specifies the active state for the inventory item, from a set of enumerated standard
   * inventory states.
   * </pre>
   *
   * <code>.opencannabis.inventory.InventoryState.Status status = 1;</code>
   */
  int getStatusValue();
  /**
   * <pre>
   * Status of the inventory item. Specifies the active state for the inventory item, from a set of enumerated standard
   * inventory states.
   * </pre>
   *
   * <code>.opencannabis.inventory.InventoryState.Status status = 1;</code>
   */
  io.opencannabis.schema.inventory.InventoryState.Status getStatus();

  /**
   * <pre>
   * Specifies the new (target) coordinates for a given inventory item, a change that occurred with a given inventory
   * item checkin.
   * </pre>
   *
   * <code>.opencannabis.inventory.InventoryCoordinates coordinates = 2;</code>
   */
  boolean hasCoordinates();
  /**
   * <pre>
   * Specifies the new (target) coordinates for a given inventory item, a change that occurred with a given inventory
   * item checkin.
   * </pre>
   *
   * <code>.opencannabis.inventory.InventoryCoordinates coordinates = 2;</code>
   */
  io.opencannabis.schema.inventory.InventoryCoordinates getCoordinates();
  /**
   * <pre>
   * Specifies the new (target) coordinates for a given inventory item, a change that occurred with a given inventory
   * item checkin.
   * </pre>
   *
   * <code>.opencannabis.inventory.InventoryCoordinates coordinates = 2;</code>
   */
  io.opencannabis.schema.inventory.InventoryCoordinatesOrBuilder getCoordinatesOrBuilder();

  /**
   * <pre>
   * Indicates whether the inventory item is fit for sale, or not. This flag must be set to `true` for an item to be
   * eligible for listing.
   * </pre>
   *
   * <code>bool fit_for_sale = 3;</code>
   */
  boolean getFitForSale();

  /**
   * <pre>
   * Amount of inventory, in this batch, that is on-hand.
   * </pre>
   *
   * <code>.opencannabis.inventory.InventoryAmount amount = 4;</code>
   */
  boolean hasAmount();
  /**
   * <pre>
   * Amount of inventory, in this batch, that is on-hand.
   * </pre>
   *
   * <code>.opencannabis.inventory.InventoryAmount amount = 4;</code>
   */
  io.opencannabis.schema.inventory.InventoryAmount getAmount();
  /**
   * <pre>
   * Amount of inventory, in this batch, that is on-hand.
   * </pre>
   *
   * <code>.opencannabis.inventory.InventoryAmount amount = 4;</code>
   */
  io.opencannabis.schema.inventory.InventoryAmountOrBuilder getAmountOrBuilder();

  /**
   * <pre>
   * Timestamp for when this inventory state entry was created. Set after initially saving an inventory state checkin.
   * </pre>
   *
   * <code>.opencannabis.temporal.Instant created = 98;</code>
   */
  boolean hasCreated();
  /**
   * <pre>
   * Timestamp for when this inventory state entry was created. Set after initially saving an inventory state checkin.
   * </pre>
   *
   * <code>.opencannabis.temporal.Instant created = 98;</code>
   */
  io.opencannabis.schema.temporal.TemporalInstant.Instant getCreated();
  /**
   * <pre>
   * Timestamp for when this inventory state entry was created. Set after initially saving an inventory state checkin.
   * </pre>
   *
   * <code>.opencannabis.temporal.Instant created = 98;</code>
   */
  io.opencannabis.schema.temporal.TemporalInstant.InstantOrBuilder getCreatedOrBuilder();

  /**
   * <pre>
   * Timestamp for when this inventory state entry was updated, if applicable. Set after saving an existing inventory
   * state checkin.
   * </pre>
   *
   * <code>.opencannabis.temporal.Instant modified = 99;</code>
   */
  boolean hasModified();
  /**
   * <pre>
   * Timestamp for when this inventory state entry was updated, if applicable. Set after saving an existing inventory
   * state checkin.
   * </pre>
   *
   * <code>.opencannabis.temporal.Instant modified = 99;</code>
   */
  io.opencannabis.schema.temporal.TemporalInstant.Instant getModified();
  /**
   * <pre>
   * Timestamp for when this inventory state entry was updated, if applicable. Set after saving an existing inventory
   * state checkin.
   * </pre>
   *
   * <code>.opencannabis.temporal.Instant modified = 99;</code>
   */
  io.opencannabis.schema.temporal.TemporalInstant.InstantOrBuilder getModifiedOrBuilder();
}
