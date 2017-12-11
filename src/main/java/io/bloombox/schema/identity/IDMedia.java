// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: identity/IDMedia.proto

package io.bloombox.schema.identity;

/**
 * <pre>
 * Known types of document media that can be attached to an ID.
 * </pre>
 *
 * Protobuf enum {@code identity.IDMedia}
 */
public enum IDMedia
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Picture of the front of the document.
   * </pre>
   *
   * <code>DOCUMENT_FRONT = 0;</code>
   */
  DOCUMENT_FRONT(0),
  /**
   * <pre>
   * Picture of the back of the document.
   * </pre>
   *
   * <code>DOCUMENT_REAR = 1;</code>
   */
  DOCUMENT_REAR(1),
  /**
   * <pre>
   * Cropped/extracted person portrait from the document.
   * </pre>
   *
   * <code>PORTRAIT = 2;</code>
   */
  PORTRAIT(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Picture of the front of the document.
   * </pre>
   *
   * <code>DOCUMENT_FRONT = 0;</code>
   */
  public static final int DOCUMENT_FRONT_VALUE = 0;
  /**
   * <pre>
   * Picture of the back of the document.
   * </pre>
   *
   * <code>DOCUMENT_REAR = 1;</code>
   */
  public static final int DOCUMENT_REAR_VALUE = 1;
  /**
   * <pre>
   * Cropped/extracted person portrait from the document.
   * </pre>
   *
   * <code>PORTRAIT = 2;</code>
   */
  public static final int PORTRAIT_VALUE = 2;


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
  public static IDMedia valueOf(int value) {
    return forNumber(value);
  }

  public static IDMedia forNumber(int value) {
    switch (value) {
      case 0: return DOCUMENT_FRONT;
      case 1: return DOCUMENT_REAR;
      case 2: return PORTRAIT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<IDMedia>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      IDMedia> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<IDMedia>() {
          public IDMedia findValueByNumber(int number) {
            return IDMedia.forNumber(number);
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
    return io.bloombox.schema.identity.IDMediaOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final IDMedia[] VALUES = values();

  public static IDMedia valueOf(
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

  private IDMedia(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:identity.IDMedia)
}

