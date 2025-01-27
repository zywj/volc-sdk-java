// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_edit.proto

package com.volcengine.service.vod.model.business;

public interface EditParamOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.EditParam)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Volcengine.Vod.Models.Business.Canvas Canvas = 1;</code>
   * @return Whether the canvas field is set.
   */
  boolean hasCanvas();
  /**
   * <code>.Volcengine.Vod.Models.Business.Canvas Canvas = 1;</code>
   * @return The canvas.
   */
  com.volcengine.service.vod.model.business.Canvas getCanvas();
  /**
   * <code>.Volcengine.Vod.Models.Business.Canvas Canvas = 1;</code>
   */
  com.volcengine.service.vod.model.business.CanvasOrBuilder getCanvasOrBuilder();

  /**
   * <code>.Volcengine.Vod.Models.Business.Output Output = 2;</code>
   * @return Whether the output field is set.
   */
  boolean hasOutput();
  /**
   * <code>.Volcengine.Vod.Models.Business.Output Output = 2;</code>
   * @return The output.
   */
  com.volcengine.service.vod.model.business.Output getOutput();
  /**
   * <code>.Volcengine.Vod.Models.Business.Output Output = 2;</code>
   */
  com.volcengine.service.vod.model.business.OutputOrBuilder getOutputOrBuilder();

  /**
   * <code>repeated .google.protobuf.Value Track = 3;</code>
   */
  java.util.List<com.google.protobuf.Value> 
      getTrackList();
  /**
   * <code>repeated .google.protobuf.Value Track = 3;</code>
   */
  com.google.protobuf.Value getTrack(int index);
  /**
   * <code>repeated .google.protobuf.Value Track = 3;</code>
   */
  int getTrackCount();
  /**
   * <code>repeated .google.protobuf.Value Track = 3;</code>
   */
  java.util.List<? extends com.google.protobuf.ValueOrBuilder> 
      getTrackOrBuilderList();
  /**
   * <code>repeated .google.protobuf.Value Track = 3;</code>
   */
  com.google.protobuf.ValueOrBuilder getTrackOrBuilder(
      int index);

  /**
   * <code>.Volcengine.Vod.Models.Business.Upload Upload = 4;</code>
   * @return Whether the upload field is set.
   */
  boolean hasUpload();
  /**
   * <code>.Volcengine.Vod.Models.Business.Upload Upload = 4;</code>
   * @return The upload.
   */
  com.volcengine.service.vod.model.business.Upload getUpload();
  /**
   * <code>.Volcengine.Vod.Models.Business.Upload Upload = 4;</code>
   */
  com.volcengine.service.vod.model.business.UploadOrBuilder getUploadOrBuilder();

  /**
   * <code>string Uploader = 5;</code>
   * @return The uploader.
   */
  java.lang.String getUploader();
  /**
   * <code>string Uploader = 5;</code>
   * @return The bytes for uploader.
   */
  com.google.protobuf.ByteString
      getUploaderBytes();
}
