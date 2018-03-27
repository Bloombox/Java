// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: commerce/Currency.proto

package io.opencannabis.schema.currency;

/**
 * <pre>
 * Specifies known or explicitly supported fiat currencies.
 * </pre>
 *
 * Protobuf enum {@code opencannabis.commerce.FiatCurrency}
 */
public enum FiatCurrency
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Specifies 'US Dollar' as a currency.
   * </pre>
   *
   * <code>USD = 0;</code>
   */
  USD(0),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Specifies 'US Dollar' as a currency.
   * </pre>
   *
   * <code>USD = 0;</code>
   */
  public static final int USD_VALUE = 0;


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
  public static FiatCurrency valueOf(int value) {
    return forNumber(value);
  }

  public static FiatCurrency forNumber(int value) {
    switch (value) {
      case 0: return USD;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<FiatCurrency>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      FiatCurrency> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<FiatCurrency>() {
          public FiatCurrency findValueByNumber(int number) {
            return FiatCurrency.forNumber(number);
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
    return io.opencannabis.schema.currency.CommerceCurrency.getDescriptor().getEnumTypes().get(1);
  }

  private static final FiatCurrency[] VALUES = values();

  public static FiatCurrency valueOf(
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

  private FiatCurrency(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:opencannabis.commerce.FiatCurrency)
}

