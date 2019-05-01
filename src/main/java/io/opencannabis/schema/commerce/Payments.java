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
// source: commerce/payments/Payment.proto

package io.opencannabis.schema.commerce;

public final class Payments {
  private Payments() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * Enumerates recognized payment methods.
   * </pre>
   *
   * Protobuf enum {@code opencannabis.commerce.PaymentMethod}
   */
  public enum PaymentMethod
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Fiat or real-value cash currency.
     * </pre>
     *
     * <code>CASH = 0;</code>
     */
    CASH(0),
    /**
     * <pre>
     * Payment by check.
     * </pre>
     *
     * <code>CHECK = 1;</code>
     */
    CHECK(1),
    /**
     * <pre>
     * Debit card payment.
     * </pre>
     *
     * <code>DEBIT = 2;</code>
     */
    DEBIT(2),
    /**
     * <pre>
     * Credit card payment.
     * </pre>
     *
     * <code>CREDIT = 3;</code>
     */
    CREDIT(3),
    /**
     * <pre>
     * Digital payment via something like Paypal or Venmo.
     * </pre>
     *
     * <code>DIGITAL = 4;</code>
     */
    DIGITAL(4),
    /**
     * <pre>
     * Bank account-based payment.
     * </pre>
     *
     * <code>ACH = 5;</code>
     */
    ACH(5),
    /**
     * <pre>
     * Payment by wire transfer.
     * </pre>
     *
     * <code>WIRE = 6;</code>
     */
    WIRE(6),
    /**
     * <pre>
     * Payment via Bitcoin or some other blockchain.
     * </pre>
     *
     * <code>BLOCKCHAIN = 7;</code>
     */
    BLOCKCHAIN(7),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Fiat or real-value cash currency.
     * </pre>
     *
     * <code>CASH = 0;</code>
     */
    public static final int CASH_VALUE = 0;
    /**
     * <pre>
     * Payment by check.
     * </pre>
     *
     * <code>CHECK = 1;</code>
     */
    public static final int CHECK_VALUE = 1;
    /**
     * <pre>
     * Debit card payment.
     * </pre>
     *
     * <code>DEBIT = 2;</code>
     */
    public static final int DEBIT_VALUE = 2;
    /**
     * <pre>
     * Credit card payment.
     * </pre>
     *
     * <code>CREDIT = 3;</code>
     */
    public static final int CREDIT_VALUE = 3;
    /**
     * <pre>
     * Digital payment via something like Paypal or Venmo.
     * </pre>
     *
     * <code>DIGITAL = 4;</code>
     */
    public static final int DIGITAL_VALUE = 4;
    /**
     * <pre>
     * Bank account-based payment.
     * </pre>
     *
     * <code>ACH = 5;</code>
     */
    public static final int ACH_VALUE = 5;
    /**
     * <pre>
     * Payment by wire transfer.
     * </pre>
     *
     * <code>WIRE = 6;</code>
     */
    public static final int WIRE_VALUE = 6;
    /**
     * <pre>
     * Payment via Bitcoin or some other blockchain.
     * </pre>
     *
     * <code>BLOCKCHAIN = 7;</code>
     */
    public static final int BLOCKCHAIN_VALUE = 7;


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
    public static PaymentMethod valueOf(int value) {
      return forNumber(value);
    }

    public static PaymentMethod forNumber(int value) {
      switch (value) {
        case 0: return CASH;
        case 1: return CHECK;
        case 2: return DEBIT;
        case 3: return CREDIT;
        case 4: return DIGITAL;
        case 5: return ACH;
        case 6: return WIRE;
        case 7: return BLOCKCHAIN;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PaymentMethod>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PaymentMethod> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PaymentMethod>() {
            public PaymentMethod findValueByNumber(int number) {
              return PaymentMethod.forNumber(number);
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
      return io.opencannabis.schema.commerce.Payments.getDescriptor().getEnumTypes().get(0);
    }

    private static final PaymentMethod[] VALUES = values();

    public static PaymentMethod valueOf(
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

    private PaymentMethod(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:opencannabis.commerce.PaymentMethod)
  }

  /**
   * <pre>
   * Enumerates recognized payment methods.
   * </pre>
   *
   * Protobuf enum {@code opencannabis.commerce.PaymentCardType}
   */
  public enum PaymentCardType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Payment card type is not applicable.
     * </pre>
     *
     * <code>NO_CARD_TYPE = 0;</code>
     */
    NO_CARD_TYPE(0),
    /**
     * <pre>
     * Visa.
     * </pre>
     *
     * <code>VISA = 1;</code>
     */
    VISA(1),
    /**
     * <pre>
     * Mastercard.
     * </pre>
     *
     * <code>MASTERCARD = 2;</code>
     */
    MASTERCARD(2),
    /**
     * <pre>
     * Discover.
     * </pre>
     *
     * <code>DISCOVER = 3;</code>
     */
    DISCOVER(3),
    /**
     * <pre>
     * American Express.
     * </pre>
     *
     * <code>AMEX = 4;</code>
     */
    AMEX(4),
    /**
     * <pre>
     * Diners' Club.
     * </pre>
     *
     * <code>DINERS_CLUB = 5;</code>
     */
    DINERS_CLUB(5),
    /**
     * <pre>
     * Maestro.
     * </pre>
     *
     * <code>MAESTRO = 6;</code>
     */
    MAESTRO(6),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Payment card type is not applicable.
     * </pre>
     *
     * <code>NO_CARD_TYPE = 0;</code>
     */
    public static final int NO_CARD_TYPE_VALUE = 0;
    /**
     * <pre>
     * Visa.
     * </pre>
     *
     * <code>VISA = 1;</code>
     */
    public static final int VISA_VALUE = 1;
    /**
     * <pre>
     * Mastercard.
     * </pre>
     *
     * <code>MASTERCARD = 2;</code>
     */
    public static final int MASTERCARD_VALUE = 2;
    /**
     * <pre>
     * Discover.
     * </pre>
     *
     * <code>DISCOVER = 3;</code>
     */
    public static final int DISCOVER_VALUE = 3;
    /**
     * <pre>
     * American Express.
     * </pre>
     *
     * <code>AMEX = 4;</code>
     */
    public static final int AMEX_VALUE = 4;
    /**
     * <pre>
     * Diners' Club.
     * </pre>
     *
     * <code>DINERS_CLUB = 5;</code>
     */
    public static final int DINERS_CLUB_VALUE = 5;
    /**
     * <pre>
     * Maestro.
     * </pre>
     *
     * <code>MAESTRO = 6;</code>
     */
    public static final int MAESTRO_VALUE = 6;


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
    public static PaymentCardType valueOf(int value) {
      return forNumber(value);
    }

    public static PaymentCardType forNumber(int value) {
      switch (value) {
        case 0: return NO_CARD_TYPE;
        case 1: return VISA;
        case 2: return MASTERCARD;
        case 3: return DISCOVER;
        case 4: return AMEX;
        case 5: return DINERS_CLUB;
        case 6: return MAESTRO;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PaymentCardType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PaymentCardType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PaymentCardType>() {
            public PaymentCardType findValueByNumber(int number) {
              return PaymentCardType.forNumber(number);
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
      return io.opencannabis.schema.commerce.Payments.getDescriptor().getEnumTypes().get(1);
    }

    private static final PaymentCardType[] VALUES = values();

    public static PaymentCardType valueOf(
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

    private PaymentCardType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:opencannabis.commerce.PaymentCardType)
  }

  /**
   * <pre>
   * Enumerates types of digital payment networks.
   * </pre>
   *
   * Protobuf enum {@code opencannabis.commerce.DigitalPaymentNetwork}
   */
  public enum DigitalPaymentNetwork
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Unspecified or unrecognized digital payment network.
     * </pre>
     *
     * <code>UNSPECIFIED_NETWORK = 0;</code>
     */
    UNSPECIFIED_NETWORK(0),
    /**
     * <pre>
     * Paypal.
     * </pre>
     *
     * <code>PAYPAL = 1;</code>
     */
    PAYPAL(1),
    /**
     * <pre>
     * Venmo.
     * </pre>
     *
     * <code>VENMO = 2;</code>
     */
    VENMO(2),
    /**
     * <pre>
     * Square or Square Cash.
     * </pre>
     *
     * <code>SQUARE = 3;</code>
     */
    SQUARE(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Unspecified or unrecognized digital payment network.
     * </pre>
     *
     * <code>UNSPECIFIED_NETWORK = 0;</code>
     */
    public static final int UNSPECIFIED_NETWORK_VALUE = 0;
    /**
     * <pre>
     * Paypal.
     * </pre>
     *
     * <code>PAYPAL = 1;</code>
     */
    public static final int PAYPAL_VALUE = 1;
    /**
     * <pre>
     * Venmo.
     * </pre>
     *
     * <code>VENMO = 2;</code>
     */
    public static final int VENMO_VALUE = 2;
    /**
     * <pre>
     * Square or Square Cash.
     * </pre>
     *
     * <code>SQUARE = 3;</code>
     */
    public static final int SQUARE_VALUE = 3;


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
    public static DigitalPaymentNetwork valueOf(int value) {
      return forNumber(value);
    }

    public static DigitalPaymentNetwork forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED_NETWORK;
        case 1: return PAYPAL;
        case 2: return VENMO;
        case 3: return SQUARE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DigitalPaymentNetwork>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        DigitalPaymentNetwork> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DigitalPaymentNetwork>() {
            public DigitalPaymentNetwork findValueByNumber(int number) {
              return DigitalPaymentNetwork.forNumber(number);
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
      return io.opencannabis.schema.commerce.Payments.getDescriptor().getEnumTypes().get(2);
    }

    private static final DigitalPaymentNetwork[] VALUES = values();

    public static DigitalPaymentNetwork valueOf(
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

    private DigitalPaymentNetwork(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:opencannabis.commerce.DigitalPaymentNetwork)
  }

  /**
   * <pre>
   * Enumeration for status of an individual payment portion.
   * </pre>
   *
   * Protobuf enum {@code opencannabis.commerce.PaymentStatus}
   */
  public enum PaymentStatus
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Payment information is not applicable to this order.
     * </pre>
     *
     * <code>NOT_APPLICABLE = 0;</code>
     */
    NOT_APPLICABLE(0),
    /**
     * <pre>
     * Charge is pending fulfillment.
     * </pre>
     *
     * <code>WAITING = 1;</code>
     */
    WAITING(1),
    /**
     * <pre>
     * The user's card has been pre-authorized, pending fulfillment.
     * </pre>
     *
     * <code>PREAUTHORIZED = 2;</code>
     */
    PREAUTHORIZED(2),
    /**
     * <pre>
     * Payment for this order did not go through.
     * </pre>
     *
     * <code>BOUNCED = 3;</code>
     */
    BOUNCED(3),
    /**
     * <pre>
     * Payment for this order did not go through, and was retried.
     * </pre>
     *
     * <code>RETRIED = 4;</code>
     */
    RETRIED(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Payment information is not applicable to this order.
     * </pre>
     *
     * <code>NOT_APPLICABLE = 0;</code>
     */
    public static final int NOT_APPLICABLE_VALUE = 0;
    /**
     * <pre>
     * Charge is pending fulfillment.
     * </pre>
     *
     * <code>WAITING = 1;</code>
     */
    public static final int WAITING_VALUE = 1;
    /**
     * <pre>
     * The user's card has been pre-authorized, pending fulfillment.
     * </pre>
     *
     * <code>PREAUTHORIZED = 2;</code>
     */
    public static final int PREAUTHORIZED_VALUE = 2;
    /**
     * <pre>
     * Payment for this order did not go through.
     * </pre>
     *
     * <code>BOUNCED = 3;</code>
     */
    public static final int BOUNCED_VALUE = 3;
    /**
     * <pre>
     * Payment for this order did not go through, and was retried.
     * </pre>
     *
     * <code>RETRIED = 4;</code>
     */
    public static final int RETRIED_VALUE = 4;


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
    public static PaymentStatus valueOf(int value) {
      return forNumber(value);
    }

    public static PaymentStatus forNumber(int value) {
      switch (value) {
        case 0: return NOT_APPLICABLE;
        case 1: return WAITING;
        case 2: return PREAUTHORIZED;
        case 3: return BOUNCED;
        case 4: return RETRIED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PaymentStatus>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PaymentStatus> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PaymentStatus>() {
            public PaymentStatus findValueByNumber(int number) {
              return PaymentStatus.forNumber(number);
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
      return io.opencannabis.schema.commerce.Payments.getDescriptor().getEnumTypes().get(3);
    }

    private static final PaymentStatus[] VALUES = values();

    public static PaymentStatus valueOf(
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

    private PaymentStatus(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:opencannabis.commerce.PaymentStatus)
  }

  /**
   * <pre>
   * Enumeration for payment status of an order.
   * </pre>
   *
   * Protobuf enum {@code opencannabis.commerce.BillStatus}
   */
  public enum BillStatus
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * The bill has not been paid, partially or in full.
     * </pre>
     *
     * <code>SUSPENSE = 0;</code>
     */
    SUSPENSE(0),
    /**
     * <pre>
     * The user has paid partially for this order.
     * </pre>
     *
     * <code>PARTIAL = 3;</code>
     */
    PARTIAL(3),
    /**
     * <pre>
     * The user has settled payment for this order in full.
     * </pre>
     *
     * <code>SETTLED = 4;</code>
     */
    SETTLED(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * The bill has not been paid, partially or in full.
     * </pre>
     *
     * <code>SUSPENSE = 0;</code>
     */
    public static final int SUSPENSE_VALUE = 0;
    /**
     * <pre>
     * The user has paid partially for this order.
     * </pre>
     *
     * <code>PARTIAL = 3;</code>
     */
    public static final int PARTIAL_VALUE = 3;
    /**
     * <pre>
     * The user has settled payment for this order in full.
     * </pre>
     *
     * <code>SETTLED = 4;</code>
     */
    public static final int SETTLED_VALUE = 4;


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
    public static BillStatus valueOf(int value) {
      return forNumber(value);
    }

    public static BillStatus forNumber(int value) {
      switch (value) {
        case 0: return SUSPENSE;
        case 3: return PARTIAL;
        case 4: return SETTLED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<BillStatus>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        BillStatus> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<BillStatus>() {
            public BillStatus findValueByNumber(int number) {
              return BillStatus.forNumber(number);
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
      return io.opencannabis.schema.commerce.Payments.getDescriptor().getEnumTypes().get(4);
    }

    private static final BillStatus[] VALUES = values();

    public static BillStatus valueOf(
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

    private BillStatus(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:opencannabis.commerce.BillStatus)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037commerce/payments/Payment.proto\022\025openc" +
      "annabis.commerce*k\n\rPaymentMethod\022\010\n\004CAS" +
      "H\020\000\022\t\n\005CHECK\020\001\022\t\n\005DEBIT\020\002\022\n\n\006CREDIT\020\003\022\013\n" +
      "\007DIGITAL\020\004\022\007\n\003ACH\020\005\022\010\n\004WIRE\020\006\022\016\n\nBLOCKCH" +
      "AIN\020\007*s\n\017PaymentCardType\022\020\n\014NO_CARD_TYPE" +
      "\020\000\022\010\n\004VISA\020\001\022\016\n\nMASTERCARD\020\002\022\014\n\010DISCOVER" +
      "\020\003\022\010\n\004AMEX\020\004\022\017\n\013DINERS_CLUB\020\005\022\013\n\007MAESTRO" +
      "\020\006*S\n\025DigitalPaymentNetwork\022\027\n\023UNSPECIFI" +
      "ED_NETWORK\020\000\022\n\n\006PAYPAL\020\001\022\t\n\005VENMO\020\002\022\n\n\006S" +
      "QUARE\020\003*]\n\rPaymentStatus\022\022\n\016NOT_APPLICAB" +
      "LE\020\000\022\013\n\007WAITING\020\001\022\021\n\rPREAUTHORIZED\020\002\022\013\n\007" +
      "BOUNCED\020\003\022\013\n\007RETRIED\020\004*4\n\nBillStatus\022\014\n\010" +
      "SUSPENSE\020\000\022\013\n\007PARTIAL\020\003\022\013\n\007SETTLED\020\004B5\n\037" +
      "io.opencannabis.schema.commerceB\010Payment" +
      "sH\001P\000\242\002\003OCSb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
