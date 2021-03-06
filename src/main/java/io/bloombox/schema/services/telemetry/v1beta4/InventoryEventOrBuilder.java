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
// source: telemetry/v1beta4/TelemetryService_Beta4.proto

package io.bloombox.schema.services.telemetry.v1beta4;

public interface InventoryEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bloombox.services.telemetry.v1beta4.InventoryEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Describes an inventory event where certain tracking material was encountered by a reading check-point of some
   * kind, usually RFID or BCR-based interactions.
   * </pre>
   *
   * <code>.bloombox.services.telemetry.v1beta4.InventoryEvent.Encounter encounter = 10;</code>
   */
  boolean hasEncounter();
  /**
   * <pre>
   * Describes an inventory event where certain tracking material was encountered by a reading check-point of some
   * kind, usually RFID or BCR-based interactions.
   * </pre>
   *
   * <code>.bloombox.services.telemetry.v1beta4.InventoryEvent.Encounter encounter = 10;</code>
   */
  io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.Encounter getEncounter();
  /**
   * <pre>
   * Describes an inventory event where certain tracking material was encountered by a reading check-point of some
   * kind, usually RFID or BCR-based interactions.
   * </pre>
   *
   * <code>.bloombox.services.telemetry.v1beta4.InventoryEvent.Encounter encounter = 10;</code>
   */
  io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.EncounterOrBuilder getEncounterOrBuilder();

  /**
   * <pre>
   * Stock intake event, which describes product as it arrives into a managed supply chain context. Once product
   * proceeds from the intake phase, it is managed and tracked.
   * </pre>
   *
   * <code>.bloombox.services.telemetry.v1beta4.InventoryEvent.StockIntake intake = 11;</code>
   */
  boolean hasIntake();
  /**
   * <pre>
   * Stock intake event, which describes product as it arrives into a managed supply chain context. Once product
   * proceeds from the intake phase, it is managed and tracked.
   * </pre>
   *
   * <code>.bloombox.services.telemetry.v1beta4.InventoryEvent.StockIntake intake = 11;</code>
   */
  io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockIntake getIntake();
  /**
   * <pre>
   * Stock intake event, which describes product as it arrives into a managed supply chain context. Once product
   * proceeds from the intake phase, it is managed and tracked.
   * </pre>
   *
   * <code>.bloombox.services.telemetry.v1beta4.InventoryEvent.StockIntake intake = 11;</code>
   */
  io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockIntakeOrBuilder getIntakeOrBuilder();

  /**
   * <pre>
   * Update-in-place event for a piece of tracked inventory or product. Updates of this nature occur within the same
   * licensure, location, and organizational boundaries.
   * </pre>
   *
   * <code>.bloombox.services.telemetry.v1beta4.InventoryEvent.StockUpdate update = 12;</code>
   */
  boolean hasUpdate();
  /**
   * <pre>
   * Update-in-place event for a piece of tracked inventory or product. Updates of this nature occur within the same
   * licensure, location, and organizational boundaries.
   * </pre>
   *
   * <code>.bloombox.services.telemetry.v1beta4.InventoryEvent.StockUpdate update = 12;</code>
   */
  io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockUpdate getUpdate();
  /**
   * <pre>
   * Update-in-place event for a piece of tracked inventory or product. Updates of this nature occur within the same
   * licensure, location, and organizational boundaries.
   * </pre>
   *
   * <code>.bloombox.services.telemetry.v1beta4.InventoryEvent.StockUpdate update = 12;</code>
   */
  io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockUpdateOrBuilder getUpdateOrBuilder();

  /**
   * <pre>
   * Transfer transaction event, which indicates that product or tracked inventory was transferred across physical,
   * legal (licensure), or organizational boundaries.
   * </pre>
   *
   * <code>.bloombox.services.telemetry.v1beta4.InventoryEvent.StockTransfer transfer = 13;</code>
   */
  boolean hasTransfer();
  /**
   * <pre>
   * Transfer transaction event, which indicates that product or tracked inventory was transferred across physical,
   * legal (licensure), or organizational boundaries.
   * </pre>
   *
   * <code>.bloombox.services.telemetry.v1beta4.InventoryEvent.StockTransfer transfer = 13;</code>
   */
  io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockTransfer getTransfer();
  /**
   * <pre>
   * Transfer transaction event, which indicates that product or tracked inventory was transferred across physical,
   * legal (licensure), or organizational boundaries.
   * </pre>
   *
   * <code>.bloombox.services.telemetry.v1beta4.InventoryEvent.StockTransfer transfer = 13;</code>
   */
  io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockTransferOrBuilder getTransferOrBuilder();

  /**
   * <pre>
   * Stock reservation event, which indicates that some portion of stock or managed inventory was requested for
   * reservation or lease.
   * </pre>
   *
   * <code>.bloombox.services.telemetry.v1beta4.InventoryEvent.StockReserve reservation = 14;</code>
   */
  boolean hasReservation();
  /**
   * <pre>
   * Stock reservation event, which indicates that some portion of stock or managed inventory was requested for
   * reservation or lease.
   * </pre>
   *
   * <code>.bloombox.services.telemetry.v1beta4.InventoryEvent.StockReserve reservation = 14;</code>
   */
  io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockReserve getReservation();
  /**
   * <pre>
   * Stock reservation event, which indicates that some portion of stock or managed inventory was requested for
   * reservation or lease.
   * </pre>
   *
   * <code>.bloombox.services.telemetry.v1beta4.InventoryEvent.StockReserve reservation = 14;</code>
   */
  io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockReserveOrBuilder getReservationOrBuilder();

  /**
   * <pre>
   * Cancellation event, indicating that a piece of stock or managed inventory reserved via an earlier call to
   * "StockReserve" can now be freed back into the supply chain ecosystem.
   * </pre>
   *
   * <code>.bloombox.services.telemetry.v1beta4.InventoryEvent.ReservationCancel cancellation = 15;</code>
   */
  boolean hasCancellation();
  /**
   * <pre>
   * Cancellation event, indicating that a piece of stock or managed inventory reserved via an earlier call to
   * "StockReserve" can now be freed back into the supply chain ecosystem.
   * </pre>
   *
   * <code>.bloombox.services.telemetry.v1beta4.InventoryEvent.ReservationCancel cancellation = 15;</code>
   */
  io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.ReservationCancel getCancellation();
  /**
   * <pre>
   * Cancellation event, indicating that a piece of stock or managed inventory reserved via an earlier call to
   * "StockReserve" can now be freed back into the supply chain ecosystem.
   * </pre>
   *
   * <code>.bloombox.services.telemetry.v1beta4.InventoryEvent.ReservationCancel cancellation = 15;</code>
   */
  io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.ReservationCancelOrBuilder getCancellationOrBuilder();

  /**
   * <pre>
   * Consumption event, indicating that product was terminally destroyed or otherwise permanently left the custody of
   * the managed supply chain environment.
   * </pre>
   *
   * <code>.bloombox.services.telemetry.v1beta4.InventoryEvent.StockConsume consumption = 16;</code>
   */
  boolean hasConsumption();
  /**
   * <pre>
   * Consumption event, indicating that product was terminally destroyed or otherwise permanently left the custody of
   * the managed supply chain environment.
   * </pre>
   *
   * <code>.bloombox.services.telemetry.v1beta4.InventoryEvent.StockConsume consumption = 16;</code>
   */
  io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockConsume getConsumption();
  /**
   * <pre>
   * Consumption event, indicating that product was terminally destroyed or otherwise permanently left the custody of
   * the managed supply chain environment.
   * </pre>
   *
   * <code>.bloombox.services.telemetry.v1beta4.InventoryEvent.StockConsume consumption = 16;</code>
   */
  io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockConsumeOrBuilder getConsumptionOrBuilder();

  public io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.EventCase getEventCase();
}
