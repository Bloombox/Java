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
// source: geo/Address.proto

package io.opencannabis.schema.geo;

public final class AddressOuterClass {
  private AddressOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_geo_Address_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_geo_Address_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021geo/Address.proto\022\020opencannabis.geo\032\016b" +
      "q_field.proto\"\277\003\n\007Address\0221\n\nfirst_line\030" +
      "\001 \001(\tB\035\212@\032First line of the address.\022B\n\013" +
      "second_line\030\002 \001(\tB-\212@*Second line of the" +
      " address, if applicable.\022;\n\004city\030\003 \001(\tB-" +
      "\212@*City or municipality name for the add" +
      "ress.\022P\n\005state\030\004 \001(\tBA\212@>State that cont" +
      "ains the city or municipality for this a" +
      "ddress.\022>\n\007zipcode\030\005 \001(\tB-\212@*USPS zipcod" +
      "e associated with this address.\022n\n\007count" +
      "ry\030\006 \001(\tB]\212@ZCountry code associated wit" +
      "h this address (\'US\' or \'USA\' for United" +
      " States, for instance).B&\n\032io.opencannab" +
      "is.schema.geoH\001P\001\242\002\003OCSb\006proto3"
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
          gen_bq_schema.BqField.getDescriptor(),
        }, assigner);
    internal_static_opencannabis_geo_Address_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opencannabis_geo_Address_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_geo_Address_descriptor,
        new java.lang.String[] { "FirstLine", "SecondLine", "City", "State", "Zipcode", "Country", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(gen_bq_schema.BqField.description);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    gen_bq_schema.BqField.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
