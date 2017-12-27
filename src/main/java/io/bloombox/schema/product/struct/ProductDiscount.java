// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: structs/pricing/SaleDescriptor.proto

package io.bloombox.schema.product.struct;

public final class ProductDiscount {
  private ProductDiscount() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_structs_pricing_PercentageDiscount_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_structs_pricing_PercentageDiscount_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_structs_pricing_BOGODiscount_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_structs_pricing_BOGODiscount_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_structs_pricing_LoyaltyDiscount_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_structs_pricing_LoyaltyDiscount_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_structs_pricing_SaleDescriptor_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_structs_pricing_SaleDescriptor_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$structs/pricing/SaleDescriptor.proto\022\017" +
      "structs.pricing\032\026temporal/Instant.proto\"" +
      "&\n\022PercentageDiscount\022\020\n\010discount\030\024 \001(\r\"" +
      "/\n\014BOGODiscount\022\017\n\007trigger\030\025 \001(\r\022\016\n\006rewa" +
      "rd\030\026 \001(\r\"2\n\017LoyaltyDiscount\022\017\n\007trigger\030\027" +
      " \001(\r\022\016\n\006reward\030\030 \001(\r\"\261\002\n\016SaleDescriptor\022" +
      "\'\n\004type\030\001 \001(\0162\031.structs.pricing.SaleType" +
      "\022$\n\teffective\030\002 \001(\0132\021.temporal.Instant\022%" +
      "\n\nexpiration\030\003 \001(\0132\021.temporal.Instant\022=\n" +
      "\016percentage_off\030\004 \001(\0132#.structs.pricing." +
      "PercentageDiscountH\000\022-\n\004bogo\030\005 \001(\0132\035.str" +
      "ucts.pricing.BOGODiscountH\000\0223\n\007loyalty\030\006" +
      " \001(\0132 .structs.pricing.LoyaltyDiscountH\000" +
      "B\006\n\004sale*5\n\010SaleType\022\022\n\016PERCENTAGE_OFF\020\000" +
      "\022\010\n\004BOGO\020\001\022\013\n\007LOYALTY\020\002B;\n!io.bloombox.s" +
      "chema.product.structB\017ProductDiscountH\001P" +
      "\001\370\001\001b\006proto3"
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
          io.bloombox.schema.temporal.InstantOuterClass.getDescriptor(),
        }, assigner);
    internal_static_structs_pricing_PercentageDiscount_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_structs_pricing_PercentageDiscount_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_structs_pricing_PercentageDiscount_descriptor,
        new java.lang.String[] { "Discount", });
    internal_static_structs_pricing_BOGODiscount_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_structs_pricing_BOGODiscount_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_structs_pricing_BOGODiscount_descriptor,
        new java.lang.String[] { "Trigger", "Reward", });
    internal_static_structs_pricing_LoyaltyDiscount_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_structs_pricing_LoyaltyDiscount_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_structs_pricing_LoyaltyDiscount_descriptor,
        new java.lang.String[] { "Trigger", "Reward", });
    internal_static_structs_pricing_SaleDescriptor_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_structs_pricing_SaleDescriptor_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_structs_pricing_SaleDescriptor_descriptor,
        new java.lang.String[] { "Type", "Effective", "Expiration", "PercentageOff", "Bogo", "Loyalty", "Sale", });
    io.bloombox.schema.temporal.InstantOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
