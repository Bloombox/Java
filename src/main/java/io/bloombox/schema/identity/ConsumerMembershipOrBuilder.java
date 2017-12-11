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
// source: identity/User.proto

package io.bloombox.schema.identity;

public interface ConsumerMembershipOrBuilder extends
    // @@protoc_insertion_point(interface_extends:identity.ConsumerMembership)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Referral source for this enrollment.
   * </pre>
   *
   * <code>.identity.EnrollmentSource referral_source = 1 [(.gen_bq_schema.description) = "Referral source for this enrollment."];</code>
   */
  int getReferralSourceValue();
  /**
   * <pre>
   * Referral source for this enrollment.
   * </pre>
   *
   * <code>.identity.EnrollmentSource referral_source = 1 [(.gen_bq_schema.description) = "Referral source for this enrollment."];</code>
   */
  io.bloombox.schema.identity.EnrollmentSource getReferralSource();

  /**
   * <pre>
   * Referral channel token - an artbirary, end-system provided value.
   * </pre>
   *
   * <code>string referral_channel = 2 [(.gen_bq_schema.description) = "Referral channel token - an artbirary, end-system provided value."];</code>
   */
  java.lang.String getReferralChannel();
  /**
   * <pre>
   * Referral channel token - an artbirary, end-system provided value.
   * </pre>
   *
   * <code>string referral_channel = 2 [(.gen_bq_schema.description) = "Referral channel token - an artbirary, end-system provided value."];</code>
   */
  com.google.protobuf.ByteString
      getReferralChannelBytes();

  /**
   * <pre>
   * Timestamp for when this profile enrolled.
   * </pre>
   *
   * <code>.temporal.Instant signed_up_at = 3 [(.gen_bq_schema.description) = "Timestamp for when this profile enrolled."];</code>
   */
  boolean hasSignedUpAt();
  /**
   * <pre>
   * Timestamp for when this profile enrolled.
   * </pre>
   *
   * <code>.temporal.Instant signed_up_at = 3 [(.gen_bq_schema.description) = "Timestamp for when this profile enrolled."];</code>
   */
  io.bloombox.schema.temporal.Instant getSignedUpAt();
  /**
   * <pre>
   * Timestamp for when this profile enrolled.
   * </pre>
   *
   * <code>.temporal.Instant signed_up_at = 3 [(.gen_bq_schema.description) = "Timestamp for when this profile enrolled."];</code>
   */
  io.bloombox.schema.temporal.InstantOrBuilder getSignedUpAtOrBuilder();

  /**
   * <pre>
   * Timestamp for when this profile was last seen.
   * </pre>
   *
   * <code>.temporal.Instant seen = 4 [(.gen_bq_schema.description) = "Timestamp for when this profile was last seen."];</code>
   */
  boolean hasSeen();
  /**
   * <pre>
   * Timestamp for when this profile was last seen.
   * </pre>
   *
   * <code>.temporal.Instant seen = 4 [(.gen_bq_schema.description) = "Timestamp for when this profile was last seen."];</code>
   */
  io.bloombox.schema.temporal.Instant getSeen();
  /**
   * <pre>
   * Timestamp for when this profile was last seen.
   * </pre>
   *
   * <code>.temporal.Instant seen = 4 [(.gen_bq_schema.description) = "Timestamp for when this profile was last seen."];</code>
   */
  io.bloombox.schema.temporal.InstantOrBuilder getSeenOrBuilder();

  /**
   * <pre>
   * Foreign ID for this membership, in the partner-colocated membership system.
   * </pre>
   *
   * <code>string foreign_id = 5 [(.gen_bq_schema.description) = "Foreign ID for this membership, in the partner-colocated membership system."];</code>
   */
  java.lang.String getForeignId();
  /**
   * <pre>
   * Foreign ID for this membership, in the partner-colocated membership system.
   * </pre>
   *
   * <code>string foreign_id = 5 [(.gen_bq_schema.description) = "Foreign ID for this membership, in the partner-colocated membership system."];</code>
   */
  com.google.protobuf.ByteString
      getForeignIdBytes();
}
