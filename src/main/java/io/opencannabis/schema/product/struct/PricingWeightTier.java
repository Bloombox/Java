/*
 * Copyright 2018, Bloombox, LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: structs/pricing/PricingDescriptor.proto

package io.opencannabis.schema.product.struct;

/**
 * <pre>
 * Enumerates supported pricing tiers, when the 'WEIGHTED' pricing scheme is in effect. Each known tier is enumerated,
 * with an additional defaulted option for 'OTHER,' which would allow a custom weight to be assigned via some other
 * property or metric.
 * </pre>
 *
 * Protobuf enum {@code opencannabis.structs.pricing.PricingWeightTier}
 */
public enum PricingWeightTier
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 'Other,' or custom weighted pricing.
   * </pre>
   *
   * <code>OTHER = 0;</code>
   */
  OTHER(0),
  /**
   * <pre>
   * Pricing for 'ONE GRAM' of the subject material or merchandise.
   * </pre>
   *
   * <code>GRAM = 1;</code>
   */
  GRAM(1),
  /**
   * <pre>
   * Pricing for one 'HALF GRAM' of the subject material or merchandise. Usually used only for extracts.
   * </pre>
   *
   * <code>HALFGRAM = 2;</code>
   */
  HALFGRAM(2),
  /**
   * <pre>
   * Pricing for one 'QUARTER GRAM' of the subject material or merchandise. Usually used only for extracts.
   * </pre>
   *
   * <code>QUARTERGRAM = 3;</code>
   */
  QUARTERGRAM(3),
  /**
   * <pre>
   * Pricing for TWO GRAMS of the subject material or merchandise. Rarely used.
   * </pre>
   *
   * <code>DUB = 4;</code>
   */
  DUB(4),
  /**
   * <pre>
   * Pricing for an 'EIGHTH' of the subject material or merchandise, usually defined as 3-and-one-half grams. In some
   * cases, providers may choose to define their 'EIGHTH' weight value at 4 grams. This functionality is supported via
   * partner or location-level settings. 'EIGHTH' usually refers to an eighth-of-an-ounce.
   * </pre>
   *
   * <code>EIGHTH = 5;</code>
   */
  EIGHTH(5),
  /**
   * <pre>
   * Pricing for a 'QUARTER' of the subject material or merchandise, usually defined as 7 grams.
   * </pre>
   *
   * <code>QUARTER = 6;</code>
   */
  QUARTER(6),
  /**
   * <pre>
   * Pricing for a 'HALF OUNCE' of the subject material or merchandise. Usually defined as 14 grams.
   * </pre>
   *
   * <code>HALF = 7;</code>
   */
  HALF(7),
  /**
   * <pre>
   * Pricing for 'ONCE OUNCE' of subject material or merchandise. Usually defined as 28 grams.
   * </pre>
   *
   * <code>OUNCE = 8;</code>
   */
  OUNCE(8),
  /**
   * <pre>
   * Pricing for 'ONE POUND' of subject material or merchandise.
   * </pre>
   *
   * <code>POUND = 9;</code>
   */
  POUND(9),
  /**
   * <pre>
   * Pricing for 'ONE KILO' of subject material or merchandise.
   * </pre>
   *
   * <code>KILO = 10;</code>
   */
  KILO(10),
  /**
   * <pre>
   * Pricing for 'ONE TON' of subject material or merchandise.
   * </pre>
   *
   * <code>TON = 11;</code>
   */
  TON(11),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 'Other,' or custom weighted pricing.
   * </pre>
   *
   * <code>OTHER = 0;</code>
   */
  public static final int OTHER_VALUE = 0;
  /**
   * <pre>
   * Pricing for 'ONE GRAM' of the subject material or merchandise.
   * </pre>
   *
   * <code>GRAM = 1;</code>
   */
  public static final int GRAM_VALUE = 1;
  /**
   * <pre>
   * Pricing for one 'HALF GRAM' of the subject material or merchandise. Usually used only for extracts.
   * </pre>
   *
   * <code>HALFGRAM = 2;</code>
   */
  public static final int HALFGRAM_VALUE = 2;
  /**
   * <pre>
   * Pricing for one 'QUARTER GRAM' of the subject material or merchandise. Usually used only for extracts.
   * </pre>
   *
   * <code>QUARTERGRAM = 3;</code>
   */
  public static final int QUARTERGRAM_VALUE = 3;
  /**
   * <pre>
   * Pricing for TWO GRAMS of the subject material or merchandise. Rarely used.
   * </pre>
   *
   * <code>DUB = 4;</code>
   */
  public static final int DUB_VALUE = 4;
  /**
   * <pre>
   * Pricing for an 'EIGHTH' of the subject material or merchandise, usually defined as 3-and-one-half grams. In some
   * cases, providers may choose to define their 'EIGHTH' weight value at 4 grams. This functionality is supported via
   * partner or location-level settings. 'EIGHTH' usually refers to an eighth-of-an-ounce.
   * </pre>
   *
   * <code>EIGHTH = 5;</code>
   */
  public static final int EIGHTH_VALUE = 5;
  /**
   * <pre>
   * Pricing for a 'QUARTER' of the subject material or merchandise, usually defined as 7 grams.
   * </pre>
   *
   * <code>QUARTER = 6;</code>
   */
  public static final int QUARTER_VALUE = 6;
  /**
   * <pre>
   * Pricing for a 'HALF OUNCE' of the subject material or merchandise. Usually defined as 14 grams.
   * </pre>
   *
   * <code>HALF = 7;</code>
   */
  public static final int HALF_VALUE = 7;
  /**
   * <pre>
   * Pricing for 'ONCE OUNCE' of subject material or merchandise. Usually defined as 28 grams.
   * </pre>
   *
   * <code>OUNCE = 8;</code>
   */
  public static final int OUNCE_VALUE = 8;
  /**
   * <pre>
   * Pricing for 'ONE POUND' of subject material or merchandise.
   * </pre>
   *
   * <code>POUND = 9;</code>
   */
  public static final int POUND_VALUE = 9;
  /**
   * <pre>
   * Pricing for 'ONE KILO' of subject material or merchandise.
   * </pre>
   *
   * <code>KILO = 10;</code>
   */
  public static final int KILO_VALUE = 10;
  /**
   * <pre>
   * Pricing for 'ONE TON' of subject material or merchandise.
   * </pre>
   *
   * <code>TON = 11;</code>
   */
  public static final int TON_VALUE = 11;


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
  public static PricingWeightTier valueOf(int value) {
    return forNumber(value);
  }

  public static PricingWeightTier forNumber(int value) {
    switch (value) {
      case 0: return OTHER;
      case 1: return GRAM;
      case 2: return HALFGRAM;
      case 3: return QUARTERGRAM;
      case 4: return DUB;
      case 5: return EIGHTH;
      case 6: return QUARTER;
      case 7: return HALF;
      case 8: return OUNCE;
      case 9: return POUND;
      case 10: return KILO;
      case 11: return TON;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PricingWeightTier>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PricingWeightTier> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PricingWeightTier>() {
          public PricingWeightTier findValueByNumber(int number) {
            return PricingWeightTier.forNumber(number);
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
    return io.opencannabis.schema.product.struct.ProductPricingSpec.getDescriptor().getEnumTypes().get(1);
  }

  private static final PricingWeightTier[] VALUES = values();

  public static PricingWeightTier valueOf(
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

  private PricingWeightTier(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:opencannabis.structs.pricing.PricingWeightTier)
}

