/*
 * Copyright 2017, Bloombox, LLC. All rights reserved.
 *
 * Source and object computer code contained herein is the private intellectual property
 * of Bloombox, a California Limited Liability Corporation. Use of this code in source form
 * requires permission in writing before use or the publishing of derivative works, for
 * commercial purposes or any other purpose, from a duly authorized officer of Momentum
 * Ideas Co.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: telemetry/v1beta2/commerce/SectionEvents_Beta2.proto

package io.bloombox.schema.services.telemetry.v1beta2;

public final class SectionEventsBeta2 {
  private SectionEventsBeta2() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_telemetry_v1beta2_SectionImpression_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_telemetry_v1beta2_SectionImpression_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_telemetry_v1beta2_SectionView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_telemetry_v1beta2_SectionView_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_telemetry_v1beta2_SectionAction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_telemetry_v1beta2_SectionAction_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4telemetry/v1beta2/commerce/SectionEven" +
      "ts_Beta2.proto\022\032services.telemetry.v1bet" +
      "a2\032\027analytics/Context.proto\032)analytics/c" +
      "ommerce/SectionAnalytics.proto\"k\n\021Sectio" +
      "nImpression\022#\n\007context\030\001 \001(\0132\022.analytics" +
      ".Context\0221\n\nimpression\030\002 \001(\0132\035.analytics" +
      ".section.Impression\"Y\n\013SectionView\022#\n\007co" +
      "ntext\030\001 \001(\0132\022.analytics.Context\022%\n\004view\030" +
      "\002 \001(\0132\027.analytics.section.View\"_\n\rSectio" +
      "nAction\022#\n\007context\030\001 \001(\0132\022.analytics.Con",
      "text\022)\n\006action\030\002 \001(\0132\031.analytics.section" +
      ".ActionBG\n-io.bloombox.schema.services.t" +
      "elemetry.v1beta2H\001P\001\252\002\021Telemetry.v1beta2" +
      "b\006proto3"
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
          io.bloombox.schema.analytics.section.SectionAnalytics.getDescriptor(),
        }, assigner);
    internal_static_services_telemetry_v1beta2_SectionImpression_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_services_telemetry_v1beta2_SectionImpression_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_telemetry_v1beta2_SectionImpression_descriptor,
        new java.lang.String[] { "Context", "Impression", });
    internal_static_services_telemetry_v1beta2_SectionView_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_services_telemetry_v1beta2_SectionView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_telemetry_v1beta2_SectionView_descriptor,
        new java.lang.String[] { "Context", "View", });
    internal_static_services_telemetry_v1beta2_SectionAction_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_services_telemetry_v1beta2_SectionAction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_telemetry_v1beta2_SectionAction_descriptor,
        new java.lang.String[] { "Context", "Action", });
    io.bloombox.schema.telemetry.AnalyticsContext.getDescriptor();
    io.bloombox.schema.analytics.section.SectionAnalytics.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
