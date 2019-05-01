/*
 * Copyright 2019, Momentum Ideas, Co. All rights reserved.
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
// source: telemetry/v1beta4/TelemetryService_Beta4.proto

package io.bloombox.schema.services.telemetry.v1beta4;

public interface TelemetryResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bloombox.services.telemetry.v1beta4.TelemetryResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Status of the operation.
   * </pre>
   *
   * <code>.bloombox.services.telemetry.v1beta4.OperationStatus status = 1;</code>
   */
  int getStatusValue();
  /**
   * <pre>
   * Status of the operation.
   * </pre>
   *
   * <code>.bloombox.services.telemetry.v1beta4.OperationStatus status = 1;</code>
   */
  io.bloombox.schema.services.telemetry.v1beta4.OperationStatus getStatus();

  /**
   * <pre>
   * Count of events submitted.
   * </pre>
   *
   * <code>uint32 count = 2;</code>
   */
  int getCount();

  /**
   * <pre>
   * Service maintenance status, if applicable.
   * </pre>
   *
   * <code>.bloombox.services.ServiceStatus service = 3;</code>
   */
  int getServiceValue();
  /**
   * <pre>
   * Service maintenance status, if applicable.
   * </pre>
   *
   * <code>.bloombox.services.ServiceStatus service = 3;</code>
   */
  io.bloombox.schema.services.ServiceStatus getService();
}
