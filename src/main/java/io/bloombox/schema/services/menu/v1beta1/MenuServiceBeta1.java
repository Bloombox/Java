// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: menu/v1beta1/MenuService_Beta1.proto

package io.bloombox.schema.services.menu.v1beta1;

public final class MenuServiceBeta1 {
  private MenuServiceBeta1() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_menu_v1beta1_Ping_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_menu_v1beta1_Ping_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_menu_v1beta1_Ping_Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_menu_v1beta1_Ping_Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_menu_v1beta1_Ping_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_menu_v1beta1_Ping_Response_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_menu_v1beta1_GetMenu_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_menu_v1beta1_GetMenu_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_menu_v1beta1_GetMenu_Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_menu_v1beta1_GetMenu_Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_menu_v1beta1_GetMenu_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_menu_v1beta1_GetMenu_Response_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_menu_v1beta1_GetFeatured_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_menu_v1beta1_GetFeatured_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_menu_v1beta1_GetFeatured_Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_menu_v1beta1_GetFeatured_Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_menu_v1beta1_GetFeatured_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_menu_v1beta1_GetFeatured_Response_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_menu_v1beta1_ProductKeyset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_menu_v1beta1_ProductKeyset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_menu_v1beta1_GetProduct_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_menu_v1beta1_GetProduct_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_menu_v1beta1_GetProduct_Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_menu_v1beta1_GetProduct_Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_menu_v1beta1_GetProduct_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_menu_v1beta1_GetProduct_Response_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_menu_v1beta1_SearchMenu_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_menu_v1beta1_SearchMenu_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_menu_v1beta1_SearchMenu_Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_menu_v1beta1_SearchMenu_Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_menu_v1beta1_SearchMenu_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_menu_v1beta1_SearchMenu_Response_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$menu/v1beta1/MenuService_Beta1.proto\022%" +
      "bloombox.schema.services.menu.v1beta1\032\025b" +
      "ase/ProductKey.proto\032\027search/SearchSpec." +
      "proto\032\030products/menu/Menu.proto\032\033product" +
      "s/menu/Section.proto\032\034services/ServiceSt" +
      "atus.proto\032\034google/api/annotations.proto" +
      "\032(protoc-gen-swagger/options/swagger.pro" +
      "to\"V\n\004Ping\032\t\n\007Request\032C\n\010Response\0227\n\006sta" +
      "tus\030\001 \001(\0162\'.bloombox.schema.services.Ser" +
      "viceStatus\"\210\002\n\007GetMenu\032\255\001\n\007Request\022\r\n\005sc" +
      "ope\030\001 \001(\t\022\014\n\004full\030\002 \001(\010\022\021\n\tkeys_only\030\003 \001" +
      "(\010\022\020\n\010snapshot\030\004 \001(\t\022\023\n\013fingerprint\030\005 \001(" +
      "\t\022<\n\007section\030\006 \001(\0162+.opencannabis.produc" +
      "ts.menu.section.Section\022\r\n\005fresh\030\007 \001(\010\032M" +
      "\n\010Response\0221\n\007catalog\030\001 \001(\0132 .opencannab" +
      "is.products.menu.Menu\022\016\n\006cached\030\002 \001(\010\"\277\001" +
      "\n\013GetFeatured\032i\n\007Request\022\r\n\005scope\030\001 \001(\t\022" +
      "\021\n\tkeys_only\030\002 \001(\010\022<\n\007section\030\003 \001(\0162+.op" +
      "encannabis.products.menu.section.Section" +
      "\032E\n\010Response\0229\n\010featured\030\001 \003(\0132\'.opencan" +
      "nabis.products.menu.MenuProduct\";\n\rProdu" +
      "ctKeyset\022*\n\003key\030\001 \003(\0132\035.opencannabis.bas" +
      "e.ProductKey\"y\n\nGetProduct\032%\n\007Request\022\r\n" +
      "\005scope\030\001 \001(\t\022\013\n\003key\030\002 \001(\t\032D\n\010Response\0228\n" +
      "\007product\030\002 \003(\0132\'.opencannabis.products.m" +
      "enu.MenuProduct\"\222\001\n\nSearchMenu\032=\n\007Reques" +
      "t\0222\n\006search\030\001 \001(\0132\".bloombox.schema.sear" +
      "ch.SearchSpec\032E\n\010Response\0229\n\010resulset\030\001 " +
      "\001(\0132\'.bloombox.schema.search.SearchResul" +
      "tset*\260\001\n\tMenuError\022\014\n\010NO_ERROR\020\000\022\023\n\017PART" +
      "NER_INVALID\020\001\022\024\n\020LOCATION_INVALID\020\002\022\023\n\017S" +
      "ECTION_INVALID\020\003\022\025\n\021SECTION_NOT_FOUND\020\004\022" +
      "\022\n\016MENU_NOT_FOUND\020\005\022\022\n\016INTERNAL_ERROR\020\006\022" +
      "\026\n\022SEARCH_UNAVAILABLE\020\0072\373\n\n\004Menu\022\304\002\n\010Ret" +
      "rieve\0226.bloombox.schema.services.menu.v1" +
      "beta1.GetMenu.Request\0327.bloombox.schema." +
      "services.menu.v1beta1.GetMenu.Response\"\306" +
      "\001\202\323\344\223\002\201\001\022</menu/v1beta1/{scope=partners/" +
      "*/locations/*}/global:retrieveZA\022?/menu/" +
      "v1beta1/{scope=partners/*/locations/*}/{" +
      "section}:retrieve\222A;\022\rRetrieve Menu\032 Fet" +
      "ch product catalog/menu data.*\010Retrieve\022" +
      "\205\003\n\010Featured\022:.bloombox.schema.services." +
      "menu.v1beta1.GetFeatured.Request\032;.bloom" +
      "box.schema.services.menu.v1beta1.GetFeat" +
      "ured.Response\"\377\001\202\323\344\223\002\223\001\022E/menu/v1beta1/{" +
      "scope=partners/*/locations/*}/global/fea" +
      "tured:retrieveZJ\022H/menu/v1beta1/{scope=p" +
      "artners/*/locations/*}/{section}/feature" +
      "d:retrieve\222Ab\022\021Featured Products\032CRetrie" +
      "ve products marked for extra attention (" +
      "\'featured\' products).*\010Featured\022\252\002\n\010Prod" +
      "ucts\0229.bloombox.schema.services.menu.v1b" +
      "eta1.GetProduct.Request\032:.bloombox.schem" +
      "a.services.menu.v1beta1.GetProduct.Respo" +
      "nse\"\246\001\202\323\344\223\002D\022B/menu/v1beta1/{scope=partn" +
      "ers/*/locations/*}/products/{key}/detail" +
      "\222AY\022\014Product Data\032?Retrieve payload data" +
      " for one or more products, by product ke" +
      "y.*\010Products\022\366\002\n\006Search\0229.bloombox.schem" +
      "a.services.menu.v1beta1.SearchMenu.Reque" +
      "st\032:.bloombox.schema.services.menu.v1bet" +
      "a1.SearchMenu.Response\"\364\001\202\323\344\223\002\233\001\022P/menu/" +
      "v1beta1/{search.options.scope=partners/*" +
      "/locations/*}/search/{search.term}ZG\"B/m" +
      "enu/v1beta1/{search.options.scope=partne" +
      "rs/*/locations/*}/search:\001*\222AO\022\017Search P" +
      "roducts\0324Perform a fulltext search over " +
      "product catalog data.*\006SearchB\207\004\n(io.blo" +
      "ombox.schema.services.menu.v1beta1H\001P\001\242\002" +
      "\003BBS\222A\317\003\022g\n\010Menu API\032\031https://bloombox.i" +
      "o/terms\"7\n\010Bloombox\022\023https://bloombox.io" +
      "\032\026developers@bloombox.io2\007v1beta1\032\022api.b" +
      "loombox.cloud*\001\0022\020application/json:\020appl" +
      "ication/jsonZ\320\001\nd\n\013ApiKeyParam\022U\010\002\022JPara" +
      "meter for identifying API key owned by t" +
      "he invoking project or system.\032\003key \001\nh\n" +
      "\014ApiKeyHeader\022X\010\002\022GHeader for identifyin" +
      "g API key owned by the invoking project " +
      "or system.\032\tX-API-Key \001b\021\n\017\n\013ApiKeyParam" +
      "\022\000b\022\n\020\n\014ApiKeyHeader\022\000r/\n\rBloombox APIs\022" +
      "\036https://apidocs.bloombox.cloudb\006proto3"
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
          io.opencannabis.schema.base.BaseProductKey.getDescriptor(),
          io.bloombox.schema.search.SearchSpecOuterClass.getDescriptor(),
          io.opencannabis.schema.menu.MenuOuterClass.getDescriptor(),
          io.opencannabis.schema.menu.section.SectionOuterClass.getDescriptor(),
          io.bloombox.schema.services.ServiceStatusOuterClass.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          grpc.gateway.protoc_gen_swagger.options.Swagger.getDescriptor(),
        }, assigner);
    internal_static_bloombox_schema_services_menu_v1beta1_Ping_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bloombox_schema_services_menu_v1beta1_Ping_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_menu_v1beta1_Ping_descriptor,
        new java.lang.String[] { });
    internal_static_bloombox_schema_services_menu_v1beta1_Ping_Request_descriptor =
      internal_static_bloombox_schema_services_menu_v1beta1_Ping_descriptor.getNestedTypes().get(0);
    internal_static_bloombox_schema_services_menu_v1beta1_Ping_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_menu_v1beta1_Ping_Request_descriptor,
        new java.lang.String[] { });
    internal_static_bloombox_schema_services_menu_v1beta1_Ping_Response_descriptor =
      internal_static_bloombox_schema_services_menu_v1beta1_Ping_descriptor.getNestedTypes().get(1);
    internal_static_bloombox_schema_services_menu_v1beta1_Ping_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_menu_v1beta1_Ping_Response_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_bloombox_schema_services_menu_v1beta1_GetMenu_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_bloombox_schema_services_menu_v1beta1_GetMenu_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_menu_v1beta1_GetMenu_descriptor,
        new java.lang.String[] { });
    internal_static_bloombox_schema_services_menu_v1beta1_GetMenu_Request_descriptor =
      internal_static_bloombox_schema_services_menu_v1beta1_GetMenu_descriptor.getNestedTypes().get(0);
    internal_static_bloombox_schema_services_menu_v1beta1_GetMenu_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_menu_v1beta1_GetMenu_Request_descriptor,
        new java.lang.String[] { "Scope", "Full", "KeysOnly", "Snapshot", "Fingerprint", "Section", "Fresh", });
    internal_static_bloombox_schema_services_menu_v1beta1_GetMenu_Response_descriptor =
      internal_static_bloombox_schema_services_menu_v1beta1_GetMenu_descriptor.getNestedTypes().get(1);
    internal_static_bloombox_schema_services_menu_v1beta1_GetMenu_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_menu_v1beta1_GetMenu_Response_descriptor,
        new java.lang.String[] { "Catalog", "Cached", });
    internal_static_bloombox_schema_services_menu_v1beta1_GetFeatured_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_bloombox_schema_services_menu_v1beta1_GetFeatured_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_menu_v1beta1_GetFeatured_descriptor,
        new java.lang.String[] { });
    internal_static_bloombox_schema_services_menu_v1beta1_GetFeatured_Request_descriptor =
      internal_static_bloombox_schema_services_menu_v1beta1_GetFeatured_descriptor.getNestedTypes().get(0);
    internal_static_bloombox_schema_services_menu_v1beta1_GetFeatured_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_menu_v1beta1_GetFeatured_Request_descriptor,
        new java.lang.String[] { "Scope", "KeysOnly", "Section", });
    internal_static_bloombox_schema_services_menu_v1beta1_GetFeatured_Response_descriptor =
      internal_static_bloombox_schema_services_menu_v1beta1_GetFeatured_descriptor.getNestedTypes().get(1);
    internal_static_bloombox_schema_services_menu_v1beta1_GetFeatured_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_menu_v1beta1_GetFeatured_Response_descriptor,
        new java.lang.String[] { "Featured", });
    internal_static_bloombox_schema_services_menu_v1beta1_ProductKeyset_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_bloombox_schema_services_menu_v1beta1_ProductKeyset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_menu_v1beta1_ProductKeyset_descriptor,
        new java.lang.String[] { "Key", });
    internal_static_bloombox_schema_services_menu_v1beta1_GetProduct_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_bloombox_schema_services_menu_v1beta1_GetProduct_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_menu_v1beta1_GetProduct_descriptor,
        new java.lang.String[] { });
    internal_static_bloombox_schema_services_menu_v1beta1_GetProduct_Request_descriptor =
      internal_static_bloombox_schema_services_menu_v1beta1_GetProduct_descriptor.getNestedTypes().get(0);
    internal_static_bloombox_schema_services_menu_v1beta1_GetProduct_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_menu_v1beta1_GetProduct_Request_descriptor,
        new java.lang.String[] { "Scope", "Key", });
    internal_static_bloombox_schema_services_menu_v1beta1_GetProduct_Response_descriptor =
      internal_static_bloombox_schema_services_menu_v1beta1_GetProduct_descriptor.getNestedTypes().get(1);
    internal_static_bloombox_schema_services_menu_v1beta1_GetProduct_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_menu_v1beta1_GetProduct_Response_descriptor,
        new java.lang.String[] { "Product", });
    internal_static_bloombox_schema_services_menu_v1beta1_SearchMenu_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_bloombox_schema_services_menu_v1beta1_SearchMenu_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_menu_v1beta1_SearchMenu_descriptor,
        new java.lang.String[] { });
    internal_static_bloombox_schema_services_menu_v1beta1_SearchMenu_Request_descriptor =
      internal_static_bloombox_schema_services_menu_v1beta1_SearchMenu_descriptor.getNestedTypes().get(0);
    internal_static_bloombox_schema_services_menu_v1beta1_SearchMenu_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_menu_v1beta1_SearchMenu_Request_descriptor,
        new java.lang.String[] { "Search", });
    internal_static_bloombox_schema_services_menu_v1beta1_SearchMenu_Response_descriptor =
      internal_static_bloombox_schema_services_menu_v1beta1_SearchMenu_descriptor.getNestedTypes().get(1);
    internal_static_bloombox_schema_services_menu_v1beta1_SearchMenu_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_menu_v1beta1_SearchMenu_Response_descriptor,
        new java.lang.String[] { "Resulset", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(grpc.gateway.protoc_gen_swagger.options.Swagger.openapiv2Operation);
    registry.add(grpc.gateway.protoc_gen_swagger.options.Swagger.openapiv2Swagger);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.opencannabis.schema.base.BaseProductKey.getDescriptor();
    io.bloombox.schema.search.SearchSpecOuterClass.getDescriptor();
    io.opencannabis.schema.menu.MenuOuterClass.getDescriptor();
    io.opencannabis.schema.menu.section.SectionOuterClass.getDescriptor();
    io.bloombox.schema.services.ServiceStatusOuterClass.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    grpc.gateway.protoc_gen_swagger.options.Swagger.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
