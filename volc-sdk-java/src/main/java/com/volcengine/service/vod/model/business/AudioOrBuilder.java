// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_workflow.proto

package com.volcengine.service.vod.model.business;

public interface AudioOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.Audio)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string Codec = 1;</code>
   * @return The codec.
   */
  java.lang.String getCodec();
  /**
   * <code>string Codec = 1;</code>
   * @return The bytes for codec.
   */
  com.google.protobuf.ByteString
      getCodecBytes();

  /**
   * <code>int32 SampleRate = 2;</code>
   * @return The sampleRate.
   */
  int getSampleRate();

  /**
   * <code>string RateControlMode = 3;</code>
   * @return The rateControlMode.
   */
  java.lang.String getRateControlMode();
  /**
   * <code>string RateControlMode = 3;</code>
   * @return The bytes for rateControlMode.
   */
  com.google.protobuf.ByteString
      getRateControlModeBytes();

  /**
   * <code>int32 Bitrate = 4;</code>
   * @return The bitrate.
   */
  int getBitrate();

  /**
   * <code>int32 MinRate = 5;</code>
   * @return The minRate.
   */
  int getMinRate();

  /**
   * <code>int32 MaxRate = 6;</code>
   * @return The maxRate.
   */
  int getMaxRate();

  /**
   * <code>int32 Channels = 7;</code>
   * @return The channels.
   */
  int getChannels();

  /**
   * <code>string Profile = 8;</code>
   * @return The profile.
   */
  java.lang.String getProfile();
  /**
   * <code>string Profile = 8;</code>
   * @return The bytes for profile.
   */
  com.google.protobuf.ByteString
      getProfileBytes();
}
