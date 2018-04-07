// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: partner/integrations/GreenbitsSettings.proto

package io.bloombox.schema.partner.integrations.greenbits;

public interface GreenbitsSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bloombox.schema.partner.integrations.greenbits.GreenbitsSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Organization account ID in Greenbits.
   * </pre>
   *
   * <code>string organization = 1;</code>
   */
  java.lang.String getOrganization();
  /**
   * <pre>
   * Organization account ID in Greenbits.
   * </pre>
   *
   * <code>string organization = 1;</code>
   */
  com.google.protobuf.ByteString
      getOrganizationBytes();

  /**
   * <pre>
   * Greenbits API key, available in the Greenbits dashboard.
   * </pre>
   *
   * <code>string api_key = 2;</code>
   */
  java.lang.String getApiKey();
  /**
   * <pre>
   * Greenbits API key, available in the Greenbits dashboard.
   * </pre>
   *
   * <code>string api_key = 2;</code>
   */
  com.google.protobuf.ByteString
      getApiKeyBytes();

  /**
   * <pre>
   * Greenbits Auth token to use, available in the Greenbits dashboard.
   * </pre>
   *
   * <code>string auth_token = 3;</code>
   */
  java.lang.String getAuthToken();
  /**
   * <pre>
   * Greenbits Auth token to use, available in the Greenbits dashboard.
   * </pre>
   *
   * <code>string auth_token = 3;</code>
   */
  com.google.protobuf.ByteString
      getAuthTokenBytes();

  /**
   * <pre>
   * Flags indicating features that should be enabled or disabled.
   * </pre>
   *
   * <code>.bloombox.schema.partner.integrations.greenbits.GreenbitsIntegrationFeatures features = 10;</code>
   */
  boolean hasFeatures();
  /**
   * <pre>
   * Flags indicating features that should be enabled or disabled.
   * </pre>
   *
   * <code>.bloombox.schema.partner.integrations.greenbits.GreenbitsIntegrationFeatures features = 10;</code>
   */
  io.bloombox.schema.partner.integrations.greenbits.GreenbitsIntegrationFeatures getFeatures();
  /**
   * <pre>
   * Flags indicating features that should be enabled or disabled.
   * </pre>
   *
   * <code>.bloombox.schema.partner.integrations.greenbits.GreenbitsIntegrationFeatures features = 10;</code>
   */
  io.bloombox.schema.partner.integrations.greenbits.GreenbitsIntegrationFeaturesOrBuilder getFeaturesOrBuilder();
}
