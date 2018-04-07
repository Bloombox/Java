// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: oauth/Client.proto

package io.opencannabis.schema.oauth;

public interface ClientOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opencannabis.oauth.Client)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID for this OAuth2 client.
   * </pre>
   *
   * <code>string id = 1;</code>
   */
  java.lang.String getId();
  /**
   * <pre>
   * ID for this OAuth2 client.
   * </pre>
   *
   * <code>string id = 1;</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Secret (password) for this OAuth2 client.
   * </pre>
   *
   * <code>string secret = 2;</code>
   */
  java.lang.String getSecret();
  /**
   * <pre>
   * Secret (password) for this OAuth2 client.
   * </pre>
   *
   * <code>string secret = 2;</code>
   */
  com.google.protobuf.ByteString
      getSecretBytes();

  /**
   * <pre>
   * Name of the client.
   * </pre>
   *
   * <code>string name = 3;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the client.
   * </pre>
   *
   * <code>string name = 3;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Contact information for the client.
   * </pre>
   *
   * <code>repeated string contact = 4;</code>
   */
  java.util.List<java.lang.String>
      getContactList();
  /**
   * <pre>
   * Contact information for the client.
   * </pre>
   *
   * <code>repeated string contact = 4;</code>
   */
  int getContactCount();
  /**
   * <pre>
   * Contact information for the client.
   * </pre>
   *
   * <code>repeated string contact = 4;</code>
   */
  java.lang.String getContact(int index);
  /**
   * <pre>
   * Contact information for the client.
   * </pre>
   *
   * <code>repeated string contact = 4;</code>
   */
  com.google.protobuf.ByteString
      getContactBytes(int index);

  /**
   * <pre>
   * Grant types supported by this client.
   * </pre>
   *
   * <code>repeated .opencannabis.oauth.GrantType grant_types = 5;</code>
   */
  java.util.List<io.opencannabis.schema.oauth.GrantType> getGrantTypesList();
  /**
   * <pre>
   * Grant types supported by this client.
   * </pre>
   *
   * <code>repeated .opencannabis.oauth.GrantType grant_types = 5;</code>
   */
  int getGrantTypesCount();
  /**
   * <pre>
   * Grant types supported by this client.
   * </pre>
   *
   * <code>repeated .opencannabis.oauth.GrantType grant_types = 5;</code>
   */
  io.opencannabis.schema.oauth.GrantType getGrantTypes(int index);
  /**
   * <pre>
   * Grant types supported by this client.
   * </pre>
   *
   * <code>repeated .opencannabis.oauth.GrantType grant_types = 5;</code>
   */
  java.util.List<java.lang.Integer>
  getGrantTypesValueList();
  /**
   * <pre>
   * Grant types supported by this client.
   * </pre>
   *
   * <code>repeated .opencannabis.oauth.GrantType grant_types = 5;</code>
   */
  int getGrantTypesValue(int index);

  /**
   * <pre>
   * Attached media item for branding.
   * </pre>
   *
   * <code>.opencannabis.media.MediaItem branding = 6;</code>
   */
  boolean hasBranding();
  /**
   * <pre>
   * Attached media item for branding.
   * </pre>
   *
   * <code>.opencannabis.media.MediaItem branding = 6;</code>
   */
  io.opencannabis.schema.media.MediaItem getBranding();
  /**
   * <pre>
   * Attached media item for branding.
   * </pre>
   *
   * <code>.opencannabis.media.MediaItem branding = 6;</code>
   */
  io.opencannabis.schema.media.MediaItemOrBuilder getBrandingOrBuilder();

  /**
   * <pre>
   * Owner information for this client.
   * </pre>
   *
   * <code>string owner = 7;</code>
   */
  java.lang.String getOwner();
  /**
   * <pre>
   * Owner information for this client.
   * </pre>
   *
   * <code>string owner = 7;</code>
   */
  com.google.protobuf.ByteString
      getOwnerBytes();

  /**
   * <pre>
   * Privacy policy URI.
   * </pre>
   *
   * <code>.opencannabis.media.MediaItem policy = 8;</code>
   */
  boolean hasPolicy();
  /**
   * <pre>
   * Privacy policy URI.
   * </pre>
   *
   * <code>.opencannabis.media.MediaItem policy = 8;</code>
   */
  io.opencannabis.schema.media.MediaItem getPolicy();
  /**
   * <pre>
   * Privacy policy URI.
   * </pre>
   *
   * <code>.opencannabis.media.MediaItem policy = 8;</code>
   */
  io.opencannabis.schema.media.MediaItemOrBuilder getPolicyOrBuilder();

  /**
   * <pre>
   * Terms of Service URI.
   * </pre>
   *
   * <code>.opencannabis.media.MediaItem terms = 9;</code>
   */
  boolean hasTerms();
  /**
   * <pre>
   * Terms of Service URI.
   * </pre>
   *
   * <code>.opencannabis.media.MediaItem terms = 9;</code>
   */
  io.opencannabis.schema.media.MediaItem getTerms();
  /**
   * <pre>
   * Terms of Service URI.
   * </pre>
   *
   * <code>.opencannabis.media.MediaItem terms = 9;</code>
   */
  io.opencannabis.schema.media.MediaItemOrBuilder getTermsOrBuilder();

  /**
   * <pre>
   * Whether this client is public or not.
   * </pre>
   *
   * <code>bool public = 10;</code>
   */
  boolean getPublic();

  /**
   * <pre>
   * Supported/allowed redirect URIs for this client.
   * </pre>
   *
   * <code>repeated string redirect_uri = 11;</code>
   */
  java.util.List<java.lang.String>
      getRedirectUriList();
  /**
   * <pre>
   * Supported/allowed redirect URIs for this client.
   * </pre>
   *
   * <code>repeated string redirect_uri = 11;</code>
   */
  int getRedirectUriCount();
  /**
   * <pre>
   * Supported/allowed redirect URIs for this client.
   * </pre>
   *
   * <code>repeated string redirect_uri = 11;</code>
   */
  java.lang.String getRedirectUri(int index);
  /**
   * <pre>
   * Supported/allowed redirect URIs for this client.
   * </pre>
   *
   * <code>repeated string redirect_uri = 11;</code>
   */
  com.google.protobuf.ByteString
      getRedirectUriBytes(int index);

  /**
   * <pre>
   * Supported OAuth2 response types for this client.
   * </pre>
   *
   * <code>repeated .opencannabis.oauth.ResponseType response_type = 12;</code>
   */
  java.util.List<io.opencannabis.schema.oauth.ResponseType> getResponseTypeList();
  /**
   * <pre>
   * Supported OAuth2 response types for this client.
   * </pre>
   *
   * <code>repeated .opencannabis.oauth.ResponseType response_type = 12;</code>
   */
  int getResponseTypeCount();
  /**
   * <pre>
   * Supported OAuth2 response types for this client.
   * </pre>
   *
   * <code>repeated .opencannabis.oauth.ResponseType response_type = 12;</code>
   */
  io.opencannabis.schema.oauth.ResponseType getResponseType(int index);
  /**
   * <pre>
   * Supported OAuth2 response types for this client.
   * </pre>
   *
   * <code>repeated .opencannabis.oauth.ResponseType response_type = 12;</code>
   */
  java.util.List<java.lang.Integer>
  getResponseTypeValueList();
  /**
   * <pre>
   * Supported OAuth2 response types for this client.
   * </pre>
   *
   * <code>repeated .opencannabis.oauth.ResponseType response_type = 12;</code>
   */
  int getResponseTypeValue(int index);

  /**
   * <pre>
   * Allowed authorization scopes for this client.
   * </pre>
   *
   * <code>repeated .opencannabis.oauth.AuthorizationScope scope = 13;</code>
   */
  java.util.List<io.opencannabis.schema.oauth.AuthorizationScope> 
      getScopeList();
  /**
   * <pre>
   * Allowed authorization scopes for this client.
   * </pre>
   *
   * <code>repeated .opencannabis.oauth.AuthorizationScope scope = 13;</code>
   */
  io.opencannabis.schema.oauth.AuthorizationScope getScope(int index);
  /**
   * <pre>
   * Allowed authorization scopes for this client.
   * </pre>
   *
   * <code>repeated .opencannabis.oauth.AuthorizationScope scope = 13;</code>
   */
  int getScopeCount();
  /**
   * <pre>
   * Allowed authorization scopes for this client.
   * </pre>
   *
   * <code>repeated .opencannabis.oauth.AuthorizationScope scope = 13;</code>
   */
  java.util.List<? extends io.opencannabis.schema.oauth.AuthorizationScopeOrBuilder> 
      getScopeOrBuilderList();
  /**
   * <pre>
   * Allowed authorization scopes for this client.
   * </pre>
   *
   * <code>repeated .opencannabis.oauth.AuthorizationScope scope = 13;</code>
   */
  io.opencannabis.schema.oauth.AuthorizationScopeOrBuilder getScopeOrBuilder(
      int index);
}
