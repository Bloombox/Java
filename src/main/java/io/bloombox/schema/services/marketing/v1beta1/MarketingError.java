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

/**
 * <pre>
 * Enumerates known errors that may be thrown by marketing operations.
 * </pre>
 *
 * Protobuf enum {@code bloombox.services.marketing.v1beta1.MarketingError}
 */
public enum MarketingError
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * No error was encountered.
   * </pre>
   *
   * <code>NO_ERROR = 0;</code>
   */
  NO_ERROR(0),
  /**
   * <pre>
   * The specified partner ID is invalid.
   * </pre>
   *
   * <code>PARTNER_INVALID = 1;</code>
   */
  PARTNER_INVALID(1),
  /**
   * <pre>
   * The specified location ID is invalid.
   * </pre>
   *
   * <code>LOCATION_INVALID = 2;</code>
   */
  LOCATION_INVALID(2),
  /**
   * <pre>
   * The specified campaign ID was found to be invalid.
   * </pre>
   *
   * <code>ID_INVALID = 3;</code>
   */
  ID_INVALID(3),
  /**
   * <pre>
   * The specified campaign name was found to be invalid.
   * </pre>
   *
   * <code>NAME_INVALID = 4;</code>
   */
  NAME_INVALID(4),
  /**
   * <pre>
   * The specified campaign could not be located.
   * </pre>
   *
   * <code>CAMPAIGN_NOT_FOUND = 5;</code>
   */
  CAMPAIGN_NOT_FOUND(5),
  /**
   * <pre>
   * The configured access permissions do not allow the requested operation.
   * </pre>
   *
   * <code>ACCESS_DENIED = 6;</code>
   */
  ACCESS_DENIED(6),
  /**
   * <pre>
   * The specified campaign settings were invalid.
   * </pre>
   *
   * <code>SETTINGS_INVALID = 7;</code>
   */
  SETTINGS_INVALID(7),
  /**
   * <pre>
   * The specified channel was invalid.
   * </pre>
   *
   * <code>CHANNEL_INVALID = 8;</code>
   */
  CHANNEL_INVALID(8),
  /**
   * <pre>
   * The specified adgroup payload was found to be invalid.
   * </pre>
   *
   * <code>ADGROUP_INVALID = 9;</code>
   */
  ADGROUP_INVALID(9),
  /**
   * <pre>
   * Must provide settings payload to match the channel type specified.
   * </pre>
   *
   * <code>SETTINGS_MISMATCH = 10;</code>
   */
  SETTINGS_MISMATCH(10),
  /**
   * <pre>
   * The specified adgroup creative was invalid for some reason.
   * </pre>
   *
   * <code>CREATIVE_INVALID = 11;</code>
   */
  CREATIVE_INVALID(11),
  /**
   * <pre>
   * The specified adgroup SMS creative was invalid for some reason.
   * </pre>
   *
   * <code>SMS_CREATIVE_INVALID = 12;</code>
   */
  SMS_CREATIVE_INVALID(12),
  /**
   * <pre>
   * The specified adgroup email creative was invalid for some reason.
   * </pre>
   *
   * <code>EMAIL_CREATIVE_INVALID = 13;</code>
   */
  EMAIL_CREATIVE_INVALID(13),
  /**
   * <pre>
   * The specified update was invalid.
   * </pre>
   *
   * <code>UPDATE_INVALID = 14;</code>
   */
  UPDATE_INVALID(14),
  /**
   * <pre>
   * The server encountered some internal error.
   * </pre>
   *
   * <code>INTERNAL_ERROR = 99;</code>
   */
  INTERNAL_ERROR(99),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * No error was encountered.
   * </pre>
   *
   * <code>NO_ERROR = 0;</code>
   */
  public static final int NO_ERROR_VALUE = 0;
  /**
   * <pre>
   * The specified partner ID is invalid.
   * </pre>
   *
   * <code>PARTNER_INVALID = 1;</code>
   */
  public static final int PARTNER_INVALID_VALUE = 1;
  /**
   * <pre>
   * The specified location ID is invalid.
   * </pre>
   *
   * <code>LOCATION_INVALID = 2;</code>
   */
  public static final int LOCATION_INVALID_VALUE = 2;
  /**
   * <pre>
   * The specified campaign ID was found to be invalid.
   * </pre>
   *
   * <code>ID_INVALID = 3;</code>
   */
  public static final int ID_INVALID_VALUE = 3;
  /**
   * <pre>
   * The specified campaign name was found to be invalid.
   * </pre>
   *
   * <code>NAME_INVALID = 4;</code>
   */
  public static final int NAME_INVALID_VALUE = 4;
  /**
   * <pre>
   * The specified campaign could not be located.
   * </pre>
   *
   * <code>CAMPAIGN_NOT_FOUND = 5;</code>
   */
  public static final int CAMPAIGN_NOT_FOUND_VALUE = 5;
  /**
   * <pre>
   * The configured access permissions do not allow the requested operation.
   * </pre>
   *
   * <code>ACCESS_DENIED = 6;</code>
   */
  public static final int ACCESS_DENIED_VALUE = 6;
  /**
   * <pre>
   * The specified campaign settings were invalid.
   * </pre>
   *
   * <code>SETTINGS_INVALID = 7;</code>
   */
  public static final int SETTINGS_INVALID_VALUE = 7;
  /**
   * <pre>
   * The specified channel was invalid.
   * </pre>
   *
   * <code>CHANNEL_INVALID = 8;</code>
   */
  public static final int CHANNEL_INVALID_VALUE = 8;
  /**
   * <pre>
   * The specified adgroup payload was found to be invalid.
   * </pre>
   *
   * <code>ADGROUP_INVALID = 9;</code>
   */
  public static final int ADGROUP_INVALID_VALUE = 9;
  /**
   * <pre>
   * Must provide settings payload to match the channel type specified.
   * </pre>
   *
   * <code>SETTINGS_MISMATCH = 10;</code>
   */
  public static final int SETTINGS_MISMATCH_VALUE = 10;
  /**
   * <pre>
   * The specified adgroup creative was invalid for some reason.
   * </pre>
   *
   * <code>CREATIVE_INVALID = 11;</code>
   */
  public static final int CREATIVE_INVALID_VALUE = 11;
  /**
   * <pre>
   * The specified adgroup SMS creative was invalid for some reason.
   * </pre>
   *
   * <code>SMS_CREATIVE_INVALID = 12;</code>
   */
  public static final int SMS_CREATIVE_INVALID_VALUE = 12;
  /**
   * <pre>
   * The specified adgroup email creative was invalid for some reason.
   * </pre>
   *
   * <code>EMAIL_CREATIVE_INVALID = 13;</code>
   */
  public static final int EMAIL_CREATIVE_INVALID_VALUE = 13;
  /**
   * <pre>
   * The specified update was invalid.
   * </pre>
   *
   * <code>UPDATE_INVALID = 14;</code>
   */
  public static final int UPDATE_INVALID_VALUE = 14;
  /**
   * <pre>
   * The server encountered some internal error.
   * </pre>
   *
   * <code>INTERNAL_ERROR = 99;</code>
   */
  public static final int INTERNAL_ERROR_VALUE = 99;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static MarketingError valueOf(int value) {
    return forNumber(value);
  }

  public static MarketingError forNumber(int value) {
    switch (value) {
      case 0: return NO_ERROR;
      case 1: return PARTNER_INVALID;
      case 2: return LOCATION_INVALID;
      case 3: return ID_INVALID;
      case 4: return NAME_INVALID;
      case 5: return CAMPAIGN_NOT_FOUND;
      case 6: return ACCESS_DENIED;
      case 7: return SETTINGS_INVALID;
      case 8: return CHANNEL_INVALID;
      case 9: return ADGROUP_INVALID;
      case 10: return SETTINGS_MISMATCH;
      case 11: return CREATIVE_INVALID;
      case 12: return SMS_CREATIVE_INVALID;
      case 13: return EMAIL_CREATIVE_INVALID;
      case 14: return UPDATE_INVALID;
      case 99: return INTERNAL_ERROR;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MarketingError>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MarketingError> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MarketingError>() {
          public MarketingError findValueByNumber(int number) {
            return MarketingError.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return io.bloombox.schema.services.marketing.v1beta1.MarketingServiceBeta1.getDescriptor().getEnumTypes().get(0);
  }

  private static final MarketingError[] VALUES = values();

  public static MarketingError valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private MarketingError(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bloombox.services.marketing.v1beta1.MarketingError)
}

