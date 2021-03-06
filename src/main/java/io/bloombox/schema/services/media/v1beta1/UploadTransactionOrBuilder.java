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
// source: media/v1beta1/MediaService_Beta1.proto

package io.bloombox.schema.services.media.v1beta1;

public interface UploadTransactionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bloombox.services.media.v1beta1.UploadTransaction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * URI to upload the data to.
   * </pre>
   *
   * <code>string target = 1;</code>
   */
  java.lang.String getTarget();
  /**
   * <pre>
   * URI to upload the data to.
   * </pre>
   *
   * <code>string target = 1;</code>
   */
  com.google.protobuf.ByteString
      getTargetBytes();

  /**
   * <pre>
   * Key provisioned for the media item we are being asked to accept as an upload.
   * </pre>
   *
   * <code>.opencannabis.media.MediaKey key = 2;</code>
   */
  boolean hasKey();
  /**
   * <pre>
   * Key provisioned for the media item we are being asked to accept as an upload.
   * </pre>
   *
   * <code>.opencannabis.media.MediaKey key = 2;</code>
   */
  io.opencannabis.schema.media.MediaItemKey.MediaKey getKey();
  /**
   * <pre>
   * Key provisioned for the media item we are being asked to accept as an upload.
   * </pre>
   *
   * <code>.opencannabis.media.MediaKey key = 2;</code>
   */
  io.opencannabis.schema.media.MediaItemKey.MediaKeyOrBuilder getKeyOrBuilder();
}
