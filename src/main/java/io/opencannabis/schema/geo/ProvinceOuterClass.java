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
// source: geo/Province.proto

package io.opencannabis.schema.geo;

public final class ProvinceOuterClass {
  private ProvinceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_geo_Province_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_geo_Province_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022geo/Province.proto\022\020opencannabis.geo\032\021" +
      "geo/USState.proto\"V\n\010Province\022.\n\005state\030\001" +
      " \001(\0162\035.opencannabis.geo.usa.USStateH\000\022\022\n" +
      "\010province\030\002 \001(\tH\000B\006\n\004specB&\n\032io.opencann" +
      "abis.schema.geoH\001P\001\242\002\003OCSb\006proto3"
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
          io.opencannabis.schema.geo.usa.USStateOuterClass.getDescriptor(),
        }, assigner);
    internal_static_opencannabis_geo_Province_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opencannabis_geo_Province_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_geo_Province_descriptor,
        new java.lang.String[] { "State", "Province", "Spec", });
    io.opencannabis.schema.geo.usa.USStateOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
