// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: partner/Partner.proto

package io.bloombox.schema.partner;

public final class PartnerOuterClass {
  private PartnerOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_partner_PartnerKey_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_partner_PartnerKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_partner_Partner_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_partner_Partner_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_partner_PartnerFlags_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_partner_PartnerFlags_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025partner/Partner.proto\022\027bloombox.schema" +
      ".partner\032\016bq_field.proto\032\025media/MediaIte" +
      "m.proto\032\026temporal/Instant.proto\032\031contact" +
      "/ContactInfo.proto\"\\\n\nPartnerKey\022N\n\004code" +
      "\030\001 \001(\tB@\212@=Short string that uniquely id" +
      "entifies a partner organization.\"\353\006\n\007Par" +
      "tner\022Q\n\004code\030\001 \001(\tBC\212@@Short string that" +
      " uniquely identifies this partner organi" +
      "zation.\022I\n\004name\030\002 \001(\tB;\212@8Full human-rea" +
      "dable label for this partner organizatio" +
      "n.\022m\n\005flags\030\003 \001(\0132%.bloombox.schema.part" +
      "ner.PartnerFlagsB7\212@4Flags for various t" +
      "hings about this partner account.\022>\n\nleg" +
      "al_name\030\004 \001(\tB*\212@\'Legal name of the part" +
      "ner organization.\022a\n\007contact\030\005 \001(\0132!.ope" +
      "ncannabis.contact.ContactInfoB-\212@*Contac" +
      "t information for this organization.\022_\n\010" +
      "branding\030\006 \001(\0132\035.opencannabis.media.Medi" +
      "aItemB.\212@+Branding information for this " +
      "organization.\022\205\001\n\007channel\030\007 \001(\0162\'.bloomb" +
      "ox.schema.partner.PartnerChannelBK\212@HCha" +
      "nnel through which this partner organiza" +
      "tion interacts with Bloombox.\022_\n\007created" +
      "\030d \001(\0132\036.opencannabis.temporal.InstantB." +
      "\212@+Timestamp for when this record was cr" +
      "eated.\022f\n\010modified\030e \001(\0132\036.opencannabis." +
      "temporal.InstantB4\212@1Timestamp for when " +
      "this record was last modified.\"\336\005\n\014Partn" +
      "erFlags\022\242\001\n\tsuspended\030\001 \001(\010B\216\001\212@\212\001Specif" +
      "ies that the subject partner organizatio" +
      "n is currently suspended, organization w" +
      "ide, and has had access revoked to Bloom" +
      "box systems.\022\260\001\n\007pastdue\030\002 \001(\010B\236\001\212@\232\001Spe" +
      "cifies that the subject partner organizt" +
      "aion is currently in a past-due state, w" +
      "here their organization and related acce" +
      "ss has been heavily restricted.\022t\n\004beta\030" +
      "\003 \001(\010Bf\212@cSpecifies that the subject par" +
      "tner organization has access to beta fea" +
      "tures, clusters, and systems.\022`\n\007sandbox" +
      "\030\004 \001(\010BO\212@LSpecifies that the subject pa" +
      "rtner organization has internal sandbox " +
      "access.\022\235\001\n\010internal\030\005 \001(\010B\212\001\212@\206\001Specifi" +
      "es that the subject partner organization" +
      " is a testing account held and managed i" +
      "nternally by Bloombox, or by selected pa" +
      "rtners.*\034\n\016PartnerChannel\022\n\n\006DIRECT\020\000B&\n" +
      "\032io.bloombox.schema.partnerH\001P\001\242\002\003BBSb\006p" +
      "roto3"
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
          gen_bq_schema.BqField.getDescriptor(),
          io.opencannabis.schema.media.AttachedMedia.getDescriptor(),
          io.opencannabis.schema.temporal.InstantOuterClass.getDescriptor(),
          io.opencannabis.schema.contact.ContactInfoOuterClass.getDescriptor(),
        }, assigner);
    internal_static_bloombox_schema_partner_PartnerKey_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bloombox_schema_partner_PartnerKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_partner_PartnerKey_descriptor,
        new java.lang.String[] { "Code", });
    internal_static_bloombox_schema_partner_Partner_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_bloombox_schema_partner_Partner_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_partner_Partner_descriptor,
        new java.lang.String[] { "Code", "Name", "Flags", "LegalName", "Contact", "Branding", "Channel", "Created", "Modified", });
    internal_static_bloombox_schema_partner_PartnerFlags_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_bloombox_schema_partner_PartnerFlags_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_partner_PartnerFlags_descriptor,
        new java.lang.String[] { "Suspended", "Pastdue", "Beta", "Sandbox", "Internal", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(gen_bq_schema.BqField.description);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    gen_bq_schema.BqField.getDescriptor();
    io.opencannabis.schema.media.AttachedMedia.getDescriptor();
    io.opencannabis.schema.temporal.InstantOuterClass.getDescriptor();
    io.opencannabis.schema.contact.ContactInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
