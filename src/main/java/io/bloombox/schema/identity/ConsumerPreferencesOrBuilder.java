// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: identity/User.proto

package io.bloombox.schema.identity;

public interface ConsumerPreferencesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:identity.ConsumerPreferences)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Preferred menu sections/product types, and so on.
   * </pre>
   *
   * <code>.identity.MenuPreferences menu = 10 [(.gen_bq_schema.description) = "Preferred menu sections/product types, and so on."];</code>
   */
  boolean hasMenu();
  /**
   * <pre>
   * Preferred menu sections/product types, and so on.
   * </pre>
   *
   * <code>.identity.MenuPreferences menu = 10 [(.gen_bq_schema.description) = "Preferred menu sections/product types, and so on."];</code>
   */
  io.bloombox.schema.identity.MenuPreferences getMenu();
  /**
   * <pre>
   * Preferred menu sections/product types, and so on.
   * </pre>
   *
   * <code>.identity.MenuPreferences menu = 10 [(.gen_bq_schema.description) = "Preferred menu sections/product types, and so on."];</code>
   */
  io.bloombox.schema.identity.MenuPreferencesOrBuilder getMenuOrBuilder();
}
