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

package io.bloombox.schema.services.telemetry.v1beta4;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Provides support for relaying inventory-related telemetry information, describing state readings or changes in state
 * for on-hand, or fit-for-sale stock amounts in different circumstances. Inventory signals may be sent by RFID or BCR
 * systems, sent from point of sale or ordering systems, and more.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: telemetry/v1beta4/TelemetryService_Beta4.proto")
public final class InventoryTelemetryGrpc {

  private InventoryTelemetryGrpc() {}

  public static final String SERVICE_NAME = "bloombox.services.telemetry.v1beta4.InventoryTelemetry";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.Encounter,
      com.google.protobuf.Empty> getEncounterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Encounter",
      requestType = io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.Encounter.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.Encounter,
      com.google.protobuf.Empty> getEncounterMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.Encounter, com.google.protobuf.Empty> getEncounterMethod;
    if ((getEncounterMethod = InventoryTelemetryGrpc.getEncounterMethod) == null) {
      synchronized (InventoryTelemetryGrpc.class) {
        if ((getEncounterMethod = InventoryTelemetryGrpc.getEncounterMethod) == null) {
          InventoryTelemetryGrpc.getEncounterMethod = getEncounterMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.Encounter, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.telemetry.v1beta4.InventoryTelemetry", "Encounter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.Encounter.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new InventoryTelemetryMethodDescriptorSupplier("Encounter"))
                  .build();
          }
        }
     }
     return getEncounterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockIntake,
      com.google.protobuf.Empty> getIntakeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Intake",
      requestType = io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockIntake.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockIntake,
      com.google.protobuf.Empty> getIntakeMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockIntake, com.google.protobuf.Empty> getIntakeMethod;
    if ((getIntakeMethod = InventoryTelemetryGrpc.getIntakeMethod) == null) {
      synchronized (InventoryTelemetryGrpc.class) {
        if ((getIntakeMethod = InventoryTelemetryGrpc.getIntakeMethod) == null) {
          InventoryTelemetryGrpc.getIntakeMethod = getIntakeMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockIntake, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.telemetry.v1beta4.InventoryTelemetry", "Intake"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockIntake.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new InventoryTelemetryMethodDescriptorSupplier("Intake"))
                  .build();
          }
        }
     }
     return getIntakeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockIntake,
      com.google.protobuf.Empty> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockIntake.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockIntake,
      com.google.protobuf.Empty> getUpdateMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockIntake, com.google.protobuf.Empty> getUpdateMethod;
    if ((getUpdateMethod = InventoryTelemetryGrpc.getUpdateMethod) == null) {
      synchronized (InventoryTelemetryGrpc.class) {
        if ((getUpdateMethod = InventoryTelemetryGrpc.getUpdateMethod) == null) {
          InventoryTelemetryGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockIntake, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.telemetry.v1beta4.InventoryTelemetry", "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockIntake.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new InventoryTelemetryMethodDescriptorSupplier("Update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockTransfer,
      com.google.protobuf.Empty> getTransferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Transfer",
      requestType = io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockTransfer.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockTransfer,
      com.google.protobuf.Empty> getTransferMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockTransfer, com.google.protobuf.Empty> getTransferMethod;
    if ((getTransferMethod = InventoryTelemetryGrpc.getTransferMethod) == null) {
      synchronized (InventoryTelemetryGrpc.class) {
        if ((getTransferMethod = InventoryTelemetryGrpc.getTransferMethod) == null) {
          InventoryTelemetryGrpc.getTransferMethod = getTransferMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockTransfer, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.telemetry.v1beta4.InventoryTelemetry", "Transfer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockTransfer.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new InventoryTelemetryMethodDescriptorSupplier("Transfer"))
                  .build();
          }
        }
     }
     return getTransferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockReserve,
      com.google.protobuf.Empty> getReserveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Reserve",
      requestType = io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockReserve.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockReserve,
      com.google.protobuf.Empty> getReserveMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockReserve, com.google.protobuf.Empty> getReserveMethod;
    if ((getReserveMethod = InventoryTelemetryGrpc.getReserveMethod) == null) {
      synchronized (InventoryTelemetryGrpc.class) {
        if ((getReserveMethod = InventoryTelemetryGrpc.getReserveMethod) == null) {
          InventoryTelemetryGrpc.getReserveMethod = getReserveMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockReserve, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.telemetry.v1beta4.InventoryTelemetry", "Reserve"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockReserve.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new InventoryTelemetryMethodDescriptorSupplier("Reserve"))
                  .build();
          }
        }
     }
     return getReserveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.ReservationCancel,
      com.google.protobuf.Empty> getCancelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Cancel",
      requestType = io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.ReservationCancel.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.ReservationCancel,
      com.google.protobuf.Empty> getCancelMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.ReservationCancel, com.google.protobuf.Empty> getCancelMethod;
    if ((getCancelMethod = InventoryTelemetryGrpc.getCancelMethod) == null) {
      synchronized (InventoryTelemetryGrpc.class) {
        if ((getCancelMethod = InventoryTelemetryGrpc.getCancelMethod) == null) {
          InventoryTelemetryGrpc.getCancelMethod = getCancelMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.ReservationCancel, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.telemetry.v1beta4.InventoryTelemetry", "Cancel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.ReservationCancel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new InventoryTelemetryMethodDescriptorSupplier("Cancel"))
                  .build();
          }
        }
     }
     return getCancelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockConsume,
      com.google.protobuf.Empty> getConsumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Consume",
      requestType = io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockConsume.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockConsume,
      com.google.protobuf.Empty> getConsumeMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockConsume, com.google.protobuf.Empty> getConsumeMethod;
    if ((getConsumeMethod = InventoryTelemetryGrpc.getConsumeMethod) == null) {
      synchronized (InventoryTelemetryGrpc.class) {
        if ((getConsumeMethod = InventoryTelemetryGrpc.getConsumeMethod) == null) {
          InventoryTelemetryGrpc.getConsumeMethod = getConsumeMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockConsume, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.telemetry.v1beta4.InventoryTelemetry", "Consume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockConsume.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new InventoryTelemetryMethodDescriptorSupplier("Consume"))
                  .build();
          }
        }
     }
     return getConsumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent,
      com.google.protobuf.Empty> getLiveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Live",
      requestType = io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent,
      com.google.protobuf.Empty> getLiveMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent, com.google.protobuf.Empty> getLiveMethod;
    if ((getLiveMethod = InventoryTelemetryGrpc.getLiveMethod) == null) {
      synchronized (InventoryTelemetryGrpc.class) {
        if ((getLiveMethod = InventoryTelemetryGrpc.getLiveMethod) == null) {
          InventoryTelemetryGrpc.getLiveMethod = getLiveMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.telemetry.v1beta4.InventoryTelemetry", "Live"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new InventoryTelemetryMethodDescriptorSupplier("Live"))
                  .build();
          }
        }
     }
     return getLiveMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InventoryTelemetryStub newStub(io.grpc.Channel channel) {
    return new InventoryTelemetryStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InventoryTelemetryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new InventoryTelemetryBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InventoryTelemetryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new InventoryTelemetryFutureStub(channel);
  }

  /**
   * <pre>
   * Provides support for relaying inventory-related telemetry information, describing state readings or changes in state
   * for on-hand, or fit-for-sale stock amounts in different circumstances. Inventory signals may be sent by RFID or BCR
   * systems, sent from point of sale or ordering systems, and more.
   * </pre>
   */
  public static abstract class InventoryTelemetryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Encounter some piece of inventory via RFID, BCR, or some other automated/verifiable medium. The underlying tag or
     * encoded bar code is passed in raw form, so it may be processed by downstream systems to update inventory state from
     * the observed conditions from on-site reader devices, either passive or active.
     * </pre>
     */
    public void encounter(io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.Encounter request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getEncounterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Record inventory intake across licensure, custody, or physical boundaries. Intake is specifically defined as the
     * origination of product, which does not yet exist in a managed supply chain.
     * </pre>
     */
    public void intake(io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockIntake request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getIntakeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update existing tracked inventory in-place. This may include transfers within the same licensure or organizational
     * boundary, but between locations, each of which are subject to their own licensure requirements.
     * </pre>
     */
    public void update(io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockIntake request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Transfer inventory across licensure, custody, or physical boundaries. When managed or tracked inventory crosses
     * local licensure boundaries (for instance, between locations in the same organization, or between two independent
     * and licensed organizations), it is reported as a full transfer of custody.
     * </pre>
     */
    public void transfer(io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockTransfer request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getTransferMethod(), responseObserver);
    }

    /**
     * <pre>
     * Request a reservation on some piece of stock, such that it be "leased" for some period of time. Either the stock is
     * later consumed, referencing an existing reservation, or the lease period expires, freeing the subject inventory for
     * further transfer or consumption.
     * </pre>
     */
    public void reserve(io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockReserve request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getReserveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Request cancellation of an existing reservation of tracked inventory or stock. Reservations can be cancelled to
     * free the underlying stock or tracked inventory within the greater managed supply chain. Cancelling the reservation
     * is a manual step that is not required to naturally expire a lease for a reservation.
     * </pre>
     */
    public void cancel(io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.ReservationCancel request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getCancelMethod(), responseObserver);
    }

    /**
     * <pre>
     * "Consume" a reservation or portion of tracked/managed inventory. This indicates a terminal event where tracked
     * product is destroyed or otherwise exits managed supply chain custody.
     * </pre>
     */
    public void consume(io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockConsume request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getConsumeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Establishes a client-initiated stream of inventory events, which are themselves dispatched via backing logic that
     * implements whatever specific method maps to the provided event's type. These low-level streaming methods are meant
     * to be used from monitoring and data collection hardware.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent> live(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(getLiveMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEncounterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.Encounter,
                com.google.protobuf.Empty>(
                  this, METHODID_ENCOUNTER)))
          .addMethod(
            getIntakeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockIntake,
                com.google.protobuf.Empty>(
                  this, METHODID_INTAKE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockIntake,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getTransferMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockTransfer,
                com.google.protobuf.Empty>(
                  this, METHODID_TRANSFER)))
          .addMethod(
            getReserveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockReserve,
                com.google.protobuf.Empty>(
                  this, METHODID_RESERVE)))
          .addMethod(
            getCancelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.ReservationCancel,
                com.google.protobuf.Empty>(
                  this, METHODID_CANCEL)))
          .addMethod(
            getConsumeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockConsume,
                com.google.protobuf.Empty>(
                  this, METHODID_CONSUME)))
          .addMethod(
            getLiveMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent,
                com.google.protobuf.Empty>(
                  this, METHODID_LIVE)))
          .build();
    }
  }

  /**
   * <pre>
   * Provides support for relaying inventory-related telemetry information, describing state readings or changes in state
   * for on-hand, or fit-for-sale stock amounts in different circumstances. Inventory signals may be sent by RFID or BCR
   * systems, sent from point of sale or ordering systems, and more.
   * </pre>
   */
  public static final class InventoryTelemetryStub extends io.grpc.stub.AbstractStub<InventoryTelemetryStub> {
    private InventoryTelemetryStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InventoryTelemetryStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryTelemetryStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InventoryTelemetryStub(channel, callOptions);
    }

    /**
     * <pre>
     * Encounter some piece of inventory via RFID, BCR, or some other automated/verifiable medium. The underlying tag or
     * encoded bar code is passed in raw form, so it may be processed by downstream systems to update inventory state from
     * the observed conditions from on-site reader devices, either passive or active.
     * </pre>
     */
    public void encounter(io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.Encounter request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEncounterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Record inventory intake across licensure, custody, or physical boundaries. Intake is specifically defined as the
     * origination of product, which does not yet exist in a managed supply chain.
     * </pre>
     */
    public void intake(io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockIntake request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIntakeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update existing tracked inventory in-place. This may include transfers within the same licensure or organizational
     * boundary, but between locations, each of which are subject to their own licensure requirements.
     * </pre>
     */
    public void update(io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockIntake request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Transfer inventory across licensure, custody, or physical boundaries. When managed or tracked inventory crosses
     * local licensure boundaries (for instance, between locations in the same organization, or between two independent
     * and licensed organizations), it is reported as a full transfer of custody.
     * </pre>
     */
    public void transfer(io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockTransfer request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTransferMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Request a reservation on some piece of stock, such that it be "leased" for some period of time. Either the stock is
     * later consumed, referencing an existing reservation, or the lease period expires, freeing the subject inventory for
     * further transfer or consumption.
     * </pre>
     */
    public void reserve(io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockReserve request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReserveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Request cancellation of an existing reservation of tracked inventory or stock. Reservations can be cancelled to
     * free the underlying stock or tracked inventory within the greater managed supply chain. Cancelling the reservation
     * is a manual step that is not required to naturally expire a lease for a reservation.
     * </pre>
     */
    public void cancel(io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.ReservationCancel request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCancelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * "Consume" a reservation or portion of tracked/managed inventory. This indicates a terminal event where tracked
     * product is destroyed or otherwise exits managed supply chain custody.
     * </pre>
     */
    public void consume(io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockConsume request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConsumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Establishes a client-initiated stream of inventory events, which are themselves dispatched via backing logic that
     * implements whatever specific method maps to the provided event's type. These low-level streaming methods are meant
     * to be used from monitoring and data collection hardware.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent> live(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getLiveMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Provides support for relaying inventory-related telemetry information, describing state readings or changes in state
   * for on-hand, or fit-for-sale stock amounts in different circumstances. Inventory signals may be sent by RFID or BCR
   * systems, sent from point of sale or ordering systems, and more.
   * </pre>
   */
  public static final class InventoryTelemetryBlockingStub extends io.grpc.stub.AbstractStub<InventoryTelemetryBlockingStub> {
    private InventoryTelemetryBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InventoryTelemetryBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryTelemetryBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InventoryTelemetryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Encounter some piece of inventory via RFID, BCR, or some other automated/verifiable medium. The underlying tag or
     * encoded bar code is passed in raw form, so it may be processed by downstream systems to update inventory state from
     * the observed conditions from on-site reader devices, either passive or active.
     * </pre>
     */
    public com.google.protobuf.Empty encounter(io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.Encounter request) {
      return blockingUnaryCall(
          getChannel(), getEncounterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Record inventory intake across licensure, custody, or physical boundaries. Intake is specifically defined as the
     * origination of product, which does not yet exist in a managed supply chain.
     * </pre>
     */
    public com.google.protobuf.Empty intake(io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockIntake request) {
      return blockingUnaryCall(
          getChannel(), getIntakeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update existing tracked inventory in-place. This may include transfers within the same licensure or organizational
     * boundary, but between locations, each of which are subject to their own licensure requirements.
     * </pre>
     */
    public com.google.protobuf.Empty update(io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockIntake request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Transfer inventory across licensure, custody, or physical boundaries. When managed or tracked inventory crosses
     * local licensure boundaries (for instance, between locations in the same organization, or between two independent
     * and licensed organizations), it is reported as a full transfer of custody.
     * </pre>
     */
    public com.google.protobuf.Empty transfer(io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockTransfer request) {
      return blockingUnaryCall(
          getChannel(), getTransferMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Request a reservation on some piece of stock, such that it be "leased" for some period of time. Either the stock is
     * later consumed, referencing an existing reservation, or the lease period expires, freeing the subject inventory for
     * further transfer or consumption.
     * </pre>
     */
    public com.google.protobuf.Empty reserve(io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockReserve request) {
      return blockingUnaryCall(
          getChannel(), getReserveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Request cancellation of an existing reservation of tracked inventory or stock. Reservations can be cancelled to
     * free the underlying stock or tracked inventory within the greater managed supply chain. Cancelling the reservation
     * is a manual step that is not required to naturally expire a lease for a reservation.
     * </pre>
     */
    public com.google.protobuf.Empty cancel(io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.ReservationCancel request) {
      return blockingUnaryCall(
          getChannel(), getCancelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * "Consume" a reservation or portion of tracked/managed inventory. This indicates a terminal event where tracked
     * product is destroyed or otherwise exits managed supply chain custody.
     * </pre>
     */
    public com.google.protobuf.Empty consume(io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockConsume request) {
      return blockingUnaryCall(
          getChannel(), getConsumeMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Provides support for relaying inventory-related telemetry information, describing state readings or changes in state
   * for on-hand, or fit-for-sale stock amounts in different circumstances. Inventory signals may be sent by RFID or BCR
   * systems, sent from point of sale or ordering systems, and more.
   * </pre>
   */
  public static final class InventoryTelemetryFutureStub extends io.grpc.stub.AbstractStub<InventoryTelemetryFutureStub> {
    private InventoryTelemetryFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InventoryTelemetryFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryTelemetryFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InventoryTelemetryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Encounter some piece of inventory via RFID, BCR, or some other automated/verifiable medium. The underlying tag or
     * encoded bar code is passed in raw form, so it may be processed by downstream systems to update inventory state from
     * the observed conditions from on-site reader devices, either passive or active.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> encounter(
        io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.Encounter request) {
      return futureUnaryCall(
          getChannel().newCall(getEncounterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Record inventory intake across licensure, custody, or physical boundaries. Intake is specifically defined as the
     * origination of product, which does not yet exist in a managed supply chain.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> intake(
        io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockIntake request) {
      return futureUnaryCall(
          getChannel().newCall(getIntakeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update existing tracked inventory in-place. This may include transfers within the same licensure or organizational
     * boundary, but between locations, each of which are subject to their own licensure requirements.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> update(
        io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockIntake request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Transfer inventory across licensure, custody, or physical boundaries. When managed or tracked inventory crosses
     * local licensure boundaries (for instance, between locations in the same organization, or between two independent
     * and licensed organizations), it is reported as a full transfer of custody.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> transfer(
        io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockTransfer request) {
      return futureUnaryCall(
          getChannel().newCall(getTransferMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Request a reservation on some piece of stock, such that it be "leased" for some period of time. Either the stock is
     * later consumed, referencing an existing reservation, or the lease period expires, freeing the subject inventory for
     * further transfer or consumption.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> reserve(
        io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockReserve request) {
      return futureUnaryCall(
          getChannel().newCall(getReserveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Request cancellation of an existing reservation of tracked inventory or stock. Reservations can be cancelled to
     * free the underlying stock or tracked inventory within the greater managed supply chain. Cancelling the reservation
     * is a manual step that is not required to naturally expire a lease for a reservation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> cancel(
        io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.ReservationCancel request) {
      return futureUnaryCall(
          getChannel().newCall(getCancelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * "Consume" a reservation or portion of tracked/managed inventory. This indicates a terminal event where tracked
     * product is destroyed or otherwise exits managed supply chain custody.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> consume(
        io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockConsume request) {
      return futureUnaryCall(
          getChannel().newCall(getConsumeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ENCOUNTER = 0;
  private static final int METHODID_INTAKE = 1;
  private static final int METHODID_UPDATE = 2;
  private static final int METHODID_TRANSFER = 3;
  private static final int METHODID_RESERVE = 4;
  private static final int METHODID_CANCEL = 5;
  private static final int METHODID_CONSUME = 6;
  private static final int METHODID_LIVE = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InventoryTelemetryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InventoryTelemetryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ENCOUNTER:
          serviceImpl.encounter((io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.Encounter) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_INTAKE:
          serviceImpl.intake((io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockIntake) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockIntake) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_TRANSFER:
          serviceImpl.transfer((io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockTransfer) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_RESERVE:
          serviceImpl.reserve((io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockReserve) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CANCEL:
          serviceImpl.cancel((io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.ReservationCancel) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CONSUME:
          serviceImpl.consume((io.bloombox.schema.services.telemetry.v1beta4.InventoryEvent.StockConsume) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIVE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.live(
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class InventoryTelemetryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InventoryTelemetryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.bloombox.schema.services.telemetry.v1beta4.TelemetryServiceBeta4.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InventoryTelemetry");
    }
  }

  private static final class InventoryTelemetryFileDescriptorSupplier
      extends InventoryTelemetryBaseDescriptorSupplier {
    InventoryTelemetryFileDescriptorSupplier() {}
  }

  private static final class InventoryTelemetryMethodDescriptorSupplier
      extends InventoryTelemetryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InventoryTelemetryMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (InventoryTelemetryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InventoryTelemetryFileDescriptorSupplier())
              .addMethod(getEncounterMethod())
              .addMethod(getIntakeMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getTransferMethod())
              .addMethod(getReserveMethod())
              .addMethod(getCancelMethod())
              .addMethod(getConsumeMethod())
              .addMethod(getLiveMethod())
              .build();
        }
      }
    }
    return result;
  }
}
