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

package io.bloombox.schema.services.pos.v1beta1;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * Service providing backing functionality to physical sales via managed point-of-sale cash register devices, co-located
 * at partner locations. Sales in this context refer to transactions in a retail context, between a licensed cannabis
 * vendor (with a retail permit) and a licensed cannabis consumer, with the transaction occurring pursuant to some
 * medical or adult-use cannabis licensure and regulatory body.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.6.0-SNAPSHOT)",
    comments = "Source: pos/v1beta1/POSService_Beta1.proto")
public final class PointOfSaleGrpc {

  private PointOfSaleGrpc() {}

  public static final String SERVICE_NAME = "bloombox.schema.services.pos.v1beta1.PointOfSale";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.AuthorizeUser.Request,
      io.bloombox.schema.services.pos.v1beta1.AuthorizeUser.Response> METHOD_AUTHORIZE =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.pos.v1beta1.AuthorizeUser.Request, io.bloombox.schema.services.pos.v1beta1.AuthorizeUser.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.pos.v1beta1.PointOfSale", "Authorize"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.pos.v1beta1.AuthorizeUser.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.pos.v1beta1.AuthorizeUser.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.OpenSession.Request,
      io.bloombox.schema.services.pos.v1beta1.OpenSession.Response> METHOD_SESSION_OPEN =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.pos.v1beta1.OpenSession.Request, io.bloombox.schema.services.pos.v1beta1.OpenSession.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.pos.v1beta1.PointOfSale", "SessionOpen"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.pos.v1beta1.OpenSession.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.pos.v1beta1.OpenSession.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.CloseSession.Request,
      io.bloombox.schema.services.pos.v1beta1.CloseSession.Response> METHOD_SESSION_CLOSE =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.pos.v1beta1.CloseSession.Request, io.bloombox.schema.services.pos.v1beta1.CloseSession.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.pos.v1beta1.PointOfSale", "SessionClose"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.pos.v1beta1.CloseSession.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.pos.v1beta1.CloseSession.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.OpenTicket.Request,
      io.bloombox.schema.services.pos.v1beta1.OpenTicket.Response> METHOD_TICKET_OPEN =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.pos.v1beta1.OpenTicket.Request, io.bloombox.schema.services.pos.v1beta1.OpenTicket.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.pos.v1beta1.PointOfSale", "TicketOpen"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.pos.v1beta1.OpenTicket.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.pos.v1beta1.OpenTicket.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.SaveTicket.Request,
      io.bloombox.schema.services.pos.v1beta1.SaveTicket.Response> METHOD_TICKET_SAVE =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.pos.v1beta1.SaveTicket.Request, io.bloombox.schema.services.pos.v1beta1.SaveTicket.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.pos.v1beta1.PointOfSale", "TicketSave"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.pos.v1beta1.SaveTicket.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.pos.v1beta1.SaveTicket.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.LoadTicket.Request,
      io.bloombox.schema.services.pos.v1beta1.LoadTicket.Response> METHOD_TICKET_LOAD =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.pos.v1beta1.LoadTicket.Request, io.bloombox.schema.services.pos.v1beta1.LoadTicket.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.pos.v1beta1.PointOfSale", "TicketLoad"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.pos.v1beta1.LoadTicket.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.pos.v1beta1.LoadTicket.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.VoidTicket.Request,
      io.bloombox.schema.services.pos.v1beta1.VoidTicket.Response> METHOD_TICKET_VOID =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.pos.v1beta1.VoidTicket.Request, io.bloombox.schema.services.pos.v1beta1.VoidTicket.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.pos.v1beta1.PointOfSale", "TicketVoid"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.pos.v1beta1.VoidTicket.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.pos.v1beta1.VoidTicket.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.ClaimTicket.Request,
      io.bloombox.schema.services.pos.v1beta1.ClaimTicket.Response> METHOD_TICKET_CLAIM =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.pos.v1beta1.ClaimTicket.Request, io.bloombox.schema.services.pos.v1beta1.ClaimTicket.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.pos.v1beta1.PointOfSale", "TicketClaim"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.pos.v1beta1.ClaimTicket.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.pos.v1beta1.ClaimTicket.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.CloneTicket.Request,
      io.bloombox.schema.services.pos.v1beta1.CloneTicket.Response> METHOD_TICKET_CLONE =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.pos.v1beta1.CloneTicket.Request, io.bloombox.schema.services.pos.v1beta1.CloneTicket.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.pos.v1beta1.PointOfSale", "TicketClone"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.pos.v1beta1.CloneTicket.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.pos.v1beta1.CloneTicket.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.FinalizeTicket.Request,
      io.bloombox.schema.services.pos.v1beta1.FinalizeTicket.Response> METHOD_TICKET_FINALIZE =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.pos.v1beta1.FinalizeTicket.Request, io.bloombox.schema.services.pos.v1beta1.FinalizeTicket.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.pos.v1beta1.PointOfSale", "TicketFinalize"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.pos.v1beta1.FinalizeTicket.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.pos.v1beta1.FinalizeTicket.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.MemberSearch.Request,
      io.bloombox.schema.services.pos.v1beta1.MemberSearch.Response> METHOD_SEARCH_MEMBERS =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.pos.v1beta1.MemberSearch.Request, io.bloombox.schema.services.pos.v1beta1.MemberSearch.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.pos.v1beta1.PointOfSale", "SearchMembers"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.pos.v1beta1.MemberSearch.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.pos.v1beta1.MemberSearch.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.InventoryQuery.Request,
      io.bloombox.schema.services.pos.v1beta1.InventoryQuery.Response> METHOD_INVENTORY_RETRIEVE =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.pos.v1beta1.InventoryQuery.Request, io.bloombox.schema.services.pos.v1beta1.InventoryQuery.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.pos.v1beta1.PointOfSale", "InventoryRetrieve"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.pos.v1beta1.InventoryQuery.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.pos.v1beta1.InventoryQuery.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.InventoryStream.Request,
      io.bloombox.schema.services.pos.v1beta1.InventoryStream.Payload> METHOD_INVENTORY_STREAM =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.pos.v1beta1.InventoryStream.Request, io.bloombox.schema.services.pos.v1beta1.InventoryStream.Payload>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.pos.v1beta1.PointOfSale", "InventoryStream"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.pos.v1beta1.InventoryStream.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.pos.v1beta1.InventoryStream.Payload.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PointOfSaleStub newStub(io.grpc.Channel channel) {
    return new PointOfSaleStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PointOfSaleBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PointOfSaleBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PointOfSaleFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PointOfSaleFutureStub(channel);
  }

  /**
   * <pre>
   * Service providing backing functionality to physical sales via managed point-of-sale cash register devices, co-located
   * at partner locations. Sales in this context refer to transactions in a retail context, between a licensed cannabis
   * vendor (with a retail permit) and a licensed cannabis consumer, with the transaction occurring pursuant to some
   * medical or adult-use cannabis licensure and regulatory body.
   * </pre>
   */
  public static abstract class PointOfSaleImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Establish a point-of-sale session for a given user.
     * </pre>
     */
    public void authorize(io.bloombox.schema.services.pos.v1beta1.AuthorizeUser.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.AuthorizeUser.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_AUTHORIZE, responseObserver);
    }

    /**
     * <pre>
     * Open an established point-of-sale session, to begin accepting transactions.
     * </pre>
     */
    public void sessionOpen(io.bloombox.schema.services.pos.v1beta1.OpenSession.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.OpenSession.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SESSION_OPEN, responseObserver);
    }

    /**
     * <pre>
     * Close an open point-of-sale session, usually at the end of a working shift.
     * </pre>
     */
    public void sessionClose(io.bloombox.schema.services.pos.v1beta1.CloseSession.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.CloseSession.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SESSION_CLOSE, responseObserver);
    }

    /**
     * <pre>
     * Open a new or existing purchase ticket for read/write access.
     * </pre>
     */
    public void ticketOpen(io.bloombox.schema.services.pos.v1beta1.OpenTicket.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.OpenTicket.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_TICKET_OPEN, responseObserver);
    }

    /**
     * <pre>
     * Save a purchase ticket for later recall.
     * </pre>
     */
    public void ticketSave(io.bloombox.schema.services.pos.v1beta1.SaveTicket.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.SaveTicket.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_TICKET_SAVE, responseObserver);
    }

    /**
     * <pre>
     * Load an existing purchase ticket for read-only access.
     * </pre>
     */
    public void ticketLoad(io.bloombox.schema.services.pos.v1beta1.LoadTicket.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.LoadTicket.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_TICKET_LOAD, responseObserver);
    }

    /**
     * <pre>
     * Void (cancel) an existing, open purchase ticket.
     * </pre>
     */
    public void ticketVoid(io.bloombox.schema.services.pos.v1beta1.VoidTicket.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.VoidTicket.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_TICKET_VOID, responseObserver);
    }

    /**
     * <pre>
     * Claim an existing, open purchase ticket.
     * </pre>
     */
    public void ticketClaim(io.bloombox.schema.services.pos.v1beta1.ClaimTicket.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.ClaimTicket.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_TICKET_CLAIM, responseObserver);
    }

    /**
     * <pre>
     * Clone an existing, open purchase ticket.
     * </pre>
     */
    public void ticketClone(io.bloombox.schema.services.pos.v1beta1.CloneTicket.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.CloneTicket.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_TICKET_CLONE, responseObserver);
    }

    /**
     * <pre>
     * Finalize an existing, open purchase ticket.
     * </pre>
     */
    public void ticketFinalize(io.bloombox.schema.services.pos.v1beta1.FinalizeTicket.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.FinalizeTicket.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_TICKET_FINALIZE, responseObserver);
    }

    /**
     * <pre>
     * Perform a search across retail consumer memberships.
     * </pre>
     */
    public void searchMembers(io.bloombox.schema.services.pos.v1beta1.MemberSearch.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.MemberSearch.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH_MEMBERS, responseObserver);
    }

    /**
     * <pre>
     * Retrieve inventory items.
     * </pre>
     */
    public void inventoryRetrieve(io.bloombox.schema.services.pos.v1beta1.InventoryQuery.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.InventoryQuery.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_INVENTORY_RETRIEVE, responseObserver);
    }

    /**
     * <pre>
     * Establish an inventory stream.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.InventoryStream.Request> inventoryStream(
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.InventoryStream.Payload> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_INVENTORY_STREAM, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_AUTHORIZE,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.pos.v1beta1.AuthorizeUser.Request,
                io.bloombox.schema.services.pos.v1beta1.AuthorizeUser.Response>(
                  this, METHODID_AUTHORIZE)))
          .addMethod(
            METHOD_SESSION_OPEN,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.pos.v1beta1.OpenSession.Request,
                io.bloombox.schema.services.pos.v1beta1.OpenSession.Response>(
                  this, METHODID_SESSION_OPEN)))
          .addMethod(
            METHOD_SESSION_CLOSE,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.pos.v1beta1.CloseSession.Request,
                io.bloombox.schema.services.pos.v1beta1.CloseSession.Response>(
                  this, METHODID_SESSION_CLOSE)))
          .addMethod(
            METHOD_TICKET_OPEN,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.pos.v1beta1.OpenTicket.Request,
                io.bloombox.schema.services.pos.v1beta1.OpenTicket.Response>(
                  this, METHODID_TICKET_OPEN)))
          .addMethod(
            METHOD_TICKET_SAVE,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.pos.v1beta1.SaveTicket.Request,
                io.bloombox.schema.services.pos.v1beta1.SaveTicket.Response>(
                  this, METHODID_TICKET_SAVE)))
          .addMethod(
            METHOD_TICKET_LOAD,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.pos.v1beta1.LoadTicket.Request,
                io.bloombox.schema.services.pos.v1beta1.LoadTicket.Response>(
                  this, METHODID_TICKET_LOAD)))
          .addMethod(
            METHOD_TICKET_VOID,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.pos.v1beta1.VoidTicket.Request,
                io.bloombox.schema.services.pos.v1beta1.VoidTicket.Response>(
                  this, METHODID_TICKET_VOID)))
          .addMethod(
            METHOD_TICKET_CLAIM,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.pos.v1beta1.ClaimTicket.Request,
                io.bloombox.schema.services.pos.v1beta1.ClaimTicket.Response>(
                  this, METHODID_TICKET_CLAIM)))
          .addMethod(
            METHOD_TICKET_CLONE,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.pos.v1beta1.CloneTicket.Request,
                io.bloombox.schema.services.pos.v1beta1.CloneTicket.Response>(
                  this, METHODID_TICKET_CLONE)))
          .addMethod(
            METHOD_TICKET_FINALIZE,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.pos.v1beta1.FinalizeTicket.Request,
                io.bloombox.schema.services.pos.v1beta1.FinalizeTicket.Response>(
                  this, METHODID_TICKET_FINALIZE)))
          .addMethod(
            METHOD_SEARCH_MEMBERS,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.pos.v1beta1.MemberSearch.Request,
                io.bloombox.schema.services.pos.v1beta1.MemberSearch.Response>(
                  this, METHODID_SEARCH_MEMBERS)))
          .addMethod(
            METHOD_INVENTORY_RETRIEVE,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.pos.v1beta1.InventoryQuery.Request,
                io.bloombox.schema.services.pos.v1beta1.InventoryQuery.Response>(
                  this, METHODID_INVENTORY_RETRIEVE)))
          .addMethod(
            METHOD_INVENTORY_STREAM,
            asyncBidiStreamingCall(
              new MethodHandlers<
                io.bloombox.schema.services.pos.v1beta1.InventoryStream.Request,
                io.bloombox.schema.services.pos.v1beta1.InventoryStream.Payload>(
                  this, METHODID_INVENTORY_STREAM)))
          .build();
    }
  }

  /**
   * <pre>
   * Service providing backing functionality to physical sales via managed point-of-sale cash register devices, co-located
   * at partner locations. Sales in this context refer to transactions in a retail context, between a licensed cannabis
   * vendor (with a retail permit) and a licensed cannabis consumer, with the transaction occurring pursuant to some
   * medical or adult-use cannabis licensure and regulatory body.
   * </pre>
   */
  public static final class PointOfSaleStub extends io.grpc.stub.AbstractStub<PointOfSaleStub> {
    private PointOfSaleStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PointOfSaleStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PointOfSaleStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PointOfSaleStub(channel, callOptions);
    }

    /**
     * <pre>
     * Establish a point-of-sale session for a given user.
     * </pre>
     */
    public void authorize(io.bloombox.schema.services.pos.v1beta1.AuthorizeUser.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.AuthorizeUser.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_AUTHORIZE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Open an established point-of-sale session, to begin accepting transactions.
     * </pre>
     */
    public void sessionOpen(io.bloombox.schema.services.pos.v1beta1.OpenSession.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.OpenSession.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SESSION_OPEN, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Close an open point-of-sale session, usually at the end of a working shift.
     * </pre>
     */
    public void sessionClose(io.bloombox.schema.services.pos.v1beta1.CloseSession.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.CloseSession.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SESSION_CLOSE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Open a new or existing purchase ticket for read/write access.
     * </pre>
     */
    public void ticketOpen(io.bloombox.schema.services.pos.v1beta1.OpenTicket.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.OpenTicket.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_TICKET_OPEN, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Save a purchase ticket for later recall.
     * </pre>
     */
    public void ticketSave(io.bloombox.schema.services.pos.v1beta1.SaveTicket.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.SaveTicket.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_TICKET_SAVE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Load an existing purchase ticket for read-only access.
     * </pre>
     */
    public void ticketLoad(io.bloombox.schema.services.pos.v1beta1.LoadTicket.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.LoadTicket.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_TICKET_LOAD, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Void (cancel) an existing, open purchase ticket.
     * </pre>
     */
    public void ticketVoid(io.bloombox.schema.services.pos.v1beta1.VoidTicket.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.VoidTicket.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_TICKET_VOID, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Claim an existing, open purchase ticket.
     * </pre>
     */
    public void ticketClaim(io.bloombox.schema.services.pos.v1beta1.ClaimTicket.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.ClaimTicket.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_TICKET_CLAIM, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Clone an existing, open purchase ticket.
     * </pre>
     */
    public void ticketClone(io.bloombox.schema.services.pos.v1beta1.CloneTicket.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.CloneTicket.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_TICKET_CLONE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Finalize an existing, open purchase ticket.
     * </pre>
     */
    public void ticketFinalize(io.bloombox.schema.services.pos.v1beta1.FinalizeTicket.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.FinalizeTicket.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_TICKET_FINALIZE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Perform a search across retail consumer memberships.
     * </pre>
     */
    public void searchMembers(io.bloombox.schema.services.pos.v1beta1.MemberSearch.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.MemberSearch.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_MEMBERS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve inventory items.
     * </pre>
     */
    public void inventoryRetrieve(io.bloombox.schema.services.pos.v1beta1.InventoryQuery.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.InventoryQuery.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_INVENTORY_RETRIEVE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Establish an inventory stream.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.InventoryStream.Request> inventoryStream(
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.InventoryStream.Payload> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_INVENTORY_STREAM, getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Service providing backing functionality to physical sales via managed point-of-sale cash register devices, co-located
   * at partner locations. Sales in this context refer to transactions in a retail context, between a licensed cannabis
   * vendor (with a retail permit) and a licensed cannabis consumer, with the transaction occurring pursuant to some
   * medical or adult-use cannabis licensure and regulatory body.
   * </pre>
   */
  public static final class PointOfSaleBlockingStub extends io.grpc.stub.AbstractStub<PointOfSaleBlockingStub> {
    private PointOfSaleBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PointOfSaleBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PointOfSaleBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PointOfSaleBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Establish a point-of-sale session for a given user.
     * </pre>
     */
    public io.bloombox.schema.services.pos.v1beta1.AuthorizeUser.Response authorize(io.bloombox.schema.services.pos.v1beta1.AuthorizeUser.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_AUTHORIZE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Open an established point-of-sale session, to begin accepting transactions.
     * </pre>
     */
    public io.bloombox.schema.services.pos.v1beta1.OpenSession.Response sessionOpen(io.bloombox.schema.services.pos.v1beta1.OpenSession.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SESSION_OPEN, getCallOptions(), request);
    }

    /**
     * <pre>
     * Close an open point-of-sale session, usually at the end of a working shift.
     * </pre>
     */
    public io.bloombox.schema.services.pos.v1beta1.CloseSession.Response sessionClose(io.bloombox.schema.services.pos.v1beta1.CloseSession.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SESSION_CLOSE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Open a new or existing purchase ticket for read/write access.
     * </pre>
     */
    public io.bloombox.schema.services.pos.v1beta1.OpenTicket.Response ticketOpen(io.bloombox.schema.services.pos.v1beta1.OpenTicket.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_TICKET_OPEN, getCallOptions(), request);
    }

    /**
     * <pre>
     * Save a purchase ticket for later recall.
     * </pre>
     */
    public io.bloombox.schema.services.pos.v1beta1.SaveTicket.Response ticketSave(io.bloombox.schema.services.pos.v1beta1.SaveTicket.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_TICKET_SAVE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Load an existing purchase ticket for read-only access.
     * </pre>
     */
    public io.bloombox.schema.services.pos.v1beta1.LoadTicket.Response ticketLoad(io.bloombox.schema.services.pos.v1beta1.LoadTicket.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_TICKET_LOAD, getCallOptions(), request);
    }

    /**
     * <pre>
     * Void (cancel) an existing, open purchase ticket.
     * </pre>
     */
    public io.bloombox.schema.services.pos.v1beta1.VoidTicket.Response ticketVoid(io.bloombox.schema.services.pos.v1beta1.VoidTicket.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_TICKET_VOID, getCallOptions(), request);
    }

    /**
     * <pre>
     * Claim an existing, open purchase ticket.
     * </pre>
     */
    public io.bloombox.schema.services.pos.v1beta1.ClaimTicket.Response ticketClaim(io.bloombox.schema.services.pos.v1beta1.ClaimTicket.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_TICKET_CLAIM, getCallOptions(), request);
    }

    /**
     * <pre>
     * Clone an existing, open purchase ticket.
     * </pre>
     */
    public io.bloombox.schema.services.pos.v1beta1.CloneTicket.Response ticketClone(io.bloombox.schema.services.pos.v1beta1.CloneTicket.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_TICKET_CLONE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Finalize an existing, open purchase ticket.
     * </pre>
     */
    public io.bloombox.schema.services.pos.v1beta1.FinalizeTicket.Response ticketFinalize(io.bloombox.schema.services.pos.v1beta1.FinalizeTicket.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_TICKET_FINALIZE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Perform a search across retail consumer memberships.
     * </pre>
     */
    public io.bloombox.schema.services.pos.v1beta1.MemberSearch.Response searchMembers(io.bloombox.schema.services.pos.v1beta1.MemberSearch.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH_MEMBERS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve inventory items.
     * </pre>
     */
    public io.bloombox.schema.services.pos.v1beta1.InventoryQuery.Response inventoryRetrieve(io.bloombox.schema.services.pos.v1beta1.InventoryQuery.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_INVENTORY_RETRIEVE, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service providing backing functionality to physical sales via managed point-of-sale cash register devices, co-located
   * at partner locations. Sales in this context refer to transactions in a retail context, between a licensed cannabis
   * vendor (with a retail permit) and a licensed cannabis consumer, with the transaction occurring pursuant to some
   * medical or adult-use cannabis licensure and regulatory body.
   * </pre>
   */
  public static final class PointOfSaleFutureStub extends io.grpc.stub.AbstractStub<PointOfSaleFutureStub> {
    private PointOfSaleFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PointOfSaleFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PointOfSaleFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PointOfSaleFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Establish a point-of-sale session for a given user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.pos.v1beta1.AuthorizeUser.Response> authorize(
        io.bloombox.schema.services.pos.v1beta1.AuthorizeUser.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_AUTHORIZE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Open an established point-of-sale session, to begin accepting transactions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.pos.v1beta1.OpenSession.Response> sessionOpen(
        io.bloombox.schema.services.pos.v1beta1.OpenSession.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SESSION_OPEN, getCallOptions()), request);
    }

    /**
     * <pre>
     * Close an open point-of-sale session, usually at the end of a working shift.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.pos.v1beta1.CloseSession.Response> sessionClose(
        io.bloombox.schema.services.pos.v1beta1.CloseSession.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SESSION_CLOSE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Open a new or existing purchase ticket for read/write access.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.pos.v1beta1.OpenTicket.Response> ticketOpen(
        io.bloombox.schema.services.pos.v1beta1.OpenTicket.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_TICKET_OPEN, getCallOptions()), request);
    }

    /**
     * <pre>
     * Save a purchase ticket for later recall.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.pos.v1beta1.SaveTicket.Response> ticketSave(
        io.bloombox.schema.services.pos.v1beta1.SaveTicket.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_TICKET_SAVE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Load an existing purchase ticket for read-only access.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.pos.v1beta1.LoadTicket.Response> ticketLoad(
        io.bloombox.schema.services.pos.v1beta1.LoadTicket.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_TICKET_LOAD, getCallOptions()), request);
    }

    /**
     * <pre>
     * Void (cancel) an existing, open purchase ticket.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.pos.v1beta1.VoidTicket.Response> ticketVoid(
        io.bloombox.schema.services.pos.v1beta1.VoidTicket.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_TICKET_VOID, getCallOptions()), request);
    }

    /**
     * <pre>
     * Claim an existing, open purchase ticket.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.pos.v1beta1.ClaimTicket.Response> ticketClaim(
        io.bloombox.schema.services.pos.v1beta1.ClaimTicket.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_TICKET_CLAIM, getCallOptions()), request);
    }

    /**
     * <pre>
     * Clone an existing, open purchase ticket.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.pos.v1beta1.CloneTicket.Response> ticketClone(
        io.bloombox.schema.services.pos.v1beta1.CloneTicket.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_TICKET_CLONE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Finalize an existing, open purchase ticket.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.pos.v1beta1.FinalizeTicket.Response> ticketFinalize(
        io.bloombox.schema.services.pos.v1beta1.FinalizeTicket.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_TICKET_FINALIZE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Perform a search across retail consumer memberships.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.pos.v1beta1.MemberSearch.Response> searchMembers(
        io.bloombox.schema.services.pos.v1beta1.MemberSearch.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_MEMBERS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve inventory items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.pos.v1beta1.InventoryQuery.Response> inventoryRetrieve(
        io.bloombox.schema.services.pos.v1beta1.InventoryQuery.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_INVENTORY_RETRIEVE, getCallOptions()), request);
    }
  }

  private static final int METHODID_AUTHORIZE = 0;
  private static final int METHODID_SESSION_OPEN = 1;
  private static final int METHODID_SESSION_CLOSE = 2;
  private static final int METHODID_TICKET_OPEN = 3;
  private static final int METHODID_TICKET_SAVE = 4;
  private static final int METHODID_TICKET_LOAD = 5;
  private static final int METHODID_TICKET_VOID = 6;
  private static final int METHODID_TICKET_CLAIM = 7;
  private static final int METHODID_TICKET_CLONE = 8;
  private static final int METHODID_TICKET_FINALIZE = 9;
  private static final int METHODID_SEARCH_MEMBERS = 10;
  private static final int METHODID_INVENTORY_RETRIEVE = 11;
  private static final int METHODID_INVENTORY_STREAM = 12;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PointOfSaleImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PointOfSaleImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AUTHORIZE:
          serviceImpl.authorize((io.bloombox.schema.services.pos.v1beta1.AuthorizeUser.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.AuthorizeUser.Response>) responseObserver);
          break;
        case METHODID_SESSION_OPEN:
          serviceImpl.sessionOpen((io.bloombox.schema.services.pos.v1beta1.OpenSession.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.OpenSession.Response>) responseObserver);
          break;
        case METHODID_SESSION_CLOSE:
          serviceImpl.sessionClose((io.bloombox.schema.services.pos.v1beta1.CloseSession.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.CloseSession.Response>) responseObserver);
          break;
        case METHODID_TICKET_OPEN:
          serviceImpl.ticketOpen((io.bloombox.schema.services.pos.v1beta1.OpenTicket.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.OpenTicket.Response>) responseObserver);
          break;
        case METHODID_TICKET_SAVE:
          serviceImpl.ticketSave((io.bloombox.schema.services.pos.v1beta1.SaveTicket.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.SaveTicket.Response>) responseObserver);
          break;
        case METHODID_TICKET_LOAD:
          serviceImpl.ticketLoad((io.bloombox.schema.services.pos.v1beta1.LoadTicket.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.LoadTicket.Response>) responseObserver);
          break;
        case METHODID_TICKET_VOID:
          serviceImpl.ticketVoid((io.bloombox.schema.services.pos.v1beta1.VoidTicket.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.VoidTicket.Response>) responseObserver);
          break;
        case METHODID_TICKET_CLAIM:
          serviceImpl.ticketClaim((io.bloombox.schema.services.pos.v1beta1.ClaimTicket.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.ClaimTicket.Response>) responseObserver);
          break;
        case METHODID_TICKET_CLONE:
          serviceImpl.ticketClone((io.bloombox.schema.services.pos.v1beta1.CloneTicket.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.CloneTicket.Response>) responseObserver);
          break;
        case METHODID_TICKET_FINALIZE:
          serviceImpl.ticketFinalize((io.bloombox.schema.services.pos.v1beta1.FinalizeTicket.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.FinalizeTicket.Response>) responseObserver);
          break;
        case METHODID_SEARCH_MEMBERS:
          serviceImpl.searchMembers((io.bloombox.schema.services.pos.v1beta1.MemberSearch.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.MemberSearch.Response>) responseObserver);
          break;
        case METHODID_INVENTORY_RETRIEVE:
          serviceImpl.inventoryRetrieve((io.bloombox.schema.services.pos.v1beta1.InventoryQuery.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.InventoryQuery.Response>) responseObserver);
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
        case METHODID_INVENTORY_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.inventoryStream(
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.InventoryStream.Payload>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class PointOfSaleDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.bloombox.schema.services.pos.v1beta1.POSServiceBeta1.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PointOfSaleGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PointOfSaleDescriptorSupplier())
              .addMethod(METHOD_AUTHORIZE)
              .addMethod(METHOD_SESSION_OPEN)
              .addMethod(METHOD_SESSION_CLOSE)
              .addMethod(METHOD_TICKET_OPEN)
              .addMethod(METHOD_TICKET_SAVE)
              .addMethod(METHOD_TICKET_LOAD)
              .addMethod(METHOD_TICKET_VOID)
              .addMethod(METHOD_TICKET_CLAIM)
              .addMethod(METHOD_TICKET_CLONE)
              .addMethod(METHOD_TICKET_FINALIZE)
              .addMethod(METHOD_SEARCH_MEMBERS)
              .addMethod(METHOD_INVENTORY_RETRIEVE)
              .addMethod(METHOD_INVENTORY_STREAM)
              .build();
        }
      }
    }
    return result;
  }
}
