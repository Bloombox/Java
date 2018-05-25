// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: media/v1beta1/MediaService_Beta1.proto

package io.bloombox.schema.services.media.v1beta1;

public interface MediaSubjectOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bloombox.schema.services.media.v1beta1.MediaSubject)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of this media item, with regard to it's subject parent. Optional.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of this media item, with regard to it's subject parent. Optional.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Specify a product key as the subject parent of this media.
   * </pre>
   *
   * <code>.opencannabis.base.ProductKey product = 2;</code>
   */
  boolean hasProduct();
  /**
   * <pre>
   * Specify a product key as the subject parent of this media.
   * </pre>
   *
   * <code>.opencannabis.base.ProductKey product = 2;</code>
   */
  io.opencannabis.schema.base.ProductKey getProduct();
  /**
   * <pre>
   * Specify a product key as the subject parent of this media.
   * </pre>
   *
   * <code>.opencannabis.base.ProductKey product = 2;</code>
   */
  io.opencannabis.schema.base.ProductKeyOrBuilder getProductOrBuilder();

  /**
   * <pre>
   * Specify a partner as the subject parent of this media.
   * </pre>
   *
   * <code>.bloombox.schema.partner.PartnerKey partner = 3;</code>
   */
  boolean hasPartner();
  /**
   * <pre>
   * Specify a partner as the subject parent of this media.
   * </pre>
   *
   * <code>.bloombox.schema.partner.PartnerKey partner = 3;</code>
   */
  io.bloombox.schema.partner.PartnerKey getPartner();
  /**
   * <pre>
   * Specify a partner as the subject parent of this media.
   * </pre>
   *
   * <code>.bloombox.schema.partner.PartnerKey partner = 3;</code>
   */
  io.bloombox.schema.partner.PartnerKeyOrBuilder getPartnerOrBuilder();

  /**
   * <pre>
   * Specify a partner and location as the subject parent of this media.
   * </pre>
   *
   * <code>.bloombox.schema.partner.PartnerLocationKey location = 4;</code>
   */
  boolean hasLocation();
  /**
   * <pre>
   * Specify a partner and location as the subject parent of this media.
   * </pre>
   *
   * <code>.bloombox.schema.partner.PartnerLocationKey location = 4;</code>
   */
  io.bloombox.schema.partner.PartnerLocationKey getLocation();
  /**
   * <pre>
   * Specify a partner and location as the subject parent of this media.
   * </pre>
   *
   * <code>.bloombox.schema.partner.PartnerLocationKey location = 4;</code>
   */
  io.bloombox.schema.partner.PartnerLocationKeyOrBuilder getLocationOrBuilder();

  /**
   * <pre>
   * Specify this media as global. This is a special flag that should only be used internally.
   * </pre>
   *
   * <code>bool global = 5;</code>
   */
  boolean getGlobal();

  public io.bloombox.schema.services.media.v1beta1.MediaSubject.AttachmentCase getAttachmentCase();
}
