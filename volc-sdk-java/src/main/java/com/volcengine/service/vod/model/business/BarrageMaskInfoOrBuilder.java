// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_common.proto

package com.volcengine.service.vod.model.business;

public interface BarrageMaskInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.BarrageMaskInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 弹幕蒙板版本v1,v2...
   * </pre>
   *
   * <code>string Version = 1;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <pre>
   * 弹幕蒙板版本v1,v2...
   * </pre>
   *
   * <code>string Version = 1;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <pre>
   * 弹幕蒙板url
   * </pre>
   *
   * <code>string BarrageMaskUrl = 2;</code>
   * @return The barrageMaskUrl.
   */
  java.lang.String getBarrageMaskUrl();
  /**
   * <pre>
   * 弹幕蒙板url
   * </pre>
   *
   * <code>string BarrageMaskUrl = 2;</code>
   * @return The bytes for barrageMaskUrl.
   */
  com.google.protobuf.ByteString
      getBarrageMaskUrlBytes();

  /**
   * <pre>
   * 弹幕蒙板文件Id
   * </pre>
   *
   * <code>string FileId = 3;</code>
   * @return The fileId.
   */
  java.lang.String getFileId();
  /**
   * <pre>
   * 弹幕蒙板文件Id
   * </pre>
   *
   * <code>string FileId = 3;</code>
   * @return The bytes for fileId.
   */
  com.google.protobuf.ByteString
      getFileIdBytes();

  /**
   * <pre>
   * 弹幕蒙板文件大小
   * </pre>
   *
   * <code>double FileSize = 4;</code>
   * @return The fileSize.
   */
  double getFileSize();

  /**
   * <pre>
   * 弹幕蒙板文件哈希
   * </pre>
   *
   * <code>string FileHash = 5;</code>
   * @return The fileHash.
   */
  java.lang.String getFileHash();
  /**
   * <pre>
   * 弹幕蒙板文件哈希
   * </pre>
   *
   * <code>string FileHash = 5;</code>
   * @return The bytes for fileHash.
   */
  com.google.protobuf.ByteString
      getFileHashBytes();

  /**
   * <pre>
   * 弹幕蒙板文件更新日期
   * </pre>
   *
   * <code>string UpdatedAt = 6;</code>
   * @return The updatedAt.
   */
  java.lang.String getUpdatedAt();
  /**
   * <pre>
   * 弹幕蒙板文件更新日期
   * </pre>
   *
   * <code>string UpdatedAt = 6;</code>
   * @return The bytes for updatedAt.
   */
  com.google.protobuf.ByteString
      getUpdatedAtBytes();

  /**
   * <pre>
   * 弹幕蒙板文件码率
   * </pre>
   *
   * <code>int32 Bitrate = 7;</code>
   * @return The bitrate.
   */
  int getBitrate();

  /**
   * <pre>
   * 弹幕蒙板文件头部大小
   * </pre>
   *
   * <code>double HeadLen = 8;</code>
   * @return The headLen.
   */
  double getHeadLen();
}
