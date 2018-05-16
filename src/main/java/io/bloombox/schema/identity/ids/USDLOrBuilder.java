// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: identity/ids/USDL.proto

package io.bloombox.schema.identity.ids;

public interface USDLOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bloombox.schema.identity.ids.USDL)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Raw barcode data for this Driver's License.
   * </pre>
   *
   * <code>string barcode = 1 [(.gen_bq_schema.ignore) = true];</code>
   */
  java.lang.String getBarcode();
  /**
   * <pre>
   * Raw barcode data for this Driver's License.
   * </pre>
   *
   * <code>string barcode = 1 [(.gen_bq_schema.ignore) = true];</code>
   */
  com.google.protobuf.ByteString
      getBarcodeBytes();

  /**
   * <pre>
   * Raw barcode data for this Driver's License.
   * </pre>
   *
   * <code>string magstripe = 2 [(.gen_bq_schema.ignore) = true];</code>
   */
  java.lang.String getMagstripe();
  /**
   * <pre>
   * Raw barcode data for this Driver's License.
   * </pre>
   *
   * <code>string magstripe = 2 [(.gen_bq_schema.ignore) = true];</code>
   */
  com.google.protobuf.ByteString
      getMagstripeBytes();

  /**
   * <pre>
   * State that issued this Driver's License.
   * </pre>
   *
   * <code>.opencannabis.geo.usa.USState jurisdiction = 3 [(.gen_bq_schema.description) = "State that issued this Driver&#92;'s License."];</code>
   */
  int getJurisdictionValue();
  /**
   * <pre>
   * State that issued this Driver's License.
   * </pre>
   *
   * <code>.opencannabis.geo.usa.USState jurisdiction = 3 [(.gen_bq_schema.description) = "State that issued this Driver&#92;'s License."];</code>
   */
  io.opencannabis.schema.geo.usa.USState getJurisdiction();

  /**
   * <pre>
   * Flag that indicates this is an identification card, not a Driver's License.
   * </pre>
   *
   * <code>bool identification_card = 4 [(.gen_bq_schema.description) = "Flag that indicates this is an identification card, not a Driver&#92;'s License."];</code>
   */
  boolean getIdentificationCard();

  /**
   * <pre>
   * Raw field data for this license.
   * </pre>
   *
   * <code>repeated .bloombox.schema.identity.ids.USDLFieldValue fields = 100 [(.gen_bq_schema.description) = "Raw field data for this license."];</code>
   */
  java.util.List<io.bloombox.schema.identity.ids.USDLFieldValue> 
      getFieldsList();
  /**
   * <pre>
   * Raw field data for this license.
   * </pre>
   *
   * <code>repeated .bloombox.schema.identity.ids.USDLFieldValue fields = 100 [(.gen_bq_schema.description) = "Raw field data for this license."];</code>
   */
  io.bloombox.schema.identity.ids.USDLFieldValue getFields(int index);
  /**
   * <pre>
   * Raw field data for this license.
   * </pre>
   *
   * <code>repeated .bloombox.schema.identity.ids.USDLFieldValue fields = 100 [(.gen_bq_schema.description) = "Raw field data for this license."];</code>
   */
  int getFieldsCount();
  /**
   * <pre>
   * Raw field data for this license.
   * </pre>
   *
   * <code>repeated .bloombox.schema.identity.ids.USDLFieldValue fields = 100 [(.gen_bq_schema.description) = "Raw field data for this license."];</code>
   */
  java.util.List<? extends io.bloombox.schema.identity.ids.USDLFieldValueOrBuilder> 
      getFieldsOrBuilderList();
  /**
   * <pre>
   * Raw field data for this license.
   * </pre>
   *
   * <code>repeated .bloombox.schema.identity.ids.USDLFieldValue fields = 100 [(.gen_bq_schema.description) = "Raw field data for this license."];</code>
   */
  io.bloombox.schema.identity.ids.USDLFieldValueOrBuilder getFieldsOrBuilder(
      int index);
}
