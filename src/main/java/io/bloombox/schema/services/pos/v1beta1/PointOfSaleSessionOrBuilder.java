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
// source: pos/v1beta1/POSService_Beta1.proto

package io.bloombox.schema.services.pos.v1beta1;

public interface PointOfSaleSessionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bloombox.schema.services.pos.v1beta1.PointOfSaleSession)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Session ID. Unique string to provide during POS operations, to reference this session.
   * </pre>
   *
   * <code>string id = 1;</code>
   */
  java.lang.String getId();
  /**
   * <pre>
   * Session ID. Unique string to provide during POS operations, to reference this session.
   * </pre>
   *
   * <code>string id = 1;</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Specifies the staff user logged in via this operation.
   * </pre>
   *
   * <code>.bloombox.schema.services.pos.v1beta1.StaffUser user = 2;</code>
   */
  boolean hasUser();
  /**
   * <pre>
   * Specifies the staff user logged in via this operation.
   * </pre>
   *
   * <code>.bloombox.schema.services.pos.v1beta1.StaffUser user = 2;</code>
   */
  io.bloombox.schema.services.pos.v1beta1.StaffUser getUser();
  /**
   * <pre>
   * Specifies the staff user logged in via this operation.
   * </pre>
   *
   * <code>.bloombox.schema.services.pos.v1beta1.StaffUser user = 2;</code>
   */
  io.bloombox.schema.services.pos.v1beta1.StaffUserOrBuilder getUserOrBuilder();

  /**
   * <pre>
   * Specifies the current/active status of a particular point of sale session.
   * </pre>
   *
   * <code>.bloombox.schema.services.pos.v1beta1.SessionStatus status = 3;</code>
   */
  int getStatusValue();
  /**
   * <pre>
   * Specifies the current/active status of a particular point of sale session.
   * </pre>
   *
   * <code>.bloombox.schema.services.pos.v1beta1.SessionStatus status = 3;</code>
   */
  io.bloombox.schema.services.pos.v1beta1.SessionStatus getStatus();

  /**
   * <pre>
   * Rendered access rights for this partner location.
   * </pre>
   *
   * <code>.bloombox.schema.identity.IndustryProfile rights = 5;</code>
   */
  boolean hasRights();
  /**
   * <pre>
   * Rendered access rights for this partner location.
   * </pre>
   *
   * <code>.bloombox.schema.identity.IndustryProfile rights = 5;</code>
   */
  io.bloombox.schema.identity.AppUser.IndustryProfile getRights();
  /**
   * <pre>
   * Rendered access rights for this partner location.
   * </pre>
   *
   * <code>.bloombox.schema.identity.IndustryProfile rights = 5;</code>
   */
  io.bloombox.schema.identity.AppUser.IndustryProfileOrBuilder getRightsOrBuilder();

  /**
   * <pre>
   * Authorization grants/tokens issued in response to this authentication transaction.
   * </pre>
   *
   * <code>repeated .bloombox.schema.services.pos.v1beta1.RegisterSessionToken authorization = 6;</code>
   */
  java.util.List<io.bloombox.schema.services.pos.v1beta1.RegisterSessionToken> 
      getAuthorizationList();
  /**
   * <pre>
   * Authorization grants/tokens issued in response to this authentication transaction.
   * </pre>
   *
   * <code>repeated .bloombox.schema.services.pos.v1beta1.RegisterSessionToken authorization = 6;</code>
   */
  io.bloombox.schema.services.pos.v1beta1.RegisterSessionToken getAuthorization(int index);
  /**
   * <pre>
   * Authorization grants/tokens issued in response to this authentication transaction.
   * </pre>
   *
   * <code>repeated .bloombox.schema.services.pos.v1beta1.RegisterSessionToken authorization = 6;</code>
   */
  int getAuthorizationCount();
  /**
   * <pre>
   * Authorization grants/tokens issued in response to this authentication transaction.
   * </pre>
   *
   * <code>repeated .bloombox.schema.services.pos.v1beta1.RegisterSessionToken authorization = 6;</code>
   */
  java.util.List<? extends io.bloombox.schema.services.pos.v1beta1.RegisterSessionTokenOrBuilder> 
      getAuthorizationOrBuilderList();
  /**
   * <pre>
   * Authorization grants/tokens issued in response to this authentication transaction.
   * </pre>
   *
   * <code>repeated .bloombox.schema.services.pos.v1beta1.RegisterSessionToken authorization = 6;</code>
   */
  io.bloombox.schema.services.pos.v1beta1.RegisterSessionTokenOrBuilder getAuthorizationOrBuilder(
      int index);

  /**
   * <pre>
   * Messaging session configuration, if applicable.
   * </pre>
   *
   * <code>.bloombox.schema.services.pos.v1beta1.PointOfSaleSession.MessagingSession messaging = 7;</code>
   */
  boolean hasMessaging();
  /**
   * <pre>
   * Messaging session configuration, if applicable.
   * </pre>
   *
   * <code>.bloombox.schema.services.pos.v1beta1.PointOfSaleSession.MessagingSession messaging = 7;</code>
   */
  io.bloombox.schema.services.pos.v1beta1.PointOfSaleSession.MessagingSession getMessaging();
  /**
   * <pre>
   * Messaging session configuration, if applicable.
   * </pre>
   *
   * <code>.bloombox.schema.services.pos.v1beta1.PointOfSaleSession.MessagingSession messaging = 7;</code>
   */
  io.bloombox.schema.services.pos.v1beta1.PointOfSaleSession.MessagingSessionOrBuilder getMessagingOrBuilder();

  /**
   * <pre>
   * When we expect the POS to check-in next.
   * </pre>
   *
   * <code>.opencannabis.temporal.Instant check_in = 8;</code>
   */
  boolean hasCheckIn();
  /**
   * <pre>
   * When we expect the POS to check-in next.
   * </pre>
   *
   * <code>.opencannabis.temporal.Instant check_in = 8;</code>
   */
  io.opencannabis.schema.temporal.TemporalInstant.Instant getCheckIn();
  /**
   * <pre>
   * When we expect the POS to check-in next.
   * </pre>
   *
   * <code>.opencannabis.temporal.Instant check_in = 8;</code>
   */
  io.opencannabis.schema.temporal.TemporalInstant.InstantOrBuilder getCheckInOrBuilder();

  /**
   * <pre>
   * When the session hard-expires.
   * </pre>
   *
   * <code>.opencannabis.temporal.Instant expires = 9;</code>
   */
  boolean hasExpires();
  /**
   * <pre>
   * When the session hard-expires.
   * </pre>
   *
   * <code>.opencannabis.temporal.Instant expires = 9;</code>
   */
  io.opencannabis.schema.temporal.TemporalInstant.Instant getExpires();
  /**
   * <pre>
   * When the session hard-expires.
   * </pre>
   *
   * <code>.opencannabis.temporal.Instant expires = 9;</code>
   */
  io.opencannabis.schema.temporal.TemporalInstant.InstantOrBuilder getExpiresOrBuilder();

  /**
   * <pre>
   * When the point-of-sale session was established.
   * </pre>
   *
   * <code>.opencannabis.temporal.Instant established = 10;</code>
   */
  boolean hasEstablished();
  /**
   * <pre>
   * When the point-of-sale session was established.
   * </pre>
   *
   * <code>.opencannabis.temporal.Instant established = 10;</code>
   */
  io.opencannabis.schema.temporal.TemporalInstant.Instant getEstablished();
  /**
   * <pre>
   * When the point-of-sale session was established.
   * </pre>
   *
   * <code>.opencannabis.temporal.Instant established = 10;</code>
   */
  io.opencannabis.schema.temporal.TemporalInstant.InstantOrBuilder getEstablishedOrBuilder();
}
