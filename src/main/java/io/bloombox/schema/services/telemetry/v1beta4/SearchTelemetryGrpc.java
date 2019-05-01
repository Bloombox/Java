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
 * Provides support for recording telemetry information specific to user-submitted search queries, the resultsets they
 * produce, and the user's response to those resultsets.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: telemetry/v1beta4/TelemetryService_Beta4.proto")
public final class SearchTelemetryGrpc {

  private SearchTelemetryGrpc() {}

  public static final String SERVICE_NAME = "bloombox.services.telemetry.v1beta4.SearchTelemetry";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.SearchEvent.Query,
      com.google.protobuf.Empty> getQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Query",
      requestType = io.bloombox.schema.services.telemetry.v1beta4.SearchEvent.Query.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.SearchEvent.Query,
      com.google.protobuf.Empty> getQueryMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.SearchEvent.Query, com.google.protobuf.Empty> getQueryMethod;
    if ((getQueryMethod = SearchTelemetryGrpc.getQueryMethod) == null) {
      synchronized (SearchTelemetryGrpc.class) {
        if ((getQueryMethod = SearchTelemetryGrpc.getQueryMethod) == null) {
          SearchTelemetryGrpc.getQueryMethod = getQueryMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.telemetry.v1beta4.SearchEvent.Query, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.telemetry.v1beta4.SearchTelemetry", "Query"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.telemetry.v1beta4.SearchEvent.Query.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new SearchTelemetryMethodDescriptorSupplier("Query"))
                  .build();
          }
        }
     }
     return getQueryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.SearchEvent.Result,
      com.google.protobuf.Empty> getResultMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Result",
      requestType = io.bloombox.schema.services.telemetry.v1beta4.SearchEvent.Result.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.SearchEvent.Result,
      com.google.protobuf.Empty> getResultMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.SearchEvent.Result, com.google.protobuf.Empty> getResultMethod;
    if ((getResultMethod = SearchTelemetryGrpc.getResultMethod) == null) {
      synchronized (SearchTelemetryGrpc.class) {
        if ((getResultMethod = SearchTelemetryGrpc.getResultMethod) == null) {
          SearchTelemetryGrpc.getResultMethod = getResultMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.telemetry.v1beta4.SearchEvent.Result, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.telemetry.v1beta4.SearchTelemetry", "Result"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.telemetry.v1beta4.SearchEvent.Result.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new SearchTelemetryMethodDescriptorSupplier("Result"))
                  .build();
          }
        }
     }
     return getResultMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SearchTelemetryStub newStub(io.grpc.Channel channel) {
    return new SearchTelemetryStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SearchTelemetryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SearchTelemetryBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SearchTelemetryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SearchTelemetryFutureStub(channel);
  }

  /**
   * <pre>
   * Provides support for recording telemetry information specific to user-submitted search queries, the resultsets they
   * produce, and the user's response to those resultsets.
   * </pre>
   */
  public static abstract class SearchTelemetryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Record a search performed by a user.
     * </pre>
     */
    public void query(io.bloombox.schema.services.telemetry.v1beta4.SearchEvent.Query request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Record a search result selected by a user after performing a search.
     * </pre>
     */
    public void result(io.bloombox.schema.services.telemetry.v1beta4.SearchEvent.Result request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getResultMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getQueryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.telemetry.v1beta4.SearchEvent.Query,
                com.google.protobuf.Empty>(
                  this, METHODID_QUERY)))
          .addMethod(
            getResultMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.telemetry.v1beta4.SearchEvent.Result,
                com.google.protobuf.Empty>(
                  this, METHODID_RESULT)))
          .build();
    }
  }

  /**
   * <pre>
   * Provides support for recording telemetry information specific to user-submitted search queries, the resultsets they
   * produce, and the user's response to those resultsets.
   * </pre>
   */
  public static final class SearchTelemetryStub extends io.grpc.stub.AbstractStub<SearchTelemetryStub> {
    private SearchTelemetryStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SearchTelemetryStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchTelemetryStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SearchTelemetryStub(channel, callOptions);
    }

    /**
     * <pre>
     * Record a search performed by a user.
     * </pre>
     */
    public void query(io.bloombox.schema.services.telemetry.v1beta4.SearchEvent.Query request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Record a search result selected by a user after performing a search.
     * </pre>
     */
    public void result(io.bloombox.schema.services.telemetry.v1beta4.SearchEvent.Result request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getResultMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Provides support for recording telemetry information specific to user-submitted search queries, the resultsets they
   * produce, and the user's response to those resultsets.
   * </pre>
   */
  public static final class SearchTelemetryBlockingStub extends io.grpc.stub.AbstractStub<SearchTelemetryBlockingStub> {
    private SearchTelemetryBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SearchTelemetryBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchTelemetryBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SearchTelemetryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Record a search performed by a user.
     * </pre>
     */
    public com.google.protobuf.Empty query(io.bloombox.schema.services.telemetry.v1beta4.SearchEvent.Query request) {
      return blockingUnaryCall(
          getChannel(), getQueryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Record a search result selected by a user after performing a search.
     * </pre>
     */
    public com.google.protobuf.Empty result(io.bloombox.schema.services.telemetry.v1beta4.SearchEvent.Result request) {
      return blockingUnaryCall(
          getChannel(), getResultMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Provides support for recording telemetry information specific to user-submitted search queries, the resultsets they
   * produce, and the user's response to those resultsets.
   * </pre>
   */
  public static final class SearchTelemetryFutureStub extends io.grpc.stub.AbstractStub<SearchTelemetryFutureStub> {
    private SearchTelemetryFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SearchTelemetryFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchTelemetryFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SearchTelemetryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Record a search performed by a user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> query(
        io.bloombox.schema.services.telemetry.v1beta4.SearchEvent.Query request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Record a search result selected by a user after performing a search.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> result(
        io.bloombox.schema.services.telemetry.v1beta4.SearchEvent.Result request) {
      return futureUnaryCall(
          getChannel().newCall(getResultMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERY = 0;
  private static final int METHODID_RESULT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SearchTelemetryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SearchTelemetryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_QUERY:
          serviceImpl.query((io.bloombox.schema.services.telemetry.v1beta4.SearchEvent.Query) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_RESULT:
          serviceImpl.result((io.bloombox.schema.services.telemetry.v1beta4.SearchEvent.Result) request,
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SearchTelemetryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SearchTelemetryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.bloombox.schema.services.telemetry.v1beta4.TelemetryServiceBeta4.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SearchTelemetry");
    }
  }

  private static final class SearchTelemetryFileDescriptorSupplier
      extends SearchTelemetryBaseDescriptorSupplier {
    SearchTelemetryFileDescriptorSupplier() {}
  }

  private static final class SearchTelemetryMethodDescriptorSupplier
      extends SearchTelemetryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SearchTelemetryMethodDescriptorSupplier(String methodName) {
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
      synchronized (SearchTelemetryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SearchTelemetryFileDescriptorSupplier())
              .addMethod(getQueryMethod())
              .addMethod(getResultMethod())
              .build();
        }
      }
    }
    return result;
  }
}
