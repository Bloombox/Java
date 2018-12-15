/*
 * Copyright 2018, Momentum Ideas, Co. All rights reserved.
 *
 * Source and object computer code contained herein is the private intellectual
 * property of Momentum Ideas Co., a Delaware Corporation. Use of this
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
// source: search/SearchSpec.proto

package io.bloombox.schema.search;

public final class SearchMetadata {
  private SearchMetadata() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_search_SearchBounds_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_search_SearchBounds_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_search_SearchOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_search_SearchOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_search_SearchResultOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_search_SearchResultOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_search_SearchSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_search_SearchSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_search_ResultsetCategoricalCount_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_search_ResultsetCategoricalCount_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_search_ProductResultBound_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_search_ProductResultBound_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_search_ProductResultMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_search_ProductResultMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_search_SearchResultsetMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_search_SearchResultsetMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_search_SearchResultset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_search_SearchResultset_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027search/SearchSpec.proto\022\017bloombox.sear" +
      "ch\032\031search/SearchResult.proto\032\033products/" +
      "menu/Section.proto\"-\n\014SearchBounds\022\r\n\005li" +
      "mit\030\001 \001(\005\022\016\n\006offset\030\002 \001(\005\"l\n\rSearchOptio" +
      "ns\022\r\n\005scope\030\001 \001(\t\022<\n\007section\030\002 \003(\0162+.ope" +
      "ncannabis.products.menu.section.Section\022" +
      "\016\n\006hidden\030\003 \001(\010\"\232\001\n\023SearchResultOptions\022" +
      "\021\n\tkeys_only\030\001 \001(\010\0227\n\thighlight\030\002 \001(\0162$." +
      "bloombox.search.ResultHighlightMode\0227\n\007i" +
      "nclude\030\003 \003(\0162&.bloombox.search.SearchRes" +
      "ultExtension\"K\n\nSearchSpec\022\014\n\004term\030\001 \001(\t" +
      "\022/\n\007options\030\002 \001(\0132\036.bloombox.search.Sear" +
      "chOptions\"_\n\031ResultsetCategoricalCount\0223" +
      "\n\004type\030\001 \001(\0162%.bloombox.search.Searchabl" +
      "eCollection\022\r\n\005count\030\002 \001(\005\"/\n\022ProductRes" +
      "ultBound\022\013\n\003low\030\001 \001(\001\022\014\n\004high\030\002 \001(\001\"\257\001\n\025" +
      "ProductResultMetadata\0222\n\005price\030\001 \001(\0132#.b" +
      "loombox.search.ProductResultBound\0220\n\003thc" +
      "\030\002 \001(\0132#.bloombox.search.ProductResultBo" +
      "und\0220\n\003cbd\030\003 \001(\0132#.bloombox.search.Produ" +
      "ctResultBound\"\216\001\n\027SearchResultsetMetadat" +
      "a\0229\n\005count\030\001 \003(\0132*.bloombox.search.Resul" +
      "tsetCategoricalCount\0228\n\010products\030\002 \001(\0132&" +
      ".bloombox.search.ProductResultMetadata\"}" +
      "\n\017SearchResultset\022:\n\010metadata\030\001 \001(\0132(.bl" +
      "oombox.search.SearchResultsetMetadata\022.\n" +
      "\007payload\030\002 \003(\0132\035.bloombox.search.SearchR" +
      "esult*I\n\024SearchableCollection\022\n\n\006GLOBAL\020" +
      "\000\022\014\n\010PRODUCTS\020\001\022\t\n\005USERS\020\002\022\014\n\010PARTNERS\020\003" +
      "*a\n\025SearchResultExtension\022\010\n\004NAME\020\000\022\017\n\013D" +
      "ESCRIPTION\020\001\022\t\n\005MEDIA\020\002\022\010\n\004LABS\020\003\022\013\n\007PRI" +
      "CING\020\004\022\013\n\007RELATED\020\005*O\n\023ResultHighlightMo" +
      "de\022\023\n\017NO_HIGHLIGHTING\020\000\022\010\n\004HTML\020\001\022\014\n\010MAR" +
      "KDOWN\020\002\022\013\n\007SNIPPET\020\003*0\n\016SearchSortMode\022\013" +
      "\n\007NATURAL\020\000\022\021\n\rLEXICOGRAPHIC\020\001B5\n\031io.blo" +
      "ombox.schema.searchB\016SearchMetadataH\001P\001\242" +
      "\002\003BBSb\006proto3"
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
          io.bloombox.schema.search.SearchResults.getDescriptor(),
          io.opencannabis.schema.menu.section.SectionOuterClass.getDescriptor(),
        }, assigner);
    internal_static_bloombox_search_SearchBounds_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bloombox_search_SearchBounds_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_search_SearchBounds_descriptor,
        new java.lang.String[] { "Limit", "Offset", });
    internal_static_bloombox_search_SearchOptions_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_bloombox_search_SearchOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_search_SearchOptions_descriptor,
        new java.lang.String[] { "Scope", "Section", "Hidden", });
    internal_static_bloombox_search_SearchResultOptions_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_bloombox_search_SearchResultOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_search_SearchResultOptions_descriptor,
        new java.lang.String[] { "KeysOnly", "Highlight", "Include", });
    internal_static_bloombox_search_SearchSpec_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_bloombox_search_SearchSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_search_SearchSpec_descriptor,
        new java.lang.String[] { "Term", "Options", });
    internal_static_bloombox_search_ResultsetCategoricalCount_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_bloombox_search_ResultsetCategoricalCount_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_search_ResultsetCategoricalCount_descriptor,
        new java.lang.String[] { "Type", "Count", });
    internal_static_bloombox_search_ProductResultBound_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_bloombox_search_ProductResultBound_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_search_ProductResultBound_descriptor,
        new java.lang.String[] { "Low", "High", });
    internal_static_bloombox_search_ProductResultMetadata_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_bloombox_search_ProductResultMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_search_ProductResultMetadata_descriptor,
        new java.lang.String[] { "Price", "Thc", "Cbd", });
    internal_static_bloombox_search_SearchResultsetMetadata_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_bloombox_search_SearchResultsetMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_search_SearchResultsetMetadata_descriptor,
        new java.lang.String[] { "Count", "Products", });
    internal_static_bloombox_search_SearchResultset_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_bloombox_search_SearchResultset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_search_SearchResultset_descriptor,
        new java.lang.String[] { "Metadata", "Payload", });
    io.bloombox.schema.search.SearchResults.getDescriptor();
    io.opencannabis.schema.menu.section.SectionOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
