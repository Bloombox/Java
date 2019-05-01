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

public interface SearchOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bloombox.search.SearchOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Partner and location scope to apply during a search operation.
   * </pre>
   *
   * <code>string scope = 1;</code>
   */
  java.lang.String getScope();
  /**
   * <pre>
   * Partner and location scope to apply during a search operation.
   * </pre>
   *
   * <code>string scope = 1;</code>
   */
  com.google.protobuf.ByteString
      getScopeBytes();

  /**
   * <pre>
   * Menu sections to search in. If unspecified, search all sections.
   * </pre>
   *
   * <code>repeated .opencannabis.products.menu.section.Section section = 2;</code>
   */
  java.util.List<io.opencannabis.schema.menu.section.Section> getSectionList();
  /**
   * <pre>
   * Menu sections to search in. If unspecified, search all sections.
   * </pre>
   *
   * <code>repeated .opencannabis.products.menu.section.Section section = 2;</code>
   */
  int getSectionCount();
  /**
   * <pre>
   * Menu sections to search in. If unspecified, search all sections.
   * </pre>
   *
   * <code>repeated .opencannabis.products.menu.section.Section section = 2;</code>
   */
  io.opencannabis.schema.menu.section.Section getSection(int index);
  /**
   * <pre>
   * Menu sections to search in. If unspecified, search all sections.
   * </pre>
   *
   * <code>repeated .opencannabis.products.menu.section.Section section = 2;</code>
   */
  java.util.List<java.lang.Integer>
  getSectionValueList();
  /**
   * <pre>
   * Menu sections to search in. If unspecified, search all sections.
   * </pre>
   *
   * <code>repeated .opencannabis.products.menu.section.Section section = 2;</code>
   */
  int getSectionValue(int index);

  /**
   * <pre>
   * Return products regardless of their visibility status.
   * </pre>
   *
   * <code>bool hidden = 3;</code>
   */
  boolean getHidden();
}
