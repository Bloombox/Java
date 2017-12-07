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
// source: telemetry/v1beta2/commerce/OrderEvents_Beta2.proto

package io.bloombox.schema.services.telemetry.v1beta2;

public final class OrderEventsBeta2 {
  private OrderEventsBeta2() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_telemetry_v1beta2_OrderAction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_telemetry_v1beta2_OrderAction_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2telemetry/v1beta2/commerce/OrderEvents" +
      "_Beta2.proto\022\032services.telemetry.v1beta2" +
      "\032\027analytics/Context.proto\032\'analytics/com" +
      "merce/OrderAnalytics.proto\"[\n\013OrderActio" +
      "n\022#\n\007context\030\001 \001(\0132\022.analytics.Context\022\'" +
      "\n\006action\030\002 \001(\0132\027.analytics.order.ActionB" +
      "G\n-io.bloombox.schema.services.telemetry" +
      ".v1beta2H\001P\001\252\002\021Telemetry.v1beta2b\006proto3"
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
          io.bloombox.schema.telemetry.AnalyticsContext.getDescriptor(),
          io.bloombox.schema.analytics.order.OrderAnalytics.getDescriptor(),
        }, assigner);
    internal_static_services_telemetry_v1beta2_OrderAction_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_services_telemetry_v1beta2_OrderAction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_telemetry_v1beta2_OrderAction_descriptor,
        new java.lang.String[] { "Context", "Action", });
    io.bloombox.schema.telemetry.AnalyticsContext.getDescriptor();
    io.bloombox.schema.analytics.order.OrderAnalytics.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
