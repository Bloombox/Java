// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: structs/labtesting/TestValue.proto

package io.opencannabis.schema.product.struct.testing;

/**
 * <pre>
 * -- Testing: Base (Shared) Protocol
 * </pre>
 *
 * Protobuf enum {@code opencannabis.structs.labtesting.TestValueType}
 */
public enum TestValueType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>MILLIGRAMS = 0;</code>
   */
  MILLIGRAMS(0),
  /**
   * <code>PERCENTAGE = 1;</code>
   */
  PERCENTAGE(1),
  /**
   * <code>PRESENCE = 2;</code>
   */
  PRESENCE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>MILLIGRAMS = 0;</code>
   */
  public static final int MILLIGRAMS_VALUE = 0;
  /**
   * <code>PERCENTAGE = 1;</code>
   */
  public static final int PERCENTAGE_VALUE = 1;
  /**
   * <code>PRESENCE = 2;</code>
   */
  public static final int PRESENCE_VALUE = 2;


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
  public static TestValueType valueOf(int value) {
    return forNumber(value);
  }

  public static TestValueType forNumber(int value) {
    switch (value) {
      case 0: return MILLIGRAMS;
      case 1: return PERCENTAGE;
      case 2: return PRESENCE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TestValueType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TestValueType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TestValueType>() {
          public TestValueType findValueByNumber(int number) {
            return TestValueType.forNumber(number);
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
    return io.opencannabis.schema.product.struct.testing.BaseTestingSpec.getDescriptor().getEnumTypes().get(0);
  }

  private static final TestValueType[] VALUES = values();

  public static TestValueType valueOf(
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

  private TestValueType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:opencannabis.structs.labtesting.TestValueType)
}

