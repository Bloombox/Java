/*
 * Copyright 2018, Bloombox, LLC. All rights reserved.
 *
 * Source and object computer code contained herein is the private intellectual
 * property of Bloombox, a California Limited Liability Corporation. Use of this
 * code in source form requires permission in writing before use or the
 * assembly, distribution, or publishing of derivative works, for commercial
 * purposes or any other purpose, from a duly authorized officer of Momentum
 * Ideas Co.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: telemetry/v1beta3/GenericEvents_Beta3.proto

package io.bloombox.schema.services.telemetry.v1beta3;

public final class GenericEventsBeta3 {
  private GenericEventsBeta3() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_telemetry_v1beta3_Event_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_telemetry_v1beta3_Event_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_telemetry_v1beta3_Event_Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_telemetry_v1beta3_Event_Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_telemetry_v1beta3_Event_Batch_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_telemetry_v1beta3_Event_Batch_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_telemetry_v1beta3_Event_BatchRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_telemetry_v1beta3_Event_BatchRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_telemetry_v1beta3_Exception_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_telemetry_v1beta3_Exception_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+telemetry/v1beta3/GenericEvents_Beta3." +
      "proto\022\032services.telemetry.v1beta3\032\027analy" +
      "tics/Context.proto\032\035analytics/generic/Ev" +
      "ent.proto\032!analytics/generic/Exception.p" +
      "roto\"\215\002\n\005Event\032e\n\007Request\022#\n\007context\030\001 \001" +
      "(\0132\022.analytics.Context\022\'\n\005event\030\002 \001(\0132\030." +
      "analytics.generic.Event\022\014\n\004uuid\030\003 \001(\t\0320\n" +
      "\005Batch\022\'\n\005event\030\002 \003(\0132\030.analytics.generi" +
      "c.Event\032k\n\014BatchRequest\022#\n\007context\030\001 \001(\013" +
      "2\022.analytics.Context\0226\n\005batch\030\002 \003(\0132\'.se" +
      "rvices.telemetry.v1beta3.Event.Batch\"k\n\t" +
      "Exception\022#\n\007context\030\001 \001(\0132\022.analytics.C" +
      "ontext\022+\n\005error\030\002 \001(\0132\034.analytics.generi" +
      "c.Exception\022\014\n\004uuid\030\003 \001(\tBG\n-io.bloombox" +
      ".schema.services.telemetry.v1beta3H\001P\001\252\002" +
      "\021Telemetry.v1beta3b\006proto3"
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
          io.bloombox.schema.telemetry.AnalyticsEvent.getDescriptor(),
          io.bloombox.schema.telemetry.AnalyticsException.getDescriptor(),
        }, assigner);
    internal_static_services_telemetry_v1beta3_Event_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_services_telemetry_v1beta3_Event_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_telemetry_v1beta3_Event_descriptor,
        new java.lang.String[] { });
    internal_static_services_telemetry_v1beta3_Event_Request_descriptor =
      internal_static_services_telemetry_v1beta3_Event_descriptor.getNestedTypes().get(0);
    internal_static_services_telemetry_v1beta3_Event_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_telemetry_v1beta3_Event_Request_descriptor,
        new java.lang.String[] { "Context", "Event", "Uuid", });
    internal_static_services_telemetry_v1beta3_Event_Batch_descriptor =
      internal_static_services_telemetry_v1beta3_Event_descriptor.getNestedTypes().get(1);
    internal_static_services_telemetry_v1beta3_Event_Batch_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_telemetry_v1beta3_Event_Batch_descriptor,
        new java.lang.String[] { "Event", });
    internal_static_services_telemetry_v1beta3_Event_BatchRequest_descriptor =
      internal_static_services_telemetry_v1beta3_Event_descriptor.getNestedTypes().get(2);
    internal_static_services_telemetry_v1beta3_Event_BatchRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_telemetry_v1beta3_Event_BatchRequest_descriptor,
        new java.lang.String[] { "Context", "Batch", });
    internal_static_services_telemetry_v1beta3_Exception_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_services_telemetry_v1beta3_Exception_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_telemetry_v1beta3_Exception_descriptor,
        new java.lang.String[] { "Context", "Error", "Uuid", });
    io.bloombox.schema.telemetry.AnalyticsContext.getDescriptor();
    io.bloombox.schema.telemetry.AnalyticsEvent.getDescriptor();
    io.bloombox.schema.telemetry.AnalyticsException.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
