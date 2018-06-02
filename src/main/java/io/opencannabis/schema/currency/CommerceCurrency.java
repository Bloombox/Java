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
// source: commerce/Currency.proto

package io.opencannabis.schema.currency;

public final class CommerceCurrency {
  private CommerceCurrency() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_commerce_CurrencyValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_commerce_CurrencyValue_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027commerce/Currency.proto\022\025opencannabis." +
      "commerce\"\240\001\n\rCurrencyValue\022\r\n\005value\030\001 \001(" +
      "\002\0221\n\004type\030\002 \001(\0162#.opencannabis.commerce." +
      "CurrencyType\0223\n\004fiat\030\n \001(\0162#.opencannabi" +
      "s.commerce.FiatCurrencyH\000\022\020\n\006custom\030d \001(" +
      "\tH\000B\006\n\004spec*.\n\014CurrencyType\022\010\n\004FIAT\020\000\022\010\n" +
      "\004REAL\020\001\022\n\n\006CRYPTO\020\002*\027\n\014FiatCurrency\022\007\n\003U" +
      "SD\020\000B=\n\037io.opencannabis.schema.currencyB" +
      "\020CommerceCurrencyH\001P\001\242\002\003OCSb\006proto3"
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
        }, assigner);
    internal_static_opencannabis_commerce_CurrencyValue_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opencannabis_commerce_CurrencyValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_commerce_CurrencyValue_descriptor,
        new java.lang.String[] { "Value", "Type", "Fiat", "Custom", "Spec", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
