// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_edit.proto

package com.volcengine.service.vod.model.business;

public interface CodecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.Codec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 AudioBitrate = 1;</code>
   * @return The audioBitrate.
   */
  int getAudioBitrate();

  /**
   * <code>string AudioCodec = 2;</code>
   * @return The audioCodec.
   */
  java.lang.String getAudioCodec();
  /**
   * <code>string AudioCodec = 2;</code>
   * @return The bytes for audioCodec.
   */
  com.google.protobuf.ByteString
      getAudioCodecBytes();

  /**
   * <code>int32 Crf = 3;</code>
   * @return The crf.
   */
  int getCrf();

  /**
   * <code>string Preset = 4;</code>
   * @return The preset.
   */
  java.lang.String getPreset();
  /**
   * <code>string Preset = 4;</code>
   * @return The bytes for preset.
   */
  com.google.protobuf.ByteString
      getPresetBytes();

  /**
   * <code>string VideoCodec = 5;</code>
   * @return The videoCodec.
   */
  java.lang.String getVideoCodec();
  /**
   * <code>string VideoCodec = 5;</code>
   * @return The bytes for videoCodec.
   */
  com.google.protobuf.ByteString
      getVideoCodecBytes();
}
