/*
 * Copyright 2018, Momentum Ideas, Co. All rights reserved.
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

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proximity/BluetoothBeacon.proto

package io.opencannabis.schema.proximity;

public final class BluetoothBeaconOuterClass {
  private BluetoothBeaconOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_proximity_BluetoothBeacon_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_proximity_BluetoothBeacon_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037proximity/BluetoothBeacon.proto\022\026openc" +
      "annabis.proximity\032\022geo/Location.proto\032\022g" +
      "eo/Distance.proto\032\026temporal/Instant.prot" +
      "o\"\317\001\n\017BluetoothBeacon\022\014\n\004uuid\030\001 \001(\t\022\r\n\005m" +
      "ajor\030\002 \001(\r\022\r\n\005minor\030\003 \001(\r\022,\n\004seen\030\004 \001(\0132" +
      "\036.opencannabis.temporal.Instant\022,\n\010locat" +
      "ion\030\005 \001(\0132\032.opencannabis.geo.Location\0224\n" +
      "\010accuracy\030\006 \001(\0132\".opencannabis.geo.Locat" +
      "ionAccuracyB,\n io.opencannabis.schema.pr" +
      "oximityH\001P\001\242\002\003OCSb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.opencannabis.schema.geo.LocationOuterClass.getDescriptor(),
          io.opencannabis.schema.geo.DistanceOuterClass.getDescriptor(),
          io.opencannabis.schema.temporal.TemporalInstant.getDescriptor(),
        }, assigner);
    internal_static_opencannabis_proximity_BluetoothBeacon_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opencannabis_proximity_BluetoothBeacon_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_proximity_BluetoothBeacon_descriptor,
        new java.lang.String[] { "Uuid", "Major", "Minor", "Seen", "Location", "Accuracy", });
    io.opencannabis.schema.geo.LocationOuterClass.getDescriptor();
    io.opencannabis.schema.geo.DistanceOuterClass.getDescriptor();
    io.opencannabis.schema.temporal.TemporalInstant.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
