/*
 * Copyright 2019, Momentum Ideas Co.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: oauth/Client.proto

package io.opencannabis.schema.oauth;

/**
 * <pre>
 * Enumerates OAuth2 response types supportable by clients.
 * </pre>
 *
 * Protobuf enum {@code opencannabis.oauth.ResponseType}
 */
public enum ResponseType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Unspecified, or unresolved, response type.
   * </pre>
   *
   * <code>UNSPECIFIED_RESPONSE_TYPE = 0;</code>
   */
  UNSPECIFIED_RESPONSE_TYPE(0),
  /**
   * <pre>
   * 'token' response type.
   * </pre>
   *
   * <code>TOKEN = 1;</code>
   */
  TOKEN(1),
  /**
   * <pre>
   * 'code' response type.
   * </pre>
   *
   * <code>CODE = 2;</code>
   */
  CODE(2),
  /**
   * <pre>
   * 'id_token' response type.
   * </pre>
   *
   * <code>ID_TOKEN = 3;</code>
   */
  ID_TOKEN(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Unspecified, or unresolved, response type.
   * </pre>
   *
   * <code>UNSPECIFIED_RESPONSE_TYPE = 0;</code>
   */
  public static final int UNSPECIFIED_RESPONSE_TYPE_VALUE = 0;
  /**
   * <pre>
   * 'token' response type.
   * </pre>
   *
   * <code>TOKEN = 1;</code>
   */
  public static final int TOKEN_VALUE = 1;
  /**
   * <pre>
   * 'code' response type.
   * </pre>
   *
   * <code>CODE = 2;</code>
   */
  public static final int CODE_VALUE = 2;
  /**
   * <pre>
   * 'id_token' response type.
   * </pre>
   *
   * <code>ID_TOKEN = 3;</code>
   */
  public static final int ID_TOKEN_VALUE = 3;


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
  public static ResponseType valueOf(int value) {
    return forNumber(value);
  }

  public static ResponseType forNumber(int value) {
    switch (value) {
      case 0: return UNSPECIFIED_RESPONSE_TYPE;
      case 1: return TOKEN;
      case 2: return CODE;
      case 3: return ID_TOKEN;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ResponseType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ResponseType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ResponseType>() {
          public ResponseType findValueByNumber(int number) {
            return ResponseType.forNumber(number);
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
    return io.opencannabis.schema.oauth.OAuthClient.getDescriptor().getEnumTypes().get(0);
  }

  private static final ResponseType[] VALUES = values();

  public static ResponseType valueOf(
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

  private ResponseType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:opencannabis.oauth.ResponseType)
}

