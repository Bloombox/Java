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
// source: telemetry/v1beta2/TelemetryService_Beta2.proto

package io.bloombox.schema.services.telemetry.v1beta2;

public final class TelemetryServiceBeta2 {
  private TelemetryServiceBeta2() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_telemetry_v1beta2_TelemetryResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_telemetry_v1beta2_TelemetryResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_telemetry_v1beta2_TelemetryPing_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_telemetry_v1beta2_TelemetryPing_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_telemetry_v1beta2_TelemetryPing_Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_telemetry_v1beta2_TelemetryPing_Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_telemetry_v1beta2_TelemetryPing_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_telemetry_v1beta2_TelemetryPing_Response_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_telemetry_v1beta2_TelemetryPing_Operation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_telemetry_v1beta2_TelemetryPing_Operation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_telemetry_v1beta2_CommercialEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_telemetry_v1beta2_CommercialEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_telemetry_v1beta2_CommercialEvent_Impression_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_telemetry_v1beta2_CommercialEvent_Impression_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_telemetry_v1beta2_CommercialEvent_View_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_telemetry_v1beta2_CommercialEvent_View_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_telemetry_v1beta2_CommercialEvent_Action_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_telemetry_v1beta2_CommercialEvent_Action_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_telemetry_v1beta2_IdentityEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_telemetry_v1beta2_IdentityEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_telemetry_v1beta2_IdentityEvent_Action_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_telemetry_v1beta2_IdentityEvent_Action_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.telemetry/v1beta2/TelemetryService_Bet" +
      "a2.proto\022\032services.telemetry.v1beta2\032\027an" +
      "alytics/Context.proto\032\034services/ServiceS" +
      "tatus.proto\0323telemetry/v1beta2/generic/G" +
      "enericEvents_Beta2.proto\0321telemetry/v1be" +
      "ta2/identity/UserEvents_Beta2.proto\0321tel" +
      "emetry/v1beta2/commerce/ShopEvents_Beta2" +
      ".proto\0322telemetry/v1beta2/commerce/Order" +
      "Events_Beta2.proto\0324telemetry/v1beta2/co" +
      "mmerce/SectionEvents_Beta2.proto\0324teleme" +
      "try/v1beta2/commerce/ProductEvents_Beta2" +
      ".proto\032\033google/protobuf/empty.proto\032\034goo" +
      "gle/api/annotations.proto\"\211\001\n\021TelemetryR" +
      "esponse\022;\n\006status\030\001 \001(\0162+.services.telem" +
      "etry.v1beta2.OperationStatus\022\r\n\005count\030\002 " +
      "\001(\r\022(\n\007service\030\003 \001(\0162\027.services.ServiceS" +
      "tatus\"\214\002\n\rTelemetryPing\032.\n\007Request\022#\n\007co" +
      "ntext\030\001 \001(\0132\022.analytics.Context\0323\n\010Respo" +
      "nse\022\'\n\006status\030\001 \001(\0162\027.services.ServiceSt" +
      "atus\032\225\001\n\tOperation\022B\n\007request\030\001 \001(\01321.se" +
      "rvices.telemetry.v1beta2.TelemetryPing.R" +
      "equest\022D\n\010response\030\002 \001(\01322.services.tele" +
      "metry.v1beta2.TelemetryPing.Response\"\250\006\n" +
      "\017CommercialEvent\032\372\001\n\nImpression\022#\n\007conte" +
      "xt\030\001 \001(\0132\022.analytics.Context\022@\n\007section\030" +
      "\n \001(\0132-.services.telemetry.v1beta2.Secti" +
      "onImpressionH\000\022@\n\007product\030\013 \001(\0132-.servic" +
      "es.telemetry.v1beta2.ProductImpressionH\000" +
      "\022:\n\004shop\030\014 \001(\0132*.services.telemetry.v1be" +
      "ta2.ShopImpressionH\000B\007\n\005event\032\342\001\n\004View\022#" +
      "\n\007context\030\001 \001(\0132\022.analytics.Context\022:\n\007s" +
      "ection\030\n \001(\0132\'.services.telemetry.v1beta" +
      "2.SectionViewH\000\022:\n\007product\030\013 \001(\0132\'.servi" +
      "ces.telemetry.v1beta2.ProductViewH\000\0224\n\004s" +
      "hop\030\014 \001(\0132$.services.telemetry.v1beta2.S" +
      "hopViewH\000B\007\n\005event\032\262\002\n\006Action\022\014\n\004name\030\001 " +
      "\001(\t\022#\n\007context\030\002 \001(\0132\022.analytics.Context" +
      "\022<\n\007section\030\n \001(\0132).services.telemetry.v" +
      "1beta2.SectionActionH\000\022<\n\007product\030\013 \001(\0132" +
      ").services.telemetry.v1beta2.ProductActi" +
      "onH\000\0226\n\004shop\030\014 \001(\0132&.services.telemetry." +
      "v1beta2.ShopActionH\000\0228\n\005order\030\r \001(\0132\'.se" +
      "rvices.telemetry.v1beta2.OrderActionH\000B\007" +
      "\n\005event\"\217\001\n\rIdentityEvent\032~\n\006Action\022\014\n\004n" +
      "ame\030\001 \001(\t\022#\n\007context\030\002 \001(\0132\022.analytics.C" +
      "ontext\0228\n\006action\030\n \001(\0132&.services.teleme" +
      "try.v1beta2.UserActionH\000B\007\n\005event*$\n\017Ope" +
      "rationStatus\022\006\n\002OK\020\000\022\t\n\005ERROR\020\001*\336\001\n\016Tele" +
      "metryError\022\013\n\007UNKNOWN\020\000\022\026\n\022INVALID_COLLE" +
      "CTION\020\001\022\023\n\017INVALID_PARTNER\020\002\022\024\n\020INVALID_" +
      "LOCATION\020\003\022\022\n\016INVALID_DEVICE\020\004\022\020\n\014INVALI" +
      "D_USER\020\005\022\022\n\016INVALID_CLIENT\020\006\022\025\n\021PARTNER_" +
      "NOT_FOUND\020\007\022\026\n\022LOCATION_NOT_FOUND\020\010\022\023\n\017I" +
      "NVALID_PAYLOAD\020c2\235\007\n\016EventTelemetry\022\264\001\n\004" +
      "Ping\0221.services.telemetry.v1beta2.Teleme" +
      "tryPing.Request\0322.services.telemetry.v1b" +
      "eta2.TelemetryPing.Response\"E\202\323\344\223\002?\022\027/te" +
      "lemetry/v1beta2/pingZ$\"\037/telemetry/v1bet" +
      "a2/generic/ping:\001*\022\351\001\n\005Event\022).services." +
      "telemetry.v1beta2.Event.Request\032\026.google" +
      ".protobuf.Empty\"\234\001\202\323\344\223\002\225\001\"3/telemetry/v1" +
      "beta2/events/{context.collection.name}:\001" +
      "*Z[\"V/telemetry/v1beta2/{context.scope.p" +
      "artner=partners/*}/events/{context.colle" +
      "ction.name}:\001*\022\367\001\n\005Batch\022..services.tele" +
      "metry.v1beta2.Event.BatchRequest\032-.servi" +
      "ces.telemetry.v1beta2.TelemetryResponse\"" +
      "\216\001\202\323\344\223\002\207\001\"\037/telemetry/v1beta2/events/bat" +
      "ch:\001*Za\"\\/telemetry/v1beta2/{context.sco" +
      "pe.partner=partners/*}/events/{context.c" +
      "ollection.name}:batch:\001*\022\355\001\n\005Error\022%.ser" +
      "vices.telemetry.v1beta2.Exception\032\026.goog" +
      "le.protobuf.Empty\"\244\001\202\323\344\223\002\235\001\"7/telemetry/" +
      "v1beta2/exceptions/{context.collection.n" +
      "ame}:\001*Z_\"Z/telemetry/v1beta2/{context.s" +
      "cope.partner=partners/*}/exceptions/{con" +
      "text.collection.name}:\001*2\306\006\n\023CommercialT" +
      "elemetry\022\222\002\n\nImpression\0226.services.telem" +
      "etry.v1beta2.CommercialEvent.Impression\032" +
      "\026.google.protobuf.Empty\"\263\001\202\323\344\223\002\254\001\"@/tele" +
      "metry/v1beta2/commerce/{context.scope.co" +
      "mmercial=*}:impress:\001*Ze\022c/telemetry/v1b" +
      "eta2/{context.scope.partner=partners/*}/" +
      "commerce/{context.scope.commercial=*}:im" +
      "press\022\200\002\n\004View\0220.services.telemetry.v1be" +
      "ta2.CommercialEvent.View\032\026.google.protob" +
      "uf.Empty\"\255\001\202\323\344\223\002\246\001\"=/telemetry/v1beta2/c" +
      "ommerce/{context.scope.commercial=*}:vie" +
      "w:\001*Zb\022`/telemetry/v1beta2/{context.scop" +
      "e.partner=partners/*}/commerce/{context." +
      "scope.commercial=*}:view\022\226\002\n\006Action\0222.se" +
      "rvices.telemetry.v1beta2.CommercialEvent" +
      ".Action\032\026.google.protobuf.Empty\"\277\001\202\323\344\223\002\270" +
      "\001\"F/telemetry/v1beta2/commerce/{context." +
      "scope.commercial=*}/action/{name}:\001*Zk\022i" +
      "/telemetry/v1beta2/{context.scope.partne" +
      "r=partners/*}/commerce/{context.scope.co" +
      "mmercial=*}/action/{name}2\226\002\n\021IdentityTe" +
      "lemetry\022\200\002\n\006Action\0220.services.telemetry." +
      "v1beta2.IdentityEvent.Action\032\026.google.pr" +
      "otobuf.Empty\"\253\001\202\323\344\223\002\244\001\"</telemetry/v1bet" +
      "a2/identity/{context.user.uid}/action/{n" +
      "ame}:\001*Za\022_/telemetry/v1beta2/{context.s" +
      "cope.partner=partners/*}/identity/{conte" +
      "xt.user.uid}/action/{name}BG\n-io.bloombo" +
      "x.schema.services.telemetry.v1beta2H\001P\001\252" +
      "\002\021Telemetry.v1beta2b\006proto3"
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
          io.bloombox.schema.services.ServiceStatusOuterClass.getDescriptor(),
          io.bloombox.schema.services.telemetry.v1beta2.GenericEventsBeta2.getDescriptor(),
          io.bloombox.schema.services.telemetry.v1beta2.UserEventsBeta2.getDescriptor(),
          io.bloombox.schema.services.telemetry.v1beta2.ShopEventsBeta2.getDescriptor(),
          io.bloombox.schema.services.telemetry.v1beta2.OrderEventsBeta2.getDescriptor(),
          io.bloombox.schema.services.telemetry.v1beta2.SectionEventsBeta2.getDescriptor(),
          io.bloombox.schema.services.telemetry.v1beta2.ProductEventsBeta2.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_services_telemetry_v1beta2_TelemetryResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_services_telemetry_v1beta2_TelemetryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_telemetry_v1beta2_TelemetryResponse_descriptor,
        new java.lang.String[] { "Status", "Count", "Service", });
    internal_static_services_telemetry_v1beta2_TelemetryPing_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_services_telemetry_v1beta2_TelemetryPing_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_telemetry_v1beta2_TelemetryPing_descriptor,
        new java.lang.String[] { });
    internal_static_services_telemetry_v1beta2_TelemetryPing_Request_descriptor =
      internal_static_services_telemetry_v1beta2_TelemetryPing_descriptor.getNestedTypes().get(0);
    internal_static_services_telemetry_v1beta2_TelemetryPing_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_telemetry_v1beta2_TelemetryPing_Request_descriptor,
        new java.lang.String[] { "Context", });
    internal_static_services_telemetry_v1beta2_TelemetryPing_Response_descriptor =
      internal_static_services_telemetry_v1beta2_TelemetryPing_descriptor.getNestedTypes().get(1);
    internal_static_services_telemetry_v1beta2_TelemetryPing_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_telemetry_v1beta2_TelemetryPing_Response_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_services_telemetry_v1beta2_TelemetryPing_Operation_descriptor =
      internal_static_services_telemetry_v1beta2_TelemetryPing_descriptor.getNestedTypes().get(2);
    internal_static_services_telemetry_v1beta2_TelemetryPing_Operation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_telemetry_v1beta2_TelemetryPing_Operation_descriptor,
        new java.lang.String[] { "Request", "Response", });
    internal_static_services_telemetry_v1beta2_CommercialEvent_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_services_telemetry_v1beta2_CommercialEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_telemetry_v1beta2_CommercialEvent_descriptor,
        new java.lang.String[] { });
    internal_static_services_telemetry_v1beta2_CommercialEvent_Impression_descriptor =
      internal_static_services_telemetry_v1beta2_CommercialEvent_descriptor.getNestedTypes().get(0);
    internal_static_services_telemetry_v1beta2_CommercialEvent_Impression_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_telemetry_v1beta2_CommercialEvent_Impression_descriptor,
        new java.lang.String[] { "Context", "Section", "Product", "Shop", "Event", });
    internal_static_services_telemetry_v1beta2_CommercialEvent_View_descriptor =
      internal_static_services_telemetry_v1beta2_CommercialEvent_descriptor.getNestedTypes().get(1);
    internal_static_services_telemetry_v1beta2_CommercialEvent_View_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_telemetry_v1beta2_CommercialEvent_View_descriptor,
        new java.lang.String[] { "Context", "Section", "Product", "Shop", "Event", });
    internal_static_services_telemetry_v1beta2_CommercialEvent_Action_descriptor =
      internal_static_services_telemetry_v1beta2_CommercialEvent_descriptor.getNestedTypes().get(2);
    internal_static_services_telemetry_v1beta2_CommercialEvent_Action_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_telemetry_v1beta2_CommercialEvent_Action_descriptor,
        new java.lang.String[] { "Name", "Context", "Section", "Product", "Shop", "Order", "Event", });
    internal_static_services_telemetry_v1beta2_IdentityEvent_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_services_telemetry_v1beta2_IdentityEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_telemetry_v1beta2_IdentityEvent_descriptor,
        new java.lang.String[] { });
    internal_static_services_telemetry_v1beta2_IdentityEvent_Action_descriptor =
      internal_static_services_telemetry_v1beta2_IdentityEvent_descriptor.getNestedTypes().get(0);
    internal_static_services_telemetry_v1beta2_IdentityEvent_Action_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_telemetry_v1beta2_IdentityEvent_Action_descriptor,
        new java.lang.String[] { "Name", "Context", "Action", "Event", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.bloombox.schema.telemetry.AnalyticsContext.getDescriptor();
    io.bloombox.schema.services.ServiceStatusOuterClass.getDescriptor();
    io.bloombox.schema.services.telemetry.v1beta2.GenericEventsBeta2.getDescriptor();
    io.bloombox.schema.services.telemetry.v1beta2.UserEventsBeta2.getDescriptor();
    io.bloombox.schema.services.telemetry.v1beta2.ShopEventsBeta2.getDescriptor();
    io.bloombox.schema.services.telemetry.v1beta2.OrderEventsBeta2.getDescriptor();
    io.bloombox.schema.services.telemetry.v1beta2.SectionEventsBeta2.getDescriptor();
    io.bloombox.schema.services.telemetry.v1beta2.ProductEventsBeta2.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
