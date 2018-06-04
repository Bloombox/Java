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
// source: checkin/v1beta1/CheckinService_Beta1.proto

package io.bloombox.schema.services.checkin.v1beta1;

public interface CheckinUserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bloombox.schema.services.checkin.v1beta1.CheckinUser)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Key and identity ID for the user who was checked in.
   * </pre>
   *
   * <code>.bloombox.schema.identity.UserKey key = 1;</code>
   */
  boolean hasKey();
  /**
   * <pre>
   * Key and identity ID for the user who was checked in.
   * </pre>
   *
   * <code>.bloombox.schema.identity.UserKey key = 1;</code>
   */
  io.bloombox.schema.identity.UserOuterClass.UserKey getKey();
  /**
   * <pre>
   * Key and identity ID for the user who was checked in.
   * </pre>
   *
   * <code>.bloombox.schema.identity.UserKey key = 1;</code>
   */
  io.bloombox.schema.identity.UserOuterClass.UserKeyOrBuilder getKeyOrBuilder();

  /**
   * <pre>
   * Active account flags.
   * </pre>
   *
   * <code>.bloombox.schema.identity.UserFlags flags = 2;</code>
   */
  boolean hasFlags();
  /**
   * <pre>
   * Active account flags.
   * </pre>
   *
   * <code>.bloombox.schema.identity.UserFlags flags = 2;</code>
   */
  io.bloombox.schema.identity.UserOuterClass.UserFlags getFlags();
  /**
   * <pre>
   * Active account flags.
   * </pre>
   *
   * <code>.bloombox.schema.identity.UserFlags flags = 2;</code>
   */
  io.bloombox.schema.identity.UserOuterClass.UserFlagsOrBuilder getFlagsOrBuilder();

  /**
   * <pre>
   * Person's name information, for display purposes.
   * </pre>
   *
   * <code>.opencannabis.person.Name name = 3;</code>
   */
  boolean hasName();
  /**
   * <pre>
   * Person's name information, for display purposes.
   * </pre>
   *
   * <code>.opencannabis.person.Name name = 3;</code>
   */
  io.opencannabis.schema.person.Name getName();
  /**
   * <pre>
   * Person's name information, for display purposes.
   * </pre>
   *
   * <code>.opencannabis.person.Name name = 3;</code>
   */
  io.opencannabis.schema.person.NameOrBuilder getNameOrBuilder();
}
