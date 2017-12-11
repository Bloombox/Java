// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: base/ProductKey.proto

package io.bloombox.schema.base;

public interface ProductReferenceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:base.ProductReference)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Specifies the name of a product.
   * </pre>
   *
   * <code>.content.Name name = 1;</code>
   */
  boolean hasName();
  /**
   * <pre>
   * Specifies the name of a product.
   * </pre>
   *
   * <code>.content.Name name = 1;</code>
   */
  io.bloombox.schema.content.Name getName();
  /**
   * <pre>
   * Specifies the name of a product.
   * </pre>
   *
   * <code>.content.Name name = 1;</code>
   */
  io.bloombox.schema.content.NameOrBuilder getNameOrBuilder();

  /**
   * <pre>
   * Specifies the key, if known, of a product.
   * </pre>
   *
   * <code>.base.ProductKey key = 2;</code>
   */
  boolean hasKey();
  /**
   * <pre>
   * Specifies the key, if known, of a product.
   * </pre>
   *
   * <code>.base.ProductKey key = 2;</code>
   */
  io.bloombox.schema.base.ProductKey getKey();
  /**
   * <pre>
   * Specifies the key, if known, of a product.
   * </pre>
   *
   * <code>.base.ProductKey key = 2;</code>
   */
  io.bloombox.schema.base.ProductKeyOrBuilder getKeyOrBuilder();
}
