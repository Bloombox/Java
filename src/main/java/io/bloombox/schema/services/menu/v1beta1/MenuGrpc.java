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

package io.bloombox.schema.services.menu.v1beta1;

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
 * Specifies the menu service, which provides tools for consuming, updating, and subscribing to menu data.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.6.0-SNAPSHOT)",
    comments = "Source: menu/v1beta1/MenuService_Beta1.proto")
public final class MenuGrpc {

  private MenuGrpc() {}

  public static final String SERVICE_NAME = "bloombox.schema.services.menu.v1beta1.Menu";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.menu.v1beta1.Ping.Request,
      io.bloombox.schema.services.menu.v1beta1.Ping.Response> METHOD_PING =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.menu.v1beta1.Ping.Request, io.bloombox.schema.services.menu.v1beta1.Ping.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.menu.v1beta1.Menu", "Ping"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.menu.v1beta1.Ping.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.menu.v1beta1.Ping.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.menu.v1beta1.GetMenu.Request,
      io.bloombox.schema.services.menu.v1beta1.GetMenu.Response> METHOD_RETRIEVE =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.menu.v1beta1.GetMenu.Request, io.bloombox.schema.services.menu.v1beta1.GetMenu.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.menu.v1beta1.Menu", "Retrieve"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.menu.v1beta1.GetMenu.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.menu.v1beta1.GetMenu.Response.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MenuStub newStub(io.grpc.Channel channel) {
    return new MenuStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MenuBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MenuBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MenuFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MenuFutureStub(channel);
  }

  /**
   * <pre>
   * Specifies the menu service, which provides tools for consuming, updating, and subscribing to menu data.
   * </pre>
   */
  public static abstract class MenuImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Ping the menu service.
     * </pre>
     */
    public void ping(io.bloombox.schema.services.menu.v1beta1.Ping.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.menu.v1beta1.Ping.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PING, responseObserver);
    }

    /**
     * <pre>
     * Specifies an operation to read a full or sectioned menu.
     * </pre>
     */
    public void retrieve(io.bloombox.schema.services.menu.v1beta1.GetMenu.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.menu.v1beta1.GetMenu.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RETRIEVE, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_PING,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.menu.v1beta1.Ping.Request,
                io.bloombox.schema.services.menu.v1beta1.Ping.Response>(
                  this, METHODID_PING)))
          .addMethod(
            METHOD_RETRIEVE,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.menu.v1beta1.GetMenu.Request,
                io.bloombox.schema.services.menu.v1beta1.GetMenu.Response>(
                  this, METHODID_RETRIEVE)))
          .build();
    }
  }

  /**
   * <pre>
   * Specifies the menu service, which provides tools for consuming, updating, and subscribing to menu data.
   * </pre>
   */
  public static final class MenuStub extends io.grpc.stub.AbstractStub<MenuStub> {
    private MenuStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MenuStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MenuStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MenuStub(channel, callOptions);
    }

    /**
     * <pre>
     * Ping the menu service.
     * </pre>
     */
    public void ping(io.bloombox.schema.services.menu.v1beta1.Ping.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.menu.v1beta1.Ping.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PING, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Specifies an operation to read a full or sectioned menu.
     * </pre>
     */
    public void retrieve(io.bloombox.schema.services.menu.v1beta1.GetMenu.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.menu.v1beta1.GetMenu.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RETRIEVE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Specifies the menu service, which provides tools for consuming, updating, and subscribing to menu data.
   * </pre>
   */
  public static final class MenuBlockingStub extends io.grpc.stub.AbstractStub<MenuBlockingStub> {
    private MenuBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MenuBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MenuBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MenuBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Ping the menu service.
     * </pre>
     */
    public io.bloombox.schema.services.menu.v1beta1.Ping.Response ping(io.bloombox.schema.services.menu.v1beta1.Ping.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PING, getCallOptions(), request);
    }

    /**
     * <pre>
     * Specifies an operation to read a full or sectioned menu.
     * </pre>
     */
    public io.bloombox.schema.services.menu.v1beta1.GetMenu.Response retrieve(io.bloombox.schema.services.menu.v1beta1.GetMenu.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RETRIEVE, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Specifies the menu service, which provides tools for consuming, updating, and subscribing to menu data.
   * </pre>
   */
  public static final class MenuFutureStub extends io.grpc.stub.AbstractStub<MenuFutureStub> {
    private MenuFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MenuFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MenuFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MenuFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Ping the menu service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.menu.v1beta1.Ping.Response> ping(
        io.bloombox.schema.services.menu.v1beta1.Ping.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PING, getCallOptions()), request);
    }

    /**
     * <pre>
     * Specifies an operation to read a full or sectioned menu.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.menu.v1beta1.GetMenu.Response> retrieve(
        io.bloombox.schema.services.menu.v1beta1.GetMenu.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RETRIEVE, getCallOptions()), request);
    }
  }

  private static final int METHODID_PING = 0;
  private static final int METHODID_RETRIEVE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MenuImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MenuImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PING:
          serviceImpl.ping((io.bloombox.schema.services.menu.v1beta1.Ping.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.menu.v1beta1.Ping.Response>) responseObserver);
          break;
        case METHODID_RETRIEVE:
          serviceImpl.retrieve((io.bloombox.schema.services.menu.v1beta1.GetMenu.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.menu.v1beta1.GetMenu.Response>) responseObserver);
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

  private static final class MenuDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.bloombox.schema.services.menu.v1beta1.MenuServiceBeta1.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MenuGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MenuDescriptorSupplier())
              .addMethod(METHOD_PING)
              .addMethod(METHOD_RETRIEVE)
              .build();
        }
      }
    }
    return result;
  }
}
