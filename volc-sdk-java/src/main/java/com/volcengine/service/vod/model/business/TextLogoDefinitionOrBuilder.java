// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_workflow.proto

package com.volcengine.service.vod.model.business;

public interface TextLogoDefinitionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.TextLogoDefinition)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string Content = 1;</code>
   * @return The content.
   */
  java.lang.String getContent();
  /**
   * <code>string Content = 1;</code>
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString
      getContentBytes();

  /**
   * <code>string FontType = 2;</code>
   * @return The fontType.
   */
  java.lang.String getFontType();
  /**
   * <code>string FontType = 2;</code>
   * @return The bytes for fontType.
   */
  com.google.protobuf.ByteString
      getFontTypeBytes();

  /**
   * <code>int32 FontSize = 3;</code>
   * @return The fontSize.
   */
  int getFontSize();

  /**
   * <code>string FontColor = 4;</code>
   * @return The fontColor.
   */
  java.lang.String getFontColor();
  /**
   * <code>string FontColor = 4;</code>
   * @return The bytes for fontColor.
   */
  com.google.protobuf.ByteString
      getFontColorBytes();

  /**
   * <code>int32 StartTime = 5;</code>
   * @return The startTime.
   */
  int getStartTime();

  /**
   * <code>int32 EndTime = 6;</code>
   * @return The endTime.
   */
  int getEndTime();

  /**
   * <code>string Locate = 7;</code>
   * @return The locate.
   */
  java.lang.String getLocate();
  /**
   * <code>string Locate = 7;</code>
   * @return The bytes for locate.
   */
  com.google.protobuf.ByteString
      getLocateBytes();

  /**
   * <code>int32 PosX = 8;</code>
   * @return The posX.
   */
  int getPosX();

  /**
   * <code>int32 PosY = 9;</code>
   * @return The posY.
   */
  int getPosY();

  /**
   * <code>int32 SizeX = 10;</code>
   * @return The sizeX.
   */
  int getSizeX();

  /**
   * <code>int32 sizeY = 11;</code>
   * @return The sizeY.
   */
  int getSizeY();
}
