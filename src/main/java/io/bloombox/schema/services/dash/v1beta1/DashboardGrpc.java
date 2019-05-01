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

package io.bloombox.schema.services.dash.v1beta1;

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
 * Provides methods related to dashboard support operations. This includes management of partner details and settings,
 * account allocation, and more.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: dash/v1beta1/DashService_Beta1.proto")
public final class DashboardGrpc {

  private DashboardGrpc() {}

  public static final String SERVICE_NAME = "bloombox.services.dash.v1beta1.Dashboard";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.dash.v1beta1.GetPartner.Request,
      io.bloombox.schema.services.dash.v1beta1.GetPartner.Response> getPartnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Partner",
      requestType = io.bloombox.schema.services.dash.v1beta1.GetPartner.Request.class,
      responseType = io.bloombox.schema.services.dash.v1beta1.GetPartner.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.dash.v1beta1.GetPartner.Request,
      io.bloombox.schema.services.dash.v1beta1.GetPartner.Response> getPartnerMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.dash.v1beta1.GetPartner.Request, io.bloombox.schema.services.dash.v1beta1.GetPartner.Response> getPartnerMethod;
    if ((getPartnerMethod = DashboardGrpc.getPartnerMethod) == null) {
      synchronized (DashboardGrpc.class) {
        if ((getPartnerMethod = DashboardGrpc.getPartnerMethod) == null) {
          DashboardGrpc.getPartnerMethod = getPartnerMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.dash.v1beta1.GetPartner.Request, io.bloombox.schema.services.dash.v1beta1.GetPartner.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.dash.v1beta1.Dashboard", "Partner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.dash.v1beta1.GetPartner.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.dash.v1beta1.GetPartner.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new DashboardMethodDescriptorSupplier("Partner"))
                  .build();
          }
        }
     }
     return getPartnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.dash.v1beta1.ListLocations.Request,
      io.bloombox.schema.services.dash.v1beta1.ListLocations.Response> getLocationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Locations",
      requestType = io.bloombox.schema.services.dash.v1beta1.ListLocations.Request.class,
      responseType = io.bloombox.schema.services.dash.v1beta1.ListLocations.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.dash.v1beta1.ListLocations.Request,
      io.bloombox.schema.services.dash.v1beta1.ListLocations.Response> getLocationsMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.dash.v1beta1.ListLocations.Request, io.bloombox.schema.services.dash.v1beta1.ListLocations.Response> getLocationsMethod;
    if ((getLocationsMethod = DashboardGrpc.getLocationsMethod) == null) {
      synchronized (DashboardGrpc.class) {
        if ((getLocationsMethod = DashboardGrpc.getLocationsMethod) == null) {
          DashboardGrpc.getLocationsMethod = getLocationsMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.dash.v1beta1.ListLocations.Request, io.bloombox.schema.services.dash.v1beta1.ListLocations.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.dash.v1beta1.Dashboard", "Locations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.dash.v1beta1.ListLocations.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.dash.v1beta1.ListLocations.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new DashboardMethodDescriptorSupplier("Locations"))
                  .build();
          }
        }
     }
     return getLocationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.dash.v1beta1.GetLocation.Request,
      io.bloombox.schema.services.dash.v1beta1.GetLocation.Response> getLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Location",
      requestType = io.bloombox.schema.services.dash.v1beta1.GetLocation.Request.class,
      responseType = io.bloombox.schema.services.dash.v1beta1.GetLocation.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.dash.v1beta1.GetLocation.Request,
      io.bloombox.schema.services.dash.v1beta1.GetLocation.Response> getLocationMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.dash.v1beta1.GetLocation.Request, io.bloombox.schema.services.dash.v1beta1.GetLocation.Response> getLocationMethod;
    if ((getLocationMethod = DashboardGrpc.getLocationMethod) == null) {
      synchronized (DashboardGrpc.class) {
        if ((getLocationMethod = DashboardGrpc.getLocationMethod) == null) {
          DashboardGrpc.getLocationMethod = getLocationMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.dash.v1beta1.GetLocation.Request, io.bloombox.schema.services.dash.v1beta1.GetLocation.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.dash.v1beta1.Dashboard", "Location"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.dash.v1beta1.GetLocation.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.dash.v1beta1.GetLocation.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new DashboardMethodDescriptorSupplier("Location"))
                  .build();
          }
        }
     }
     return getLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.dash.v1beta1.GetPartnerSettings.Request,
      io.bloombox.schema.services.dash.v1beta1.GetPartnerSettings.Response> getPartnerSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PartnerSettings",
      requestType = io.bloombox.schema.services.dash.v1beta1.GetPartnerSettings.Request.class,
      responseType = io.bloombox.schema.services.dash.v1beta1.GetPartnerSettings.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.dash.v1beta1.GetPartnerSettings.Request,
      io.bloombox.schema.services.dash.v1beta1.GetPartnerSettings.Response> getPartnerSettingsMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.dash.v1beta1.GetPartnerSettings.Request, io.bloombox.schema.services.dash.v1beta1.GetPartnerSettings.Response> getPartnerSettingsMethod;
    if ((getPartnerSettingsMethod = DashboardGrpc.getPartnerSettingsMethod) == null) {
      synchronized (DashboardGrpc.class) {
        if ((getPartnerSettingsMethod = DashboardGrpc.getPartnerSettingsMethod) == null) {
          DashboardGrpc.getPartnerSettingsMethod = getPartnerSettingsMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.dash.v1beta1.GetPartnerSettings.Request, io.bloombox.schema.services.dash.v1beta1.GetPartnerSettings.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.dash.v1beta1.Dashboard", "PartnerSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.dash.v1beta1.GetPartnerSettings.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.dash.v1beta1.GetPartnerSettings.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new DashboardMethodDescriptorSupplier("PartnerSettings"))
                  .build();
          }
        }
     }
     return getPartnerSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.dash.v1beta1.UpdatePartnerSettings.Request,
      com.google.protobuf.Empty> getPartnerSettingsUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PartnerSettingsUpdate",
      requestType = io.bloombox.schema.services.dash.v1beta1.UpdatePartnerSettings.Request.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.dash.v1beta1.UpdatePartnerSettings.Request,
      com.google.protobuf.Empty> getPartnerSettingsUpdateMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.dash.v1beta1.UpdatePartnerSettings.Request, com.google.protobuf.Empty> getPartnerSettingsUpdateMethod;
    if ((getPartnerSettingsUpdateMethod = DashboardGrpc.getPartnerSettingsUpdateMethod) == null) {
      synchronized (DashboardGrpc.class) {
        if ((getPartnerSettingsUpdateMethod = DashboardGrpc.getPartnerSettingsUpdateMethod) == null) {
          DashboardGrpc.getPartnerSettingsUpdateMethod = getPartnerSettingsUpdateMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.dash.v1beta1.UpdatePartnerSettings.Request, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.dash.v1beta1.Dashboard", "PartnerSettingsUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.dash.v1beta1.UpdatePartnerSettings.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new DashboardMethodDescriptorSupplier("PartnerSettingsUpdate"))
                  .build();
          }
        }
     }
     return getPartnerSettingsUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.dash.v1beta1.GetLocationSettings.Request,
      io.bloombox.schema.services.dash.v1beta1.GetLocationSettings.Response> getLocationSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LocationSettings",
      requestType = io.bloombox.schema.services.dash.v1beta1.GetLocationSettings.Request.class,
      responseType = io.bloombox.schema.services.dash.v1beta1.GetLocationSettings.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.dash.v1beta1.GetLocationSettings.Request,
      io.bloombox.schema.services.dash.v1beta1.GetLocationSettings.Response> getLocationSettingsMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.dash.v1beta1.GetLocationSettings.Request, io.bloombox.schema.services.dash.v1beta1.GetLocationSettings.Response> getLocationSettingsMethod;
    if ((getLocationSettingsMethod = DashboardGrpc.getLocationSettingsMethod) == null) {
      synchronized (DashboardGrpc.class) {
        if ((getLocationSettingsMethod = DashboardGrpc.getLocationSettingsMethod) == null) {
          DashboardGrpc.getLocationSettingsMethod = getLocationSettingsMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.dash.v1beta1.GetLocationSettings.Request, io.bloombox.schema.services.dash.v1beta1.GetLocationSettings.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.dash.v1beta1.Dashboard", "LocationSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.dash.v1beta1.GetLocationSettings.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.dash.v1beta1.GetLocationSettings.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new DashboardMethodDescriptorSupplier("LocationSettings"))
                  .build();
          }
        }
     }
     return getLocationSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.dash.v1beta1.UpdateLocationSettings.Request,
      com.google.protobuf.Empty> getLocationSettingsUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LocationSettingsUpdate",
      requestType = io.bloombox.schema.services.dash.v1beta1.UpdateLocationSettings.Request.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.dash.v1beta1.UpdateLocationSettings.Request,
      com.google.protobuf.Empty> getLocationSettingsUpdateMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.dash.v1beta1.UpdateLocationSettings.Request, com.google.protobuf.Empty> getLocationSettingsUpdateMethod;
    if ((getLocationSettingsUpdateMethod = DashboardGrpc.getLocationSettingsUpdateMethod) == null) {
      synchronized (DashboardGrpc.class) {
        if ((getLocationSettingsUpdateMethod = DashboardGrpc.getLocationSettingsUpdateMethod) == null) {
          DashboardGrpc.getLocationSettingsUpdateMethod = getLocationSettingsUpdateMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.dash.v1beta1.UpdateLocationSettings.Request, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.dash.v1beta1.Dashboard", "LocationSettingsUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.dash.v1beta1.UpdateLocationSettings.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new DashboardMethodDescriptorSupplier("LocationSettingsUpdate"))
                  .build();
          }
        }
     }
     return getLocationSettingsUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.dash.v1beta1.ValidateIntegration.Request,
      io.bloombox.schema.services.dash.v1beta1.ValidateIntegration.Response> getIntegrationValidateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IntegrationValidate",
      requestType = io.bloombox.schema.services.dash.v1beta1.ValidateIntegration.Request.class,
      responseType = io.bloombox.schema.services.dash.v1beta1.ValidateIntegration.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.dash.v1beta1.ValidateIntegration.Request,
      io.bloombox.schema.services.dash.v1beta1.ValidateIntegration.Response> getIntegrationValidateMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.dash.v1beta1.ValidateIntegration.Request, io.bloombox.schema.services.dash.v1beta1.ValidateIntegration.Response> getIntegrationValidateMethod;
    if ((getIntegrationValidateMethod = DashboardGrpc.getIntegrationValidateMethod) == null) {
      synchronized (DashboardGrpc.class) {
        if ((getIntegrationValidateMethod = DashboardGrpc.getIntegrationValidateMethod) == null) {
          DashboardGrpc.getIntegrationValidateMethod = getIntegrationValidateMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.dash.v1beta1.ValidateIntegration.Request, io.bloombox.schema.services.dash.v1beta1.ValidateIntegration.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.dash.v1beta1.Dashboard", "IntegrationValidate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.dash.v1beta1.ValidateIntegration.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.dash.v1beta1.ValidateIntegration.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new DashboardMethodDescriptorSupplier("IntegrationValidate"))
                  .build();
          }
        }
     }
     return getIntegrationValidateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.dash.v1beta1.TestIntegration.Request,
      io.bloombox.schema.services.dash.v1beta1.TestIntegration.Response> getIntegrationTestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IntegrationTest",
      requestType = io.bloombox.schema.services.dash.v1beta1.TestIntegration.Request.class,
      responseType = io.bloombox.schema.services.dash.v1beta1.TestIntegration.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.dash.v1beta1.TestIntegration.Request,
      io.bloombox.schema.services.dash.v1beta1.TestIntegration.Response> getIntegrationTestMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.dash.v1beta1.TestIntegration.Request, io.bloombox.schema.services.dash.v1beta1.TestIntegration.Response> getIntegrationTestMethod;
    if ((getIntegrationTestMethod = DashboardGrpc.getIntegrationTestMethod) == null) {
      synchronized (DashboardGrpc.class) {
        if ((getIntegrationTestMethod = DashboardGrpc.getIntegrationTestMethod) == null) {
          DashboardGrpc.getIntegrationTestMethod = getIntegrationTestMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.dash.v1beta1.TestIntegration.Request, io.bloombox.schema.services.dash.v1beta1.TestIntegration.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.dash.v1beta1.Dashboard", "IntegrationTest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.dash.v1beta1.TestIntegration.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.dash.v1beta1.TestIntegration.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new DashboardMethodDescriptorSupplier("IntegrationTest"))
                  .build();
          }
        }
     }
     return getIntegrationTestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.dash.v1beta1.TriggerIntegration.Request,
      io.bloombox.schema.services.dash.v1beta1.TriggerIntegration.Response> getIntegrationTriggerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IntegrationTrigger",
      requestType = io.bloombox.schema.services.dash.v1beta1.TriggerIntegration.Request.class,
      responseType = io.bloombox.schema.services.dash.v1beta1.TriggerIntegration.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.dash.v1beta1.TriggerIntegration.Request,
      io.bloombox.schema.services.dash.v1beta1.TriggerIntegration.Response> getIntegrationTriggerMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.dash.v1beta1.TriggerIntegration.Request, io.bloombox.schema.services.dash.v1beta1.TriggerIntegration.Response> getIntegrationTriggerMethod;
    if ((getIntegrationTriggerMethod = DashboardGrpc.getIntegrationTriggerMethod) == null) {
      synchronized (DashboardGrpc.class) {
        if ((getIntegrationTriggerMethod = DashboardGrpc.getIntegrationTriggerMethod) == null) {
          DashboardGrpc.getIntegrationTriggerMethod = getIntegrationTriggerMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.dash.v1beta1.TriggerIntegration.Request, io.bloombox.schema.services.dash.v1beta1.TriggerIntegration.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.dash.v1beta1.Dashboard", "IntegrationTrigger"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.dash.v1beta1.TriggerIntegration.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.dash.v1beta1.TriggerIntegration.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new DashboardMethodDescriptorSupplier("IntegrationTrigger"))
                  .build();
          }
        }
     }
     return getIntegrationTriggerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DashboardStub newStub(io.grpc.Channel channel) {
    return new DashboardStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DashboardBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DashboardBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DashboardFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DashboardFutureStub(channel);
  }

  /**
   * <pre>
   * Provides methods related to dashboard support operations. This includes management of partner details and settings,
   * account allocation, and more.
   * </pre>
   */
  public static abstract class DashboardImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Retrieve an individual partner record.
     * </pre>
     */
    public void partner(io.bloombox.schema.services.dash.v1beta1.GetPartner.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.GetPartner.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getPartnerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve a list of location records for a given partner record.
     * </pre>
     */
    public void locations(io.bloombox.schema.services.dash.v1beta1.ListLocations.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.ListLocations.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getLocationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve an individual partner location record.
     * </pre>
     */
    public void location(io.bloombox.schema.services.dash.v1beta1.GetLocation.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.GetLocation.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getLocationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve partner-level settings from the Dashboard.
     * </pre>
     */
    public void partnerSettings(io.bloombox.schema.services.dash.v1beta1.GetPartnerSettings.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.GetPartnerSettings.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getPartnerSettingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update partner-level settings from the Dashboard.
     * </pre>
     */
    public void partnerSettingsUpdate(io.bloombox.schema.services.dash.v1beta1.UpdatePartnerSettings.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getPartnerSettingsUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve partner-level settings from the Dashboard.
     * </pre>
     */
    public void locationSettings(io.bloombox.schema.services.dash.v1beta1.GetLocationSettings.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.GetLocationSettings.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getLocationSettingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update location-level settings from the Dashboard.
     * </pre>
     */
    public void locationSettingsUpdate(io.bloombox.schema.services.dash.v1beta1.UpdateLocationSettings.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getLocationSettingsUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Validate configuration for an integrated piece of software against a Bloombox account.
     * </pre>
     */
    public void integrationValidate(io.bloombox.schema.services.dash.v1beta1.ValidateIntegration.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.ValidateIntegration.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getIntegrationValidateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Test an integrated piece of software against a Bloombox account.
     * </pre>
     */
    public void integrationTest(io.bloombox.schema.services.dash.v1beta1.TestIntegration.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.TestIntegration.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getIntegrationTestMethod(), responseObserver);
    }

    /**
     * <pre>
     * Manually trigger an integrated piece of software against a Bloombox account.
     * </pre>
     */
    public void integrationTrigger(io.bloombox.schema.services.dash.v1beta1.TriggerIntegration.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.TriggerIntegration.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getIntegrationTriggerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPartnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.dash.v1beta1.GetPartner.Request,
                io.bloombox.schema.services.dash.v1beta1.GetPartner.Response>(
                  this, METHODID_PARTNER)))
          .addMethod(
            getLocationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.dash.v1beta1.ListLocations.Request,
                io.bloombox.schema.services.dash.v1beta1.ListLocations.Response>(
                  this, METHODID_LOCATIONS)))
          .addMethod(
            getLocationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.dash.v1beta1.GetLocation.Request,
                io.bloombox.schema.services.dash.v1beta1.GetLocation.Response>(
                  this, METHODID_LOCATION)))
          .addMethod(
            getPartnerSettingsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.dash.v1beta1.GetPartnerSettings.Request,
                io.bloombox.schema.services.dash.v1beta1.GetPartnerSettings.Response>(
                  this, METHODID_PARTNER_SETTINGS)))
          .addMethod(
            getPartnerSettingsUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.dash.v1beta1.UpdatePartnerSettings.Request,
                com.google.protobuf.Empty>(
                  this, METHODID_PARTNER_SETTINGS_UPDATE)))
          .addMethod(
            getLocationSettingsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.dash.v1beta1.GetLocationSettings.Request,
                io.bloombox.schema.services.dash.v1beta1.GetLocationSettings.Response>(
                  this, METHODID_LOCATION_SETTINGS)))
          .addMethod(
            getLocationSettingsUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.dash.v1beta1.UpdateLocationSettings.Request,
                com.google.protobuf.Empty>(
                  this, METHODID_LOCATION_SETTINGS_UPDATE)))
          .addMethod(
            getIntegrationValidateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.dash.v1beta1.ValidateIntegration.Request,
                io.bloombox.schema.services.dash.v1beta1.ValidateIntegration.Response>(
                  this, METHODID_INTEGRATION_VALIDATE)))
          .addMethod(
            getIntegrationTestMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.dash.v1beta1.TestIntegration.Request,
                io.bloombox.schema.services.dash.v1beta1.TestIntegration.Response>(
                  this, METHODID_INTEGRATION_TEST)))
          .addMethod(
            getIntegrationTriggerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.dash.v1beta1.TriggerIntegration.Request,
                io.bloombox.schema.services.dash.v1beta1.TriggerIntegration.Response>(
                  this, METHODID_INTEGRATION_TRIGGER)))
          .build();
    }
  }

  /**
   * <pre>
   * Provides methods related to dashboard support operations. This includes management of partner details and settings,
   * account allocation, and more.
   * </pre>
   */
  public static final class DashboardStub extends io.grpc.stub.AbstractStub<DashboardStub> {
    private DashboardStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DashboardStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DashboardStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DashboardStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieve an individual partner record.
     * </pre>
     */
    public void partner(io.bloombox.schema.services.dash.v1beta1.GetPartner.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.GetPartner.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPartnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve a list of location records for a given partner record.
     * </pre>
     */
    public void locations(io.bloombox.schema.services.dash.v1beta1.ListLocations.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.ListLocations.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLocationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve an individual partner location record.
     * </pre>
     */
    public void location(io.bloombox.schema.services.dash.v1beta1.GetLocation.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.GetLocation.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve partner-level settings from the Dashboard.
     * </pre>
     */
    public void partnerSettings(io.bloombox.schema.services.dash.v1beta1.GetPartnerSettings.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.GetPartnerSettings.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPartnerSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update partner-level settings from the Dashboard.
     * </pre>
     */
    public void partnerSettingsUpdate(io.bloombox.schema.services.dash.v1beta1.UpdatePartnerSettings.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPartnerSettingsUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve partner-level settings from the Dashboard.
     * </pre>
     */
    public void locationSettings(io.bloombox.schema.services.dash.v1beta1.GetLocationSettings.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.GetLocationSettings.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLocationSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update location-level settings from the Dashboard.
     * </pre>
     */
    public void locationSettingsUpdate(io.bloombox.schema.services.dash.v1beta1.UpdateLocationSettings.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLocationSettingsUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Validate configuration for an integrated piece of software against a Bloombox account.
     * </pre>
     */
    public void integrationValidate(io.bloombox.schema.services.dash.v1beta1.ValidateIntegration.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.ValidateIntegration.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIntegrationValidateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Test an integrated piece of software against a Bloombox account.
     * </pre>
     */
    public void integrationTest(io.bloombox.schema.services.dash.v1beta1.TestIntegration.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.TestIntegration.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIntegrationTestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Manually trigger an integrated piece of software against a Bloombox account.
     * </pre>
     */
    public void integrationTrigger(io.bloombox.schema.services.dash.v1beta1.TriggerIntegration.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.TriggerIntegration.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIntegrationTriggerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Provides methods related to dashboard support operations. This includes management of partner details and settings,
   * account allocation, and more.
   * </pre>
   */
  public static final class DashboardBlockingStub extends io.grpc.stub.AbstractStub<DashboardBlockingStub> {
    private DashboardBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DashboardBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DashboardBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DashboardBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieve an individual partner record.
     * </pre>
     */
    public io.bloombox.schema.services.dash.v1beta1.GetPartner.Response partner(io.bloombox.schema.services.dash.v1beta1.GetPartner.Request request) {
      return blockingUnaryCall(
          getChannel(), getPartnerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve a list of location records for a given partner record.
     * </pre>
     */
    public io.bloombox.schema.services.dash.v1beta1.ListLocations.Response locations(io.bloombox.schema.services.dash.v1beta1.ListLocations.Request request) {
      return blockingUnaryCall(
          getChannel(), getLocationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve an individual partner location record.
     * </pre>
     */
    public io.bloombox.schema.services.dash.v1beta1.GetLocation.Response location(io.bloombox.schema.services.dash.v1beta1.GetLocation.Request request) {
      return blockingUnaryCall(
          getChannel(), getLocationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve partner-level settings from the Dashboard.
     * </pre>
     */
    public io.bloombox.schema.services.dash.v1beta1.GetPartnerSettings.Response partnerSettings(io.bloombox.schema.services.dash.v1beta1.GetPartnerSettings.Request request) {
      return blockingUnaryCall(
          getChannel(), getPartnerSettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update partner-level settings from the Dashboard.
     * </pre>
     */
    public com.google.protobuf.Empty partnerSettingsUpdate(io.bloombox.schema.services.dash.v1beta1.UpdatePartnerSettings.Request request) {
      return blockingUnaryCall(
          getChannel(), getPartnerSettingsUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve partner-level settings from the Dashboard.
     * </pre>
     */
    public io.bloombox.schema.services.dash.v1beta1.GetLocationSettings.Response locationSettings(io.bloombox.schema.services.dash.v1beta1.GetLocationSettings.Request request) {
      return blockingUnaryCall(
          getChannel(), getLocationSettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update location-level settings from the Dashboard.
     * </pre>
     */
    public com.google.protobuf.Empty locationSettingsUpdate(io.bloombox.schema.services.dash.v1beta1.UpdateLocationSettings.Request request) {
      return blockingUnaryCall(
          getChannel(), getLocationSettingsUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Validate configuration for an integrated piece of software against a Bloombox account.
     * </pre>
     */
    public io.bloombox.schema.services.dash.v1beta1.ValidateIntegration.Response integrationValidate(io.bloombox.schema.services.dash.v1beta1.ValidateIntegration.Request request) {
      return blockingUnaryCall(
          getChannel(), getIntegrationValidateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Test an integrated piece of software against a Bloombox account.
     * </pre>
     */
    public io.bloombox.schema.services.dash.v1beta1.TestIntegration.Response integrationTest(io.bloombox.schema.services.dash.v1beta1.TestIntegration.Request request) {
      return blockingUnaryCall(
          getChannel(), getIntegrationTestMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Manually trigger an integrated piece of software against a Bloombox account.
     * </pre>
     */
    public io.bloombox.schema.services.dash.v1beta1.TriggerIntegration.Response integrationTrigger(io.bloombox.schema.services.dash.v1beta1.TriggerIntegration.Request request) {
      return blockingUnaryCall(
          getChannel(), getIntegrationTriggerMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Provides methods related to dashboard support operations. This includes management of partner details and settings,
   * account allocation, and more.
   * </pre>
   */
  public static final class DashboardFutureStub extends io.grpc.stub.AbstractStub<DashboardFutureStub> {
    private DashboardFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DashboardFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DashboardFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DashboardFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieve an individual partner record.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.dash.v1beta1.GetPartner.Response> partner(
        io.bloombox.schema.services.dash.v1beta1.GetPartner.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getPartnerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve a list of location records for a given partner record.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.dash.v1beta1.ListLocations.Response> locations(
        io.bloombox.schema.services.dash.v1beta1.ListLocations.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getLocationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve an individual partner location record.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.dash.v1beta1.GetLocation.Response> location(
        io.bloombox.schema.services.dash.v1beta1.GetLocation.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getLocationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve partner-level settings from the Dashboard.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.dash.v1beta1.GetPartnerSettings.Response> partnerSettings(
        io.bloombox.schema.services.dash.v1beta1.GetPartnerSettings.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getPartnerSettingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update partner-level settings from the Dashboard.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> partnerSettingsUpdate(
        io.bloombox.schema.services.dash.v1beta1.UpdatePartnerSettings.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getPartnerSettingsUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve partner-level settings from the Dashboard.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.dash.v1beta1.GetLocationSettings.Response> locationSettings(
        io.bloombox.schema.services.dash.v1beta1.GetLocationSettings.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getLocationSettingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update location-level settings from the Dashboard.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> locationSettingsUpdate(
        io.bloombox.schema.services.dash.v1beta1.UpdateLocationSettings.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getLocationSettingsUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Validate configuration for an integrated piece of software against a Bloombox account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.dash.v1beta1.ValidateIntegration.Response> integrationValidate(
        io.bloombox.schema.services.dash.v1beta1.ValidateIntegration.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getIntegrationValidateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Test an integrated piece of software against a Bloombox account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.dash.v1beta1.TestIntegration.Response> integrationTest(
        io.bloombox.schema.services.dash.v1beta1.TestIntegration.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getIntegrationTestMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Manually trigger an integrated piece of software against a Bloombox account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.dash.v1beta1.TriggerIntegration.Response> integrationTrigger(
        io.bloombox.schema.services.dash.v1beta1.TriggerIntegration.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getIntegrationTriggerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARTNER = 0;
  private static final int METHODID_LOCATIONS = 1;
  private static final int METHODID_LOCATION = 2;
  private static final int METHODID_PARTNER_SETTINGS = 3;
  private static final int METHODID_PARTNER_SETTINGS_UPDATE = 4;
  private static final int METHODID_LOCATION_SETTINGS = 5;
  private static final int METHODID_LOCATION_SETTINGS_UPDATE = 6;
  private static final int METHODID_INTEGRATION_VALIDATE = 7;
  private static final int METHODID_INTEGRATION_TEST = 8;
  private static final int METHODID_INTEGRATION_TRIGGER = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DashboardImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DashboardImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PARTNER:
          serviceImpl.partner((io.bloombox.schema.services.dash.v1beta1.GetPartner.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.GetPartner.Response>) responseObserver);
          break;
        case METHODID_LOCATIONS:
          serviceImpl.locations((io.bloombox.schema.services.dash.v1beta1.ListLocations.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.ListLocations.Response>) responseObserver);
          break;
        case METHODID_LOCATION:
          serviceImpl.location((io.bloombox.schema.services.dash.v1beta1.GetLocation.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.GetLocation.Response>) responseObserver);
          break;
        case METHODID_PARTNER_SETTINGS:
          serviceImpl.partnerSettings((io.bloombox.schema.services.dash.v1beta1.GetPartnerSettings.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.GetPartnerSettings.Response>) responseObserver);
          break;
        case METHODID_PARTNER_SETTINGS_UPDATE:
          serviceImpl.partnerSettingsUpdate((io.bloombox.schema.services.dash.v1beta1.UpdatePartnerSettings.Request) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LOCATION_SETTINGS:
          serviceImpl.locationSettings((io.bloombox.schema.services.dash.v1beta1.GetLocationSettings.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.GetLocationSettings.Response>) responseObserver);
          break;
        case METHODID_LOCATION_SETTINGS_UPDATE:
          serviceImpl.locationSettingsUpdate((io.bloombox.schema.services.dash.v1beta1.UpdateLocationSettings.Request) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_INTEGRATION_VALIDATE:
          serviceImpl.integrationValidate((io.bloombox.schema.services.dash.v1beta1.ValidateIntegration.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.ValidateIntegration.Response>) responseObserver);
          break;
        case METHODID_INTEGRATION_TEST:
          serviceImpl.integrationTest((io.bloombox.schema.services.dash.v1beta1.TestIntegration.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.TestIntegration.Response>) responseObserver);
          break;
        case METHODID_INTEGRATION_TRIGGER:
          serviceImpl.integrationTrigger((io.bloombox.schema.services.dash.v1beta1.TriggerIntegration.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.TriggerIntegration.Response>) responseObserver);
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

  private static abstract class DashboardBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DashboardBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.bloombox.schema.services.dash.v1beta1.DashServiceBeta1.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Dashboard");
    }
  }

  private static final class DashboardFileDescriptorSupplier
      extends DashboardBaseDescriptorSupplier {
    DashboardFileDescriptorSupplier() {}
  }

  private static final class DashboardMethodDescriptorSupplier
      extends DashboardBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DashboardMethodDescriptorSupplier(String methodName) {
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
      synchronized (DashboardGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DashboardFileDescriptorSupplier())
              .addMethod(getPartnerMethod())
              .addMethod(getLocationsMethod())
              .addMethod(getLocationMethod())
              .addMethod(getPartnerSettingsMethod())
              .addMethod(getPartnerSettingsUpdateMethod())
              .addMethod(getLocationSettingsMethod())
              .addMethod(getLocationSettingsUpdateMethod())
              .addMethod(getIntegrationValidateMethod())
              .addMethod(getIntegrationTestMethod())
              .addMethod(getIntegrationTriggerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
