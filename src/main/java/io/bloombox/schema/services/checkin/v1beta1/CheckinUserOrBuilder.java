// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: checkin/v1beta1/CheckinService_Beta1.proto

package io.bloombox.schema.services.checkin.v1beta1;

public interface CheckinUserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bloombox.schema.services.checkin.v1beta1.CheckinUser)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Key and identity ID for the user who was checked in.
   * </pre>
   *
   * <code>.bloombox.schema.identity.UserKey key = 1;</code>
   */
  boolean hasKey();
  /**
   * <pre>
   * Key and identity ID for the user who was checked in.
   * </pre>
   *
   * <code>.bloombox.schema.identity.UserKey key = 1;</code>
   */
  io.bloombox.schema.identity.AppUser.UserKey getKey();
  /**
   * <pre>
   * Key and identity ID for the user who was checked in.
   * </pre>
   *
   * <code>.bloombox.schema.identity.UserKey key = 1;</code>
   */
  io.bloombox.schema.identity.AppUser.UserKeyOrBuilder getKeyOrBuilder();

  /**
   * <pre>
   * Active account flags.
   * </pre>
   *
   * <code>.bloombox.schema.identity.UserFlags flags = 2;</code>
   */
  boolean hasFlags();
  /**
   * <pre>
   * Active account flags.
   * </pre>
   *
   * <code>.bloombox.schema.identity.UserFlags flags = 2;</code>
   */
  io.bloombox.schema.identity.AppUser.UserFlags getFlags();
  /**
   * <pre>
   * Active account flags.
   * </pre>
   *
   * <code>.bloombox.schema.identity.UserFlags flags = 2;</code>
   */
  io.bloombox.schema.identity.AppUser.UserFlagsOrBuilder getFlagsOrBuilder();

  /**
   * <pre>
   * Person's name information, for display purposes.
   * </pre>
   *
   * <code>.opencannabis.person.Name name = 3;</code>
   */
  boolean hasName();
  /**
   * <pre>
   * Person's name information, for display purposes.
   * </pre>
   *
   * <code>.opencannabis.person.Name name = 3;</code>
   */
  io.opencannabis.schema.person.Name getName();
  /**
   * <pre>
   * Person's name information, for display purposes.
   * </pre>
   *
   * <code>.opencannabis.person.Name name = 3;</code>
   */
  io.opencannabis.schema.person.NameOrBuilder getNameOrBuilder();
}
