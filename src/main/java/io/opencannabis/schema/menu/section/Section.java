/*
 * Copyright 2018, Momentum Ideas, Co. All rights reserved.
 *
 * Source and object computer code contained herein is the private intellectual
 * property of Momentum Ideas Co., a Delaware Corporation. Use of this
 * code in source form requires permission in writing before use or the
 * assembly, distribution, or publishing of derivative works, for commercial
 * purposes or any other purpose, from a duly authorized officer of Momentum
 * Ideas Co.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: products/menu/Section.proto

package io.opencannabis.schema.menu.section;

/**
 * <pre>
 * Known sections, that are expected to be included with nearly every menu.
 * </pre>
 *
 * Protobuf enum {@code opencannabis.products.menu.section.Section}
 */
public enum Section
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Unspecified or unknown section.
   * </pre>
   *
   * <code>UNSPECIFIED = 0;</code>
   */
  UNSPECIFIED(0),
  /**
   * <pre>
   * Traditional "buds" or "flowers" section.
   * </pre>
   *
   * <code>FLOWERS = 1;</code>
   */
  FLOWERS(1),
  /**
   * <pre>
   * Concentrated cannabis products such as oils, waxes and hashes.
   * </pre>
   *
   * <code>EXTRACTS = 2;</code>
   */
  EXTRACTS(2),
  /**
   * <pre>
   * Edible cannabis products, such as brownies, candy bars, etc.
   * </pre>
   *
   * <code>EDIBLES = 3;</code>
   */
  EDIBLES(3),
  /**
   * <pre>
   * Cartridge and pen battery products.
   * </pre>
   *
   * <code>CARTRIDGES = 4;</code>
   */
  CARTRIDGES(4),
  /**
   * <pre>
   * Tinctures, teas, and other miscellaneous products.
   * </pre>
   *
   * <code>APOTHECARY = 5;</code>
   */
  APOTHECARY(5),
  /**
   * <pre>
   * Pre-rolled flower-based joints, potentially fortified.
   * </pre>
   *
   * <code>PREROLLS = 6;</code>
   */
  PREROLLS(6),
  /**
   * <pre>
   * Plant clones, seeds, and other cultivation products.
   * </pre>
   *
   * <code>PLANTS = 7;</code>
   */
  PLANTS(7),
  /**
   * <pre>
   * General merchandise.
   * </pre>
   *
   * <code>MERCHANDISE = 8;</code>
   */
  MERCHANDISE(8),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Unspecified or unknown section.
   * </pre>
   *
   * <code>UNSPECIFIED = 0;</code>
   */
  public static final int UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Traditional "buds" or "flowers" section.
   * </pre>
   *
   * <code>FLOWERS = 1;</code>
   */
  public static final int FLOWERS_VALUE = 1;
  /**
   * <pre>
   * Concentrated cannabis products such as oils, waxes and hashes.
   * </pre>
   *
   * <code>EXTRACTS = 2;</code>
   */
  public static final int EXTRACTS_VALUE = 2;
  /**
   * <pre>
   * Edible cannabis products, such as brownies, candy bars, etc.
   * </pre>
   *
   * <code>EDIBLES = 3;</code>
   */
  public static final int EDIBLES_VALUE = 3;
  /**
   * <pre>
   * Cartridge and pen battery products.
   * </pre>
   *
   * <code>CARTRIDGES = 4;</code>
   */
  public static final int CARTRIDGES_VALUE = 4;
  /**
   * <pre>
   * Tinctures, teas, and other miscellaneous products.
   * </pre>
   *
   * <code>APOTHECARY = 5;</code>
   */
  public static final int APOTHECARY_VALUE = 5;
  /**
   * <pre>
   * Pre-rolled flower-based joints, potentially fortified.
   * </pre>
   *
   * <code>PREROLLS = 6;</code>
   */
  public static final int PREROLLS_VALUE = 6;
  /**
   * <pre>
   * Plant clones, seeds, and other cultivation products.
   * </pre>
   *
   * <code>PLANTS = 7;</code>
   */
  public static final int PLANTS_VALUE = 7;
  /**
   * <pre>
   * General merchandise.
   * </pre>
   *
   * <code>MERCHANDISE = 8;</code>
   */
  public static final int MERCHANDISE_VALUE = 8;


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
  public static Section valueOf(int value) {
    return forNumber(value);
  }

  public static Section forNumber(int value) {
    switch (value) {
      case 0: return UNSPECIFIED;
      case 1: return FLOWERS;
      case 2: return EXTRACTS;
      case 3: return EDIBLES;
      case 4: return CARTRIDGES;
      case 5: return APOTHECARY;
      case 6: return PREROLLS;
      case 7: return PLANTS;
      case 8: return MERCHANDISE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Section>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Section> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Section>() {
          public Section findValueByNumber(int number) {
            return Section.forNumber(number);
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
    return io.opencannabis.schema.menu.section.SectionOuterClass.getDescriptor().getEnumTypes().get(1);
  }

  private static final Section[] VALUES = values();

  public static Section valueOf(
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

  private Section(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:opencannabis.products.menu.section.Section)
}

