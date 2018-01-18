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
// source: identity/ids/UserDoctorRec.proto

package io.bloombox.schema.identity.ids;

public interface UserDoctorRecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:identity.ids.UserDoctorRec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID number/unique code.
   * </pre>
   *
   * <code>string id = 1 [(.gen_bq_schema.description) = "ID number/unique code."];</code>
   */
  java.lang.String getId();
  /**
   * <pre>
   * ID number/unique code.
   * </pre>
   *
   * <code>string id = 1 [(.gen_bq_schema.description) = "ID number/unique code."];</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Expiration date for the recommendation.
   * </pre>
   *
   * <code>.temporal.Date expiration_date = 2 [(.gen_bq_schema.description) = "Expiration date for the recommendation."];</code>
   */
  boolean hasExpirationDate();
  /**
   * <pre>
   * Expiration date for the recommendation.
   * </pre>
   *
   * <code>.temporal.Date expiration_date = 2 [(.gen_bq_schema.description) = "Expiration date for the recommendation."];</code>
   */
  io.bloombox.schema.temporal.Date getExpirationDate();
  /**
   * <pre>
   * Expiration date for the recommendation.
   * </pre>
   *
   * <code>.temporal.Date expiration_date = 2 [(.gen_bq_schema.description) = "Expiration date for the recommendation."];</code>
   */
  io.bloombox.schema.temporal.DateOrBuilder getExpirationDateOrBuilder();

  /**
   * <pre>
   * Raw barcode value.
   * </pre>
   *
   * <code>string barcode = 3 [(.gen_bq_schema.description) = "Raw barcode value."];</code>
   */
  java.lang.String getBarcode();
  /**
   * <pre>
   * Raw barcode value.
   * </pre>
   *
   * <code>string barcode = 3 [(.gen_bq_schema.description) = "Raw barcode value."];</code>
   */
  com.google.protobuf.ByteString
      getBarcodeBytes();

  /**
   * <pre>
   * US state where the recommendation is valid.
   * </pre>
   *
   * <code>.geo.usa.USState state = 4 [(.gen_bq_schema.description) = "US state where the recommendation is valid."];</code>
   */
  int getStateValue();
  /**
   * <pre>
   * US state where the recommendation is valid.
   * </pre>
   *
   * <code>.geo.usa.USState state = 4 [(.gen_bq_schema.description) = "US state where the recommendation is valid."];</code>
   */
  io.bloombox.schema.geo.usa.USState getState();

  /**
   * <pre>
   * Country for the recommendation.
   * </pre>
   *
   * <code>string country = 5 [(.gen_bq_schema.description) = "Country for the recommendation."];</code>
   */
  java.lang.String getCountry();
  /**
   * <pre>
   * Country for the recommendation.
   * </pre>
   *
   * <code>string country = 5 [(.gen_bq_schema.description) = "Country for the recommendation."];</code>
   */
  com.google.protobuf.ByteString
      getCountryBytes();

  /**
   * <pre>
   * Doctor's unique ID.
   * </pre>
   *
   * <code>string doctor_id = 6 [(.gen_bq_schema.description) = "Doctor&#92;'s unique ID."];</code>
   */
  java.lang.String getDoctorId();
  /**
   * <pre>
   * Doctor's unique ID.
   * </pre>
   *
   * <code>string doctor_id = 6 [(.gen_bq_schema.description) = "Doctor&#92;'s unique ID."];</code>
   */
  com.google.protobuf.ByteString
      getDoctorIdBytes();

  /**
   * <pre>
   * Personal information about the physician.
   * </pre>
   *
   * <code>.person.Person doctor = 7 [(.gen_bq_schema.description) = "Personal information about the physician."];</code>
   */
  boolean hasDoctor();
  /**
   * <pre>
   * Personal information about the physician.
   * </pre>
   *
   * <code>.person.Person doctor = 7 [(.gen_bq_schema.description) = "Personal information about the physician."];</code>
   */
  io.bloombox.schema.person.Person getDoctor();
  /**
   * <pre>
   * Personal information about the physician.
   * </pre>
   *
   * <code>.person.Person doctor = 7 [(.gen_bq_schema.description) = "Personal information about the physician."];</code>
   */
  io.bloombox.schema.person.PersonOrBuilder getDoctorOrBuilder();
}
