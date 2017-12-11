// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: identity/User.proto

package io.bloombox.schema.identity;

public final class UserOuterClass {
  private UserOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_identity_UserKey_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_identity_UserKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_identity_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_identity_User_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_identity_User_IdentitiesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_identity_User_IdentitiesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_identity_User_MediaEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_identity_User_MediaEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_identity_UserFlags_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_identity_UserFlags_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_identity_UserIdentity_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_identity_UserIdentity_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_identity_ConsumerProfile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_identity_ConsumerProfile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_identity_MenuPreferences_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_identity_MenuPreferences_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_identity_ConsumerPreferences_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_identity_ConsumerPreferences_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_identity_ConsumerMembership_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_identity_ConsumerMembership_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_identity_IndustryProfile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_identity_IndustryProfile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_identity_IndustryProfile_PartnersEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_identity_IndustryProfile_PartnersEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023identity/User.proto\022\010identity\032\016bq_fiel" +
      "d.proto\032\025media/MediaItem.proto\032\026temporal" +
      "/Instant.proto\032\023person/Person.proto\032\021ide" +
      "ntity/ID.proto\032 identity/ids/UserDoctorR" +
      "ec.proto\032\033products/menu/Section.proto\032\022s" +
      "tructs/Grow.proto\032\025structs/Species.proto" +
      "\032$structs/labtesting/TestResults.proto\032(" +
      "security/access/PartnerPermissions.proto" +
      "\"2\n\007UserKey\022\'\n\003uid\030\001 \001(\tB\032\212@\027Unique ID f" +
      "or the user.\"\265\004\n\004User\022\013\n\003uid\030\001 \001(\t\022\"\n\005fl",
      "ags\030\002 \001(\0132\023.identity.UserFlags\022\036\n\006person" +
      "\030\003 \001(\0132\016.person.Person\022$\n\016identification" +
      "\030\024 \003(\0132\014.identity.ID\022/\n\ndoctor_rec\030\025 \003(\013" +
      "2\033.identity.ids.UserDoctorRec\022\037\n\004seen\030\036 " +
      "\001(\0132\021.temporal.Instant\022!\n\006signup\030\037 \001(\0132\021" +
      ".temporal.Instant\0222\n\nidentities\030( \003(\0132\036." +
      "identity.User.IdentitiesEntry\022(\n\005media\030)" +
      " \003(\0132\031.identity.User.MediaEntry\022+\n\010consu" +
      "mer\030d \001(\0132\031.identity.ConsumerProfile\022+\n\010" +
      "industry\030e \001(\0132\031.identity.IndustryProfil",
      "e\032I\n\017IdentitiesEntry\022\013\n\003key\030\001 \001(\t\022%\n\005val" +
      "ue\030\002 \001(\0132\026.identity.UserIdentity:\0028\001\032>\n\n" +
      "MediaEntry\022\013\n\003key\030\001 \001(\t\022\037\n\005value\030\002 \001(\0132\020" +
      ".media.MediaItem:\0028\001\"_\n\tUserFlags\022\021\n\tval" +
      "idated\030\001 \001(\010\022\021\n\tsuspended\030\002 \001(\010\022\r\n\005admin" +
      "\030\003 \001(\010\022\014\n\004beta\030\004 \001(\010\022\017\n\007sandbox\030\005 \001(\010\"i\n" +
      "\014UserIdentity\022,\n\010provider\030\001 \001(\0162\032.identi" +
      "ty.IdentityProvider\022\n\n\002id\030\002 \001(\t\022\037\n\004seen\030" +
      "\003 \001(\0132\021.temporal.Instant\"\307\001\n\017ConsumerPro" +
      "file\022\016\n\006active\030\001 \001(\010\022\035\n\025favorite_dispens",
      "aries\030\002 \003(\t\0225\n\021enrollment_source\030\003 \001(\0162\032" +
      ".identity.EnrollmentSource\022\032\n\022enrollment" +
      "_channel\030\004 \001(\t\0222\n\013preferences\030\005 \001(\0132\035.id" +
      "entity.ConsumerPreferences\"\342\002\n\017MenuPrefe" +
      "rences\022/\n\007section\030\001 \003(\0162\036.products.menu." +
      "section.Section\022,\n\007feeling\030\002 \003(\0162\033.struc" +
      "ts.labtesting.Feeling\0221\n\ntaste_note\030\003 \003(" +
      "\0162\035.structs.labtesting.TasteNote\022<\n\017desi" +
      "red_potency\030\004 \001(\0162#.structs.labtesting.P" +
      "otencyEstimate\022?\n\021cannabinoid_ratio\030\005 \001(",
      "\0162$.structs.labtesting.CannabinoidRatio\022" +
      "!\n\007species\030\006 \003(\0162\020.structs.Species\022\033\n\004gr" +
      "ow\030\007 \003(\0162\r.structs.Grow\">\n\023ConsumerPrefe" +
      "rences\022\'\n\004menu\030\n \001(\0132\031.identity.MenuPref" +
      "erences\"\301\001\n\022ConsumerMembership\0223\n\017referr" +
      "al_source\030\001 \001(\0162\032.identity.EnrollmentSou" +
      "rce\022\030\n\020referral_channel\030\002 \001(\t\022\'\n\014signed_" +
      "up_at\030\003 \001(\0132\021.temporal.Instant\022\037\n\004seen\030\004" +
      " \001(\0132\021.temporal.Instant\022\022\n\nforeign_id\030\005 " +
      "\001(\t\"\255\001\n\017IndustryProfile\022\016\n\006active\030\001 \001(\010\022",
      "9\n\010partners\030\002 \003(\0132\'.identity.IndustryPro" +
      "file.PartnersEntry\032O\n\rPartnersEntry\022\013\n\003k" +
      "ey\030\001 \001(\t\022-\n\005value\030\002 \001(\0132\036.security.acces" +
      "s.PartnerAccess:\0028\001*A\n\rUserMediaType\022\013\n\007" +
      "PICTURE\020\000\022\023\n\017DRIVERS_LICENSE\020\001\022\016\n\nDOCTOR" +
      "_REC\020\002*D\n\020IdentityProvider\022\t\n\005EMAIL\020\000\022\n\n" +
      "\006GOOGLE\020\001\022\014\n\010FACEBOOK\020\002\022\013\n\007TWITTER\020\003*l\n\020" +
      "EnrollmentSource\022\017\n\013UNSPECIFIED\020\000\022\n\n\006ONL" +
      "INE\020\001\022\020\n\014INTERNAL_APP\020\002\022\017\n\013PARTNER_APP\020\003" +
      "\022\014\n\010IN_STORE\020\004\022\n\n\006IMPORT\020\005B!\n\033io.bloombo",
      "x.schema.identityH\001P\001b\006proto3"
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
          io.bloombox.schema.media.AttachedMedia.getDescriptor(),
          io.bloombox.schema.temporal.InstantOuterClass.getDescriptor(),
          io.bloombox.schema.person.PersonOuterClass.getDescriptor(),
          io.bloombox.schema.identity.IDOuterClass.getDescriptor(),
          io.bloombox.schema.identity.ids.UserDoctorRecOuterClass.getDescriptor(),
          io.bloombox.schema.menu.section.SectionOuterClass.getDescriptor(),
          io.bloombox.schema.product.struct.MaterialGrow.getDescriptor(),
          io.bloombox.schema.product.struct.MaterialSpecies.getDescriptor(),
          io.bloombox.schema.product.struct.testing.LabTesting.getDescriptor(),
          io.bloombox.schema.security.access.PartnerPermissions.getDescriptor(),
        }, assigner);
    internal_static_identity_UserKey_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_identity_UserKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_identity_UserKey_descriptor,
        new java.lang.String[] { "Uid", });
    internal_static_identity_User_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_identity_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_identity_User_descriptor,
        new java.lang.String[] { "Uid", "Flags", "Person", "Identification", "DoctorRec", "Seen", "Signup", "Identities", "Media", "Consumer", "Industry", });
    internal_static_identity_User_IdentitiesEntry_descriptor =
      internal_static_identity_User_descriptor.getNestedTypes().get(0);
    internal_static_identity_User_IdentitiesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_identity_User_IdentitiesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_identity_User_MediaEntry_descriptor =
      internal_static_identity_User_descriptor.getNestedTypes().get(1);
    internal_static_identity_User_MediaEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_identity_User_MediaEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_identity_UserFlags_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_identity_UserFlags_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_identity_UserFlags_descriptor,
        new java.lang.String[] { "Validated", "Suspended", "Admin", "Beta", "Sandbox", });
    internal_static_identity_UserIdentity_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_identity_UserIdentity_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_identity_UserIdentity_descriptor,
        new java.lang.String[] { "Provider", "Id", "Seen", });
    internal_static_identity_ConsumerProfile_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_identity_ConsumerProfile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_identity_ConsumerProfile_descriptor,
        new java.lang.String[] { "Active", "FavoriteDispensaries", "EnrollmentSource", "EnrollmentChannel", "Preferences", });
    internal_static_identity_MenuPreferences_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_identity_MenuPreferences_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_identity_MenuPreferences_descriptor,
        new java.lang.String[] { "Section", "Feeling", "TasteNote", "DesiredPotency", "CannabinoidRatio", "Species", "Grow", });
    internal_static_identity_ConsumerPreferences_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_identity_ConsumerPreferences_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_identity_ConsumerPreferences_descriptor,
        new java.lang.String[] { "Menu", });
    internal_static_identity_ConsumerMembership_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_identity_ConsumerMembership_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_identity_ConsumerMembership_descriptor,
        new java.lang.String[] { "ReferralSource", "ReferralChannel", "SignedUpAt", "Seen", "ForeignId", });
    internal_static_identity_IndustryProfile_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_identity_IndustryProfile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_identity_IndustryProfile_descriptor,
        new java.lang.String[] { "Active", "Partners", });
    internal_static_identity_IndustryProfile_PartnersEntry_descriptor =
      internal_static_identity_IndustryProfile_descriptor.getNestedTypes().get(0);
    internal_static_identity_IndustryProfile_PartnersEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_identity_IndustryProfile_PartnersEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(gen_bq_schema.BqField.description);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    gen_bq_schema.BqField.getDescriptor();
    io.bloombox.schema.media.AttachedMedia.getDescriptor();
    io.bloombox.schema.temporal.InstantOuterClass.getDescriptor();
    io.bloombox.schema.person.PersonOuterClass.getDescriptor();
    io.bloombox.schema.identity.IDOuterClass.getDescriptor();
    io.bloombox.schema.identity.ids.UserDoctorRecOuterClass.getDescriptor();
    io.bloombox.schema.menu.section.SectionOuterClass.getDescriptor();
    io.bloombox.schema.product.struct.MaterialGrow.getDescriptor();
    io.bloombox.schema.product.struct.MaterialSpecies.getDescriptor();
    io.bloombox.schema.product.struct.testing.LabTesting.getDescriptor();
    io.bloombox.schema.security.access.PartnerPermissions.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
