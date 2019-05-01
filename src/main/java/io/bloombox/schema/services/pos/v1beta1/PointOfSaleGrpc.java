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

package io.bloombox.schema.services.pos.v1beta1;

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
 * Service providing backing functionality to physical sales via managed point-of-sale cash register devices, co-located
 * at partner locations. Sales in this context refer to transactions in a retail context, between a licensed cannabis
 * vendor (with a retail permit) and a licensed cannabis consumer, with the transaction occurring pursuant to some
 * medical or adult-use cannabis licensure and regulatory body.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: pos/v1beta1/POSService_Beta1.proto")
public final class PointOfSaleGrpc {

  private PointOfSaleGrpc() {}

  public static final String SERVICE_NAME = "bloombox.services.pos.v1beta1.PointOfSale";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.AuthorizeUser.Request,
      io.bloombox.schema.services.pos.v1beta1.AuthorizeUser.Response> getAuthorizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Authorize",
      requestType = io.bloombox.schema.services.pos.v1beta1.AuthorizeUser.Request.class,
      responseType = io.bloombox.schema.services.pos.v1beta1.AuthorizeUser.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.AuthorizeUser.Request,
      io.bloombox.schema.services.pos.v1beta1.AuthorizeUser.Response> getAuthorizeMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.AuthorizeUser.Request, io.bloombox.schema.services.pos.v1beta1.AuthorizeUser.Response> getAuthorizeMethod;
    if ((getAuthorizeMethod = PointOfSaleGrpc.getAuthorizeMethod) == null) {
      synchronized (PointOfSaleGrpc.class) {
        if ((getAuthorizeMethod = PointOfSaleGrpc.getAuthorizeMethod) == null) {
          PointOfSaleGrpc.getAuthorizeMethod = getAuthorizeMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.pos.v1beta1.AuthorizeUser.Request, io.bloombox.schema.services.pos.v1beta1.AuthorizeUser.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.pos.v1beta1.PointOfSale", "Authorize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.pos.v1beta1.AuthorizeUser.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.pos.v1beta1.AuthorizeUser.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new PointOfSaleMethodDescriptorSupplier("Authorize"))
                  .build();
          }
        }
     }
     return getAuthorizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.OpenSession.Request,
      io.bloombox.schema.services.pos.v1beta1.OpenSession.Response> getSessionOpenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SessionOpen",
      requestType = io.bloombox.schema.services.pos.v1beta1.OpenSession.Request.class,
      responseType = io.bloombox.schema.services.pos.v1beta1.OpenSession.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.OpenSession.Request,
      io.bloombox.schema.services.pos.v1beta1.OpenSession.Response> getSessionOpenMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.OpenSession.Request, io.bloombox.schema.services.pos.v1beta1.OpenSession.Response> getSessionOpenMethod;
    if ((getSessionOpenMethod = PointOfSaleGrpc.getSessionOpenMethod) == null) {
      synchronized (PointOfSaleGrpc.class) {
        if ((getSessionOpenMethod = PointOfSaleGrpc.getSessionOpenMethod) == null) {
          PointOfSaleGrpc.getSessionOpenMethod = getSessionOpenMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.pos.v1beta1.OpenSession.Request, io.bloombox.schema.services.pos.v1beta1.OpenSession.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.pos.v1beta1.PointOfSale", "SessionOpen"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.pos.v1beta1.OpenSession.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.pos.v1beta1.OpenSession.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new PointOfSaleMethodDescriptorSupplier("SessionOpen"))
                  .build();
          }
        }
     }
     return getSessionOpenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.CloseSession.Request,
      io.bloombox.schema.services.pos.v1beta1.CloseSession.Response> getSessionCloseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SessionClose",
      requestType = io.bloombox.schema.services.pos.v1beta1.CloseSession.Request.class,
      responseType = io.bloombox.schema.services.pos.v1beta1.CloseSession.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.CloseSession.Request,
      io.bloombox.schema.services.pos.v1beta1.CloseSession.Response> getSessionCloseMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.CloseSession.Request, io.bloombox.schema.services.pos.v1beta1.CloseSession.Response> getSessionCloseMethod;
    if ((getSessionCloseMethod = PointOfSaleGrpc.getSessionCloseMethod) == null) {
      synchronized (PointOfSaleGrpc.class) {
        if ((getSessionCloseMethod = PointOfSaleGrpc.getSessionCloseMethod) == null) {
          PointOfSaleGrpc.getSessionCloseMethod = getSessionCloseMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.pos.v1beta1.CloseSession.Request, io.bloombox.schema.services.pos.v1beta1.CloseSession.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.pos.v1beta1.PointOfSale", "SessionClose"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.pos.v1beta1.CloseSession.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.pos.v1beta1.CloseSession.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new PointOfSaleMethodDescriptorSupplier("SessionClose"))
                  .build();
          }
        }
     }
     return getSessionCloseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.OpenTicket.Request,
      io.bloombox.schema.services.pos.v1beta1.OpenTicket.Response> getTicketOpenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TicketOpen",
      requestType = io.bloombox.schema.services.pos.v1beta1.OpenTicket.Request.class,
      responseType = io.bloombox.schema.services.pos.v1beta1.OpenTicket.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.OpenTicket.Request,
      io.bloombox.schema.services.pos.v1beta1.OpenTicket.Response> getTicketOpenMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.OpenTicket.Request, io.bloombox.schema.services.pos.v1beta1.OpenTicket.Response> getTicketOpenMethod;
    if ((getTicketOpenMethod = PointOfSaleGrpc.getTicketOpenMethod) == null) {
      synchronized (PointOfSaleGrpc.class) {
        if ((getTicketOpenMethod = PointOfSaleGrpc.getTicketOpenMethod) == null) {
          PointOfSaleGrpc.getTicketOpenMethod = getTicketOpenMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.pos.v1beta1.OpenTicket.Request, io.bloombox.schema.services.pos.v1beta1.OpenTicket.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.pos.v1beta1.PointOfSale", "TicketOpen"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.pos.v1beta1.OpenTicket.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.pos.v1beta1.OpenTicket.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new PointOfSaleMethodDescriptorSupplier("TicketOpen"))
                  .build();
          }
        }
     }
     return getTicketOpenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.SaveTicket.Request,
      io.bloombox.schema.services.pos.v1beta1.SaveTicket.Response> getTicketSaveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TicketSave",
      requestType = io.bloombox.schema.services.pos.v1beta1.SaveTicket.Request.class,
      responseType = io.bloombox.schema.services.pos.v1beta1.SaveTicket.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.SaveTicket.Request,
      io.bloombox.schema.services.pos.v1beta1.SaveTicket.Response> getTicketSaveMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.SaveTicket.Request, io.bloombox.schema.services.pos.v1beta1.SaveTicket.Response> getTicketSaveMethod;
    if ((getTicketSaveMethod = PointOfSaleGrpc.getTicketSaveMethod) == null) {
      synchronized (PointOfSaleGrpc.class) {
        if ((getTicketSaveMethod = PointOfSaleGrpc.getTicketSaveMethod) == null) {
          PointOfSaleGrpc.getTicketSaveMethod = getTicketSaveMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.pos.v1beta1.SaveTicket.Request, io.bloombox.schema.services.pos.v1beta1.SaveTicket.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.pos.v1beta1.PointOfSale", "TicketSave"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.pos.v1beta1.SaveTicket.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.pos.v1beta1.SaveTicket.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new PointOfSaleMethodDescriptorSupplier("TicketSave"))
                  .build();
          }
        }
     }
     return getTicketSaveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.LoadTicket.Request,
      io.bloombox.schema.services.pos.v1beta1.LoadTicket.Response> getTicketLoadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TicketLoad",
      requestType = io.bloombox.schema.services.pos.v1beta1.LoadTicket.Request.class,
      responseType = io.bloombox.schema.services.pos.v1beta1.LoadTicket.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.LoadTicket.Request,
      io.bloombox.schema.services.pos.v1beta1.LoadTicket.Response> getTicketLoadMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.LoadTicket.Request, io.bloombox.schema.services.pos.v1beta1.LoadTicket.Response> getTicketLoadMethod;
    if ((getTicketLoadMethod = PointOfSaleGrpc.getTicketLoadMethod) == null) {
      synchronized (PointOfSaleGrpc.class) {
        if ((getTicketLoadMethod = PointOfSaleGrpc.getTicketLoadMethod) == null) {
          PointOfSaleGrpc.getTicketLoadMethod = getTicketLoadMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.pos.v1beta1.LoadTicket.Request, io.bloombox.schema.services.pos.v1beta1.LoadTicket.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.pos.v1beta1.PointOfSale", "TicketLoad"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.pos.v1beta1.LoadTicket.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.pos.v1beta1.LoadTicket.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new PointOfSaleMethodDescriptorSupplier("TicketLoad"))
                  .build();
          }
        }
     }
     return getTicketLoadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.VoidTicket.Request,
      io.bloombox.schema.services.pos.v1beta1.VoidTicket.Response> getTicketVoidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TicketVoid",
      requestType = io.bloombox.schema.services.pos.v1beta1.VoidTicket.Request.class,
      responseType = io.bloombox.schema.services.pos.v1beta1.VoidTicket.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.VoidTicket.Request,
      io.bloombox.schema.services.pos.v1beta1.VoidTicket.Response> getTicketVoidMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.VoidTicket.Request, io.bloombox.schema.services.pos.v1beta1.VoidTicket.Response> getTicketVoidMethod;
    if ((getTicketVoidMethod = PointOfSaleGrpc.getTicketVoidMethod) == null) {
      synchronized (PointOfSaleGrpc.class) {
        if ((getTicketVoidMethod = PointOfSaleGrpc.getTicketVoidMethod) == null) {
          PointOfSaleGrpc.getTicketVoidMethod = getTicketVoidMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.pos.v1beta1.VoidTicket.Request, io.bloombox.schema.services.pos.v1beta1.VoidTicket.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.pos.v1beta1.PointOfSale", "TicketVoid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.pos.v1beta1.VoidTicket.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.pos.v1beta1.VoidTicket.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new PointOfSaleMethodDescriptorSupplier("TicketVoid"))
                  .build();
          }
        }
     }
     return getTicketVoidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.ClaimTicket.Request,
      io.bloombox.schema.services.pos.v1beta1.ClaimTicket.Response> getTicketClaimMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TicketClaim",
      requestType = io.bloombox.schema.services.pos.v1beta1.ClaimTicket.Request.class,
      responseType = io.bloombox.schema.services.pos.v1beta1.ClaimTicket.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.ClaimTicket.Request,
      io.bloombox.schema.services.pos.v1beta1.ClaimTicket.Response> getTicketClaimMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.ClaimTicket.Request, io.bloombox.schema.services.pos.v1beta1.ClaimTicket.Response> getTicketClaimMethod;
    if ((getTicketClaimMethod = PointOfSaleGrpc.getTicketClaimMethod) == null) {
      synchronized (PointOfSaleGrpc.class) {
        if ((getTicketClaimMethod = PointOfSaleGrpc.getTicketClaimMethod) == null) {
          PointOfSaleGrpc.getTicketClaimMethod = getTicketClaimMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.pos.v1beta1.ClaimTicket.Request, io.bloombox.schema.services.pos.v1beta1.ClaimTicket.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.pos.v1beta1.PointOfSale", "TicketClaim"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.pos.v1beta1.ClaimTicket.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.pos.v1beta1.ClaimTicket.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new PointOfSaleMethodDescriptorSupplier("TicketClaim"))
                  .build();
          }
        }
     }
     return getTicketClaimMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.CloneTicket.Request,
      io.bloombox.schema.services.pos.v1beta1.CloneTicket.Response> getTicketCloneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TicketClone",
      requestType = io.bloombox.schema.services.pos.v1beta1.CloneTicket.Request.class,
      responseType = io.bloombox.schema.services.pos.v1beta1.CloneTicket.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.CloneTicket.Request,
      io.bloombox.schema.services.pos.v1beta1.CloneTicket.Response> getTicketCloneMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.CloneTicket.Request, io.bloombox.schema.services.pos.v1beta1.CloneTicket.Response> getTicketCloneMethod;
    if ((getTicketCloneMethod = PointOfSaleGrpc.getTicketCloneMethod) == null) {
      synchronized (PointOfSaleGrpc.class) {
        if ((getTicketCloneMethod = PointOfSaleGrpc.getTicketCloneMethod) == null) {
          PointOfSaleGrpc.getTicketCloneMethod = getTicketCloneMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.pos.v1beta1.CloneTicket.Request, io.bloombox.schema.services.pos.v1beta1.CloneTicket.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.pos.v1beta1.PointOfSale", "TicketClone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.pos.v1beta1.CloneTicket.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.pos.v1beta1.CloneTicket.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new PointOfSaleMethodDescriptorSupplier("TicketClone"))
                  .build();
          }
        }
     }
     return getTicketCloneMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.FinalizeTicket.Request,
      io.bloombox.schema.services.pos.v1beta1.FinalizeTicket.Response> getTicketFinalizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TicketFinalize",
      requestType = io.bloombox.schema.services.pos.v1beta1.FinalizeTicket.Request.class,
      responseType = io.bloombox.schema.services.pos.v1beta1.FinalizeTicket.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.FinalizeTicket.Request,
      io.bloombox.schema.services.pos.v1beta1.FinalizeTicket.Response> getTicketFinalizeMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.FinalizeTicket.Request, io.bloombox.schema.services.pos.v1beta1.FinalizeTicket.Response> getTicketFinalizeMethod;
    if ((getTicketFinalizeMethod = PointOfSaleGrpc.getTicketFinalizeMethod) == null) {
      synchronized (PointOfSaleGrpc.class) {
        if ((getTicketFinalizeMethod = PointOfSaleGrpc.getTicketFinalizeMethod) == null) {
          PointOfSaleGrpc.getTicketFinalizeMethod = getTicketFinalizeMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.pos.v1beta1.FinalizeTicket.Request, io.bloombox.schema.services.pos.v1beta1.FinalizeTicket.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.pos.v1beta1.PointOfSale", "TicketFinalize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.pos.v1beta1.FinalizeTicket.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.pos.v1beta1.FinalizeTicket.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new PointOfSaleMethodDescriptorSupplier("TicketFinalize"))
                  .build();
          }
        }
     }
     return getTicketFinalizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.MemberSearch.Request,
      io.bloombox.schema.services.pos.v1beta1.MemberSearch.Response> getSearchMembersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchMembers",
      requestType = io.bloombox.schema.services.pos.v1beta1.MemberSearch.Request.class,
      responseType = io.bloombox.schema.services.pos.v1beta1.MemberSearch.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.MemberSearch.Request,
      io.bloombox.schema.services.pos.v1beta1.MemberSearch.Response> getSearchMembersMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.MemberSearch.Request, io.bloombox.schema.services.pos.v1beta1.MemberSearch.Response> getSearchMembersMethod;
    if ((getSearchMembersMethod = PointOfSaleGrpc.getSearchMembersMethod) == null) {
      synchronized (PointOfSaleGrpc.class) {
        if ((getSearchMembersMethod = PointOfSaleGrpc.getSearchMembersMethod) == null) {
          PointOfSaleGrpc.getSearchMembersMethod = getSearchMembersMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.pos.v1beta1.MemberSearch.Request, io.bloombox.schema.services.pos.v1beta1.MemberSearch.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.pos.v1beta1.PointOfSale", "SearchMembers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.pos.v1beta1.MemberSearch.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.pos.v1beta1.MemberSearch.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new PointOfSaleMethodDescriptorSupplier("SearchMembers"))
                  .build();
          }
        }
     }
     return getSearchMembersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.InventoryQuery.Request,
      io.bloombox.schema.services.pos.v1beta1.InventoryQuery.Response> getInventoryRetrieveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InventoryRetrieve",
      requestType = io.bloombox.schema.services.pos.v1beta1.InventoryQuery.Request.class,
      responseType = io.bloombox.schema.services.pos.v1beta1.InventoryQuery.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.InventoryQuery.Request,
      io.bloombox.schema.services.pos.v1beta1.InventoryQuery.Response> getInventoryRetrieveMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.InventoryQuery.Request, io.bloombox.schema.services.pos.v1beta1.InventoryQuery.Response> getInventoryRetrieveMethod;
    if ((getInventoryRetrieveMethod = PointOfSaleGrpc.getInventoryRetrieveMethod) == null) {
      synchronized (PointOfSaleGrpc.class) {
        if ((getInventoryRetrieveMethod = PointOfSaleGrpc.getInventoryRetrieveMethod) == null) {
          PointOfSaleGrpc.getInventoryRetrieveMethod = getInventoryRetrieveMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.pos.v1beta1.InventoryQuery.Request, io.bloombox.schema.services.pos.v1beta1.InventoryQuery.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.pos.v1beta1.PointOfSale", "InventoryRetrieve"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.pos.v1beta1.InventoryQuery.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.pos.v1beta1.InventoryQuery.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new PointOfSaleMethodDescriptorSupplier("InventoryRetrieve"))
                  .build();
          }
        }
     }
     return getInventoryRetrieveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.InventoryStream.Request,
      io.bloombox.schema.services.pos.v1beta1.InventoryStream.Payload> getInventoryStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InventoryStream",
      requestType = io.bloombox.schema.services.pos.v1beta1.InventoryStream.Request.class,
      responseType = io.bloombox.schema.services.pos.v1beta1.InventoryStream.Payload.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.InventoryStream.Request,
      io.bloombox.schema.services.pos.v1beta1.InventoryStream.Payload> getInventoryStreamMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.pos.v1beta1.InventoryStream.Request, io.bloombox.schema.services.pos.v1beta1.InventoryStream.Payload> getInventoryStreamMethod;
    if ((getInventoryStreamMethod = PointOfSaleGrpc.getInventoryStreamMethod) == null) {
      synchronized (PointOfSaleGrpc.class) {
        if ((getInventoryStreamMethod = PointOfSaleGrpc.getInventoryStreamMethod) == null) {
          PointOfSaleGrpc.getInventoryStreamMethod = getInventoryStreamMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.pos.v1beta1.InventoryStream.Request, io.bloombox.schema.services.pos.v1beta1.InventoryStream.Payload>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.pos.v1beta1.PointOfSale", "InventoryStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.pos.v1beta1.InventoryStream.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.pos.v1beta1.InventoryStream.Payload.getDefaultInstance()))
                  .setSchemaDescriptor(new PointOfSaleMethodDescriptorSupplier("InventoryStream"))
                  .build();
          }
        }
     }
     return getInventoryStreamMethod;
  }

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
      asyncUnimplementedUnaryCall(getAuthorizeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Open an established point-of-sale session, to begin accepting transactions.
     * </pre>
     */
    public void sessionOpen(io.bloombox.schema.services.pos.v1beta1.OpenSession.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.OpenSession.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getSessionOpenMethod(), responseObserver);
    }

    /**
     * <pre>
     * Close an open point-of-sale session, usually at the end of a working shift.
     * </pre>
     */
    public void sessionClose(io.bloombox.schema.services.pos.v1beta1.CloseSession.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.CloseSession.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getSessionCloseMethod(), responseObserver);
    }

    /**
     * <pre>
     * Open a new or existing purchase ticket for read/write access.
     * </pre>
     */
    public void ticketOpen(io.bloombox.schema.services.pos.v1beta1.OpenTicket.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.OpenTicket.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getTicketOpenMethod(), responseObserver);
    }

    /**
     * <pre>
     * Save a purchase ticket for later recall.
     * </pre>
     */
    public void ticketSave(io.bloombox.schema.services.pos.v1beta1.SaveTicket.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.SaveTicket.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getTicketSaveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Load an existing purchase ticket for read-only access.
     * </pre>
     */
    public void ticketLoad(io.bloombox.schema.services.pos.v1beta1.LoadTicket.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.LoadTicket.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getTicketLoadMethod(), responseObserver);
    }

    /**
     * <pre>
     * Void (cancel) an existing, open purchase ticket.
     * </pre>
     */
    public void ticketVoid(io.bloombox.schema.services.pos.v1beta1.VoidTicket.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.VoidTicket.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getTicketVoidMethod(), responseObserver);
    }

    /**
     * <pre>
     * Claim an existing, open purchase ticket.
     * </pre>
     */
    public void ticketClaim(io.bloombox.schema.services.pos.v1beta1.ClaimTicket.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.ClaimTicket.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getTicketClaimMethod(), responseObserver);
    }

    /**
     * <pre>
     * Clone an existing, open purchase ticket.
     * </pre>
     */
    public void ticketClone(io.bloombox.schema.services.pos.v1beta1.CloneTicket.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.CloneTicket.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getTicketCloneMethod(), responseObserver);
    }

    /**
     * <pre>
     * Finalize an existing, open purchase ticket.
     * </pre>
     */
    public void ticketFinalize(io.bloombox.schema.services.pos.v1beta1.FinalizeTicket.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.FinalizeTicket.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getTicketFinalizeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Perform a search across retail consumer memberships.
     * </pre>
     */
    public void searchMembers(io.bloombox.schema.services.pos.v1beta1.MemberSearch.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.MemberSearch.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchMembersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve inventory items.
     * </pre>
     */
    public void inventoryRetrieve(io.bloombox.schema.services.pos.v1beta1.InventoryQuery.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.InventoryQuery.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getInventoryRetrieveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Establish an inventory stream.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.InventoryStream.Request> inventoryStream(
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.InventoryStream.Payload> responseObserver) {
      return asyncUnimplementedStreamingCall(getInventoryStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAuthorizeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.pos.v1beta1.AuthorizeUser.Request,
                io.bloombox.schema.services.pos.v1beta1.AuthorizeUser.Response>(
                  this, METHODID_AUTHORIZE)))
          .addMethod(
            getSessionOpenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.pos.v1beta1.OpenSession.Request,
                io.bloombox.schema.services.pos.v1beta1.OpenSession.Response>(
                  this, METHODID_SESSION_OPEN)))
          .addMethod(
            getSessionCloseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.pos.v1beta1.CloseSession.Request,
                io.bloombox.schema.services.pos.v1beta1.CloseSession.Response>(
                  this, METHODID_SESSION_CLOSE)))
          .addMethod(
            getTicketOpenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.pos.v1beta1.OpenTicket.Request,
                io.bloombox.schema.services.pos.v1beta1.OpenTicket.Response>(
                  this, METHODID_TICKET_OPEN)))
          .addMethod(
            getTicketSaveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.pos.v1beta1.SaveTicket.Request,
                io.bloombox.schema.services.pos.v1beta1.SaveTicket.Response>(
                  this, METHODID_TICKET_SAVE)))
          .addMethod(
            getTicketLoadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.pos.v1beta1.LoadTicket.Request,
                io.bloombox.schema.services.pos.v1beta1.LoadTicket.Response>(
                  this, METHODID_TICKET_LOAD)))
          .addMethod(
            getTicketVoidMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.pos.v1beta1.VoidTicket.Request,
                io.bloombox.schema.services.pos.v1beta1.VoidTicket.Response>(
                  this, METHODID_TICKET_VOID)))
          .addMethod(
            getTicketClaimMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.pos.v1beta1.ClaimTicket.Request,
                io.bloombox.schema.services.pos.v1beta1.ClaimTicket.Response>(
                  this, METHODID_TICKET_CLAIM)))
          .addMethod(
            getTicketCloneMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.pos.v1beta1.CloneTicket.Request,
                io.bloombox.schema.services.pos.v1beta1.CloneTicket.Response>(
                  this, METHODID_TICKET_CLONE)))
          .addMethod(
            getTicketFinalizeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.pos.v1beta1.FinalizeTicket.Request,
                io.bloombox.schema.services.pos.v1beta1.FinalizeTicket.Response>(
                  this, METHODID_TICKET_FINALIZE)))
          .addMethod(
            getSearchMembersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.pos.v1beta1.MemberSearch.Request,
                io.bloombox.schema.services.pos.v1beta1.MemberSearch.Response>(
                  this, METHODID_SEARCH_MEMBERS)))
          .addMethod(
            getInventoryRetrieveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.pos.v1beta1.InventoryQuery.Request,
                io.bloombox.schema.services.pos.v1beta1.InventoryQuery.Response>(
                  this, METHODID_INVENTORY_RETRIEVE)))
          .addMethod(
            getInventoryStreamMethod(),
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
          getChannel().newCall(getAuthorizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Open an established point-of-sale session, to begin accepting transactions.
     * </pre>
     */
    public void sessionOpen(io.bloombox.schema.services.pos.v1beta1.OpenSession.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.OpenSession.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSessionOpenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Close an open point-of-sale session, usually at the end of a working shift.
     * </pre>
     */
    public void sessionClose(io.bloombox.schema.services.pos.v1beta1.CloseSession.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.CloseSession.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSessionCloseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Open a new or existing purchase ticket for read/write access.
     * </pre>
     */
    public void ticketOpen(io.bloombox.schema.services.pos.v1beta1.OpenTicket.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.OpenTicket.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTicketOpenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Save a purchase ticket for later recall.
     * </pre>
     */
    public void ticketSave(io.bloombox.schema.services.pos.v1beta1.SaveTicket.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.SaveTicket.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTicketSaveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Load an existing purchase ticket for read-only access.
     * </pre>
     */
    public void ticketLoad(io.bloombox.schema.services.pos.v1beta1.LoadTicket.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.LoadTicket.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTicketLoadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Void (cancel) an existing, open purchase ticket.
     * </pre>
     */
    public void ticketVoid(io.bloombox.schema.services.pos.v1beta1.VoidTicket.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.VoidTicket.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTicketVoidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Claim an existing, open purchase ticket.
     * </pre>
     */
    public void ticketClaim(io.bloombox.schema.services.pos.v1beta1.ClaimTicket.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.ClaimTicket.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTicketClaimMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Clone an existing, open purchase ticket.
     * </pre>
     */
    public void ticketClone(io.bloombox.schema.services.pos.v1beta1.CloneTicket.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.CloneTicket.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTicketCloneMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Finalize an existing, open purchase ticket.
     * </pre>
     */
    public void ticketFinalize(io.bloombox.schema.services.pos.v1beta1.FinalizeTicket.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.FinalizeTicket.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTicketFinalizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Perform a search across retail consumer memberships.
     * </pre>
     */
    public void searchMembers(io.bloombox.schema.services.pos.v1beta1.MemberSearch.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.MemberSearch.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchMembersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve inventory items.
     * </pre>
     */
    public void inventoryRetrieve(io.bloombox.schema.services.pos.v1beta1.InventoryQuery.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.InventoryQuery.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInventoryRetrieveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Establish an inventory stream.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.InventoryStream.Request> inventoryStream(
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.pos.v1beta1.InventoryStream.Payload> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getInventoryStreamMethod(), getCallOptions()), responseObserver);
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
          getChannel(), getAuthorizeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Open an established point-of-sale session, to begin accepting transactions.
     * </pre>
     */
    public io.bloombox.schema.services.pos.v1beta1.OpenSession.Response sessionOpen(io.bloombox.schema.services.pos.v1beta1.OpenSession.Request request) {
      return blockingUnaryCall(
          getChannel(), getSessionOpenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Close an open point-of-sale session, usually at the end of a working shift.
     * </pre>
     */
    public io.bloombox.schema.services.pos.v1beta1.CloseSession.Response sessionClose(io.bloombox.schema.services.pos.v1beta1.CloseSession.Request request) {
      return blockingUnaryCall(
          getChannel(), getSessionCloseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Open a new or existing purchase ticket for read/write access.
     * </pre>
     */
    public io.bloombox.schema.services.pos.v1beta1.OpenTicket.Response ticketOpen(io.bloombox.schema.services.pos.v1beta1.OpenTicket.Request request) {
      return blockingUnaryCall(
          getChannel(), getTicketOpenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Save a purchase ticket for later recall.
     * </pre>
     */
    public io.bloombox.schema.services.pos.v1beta1.SaveTicket.Response ticketSave(io.bloombox.schema.services.pos.v1beta1.SaveTicket.Request request) {
      return blockingUnaryCall(
          getChannel(), getTicketSaveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Load an existing purchase ticket for read-only access.
     * </pre>
     */
    public io.bloombox.schema.services.pos.v1beta1.LoadTicket.Response ticketLoad(io.bloombox.schema.services.pos.v1beta1.LoadTicket.Request request) {
      return blockingUnaryCall(
          getChannel(), getTicketLoadMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Void (cancel) an existing, open purchase ticket.
     * </pre>
     */
    public io.bloombox.schema.services.pos.v1beta1.VoidTicket.Response ticketVoid(io.bloombox.schema.services.pos.v1beta1.VoidTicket.Request request) {
      return blockingUnaryCall(
          getChannel(), getTicketVoidMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Claim an existing, open purchase ticket.
     * </pre>
     */
    public io.bloombox.schema.services.pos.v1beta1.ClaimTicket.Response ticketClaim(io.bloombox.schema.services.pos.v1beta1.ClaimTicket.Request request) {
      return blockingUnaryCall(
          getChannel(), getTicketClaimMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Clone an existing, open purchase ticket.
     * </pre>
     */
    public io.bloombox.schema.services.pos.v1beta1.CloneTicket.Response ticketClone(io.bloombox.schema.services.pos.v1beta1.CloneTicket.Request request) {
      return blockingUnaryCall(
          getChannel(), getTicketCloneMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Finalize an existing, open purchase ticket.
     * </pre>
     */
    public io.bloombox.schema.services.pos.v1beta1.FinalizeTicket.Response ticketFinalize(io.bloombox.schema.services.pos.v1beta1.FinalizeTicket.Request request) {
      return blockingUnaryCall(
          getChannel(), getTicketFinalizeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Perform a search across retail consumer memberships.
     * </pre>
     */
    public io.bloombox.schema.services.pos.v1beta1.MemberSearch.Response searchMembers(io.bloombox.schema.services.pos.v1beta1.MemberSearch.Request request) {
      return blockingUnaryCall(
          getChannel(), getSearchMembersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve inventory items.
     * </pre>
     */
    public io.bloombox.schema.services.pos.v1beta1.InventoryQuery.Response inventoryRetrieve(io.bloombox.schema.services.pos.v1beta1.InventoryQuery.Request request) {
      return blockingUnaryCall(
          getChannel(), getInventoryRetrieveMethod(), getCallOptions(), request);
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
          getChannel().newCall(getAuthorizeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Open an established point-of-sale session, to begin accepting transactions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.pos.v1beta1.OpenSession.Response> sessionOpen(
        io.bloombox.schema.services.pos.v1beta1.OpenSession.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getSessionOpenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Close an open point-of-sale session, usually at the end of a working shift.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.pos.v1beta1.CloseSession.Response> sessionClose(
        io.bloombox.schema.services.pos.v1beta1.CloseSession.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getSessionCloseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Open a new or existing purchase ticket for read/write access.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.pos.v1beta1.OpenTicket.Response> ticketOpen(
        io.bloombox.schema.services.pos.v1beta1.OpenTicket.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getTicketOpenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Save a purchase ticket for later recall.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.pos.v1beta1.SaveTicket.Response> ticketSave(
        io.bloombox.schema.services.pos.v1beta1.SaveTicket.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getTicketSaveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Load an existing purchase ticket for read-only access.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.pos.v1beta1.LoadTicket.Response> ticketLoad(
        io.bloombox.schema.services.pos.v1beta1.LoadTicket.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getTicketLoadMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Void (cancel) an existing, open purchase ticket.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.pos.v1beta1.VoidTicket.Response> ticketVoid(
        io.bloombox.schema.services.pos.v1beta1.VoidTicket.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getTicketVoidMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Claim an existing, open purchase ticket.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.pos.v1beta1.ClaimTicket.Response> ticketClaim(
        io.bloombox.schema.services.pos.v1beta1.ClaimTicket.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getTicketClaimMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Clone an existing, open purchase ticket.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.pos.v1beta1.CloneTicket.Response> ticketClone(
        io.bloombox.schema.services.pos.v1beta1.CloneTicket.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getTicketCloneMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Finalize an existing, open purchase ticket.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.pos.v1beta1.FinalizeTicket.Response> ticketFinalize(
        io.bloombox.schema.services.pos.v1beta1.FinalizeTicket.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getTicketFinalizeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Perform a search across retail consumer memberships.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.pos.v1beta1.MemberSearch.Response> searchMembers(
        io.bloombox.schema.services.pos.v1beta1.MemberSearch.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchMembersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve inventory items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.pos.v1beta1.InventoryQuery.Response> inventoryRetrieve(
        io.bloombox.schema.services.pos.v1beta1.InventoryQuery.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getInventoryRetrieveMethod(), getCallOptions()), request);
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

  private static abstract class PointOfSaleBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PointOfSaleBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.bloombox.schema.services.pos.v1beta1.POSServiceBeta1.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PointOfSale");
    }
  }

  private static final class PointOfSaleFileDescriptorSupplier
      extends PointOfSaleBaseDescriptorSupplier {
    PointOfSaleFileDescriptorSupplier() {}
  }

  private static final class PointOfSaleMethodDescriptorSupplier
      extends PointOfSaleBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PointOfSaleMethodDescriptorSupplier(String methodName) {
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
      synchronized (PointOfSaleGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PointOfSaleFileDescriptorSupplier())
              .addMethod(getAuthorizeMethod())
              .addMethod(getSessionOpenMethod())
              .addMethod(getSessionCloseMethod())
              .addMethod(getTicketOpenMethod())
              .addMethod(getTicketSaveMethod())
              .addMethod(getTicketLoadMethod())
              .addMethod(getTicketVoidMethod())
              .addMethod(getTicketClaimMethod())
              .addMethod(getTicketCloneMethod())
              .addMethod(getTicketFinalizeMethod())
              .addMethod(getSearchMembersMethod())
              .addMethod(getInventoryRetrieveMethod())
              .addMethod(getInventoryStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
