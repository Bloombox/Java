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
// source: ledger/v1beta1/LedgerService_Beta1.proto

package io.bloombox.schema.services.ledger.v1beta1;

public interface InflightTransactionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bloombox.services.ledger.v1beta1.InflightTransaction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Specifies the status of an inflight transaction.
   * </pre>
   *
   * <code>.bloombox.services.ledger.v1beta1.TransactionStatus status = 1;</code>
   */
  int getStatusValue();
  /**
   * <pre>
   * Specifies the status of an inflight transaction.
   * </pre>
   *
   * <code>.bloombox.services.ledger.v1beta1.TransactionStatus status = 1;</code>
   */
  io.bloombox.schema.services.ledger.v1beta1.TransactionStatus getStatus();

  /**
   * <pre>
   * Transaction object. Provided when the transaction has finalized.
   * </pre>
   *
   * <code>.bloombox.ledger.Transaction txn = 2;</code>
   */
  boolean hasTxn();
  /**
   * <pre>
   * Transaction object. Provided when the transaction has finalized.
   * </pre>
   *
   * <code>.bloombox.ledger.Transaction txn = 2;</code>
   */
  io.bloombox.schema.ledger.Transactions.Transaction getTxn();
  /**
   * <pre>
   * Transaction object. Provided when the transaction has finalized.
   * </pre>
   *
   * <code>.bloombox.ledger.Transaction txn = 2;</code>
   */
  io.bloombox.schema.ledger.Transactions.TransactionOrBuilder getTxnOrBuilder();
}
