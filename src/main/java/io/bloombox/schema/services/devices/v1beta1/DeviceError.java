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
// source: devices/v1beta1/DevicesService_Beta1.proto

package io.bloombox.schema.services.devices.v1beta1;

/**
 * <pre>
 * Enumerates errors that may be yielded when working when the device service.
 * </pre>
 *
 * Protobuf enum {@code bloombox.services.devices.v1beta1.DeviceError}
 */
public enum DeviceError
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * No error occurred.
   * </pre>
   *
   * <code>NO_ERROR = 0;</code>
   */
  NO_ERROR(0),
  /**
   * <pre>
   * The specified serial number was invalid.
   * </pre>
   *
   * <code>INVALID_SERIAL = 1;</code>
   */
  INVALID_SERIAL(1),
  /**
   * <pre>
   * The specified device could not be found.
   * </pre>
   *
   * <code>DEVICE_NOT_FOUND = 2;</code>
   */
  DEVICE_NOT_FOUND(2),
  /**
   * <pre>
   * An internal error occurred.
   * </pre>
   *
   * <code>INTERNAL_ERROR = 3;</code>
   */
  INTERNAL_ERROR(3),
  /**
   * <pre>
   * The specified device is not currently assigned.
   * </pre>
   *
   * <code>DEVICE_UNASSIGNED = 4;</code>
   */
  DEVICE_UNASSIGNED(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * No error occurred.
   * </pre>
   *
   * <code>NO_ERROR = 0;</code>
   */
  public static final int NO_ERROR_VALUE = 0;
  /**
   * <pre>
   * The specified serial number was invalid.
   * </pre>
   *
   * <code>INVALID_SERIAL = 1;</code>
   */
  public static final int INVALID_SERIAL_VALUE = 1;
  /**
   * <pre>
   * The specified device could not be found.
   * </pre>
   *
   * <code>DEVICE_NOT_FOUND = 2;</code>
   */
  public static final int DEVICE_NOT_FOUND_VALUE = 2;
  /**
   * <pre>
   * An internal error occurred.
   * </pre>
   *
   * <code>INTERNAL_ERROR = 3;</code>
   */
  public static final int INTERNAL_ERROR_VALUE = 3;
  /**
   * <pre>
   * The specified device is not currently assigned.
   * </pre>
   *
   * <code>DEVICE_UNASSIGNED = 4;</code>
   */
  public static final int DEVICE_UNASSIGNED_VALUE = 4;


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
  public static DeviceError valueOf(int value) {
    return forNumber(value);
  }

  public static DeviceError forNumber(int value) {
    switch (value) {
      case 0: return NO_ERROR;
      case 1: return INVALID_SERIAL;
      case 2: return DEVICE_NOT_FOUND;
      case 3: return INTERNAL_ERROR;
      case 4: return DEVICE_UNASSIGNED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DeviceError>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DeviceError> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DeviceError>() {
          public DeviceError findValueByNumber(int number) {
            return DeviceError.forNumber(number);
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
    return io.bloombox.schema.services.devices.v1beta1.DevicesServiceBeta1.getDescriptor().getEnumTypes().get(0);
  }

  private static final DeviceError[] VALUES = values();

  public static DeviceError valueOf(
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

  private DeviceError(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bloombox.services.devices.v1beta1.DeviceError)
}

