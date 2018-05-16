// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: oauth/Client.proto

package io.opencannabis.schema.oauth;

public interface ConsentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opencannabis.oauth.Consent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID value of THIS indvidual request.
   * </pre>
   *
   * <code>string id = 1;</code>
   */
  java.lang.String getId();
  /**
   * <pre>
   * ID value of THIS indvidual request.
   * </pre>
   *
   * <code>string id = 1;</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Client ID value.
   * </pre>
   *
   * <code>string client_id = 2;</code>
   */
  java.lang.String getClientId();
  /**
   * <pre>
   * Client ID value.
   * </pre>
   *
   * <code>string client_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getClientIdBytes();

  /**
   * <pre>
   * Expires-at value.
   * </pre>
   *
   * <code>.opencannabis.temporal.Instant expires_at = 3;</code>
   */
  boolean hasExpiresAt();
  /**
   * <pre>
   * Expires-at value.
   * </pre>
   *
   * <code>.opencannabis.temporal.Instant expires_at = 3;</code>
   */
  io.opencannabis.schema.temporal.Instant getExpiresAt();
  /**
   * <pre>
   * Expires-at value.
   * </pre>
   *
   * <code>.opencannabis.temporal.Instant expires_at = 3;</code>
   */
  io.opencannabis.schema.temporal.InstantOrBuilder getExpiresAtOrBuilder();

  /**
   * <pre>
   * Redirect URI.
   * </pre>
   *
   * <code>string redirect_uri = 4;</code>
   */
  java.lang.String getRedirectUri();
  /**
   * <pre>
   * Redirect URI.
   * </pre>
   *
   * <code>string redirect_uri = 4;</code>
   */
  com.google.protobuf.ByteString
      getRedirectUriBytes();

  /**
   * <pre>
   * Requested scopes.
   * </pre>
   *
   * <code>repeated string requested_scope = 5;</code>
   */
  java.util.List<java.lang.String>
      getRequestedScopeList();
  /**
   * <pre>
   * Requested scopes.
   * </pre>
   *
   * <code>repeated string requested_scope = 5;</code>
   */
  int getRequestedScopeCount();
  /**
   * <pre>
   * Requested scopes.
   * </pre>
   *
   * <code>repeated string requested_scope = 5;</code>
   */
  java.lang.String getRequestedScope(int index);
  /**
   * <pre>
   * Requested scopes.
   * </pre>
   *
   * <code>repeated string requested_scope = 5;</code>
   */
  com.google.protobuf.ByteString
      getRequestedScopeBytes(int index);
}
