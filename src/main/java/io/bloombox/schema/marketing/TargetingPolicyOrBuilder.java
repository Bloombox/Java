// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: marketing/Targeting.proto

package io.bloombox.schema.marketing;

public interface TargetingPolicyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bloombox.schema.marketing.TargetingPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Whether this policy is enabled or not.
   * </pre>
   *
   * <code>bool enabled = 1;</code>
   */
  boolean getEnabled();

  /**
   * <pre>
   * Age-based user targeting.
   * </pre>
   *
   * <code>.bloombox.schema.marketing.AgeTargeting age = 2;</code>
   */
  boolean hasAge();
  /**
   * <pre>
   * Age-based user targeting.
   * </pre>
   *
   * <code>.bloombox.schema.marketing.AgeTargeting age = 2;</code>
   */
  io.bloombox.schema.marketing.AgeTargeting getAge();
  /**
   * <pre>
   * Age-based user targeting.
   * </pre>
   *
   * <code>.bloombox.schema.marketing.AgeTargeting age = 2;</code>
   */
  io.bloombox.schema.marketing.AgeTargetingOrBuilder getAgeOrBuilder();

  /**
   * <pre>
   * Gender-based user targeting.
   * </pre>
   *
   * <code>.bloombox.schema.marketing.GenderTargeting gender = 3;</code>
   */
  boolean hasGender();
  /**
   * <pre>
   * Gender-based user targeting.
   * </pre>
   *
   * <code>.bloombox.schema.marketing.GenderTargeting gender = 3;</code>
   */
  io.bloombox.schema.marketing.GenderTargeting getGender();
  /**
   * <pre>
   * Gender-based user targeting.
   * </pre>
   *
   * <code>.bloombox.schema.marketing.GenderTargeting gender = 3;</code>
   */
  io.bloombox.schema.marketing.GenderTargetingOrBuilder getGenderOrBuilder();

  /**
   * <pre>
   * Menu-preference-based targeting.
   * </pre>
   *
   * <code>.bloombox.schema.marketing.PreferenceTargeting preferences = 4;</code>
   */
  boolean hasPreferences();
  /**
   * <pre>
   * Menu-preference-based targeting.
   * </pre>
   *
   * <code>.bloombox.schema.marketing.PreferenceTargeting preferences = 4;</code>
   */
  io.bloombox.schema.marketing.PreferenceTargeting getPreferences();
  /**
   * <pre>
   * Menu-preference-based targeting.
   * </pre>
   *
   * <code>.bloombox.schema.marketing.PreferenceTargeting preferences = 4;</code>
   */
  io.bloombox.schema.marketing.PreferenceTargetingOrBuilder getPreferencesOrBuilder();

  public io.bloombox.schema.marketing.TargetingPolicy.PolicyCase getPolicyCase();
}
