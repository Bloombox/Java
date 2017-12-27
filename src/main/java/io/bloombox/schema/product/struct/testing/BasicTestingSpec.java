/*
 * Copyright 2017, Bloombox, LLC.
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
// source: structs/labtesting/BasicTestResults.proto

package io.bloombox.schema.product.struct.testing;

public final class BasicTestingSpec {
  private BasicTestingSpec() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_structs_labtesting_BasicTestResults_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_structs_labtesting_BasicTestResults_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)structs/labtesting/BasicTestResults.pr" +
      "oto\022\022structs.labtesting\032\026temporal/Instan" +
      "t.proto\032\"structs/labtesting/TestValue.pr" +
      "oto\032$structs/labtesting/TestResults.prot" +
      "o\"\350\001\n\020BasicTestResults\022\021\n\tavailable\030\001 \001(" +
      "\010\022,\n\005media\030\002 \003(\0132\035.structs.labtesting.Te" +
      "stMedia\022\'\n\014last_updated\030\003 \001(\0132\021.temporal" +
      ".Instant\0226\n\014cannabinoids\030\024 \001(\0132 .structs" +
      ".labtesting.Cannabinoids\0222\n\nsubjective\030\036" +
      " \001(\0132\036.structs.labtesting.SubjectiveBD\n)" +
      "io.bloombox.schema.product.struct.testin" +
      "gB\020BasicTestingSpecH\001P\001\370\001\001b\006proto3"
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
          io.bloombox.schema.temporal.InstantOuterClass.getDescriptor(),
          io.bloombox.schema.product.struct.testing.BaseTestingSpec.getDescriptor(),
          io.bloombox.schema.product.struct.testing.LabTesting.getDescriptor(),
        }, assigner);
    internal_static_structs_labtesting_BasicTestResults_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_structs_labtesting_BasicTestResults_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_structs_labtesting_BasicTestResults_descriptor,
        new java.lang.String[] { "Available", "Media", "LastUpdated", "Cannabinoids", "Subjective", });
    io.bloombox.schema.temporal.InstantOuterClass.getDescriptor();
    io.bloombox.schema.product.struct.testing.BaseTestingSpec.getDescriptor();
    io.bloombox.schema.product.struct.testing.LabTesting.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
