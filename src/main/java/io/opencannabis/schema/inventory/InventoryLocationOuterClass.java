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

public final class InventoryLocationOuterClass {
  private InventoryLocationOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_inventory_InventoryLocationKey_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_inventory_InventoryLocationKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_inventory_InventoryLocation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_inventory_InventoryLocation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_inventory_InventoryBinding_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_inventory_InventoryBinding_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!inventory/InventoryLocation.proto\022\026ope" +
      "ncannabis.inventory\032\024core/Datamodel.prot" +
      "o\032\031contact/ContactInfo.proto\032 inventory/" +
      "InventoryProduct.proto\"O\n\024InventoryLocat" +
      "ionKey\022\024\n\004uuid\030\001 \001(\tB\006\302\265\003\002\010\002\022\017\n\007partner\030" +
      "\002 \001(\t\022\020\n\010location\030\003 \001(\t\"\325\001\n\021InventoryLoc" +
      "ation\022A\n\003key\030\001 \001(\0132,.opencannabis.invent" +
      "ory.InventoryLocationKeyB\006\302\265\003\002\010\001\022;\n\004type" +
      "\030\002 \001(\0162-.opencannabis.inventory.Inventor" +
      "yLocationType\022\014\n\004name\030\003 \001(\t\0222\n\007contact\030\004" +
      " \001(\0132!.opencannabis.contact.ContactInfo\"" +
      "\211\001\n\020InventoryBinding\022=\n\007held_by\030\001 \001(\0132,." +
      "opencannabis.inventory.InventoryLocation" +
      "Key\0226\n\004item\030\002 \001(\0132(.opencannabis.invento" +
      "ry.InventoryProduct*B\n\025InventoryLocation" +
      "Type\022\n\n\006RETAIL\020\000\022\r\n\tWAREHOUSE\020\001\022\016\n\nPRODU" +
      "CTION\020\002B,\n io.opencannabis.schema.invent" +
      "oryH\001P\001\242\002\003OCSb\006proto3"
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
          io.opencannabis.schema.contact.GenericContact.getDescriptor(),
          io.opencannabis.schema.inventory.InventoryProductOuterClass.getDescriptor(),
        }, assigner);
    internal_static_opencannabis_inventory_InventoryLocationKey_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opencannabis_inventory_InventoryLocationKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_inventory_InventoryLocationKey_descriptor,
        new java.lang.String[] { "Uuid", "Partner", "Location", });
    internal_static_opencannabis_inventory_InventoryLocation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opencannabis_inventory_InventoryLocation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_inventory_InventoryLocation_descriptor,
        new java.lang.String[] { "Key", "Type", "Name", "Contact", });
    internal_static_opencannabis_inventory_InventoryBinding_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_opencannabis_inventory_InventoryBinding_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_inventory_InventoryBinding_descriptor,
        new java.lang.String[] { "HeldBy", "Item", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(core.Datamodel.field);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    core.Datamodel.getDescriptor();
    io.opencannabis.schema.contact.GenericContact.getDescriptor();
    io.opencannabis.schema.inventory.InventoryProductOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
