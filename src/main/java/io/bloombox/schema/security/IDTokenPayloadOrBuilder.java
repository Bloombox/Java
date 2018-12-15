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

public interface IDTokenPayloadOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bloombox.security.IDTokenPayload)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Access token.
   * </pre>
   *
   * <code>string token = 1;</code>
   */
  java.lang.String getToken();
  /**
   * <pre>
   * Access token.
   * </pre>
   *
   * <code>string token = 1;</code>
   */
  com.google.protobuf.ByteString
      getTokenBytes();

  /**
   * <pre>
   * Expiration timestamp for the token.
   * </pre>
   *
   * <code>uint64 expiration = 2;</code>
   */
  long getExpiration();

  /**
   * <pre>
   * Issuance timestamp for the token.
   * </pre>
   *
   * <code>uint64 issuance = 3;</code>
   */
  long getIssuance();

  /**
   * <pre>
   * Subject of the authentication operation.
   * </pre>
   *
   * <code>string subject = 4;</code>
   */
  java.lang.String getSubject();
  /**
   * <pre>
   * Subject of the authentication operation.
   * </pre>
   *
   * <code>string subject = 4;</code>
   */
  com.google.protobuf.ByteString
      getSubjectBytes();

  /**
   * <pre>
   * Allowable audience of the authentication operation.
   * </pre>
   *
   * <code>string audience = 5;</code>
   */
  java.lang.String getAudience();
  /**
   * <pre>
   * Allowable audience of the authentication operation.
   * </pre>
   *
   * <code>string audience = 5;</code>
   */
  com.google.protobuf.ByteString
      getAudienceBytes();
}
