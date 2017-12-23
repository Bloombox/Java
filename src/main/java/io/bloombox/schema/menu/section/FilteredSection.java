// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: products/menu/Section.proto

package io.bloombox.schema.menu.section;

/**
 * <pre>
 * Special filtered sections - commonly used sections based on filters builtin to apps/sites.
 * </pre>
 *
 * Protobuf enum {@code products.menu.section.FilteredSection}
 */
public enum FilteredSection
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Only presents products that are on sale.
   * </pre>
   *
   * <code>ON_SALE = 0;</code>
   */
  ON_SALE(0),
  /**
   * <pre>
   * Only presents products that are cultivated, manufactured, or otherwise produced in-house.
   * </pre>
   *
   * <code>HOUSE = 1;</code>
   */
  HOUSE(1),
  /**
   * <pre>
   * Only presents products containing CBD.
   * </pre>
   *
   * <code>CBD = 2;</code>
   */
  CBD(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Only presents products that are on sale.
   * </pre>
   *
   * <code>ON_SALE = 0;</code>
   */
  public static final int ON_SALE_VALUE = 0;
  /**
   * <pre>
   * Only presents products that are cultivated, manufactured, or otherwise produced in-house.
   * </pre>
   *
   * <code>HOUSE = 1;</code>
   */
  public static final int HOUSE_VALUE = 1;
  /**
   * <pre>
   * Only presents products containing CBD.
   * </pre>
   *
   * <code>CBD = 2;</code>
   */
  public static final int CBD_VALUE = 2;


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
  public static FilteredSection valueOf(int value) {
    return forNumber(value);
  }

  public static FilteredSection forNumber(int value) {
    switch (value) {
      case 0: return ON_SALE;
      case 1: return HOUSE;
      case 2: return CBD;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<FilteredSection>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      FilteredSection> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<FilteredSection>() {
          public FilteredSection findValueByNumber(int number) {
            return FilteredSection.forNumber(number);
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
    return io.bloombox.schema.menu.section.SectionOuterClass.getDescriptor().getEnumTypes().get(2);
  }

  private static final FilteredSection[] VALUES = values();

  public static FilteredSection valueOf(
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

  private FilteredSection(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:products.menu.section.FilteredSection)
}

