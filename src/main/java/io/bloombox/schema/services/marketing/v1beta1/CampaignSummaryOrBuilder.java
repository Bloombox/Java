/*
 * Copyright 2019, Momentum Ideas, Co. All rights reserved.
 *
 * Source and object computer code contained herein is the private intellectual
 * property of Momentum Ideas Co., a Delaware Corporation. Use of this
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
// source: marketing/v1beta1/MarketingService_Beta1.proto

package io.bloombox.schema.services.marketing.v1beta1;

public interface CampaignSummaryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bloombox.services.marketing.v1beta1.CampaignSummary)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Key for the underlying campaign.
   * </pre>
   *
   * <code>.bloombox.marketing.CampaignKey key = 1;</code>
   */
  boolean hasKey();
  /**
   * <pre>
   * Key for the underlying campaign.
   * </pre>
   *
   * <code>.bloombox.marketing.CampaignKey key = 1;</code>
   */
  io.bloombox.schema.marketing.MarketingCampaign.CampaignKey getKey();
  /**
   * <pre>
   * Key for the underlying campaign.
   * </pre>
   *
   * <code>.bloombox.marketing.CampaignKey key = 1;</code>
   */
  io.bloombox.schema.marketing.MarketingCampaign.CampaignKeyOrBuilder getKeyOrBuilder();

  /**
   * <pre>
   * Name for the campaign object.
   * </pre>
   *
   * <code>string name = 2;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name for the campaign object.
   * </pre>
   *
   * <code>string name = 2;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Description for the campaign object.
   * </pre>
   *
   * <code>string description = 3;</code>
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Description for the campaign object.
   * </pre>
   *
   * <code>string description = 3;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Whether the underlying campaign is live.
   * </pre>
   *
   * <code>bool live = 4;</code>
   */
  boolean getLive();

  /**
   * <pre>
   * Current status of the campaign.
   * </pre>
   *
   * <code>.bloombox.marketing.CampaignStatus status = 5;</code>
   */
  int getStatusValue();
  /**
   * <pre>
   * Current status of the campaign.
   * </pre>
   *
   * <code>.bloombox.marketing.CampaignStatus status = 5;</code>
   */
  io.bloombox.schema.marketing.MarketingCampaign.CampaignStatus getStatus();

  /**
   * <pre>
   * Whether this campaign supports SMS.
   * </pre>
   *
   * <code>bool sms = 6;</code>
   */
  boolean getSms();

  /**
   * <pre>
   * Whether this campaign supports email.
   * </pre>
   *
   * <code>bool email = 7;</code>
   */
  boolean getEmail();

  /**
   * <pre>
   * Tags for the campaign object.
   * </pre>
   *
   * <code>repeated .bloombox.marketing.CampaignTag tag = 8;</code>
   */
  java.util.List<io.bloombox.schema.marketing.MarketingCampaign.CampaignTag> 
      getTagList();
  /**
   * <pre>
   * Tags for the campaign object.
   * </pre>
   *
   * <code>repeated .bloombox.marketing.CampaignTag tag = 8;</code>
   */
  io.bloombox.schema.marketing.MarketingCampaign.CampaignTag getTag(int index);
  /**
   * <pre>
   * Tags for the campaign object.
   * </pre>
   *
   * <code>repeated .bloombox.marketing.CampaignTag tag = 8;</code>
   */
  int getTagCount();
  /**
   * <pre>
   * Tags for the campaign object.
   * </pre>
   *
   * <code>repeated .bloombox.marketing.CampaignTag tag = 8;</code>
   */
  java.util.List<? extends io.bloombox.schema.marketing.MarketingCampaign.CampaignTagOrBuilder> 
      getTagOrBuilderList();
  /**
   * <pre>
   * Tags for the campaign object.
   * </pre>
   *
   * <code>repeated .bloombox.marketing.CampaignTag tag = 8;</code>
   */
  io.bloombox.schema.marketing.MarketingCampaign.CampaignTagOrBuilder getTagOrBuilder(
      int index);

  /**
   * <pre>
   * When the subject campaign was last modified.
   * </pre>
   *
   * <code>.opencannabis.temporal.Instant modified = 9;</code>
   */
  boolean hasModified();
  /**
   * <pre>
   * When the subject campaign was last modified.
   * </pre>
   *
   * <code>.opencannabis.temporal.Instant modified = 9;</code>
   */
  io.opencannabis.schema.temporal.TemporalInstant.Instant getModified();
  /**
   * <pre>
   * When the subject campaign was last modified.
   * </pre>
   *
   * <code>.opencannabis.temporal.Instant modified = 9;</code>
   */
  io.opencannabis.schema.temporal.TemporalInstant.InstantOrBuilder getModifiedOrBuilder();
}
