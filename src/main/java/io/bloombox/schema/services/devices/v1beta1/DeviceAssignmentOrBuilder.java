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
// source: devices/v1beta1/DevicesService_Beta1.proto

package io.bloombox.schema.services.devices.v1beta1;

public interface DeviceAssignmentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bloombox.schema.services.devices.v1beta1.DeviceAssignment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Partner code for the device assignment.
   * </pre>
   *
   * <code>string partner = 1;</code>
   */
  java.lang.String getPartner();
  /**
   * <pre>
   * Partner code for the device assignment.
   * </pre>
   *
   * <code>string partner = 1;</code>
   */
  com.google.protobuf.ByteString
      getPartnerBytes();

  /**
   * <pre>
   * Location code for the device assignment.
   * </pre>
   *
   * <code>string location = 2;</code>
   */
  java.lang.String getLocation();
  /**
   * <pre>
   * Location code for the device assignment.
   * </pre>
   *
   * <code>string location = 2;</code>
   */
  com.google.protobuf.ByteString
      getLocationBytes();

  /**
   * <pre>
   * Role setting for the device.
   * </pre>
   *
   * <code>.bloombox.schema.services.devices.v1beta1.DeviceRole role = 3;</code>
   */
  int getRoleValue();
  /**
   * <pre>
   * Role setting for the device.
   * </pre>
   *
   * <code>.bloombox.schema.services.devices.v1beta1.DeviceRole role = 3;</code>
   */
  io.bloombox.schema.services.devices.v1beta1.DeviceRole getRole();
}
