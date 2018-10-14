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
// source: inventory/InventoryLocation.proto

package io.opencannabis.schema.inventory;

public interface InventoryBindingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opencannabis.inventory.InventoryBinding)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Inventory location.
   * </pre>
   *
   * <code>.opencannabis.inventory.InventoryLocationKey held_by = 1;</code>
   */
  boolean hasHeldBy();
  /**
   * <pre>
   * Inventory location.
   * </pre>
   *
   * <code>.opencannabis.inventory.InventoryLocationKey held_by = 1;</code>
   */
  io.opencannabis.schema.inventory.InventoryLocationKey getHeldBy();
  /**
   * <pre>
   * Inventory location.
   * </pre>
   *
   * <code>.opencannabis.inventory.InventoryLocationKey held_by = 1;</code>
   */
  io.opencannabis.schema.inventory.InventoryLocationKeyOrBuilder getHeldByOrBuilder();

  /**
   * <pre>
   * Item held in inventory at the subject location.
   * </pre>
   *
   * <code>.opencannabis.inventory.InventoryProduct item = 2;</code>
   */
  boolean hasItem();
  /**
   * <pre>
   * Item held in inventory at the subject location.
   * </pre>
   *
   * <code>.opencannabis.inventory.InventoryProduct item = 2;</code>
   */
  io.opencannabis.schema.inventory.InventoryProduct getItem();
  /**
   * <pre>
   * Item held in inventory at the subject location.
   * </pre>
   *
   * <code>.opencannabis.inventory.InventoryProduct item = 2;</code>
   */
  io.opencannabis.schema.inventory.InventoryProductOrBuilder getItemOrBuilder();
}
