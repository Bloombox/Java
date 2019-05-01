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
// source: geo/Geohash.proto

package io.opencannabis.schema.geo;

public final class GeohashOuterClass {
  private GeohashOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_geo_Geohash_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_geo_Geohash_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021geo/Geohash.proto\022\020opencannabis.geo\032\016b" +
      "q_field.proto\032\022geo/Distance.proto\"\205\002\n\007Ge" +
      "ohash\022D\n\tcomponent\030\001 \003(\tB1\212@.Entire stri" +
      "ng, and substrings, of the geohash.\022R\n\te" +
      "levation\030\002 \001(\0132\032.opencannabis.geo.Distan" +
      "ceB#\212@ Elevation of this point, if any.\022" +
      "`\n\010accuracy\030\003 \001(\0132\032.opencannabis.geo.Dis" +
      "tanceB2\212@/Accuracy rating attached to th" +
      "is point, if any.B&\n\032io.opencannabis.sch" +
      "ema.geoH\001P\001\242\002\003OCSb\006proto3"
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
          io.opencannabis.schema.geo.DistanceOuterClass.getDescriptor(),
        }, assigner);
    internal_static_opencannabis_geo_Geohash_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opencannabis_geo_Geohash_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_geo_Geohash_descriptor,
        new java.lang.String[] { "Component", "Elevation", "Accuracy", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(gen_bq_schema.BqField.description);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    gen_bq_schema.BqField.getDescriptor();
    io.opencannabis.schema.geo.DistanceOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
