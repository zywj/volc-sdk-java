// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_apps_manage.proto

package com.volcengine.service.vod.model.business;

public interface VodGetAppInfoResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.VodGetAppInfoResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * appcloud应用的Id
   * </pre>
   *
   * <code>uint64 AppId = 1;</code>
   * @return The appId.
   */
  long getAppId();

  /**
   * <pre>
   *扫码唤起sdk的关键
   * </pre>
   *
   * <code>string Scheme = 2;</code>
   * @return The scheme.
   */
  java.lang.String getScheme();
  /**
   * <pre>
   *扫码唤起sdk的关键
   * </pre>
   *
   * <code>string Scheme = 2;</code>
   * @return The bytes for scheme.
   */
  com.google.protobuf.ByteString
      getSchemeBytes();

  /**
   * <pre>
   * App英文名
   * </pre>
   *
   * <code>string AppEnName = 3;</code>
   * @return The appEnName.
   */
  java.lang.String getAppEnName();
  /**
   * <pre>
   * App英文名
   * </pre>
   *
   * <code>string AppEnName = 3;</code>
   * @return The bytes for appEnName.
   */
  com.google.protobuf.ByteString
      getAppEnNameBytes();

  /**
   * <pre>
   * App中文名
   * </pre>
   *
   * <code>string AppCnName = 4;</code>
   * @return The appCnName.
   */
  java.lang.String getAppCnName();
  /**
   * <pre>
   * App中文名
   * </pre>
   *
   * <code>string AppCnName = 4;</code>
   * @return The bytes for appCnName.
   */
  com.google.protobuf.ByteString
      getAppCnNameBytes();
}
