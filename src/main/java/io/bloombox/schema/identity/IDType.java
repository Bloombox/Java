// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: identity/ID.proto

package io.bloombox.schema.identity;

/**
 * <pre>
 * Enumerates supported types of user-provided, government-issued ID.
 * </pre>
 *
 * Protobuf enum {@code identity.IDType}
 */
public enum IDType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * United States Driver's License, issued by a U.S. state government.
   * </pre>
   *
   * <code>USDL = 0;</code>
   */
  USDL(0),
  /**
   * <pre>
   * National passport, issued by a nation-state.
   * </pre>
   *
   * <code>PASSPORT = 1;</code>
   */
  PASSPORT(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * United States Driver's License, issued by a U.S. state government.
   * </pre>
   *
   * <code>USDL = 0;</code>
   */
  public static final int USDL_VALUE = 0;
  /**
   * <pre>
   * National passport, issued by a nation-state.
   * </pre>
   *
   * <code>PASSPORT = 1;</code>
   */
  public static final int PASSPORT_VALUE = 1;


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
  public static IDType valueOf(int value) {
    return forNumber(value);
  }

  public static IDType forNumber(int value) {
    switch (value) {
      case 0: return USDL;
      case 1: return PASSPORT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<IDType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      IDType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<IDType>() {
          public IDType findValueByNumber(int number) {
            return IDType.forNumber(number);
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
    return io.bloombox.schema.identity.IDOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final IDType[] VALUES = values();

  public static IDType valueOf(
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

  private IDType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:identity.IDType)
}

