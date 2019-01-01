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
// source: structs/Species.proto

package io.opencannabis.schema.product.struct;

public final class MaterialSpecies {
  private MaterialSpecies() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025structs/Species.proto\022\024opencannabis.st" +
      "ructs*d\n\007Species\022\017\n\013UNSPECIFIED\020\000\022\n\n\006SAT" +
      "IVA\020\001\022\021\n\rHYBRID_SATIVA\020\002\022\n\n\006HYBRID\020\003\022\021\n\r" +
      "HYBRID_INDICA\020\004\022\n\n\006INDICA\020\005BB\n%io.openca" +
      "nnabis.schema.product.structB\017MaterialSp" +
      "eciesH\001P\001\242\002\003OCSb\006proto3"
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
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
