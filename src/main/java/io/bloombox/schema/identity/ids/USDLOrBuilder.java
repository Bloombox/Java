/*
 * Copyright 2017, Bloombox, LLC. All rights reserved.
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
// source: identity/ids/USDL.proto

package io.bloombox.schema.identity.ids;

public interface USDLOrBuilder extends
    // @@protoc_insertion_point(interface_extends:identity.ids.USDL)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Raw barcode data for this Driver's License.
   * </pre>
   *
   * <code>bytes barcode = 1 [(.gen_bq_schema.ignore) = true];</code>
   */
  com.google.protobuf.ByteString getBarcode();

  /**
   * <pre>
   * State that issued this Driver's License.
   * </pre>
   *
   * <code>.geo.usa.USState jurisdiction = 5 [(.gen_bq_schema.description) = "State that issued this Driver&#92;'s License."];</code>
   */
  int getJurisdictionValue();
  /**
   * <pre>
   * State that issued this Driver's License.
   * </pre>
   *
   * <code>.geo.usa.USState jurisdiction = 5 [(.gen_bq_schema.description) = "State that issued this Driver&#92;'s License."];</code>
   */
  io.bloombox.schema.geo.usa.USState getJurisdiction();

  /**
   * <pre>
   * Raw field data for this license.
   * </pre>
   *
   * <code>repeated .identity.ids.USDLFieldValue fields = 100 [(.gen_bq_schema.description) = "Raw field data for this license."];</code>
   */
  java.util.List<io.bloombox.schema.identity.ids.USDLFieldValue> 
      getFieldsList();
  /**
   * <pre>
   * Raw field data for this license.
   * </pre>
   *
   * <code>repeated .identity.ids.USDLFieldValue fields = 100 [(.gen_bq_schema.description) = "Raw field data for this license."];</code>
   */
  io.bloombox.schema.identity.ids.USDLFieldValue getFields(int index);
  /**
   * <pre>
   * Raw field data for this license.
   * </pre>
   *
   * <code>repeated .identity.ids.USDLFieldValue fields = 100 [(.gen_bq_schema.description) = "Raw field data for this license."];</code>
   */
  int getFieldsCount();
  /**
   * <pre>
   * Raw field data for this license.
   * </pre>
   *
   * <code>repeated .identity.ids.USDLFieldValue fields = 100 [(.gen_bq_schema.description) = "Raw field data for this license."];</code>
   */
  java.util.List<? extends io.bloombox.schema.identity.ids.USDLFieldValueOrBuilder> 
      getFieldsOrBuilderList();
  /**
   * <pre>
   * Raw field data for this license.
   * </pre>
   *
   * <code>repeated .identity.ids.USDLFieldValue fields = 100 [(.gen_bq_schema.description) = "Raw field data for this license."];</code>
   */
  io.bloombox.schema.identity.ids.USDLFieldValueOrBuilder getFieldsOrBuilder(
      int index);
}
