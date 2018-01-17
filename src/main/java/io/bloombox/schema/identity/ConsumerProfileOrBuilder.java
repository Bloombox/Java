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
// source: identity/User.proto

package io.bloombox.schema.identity;

public interface ConsumerProfileOrBuilder extends
    // @@protoc_insertion_point(interface_extends:identity.ConsumerProfile)
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
   * <code>.identity.EnrollmentSource enrollment_source = 3 [(.gen_bq_schema.description) = "Specifies enrollment source attribution information."];</code>
   */
  int getEnrollmentSourceValue();
  /**
   * <pre>
   * Specifies enrollment source attribution information.
   * </pre>
   *
   * <code>.identity.EnrollmentSource enrollment_source = 3 [(.gen_bq_schema.description) = "Specifies enrollment source attribution information."];</code>
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
   * <code>.identity.ConsumerPreferences preferences = 5 [(.gen_bq_schema.description) = "Preferences attached to a consumer account."];</code>
   */
  boolean hasPreferences();
  /**
   * <pre>
   * Preferences attached to a consumer account.
   * </pre>
   *
   * <code>.identity.ConsumerPreferences preferences = 5 [(.gen_bq_schema.description) = "Preferences attached to a consumer account."];</code>
   */
  io.bloombox.schema.identity.ConsumerPreferences getPreferences();
  /**
   * <pre>
   * Preferences attached to a consumer account.
   * </pre>
   *
   * <code>.identity.ConsumerPreferences preferences = 5 [(.gen_bq_schema.description) = "Preferences attached to a consumer account."];</code>
   */
  io.bloombox.schema.identity.ConsumerPreferencesOrBuilder getPreferencesOrBuilder();

  /**
   * <pre>
   * Specifies the primary consumer type for this account.
   * </pre>
   *
   * <code>.identity.ConsumerType type = 6 [(.gen_bq_schema.description) = "Specifies the primary consumer type for this account."];</code>
   */
  int getTypeValue();
  /**
   * <pre>
   * Specifies the primary consumer type for this account.
   * </pre>
   *
   * <code>.identity.ConsumerType type = 6 [(.gen_bq_schema.description) = "Specifies the primary consumer type for this account."];</code>
   */
  io.bloombox.schema.identity.ConsumerType getType();
}
