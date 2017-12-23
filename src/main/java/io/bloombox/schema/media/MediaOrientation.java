// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: media/MediaOrientation.proto

package io.bloombox.schema.media;

/**
 * Protobuf enum {@code media.MediaOrientation}
 */
public enum MediaOrientation
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UP = 0;</code>
   */
  UP(0),
  /**
   * <code>DOWN = 1;</code>
   */
  DOWN(1),
  /**
   * <code>LEFT = 2;</code>
   */
  LEFT(2),
  /**
   * <code>RIGHT = 3;</code>
   */
  RIGHT(3),
  /**
   * <code>UP_MIRRORED = 4;</code>
   */
  UP_MIRRORED(4),
  /**
   * <code>DOWN_MIRRORED = 5;</code>
   */
  DOWN_MIRRORED(5),
  /**
   * <code>LEFT_MIRRORED = 6;</code>
   */
  LEFT_MIRRORED(6),
  /**
   * <code>RIGHT_MIRRORED = 7;</code>
   */
  RIGHT_MIRRORED(7),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UP = 0;</code>
   */
  public static final int UP_VALUE = 0;
  /**
   * <code>DOWN = 1;</code>
   */
  public static final int DOWN_VALUE = 1;
  /**
   * <code>LEFT = 2;</code>
   */
  public static final int LEFT_VALUE = 2;
  /**
   * <code>RIGHT = 3;</code>
   */
  public static final int RIGHT_VALUE = 3;
  /**
   * <code>UP_MIRRORED = 4;</code>
   */
  public static final int UP_MIRRORED_VALUE = 4;
  /**
   * <code>DOWN_MIRRORED = 5;</code>
   */
  public static final int DOWN_MIRRORED_VALUE = 5;
  /**
   * <code>LEFT_MIRRORED = 6;</code>
   */
  public static final int LEFT_MIRRORED_VALUE = 6;
  /**
   * <code>RIGHT_MIRRORED = 7;</code>
   */
  public static final int RIGHT_MIRRORED_VALUE = 7;


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
  public static MediaOrientation valueOf(int value) {
    return forNumber(value);
  }

  public static MediaOrientation forNumber(int value) {
    switch (value) {
      case 0: return UP;
      case 1: return DOWN;
      case 2: return LEFT;
      case 3: return RIGHT;
      case 4: return UP_MIRRORED;
      case 5: return DOWN_MIRRORED;
      case 6: return LEFT_MIRRORED;
      case 7: return RIGHT_MIRRORED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MediaOrientation>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MediaOrientation> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MediaOrientation>() {
          public MediaOrientation findValueByNumber(int number) {
            return MediaOrientation.forNumber(number);
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
    return io.bloombox.schema.media.MediaOrientationOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final MediaOrientation[] VALUES = values();

  public static MediaOrientation valueOf(
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

  private MediaOrientation(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:media.MediaOrientation)
}

