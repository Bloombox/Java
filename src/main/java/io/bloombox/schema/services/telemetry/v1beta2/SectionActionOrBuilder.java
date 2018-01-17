/*
 * Copyright 2018, Bloombox, LLC. All rights reserved.
 *
 * Source and object computer code contained herein is the private intellectual
 * property of Bloombox, a California Limited Liability Corporation. Use of this
 * code in source form requires permission in writing before use or the
 * assembly, distribution, or publishing of derivative works, for commercial
 * purposes or any other purpose, from a duly authorized officer of Momentum
 * Ideas Co.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: telemetry/v1beta2/commerce/SectionEvents_Beta2.proto

package io.bloombox.schema.services.telemetry.v1beta2;

public interface SectionActionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.telemetry.v1beta2.SectionAction)
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
   * Specifies the section action information to record.
   * </pre>
   *
   * <code>.analytics.section.Action action = 2;</code>
   */
  boolean hasAction();
  /**
   * <pre>
   * Specifies the section action information to record.
   * </pre>
   *
   * <code>.analytics.section.Action action = 2;</code>
   */
  io.bloombox.schema.analytics.section.SectionAnalytics.Action getAction();
  /**
   * <pre>
   * Specifies the section action information to record.
   * </pre>
   *
   * <code>.analytics.section.Action action = 2;</code>
   */
  io.bloombox.schema.analytics.section.SectionAnalytics.ActionOrBuilder getActionOrBuilder();
}
