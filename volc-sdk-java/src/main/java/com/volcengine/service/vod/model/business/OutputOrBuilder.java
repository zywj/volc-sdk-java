// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_edit.proto

package com.volcengine.service.vod.model.business;

public interface OutputOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.Output)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool Alpha = 1;</code>
   * @return The alpha.
   */
  boolean getAlpha();

  /**
   * <code>.Volcengine.Vod.Models.Business.Codec Codec = 2;</code>
   * @return Whether the codec field is set.
   */
  boolean hasCodec();
  /**
   * <code>.Volcengine.Vod.Models.Business.Codec Codec = 2;</code>
   * @return The codec.
   */
  com.volcengine.service.vod.model.business.Codec getCodec();
  /**
   * <code>.Volcengine.Vod.Models.Business.Codec Codec = 2;</code>
   */
  com.volcengine.service.vod.model.business.CodecOrBuilder getCodecOrBuilder();

  /**
   * <code>bool DisableAudio = 3;</code>
   * @return The disableAudio.
   */
  boolean getDisableAudio();

  /**
   * <code>bool DisableVideo = 4;</code>
   * @return The disableVideo.
   */
  boolean getDisableVideo();

  /**
   * <code>int32 Fps = 5;</code>
   * @return The fps.
   */
  int getFps();
}
