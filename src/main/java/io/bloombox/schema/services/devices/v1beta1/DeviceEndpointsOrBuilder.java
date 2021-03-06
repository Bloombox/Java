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
// source: devices/v1beta1/DevicesService_Beta1.proto

package io.bloombox.schema.services.devices.v1beta1;

public interface DeviceEndpointsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bloombox.services.devices.v1beta1.DeviceEndpoints)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * OAuth2 endpoint to use for authorization. Default value is "authorize.bloombox.cloud".
   * </pre>
   *
   * <code>.bloombox.services.devices.v1beta1.OAuth2Endpoints oauth2 = 1;</code>
   */
  boolean hasOauth2();
  /**
   * <pre>
   * OAuth2 endpoint to use for authorization. Default value is "authorize.bloombox.cloud".
   * </pre>
   *
   * <code>.bloombox.services.devices.v1beta1.OAuth2Endpoints oauth2 = 1;</code>
   */
  io.bloombox.schema.services.devices.v1beta1.OAuth2Endpoints getOauth2();
  /**
   * <pre>
   * OAuth2 endpoint to use for authorization. Default value is "authorize.bloombox.cloud".
   * </pre>
   *
   * <code>.bloombox.services.devices.v1beta1.OAuth2Endpoints oauth2 = 1;</code>
   */
  io.bloombox.schema.services.devices.v1beta1.OAuth2EndpointsOrBuilder getOauth2OrBuilder();

  /**
   * <pre>
   * Link to login and account management.
   * </pre>
   *
   * <code>string account = 2;</code>
   */
  java.lang.String getAccount();
  /**
   * <pre>
   * Link to login and account management.
   * </pre>
   *
   * <code>string account = 2;</code>
   */
  com.google.protobuf.ByteString
      getAccountBytes();

  /**
   * <pre>
   * Main API endpoint/host to make use of. Default value is "api.bloombox.cloud".
   * </pre>
   *
   * <code>string api = 3;</code>
   */
  java.lang.String getApi();
  /**
   * <pre>
   * Main API endpoint/host to make use of. Default value is "api.bloombox.cloud".
   * </pre>
   *
   * <code>string api = 3;</code>
   */
  com.google.protobuf.ByteString
      getApiBytes();

  /**
   * <pre>
   * RPC endpoint, for raw gRPC service use.
   * </pre>
   *
   * <code>string rpc = 4;</code>
   */
  java.lang.String getRpc();
  /**
   * <pre>
   * RPC endpoint, for raw gRPC service use.
   * </pre>
   *
   * <code>string rpc = 4;</code>
   */
  com.google.protobuf.ByteString
      getRpcBytes();

  /**
   * <pre>
   * Issuer auth project name to use. Default value is "bloom-auth".
   * </pre>
   *
   * <code>string issuer = 5;</code>
   */
  java.lang.String getIssuer();
  /**
   * <pre>
   * Issuer auth project name to use. Default value is "bloom-auth".
   * </pre>
   *
   * <code>string issuer = 5;</code>
   */
  com.google.protobuf.ByteString
      getIssuerBytes();

  /**
   * <pre>
   * Main database project name to use. Default value is "bloom-db".
   * </pre>
   *
   * <code>string db = 6;</code>
   */
  java.lang.String getDb();
  /**
   * <pre>
   * Main database project name to use. Default value is "bloom-db".
   * </pre>
   *
   * <code>string db = 6;</code>
   */
  com.google.protobuf.ByteString
      getDbBytes();

  /**
   * <pre>
   * Database project name to use. Default value is "bloombox-io".
   * </pre>
   *
   * <code>string realtime = 7;</code>
   */
  java.lang.String getRealtime();
  /**
   * <pre>
   * Database project name to use. Default value is "bloombox-io".
   * </pre>
   *
   * <code>string realtime = 7;</code>
   */
  com.google.protobuf.ByteString
      getRealtimeBytes();
}
