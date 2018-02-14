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

package io.bloombox.schema.services.auth.v1beta1;

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
 * Specifies the Auth service, which is responsible for authenticating and authorizing users. It also provides limited
 * profile information for UI purposes.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.6.0-SNAPSHOT)",
    comments = "Source: auth/v1beta1/AuthService_Beta1.proto")
public final class AuthGrpc {

  private AuthGrpc() {}

  public static final String SERVICE_NAME = "bloombox.schema.services.auth.v1beta1.Auth";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.auth.v1beta1.Ping.Request,
      io.bloombox.schema.services.auth.v1beta1.Ping.Response> METHOD_PING =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.auth.v1beta1.Ping.Request, io.bloombox.schema.services.auth.v1beta1.Ping.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.auth.v1beta1.Auth", "Ping"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.auth.v1beta1.Ping.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.auth.v1beta1.Ping.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Request,
      io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Response> METHOD_AUTHENTICATE =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Request, io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.auth.v1beta1.Auth", "Authenticate"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Response.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthStub newStub(io.grpc.Channel channel) {
    return new AuthStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AuthBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AuthFutureStub(channel);
  }

  /**
   * <pre>
   * Specifies the Auth service, which is responsible for authenticating and authorizing users. It also provides limited
   * profile information for UI purposes.
   * </pre>
   */
  public static abstract class AuthImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Ping the auth server.
     * </pre>
     */
    public void ping(io.bloombox.schema.services.auth.v1beta1.Ping.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.Ping.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PING, responseObserver);
    }

    /**
     * <pre>
     * Authenticate an identity assertion of some kind from a user. Decide whether to grant them access to the subject
     * account.
     * </pre>
     */
    public void authenticate(io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_AUTHENTICATE, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_PING,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.auth.v1beta1.Ping.Request,
                io.bloombox.schema.services.auth.v1beta1.Ping.Response>(
                  this, METHODID_PING)))
          .addMethod(
            METHOD_AUTHENTICATE,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Request,
                io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Response>(
                  this, METHODID_AUTHENTICATE)))
          .build();
    }
  }

  /**
   * <pre>
   * Specifies the Auth service, which is responsible for authenticating and authorizing users. It also provides limited
   * profile information for UI purposes.
   * </pre>
   */
  public static final class AuthStub extends io.grpc.stub.AbstractStub<AuthStub> {
    private AuthStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthStub(channel, callOptions);
    }

    /**
     * <pre>
     * Ping the auth server.
     * </pre>
     */
    public void ping(io.bloombox.schema.services.auth.v1beta1.Ping.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.Ping.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PING, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Authenticate an identity assertion of some kind from a user. Decide whether to grant them access to the subject
     * account.
     * </pre>
     */
    public void authenticate(io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_AUTHENTICATE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Specifies the Auth service, which is responsible for authenticating and authorizing users. It also provides limited
   * profile information for UI purposes.
   * </pre>
   */
  public static final class AuthBlockingStub extends io.grpc.stub.AbstractStub<AuthBlockingStub> {
    private AuthBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Ping the auth server.
     * </pre>
     */
    public io.bloombox.schema.services.auth.v1beta1.Ping.Response ping(io.bloombox.schema.services.auth.v1beta1.Ping.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PING, getCallOptions(), request);
    }

    /**
     * <pre>
     * Authenticate an identity assertion of some kind from a user. Decide whether to grant them access to the subject
     * account.
     * </pre>
     */
    public io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Response authenticate(io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_AUTHENTICATE, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Specifies the Auth service, which is responsible for authenticating and authorizing users. It also provides limited
   * profile information for UI purposes.
   * </pre>
   */
  public static final class AuthFutureStub extends io.grpc.stub.AbstractStub<AuthFutureStub> {
    private AuthFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Ping the auth server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.auth.v1beta1.Ping.Response> ping(
        io.bloombox.schema.services.auth.v1beta1.Ping.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PING, getCallOptions()), request);
    }

    /**
     * <pre>
     * Authenticate an identity assertion of some kind from a user. Decide whether to grant them access to the subject
     * account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Response> authenticate(
        io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_AUTHENTICATE, getCallOptions()), request);
    }
  }

  private static final int METHODID_PING = 0;
  private static final int METHODID_AUTHENTICATE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AuthImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AuthImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PING:
          serviceImpl.ping((io.bloombox.schema.services.auth.v1beta1.Ping.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.Ping.Response>) responseObserver);
          break;
        case METHODID_AUTHENTICATE:
          serviceImpl.authenticate((io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Response>) responseObserver);
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

  private static final class AuthDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.bloombox.schema.services.auth.v1beta1.AuthServiceBeta1.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AuthGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthDescriptorSupplier())
              .addMethod(METHOD_PING)
              .addMethod(METHOD_AUTHENTICATE)
              .build();
        }
      }
    }
    return result;
  }
}
