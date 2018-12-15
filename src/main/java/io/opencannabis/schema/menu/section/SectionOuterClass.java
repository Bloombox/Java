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
// source: products/menu/Section.proto

package io.opencannabis.schema.menu.section;

public final class SectionOuterClass {
  private SectionOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_products_menu_section_CustomSection_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_products_menu_section_CustomSection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_products_menu_section_SectionMedia_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_products_menu_section_SectionMedia_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_products_menu_section_SectionSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_products_menu_section_SectionSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_products_menu_section_SectionSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_products_menu_section_SectionSpec_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033products/menu/Section.proto\022\"opencanna" +
      "bis.products.menu.section\032\022content/Name." +
      "proto\032\025media/MediaItem.proto\"`\n\rCustomSe" +
      "ction\022\n\n\002id\030\001 \001(\t\022C\n\006filter\030\002 \001(\01623.open" +
      "cannabis.products.menu.section.FilteredS" +
      "ection\"N\n\014SectionMedia\022>\n\027tablet_homescr" +
      "een_media\030\002 \001(\0132\035.opencannabis.media.Med" +
      "iaItem\"|\n\017SectionSettings\022(\n\004name\030\001 \001(\0132" +
      "\032.opencannabis.content.Name\022?\n\005media\030\002 \001" +
      "(\01320.opencannabis.products.menu.section." +
      "SectionMedia\"\271\002\n\013SectionSpec\022>\n\007section\030" +
      "\001 \001(\0162+.opencannabis.products.menu.secti" +
      "on.SectionH\000\022K\n\016custom_section\030\002 \001(\01321.o" +
      "pencannabis.products.menu.section.Custom" +
      "SectionH\000\022\016\n\004name\030\003 \001(\tH\000\022E\n\010settings\030\004 " +
      "\001(\01323.opencannabis.products.menu.section" +
      ".SectionSettings\022>\n\005flags\030\005 \003(\0162/.openca" +
      "nnabis.products.menu.section.SectionFlag" +
      "B\006\n\004spec*\'\n\013SectionFlag\022\n\n\006HIDDEN\020\000\022\014\n\010F" +
      "EATURED\020\001*\215\001\n\007Section\022\017\n\013UNSPECIFIED\020\000\022\013" +
      "\n\007FLOWERS\020\001\022\014\n\010EXTRACTS\020\002\022\013\n\007EDIBLES\020\003\022\016" +
      "\n\nCARTRIDGES\020\004\022\016\n\nAPOTHECARY\020\005\022\014\n\010PREROL" +
      "LS\020\006\022\n\n\006PLANTS\020\007\022\017\n\013MERCHANDISE\020\010*>\n\017Fil" +
      "teredSection\022\013\n\007ON_SALE\020\000\022\t\n\005HOUSE\020\001\022\007\n\003" +
      "CBD\020\002\022\n\n\006SEARCH\020\003B/\n#io.opencannabis.sch" +
      "ema.menu.sectionH\001P\001\242\002\003OCSb\006proto3"
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
          io.opencannabis.schema.content.NameContent.getDescriptor(),
          io.opencannabis.schema.media.AttachedMedia.getDescriptor(),
        }, assigner);
    internal_static_opencannabis_products_menu_section_CustomSection_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opencannabis_products_menu_section_CustomSection_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_products_menu_section_CustomSection_descriptor,
        new java.lang.String[] { "Id", "Filter", });
    internal_static_opencannabis_products_menu_section_SectionMedia_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opencannabis_products_menu_section_SectionMedia_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_products_menu_section_SectionMedia_descriptor,
        new java.lang.String[] { "TabletHomescreenMedia", });
    internal_static_opencannabis_products_menu_section_SectionSettings_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_opencannabis_products_menu_section_SectionSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_products_menu_section_SectionSettings_descriptor,
        new java.lang.String[] { "Name", "Media", });
    internal_static_opencannabis_products_menu_section_SectionSpec_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_opencannabis_products_menu_section_SectionSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_products_menu_section_SectionSpec_descriptor,
        new java.lang.String[] { "Section", "CustomSection", "Name", "Settings", "Flags", "Spec", });
    io.opencannabis.schema.content.NameContent.getDescriptor();
    io.opencannabis.schema.media.AttachedMedia.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
