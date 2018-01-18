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
// source: partner/Partner.proto

package io.bloombox.schema.partner;

public interface PartnerFlagsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:partner.PartnerFlags)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Specifies that the subject partner organization is currently suspended, organization wide, and has had access
   * revoked to Bloombox systems.
   * </pre>
   *
   * <code>bool suspended = 1 [(.gen_bq_schema.description) = "Specifies that the subject partner organization is currently suspended, organization wide, and has had access revoked to Bloombox systems."];</code>
   */
  boolean getSuspended();

  /**
   * <pre>
   * Specifies that the subject partner organiztaion is currently in a past-due state, where their organization and
   * related access has been heavily restricted.
   * </pre>
   *
   * <code>bool pastdue = 2 [(.gen_bq_schema.description) = "Specifies that the subject partner organiztaion is currently in a past-due state, where their organization and related access has been heavily restricted."];</code>
   */
  boolean getPastdue();

  /**
   * <pre>
   * Specifies that the subject partner organization has access to beta features, clusters, and systems.
   * </pre>
   *
   * <code>bool beta = 3 [(.gen_bq_schema.description) = "Specifies that the subject partner organization has access to beta features, clusters, and systems."];</code>
   */
  boolean getBeta();

  /**
   * <pre>
   * Specifies that the subject partner organization has internal sandbox access.
   * </pre>
   *
   * <code>bool sandbox = 4 [(.gen_bq_schema.description) = "Specifies that the subject partner organization has internal sandbox access."];</code>
   */
  boolean getSandbox();

  /**
   * <pre>
   * Specifies that the subject partner organization is a testing account held and managed internally by Bloombox, or
   * by selected partners.
   * </pre>
   *
   * <code>bool internal = 5 [(.gen_bq_schema.description) = "Specifies that the subject partner organization is a testing account held and managed internally by Bloombox, or by selected partners."];</code>
   */
  boolean getInternal();
}
