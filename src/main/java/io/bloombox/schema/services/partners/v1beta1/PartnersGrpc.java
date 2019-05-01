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

package io.bloombox.schema.services.partners.v1beta1;

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
 * Specifies the partners service, which provides information about partner and location accounts.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: partners/v1beta1/PartnersService_Beta1.proto")
public final class PartnersGrpc {

  private PartnersGrpc() {}

  public static final String SERVICE_NAME = "bloombox.services.partners.v1beta1.Partners";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.partners.v1beta1.PartnerList.Request,
      io.bloombox.schema.services.partners.v1beta1.PartnerList.Response> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = io.bloombox.schema.services.partners.v1beta1.PartnerList.Request.class,
      responseType = io.bloombox.schema.services.partners.v1beta1.PartnerList.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.partners.v1beta1.PartnerList.Request,
      io.bloombox.schema.services.partners.v1beta1.PartnerList.Response> getListMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.partners.v1beta1.PartnerList.Request, io.bloombox.schema.services.partners.v1beta1.PartnerList.Response> getListMethod;
    if ((getListMethod = PartnersGrpc.getListMethod) == null) {
      synchronized (PartnersGrpc.class) {
        if ((getListMethod = PartnersGrpc.getListMethod) == null) {
          PartnersGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.partners.v1beta1.PartnerList.Request, io.bloombox.schema.services.partners.v1beta1.PartnerList.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.partners.v1beta1.Partners", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.partners.v1beta1.PartnerList.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.partners.v1beta1.PartnerList.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new PartnersMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.partners.v1beta1.PartnerGet.Request,
      io.bloombox.schema.services.partners.v1beta1.PartnerGet.Response> getRetrieveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Retrieve",
      requestType = io.bloombox.schema.services.partners.v1beta1.PartnerGet.Request.class,
      responseType = io.bloombox.schema.services.partners.v1beta1.PartnerGet.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.partners.v1beta1.PartnerGet.Request,
      io.bloombox.schema.services.partners.v1beta1.PartnerGet.Response> getRetrieveMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.partners.v1beta1.PartnerGet.Request, io.bloombox.schema.services.partners.v1beta1.PartnerGet.Response> getRetrieveMethod;
    if ((getRetrieveMethod = PartnersGrpc.getRetrieveMethod) == null) {
      synchronized (PartnersGrpc.class) {
        if ((getRetrieveMethod = PartnersGrpc.getRetrieveMethod) == null) {
          PartnersGrpc.getRetrieveMethod = getRetrieveMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.partners.v1beta1.PartnerGet.Request, io.bloombox.schema.services.partners.v1beta1.PartnerGet.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.partners.v1beta1.Partners", "Retrieve"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.partners.v1beta1.PartnerGet.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.partners.v1beta1.PartnerGet.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new PartnersMethodDescriptorSupplier("Retrieve"))
                  .build();
          }
        }
     }
     return getRetrieveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.partners.v1beta1.LocationList.Request,
      io.bloombox.schema.services.partners.v1beta1.LocationList.Response> getLocationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Locations",
      requestType = io.bloombox.schema.services.partners.v1beta1.LocationList.Request.class,
      responseType = io.bloombox.schema.services.partners.v1beta1.LocationList.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.partners.v1beta1.LocationList.Request,
      io.bloombox.schema.services.partners.v1beta1.LocationList.Response> getLocationsMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.partners.v1beta1.LocationList.Request, io.bloombox.schema.services.partners.v1beta1.LocationList.Response> getLocationsMethod;
    if ((getLocationsMethod = PartnersGrpc.getLocationsMethod) == null) {
      synchronized (PartnersGrpc.class) {
        if ((getLocationsMethod = PartnersGrpc.getLocationsMethod) == null) {
          PartnersGrpc.getLocationsMethod = getLocationsMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.partners.v1beta1.LocationList.Request, io.bloombox.schema.services.partners.v1beta1.LocationList.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.partners.v1beta1.Partners", "Locations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.partners.v1beta1.LocationList.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.partners.v1beta1.LocationList.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new PartnersMethodDescriptorSupplier("Locations"))
                  .build();
          }
        }
     }
     return getLocationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.partners.v1beta1.LocationGet.Request,
      io.bloombox.schema.services.partners.v1beta1.LocationGet.Response> getLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Location",
      requestType = io.bloombox.schema.services.partners.v1beta1.LocationGet.Request.class,
      responseType = io.bloombox.schema.services.partners.v1beta1.LocationGet.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.partners.v1beta1.LocationGet.Request,
      io.bloombox.schema.services.partners.v1beta1.LocationGet.Response> getLocationMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.partners.v1beta1.LocationGet.Request, io.bloombox.schema.services.partners.v1beta1.LocationGet.Response> getLocationMethod;
    if ((getLocationMethod = PartnersGrpc.getLocationMethod) == null) {
      synchronized (PartnersGrpc.class) {
        if ((getLocationMethod = PartnersGrpc.getLocationMethod) == null) {
          PartnersGrpc.getLocationMethod = getLocationMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.partners.v1beta1.LocationGet.Request, io.bloombox.schema.services.partners.v1beta1.LocationGet.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.partners.v1beta1.Partners", "Location"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.partners.v1beta1.LocationGet.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.partners.v1beta1.LocationGet.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new PartnersMethodDescriptorSupplier("Location"))
                  .build();
          }
        }
     }
     return getLocationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PartnersStub newStub(io.grpc.Channel channel) {
    return new PartnersStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PartnersBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PartnersBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PartnersFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PartnersFutureStub(channel);
  }

  /**
   * <pre>
   * Specifies the partners service, which provides information about partner and location accounts.
   * </pre>
   */
  public static abstract class PartnersImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List partners known to the system.
     * </pre>
     */
    public void list(io.bloombox.schema.services.partners.v1beta1.PartnerList.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.partners.v1beta1.PartnerList.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve an individual partner record.
     * </pre>
     */
    public void retrieve(io.bloombox.schema.services.partners.v1beta1.PartnerGet.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.partners.v1beta1.PartnerGet.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getRetrieveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve locations for an individual partner record.
     * </pre>
     */
    public void locations(io.bloombox.schema.services.partners.v1beta1.LocationList.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.partners.v1beta1.LocationList.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getLocationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve an individual partner location record.
     * </pre>
     */
    public void location(io.bloombox.schema.services.partners.v1beta1.LocationGet.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.partners.v1beta1.LocationGet.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getLocationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.partners.v1beta1.PartnerList.Request,
                io.bloombox.schema.services.partners.v1beta1.PartnerList.Response>(
                  this, METHODID_LIST)))
          .addMethod(
            getRetrieveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.partners.v1beta1.PartnerGet.Request,
                io.bloombox.schema.services.partners.v1beta1.PartnerGet.Response>(
                  this, METHODID_RETRIEVE)))
          .addMethod(
            getLocationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.partners.v1beta1.LocationList.Request,
                io.bloombox.schema.services.partners.v1beta1.LocationList.Response>(
                  this, METHODID_LOCATIONS)))
          .addMethod(
            getLocationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.partners.v1beta1.LocationGet.Request,
                io.bloombox.schema.services.partners.v1beta1.LocationGet.Response>(
                  this, METHODID_LOCATION)))
          .build();
    }
  }

  /**
   * <pre>
   * Specifies the partners service, which provides information about partner and location accounts.
   * </pre>
   */
  public static final class PartnersStub extends io.grpc.stub.AbstractStub<PartnersStub> {
    private PartnersStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PartnersStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PartnersStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PartnersStub(channel, callOptions);
    }

    /**
     * <pre>
     * List partners known to the system.
     * </pre>
     */
    public void list(io.bloombox.schema.services.partners.v1beta1.PartnerList.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.partners.v1beta1.PartnerList.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve an individual partner record.
     * </pre>
     */
    public void retrieve(io.bloombox.schema.services.partners.v1beta1.PartnerGet.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.partners.v1beta1.PartnerGet.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRetrieveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve locations for an individual partner record.
     * </pre>
     */
    public void locations(io.bloombox.schema.services.partners.v1beta1.LocationList.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.partners.v1beta1.LocationList.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLocationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve an individual partner location record.
     * </pre>
     */
    public void location(io.bloombox.schema.services.partners.v1beta1.LocationGet.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.partners.v1beta1.LocationGet.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLocationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Specifies the partners service, which provides information about partner and location accounts.
   * </pre>
   */
  public static final class PartnersBlockingStub extends io.grpc.stub.AbstractStub<PartnersBlockingStub> {
    private PartnersBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PartnersBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PartnersBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PartnersBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List partners known to the system.
     * </pre>
     */
    public io.bloombox.schema.services.partners.v1beta1.PartnerList.Response list(io.bloombox.schema.services.partners.v1beta1.PartnerList.Request request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve an individual partner record.
     * </pre>
     */
    public io.bloombox.schema.services.partners.v1beta1.PartnerGet.Response retrieve(io.bloombox.schema.services.partners.v1beta1.PartnerGet.Request request) {
      return blockingUnaryCall(
          getChannel(), getRetrieveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve locations for an individual partner record.
     * </pre>
     */
    public io.bloombox.schema.services.partners.v1beta1.LocationList.Response locations(io.bloombox.schema.services.partners.v1beta1.LocationList.Request request) {
      return blockingUnaryCall(
          getChannel(), getLocationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve an individual partner location record.
     * </pre>
     */
    public io.bloombox.schema.services.partners.v1beta1.LocationGet.Response location(io.bloombox.schema.services.partners.v1beta1.LocationGet.Request request) {
      return blockingUnaryCall(
          getChannel(), getLocationMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Specifies the partners service, which provides information about partner and location accounts.
   * </pre>
   */
  public static final class PartnersFutureStub extends io.grpc.stub.AbstractStub<PartnersFutureStub> {
    private PartnersFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PartnersFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PartnersFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PartnersFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List partners known to the system.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.partners.v1beta1.PartnerList.Response> list(
        io.bloombox.schema.services.partners.v1beta1.PartnerList.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve an individual partner record.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.partners.v1beta1.PartnerGet.Response> retrieve(
        io.bloombox.schema.services.partners.v1beta1.PartnerGet.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getRetrieveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve locations for an individual partner record.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.partners.v1beta1.LocationList.Response> locations(
        io.bloombox.schema.services.partners.v1beta1.LocationList.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getLocationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve an individual partner location record.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.partners.v1beta1.LocationGet.Response> location(
        io.bloombox.schema.services.partners.v1beta1.LocationGet.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getLocationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_RETRIEVE = 1;
  private static final int METHODID_LOCATIONS = 2;
  private static final int METHODID_LOCATION = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PartnersImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PartnersImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((io.bloombox.schema.services.partners.v1beta1.PartnerList.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.partners.v1beta1.PartnerList.Response>) responseObserver);
          break;
        case METHODID_RETRIEVE:
          serviceImpl.retrieve((io.bloombox.schema.services.partners.v1beta1.PartnerGet.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.partners.v1beta1.PartnerGet.Response>) responseObserver);
          break;
        case METHODID_LOCATIONS:
          serviceImpl.locations((io.bloombox.schema.services.partners.v1beta1.LocationList.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.partners.v1beta1.LocationList.Response>) responseObserver);
          break;
        case METHODID_LOCATION:
          serviceImpl.location((io.bloombox.schema.services.partners.v1beta1.LocationGet.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.partners.v1beta1.LocationGet.Response>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PartnersBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PartnersBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.bloombox.schema.services.partners.v1beta1.PartnersServiceBeta1.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Partners");
    }
  }

  private static final class PartnersFileDescriptorSupplier
      extends PartnersBaseDescriptorSupplier {
    PartnersFileDescriptorSupplier() {}
  }

  private static final class PartnersMethodDescriptorSupplier
      extends PartnersBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PartnersMethodDescriptorSupplier(String methodName) {
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
      synchronized (PartnersGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PartnersFileDescriptorSupplier())
              .addMethod(getListMethod())
              .addMethod(getRetrieveMethod())
              .addMethod(getLocationsMethod())
              .addMethod(getLocationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
