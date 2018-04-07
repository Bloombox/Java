// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: content/Content.proto

package io.opencannabis.schema.content;

public interface ContentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opencannabis.content.Content)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Format/underlying type of content data.
   * </pre>
   *
   * <code>.opencannabis.content.Content.Type type = 1;</code>
   */
  int getTypeValue();
  /**
   * <pre>
   * Format/underlying type of content data.
   * </pre>
   *
   * <code>.opencannabis.content.Content.Type type = 1;</code>
   */
  io.opencannabis.schema.content.Content.Type getType();

  /**
   * <pre>
   * Encoding of underlying content data.
   * </pre>
   *
   * <code>.opencannabis.content.Content.Encoding encoding = 2;</code>
   */
  int getEncodingValue();
  /**
   * <pre>
   * Encoding of underlying content data.
   * </pre>
   *
   * <code>.opencannabis.content.Content.Encoding encoding = 2;</code>
   */
  io.opencannabis.schema.content.Content.Encoding getEncoding();

  /**
   * <pre>
   * Raw bytes of underlying content data.
   * </pre>
   *
   * <code>string content = 3;</code>
   */
  java.lang.String getContent();
  /**
   * <pre>
   * Raw bytes of underlying content data.
   * </pre>
   *
   * <code>string content = 3;</code>
   */
  com.google.protobuf.ByteString
      getContentBytes();

  /**
   * <pre>
   * Language information for underlying content.
   * </pre>
   *
   * <code>.opencannabis.base.Language language = 4;</code>
   */
  int getLanguageValue();
  /**
   * <pre>
   * Language information for underlying content.
   * </pre>
   *
   * <code>.opencannabis.base.Language language = 4;</code>
   */
  io.opencannabis.schema.base.Language getLanguage();

  /**
   * <pre>
   * Compression settings for underlying content.
   * </pre>
   *
   * <code>.opencannabis.base.Compression compression = 5;</code>
   */
  boolean hasCompression();
  /**
   * <pre>
   * Compression settings for underlying content.
   * </pre>
   *
   * <code>.opencannabis.base.Compression compression = 5;</code>
   */
  io.opencannabis.schema.base.Compression getCompression();
  /**
   * <pre>
   * Compression settings for underlying content.
   * </pre>
   *
   * <code>.opencannabis.base.Compression compression = 5;</code>
   */
  io.opencannabis.schema.base.CompressionOrBuilder getCompressionOrBuilder();
}
