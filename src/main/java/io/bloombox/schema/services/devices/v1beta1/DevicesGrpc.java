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

package io.bloombox.schema.services.devices.v1beta1;

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
 * Specifies the devices service, which enables managed devices to check-in, authorize themselves, and discover their
 * identity/role.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.6.0-SNAPSHOT)",
    comments = "Source: devices/v1beta1/DevicesService_Beta1.proto")
public final class DevicesGrpc {

  private DevicesGrpc() {}

  public static final String SERVICE_NAME = "services.devices.v1beta1.Devices";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.devices.v1beta1.Ping.Request,
      io.bloombox.schema.services.devices.v1beta1.Ping.Response> METHOD_PING =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.devices.v1beta1.Ping.Request, io.bloombox.schema.services.devices.v1beta1.Ping.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "services.devices.v1beta1.Devices", "Ping"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.devices.v1beta1.Ping.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.devices.v1beta1.Ping.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.devices.v1beta1.Activation.Request,
      io.bloombox.schema.services.devices.v1beta1.Activation.Response> METHOD_ACTIVATE =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.devices.v1beta1.Activation.Request, io.bloombox.schema.services.devices.v1beta1.Activation.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "services.devices.v1beta1.Devices", "Activate"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.devices.v1beta1.Activation.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.devices.v1beta1.Activation.Response.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DevicesStub newStub(io.grpc.Channel channel) {
    return new DevicesStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DevicesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DevicesBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DevicesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DevicesFutureStub(channel);
  }

  /**
   * <pre>
   * Specifies the devices service, which enables managed devices to check-in, authorize themselves, and discover their
   * identity/role.
   * </pre>
   */
  public static abstract class DevicesImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Ping the device server.
     * </pre>
     */
    public void ping(io.bloombox.schema.services.devices.v1beta1.Ping.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.devices.v1beta1.Ping.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PING, responseObserver);
    }

    /**
     * <pre>
     * Setup and enable a device for live use. If this is the first time the subject device has activated itself,
     * initialize or otherwise provision any requisite objects or resources.
     * </pre>
     */
    public void activate(io.bloombox.schema.services.devices.v1beta1.Activation.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.devices.v1beta1.Activation.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ACTIVATE, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_PING,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.devices.v1beta1.Ping.Request,
                io.bloombox.schema.services.devices.v1beta1.Ping.Response>(
                  this, METHODID_PING)))
          .addMethod(
            METHOD_ACTIVATE,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.devices.v1beta1.Activation.Request,
                io.bloombox.schema.services.devices.v1beta1.Activation.Response>(
                  this, METHODID_ACTIVATE)))
          .build();
    }
  }

  /**
   * <pre>
   * Specifies the devices service, which enables managed devices to check-in, authorize themselves, and discover their
   * identity/role.
   * </pre>
   */
  public static final class DevicesStub extends io.grpc.stub.AbstractStub<DevicesStub> {
    private DevicesStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DevicesStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DevicesStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DevicesStub(channel, callOptions);
    }

    /**
     * <pre>
     * Ping the device server.
     * </pre>
     */
    public void ping(io.bloombox.schema.services.devices.v1beta1.Ping.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.devices.v1beta1.Ping.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PING, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Setup and enable a device for live use. If this is the first time the subject device has activated itself,
     * initialize or otherwise provision any requisite objects or resources.
     * </pre>
     */
    public void activate(io.bloombox.schema.services.devices.v1beta1.Activation.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.devices.v1beta1.Activation.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ACTIVATE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Specifies the devices service, which enables managed devices to check-in, authorize themselves, and discover their
   * identity/role.
   * </pre>
   */
  public static final class DevicesBlockingStub extends io.grpc.stub.AbstractStub<DevicesBlockingStub> {
    private DevicesBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DevicesBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DevicesBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DevicesBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Ping the device server.
     * </pre>
     */
    public io.bloombox.schema.services.devices.v1beta1.Ping.Response ping(io.bloombox.schema.services.devices.v1beta1.Ping.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PING, getCallOptions(), request);
    }

    /**
     * <pre>
     * Setup and enable a device for live use. If this is the first time the subject device has activated itself,
     * initialize or otherwise provision any requisite objects or resources.
     * </pre>
     */
    public io.bloombox.schema.services.devices.v1beta1.Activation.Response activate(io.bloombox.schema.services.devices.v1beta1.Activation.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ACTIVATE, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Specifies the devices service, which enables managed devices to check-in, authorize themselves, and discover their
   * identity/role.
   * </pre>
   */
  public static final class DevicesFutureStub extends io.grpc.stub.AbstractStub<DevicesFutureStub> {
    private DevicesFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DevicesFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DevicesFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DevicesFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Ping the device server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.devices.v1beta1.Ping.Response> ping(
        io.bloombox.schema.services.devices.v1beta1.Ping.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PING, getCallOptions()), request);
    }

    /**
     * <pre>
     * Setup and enable a device for live use. If this is the first time the subject device has activated itself,
     * initialize or otherwise provision any requisite objects or resources.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.devices.v1beta1.Activation.Response> activate(
        io.bloombox.schema.services.devices.v1beta1.Activation.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ACTIVATE, getCallOptions()), request);
    }
  }

  private static final int METHODID_PING = 0;
  private static final int METHODID_ACTIVATE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DevicesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DevicesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PING:
          serviceImpl.ping((io.bloombox.schema.services.devices.v1beta1.Ping.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.devices.v1beta1.Ping.Response>) responseObserver);
          break;
        case METHODID_ACTIVATE:
          serviceImpl.activate((io.bloombox.schema.services.devices.v1beta1.Activation.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.devices.v1beta1.Activation.Response>) responseObserver);
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

  private static final class DevicesDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.bloombox.schema.services.devices.v1beta1.DevicesServiceBeta1.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DevicesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DevicesDescriptorSupplier())
              .addMethod(METHOD_PING)
              .addMethod(METHOD_ACTIVATE)
              .build();
        }
      }
    }
    return result;
  }
}
