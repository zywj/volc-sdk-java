// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_cdn.proto

package com.volcengine.service.vod.model.business;

public interface VodCdnAccessLogInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.VodCdnAccessLogInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 域名
   * </pre>
   *
   * <code>string Domain = 1;</code>
   * @return The domain.
   */
  java.lang.String getDomain();
  /**
   * <pre>
   * 域名
   * </pre>
   *
   * <code>string Domain = 1;</code>
   * @return The bytes for domain.
   */
  com.google.protobuf.ByteString
      getDomainBytes();

  /**
   * <pre>
   * 日志列表
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodCdnAccessLogElement LogList = 2;</code>
   */
  java.util.List<com.volcengine.service.vod.model.business.VodCdnAccessLogElement> 
      getLogListList();
  /**
   * <pre>
   * 日志列表
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodCdnAccessLogElement LogList = 2;</code>
   */
  com.volcengine.service.vod.model.business.VodCdnAccessLogElement getLogList(int index);
  /**
   * <pre>
   * 日志列表
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodCdnAccessLogElement LogList = 2;</code>
   */
  int getLogListCount();
  /**
   * <pre>
   * 日志列表
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodCdnAccessLogElement LogList = 2;</code>
   */
  java.util.List<? extends com.volcengine.service.vod.model.business.VodCdnAccessLogElementOrBuilder> 
      getLogListOrBuilderList();
  /**
   * <pre>
   * 日志列表
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodCdnAccessLogElement LogList = 2;</code>
   */
  com.volcengine.service.vod.model.business.VodCdnAccessLogElementOrBuilder getLogListOrBuilder(
      int index);
}
