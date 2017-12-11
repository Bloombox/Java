/*
 * Copyright 2017, Bloombox, LLC. All rights reserved.
 *
 * Source and object computer code contained herein is the private intellectual property
 * of Bloombox, a California Limited Liability Corporation. Use of this code in source form
 * requires permission in writing before use or the publishing of derivative works, for
 * commercial purposes or any other purpose, from a duly authorized officer of Momentum
 * Ideas Co.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: telemetry/v1beta3/GenericEvents_Beta3.proto

package io.bloombox.schema.services.telemetry.v1beta3;

public interface ExceptionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.telemetry.v1beta3.Exception)
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

  /**
   * <pre>
   * UUID generated for this event, or provided from invoking callers.
   * </pre>
   *
   * <code>string uuid = 3;</code>
   */
  java.lang.String getUuid();
  /**
   * <pre>
   * UUID generated for this event, or provided from invoking callers.
   * </pre>
   *
   * <code>string uuid = 3;</code>
   */
  com.google.protobuf.ByteString
      getUuidBytes();
}
