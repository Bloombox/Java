// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: identity/User.proto

package io.bloombox.schema.identity;

public interface ConsumerProfileOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bloombox.schema.identity.ConsumerProfile)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Profile active/inactive flag.
   * </pre>
   *
   * <code>bool active = 1 [(.gen_bq_schema.description) = "Profile active/inactive flag."];</code>
   */
  boolean getActive();

  /**
   * <pre>
   * Enumerates favorite dispensaries for a user.
   * </pre>
   *
   * <code>repeated string favorite_dispensaries = 2 [(.gen_bq_schema.description) = "Enumerates favorite dispensaries for a user."];</code>
   */
  java.util.List<java.lang.String>
      getFavoriteDispensariesList();
  /**
   * <pre>
   * Enumerates favorite dispensaries for a user.
   * </pre>
   *
   * <code>repeated string favorite_dispensaries = 2 [(.gen_bq_schema.description) = "Enumerates favorite dispensaries for a user."];</code>
   */
  int getFavoriteDispensariesCount();
  /**
   * <pre>
   * Enumerates favorite dispensaries for a user.
   * </pre>
   *
   * <code>repeated string favorite_dispensaries = 2 [(.gen_bq_schema.description) = "Enumerates favorite dispensaries for a user."];</code>
   */
  java.lang.String getFavoriteDispensaries(int index);
  /**
   * <pre>
   * Enumerates favorite dispensaries for a user.
   * </pre>
   *
   * <code>repeated string favorite_dispensaries = 2 [(.gen_bq_schema.description) = "Enumerates favorite dispensaries for a user."];</code>
   */
  com.google.protobuf.ByteString
      getFavoriteDispensariesBytes(int index);

  /**
   * <pre>
   * Specifies enrollment source attribution information.
   * </pre>
   *
   * <code>.bloombox.schema.identity.EnrollmentSource enrollment_source = 3 [(.gen_bq_schema.description) = "Specifies enrollment source attribution information."];</code>
   */
  int getEnrollmentSourceValue();
  /**
   * <pre>
   * Specifies enrollment source attribution information.
   * </pre>
   *
   * <code>.bloombox.schema.identity.EnrollmentSource enrollment_source = 3 [(.gen_bq_schema.description) = "Specifies enrollment source attribution information."];</code>
   */
  io.bloombox.schema.identity.EnrollmentSource getEnrollmentSource();

  /**
   * <pre>
   * Arbitrary string for the channel through which this user enrolled.
   * </pre>
   *
   * <code>string enrollment_channel = 4 [(.gen_bq_schema.description) = "Arbitrary string for the channel through which this user enrolled."];</code>
   */
  java.lang.String getEnrollmentChannel();
  /**
   * <pre>
   * Arbitrary string for the channel through which this user enrolled.
   * </pre>
   *
   * <code>string enrollment_channel = 4 [(.gen_bq_schema.description) = "Arbitrary string for the channel through which this user enrolled."];</code>
   */
  com.google.protobuf.ByteString
      getEnrollmentChannelBytes();

  /**
   * <pre>
   * Preferences attached to a consumer account.
   * </pre>
   *
   * <code>.bloombox.schema.identity.ConsumerPreferences preferences = 5 [(.gen_bq_schema.description) = "Preferences attached to a consumer account."];</code>
   */
  boolean hasPreferences();
  /**
   * <pre>
   * Preferences attached to a consumer account.
   * </pre>
   *
   * <code>.bloombox.schema.identity.ConsumerPreferences preferences = 5 [(.gen_bq_schema.description) = "Preferences attached to a consumer account."];</code>
   */
  io.bloombox.schema.identity.ConsumerPreferences getPreferences();
  /**
   * <pre>
   * Preferences attached to a consumer account.
   * </pre>
   *
   * <code>.bloombox.schema.identity.ConsumerPreferences preferences = 5 [(.gen_bq_schema.description) = "Preferences attached to a consumer account."];</code>
   */
  io.bloombox.schema.identity.ConsumerPreferencesOrBuilder getPreferencesOrBuilder();

  /**
   * <pre>
   * Specifies the primary consumer type for this account.
   * </pre>
   *
   * <code>.bloombox.schema.identity.ConsumerType type = 6 [(.gen_bq_schema.description) = "Specifies the primary consumer type for this account."];</code>
   */
  int getTypeValue();
  /**
   * <pre>
   * Specifies the primary consumer type for this account.
   * </pre>
   *
   * <code>.bloombox.schema.identity.ConsumerType type = 6 [(.gen_bq_schema.description) = "Specifies the primary consumer type for this account."];</code>
   */
  io.bloombox.schema.identity.ConsumerType getType();

  /**
   * <pre>
   * Specifies referral source attribution information.
   * </pre>
   *
   * <code>.bloombox.schema.identity.ReferralSource referral_source = 7 [(.gen_bq_schema.description) = "Specifies referral source attribution information."];</code>
   */
  int getReferralSourceValue();
  /**
   * <pre>
   * Specifies referral source attribution information.
   * </pre>
   *
   * <code>.bloombox.schema.identity.ReferralSource referral_source = 7 [(.gen_bq_schema.description) = "Specifies referral source attribution information."];</code>
   */
  io.bloombox.schema.identity.ReferralSource getReferralSource();

  /**
   * <pre>
   * Specifies the referrer's name.
   * </pre>
   *
   * <code>string referral_detail = 8 [(.gen_bq_schema.description) = "Specifies the referrer&#92;'s name."];</code>
   */
  java.lang.String getReferralDetail();
  /**
   * <pre>
   * Specifies the referrer's name.
   * </pre>
   *
   * <code>string referral_detail = 8 [(.gen_bq_schema.description) = "Specifies the referrer&#92;'s name."];</code>
   */
  com.google.protobuf.ByteString
      getReferralDetailBytes();
}
