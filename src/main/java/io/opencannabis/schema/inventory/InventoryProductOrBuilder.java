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
// source: inventory/InventoryProduct.proto

package io.opencannabis.schema.inventory;

public interface InventoryProductOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opencannabis.inventory.InventoryProduct)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Key for this inventory item. Uniquely identifies the subject inventoried product, along with a globally-unique ID,
   * which is set upon inventory item allocation (either provided explicitly or auto-generated).
   * </pre>
   *
   * <code>.opencannabis.inventory.InventoryKey key = 1;</code>
   */
  boolean hasKey();
  /**
   * <pre>
   * Key for this inventory item. Uniquely identifies the subject inventoried product, along with a globally-unique ID,
   * which is set upon inventory item allocation (either provided explicitly or auto-generated).
   * </pre>
   *
   * <code>.opencannabis.inventory.InventoryKey key = 1;</code>
   */
  io.opencannabis.schema.inventory.InventoryKey getKey();
  /**
   * <pre>
   * Key for this inventory item. Uniquely identifies the subject inventoried product, along with a globally-unique ID,
   * which is set upon inventory item allocation (either provided explicitly or auto-generated).
   * </pre>
   *
   * <code>.opencannabis.inventory.InventoryKey key = 1;</code>
   */
  io.opencannabis.schema.inventory.InventoryKeyOrBuilder getKeyOrBuilder();

  /**
   * <pre>
   * SKUs that should reference this inventory product. These are arbitrary strings that should map to this inventory
   * item, potentially to/from foreign or 3rd-party systems.
   * </pre>
   *
   * <code>repeated string sku = 2;</code>
   */
  java.util.List<java.lang.String>
      getSkuList();
  /**
   * <pre>
   * SKUs that should reference this inventory product. These are arbitrary strings that should map to this inventory
   * item, potentially to/from foreign or 3rd-party systems.
   * </pre>
   *
   * <code>repeated string sku = 2;</code>
   */
  int getSkuCount();
  /**
   * <pre>
   * SKUs that should reference this inventory product. These are arbitrary strings that should map to this inventory
   * item, potentially to/from foreign or 3rd-party systems.
   * </pre>
   *
   * <code>repeated string sku = 2;</code>
   */
  java.lang.String getSku(int index);
  /**
   * <pre>
   * SKUs that should reference this inventory product. These are arbitrary strings that should map to this inventory
   * item, potentially to/from foreign or 3rd-party systems.
   * </pre>
   *
   * <code>repeated string sku = 2;</code>
   */
  com.google.protobuf.ByteString
      getSkuBytes(int index);

  /**
   * <pre>
   * Product variance specifications. Each variant spec describes a variance property and value for this product.
   * Variance specifies how this particular batch of inventory is concretely parameterized, i.e., the "color" and "red"
   * in "these hats are the color red."
   * </pre>
   *
   * <code>repeated .opencannabis.commerce.VariantSpec variant = 3;</code>
   */
  java.util.List<io.opencannabis.schema.commerce.OrderItem.VariantSpec> 
      getVariantList();
  /**
   * <pre>
   * Product variance specifications. Each variant spec describes a variance property and value for this product.
   * Variance specifies how this particular batch of inventory is concretely parameterized, i.e., the "color" and "red"
   * in "these hats are the color red."
   * </pre>
   *
   * <code>repeated .opencannabis.commerce.VariantSpec variant = 3;</code>
   */
  io.opencannabis.schema.commerce.OrderItem.VariantSpec getVariant(int index);
  /**
   * <pre>
   * Product variance specifications. Each variant spec describes a variance property and value for this product.
   * Variance specifies how this particular batch of inventory is concretely parameterized, i.e., the "color" and "red"
   * in "these hats are the color red."
   * </pre>
   *
   * <code>repeated .opencannabis.commerce.VariantSpec variant = 3;</code>
   */
  int getVariantCount();
  /**
   * <pre>
   * Product variance specifications. Each variant spec describes a variance property and value for this product.
   * Variance specifies how this particular batch of inventory is concretely parameterized, i.e., the "color" and "red"
   * in "these hats are the color red."
   * </pre>
   *
   * <code>repeated .opencannabis.commerce.VariantSpec variant = 3;</code>
   */
  java.util.List<? extends io.opencannabis.schema.commerce.OrderItem.VariantSpecOrBuilder> 
      getVariantOrBuilderList();
  /**
   * <pre>
   * Product variance specifications. Each variant spec describes a variance property and value for this product.
   * Variance specifies how this particular batch of inventory is concretely parameterized, i.e., the "color" and "red"
   * in "these hats are the color red."
   * </pre>
   *
   * <code>repeated .opencannabis.commerce.VariantSpec variant = 3;</code>
   */
  io.opencannabis.schema.commerce.OrderItem.VariantSpecOrBuilder getVariantOrBuilder(
      int index);

  /**
   * <pre>
   * Current/active state for this inventory product. This includes the active status and coordinates for the item, with
   * timestamping information detailing when the status last changed.
   * </pre>
   *
   * <code>.opencannabis.inventory.InventoryState state = 10;</code>
   */
  boolean hasState();
  /**
   * <pre>
   * Current/active state for this inventory product. This includes the active status and coordinates for the item, with
   * timestamping information detailing when the status last changed.
   * </pre>
   *
   * <code>.opencannabis.inventory.InventoryState state = 10;</code>
   */
  io.opencannabis.schema.inventory.InventoryState getState();
  /**
   * <pre>
   * Current/active state for this inventory product. This includes the active status and coordinates for the item, with
   * timestamping information detailing when the status last changed.
   * </pre>
   *
   * <code>.opencannabis.inventory.InventoryState state = 10;</code>
   */
  io.opencannabis.schema.inventory.InventoryStateOrBuilder getStateOrBuilder();

  /**
   * <pre>
   * Full history for an inventory product, including every inventory state for the item since its creation. Every item
   * in inventory begins with exactly one history entry, stored in the `state` property. Once a second history entry is
   * added for the inventory item, `history` is initialized with the old state as the first item, and `state` is
   * replaced with the new state.
   * </pre>
   *
   * <code>repeated .opencannabis.inventory.InventoryState history = 11;</code>
   */
  java.util.List<io.opencannabis.schema.inventory.InventoryState> 
      getHistoryList();
  /**
   * <pre>
   * Full history for an inventory product, including every inventory state for the item since its creation. Every item
   * in inventory begins with exactly one history entry, stored in the `state` property. Once a second history entry is
   * added for the inventory item, `history` is initialized with the old state as the first item, and `state` is
   * replaced with the new state.
   * </pre>
   *
   * <code>repeated .opencannabis.inventory.InventoryState history = 11;</code>
   */
  io.opencannabis.schema.inventory.InventoryState getHistory(int index);
  /**
   * <pre>
   * Full history for an inventory product, including every inventory state for the item since its creation. Every item
   * in inventory begins with exactly one history entry, stored in the `state` property. Once a second history entry is
   * added for the inventory item, `history` is initialized with the old state as the first item, and `state` is
   * replaced with the new state.
   * </pre>
   *
   * <code>repeated .opencannabis.inventory.InventoryState history = 11;</code>
   */
  int getHistoryCount();
  /**
   * <pre>
   * Full history for an inventory product, including every inventory state for the item since its creation. Every item
   * in inventory begins with exactly one history entry, stored in the `state` property. Once a second history entry is
   * added for the inventory item, `history` is initialized with the old state as the first item, and `state` is
   * replaced with the new state.
   * </pre>
   *
   * <code>repeated .opencannabis.inventory.InventoryState history = 11;</code>
   */
  java.util.List<? extends io.opencannabis.schema.inventory.InventoryStateOrBuilder> 
      getHistoryOrBuilderList();
  /**
   * <pre>
   * Full history for an inventory product, including every inventory state for the item since its creation. Every item
   * in inventory begins with exactly one history entry, stored in the `state` property. Once a second history entry is
   * added for the inventory item, `history` is initialized with the old state as the first item, and `state` is
   * replaced with the new state.
   * </pre>
   *
   * <code>repeated .opencannabis.inventory.InventoryState history = 11;</code>
   */
  io.opencannabis.schema.inventory.InventoryStateOrBuilder getHistoryOrBuilder(
      int index);

  /**
   * <pre>
   * Holds a menu product, including all referenced content, retail-side pricing, materials information (including test
   * results), and so on.
   * </pre>
   *
   * <code>.opencannabis.products.menu.MenuProduct item = 20;</code>
   */
  boolean hasItem();
  /**
   * <pre>
   * Holds a menu product, including all referenced content, retail-side pricing, materials information (including test
   * results), and so on.
   * </pre>
   *
   * <code>.opencannabis.products.menu.MenuProduct item = 20;</code>
   */
  io.opencannabis.schema.menu.MenuProduct getItem();
  /**
   * <pre>
   * Holds a menu product, including all referenced content, retail-side pricing, materials information (including test
   * results), and so on.
   * </pre>
   *
   * <code>.opencannabis.products.menu.MenuProduct item = 20;</code>
   */
  io.opencannabis.schema.menu.MenuProductOrBuilder getItemOrBuilder();
}
