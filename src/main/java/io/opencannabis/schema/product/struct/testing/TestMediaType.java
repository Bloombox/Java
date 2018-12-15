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
// source: structs/labtesting/TestValue.proto

package io.opencannabis.schema.product.struct.testing;

/**
 * Protobuf enum {@code opencannabis.structs.labtesting.TestMediaType}
 */
public enum TestMediaType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CERTIFICATE = 0;</code>
   */
  CERTIFICATE(0),
  /**
   * <code>RESULTS = 1;</code>
   */
  RESULTS(1),
  /**
   * <code>PRODUCT_IMAGE = 2;</code>
   */
  PRODUCT_IMAGE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CERTIFICATE = 0;</code>
   */
  public static final int CERTIFICATE_VALUE = 0;
  /**
   * <code>RESULTS = 1;</code>
   */
  public static final int RESULTS_VALUE = 1;
  /**
   * <code>PRODUCT_IMAGE = 2;</code>
   */
  public static final int PRODUCT_IMAGE_VALUE = 2;


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
  public static TestMediaType valueOf(int value) {
    return forNumber(value);
  }

  public static TestMediaType forNumber(int value) {
    switch (value) {
      case 0: return CERTIFICATE;
      case 1: return RESULTS;
      case 2: return PRODUCT_IMAGE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TestMediaType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TestMediaType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TestMediaType>() {
          public TestMediaType findValueByNumber(int number) {
            return TestMediaType.forNumber(number);
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
    return io.opencannabis.schema.product.struct.testing.BaseTestingSpec.getDescriptor().getEnumTypes().get(2);
  }

  private static final TestMediaType[] VALUES = values();

  public static TestMediaType valueOf(
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

  private TestMediaType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:opencannabis.structs.labtesting.TestMediaType)
}

