// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: structs/labtesting/TestResults.proto

package io.opencannabis.schema.product.struct.testing;

/**
 * Protobuf enum {@code opencannabis.structs.labtesting.PotencyEstimate}
 */
public enum PotencyEstimate
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>LIGHT = 0;</code>
   */
  LIGHT(0),
  /**
   * <code>MEDIUM = 1;</code>
   */
  MEDIUM(1),
  /**
   * <code>HEAVY = 2;</code>
   */
  HEAVY(2),
  /**
   * <code>SUPER = 3;</code>
   */
  SUPER(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>LIGHT = 0;</code>
   */
  public static final int LIGHT_VALUE = 0;
  /**
   * <code>MEDIUM = 1;</code>
   */
  public static final int MEDIUM_VALUE = 1;
  /**
   * <code>HEAVY = 2;</code>
   */
  public static final int HEAVY_VALUE = 2;
  /**
   * <code>SUPER = 3;</code>
   */
  public static final int SUPER_VALUE = 3;


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
  public static PotencyEstimate valueOf(int value) {
    return forNumber(value);
  }

  public static PotencyEstimate forNumber(int value) {
    switch (value) {
      case 0: return LIGHT;
      case 1: return MEDIUM;
      case 2: return HEAVY;
      case 3: return SUPER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PotencyEstimate>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PotencyEstimate> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PotencyEstimate>() {
          public PotencyEstimate findValueByNumber(int number) {
            return PotencyEstimate.forNumber(number);
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
    return io.opencannabis.schema.product.struct.testing.LabTesting.getDescriptor().getEnumTypes().get(4);
  }

  private static final PotencyEstimate[] VALUES = values();

  public static PotencyEstimate valueOf(
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

  private PotencyEstimate(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:opencannabis.structs.labtesting.PotencyEstimate)
}

