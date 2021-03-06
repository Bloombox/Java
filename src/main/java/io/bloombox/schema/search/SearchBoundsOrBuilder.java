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
// source: search/SearchSpec.proto

package io.bloombox.schema.search;

public interface SearchBoundsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bloombox.search.SearchBounds)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Specifies a limit on the number of search results desired.
   * </pre>
   *
   * <code>int32 limit = 1;</code>
   */
  int getLimit();

  /**
   * <pre>
   * Specifies an offset of records to skip during result pagination.
   * </pre>
   *
   * <code>int32 offset = 2;</code>
   */
  int getOffset();
}
