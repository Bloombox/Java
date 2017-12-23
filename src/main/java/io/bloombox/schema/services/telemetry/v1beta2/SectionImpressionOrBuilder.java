// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: telemetry/v1beta2/commerce/SectionEvents_Beta2.proto

package io.bloombox.schema.services.telemetry.v1beta2;

public interface SectionImpressionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.telemetry.v1beta2.SectionImpression)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Event context.
   * </pre>
   *
   * <code>.analytics.Context context = 1;</code>
   */
  boolean hasContext();
  /**
   * <pre>
   * Event context.
   * </pre>
   *
   * <code>.analytics.Context context = 1;</code>
   */
  io.bloombox.schema.telemetry.AnalyticsContext.Context getContext();
  /**
   * <pre>
   * Event context.
   * </pre>
   *
   * <code>.analytics.Context context = 1;</code>
   */
  io.bloombox.schema.telemetry.AnalyticsContext.ContextOrBuilder getContextOrBuilder();

  /**
   * <pre>
   * Specifies the section impression information to record.
   * </pre>
   *
   * <code>.analytics.section.Impression impression = 2;</code>
   */
  boolean hasImpression();
  /**
   * <pre>
   * Specifies the section impression information to record.
   * </pre>
   *
   * <code>.analytics.section.Impression impression = 2;</code>
   */
  io.bloombox.schema.analytics.section.SectionAnalytics.Impression getImpression();
  /**
   * <pre>
   * Specifies the section impression information to record.
   * </pre>
   *
   * <code>.analytics.section.Impression impression = 2;</code>
   */
  io.bloombox.schema.analytics.section.SectionAnalytics.ImpressionOrBuilder getImpressionOrBuilder();
}
