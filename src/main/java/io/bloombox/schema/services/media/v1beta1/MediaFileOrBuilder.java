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

public interface MediaFileOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bloombox.services.media.v1beta1.MediaFile)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the file being uploaded.
   * </pre>
   *
   * <code>string filename = 1;</code>
   */
  java.lang.String getFilename();
  /**
   * <pre>
   * Name of the file being uploaded.
   * </pre>
   *
   * <code>string filename = 1;</code>
   */
  com.google.protobuf.ByteString
      getFilenameBytes();

  /**
   * <pre>
   * Content mime-type of the file being uploaded, if known.
   * </pre>
   *
   * <code>string mimetype = 2;</code>
   */
  java.lang.String getMimetype();
  /**
   * <pre>
   * Content mime-type of the file being uploaded, if known.
   * </pre>
   *
   * <code>string mimetype = 2;</code>
   */
  com.google.protobuf.ByteString
      getMimetypeBytes();
}
