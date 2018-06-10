// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: media/v1beta1/MediaService_Beta1.proto

package io.bloombox.schema.services.media.v1beta1;

public interface MediaFileOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bloombox.schema.services.media.v1beta1.MediaFile)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the file being uploaded.
   * </pre>
   *
   * <code>string filename = 1;</code>
   */
  java.lang.String getFilename();
  /**
   * <pre>
   * Name of the file being uploaded.
   * </pre>
   *
   * <code>string filename = 1;</code>
   */
  com.google.protobuf.ByteString
      getFilenameBytes();

  /**
   * <pre>
   * Content mime-type of the file being uploaded, if known.
   * </pre>
   *
   * <code>string mimetype = 2;</code>
   */
  java.lang.String getMimetype();
  /**
   * <pre>
   * Content mime-type of the file being uploaded, if known.
   * </pre>
   *
   * <code>string mimetype = 2;</code>
   */
  com.google.protobuf.ByteString
      getMimetypeBytes();
}
