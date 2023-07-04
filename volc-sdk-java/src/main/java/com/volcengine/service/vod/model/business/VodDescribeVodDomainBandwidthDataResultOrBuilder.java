// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_cdn.proto

package com.volcengine.service.vod.model.business;

public interface VodDescribeVodDomainBandwidthDataResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.VodDescribeVodDomainBandwidthDataResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 域名列表
   * </pre>
   *
   * <code>repeated string DomainList = 1;</code>
   * @return A list containing the domainList.
   */
  java.util.List<java.lang.String>
      getDomainListList();
  /**
   * <pre>
   * 域名列表
   * </pre>
   *
   * <code>repeated string DomainList = 1;</code>
   * @return The count of domainList.
   */
  int getDomainListCount();
  /**
   * <pre>
   * 域名列表
   * </pre>
   *
   * <code>repeated string DomainList = 1;</code>
   * @param index The index of the element to return.
   * @return The domainList at the given index.
   */
  java.lang.String getDomainList(int index);
  /**
   * <pre>
   * 域名列表
   * </pre>
   *
   * <code>repeated string DomainList = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the domainList at the given index.
   */
  com.google.protobuf.ByteString
      getDomainListBytes(int index);

  /**
   * <pre>
   * 查询的起始时间
   * </pre>
   *
   * <code>string StartTime = 2;</code>
   * @return The startTime.
   */
  java.lang.String getStartTime();
  /**
   * <pre>
   * 查询的起始时间
   * </pre>
   *
   * <code>string StartTime = 2;</code>
   * @return The bytes for startTime.
   */
  com.google.protobuf.ByteString
      getStartTimeBytes();

  /**
   * <pre>
   * 查询的结束时间
   * </pre>
   *
   * <code>string EndTime = 3;</code>
   * @return The endTime.
   */
  java.lang.String getEndTime();
  /**
   * <pre>
   * 查询的结束时间
   * </pre>
   *
   * <code>string EndTime = 3;</code>
   * @return The bytes for endTime.
   */
  com.google.protobuf.ByteString
      getEndTimeBytes();

  /**
   * <pre>
   * 聚合的时间粒度
   * </pre>
   *
   * <code>int32 Aggregation = 4;</code>
   * @return The aggregation.
   */
  int getAggregation();

  /**
   * <pre>
   * 默认是CDN，支持CDN、PCDN、ALL
   * </pre>
   *
   * <code>string BandwidthType = 5;</code>
   * @return The bandwidthType.
   */
  java.lang.String getBandwidthType();
  /**
   * <pre>
   * 默认是CDN，支持CDN、PCDN、ALL
   * </pre>
   *
   * <code>string BandwidthType = 5;</code>
   * @return The bytes for bandwidthType.
   */
  com.google.protobuf.ByteString
      getBandwidthTypeBytes();

  /**
   * <pre>
   * 带宽峰值，单位为Mbps
   * </pre>
   *
   * <code>double PeakBandwidth = 6;</code>
   * @return The peakBandwidth.
   */
  double getPeakBandwidth();

  /**
   * <pre>
   * 带宽峰值出现的时间
   * </pre>
   *
   * <code>string PeakBandwidthTime = 7;</code>
   * @return The peakBandwidthTime.
   */
  java.lang.String getPeakBandwidthTime();
  /**
   * <pre>
   * 带宽峰值出现的时间
   * </pre>
   *
   * <code>string PeakBandwidthTime = 7;</code>
   * @return The bytes for peakBandwidthTime.
   */
  com.google.protobuf.ByteString
      getPeakBandwidthTimeBytes();

  /**
   * <pre>
   * 所有时间粒度数据
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodBandwidthData BandwidthDataList = 8;</code>
   */
  java.util.List<com.volcengine.service.vod.model.business.VodBandwidthData> 
      getBandwidthDataListList();
  /**
   * <pre>
   * 所有时间粒度数据
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodBandwidthData BandwidthDataList = 8;</code>
   */
  com.volcengine.service.vod.model.business.VodBandwidthData getBandwidthDataList(int index);
  /**
   * <pre>
   * 所有时间粒度数据
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodBandwidthData BandwidthDataList = 8;</code>
   */
  int getBandwidthDataListCount();
  /**
   * <pre>
   * 所有时间粒度数据
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodBandwidthData BandwidthDataList = 8;</code>
   */
  java.util.List<? extends com.volcengine.service.vod.model.business.VodBandwidthDataOrBuilder> 
      getBandwidthDataListOrBuilderList();
  /**
   * <pre>
   * 所有时间粒度数据
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodBandwidthData BandwidthDataList = 8;</code>
   */
  com.volcengine.service.vod.model.business.VodBandwidthDataOrBuilder getBandwidthDataListOrBuilder(
      int index);
}
