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
// source: search/SearchSpec.proto

package io.bloombox.schema.search;

public final class SearchSpecOuterClass {
  private SearchSpecOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_search_SearchBounds_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_search_SearchBounds_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_search_SearchOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_search_SearchOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_search_SearchResultOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_search_SearchResultOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_search_SearchSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_search_SearchSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_search_ResultsetCategoricalCount_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_search_ResultsetCategoricalCount_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_search_ProductResultBound_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_search_ProductResultBound_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_search_ProductResultMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_search_ProductResultMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_search_SearchResultsetMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_search_SearchResultsetMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_search_SearchResultset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_search_SearchResultset_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027search/SearchSpec.proto\022\026bloombox.sche" +
      "ma.search\032\031search/SearchResult.proto\032\033pr" +
      "oducts/menu/Section.proto\"-\n\014SearchBound" +
      "s\022\r\n\005limit\030\001 \001(\005\022\016\n\006offset\030\002 \001(\005\"l\n\rSear" +
      "chOptions\022\r\n\005scope\030\001 \001(\t\022<\n\007section\030\002 \003(" +
      "\0162+.opencannabis.products.menu.section.S" +
      "ection\022\016\n\006hidden\030\003 \001(\010\"\250\001\n\023SearchResultO" +
      "ptions\022\021\n\tkeys_only\030\001 \001(\010\022>\n\thighlight\030\002" +
      " \001(\0162+.bloombox.schema.search.ResultHigh" +
      "lightMode\022>\n\007include\030\003 \003(\0162-.bloombox.sc" +
      "hema.search.SearchResultExtension\"R\n\nSea" +
      "rchSpec\022\014\n\004term\030\001 \001(\t\0226\n\007options\030\002 \001(\0132%" +
      ".bloombox.schema.search.SearchOptions\"f\n" +
      "\031ResultsetCategoricalCount\022:\n\004type\030\001 \001(\016" +
      "2,.bloombox.schema.search.SearchableColl" +
      "ection\022\r\n\005count\030\002 \001(\005\"/\n\022ProductResultBo" +
      "und\022\013\n\003low\030\001 \001(\001\022\014\n\004high\030\002 \001(\001\"\304\001\n\025Produ" +
      "ctResultMetadata\0229\n\005price\030\001 \001(\0132*.bloomb" +
      "ox.schema.search.ProductResultBound\0227\n\003t" +
      "hc\030\002 \001(\0132*.bloombox.schema.search.Produc" +
      "tResultBound\0227\n\003cbd\030\003 \001(\0132*.bloombox.sch" +
      "ema.search.ProductResultBound\"\234\001\n\027Search" +
      "ResultsetMetadata\022@\n\005count\030\001 \003(\01321.bloom" +
      "box.schema.search.ResultsetCategoricalCo" +
      "unt\022?\n\010products\030\002 \001(\0132-.bloombox.schema." +
      "search.ProductResultMetadata\"\213\001\n\017SearchR" +
      "esultset\022A\n\010metadata\030\001 \001(\0132/.bloombox.sc" +
      "hema.search.SearchResultsetMetadata\0225\n\007p" +
      "ayload\030\002 \003(\0132$.bloombox.schema.search.Se" +
      "archResult*I\n\024SearchableCollection\022\n\n\006GL" +
      "OBAL\020\000\022\014\n\010PRODUCTS\020\001\022\t\n\005USERS\020\002\022\014\n\010PARTN" +
      "ERS\020\003*a\n\025SearchResultExtension\022\010\n\004NAME\020\000" +
      "\022\017\n\013DESCRIPTION\020\001\022\t\n\005MEDIA\020\002\022\010\n\004LABS\020\003\022\013" +
      "\n\007PRICING\020\004\022\013\n\007RELATED\020\005*O\n\023ResultHighli" +
      "ghtMode\022\023\n\017NO_HIGHLIGHTING\020\000\022\010\n\004HTML\020\001\022\014" +
      "\n\010MARKDOWN\020\002\022\013\n\007SNIPPET\020\003*0\n\016SearchSortM" +
      "ode\022\013\n\007NATURAL\020\000\022\021\n\rLEXICOGRAPHIC\020\001B%\n\031i" +
      "o.bloombox.schema.searchH\001P\001\242\002\003BBSb\006prot" +
      "o3"
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
          io.bloombox.schema.search.SearchResultOuterClass.getDescriptor(),
          io.opencannabis.schema.menu.section.SectionOuterClass.getDescriptor(),
        }, assigner);
    internal_static_bloombox_schema_search_SearchBounds_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bloombox_schema_search_SearchBounds_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_search_SearchBounds_descriptor,
        new java.lang.String[] { "Limit", "Offset", });
    internal_static_bloombox_schema_search_SearchOptions_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_bloombox_schema_search_SearchOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_search_SearchOptions_descriptor,
        new java.lang.String[] { "Scope", "Section", "Hidden", });
    internal_static_bloombox_schema_search_SearchResultOptions_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_bloombox_schema_search_SearchResultOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_search_SearchResultOptions_descriptor,
        new java.lang.String[] { "KeysOnly", "Highlight", "Include", });
    internal_static_bloombox_schema_search_SearchSpec_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_bloombox_schema_search_SearchSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_search_SearchSpec_descriptor,
        new java.lang.String[] { "Term", "Options", });
    internal_static_bloombox_schema_search_ResultsetCategoricalCount_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_bloombox_schema_search_ResultsetCategoricalCount_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_search_ResultsetCategoricalCount_descriptor,
        new java.lang.String[] { "Type", "Count", });
    internal_static_bloombox_schema_search_ProductResultBound_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_bloombox_schema_search_ProductResultBound_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_search_ProductResultBound_descriptor,
        new java.lang.String[] { "Low", "High", });
    internal_static_bloombox_schema_search_ProductResultMetadata_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_bloombox_schema_search_ProductResultMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_search_ProductResultMetadata_descriptor,
        new java.lang.String[] { "Price", "Thc", "Cbd", });
    internal_static_bloombox_schema_search_SearchResultsetMetadata_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_bloombox_schema_search_SearchResultsetMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_search_SearchResultsetMetadata_descriptor,
        new java.lang.String[] { "Count", "Products", });
    internal_static_bloombox_schema_search_SearchResultset_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_bloombox_schema_search_SearchResultset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_search_SearchResultset_descriptor,
        new java.lang.String[] { "Metadata", "Payload", });
    io.bloombox.schema.search.SearchResultOuterClass.getDescriptor();
    io.opencannabis.schema.menu.section.SectionOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
