// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_edit.proto

package com.volcengine.service.vod.model.business;

public interface TrackOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.Track)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string ID = 1;</code>
   * @return The iD.
   */
  java.lang.String getID();
  /**
   * <code>string ID = 1;</code>
   * @return The bytes for iD.
   */
  com.google.protobuf.ByteString
      getIDBytes();

  /**
   * <code>string Source = 2;</code>
   * @return The source.
   */
  java.lang.String getSource();
  /**
   * <code>string Source = 2;</code>
   * @return The bytes for source.
   */
  com.google.protobuf.ByteString
      getSourceBytes();

  /**
   * <code>repeated int32 TargetTime = 3;</code>
   * @return A list containing the targetTime.
   */
  java.util.List<java.lang.Integer> getTargetTimeList();
  /**
   * <code>repeated int32 TargetTime = 3;</code>
   * @return The count of targetTime.
   */
  int getTargetTimeCount();
  /**
   * <code>repeated int32 TargetTime = 3;</code>
   * @param index The index of the element to return.
   * @return The targetTime at the given index.
   */
  int getTargetTime(int index);

  /**
   * <code>string Type = 4;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <code>string Type = 4;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();
}
