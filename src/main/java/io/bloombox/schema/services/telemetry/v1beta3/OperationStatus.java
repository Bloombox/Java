/*
 * Copyright 2018, Bloombox, LLC. All rights reserved.
 *
 * Source and object computer code contained herein is the private intellectual
 * property of Bloombox, a California Limited Liability Corporation. Use of this
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
// source: telemetry/v1beta3/TelemetryService_Beta3.proto

package io.bloombox.schema.services.telemetry.v1beta3;

/**
 * <pre>
 * Specifies status codes that a response may provide.
 * </pre>
 *
 * Protobuf enum {@code services.telemetry.v1beta3.OperationStatus}
 */
public enum OperationStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Everything went well.
   * </pre>
   *
   * <code>OK = 0;</code>
   */
  OK(0),
  /**
   * <pre>
   * An error of some kind occurred.
   * </pre>
   *
   * <code>ERROR = 1;</code>
   */
  ERROR(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Everything went well.
   * </pre>
   *
   * <code>OK = 0;</code>
   */
  public static final int OK_VALUE = 0;
  /**
   * <pre>
   * An error of some kind occurred.
   * </pre>
   *
   * <code>ERROR = 1;</code>
   */
  public static final int ERROR_VALUE = 1;


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
  public static OperationStatus valueOf(int value) {
    return forNumber(value);
  }

  public static OperationStatus forNumber(int value) {
    switch (value) {
      case 0: return OK;
      case 1: return ERROR;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OperationStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OperationStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OperationStatus>() {
          public OperationStatus findValueByNumber(int number) {
            return OperationStatus.forNumber(number);
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
    return io.bloombox.schema.services.telemetry.v1beta3.TelemetryServiceBeta3.getDescriptor().getEnumTypes().get(0);
  }

  private static final OperationStatus[] VALUES = values();

  public static OperationStatus valueOf(
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

  private OperationStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:services.telemetry.v1beta3.OperationStatus)
}

