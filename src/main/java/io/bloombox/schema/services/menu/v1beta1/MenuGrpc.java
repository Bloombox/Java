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

package io.bloombox.schema.services.menu.v1beta1;

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
 * Specifies the menu service, which provides tools for consuming, updating, and subscribing to menu data.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: menu/v1beta1/MenuService_Beta1.proto")
public final class MenuGrpc {

  private MenuGrpc() {}

  public static final String SERVICE_NAME = "bloombox.services.menu.v1beta1.Menu";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.menu.v1beta1.GetMenu.Request,
      io.bloombox.schema.services.menu.v1beta1.GetMenu.Response> getRetrieveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Retrieve",
      requestType = io.bloombox.schema.services.menu.v1beta1.GetMenu.Request.class,
      responseType = io.bloombox.schema.services.menu.v1beta1.GetMenu.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.menu.v1beta1.GetMenu.Request,
      io.bloombox.schema.services.menu.v1beta1.GetMenu.Response> getRetrieveMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.menu.v1beta1.GetMenu.Request, io.bloombox.schema.services.menu.v1beta1.GetMenu.Response> getRetrieveMethod;
    if ((getRetrieveMethod = MenuGrpc.getRetrieveMethod) == null) {
      synchronized (MenuGrpc.class) {
        if ((getRetrieveMethod = MenuGrpc.getRetrieveMethod) == null) {
          MenuGrpc.getRetrieveMethod = getRetrieveMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.menu.v1beta1.GetMenu.Request, io.bloombox.schema.services.menu.v1beta1.GetMenu.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.menu.v1beta1.Menu", "Retrieve"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.menu.v1beta1.GetMenu.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.menu.v1beta1.GetMenu.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new MenuMethodDescriptorSupplier("Retrieve"))
                  .build();
          }
        }
     }
     return getRetrieveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.menu.v1beta1.GetMenu.Request,
      io.bloombox.schema.services.menu.v1beta1.GetMenu.StreamEvent> getLiveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Live",
      requestType = io.bloombox.schema.services.menu.v1beta1.GetMenu.Request.class,
      responseType = io.bloombox.schema.services.menu.v1beta1.GetMenu.StreamEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.menu.v1beta1.GetMenu.Request,
      io.bloombox.schema.services.menu.v1beta1.GetMenu.StreamEvent> getLiveMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.menu.v1beta1.GetMenu.Request, io.bloombox.schema.services.menu.v1beta1.GetMenu.StreamEvent> getLiveMethod;
    if ((getLiveMethod = MenuGrpc.getLiveMethod) == null) {
      synchronized (MenuGrpc.class) {
        if ((getLiveMethod = MenuGrpc.getLiveMethod) == null) {
          MenuGrpc.getLiveMethod = getLiveMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.menu.v1beta1.GetMenu.Request, io.bloombox.schema.services.menu.v1beta1.GetMenu.StreamEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.menu.v1beta1.Menu", "Live"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.menu.v1beta1.GetMenu.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.menu.v1beta1.GetMenu.StreamEvent.getDefaultInstance()))
                  .setSchemaDescriptor(new MenuMethodDescriptorSupplier("Live"))
                  .build();
          }
        }
     }
     return getLiveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.menu.v1beta1.GetMenu.Request,
      io.bloombox.schema.services.menu.v1beta1.GetMenu.Response> getSectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Section",
      requestType = io.bloombox.schema.services.menu.v1beta1.GetMenu.Request.class,
      responseType = io.bloombox.schema.services.menu.v1beta1.GetMenu.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.menu.v1beta1.GetMenu.Request,
      io.bloombox.schema.services.menu.v1beta1.GetMenu.Response> getSectionMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.menu.v1beta1.GetMenu.Request, io.bloombox.schema.services.menu.v1beta1.GetMenu.Response> getSectionMethod;
    if ((getSectionMethod = MenuGrpc.getSectionMethod) == null) {
      synchronized (MenuGrpc.class) {
        if ((getSectionMethod = MenuGrpc.getSectionMethod) == null) {
          MenuGrpc.getSectionMethod = getSectionMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.menu.v1beta1.GetMenu.Request, io.bloombox.schema.services.menu.v1beta1.GetMenu.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.menu.v1beta1.Menu", "Section"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.menu.v1beta1.GetMenu.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.menu.v1beta1.GetMenu.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new MenuMethodDescriptorSupplier("Section"))
                  .build();
          }
        }
     }
     return getSectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.menu.v1beta1.GetFeatured.Request,
      io.bloombox.schema.services.menu.v1beta1.GetFeatured.Response> getFeaturedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Featured",
      requestType = io.bloombox.schema.services.menu.v1beta1.GetFeatured.Request.class,
      responseType = io.bloombox.schema.services.menu.v1beta1.GetFeatured.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.menu.v1beta1.GetFeatured.Request,
      io.bloombox.schema.services.menu.v1beta1.GetFeatured.Response> getFeaturedMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.menu.v1beta1.GetFeatured.Request, io.bloombox.schema.services.menu.v1beta1.GetFeatured.Response> getFeaturedMethod;
    if ((getFeaturedMethod = MenuGrpc.getFeaturedMethod) == null) {
      synchronized (MenuGrpc.class) {
        if ((getFeaturedMethod = MenuGrpc.getFeaturedMethod) == null) {
          MenuGrpc.getFeaturedMethod = getFeaturedMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.menu.v1beta1.GetFeatured.Request, io.bloombox.schema.services.menu.v1beta1.GetFeatured.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.menu.v1beta1.Menu", "Featured"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.menu.v1beta1.GetFeatured.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.menu.v1beta1.GetFeatured.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new MenuMethodDescriptorSupplier("Featured"))
                  .build();
          }
        }
     }
     return getFeaturedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.menu.v1beta1.GetProduct.Request,
      io.bloombox.schema.services.menu.v1beta1.GetProduct.Response> getProductsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Products",
      requestType = io.bloombox.schema.services.menu.v1beta1.GetProduct.Request.class,
      responseType = io.bloombox.schema.services.menu.v1beta1.GetProduct.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.menu.v1beta1.GetProduct.Request,
      io.bloombox.schema.services.menu.v1beta1.GetProduct.Response> getProductsMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.menu.v1beta1.GetProduct.Request, io.bloombox.schema.services.menu.v1beta1.GetProduct.Response> getProductsMethod;
    if ((getProductsMethod = MenuGrpc.getProductsMethod) == null) {
      synchronized (MenuGrpc.class) {
        if ((getProductsMethod = MenuGrpc.getProductsMethod) == null) {
          MenuGrpc.getProductsMethod = getProductsMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.menu.v1beta1.GetProduct.Request, io.bloombox.schema.services.menu.v1beta1.GetProduct.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.menu.v1beta1.Menu", "Products"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.menu.v1beta1.GetProduct.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.menu.v1beta1.GetProduct.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new MenuMethodDescriptorSupplier("Products"))
                  .build();
          }
        }
     }
     return getProductsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.menu.v1beta1.GetCatalog.Request,
      com.google.api.HttpBody> getCatalogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Catalog",
      requestType = io.bloombox.schema.services.menu.v1beta1.GetCatalog.Request.class,
      responseType = com.google.api.HttpBody.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.menu.v1beta1.GetCatalog.Request,
      com.google.api.HttpBody> getCatalogMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.menu.v1beta1.GetCatalog.Request, com.google.api.HttpBody> getCatalogMethod;
    if ((getCatalogMethod = MenuGrpc.getCatalogMethod) == null) {
      synchronized (MenuGrpc.class) {
        if ((getCatalogMethod = MenuGrpc.getCatalogMethod) == null) {
          MenuGrpc.getCatalogMethod = getCatalogMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.menu.v1beta1.GetCatalog.Request, com.google.api.HttpBody>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.menu.v1beta1.Menu", "Catalog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.menu.v1beta1.GetCatalog.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.api.HttpBody.getDefaultInstance()))
                  .setSchemaDescriptor(new MenuMethodDescriptorSupplier("Catalog"))
                  .build();
          }
        }
     }
     return getCatalogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.menu.v1beta1.SearchMenu.Request,
      io.bloombox.schema.services.menu.v1beta1.SearchMenu.Response> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Search",
      requestType = io.bloombox.schema.services.menu.v1beta1.SearchMenu.Request.class,
      responseType = io.bloombox.schema.services.menu.v1beta1.SearchMenu.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.menu.v1beta1.SearchMenu.Request,
      io.bloombox.schema.services.menu.v1beta1.SearchMenu.Response> getSearchMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.menu.v1beta1.SearchMenu.Request, io.bloombox.schema.services.menu.v1beta1.SearchMenu.Response> getSearchMethod;
    if ((getSearchMethod = MenuGrpc.getSearchMethod) == null) {
      synchronized (MenuGrpc.class) {
        if ((getSearchMethod = MenuGrpc.getSearchMethod) == null) {
          MenuGrpc.getSearchMethod = getSearchMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.menu.v1beta1.SearchMenu.Request, io.bloombox.schema.services.menu.v1beta1.SearchMenu.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.menu.v1beta1.Menu", "Search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.menu.v1beta1.SearchMenu.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.menu.v1beta1.SearchMenu.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new MenuMethodDescriptorSupplier("Search"))
                  .build();
          }
        }
     }
     return getSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.menu.v1beta1.CreateProduct.Request,
      io.bloombox.schema.services.menu.v1beta1.CreateProduct.Response> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = io.bloombox.schema.services.menu.v1beta1.CreateProduct.Request.class,
      responseType = io.bloombox.schema.services.menu.v1beta1.CreateProduct.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.menu.v1beta1.CreateProduct.Request,
      io.bloombox.schema.services.menu.v1beta1.CreateProduct.Response> getCreateMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.menu.v1beta1.CreateProduct.Request, io.bloombox.schema.services.menu.v1beta1.CreateProduct.Response> getCreateMethod;
    if ((getCreateMethod = MenuGrpc.getCreateMethod) == null) {
      synchronized (MenuGrpc.class) {
        if ((getCreateMethod = MenuGrpc.getCreateMethod) == null) {
          MenuGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.menu.v1beta1.CreateProduct.Request, io.bloombox.schema.services.menu.v1beta1.CreateProduct.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.menu.v1beta1.Menu", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.menu.v1beta1.CreateProduct.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.menu.v1beta1.CreateProduct.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new MenuMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.menu.v1beta1.UpdateProduct.Request,
      com.google.protobuf.Empty> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = io.bloombox.schema.services.menu.v1beta1.UpdateProduct.Request.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.menu.v1beta1.UpdateProduct.Request,
      com.google.protobuf.Empty> getUpdateMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.menu.v1beta1.UpdateProduct.Request, com.google.protobuf.Empty> getUpdateMethod;
    if ((getUpdateMethod = MenuGrpc.getUpdateMethod) == null) {
      synchronized (MenuGrpc.class) {
        if ((getUpdateMethod = MenuGrpc.getUpdateMethod) == null) {
          MenuGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.menu.v1beta1.UpdateProduct.Request, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.menu.v1beta1.Menu", "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.menu.v1beta1.UpdateProduct.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new MenuMethodDescriptorSupplier("Update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.menu.v1beta1.DeleteProduct.Request,
      com.google.protobuf.Empty> getRemoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Remove",
      requestType = io.bloombox.schema.services.menu.v1beta1.DeleteProduct.Request.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.menu.v1beta1.DeleteProduct.Request,
      com.google.protobuf.Empty> getRemoveMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.menu.v1beta1.DeleteProduct.Request, com.google.protobuf.Empty> getRemoveMethod;
    if ((getRemoveMethod = MenuGrpc.getRemoveMethod) == null) {
      synchronized (MenuGrpc.class) {
        if ((getRemoveMethod = MenuGrpc.getRemoveMethod) == null) {
          MenuGrpc.getRemoveMethod = getRemoveMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.menu.v1beta1.DeleteProduct.Request, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.menu.v1beta1.Menu", "Remove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.menu.v1beta1.DeleteProduct.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new MenuMethodDescriptorSupplier("Remove"))
                  .build();
          }
        }
     }
     return getRemoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.menu.v1beta1.ProductStock.Request,
      com.google.protobuf.Empty> getProductStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProductStatus",
      requestType = io.bloombox.schema.services.menu.v1beta1.ProductStock.Request.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.menu.v1beta1.ProductStock.Request,
      com.google.protobuf.Empty> getProductStatusMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.menu.v1beta1.ProductStock.Request, com.google.protobuf.Empty> getProductStatusMethod;
    if ((getProductStatusMethod = MenuGrpc.getProductStatusMethod) == null) {
      synchronized (MenuGrpc.class) {
        if ((getProductStatusMethod = MenuGrpc.getProductStatusMethod) == null) {
          MenuGrpc.getProductStatusMethod = getProductStatusMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.menu.v1beta1.ProductStock.Request, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.menu.v1beta1.Menu", "ProductStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.menu.v1beta1.ProductStock.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new MenuMethodDescriptorSupplier("ProductStatus"))
                  .build();
          }
        }
     }
     return getProductStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.menu.v1beta1.ProductStock.Request,
      com.google.protobuf.Empty> getInStockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InStock",
      requestType = io.bloombox.schema.services.menu.v1beta1.ProductStock.Request.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.menu.v1beta1.ProductStock.Request,
      com.google.protobuf.Empty> getInStockMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.menu.v1beta1.ProductStock.Request, com.google.protobuf.Empty> getInStockMethod;
    if ((getInStockMethod = MenuGrpc.getInStockMethod) == null) {
      synchronized (MenuGrpc.class) {
        if ((getInStockMethod = MenuGrpc.getInStockMethod) == null) {
          MenuGrpc.getInStockMethod = getInStockMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.menu.v1beta1.ProductStock.Request, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.menu.v1beta1.Menu", "InStock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.menu.v1beta1.ProductStock.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new MenuMethodDescriptorSupplier("InStock"))
                  .build();
          }
        }
     }
     return getInStockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.menu.v1beta1.ProductStock.Request,
      com.google.protobuf.Empty> getOutOfStockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OutOfStock",
      requestType = io.bloombox.schema.services.menu.v1beta1.ProductStock.Request.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.menu.v1beta1.ProductStock.Request,
      com.google.protobuf.Empty> getOutOfStockMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.menu.v1beta1.ProductStock.Request, com.google.protobuf.Empty> getOutOfStockMethod;
    if ((getOutOfStockMethod = MenuGrpc.getOutOfStockMethod) == null) {
      synchronized (MenuGrpc.class) {
        if ((getOutOfStockMethod = MenuGrpc.getOutOfStockMethod) == null) {
          MenuGrpc.getOutOfStockMethod = getOutOfStockMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.menu.v1beta1.ProductStock.Request, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.menu.v1beta1.Menu", "OutOfStock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.menu.v1beta1.ProductStock.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new MenuMethodDescriptorSupplier("OutOfStock"))
                  .build();
          }
        }
     }
     return getOutOfStockMethod;
  }

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
     * Specifies an operation to read a full menu.
     * </pre>
     */
    public void retrieve(io.bloombox.schema.services.menu.v1beta1.GetMenu.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.menu.v1beta1.GetMenu.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getRetrieveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Begin a live menu streaming session, where changes are pushed to the listening code in real-time.
     * </pre>
     */
    public void live(io.bloombox.schema.services.menu.v1beta1.GetMenu.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.menu.v1beta1.GetMenu.StreamEvent> responseObserver) {
      asyncUnimplementedUnaryCall(getLiveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Specifies an operation to read a sectioned menu.
     * </pre>
     */
    public void section(io.bloombox.schema.services.menu.v1beta1.GetMenu.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.menu.v1beta1.GetMenu.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getSectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Specifies an operation to read the list of featured products.
     * </pre>
     */
    public void featured(io.bloombox.schema.services.menu.v1beta1.GetFeatured.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.menu.v1beta1.GetFeatured.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getFeaturedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Specifies an operation to read data for product(s) by key.
     * </pre>
     */
    public void products(io.bloombox.schema.services.menu.v1beta1.GetProduct.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.menu.v1beta1.GetProduct.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getProductsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve products in a universal catalog format, based on CSV.
     * </pre>
     */
    public void catalog(io.bloombox.schema.services.menu.v1beta1.GetCatalog.Request request,
        io.grpc.stub.StreamObserver<com.google.api.HttpBody> responseObserver) {
      asyncUnimplementedUnaryCall(getCatalogMethod(), responseObserver);
    }

    /**
     * <pre>
     * Specifies an operation to read a full or sectioned menu.
     * </pre>
     */
    public void search(io.bloombox.schema.services.menu.v1beta1.SearchMenu.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.menu.v1beta1.SearchMenu.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a new product record from scratch.
     * </pre>
     */
    public void create(io.bloombox.schema.services.menu.v1beta1.CreateProduct.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.menu.v1beta1.CreateProduct.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an existing product record with new data.
     * </pre>
     */
    public void update(io.bloombox.schema.services.menu.v1beta1.UpdateProduct.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Mark a product as deleted.
     * </pre>
     */
    public void remove(io.bloombox.schema.services.menu.v1beta1.DeleteProduct.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve a single product's stock status.
     * </pre>
     */
    public void productStatus(io.bloombox.schema.services.menu.v1beta1.ProductStock.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getProductStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Mark a product as currently in-stock.
     * </pre>
     */
    public void inStock(io.bloombox.schema.services.menu.v1beta1.ProductStock.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getInStockMethod(), responseObserver);
    }

    /**
     * <pre>
     * Mark a product as currently out-of-stock.
     * </pre>
     */
    public void outOfStock(io.bloombox.schema.services.menu.v1beta1.ProductStock.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getOutOfStockMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRetrieveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.menu.v1beta1.GetMenu.Request,
                io.bloombox.schema.services.menu.v1beta1.GetMenu.Response>(
                  this, METHODID_RETRIEVE)))
          .addMethod(
            getLiveMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                io.bloombox.schema.services.menu.v1beta1.GetMenu.Request,
                io.bloombox.schema.services.menu.v1beta1.GetMenu.StreamEvent>(
                  this, METHODID_LIVE)))
          .addMethod(
            getSectionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.menu.v1beta1.GetMenu.Request,
                io.bloombox.schema.services.menu.v1beta1.GetMenu.Response>(
                  this, METHODID_SECTION)))
          .addMethod(
            getFeaturedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.menu.v1beta1.GetFeatured.Request,
                io.bloombox.schema.services.menu.v1beta1.GetFeatured.Response>(
                  this, METHODID_FEATURED)))
          .addMethod(
            getProductsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.menu.v1beta1.GetProduct.Request,
                io.bloombox.schema.services.menu.v1beta1.GetProduct.Response>(
                  this, METHODID_PRODUCTS)))
          .addMethod(
            getCatalogMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.menu.v1beta1.GetCatalog.Request,
                com.google.api.HttpBody>(
                  this, METHODID_CATALOG)))
          .addMethod(
            getSearchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.menu.v1beta1.SearchMenu.Request,
                io.bloombox.schema.services.menu.v1beta1.SearchMenu.Response>(
                  this, METHODID_SEARCH)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.menu.v1beta1.CreateProduct.Request,
                io.bloombox.schema.services.menu.v1beta1.CreateProduct.Response>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.menu.v1beta1.UpdateProduct.Request,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getRemoveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.menu.v1beta1.DeleteProduct.Request,
                com.google.protobuf.Empty>(
                  this, METHODID_REMOVE)))
          .addMethod(
            getProductStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.menu.v1beta1.ProductStock.Request,
                com.google.protobuf.Empty>(
                  this, METHODID_PRODUCT_STATUS)))
          .addMethod(
            getInStockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.menu.v1beta1.ProductStock.Request,
                com.google.protobuf.Empty>(
                  this, METHODID_IN_STOCK)))
          .addMethod(
            getOutOfStockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.menu.v1beta1.ProductStock.Request,
                com.google.protobuf.Empty>(
                  this, METHODID_OUT_OF_STOCK)))
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
     * Specifies an operation to read a full menu.
     * </pre>
     */
    public void retrieve(io.bloombox.schema.services.menu.v1beta1.GetMenu.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.menu.v1beta1.GetMenu.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRetrieveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Begin a live menu streaming session, where changes are pushed to the listening code in real-time.
     * </pre>
     */
    public void live(io.bloombox.schema.services.menu.v1beta1.GetMenu.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.menu.v1beta1.GetMenu.StreamEvent> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getLiveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Specifies an operation to read a sectioned menu.
     * </pre>
     */
    public void section(io.bloombox.schema.services.menu.v1beta1.GetMenu.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.menu.v1beta1.GetMenu.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Specifies an operation to read the list of featured products.
     * </pre>
     */
    public void featured(io.bloombox.schema.services.menu.v1beta1.GetFeatured.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.menu.v1beta1.GetFeatured.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFeaturedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Specifies an operation to read data for product(s) by key.
     * </pre>
     */
    public void products(io.bloombox.schema.services.menu.v1beta1.GetProduct.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.menu.v1beta1.GetProduct.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProductsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve products in a universal catalog format, based on CSV.
     * </pre>
     */
    public void catalog(io.bloombox.schema.services.menu.v1beta1.GetCatalog.Request request,
        io.grpc.stub.StreamObserver<com.google.api.HttpBody> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCatalogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Specifies an operation to read a full or sectioned menu.
     * </pre>
     */
    public void search(io.bloombox.schema.services.menu.v1beta1.SearchMenu.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.menu.v1beta1.SearchMenu.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a new product record from scratch.
     * </pre>
     */
    public void create(io.bloombox.schema.services.menu.v1beta1.CreateProduct.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.menu.v1beta1.CreateProduct.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an existing product record with new data.
     * </pre>
     */
    public void update(io.bloombox.schema.services.menu.v1beta1.UpdateProduct.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Mark a product as deleted.
     * </pre>
     */
    public void remove(io.bloombox.schema.services.menu.v1beta1.DeleteProduct.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve a single product's stock status.
     * </pre>
     */
    public void productStatus(io.bloombox.schema.services.menu.v1beta1.ProductStock.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProductStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Mark a product as currently in-stock.
     * </pre>
     */
    public void inStock(io.bloombox.schema.services.menu.v1beta1.ProductStock.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInStockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Mark a product as currently out-of-stock.
     * </pre>
     */
    public void outOfStock(io.bloombox.schema.services.menu.v1beta1.ProductStock.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOutOfStockMethod(), getCallOptions()), request, responseObserver);
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
     * Specifies an operation to read a full menu.
     * </pre>
     */
    public io.bloombox.schema.services.menu.v1beta1.GetMenu.Response retrieve(io.bloombox.schema.services.menu.v1beta1.GetMenu.Request request) {
      return blockingUnaryCall(
          getChannel(), getRetrieveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Begin a live menu streaming session, where changes are pushed to the listening code in real-time.
     * </pre>
     */
    public java.util.Iterator<io.bloombox.schema.services.menu.v1beta1.GetMenu.StreamEvent> live(
        io.bloombox.schema.services.menu.v1beta1.GetMenu.Request request) {
      return blockingServerStreamingCall(
          getChannel(), getLiveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Specifies an operation to read a sectioned menu.
     * </pre>
     */
    public io.bloombox.schema.services.menu.v1beta1.GetMenu.Response section(io.bloombox.schema.services.menu.v1beta1.GetMenu.Request request) {
      return blockingUnaryCall(
          getChannel(), getSectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Specifies an operation to read the list of featured products.
     * </pre>
     */
    public io.bloombox.schema.services.menu.v1beta1.GetFeatured.Response featured(io.bloombox.schema.services.menu.v1beta1.GetFeatured.Request request) {
      return blockingUnaryCall(
          getChannel(), getFeaturedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Specifies an operation to read data for product(s) by key.
     * </pre>
     */
    public io.bloombox.schema.services.menu.v1beta1.GetProduct.Response products(io.bloombox.schema.services.menu.v1beta1.GetProduct.Request request) {
      return blockingUnaryCall(
          getChannel(), getProductsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve products in a universal catalog format, based on CSV.
     * </pre>
     */
    public com.google.api.HttpBody catalog(io.bloombox.schema.services.menu.v1beta1.GetCatalog.Request request) {
      return blockingUnaryCall(
          getChannel(), getCatalogMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Specifies an operation to read a full or sectioned menu.
     * </pre>
     */
    public io.bloombox.schema.services.menu.v1beta1.SearchMenu.Response search(io.bloombox.schema.services.menu.v1beta1.SearchMenu.Request request) {
      return blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new product record from scratch.
     * </pre>
     */
    public io.bloombox.schema.services.menu.v1beta1.CreateProduct.Response create(io.bloombox.schema.services.menu.v1beta1.CreateProduct.Request request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an existing product record with new data.
     * </pre>
     */
    public com.google.protobuf.Empty update(io.bloombox.schema.services.menu.v1beta1.UpdateProduct.Request request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Mark a product as deleted.
     * </pre>
     */
    public com.google.protobuf.Empty remove(io.bloombox.schema.services.menu.v1beta1.DeleteProduct.Request request) {
      return blockingUnaryCall(
          getChannel(), getRemoveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve a single product's stock status.
     * </pre>
     */
    public com.google.protobuf.Empty productStatus(io.bloombox.schema.services.menu.v1beta1.ProductStock.Request request) {
      return blockingUnaryCall(
          getChannel(), getProductStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Mark a product as currently in-stock.
     * </pre>
     */
    public com.google.protobuf.Empty inStock(io.bloombox.schema.services.menu.v1beta1.ProductStock.Request request) {
      return blockingUnaryCall(
          getChannel(), getInStockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Mark a product as currently out-of-stock.
     * </pre>
     */
    public com.google.protobuf.Empty outOfStock(io.bloombox.schema.services.menu.v1beta1.ProductStock.Request request) {
      return blockingUnaryCall(
          getChannel(), getOutOfStockMethod(), getCallOptions(), request);
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
     * Specifies an operation to read a full menu.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.menu.v1beta1.GetMenu.Response> retrieve(
        io.bloombox.schema.services.menu.v1beta1.GetMenu.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getRetrieveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Specifies an operation to read a sectioned menu.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.menu.v1beta1.GetMenu.Response> section(
        io.bloombox.schema.services.menu.v1beta1.GetMenu.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getSectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Specifies an operation to read the list of featured products.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.menu.v1beta1.GetFeatured.Response> featured(
        io.bloombox.schema.services.menu.v1beta1.GetFeatured.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getFeaturedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Specifies an operation to read data for product(s) by key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.menu.v1beta1.GetProduct.Response> products(
        io.bloombox.schema.services.menu.v1beta1.GetProduct.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getProductsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve products in a universal catalog format, based on CSV.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.api.HttpBody> catalog(
        io.bloombox.schema.services.menu.v1beta1.GetCatalog.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getCatalogMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Specifies an operation to read a full or sectioned menu.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.menu.v1beta1.SearchMenu.Response> search(
        io.bloombox.schema.services.menu.v1beta1.SearchMenu.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a new product record from scratch.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.menu.v1beta1.CreateProduct.Response> create(
        io.bloombox.schema.services.menu.v1beta1.CreateProduct.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an existing product record with new data.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> update(
        io.bloombox.schema.services.menu.v1beta1.UpdateProduct.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Mark a product as deleted.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> remove(
        io.bloombox.schema.services.menu.v1beta1.DeleteProduct.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve a single product's stock status.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> productStatus(
        io.bloombox.schema.services.menu.v1beta1.ProductStock.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getProductStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Mark a product as currently in-stock.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> inStock(
        io.bloombox.schema.services.menu.v1beta1.ProductStock.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getInStockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Mark a product as currently out-of-stock.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> outOfStock(
        io.bloombox.schema.services.menu.v1beta1.ProductStock.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getOutOfStockMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RETRIEVE = 0;
  private static final int METHODID_LIVE = 1;
  private static final int METHODID_SECTION = 2;
  private static final int METHODID_FEATURED = 3;
  private static final int METHODID_PRODUCTS = 4;
  private static final int METHODID_CATALOG = 5;
  private static final int METHODID_SEARCH = 6;
  private static final int METHODID_CREATE = 7;
  private static final int METHODID_UPDATE = 8;
  private static final int METHODID_REMOVE = 9;
  private static final int METHODID_PRODUCT_STATUS = 10;
  private static final int METHODID_IN_STOCK = 11;
  private static final int METHODID_OUT_OF_STOCK = 12;

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
        case METHODID_RETRIEVE:
          serviceImpl.retrieve((io.bloombox.schema.services.menu.v1beta1.GetMenu.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.menu.v1beta1.GetMenu.Response>) responseObserver);
          break;
        case METHODID_LIVE:
          serviceImpl.live((io.bloombox.schema.services.menu.v1beta1.GetMenu.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.menu.v1beta1.GetMenu.StreamEvent>) responseObserver);
          break;
        case METHODID_SECTION:
          serviceImpl.section((io.bloombox.schema.services.menu.v1beta1.GetMenu.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.menu.v1beta1.GetMenu.Response>) responseObserver);
          break;
        case METHODID_FEATURED:
          serviceImpl.featured((io.bloombox.schema.services.menu.v1beta1.GetFeatured.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.menu.v1beta1.GetFeatured.Response>) responseObserver);
          break;
        case METHODID_PRODUCTS:
          serviceImpl.products((io.bloombox.schema.services.menu.v1beta1.GetProduct.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.menu.v1beta1.GetProduct.Response>) responseObserver);
          break;
        case METHODID_CATALOG:
          serviceImpl.catalog((io.bloombox.schema.services.menu.v1beta1.GetCatalog.Request) request,
              (io.grpc.stub.StreamObserver<com.google.api.HttpBody>) responseObserver);
          break;
        case METHODID_SEARCH:
          serviceImpl.search((io.bloombox.schema.services.menu.v1beta1.SearchMenu.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.menu.v1beta1.SearchMenu.Response>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((io.bloombox.schema.services.menu.v1beta1.CreateProduct.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.menu.v1beta1.CreateProduct.Response>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((io.bloombox.schema.services.menu.v1beta1.UpdateProduct.Request) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_REMOVE:
          serviceImpl.remove((io.bloombox.schema.services.menu.v1beta1.DeleteProduct.Request) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_PRODUCT_STATUS:
          serviceImpl.productStatus((io.bloombox.schema.services.menu.v1beta1.ProductStock.Request) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_IN_STOCK:
          serviceImpl.inStock((io.bloombox.schema.services.menu.v1beta1.ProductStock.Request) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_OUT_OF_STOCK:
          serviceImpl.outOfStock((io.bloombox.schema.services.menu.v1beta1.ProductStock.Request) request,
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

  private static abstract class MenuBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MenuBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.bloombox.schema.services.menu.v1beta1.MenuServiceBeta1.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Menu");
    }
  }

  private static final class MenuFileDescriptorSupplier
      extends MenuBaseDescriptorSupplier {
    MenuFileDescriptorSupplier() {}
  }

  private static final class MenuMethodDescriptorSupplier
      extends MenuBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MenuMethodDescriptorSupplier(String methodName) {
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
      synchronized (MenuGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MenuFileDescriptorSupplier())
              .addMethod(getRetrieveMethod())
              .addMethod(getLiveMethod())
              .addMethod(getSectionMethod())
              .addMethod(getFeaturedMethod())
              .addMethod(getProductsMethod())
              .addMethod(getCatalogMethod())
              .addMethod(getSearchMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getRemoveMethod())
              .addMethod(getProductStatusMethod())
              .addMethod(getInStockMethod())
              .addMethod(getOutOfStockMethod())
              .build();
        }
      }
    }
    return result;
  }
}
