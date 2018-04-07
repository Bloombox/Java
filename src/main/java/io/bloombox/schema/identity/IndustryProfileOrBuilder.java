// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: identity/User.proto

package io.bloombox.schema.identity;

public interface IndustryProfileOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bloombox.schema.identity.IndustryProfile)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Profile inactive/active status.
   * </pre>
   *
   * <code>bool active = 1 [(.gen_bq_schema.description) = "Profile inactive/active status."];</code>
   */
  boolean getActive();

  /**
   * <pre>
   * Map of partner accesses levels to partner codes.
   * </pre>
   *
   * <code>map&lt;string, .bloombox.schema.security.access.PartnerAccess&gt; partners = 2 [(.gen_bq_schema.description) = "Map of partner accesses levels to partner codes."];</code>
   */
  int getPartnersCount();
  /**
   * <pre>
   * Map of partner accesses levels to partner codes.
   * </pre>
   *
   * <code>map&lt;string, .bloombox.schema.security.access.PartnerAccess&gt; partners = 2 [(.gen_bq_schema.description) = "Map of partner accesses levels to partner codes."];</code>
   */
  boolean containsPartners(
      java.lang.String key);
  /**
   * Use {@link #getPartnersMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, io.bloombox.schema.security.access.PartnerAccess>
  getPartners();
  /**
   * <pre>
   * Map of partner accesses levels to partner codes.
   * </pre>
   *
   * <code>map&lt;string, .bloombox.schema.security.access.PartnerAccess&gt; partners = 2 [(.gen_bq_schema.description) = "Map of partner accesses levels to partner codes."];</code>
   */
  java.util.Map<java.lang.String, io.bloombox.schema.security.access.PartnerAccess>
  getPartnersMap();
  /**
   * <pre>
   * Map of partner accesses levels to partner codes.
   * </pre>
   *
   * <code>map&lt;string, .bloombox.schema.security.access.PartnerAccess&gt; partners = 2 [(.gen_bq_schema.description) = "Map of partner accesses levels to partner codes."];</code>
   */

  io.bloombox.schema.security.access.PartnerAccess getPartnersOrDefault(
      java.lang.String key,
      io.bloombox.schema.security.access.PartnerAccess defaultValue);
  /**
   * <pre>
   * Map of partner accesses levels to partner codes.
   * </pre>
   *
   * <code>map&lt;string, .bloombox.schema.security.access.PartnerAccess&gt; partners = 2 [(.gen_bq_schema.description) = "Map of partner accesses levels to partner codes."];</code>
   */

  io.bloombox.schema.security.access.PartnerAccess getPartnersOrThrow(
      java.lang.String key);
}
