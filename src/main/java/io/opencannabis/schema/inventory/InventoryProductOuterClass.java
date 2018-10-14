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

public final class InventoryProductOuterClass {
  private InventoryProductOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_inventory_InventoryKey_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_inventory_InventoryKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_inventory_InventoryCoordinates_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_inventory_InventoryCoordinates_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_inventory_InventoryAmount_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_inventory_InventoryAmount_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_inventory_InventoryState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_inventory_InventoryState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_inventory_InventoryProduct_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_inventory_InventoryProduct_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n inventory/InventoryProduct.proto\022\026open" +
      "cannabis.inventory\032\024core/Datamodel.proto" +
      "\032\025base/ProductKey.proto\032\026temporal/Instan" +
      "t.proto\032\023commerce/Item.proto\032\030products/m" +
      "enu/Menu.proto\032\'structs/pricing/PricingD" +
      "escriptor.proto\"P\n\014InventoryKey\0222\n\003key\030\001" +
      " \001(\0132\035.opencannabis.base.ProductKeyB\006\302\265\003" +
      "\002\010\001\022\014\n\004uuid\030\002 \001(\t\"o\n\024InventoryCoordinate" +
      "s\022\020\n\010location\030\001 \001(\t\022\014\n\004zone\030\002 \001(\t\022\014\n\004rac" +
      "k\030\003 \001(\t\022\r\n\005shelf\030\004 \001(\t\022\013\n\003bin\030\005 \001(\t\022\r\n\005b" +
      "atch\030\006 \001(\t\"\270\001\n\017InventoryAmount\0227\n\004type\030\001" +
      " \001(\0162).opencannabis.structs.pricing.Pric" +
      "ingType\022\016\n\004unit\030\002 \001(\010H\000\022A\n\006weight\030\003 \001(\0162" +
      "/.opencannabis.structs.pricing.PricingWe" +
      "ightTierH\000\022\020\n\010quantity\030\004 \001(\004B\007\n\005basis\"\266\003" +
      "\n\016InventoryState\022=\n\006status\030\001 \001(\0162-.openc" +
      "annabis.inventory.InventoryState.Status\022" +
      "A\n\013coordinates\030\002 \001(\0132,.opencannabis.inve" +
      "ntory.InventoryCoordinates\022\024\n\014fit_for_sa" +
      "le\030\003 \001(\010\0227\n\006amount\030\004 \001(\0132\'.opencannabis." +
      "inventory.InventoryAmount\022/\n\007created\030b \001" +
      "(\0132\036.opencannabis.temporal.Instant\0220\n\010mo" +
      "dified\030c \001(\0132\036.opencannabis.temporal.Ins" +
      "tant\"p\n\006Status\022\020\n\014UNRECONCILED\020\000\022\r\n\tRECE" +
      "IVING\020\001\022\016\n\nQUARANTINE\020\002\022\013\n\007ON_HAND\020\003\022\014\n\010" +
      "FOR_SALE\020\004\022\013\n\007CLAIMED\020\005\022\r\n\tCOMMITTED\020\006\"\301" +
      "\002\n\020InventoryProduct\0221\n\003key\030\001 \001(\0132$.openc" +
      "annabis.inventory.InventoryKey\022\013\n\003sku\030\002 " +
      "\003(\t\0223\n\007variant\030\003 \003(\0132\".opencannabis.comm" +
      "erce.VariantSpec\0225\n\005state\030\n \001(\0132&.openca" +
      "nnabis.inventory.InventoryState\0227\n\007histo" +
      "ry\030\013 \003(\0132&.opencannabis.inventory.Invent" +
      "oryState\0225\n\004item\030\024 \001(\0132\'.opencannabis.pr" +
      "oducts.menu.MenuProduct:\021\202\367\002\r\010\002\022\tinvento" +
      "ryB,\n io.opencannabis.schema.inventoryH\001" +
      "P\001\242\002\003OCSb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          core.Datamodel.getDescriptor(),
          io.opencannabis.schema.base.BaseProductKey.getDescriptor(),
          io.opencannabis.schema.temporal.TemporalInstant.getDescriptor(),
          io.opencannabis.schema.commerce.OrderItem.getDescriptor(),
          io.opencannabis.schema.menu.MenuOuterClass.getDescriptor(),
          io.opencannabis.schema.product.struct.ProductPricingSpec.getDescriptor(),
        }, assigner);
    internal_static_opencannabis_inventory_InventoryKey_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opencannabis_inventory_InventoryKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_inventory_InventoryKey_descriptor,
        new java.lang.String[] { "Key", "Uuid", });
    internal_static_opencannabis_inventory_InventoryCoordinates_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opencannabis_inventory_InventoryCoordinates_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_inventory_InventoryCoordinates_descriptor,
        new java.lang.String[] { "Location", "Zone", "Rack", "Shelf", "Bin", "Batch", });
    internal_static_opencannabis_inventory_InventoryAmount_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_opencannabis_inventory_InventoryAmount_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_inventory_InventoryAmount_descriptor,
        new java.lang.String[] { "Type", "Unit", "Weight", "Quantity", "Basis", });
    internal_static_opencannabis_inventory_InventoryState_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_opencannabis_inventory_InventoryState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_inventory_InventoryState_descriptor,
        new java.lang.String[] { "Status", "Coordinates", "FitForSale", "Amount", "Created", "Modified", });
    internal_static_opencannabis_inventory_InventoryProduct_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_opencannabis_inventory_InventoryProduct_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_inventory_InventoryProduct_descriptor,
        new java.lang.String[] { "Key", "Sku", "Variant", "State", "History", "Item", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(core.Datamodel.db);
    registry.add(core.Datamodel.field);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    core.Datamodel.getDescriptor();
    io.opencannabis.schema.base.BaseProductKey.getDescriptor();
    io.opencannabis.schema.temporal.TemporalInstant.getDescriptor();
    io.opencannabis.schema.commerce.OrderItem.getDescriptor();
    io.opencannabis.schema.menu.MenuOuterClass.getDescriptor();
    io.opencannabis.schema.product.struct.ProductPricingSpec.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
