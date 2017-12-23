// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: devices/v1beta1/DevicesService_Beta1.proto

package io.bloombox.schema.services.devices.v1beta1;

/**
 * <pre>
 * Specifies the role of a device, and therefore how it should behave.
 * </pre>
 *
 * Protobuf enum {@code services.devices.v1beta1.DeviceRole}
 */
public enum DeviceRole
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * The device does not currently have an assigned role.
   * </pre>
   *
   * <code>UNASSIGNED = 0;</code>
   */
  UNASSIGNED(0),
  /**
   * <pre>
   * The device should display a TV menu.
   * </pre>
   *
   * <code>TV = 1;</code>
   */
  TV(1),
  /**
   * <pre>
   * The device should act as a checkin station.
   * </pre>
   *
   * <code>CHECKIN = 2;</code>
   */
  CHECKIN(2),
  /**
   * <pre>
   * The device should act as a passive BLE (Bluetooth Low Energy) beacon.
   * </pre>
   *
   * <code>BEACON = 3;</code>
   */
  BEACON(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * The device does not currently have an assigned role.
   * </pre>
   *
   * <code>UNASSIGNED = 0;</code>
   */
  public static final int UNASSIGNED_VALUE = 0;
  /**
   * <pre>
   * The device should display a TV menu.
   * </pre>
   *
   * <code>TV = 1;</code>
   */
  public static final int TV_VALUE = 1;
  /**
   * <pre>
   * The device should act as a checkin station.
   * </pre>
   *
   * <code>CHECKIN = 2;</code>
   */
  public static final int CHECKIN_VALUE = 2;
  /**
   * <pre>
   * The device should act as a passive BLE (Bluetooth Low Energy) beacon.
   * </pre>
   *
   * <code>BEACON = 3;</code>
   */
  public static final int BEACON_VALUE = 3;


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
  public static DeviceRole valueOf(int value) {
    return forNumber(value);
  }

  public static DeviceRole forNumber(int value) {
    switch (value) {
      case 0: return UNASSIGNED;
      case 1: return TV;
      case 2: return CHECKIN;
      case 3: return BEACON;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DeviceRole>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DeviceRole> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DeviceRole>() {
          public DeviceRole findValueByNumber(int number) {
            return DeviceRole.forNumber(number);
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
    return io.bloombox.schema.services.devices.v1beta1.DevicesServiceBeta1.getDescriptor().getEnumTypes().get(1);
  }

  private static final DeviceRole[] VALUES = values();

  public static DeviceRole valueOf(
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

  private DeviceRole(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:services.devices.v1beta1.DeviceRole)
}

