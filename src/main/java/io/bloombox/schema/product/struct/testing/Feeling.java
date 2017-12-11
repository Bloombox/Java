// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: structs/labtesting/TestResults.proto

package io.bloombox.schema.product.struct.testing;

/**
 * <pre>
 * -- Testing: Subjective
 * </pre>
 *
 * Protobuf enum {@code structs.labtesting.Feeling}
 */
public enum Feeling
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>NO_FEELING_PREFERENCE = 0;</code>
   */
  NO_FEELING_PREFERENCE(0),
  /**
   * <code>GROUNDING = 1;</code>
   */
  GROUNDING(1),
  /**
   * <code>SLEEP = 2;</code>
   */
  SLEEP(2),
  /**
   * <code>CALMING = 3;</code>
   */
  CALMING(3),
  /**
   * <code>STIMULATING = 4;</code>
   */
  STIMULATING(4),
  /**
   * <code>FUNNY = 5;</code>
   */
  FUNNY(5),
  /**
   * <code>FOCUS = 6;</code>
   */
  FOCUS(6),
  /**
   * <code>PASSION = 7;</code>
   */
  PASSION(7),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>NO_FEELING_PREFERENCE = 0;</code>
   */
  public static final int NO_FEELING_PREFERENCE_VALUE = 0;
  /**
   * <code>GROUNDING = 1;</code>
   */
  public static final int GROUNDING_VALUE = 1;
  /**
   * <code>SLEEP = 2;</code>
   */
  public static final int SLEEP_VALUE = 2;
  /**
   * <code>CALMING = 3;</code>
   */
  public static final int CALMING_VALUE = 3;
  /**
   * <code>STIMULATING = 4;</code>
   */
  public static final int STIMULATING_VALUE = 4;
  /**
   * <code>FUNNY = 5;</code>
   */
  public static final int FUNNY_VALUE = 5;
  /**
   * <code>FOCUS = 6;</code>
   */
  public static final int FOCUS_VALUE = 6;
  /**
   * <code>PASSION = 7;</code>
   */
  public static final int PASSION_VALUE = 7;


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
  public static Feeling valueOf(int value) {
    return forNumber(value);
  }

  public static Feeling forNumber(int value) {
    switch (value) {
      case 0: return NO_FEELING_PREFERENCE;
      case 1: return GROUNDING;
      case 2: return SLEEP;
      case 3: return CALMING;
      case 4: return STIMULATING;
      case 5: return FUNNY;
      case 6: return FOCUS;
      case 7: return PASSION;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Feeling>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Feeling> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Feeling>() {
          public Feeling findValueByNumber(int number) {
            return Feeling.forNumber(number);
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
    return io.bloombox.schema.product.struct.testing.LabTesting.getDescriptor().getEnumTypes().get(2);
  }

  private static final Feeling[] VALUES = values();

  public static Feeling valueOf(
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

  private Feeling(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:structs.labtesting.Feeling)
}

