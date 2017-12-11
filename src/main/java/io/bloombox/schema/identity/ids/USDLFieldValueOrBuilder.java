/*
 * Copyright 2017, Bloombox, LLC. All rights reserved.
 *
 * Source and object computer code contained herein is the private intellectual property
 * of Bloombox, a California Limited Liability Corporation. Use of this code in source form
 * requires permission in writing before use or the publishing of derivative works, for
 * commercial purposes or any other purpose, from a duly authorized officer of Momentum
 * Ideas Co.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: identity/ids/USDL.proto

package io.bloombox.schema.identity.ids;

public interface USDLFieldValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:identity.ids.USDLFieldValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Field that we are storing data for.
   * </pre>
   *
   * <code>.identity.ids.USDLField field = 1 [(.gen_bq_schema.description) = "Field that we are storing data for."];</code>
   */
  int getFieldValue();
  /**
   * <pre>
   * Field that we are storing data for.
   * </pre>
   *
   * <code>.identity.ids.USDLField field = 1 [(.gen_bq_schema.description) = "Field that we are storing data for."];</code>
   */
  io.bloombox.schema.identity.ids.USDLField getField();

  /**
   * <pre>
   * String data for this field.
   * </pre>
   *
   * <code>string value = 2 [(.gen_bq_schema.description) = "String data for this field."];</code>
   */
  java.lang.String getValue();
  /**
   * <pre>
   * String data for this field.
   * </pre>
   *
   * <code>string value = 2 [(.gen_bq_schema.description) = "String data for this field."];</code>
   */
  com.google.protobuf.ByteString
      getValueBytes();

  /**
   * <pre>
   * Byte data for this field.
   * </pre>
   *
   * <code>bytes raw_value = 3 [(.gen_bq_schema.ignore) = true];</code>
   */
  com.google.protobuf.ByteString getRawValue();

  public io.bloombox.schema.identity.ids.USDLFieldValue.DataCase getDataCase();
}
