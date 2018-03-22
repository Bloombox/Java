// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: temporal/Date.proto

package io.opencannabis.schema.temporal;

public interface DateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opencannabis.temporal.Date)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ISO8601-formatted calendar date value, like YYYY-MM-DD.
   * </pre>
   *
   * <code>string iso8601 = 1 [(.gen_bq_schema.description) = "ISO8601-formatted calendar date value, like YYYY-MM-DD."];</code>
   */
  java.lang.String getIso8601();
  /**
   * <pre>
   * ISO8601-formatted calendar date value, like YYYY-MM-DD.
   * </pre>
   *
   * <code>string iso8601 = 1 [(.gen_bq_schema.description) = "ISO8601-formatted calendar date value, like YYYY-MM-DD."];</code>
   */
  com.google.protobuf.ByteString
      getIso8601Bytes();

  public io.opencannabis.schema.temporal.Date.SpecCase getSpecCase();
}
