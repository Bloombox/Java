// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: structs/ProductFlags.proto

package io.opencannabis.schema.product.struct;

/**
 * <pre>
 * top-level flags
 * </pre>
 *
 * Protobuf enum {@code opencannabis.structs.ProductFlag}
 */
public enum ProductFlag
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>VISIBLE = 0;</code>
   */
  VISIBLE(0),
  /**
   * <code>HIDDEN = 1;</code>
   */
  HIDDEN(1),
  /**
   * <code>PREMIUM = 2;</code>
   */
  PREMIUM(2),
  /**
   * <code>FEATURED = 3;</code>
   */
  FEATURED(3),
  /**
   * <code>ORGANIC = 4;</code>
   */
  ORGANIC(4),
  /**
   * <code>EXCLUSIVE = 5;</code>
   */
  EXCLUSIVE(5),
  /**
   * <code>IN_HOUSE = 6;</code>
   */
  IN_HOUSE(6),
  /**
   * <code>LAST_CHANCE = 7;</code>
   */
  LAST_CHANCE(7),
  /**
   * <code>LIMITED_TIME = 8;</code>
   */
  LIMITED_TIME(8),
  /**
   * <code>ON_SALE = 9;</code>
   */
  ON_SALE(9),
  /**
   * <code>LOCAL = 10;</code>
   */
  LOCAL(10),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>VISIBLE = 0;</code>
   */
  public static final int VISIBLE_VALUE = 0;
  /**
   * <code>HIDDEN = 1;</code>
   */
  public static final int HIDDEN_VALUE = 1;
  /**
   * <code>PREMIUM = 2;</code>
   */
  public static final int PREMIUM_VALUE = 2;
  /**
   * <code>FEATURED = 3;</code>
   */
  public static final int FEATURED_VALUE = 3;
  /**
   * <code>ORGANIC = 4;</code>
   */
  public static final int ORGANIC_VALUE = 4;
  /**
   * <code>EXCLUSIVE = 5;</code>
   */
  public static final int EXCLUSIVE_VALUE = 5;
  /**
   * <code>IN_HOUSE = 6;</code>
   */
  public static final int IN_HOUSE_VALUE = 6;
  /**
   * <code>LAST_CHANCE = 7;</code>
   */
  public static final int LAST_CHANCE_VALUE = 7;
  /**
   * <code>LIMITED_TIME = 8;</code>
   */
  public static final int LIMITED_TIME_VALUE = 8;
  /**
   * <code>ON_SALE = 9;</code>
   */
  public static final int ON_SALE_VALUE = 9;
  /**
   * <code>LOCAL = 10;</code>
   */
  public static final int LOCAL_VALUE = 10;


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
  public static ProductFlag valueOf(int value) {
    return forNumber(value);
  }

  public static ProductFlag forNumber(int value) {
    switch (value) {
      case 0: return VISIBLE;
      case 1: return HIDDEN;
      case 2: return PREMIUM;
      case 3: return FEATURED;
      case 4: return ORGANIC;
      case 5: return EXCLUSIVE;
      case 6: return IN_HOUSE;
      case 7: return LAST_CHANCE;
      case 8: return LIMITED_TIME;
      case 9: return ON_SALE;
      case 10: return LOCAL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ProductFlag>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ProductFlag> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ProductFlag>() {
          public ProductFlag findValueByNumber(int number) {
            return ProductFlag.forNumber(number);
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
    return io.opencannabis.schema.product.struct.BaseStructs.getDescriptor().getEnumTypes().get(0);
  }

  private static final ProductFlag[] VALUES = values();

  public static ProductFlag valueOf(
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

  private ProductFlag(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:opencannabis.structs.ProductFlag)
}

