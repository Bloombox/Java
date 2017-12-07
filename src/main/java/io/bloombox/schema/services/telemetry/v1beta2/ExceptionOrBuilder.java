/*
 * Copyright 2017, Bloombox, LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: telemetry/v1beta2/generic/GenericEvents_Beta2.proto

package io.bloombox.schema.services.telemetry.v1beta2;

public interface ExceptionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.telemetry.v1beta2.Exception)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Context to submit for these events.
   * </pre>
   *
   * <code>.analytics.Context context = 1;</code>
   */
  boolean hasContext();
  /**
   * <pre>
   * Context to submit for these events.
   * </pre>
   *
   * <code>.analytics.Context context = 1;</code>
   */
  io.bloombox.schema.telemetry.AnalyticsContext.Context getContext();
  /**
   * <pre>
   * Context to submit for these events.
   * </pre>
   *
   * <code>.analytics.Context context = 1;</code>
   */
  io.bloombox.schema.telemetry.AnalyticsContext.ContextOrBuilder getContextOrBuilder();

  /**
   * <pre>
   * Error to submit.
   * </pre>
   *
   * <code>.analytics.generic.Exception error = 2;</code>
   */
  boolean hasError();
  /**
   * <pre>
   * Error to submit.
   * </pre>
   *
   * <code>.analytics.generic.Exception error = 2;</code>
   */
  io.bloombox.schema.telemetry.AnalyticsException.Exception getError();
  /**
   * <pre>
   * Error to submit.
   * </pre>
   *
   * <code>.analytics.generic.Exception error = 2;</code>
   */
  io.bloombox.schema.telemetry.AnalyticsException.ExceptionOrBuilder getErrorOrBuilder();
}
