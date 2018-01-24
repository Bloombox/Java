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
// source: shop/v1/ShopService_v1.proto

package io.bloombox.schema.services.shop.v1;

/**
 * <pre>
 * Enumerates errors that may prevent a user from submitting an order for pickup or delivery.
 * </pre>
 *
 * Protobuf enum {@code bloombox.schema.services.shop.v1.OrderError}
 */
public enum OrderError
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * No error occurred.
   * </pre>
   *
   * <code>NO_ERROR = 0;</code>
   */
  NO_ERROR(0),
  /**
   * <pre>
   * Generic invalid payload.
   * </pre>
   *
   * <code>INVALID_ORDER = 1;</code>
   */
  INVALID_ORDER(1),
  /**
   * <pre>
   * The user was not found to be eligible to submit orders.
   * </pre>
   *
   * <code>USER_NOT_ELIGIBLE = 2;</code>
   */
  USER_NOT_ELIGIBLE(2),
  /**
   * <pre>
   * Delivery is not supported within the zipcode provided.
   * </pre>
   *
   * <code>ZIPCODE_NOT_ELIGIBLE = 3;</code>
   */
  ZIPCODE_NOT_ELIGIBLE(3),
  /**
   * <pre>
   * Zipcode is eligible, but currently inactive.
   * </pre>
   *
   * <code>ZIPCODE_NOT_ACTIVE = 4;</code>
   */
  ZIPCODE_NOT_ACTIVE(4),
  /**
   * <pre>
   * Zipcode delivery minimum was not met by the order subtotal.
   * </pre>
   *
   * <code>ZIPCODE_MINIMUM_NOT_MET = 5;</code>
   */
  ZIPCODE_MINIMUM_NOT_MET(5),
  /**
   * <pre>
   * The partner code was invalid.
   * </pre>
   *
   * <code>INVALID_PARTNER = 6;</code>
   */
  INVALID_PARTNER(6),
  /**
   * <pre>
   * The location code was invalid.
   * </pre>
   *
   * <code>INVALID_LOCATION = 7;</code>
   */
  INVALID_LOCATION(7),
  /**
   * <pre>
   * The customer record was found to be invalid.
   * </pre>
   *
   * <code>INVALID_CUSTOMER = 8;</code>
   */
  INVALID_CUSTOMER(8),
  /**
   * <pre>
   * The request is of type DELIVERY but was missing destination information.
   * </pre>
   *
   * <code>MISSING_DESTINATION = 9;</code>
   */
  MISSING_DESTINATION(9),
  /**
   * <pre>
   * The shop is not open right now for DELIVERY, or at the requested time for PICKUP.
   * </pre>
   *
   * <code>SHOP_NOT_OPEN = 10;</code>
   */
  SHOP_NOT_OPEN(10),
  /**
   * <pre>
   * Global delivery or order minimum subtotal was not met.
   * </pre>
   *
   * <code>GLOBAL_MINIMUM_NOT_MET = 11;</code>
   */
  GLOBAL_MINIMUM_NOT_MET(11),
  /**
   * <pre>
   * The user's membership could not be located for a given dispensary.
   * </pre>
   *
   * <code>MEMBERSHIP_NOT_FOUND = 12;</code>
   */
  MEMBERSHIP_NOT_FOUND(12),
  /**
   * <pre>
   * The order was found to be a duplicate of another order.
   * </pre>
   *
   * <code>DUPLICATE_ORDER = 13;</code>
   */
  DUPLICATE_ORDER(13),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * No error occurred.
   * </pre>
   *
   * <code>NO_ERROR = 0;</code>
   */
  public static final int NO_ERROR_VALUE = 0;
  /**
   * <pre>
   * Generic invalid payload.
   * </pre>
   *
   * <code>INVALID_ORDER = 1;</code>
   */
  public static final int INVALID_ORDER_VALUE = 1;
  /**
   * <pre>
   * The user was not found to be eligible to submit orders.
   * </pre>
   *
   * <code>USER_NOT_ELIGIBLE = 2;</code>
   */
  public static final int USER_NOT_ELIGIBLE_VALUE = 2;
  /**
   * <pre>
   * Delivery is not supported within the zipcode provided.
   * </pre>
   *
   * <code>ZIPCODE_NOT_ELIGIBLE = 3;</code>
   */
  public static final int ZIPCODE_NOT_ELIGIBLE_VALUE = 3;
  /**
   * <pre>
   * Zipcode is eligible, but currently inactive.
   * </pre>
   *
   * <code>ZIPCODE_NOT_ACTIVE = 4;</code>
   */
  public static final int ZIPCODE_NOT_ACTIVE_VALUE = 4;
  /**
   * <pre>
   * Zipcode delivery minimum was not met by the order subtotal.
   * </pre>
   *
   * <code>ZIPCODE_MINIMUM_NOT_MET = 5;</code>
   */
  public static final int ZIPCODE_MINIMUM_NOT_MET_VALUE = 5;
  /**
   * <pre>
   * The partner code was invalid.
   * </pre>
   *
   * <code>INVALID_PARTNER = 6;</code>
   */
  public static final int INVALID_PARTNER_VALUE = 6;
  /**
   * <pre>
   * The location code was invalid.
   * </pre>
   *
   * <code>INVALID_LOCATION = 7;</code>
   */
  public static final int INVALID_LOCATION_VALUE = 7;
  /**
   * <pre>
   * The customer record was found to be invalid.
   * </pre>
   *
   * <code>INVALID_CUSTOMER = 8;</code>
   */
  public static final int INVALID_CUSTOMER_VALUE = 8;
  /**
   * <pre>
   * The request is of type DELIVERY but was missing destination information.
   * </pre>
   *
   * <code>MISSING_DESTINATION = 9;</code>
   */
  public static final int MISSING_DESTINATION_VALUE = 9;
  /**
   * <pre>
   * The shop is not open right now for DELIVERY, or at the requested time for PICKUP.
   * </pre>
   *
   * <code>SHOP_NOT_OPEN = 10;</code>
   */
  public static final int SHOP_NOT_OPEN_VALUE = 10;
  /**
   * <pre>
   * Global delivery or order minimum subtotal was not met.
   * </pre>
   *
   * <code>GLOBAL_MINIMUM_NOT_MET = 11;</code>
   */
  public static final int GLOBAL_MINIMUM_NOT_MET_VALUE = 11;
  /**
   * <pre>
   * The user's membership could not be located for a given dispensary.
   * </pre>
   *
   * <code>MEMBERSHIP_NOT_FOUND = 12;</code>
   */
  public static final int MEMBERSHIP_NOT_FOUND_VALUE = 12;
  /**
   * <pre>
   * The order was found to be a duplicate of another order.
   * </pre>
   *
   * <code>DUPLICATE_ORDER = 13;</code>
   */
  public static final int DUPLICATE_ORDER_VALUE = 13;


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
  public static OrderError valueOf(int value) {
    return forNumber(value);
  }

  public static OrderError forNumber(int value) {
    switch (value) {
      case 0: return NO_ERROR;
      case 1: return INVALID_ORDER;
      case 2: return USER_NOT_ELIGIBLE;
      case 3: return ZIPCODE_NOT_ELIGIBLE;
      case 4: return ZIPCODE_NOT_ACTIVE;
      case 5: return ZIPCODE_MINIMUM_NOT_MET;
      case 6: return INVALID_PARTNER;
      case 7: return INVALID_LOCATION;
      case 8: return INVALID_CUSTOMER;
      case 9: return MISSING_DESTINATION;
      case 10: return SHOP_NOT_OPEN;
      case 11: return GLOBAL_MINIMUM_NOT_MET;
      case 12: return MEMBERSHIP_NOT_FOUND;
      case 13: return DUPLICATE_ORDER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OrderError>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OrderError> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OrderError>() {
          public OrderError findValueByNumber(int number) {
            return OrderError.forNumber(number);
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
    return io.bloombox.schema.services.shop.v1.ShopServiceV1.getDescriptor().getEnumTypes().get(1);
  }

  private static final OrderError[] VALUES = values();

  public static OrderError valueOf(
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

  private OrderError(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bloombox.schema.services.shop.v1.OrderError)
}

