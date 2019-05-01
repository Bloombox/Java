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
// source: auth/v1beta1/AuthService_Beta1.proto

package io.bloombox.schema.services.auth.v1beta1;

public interface FirebaseTokenAssertionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bloombox.services.auth.v1beta1.FirebaseTokenAssertion)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Firebase identity token.
   * </pre>
   *
   * <code>string token = 1;</code>
   */
  java.lang.String getToken();
  /**
   * <pre>
   * Firebase identity token.
   * </pre>
   *
   * <code>string token = 1;</code>
   */
  com.google.protobuf.ByteString
      getTokenBytes();

  /**
   * <pre>
   * User's ID.
   * </pre>
   *
   * <code>string uid = 2;</code>
   */
  java.lang.String getUid();
  /**
   * <pre>
   * User's ID.
   * </pre>
   *
   * <code>string uid = 2;</code>
   */
  com.google.protobuf.ByteString
      getUidBytes();
}
