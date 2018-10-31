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
// source: auth/v1beta1/AuthService_Beta1.proto

package io.bloombox.schema.services.auth.v1beta1;

/**
 * <pre>
 * Enumerates known errors that may be thrown by auth operations.
 * </pre>
 *
 * Protobuf enum {@code bloombox.schema.services.auth.v1beta1.AuthError}
 */
public enum AuthError
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * There was no error.
   * </pre>
   *
   * <code>NO_ERROR = 0;</code>
   */
  NO_ERROR(0),
  /**
   * <pre>
   * Access was denied: the user's account is suspended.
   * </pre>
   *
   * <code>ACCOUNT_SUSPENDED = 1;</code>
   */
  ACCOUNT_SUSPENDED(1),
  /**
   * <pre>
   * Profile could not be located.
   * </pre>
   *
   * <code>PROFILE_NOT_FOUND = 2;</code>
   */
  PROFILE_NOT_FOUND(2),
  /**
   * <pre>
   * The provided user key was found to be invalid.
   * </pre>
   *
   * <code>INVALID_USER_KEY = 3;</code>
   */
  INVALID_USER_KEY(3),
  /**
   * <pre>
   * The provided auth assertion was deemed to be invalid.
   * </pre>
   *
   * <code>INVALID_ASSERTION = 4;</code>
   */
  INVALID_ASSERTION(4),
  /**
   * <pre>
   * The specified authentication type is not currently supported.
   * </pre>
   *
   * <code>UNSUPPORTED_LOGIN_TYPE = 5;</code>
   */
  UNSUPPORTED_LOGIN_TYPE(5),
  /**
   * <pre>
   * Authentication token from Hydra was not valid.
   * </pre>
   *
   * <code>INVALID_AUTH_TOKEN = 6;</code>
   */
  INVALID_AUTH_TOKEN(6),
  /**
   * <pre>
   * The ticket provided for consent was invalid.
   * </pre>
   *
   * <code>INVALID_TICKET = 7;</code>
   */
  INVALID_TICKET(7),
  /**
   * <pre>
   * The client's profile could not be located.
   * </pre>
   *
   * <code>CLIENT_NOT_FOUND = 8;</code>
   */
  CLIENT_NOT_FOUND(8),
  /**
   * <pre>
   * Consent ID is not valid.
   * </pre>
   *
   * <code>INVALID_CONSENT_ID = 9;</code>
   */
  INVALID_CONSENT_ID(9),
  /**
   * <pre>
   * The provided ID token information was found to be invalid.
   * </pre>
   *
   * <code>INVALID_ID_TOKEN = 10;</code>
   */
  INVALID_ID_TOKEN(10),
  /**
   * <pre>
   * The provided access token information was found to be invalid.
   * </pre>
   *
   * <code>INVALID_ACCESS_TOKEN = 11;</code>
   */
  INVALID_ACCESS_TOKEN(11),
  /**
   * <pre>
   * The provided ID token was found to be expired.
   * </pre>
   *
   * <code>EXPIRED_ID_TOKEN = 12;</code>
   */
  EXPIRED_ID_TOKEN(12),
  /**
   * <pre>
   * The provided access token was found to be expired.
   * </pre>
   *
   * <code>EXPIRED_ACCESS_TOKEN = 13;</code>
   */
  EXPIRED_ACCESS_TOKEN(13),
  /**
   * <pre>
   * The specified client was invalid.
   * </pre>
   *
   * <code>INVALID_CLIENT = 14;</code>
   */
  INVALID_CLIENT(14),
  /**
   * <pre>
   * The specified origin was invalid.
   * </pre>
   *
   * <code>INVALID_ORIGIN = 15;</code>
   */
  INVALID_ORIGIN(15),
  /**
   * <pre>
   * Access was denied for unspecified reasons.
   * </pre>
   *
   * <code>ACCESS_DENIED = 16;</code>
   */
  ACCESS_DENIED(16),
  /**
   * <pre>
   * The provided session value was invalid.
   * </pre>
   *
   * <code>INVALID_SESSION = 17;</code>
   */
  INVALID_SESSION(17),
  /**
   * <pre>
   * The provided session has expired.
   * </pre>
   *
   * <code>EXPIRED_SESSION = 18;</code>
   */
  EXPIRED_SESSION(18),
  /**
   * <pre>
   * The provided fingerprint value was invalid.
   * </pre>
   *
   * <code>INVALID_FINGERPRINT = 19;</code>
   */
  INVALID_FINGERPRINT(19),
  /**
   * <pre>
   * Captcha verification value was invalid.
   * </pre>
   *
   * <code>INVALID_CAPTCHA = 20;</code>
   */
  INVALID_CAPTCHA(20),
  /**
   * <pre>
   * The provided captcha veriication value was not correct.
   * </pre>
   *
   * <code>CAPTCHA_REJECTED = 21;</code>
   */
  CAPTCHA_REJECTED(21),
  /**
   * <pre>
   * The specified consent ID could not be resolved.
   * </pre>
   *
   * <code>CONSENT_NOT_FOUND = 22;</code>
   */
  CONSENT_NOT_FOUND(22),
  /**
   * <pre>
   * Consent operation or consent record has expired.
   * </pre>
   *
   * <code>EXPIRED_CONSENT = 23;</code>
   */
  EXPIRED_CONSENT(23),
  /**
   * <pre>
   * The specified nonce was missing, invalid, or already used.
   * </pre>
   *
   * <code>INVALID_NONCE = 24;</code>
   */
  INVALID_NONCE(24),
  /**
   * <pre>
   * An internal error was encountered.
   * </pre>
   *
   * <code>INTERNAL_ERROR = 99;</code>
   */
  INTERNAL_ERROR(99),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * There was no error.
   * </pre>
   *
   * <code>NO_ERROR = 0;</code>
   */
  public static final int NO_ERROR_VALUE = 0;
  /**
   * <pre>
   * Access was denied: the user's account is suspended.
   * </pre>
   *
   * <code>ACCOUNT_SUSPENDED = 1;</code>
   */
  public static final int ACCOUNT_SUSPENDED_VALUE = 1;
  /**
   * <pre>
   * Profile could not be located.
   * </pre>
   *
   * <code>PROFILE_NOT_FOUND = 2;</code>
   */
  public static final int PROFILE_NOT_FOUND_VALUE = 2;
  /**
   * <pre>
   * The provided user key was found to be invalid.
   * </pre>
   *
   * <code>INVALID_USER_KEY = 3;</code>
   */
  public static final int INVALID_USER_KEY_VALUE = 3;
  /**
   * <pre>
   * The provided auth assertion was deemed to be invalid.
   * </pre>
   *
   * <code>INVALID_ASSERTION = 4;</code>
   */
  public static final int INVALID_ASSERTION_VALUE = 4;
  /**
   * <pre>
   * The specified authentication type is not currently supported.
   * </pre>
   *
   * <code>UNSUPPORTED_LOGIN_TYPE = 5;</code>
   */
  public static final int UNSUPPORTED_LOGIN_TYPE_VALUE = 5;
  /**
   * <pre>
   * Authentication token from Hydra was not valid.
   * </pre>
   *
   * <code>INVALID_AUTH_TOKEN = 6;</code>
   */
  public static final int INVALID_AUTH_TOKEN_VALUE = 6;
  /**
   * <pre>
   * The ticket provided for consent was invalid.
   * </pre>
   *
   * <code>INVALID_TICKET = 7;</code>
   */
  public static final int INVALID_TICKET_VALUE = 7;
  /**
   * <pre>
   * The client's profile could not be located.
   * </pre>
   *
   * <code>CLIENT_NOT_FOUND = 8;</code>
   */
  public static final int CLIENT_NOT_FOUND_VALUE = 8;
  /**
   * <pre>
   * Consent ID is not valid.
   * </pre>
   *
   * <code>INVALID_CONSENT_ID = 9;</code>
   */
  public static final int INVALID_CONSENT_ID_VALUE = 9;
  /**
   * <pre>
   * The provided ID token information was found to be invalid.
   * </pre>
   *
   * <code>INVALID_ID_TOKEN = 10;</code>
   */
  public static final int INVALID_ID_TOKEN_VALUE = 10;
  /**
   * <pre>
   * The provided access token information was found to be invalid.
   * </pre>
   *
   * <code>INVALID_ACCESS_TOKEN = 11;</code>
   */
  public static final int INVALID_ACCESS_TOKEN_VALUE = 11;
  /**
   * <pre>
   * The provided ID token was found to be expired.
   * </pre>
   *
   * <code>EXPIRED_ID_TOKEN = 12;</code>
   */
  public static final int EXPIRED_ID_TOKEN_VALUE = 12;
  /**
   * <pre>
   * The provided access token was found to be expired.
   * </pre>
   *
   * <code>EXPIRED_ACCESS_TOKEN = 13;</code>
   */
  public static final int EXPIRED_ACCESS_TOKEN_VALUE = 13;
  /**
   * <pre>
   * The specified client was invalid.
   * </pre>
   *
   * <code>INVALID_CLIENT = 14;</code>
   */
  public static final int INVALID_CLIENT_VALUE = 14;
  /**
   * <pre>
   * The specified origin was invalid.
   * </pre>
   *
   * <code>INVALID_ORIGIN = 15;</code>
   */
  public static final int INVALID_ORIGIN_VALUE = 15;
  /**
   * <pre>
   * Access was denied for unspecified reasons.
   * </pre>
   *
   * <code>ACCESS_DENIED = 16;</code>
   */
  public static final int ACCESS_DENIED_VALUE = 16;
  /**
   * <pre>
   * The provided session value was invalid.
   * </pre>
   *
   * <code>INVALID_SESSION = 17;</code>
   */
  public static final int INVALID_SESSION_VALUE = 17;
  /**
   * <pre>
   * The provided session has expired.
   * </pre>
   *
   * <code>EXPIRED_SESSION = 18;</code>
   */
  public static final int EXPIRED_SESSION_VALUE = 18;
  /**
   * <pre>
   * The provided fingerprint value was invalid.
   * </pre>
   *
   * <code>INVALID_FINGERPRINT = 19;</code>
   */
  public static final int INVALID_FINGERPRINT_VALUE = 19;
  /**
   * <pre>
   * Captcha verification value was invalid.
   * </pre>
   *
   * <code>INVALID_CAPTCHA = 20;</code>
   */
  public static final int INVALID_CAPTCHA_VALUE = 20;
  /**
   * <pre>
   * The provided captcha veriication value was not correct.
   * </pre>
   *
   * <code>CAPTCHA_REJECTED = 21;</code>
   */
  public static final int CAPTCHA_REJECTED_VALUE = 21;
  /**
   * <pre>
   * The specified consent ID could not be resolved.
   * </pre>
   *
   * <code>CONSENT_NOT_FOUND = 22;</code>
   */
  public static final int CONSENT_NOT_FOUND_VALUE = 22;
  /**
   * <pre>
   * Consent operation or consent record has expired.
   * </pre>
   *
   * <code>EXPIRED_CONSENT = 23;</code>
   */
  public static final int EXPIRED_CONSENT_VALUE = 23;
  /**
   * <pre>
   * The specified nonce was missing, invalid, or already used.
   * </pre>
   *
   * <code>INVALID_NONCE = 24;</code>
   */
  public static final int INVALID_NONCE_VALUE = 24;
  /**
   * <pre>
   * An internal error was encountered.
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
  public static AuthError valueOf(int value) {
    return forNumber(value);
  }

  public static AuthError forNumber(int value) {
    switch (value) {
      case 0: return NO_ERROR;
      case 1: return ACCOUNT_SUSPENDED;
      case 2: return PROFILE_NOT_FOUND;
      case 3: return INVALID_USER_KEY;
      case 4: return INVALID_ASSERTION;
      case 5: return UNSUPPORTED_LOGIN_TYPE;
      case 6: return INVALID_AUTH_TOKEN;
      case 7: return INVALID_TICKET;
      case 8: return CLIENT_NOT_FOUND;
      case 9: return INVALID_CONSENT_ID;
      case 10: return INVALID_ID_TOKEN;
      case 11: return INVALID_ACCESS_TOKEN;
      case 12: return EXPIRED_ID_TOKEN;
      case 13: return EXPIRED_ACCESS_TOKEN;
      case 14: return INVALID_CLIENT;
      case 15: return INVALID_ORIGIN;
      case 16: return ACCESS_DENIED;
      case 17: return INVALID_SESSION;
      case 18: return EXPIRED_SESSION;
      case 19: return INVALID_FINGERPRINT;
      case 20: return INVALID_CAPTCHA;
      case 21: return CAPTCHA_REJECTED;
      case 22: return CONSENT_NOT_FOUND;
      case 23: return EXPIRED_CONSENT;
      case 24: return INVALID_NONCE;
      case 99: return INTERNAL_ERROR;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AuthError>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AuthError> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AuthError>() {
          public AuthError findValueByNumber(int number) {
            return AuthError.forNumber(number);
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
    return io.bloombox.schema.services.auth.v1beta1.AuthServiceBeta1.getDescriptor().getEnumTypes().get(0);
  }

  private static final AuthError[] VALUES = values();

  public static AuthError valueOf(
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

  private AuthError(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bloombox.schema.services.auth.v1beta1.AuthError)
}

