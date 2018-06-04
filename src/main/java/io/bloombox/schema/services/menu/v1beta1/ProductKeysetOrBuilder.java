// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: menu/v1beta1/MenuService_Beta1.proto

package io.bloombox.schema.services.menu.v1beta1;

public interface ProductKeysetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bloombox.schema.services.menu.v1beta1.ProductKeyset)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Specifies keys included in this key set.
   * </pre>
   *
   * <code>repeated .opencannabis.base.ProductKey key = 1;</code>
   */
  java.util.List<io.opencannabis.schema.base.BaseProductKey.ProductKey> 
      getKeyList();
  /**
   * <pre>
   * Specifies keys included in this key set.
   * </pre>
   *
   * <code>repeated .opencannabis.base.ProductKey key = 1;</code>
   */
  io.opencannabis.schema.base.BaseProductKey.ProductKey getKey(int index);
  /**
   * <pre>
   * Specifies keys included in this key set.
   * </pre>
   *
   * <code>repeated .opencannabis.base.ProductKey key = 1;</code>
   */
  int getKeyCount();
  /**
   * <pre>
   * Specifies keys included in this key set.
   * </pre>
   *
   * <code>repeated .opencannabis.base.ProductKey key = 1;</code>
   */
  java.util.List<? extends io.opencannabis.schema.base.BaseProductKey.ProductKeyOrBuilder> 
      getKeyOrBuilderList();
  /**
   * <pre>
   * Specifies keys included in this key set.
   * </pre>
   *
   * <code>repeated .opencannabis.base.ProductKey key = 1;</code>
   */
  io.opencannabis.schema.base.BaseProductKey.ProductKeyOrBuilder getKeyOrBuilder(
      int index);
}
