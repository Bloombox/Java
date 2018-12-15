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
// source: security/Token.proto

package io.bloombox.schema.security;

public interface AuthTokenOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bloombox.security.AuthToken)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Encoded access token.
   * </pre>
   *
   * <code>string encoded = 1;</code>
   */
  java.lang.String getEncoded();
  /**
   * <pre>
   * Encoded access token.
   * </pre>
   *
   * <code>string encoded = 1;</code>
   */
  com.google.protobuf.ByteString
      getEncodedBytes();

  /**
   * <pre>
   * Parsed and structured authorization ticket.
   * </pre>
   *
   * <code>.bloombox.security.TokenPayload ticket = 2;</code>
   */
  boolean hasTicket();
  /**
   * <pre>
   * Parsed and structured authorization ticket.
   * </pre>
   *
   * <code>.bloombox.security.TokenPayload ticket = 2;</code>
   */
  io.bloombox.schema.security.TokenPayload getTicket();
  /**
   * <pre>
   * Parsed and structured authorization ticket.
   * </pre>
   *
   * <code>.bloombox.security.TokenPayload ticket = 2;</code>
   */
  io.bloombox.schema.security.TokenPayloadOrBuilder getTicketOrBuilder();

  public io.bloombox.schema.security.AuthToken.PayloadCase getPayloadCase();
}
