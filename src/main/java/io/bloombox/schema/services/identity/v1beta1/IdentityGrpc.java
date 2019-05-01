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

package io.bloombox.schema.services.identity.v1beta1;

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
 * Provides a service that resolves raw public key material, from identifying information for a given key. If the
 * invoking code has the requisite access permissions, ownership information about the key may be provided.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: identity/v1beta1/IdentityService_Beta1.proto")
public final class IdentityGrpc {

  private IdentityGrpc() {}

  public static final String SERVICE_NAME = "bloombox.services.identity.v1beta1.Identity";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.identity.v1beta1.ResolveKey.Request,
      io.bloombox.schema.services.identity.v1beta1.ResolveKey.Response> getKeyResolveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "KeyResolve",
      requestType = io.bloombox.schema.services.identity.v1beta1.ResolveKey.Request.class,
      responseType = io.bloombox.schema.services.identity.v1beta1.ResolveKey.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.identity.v1beta1.ResolveKey.Request,
      io.bloombox.schema.services.identity.v1beta1.ResolveKey.Response> getKeyResolveMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.identity.v1beta1.ResolveKey.Request, io.bloombox.schema.services.identity.v1beta1.ResolveKey.Response> getKeyResolveMethod;
    if ((getKeyResolveMethod = IdentityGrpc.getKeyResolveMethod) == null) {
      synchronized (IdentityGrpc.class) {
        if ((getKeyResolveMethod = IdentityGrpc.getKeyResolveMethod) == null) {
          IdentityGrpc.getKeyResolveMethod = getKeyResolveMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.identity.v1beta1.ResolveKey.Request, io.bloombox.schema.services.identity.v1beta1.ResolveKey.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.identity.v1beta1.Identity", "KeyResolve"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.identity.v1beta1.ResolveKey.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.identity.v1beta1.ResolveKey.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new IdentityMethodDescriptorSupplier("KeyResolve"))
                  .build();
          }
        }
     }
     return getKeyResolveMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IdentityStub newStub(io.grpc.Channel channel) {
    return new IdentityStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IdentityBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new IdentityBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IdentityFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new IdentityFutureStub(channel);
  }

  /**
   * <pre>
   * Provides a service that resolves raw public key material, from identifying information for a given key. If the
   * invoking code has the requisite access permissions, ownership information about the key may be provided.
   * </pre>
   */
  public static abstract class IdentityImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Resolve public key material by the key's fingerprint or key ID.
     * </pre>
     */
    public void keyResolve(io.bloombox.schema.services.identity.v1beta1.ResolveKey.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.identity.v1beta1.ResolveKey.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getKeyResolveMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getKeyResolveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.identity.v1beta1.ResolveKey.Request,
                io.bloombox.schema.services.identity.v1beta1.ResolveKey.Response>(
                  this, METHODID_KEY_RESOLVE)))
          .build();
    }
  }

  /**
   * <pre>
   * Provides a service that resolves raw public key material, from identifying information for a given key. If the
   * invoking code has the requisite access permissions, ownership information about the key may be provided.
   * </pre>
   */
  public static final class IdentityStub extends io.grpc.stub.AbstractStub<IdentityStub> {
    private IdentityStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IdentityStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IdentityStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IdentityStub(channel, callOptions);
    }

    /**
     * <pre>
     * Resolve public key material by the key's fingerprint or key ID.
     * </pre>
     */
    public void keyResolve(io.bloombox.schema.services.identity.v1beta1.ResolveKey.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.identity.v1beta1.ResolveKey.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getKeyResolveMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Provides a service that resolves raw public key material, from identifying information for a given key. If the
   * invoking code has the requisite access permissions, ownership information about the key may be provided.
   * </pre>
   */
  public static final class IdentityBlockingStub extends io.grpc.stub.AbstractStub<IdentityBlockingStub> {
    private IdentityBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IdentityBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IdentityBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IdentityBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Resolve public key material by the key's fingerprint or key ID.
     * </pre>
     */
    public io.bloombox.schema.services.identity.v1beta1.ResolveKey.Response keyResolve(io.bloombox.schema.services.identity.v1beta1.ResolveKey.Request request) {
      return blockingUnaryCall(
          getChannel(), getKeyResolveMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Provides a service that resolves raw public key material, from identifying information for a given key. If the
   * invoking code has the requisite access permissions, ownership information about the key may be provided.
   * </pre>
   */
  public static final class IdentityFutureStub extends io.grpc.stub.AbstractStub<IdentityFutureStub> {
    private IdentityFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IdentityFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IdentityFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IdentityFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Resolve public key material by the key's fingerprint or key ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.identity.v1beta1.ResolveKey.Response> keyResolve(
        io.bloombox.schema.services.identity.v1beta1.ResolveKey.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getKeyResolveMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_KEY_RESOLVE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IdentityImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IdentityImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_KEY_RESOLVE:
          serviceImpl.keyResolve((io.bloombox.schema.services.identity.v1beta1.ResolveKey.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.identity.v1beta1.ResolveKey.Response>) responseObserver);
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

  private static abstract class IdentityBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IdentityBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.bloombox.schema.services.identity.v1beta1.IdentityServiceBeta1.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Identity");
    }
  }

  private static final class IdentityFileDescriptorSupplier
      extends IdentityBaseDescriptorSupplier {
    IdentityFileDescriptorSupplier() {}
  }

  private static final class IdentityMethodDescriptorSupplier
      extends IdentityBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    IdentityMethodDescriptorSupplier(String methodName) {
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
      synchronized (IdentityGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IdentityFileDescriptorSupplier())
              .addMethod(getKeyResolveMethod())
              .build();
        }
      }
    }
    return result;
  }
}
