// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: temporal/Time.proto

package io.bloombox.schema.temporal;

public interface TimeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:temporal.Time)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ISO8601 time format.
   * </pre>
   *
   * <code>string iso8601 = 1;</code>
   */
  java.lang.String getIso8601();
  /**
   * <pre>
   * ISO8601 time format.
   * </pre>
   *
   * <code>string iso8601 = 1;</code>
   */
  com.google.protobuf.ByteString
      getIso8601Bytes();

  public io.bloombox.schema.temporal.Time.SpecCase getSpecCase();
}
