// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Request.VodListCdnStatusDataRequest}
 */
public final class VodListCdnStatusDataRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Request.VodListCdnStatusDataRequest)
    VodListCdnStatusDataRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodListCdnStatusDataRequest.newBuilder() to construct.
  private VodListCdnStatusDataRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodListCdnStatusDataRequest() {
    domains_ = "";
    interval_ = "";
    dataType_ = "";
    metric_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodListCdnStatusDataRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodListCdnStatusDataRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            domains_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            interval_ = s;
            break;
          }
          case 24: {

            startTimestamp_ = input.readInt64();
            break;
          }
          case 32: {

            endTimestamp_ = input.readInt64();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            dataType_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            metric_ = s;
            break;
          }
          case 56: {

            needDetail_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodListCdnStatusDataRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodListCdnStatusDataRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.request.VodListCdnStatusDataRequest.class, com.volcengine.service.vod.model.request.VodListCdnStatusDataRequest.Builder.class);
  }

  public static final int DOMAINS_FIELD_NUMBER = 1;
  private volatile java.lang.Object domains_;
  /**
   * <pre>
   * 域名，多个用逗号隔开 
   * </pre>
   *
   * <code>string Domains = 1;</code>
   * @return The domains.
   */
  @java.lang.Override
  public java.lang.String getDomains() {
    java.lang.Object ref = domains_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      domains_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 域名，多个用逗号隔开 
   * </pre>
   *
   * <code>string Domains = 1;</code>
   * @return The bytes for domains.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDomainsBytes() {
    java.lang.Object ref = domains_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      domains_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INTERVAL_FIELD_NUMBER = 2;
  private volatile java.lang.Object interval_;
  /**
   * <pre>
   * 聚合度 
   * </pre>
   *
   * <code>string Interval = 2;</code>
   * @return The interval.
   */
  @java.lang.Override
  public java.lang.String getInterval() {
    java.lang.Object ref = interval_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      interval_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 聚合度 
   * </pre>
   *
   * <code>string Interval = 2;</code>
   * @return The bytes for interval.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIntervalBytes() {
    java.lang.Object ref = interval_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      interval_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STARTTIMESTAMP_FIELD_NUMBER = 3;
  private long startTimestamp_;
  /**
   * <pre>
   * 查询范围起始时间 
   * </pre>
   *
   * <code>int64 StartTimestamp = 3;</code>
   * @return The startTimestamp.
   */
  @java.lang.Override
  public long getStartTimestamp() {
    return startTimestamp_;
  }

  public static final int ENDTIMESTAMP_FIELD_NUMBER = 4;
  private long endTimestamp_;
  /**
   * <pre>
   * 查询范围截止时间 
   * </pre>
   *
   * <code>int64 EndTimestamp = 4;</code>
   * @return The endTimestamp.
   */
  @java.lang.Override
  public long getEndTimestamp() {
    return endTimestamp_;
  }

  public static final int DATATYPE_FIELD_NUMBER = 5;
  private volatile java.lang.Object dataType_;
  /**
   * <pre>
   * 统计数据类别 
   * </pre>
   *
   * <code>string DataType = 5;</code>
   * @return The dataType.
   */
  @java.lang.Override
  public java.lang.String getDataType() {
    java.lang.Object ref = dataType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dataType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 统计数据类别 
   * </pre>
   *
   * <code>string DataType = 5;</code>
   * @return The bytes for dataType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDataTypeBytes() {
    java.lang.Object ref = dataType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dataType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int METRIC_FIELD_NUMBER = 6;
  private volatile java.lang.Object metric_;
  /**
   * <pre>
   * 指标类别 
   * </pre>
   *
   * <code>string Metric = 6;</code>
   * @return The metric.
   */
  @java.lang.Override
  public java.lang.String getMetric() {
    java.lang.Object ref = metric_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      metric_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 指标类别 
   * </pre>
   *
   * <code>string Metric = 6;</code>
   * @return The bytes for metric.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMetricBytes() {
    java.lang.Object ref = metric_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      metric_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NEEDDETAIL_FIELD_NUMBER = 7;
  private boolean needDetail_;
  /**
   * <code>bool NeedDetail = 7;</code>
   * @return The needDetail.
   */
  @java.lang.Override
  public boolean getNeedDetail() {
    return needDetail_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(domains_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, domains_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(interval_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, interval_);
    }
    if (startTimestamp_ != 0L) {
      output.writeInt64(3, startTimestamp_);
    }
    if (endTimestamp_ != 0L) {
      output.writeInt64(4, endTimestamp_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dataType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, dataType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(metric_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, metric_);
    }
    if (needDetail_ != false) {
      output.writeBool(7, needDetail_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(domains_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, domains_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(interval_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, interval_);
    }
    if (startTimestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, startTimestamp_);
    }
    if (endTimestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, endTimestamp_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dataType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, dataType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(metric_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, metric_);
    }
    if (needDetail_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(7, needDetail_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.volcengine.service.vod.model.request.VodListCdnStatusDataRequest)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.request.VodListCdnStatusDataRequest other = (com.volcengine.service.vod.model.request.VodListCdnStatusDataRequest) obj;

    if (!getDomains()
        .equals(other.getDomains())) return false;
    if (!getInterval()
        .equals(other.getInterval())) return false;
    if (getStartTimestamp()
        != other.getStartTimestamp()) return false;
    if (getEndTimestamp()
        != other.getEndTimestamp()) return false;
    if (!getDataType()
        .equals(other.getDataType())) return false;
    if (!getMetric()
        .equals(other.getMetric())) return false;
    if (getNeedDetail()
        != other.getNeedDetail()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DOMAINS_FIELD_NUMBER;
    hash = (53 * hash) + getDomains().hashCode();
    hash = (37 * hash) + INTERVAL_FIELD_NUMBER;
    hash = (53 * hash) + getInterval().hashCode();
    hash = (37 * hash) + STARTTIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStartTimestamp());
    hash = (37 * hash) + ENDTIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEndTimestamp());
    hash = (37 * hash) + DATATYPE_FIELD_NUMBER;
    hash = (53 * hash) + getDataType().hashCode();
    hash = (37 * hash) + METRIC_FIELD_NUMBER;
    hash = (53 * hash) + getMetric().hashCode();
    hash = (37 * hash) + NEEDDETAIL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getNeedDetail());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.request.VodListCdnStatusDataRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodListCdnStatusDataRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodListCdnStatusDataRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodListCdnStatusDataRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodListCdnStatusDataRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodListCdnStatusDataRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodListCdnStatusDataRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodListCdnStatusDataRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodListCdnStatusDataRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodListCdnStatusDataRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodListCdnStatusDataRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodListCdnStatusDataRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.volcengine.service.vod.model.request.VodListCdnStatusDataRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Volcengine.Vod.Models.Request.VodListCdnStatusDataRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Request.VodListCdnStatusDataRequest)
      com.volcengine.service.vod.model.request.VodListCdnStatusDataRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodListCdnStatusDataRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodListCdnStatusDataRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.request.VodListCdnStatusDataRequest.class, com.volcengine.service.vod.model.request.VodListCdnStatusDataRequest.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.request.VodListCdnStatusDataRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      domains_ = "";

      interval_ = "";

      startTimestamp_ = 0L;

      endTimestamp_ = 0L;

      dataType_ = "";

      metric_ = "";

      needDetail_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodListCdnStatusDataRequest_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodListCdnStatusDataRequest getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.request.VodListCdnStatusDataRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodListCdnStatusDataRequest build() {
      com.volcengine.service.vod.model.request.VodListCdnStatusDataRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodListCdnStatusDataRequest buildPartial() {
      com.volcengine.service.vod.model.request.VodListCdnStatusDataRequest result = new com.volcengine.service.vod.model.request.VodListCdnStatusDataRequest(this);
      result.domains_ = domains_;
      result.interval_ = interval_;
      result.startTimestamp_ = startTimestamp_;
      result.endTimestamp_ = endTimestamp_;
      result.dataType_ = dataType_;
      result.metric_ = metric_;
      result.needDetail_ = needDetail_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.volcengine.service.vod.model.request.VodListCdnStatusDataRequest) {
        return mergeFrom((com.volcengine.service.vod.model.request.VodListCdnStatusDataRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.request.VodListCdnStatusDataRequest other) {
      if (other == com.volcengine.service.vod.model.request.VodListCdnStatusDataRequest.getDefaultInstance()) return this;
      if (!other.getDomains().isEmpty()) {
        domains_ = other.domains_;
        onChanged();
      }
      if (!other.getInterval().isEmpty()) {
        interval_ = other.interval_;
        onChanged();
      }
      if (other.getStartTimestamp() != 0L) {
        setStartTimestamp(other.getStartTimestamp());
      }
      if (other.getEndTimestamp() != 0L) {
        setEndTimestamp(other.getEndTimestamp());
      }
      if (!other.getDataType().isEmpty()) {
        dataType_ = other.dataType_;
        onChanged();
      }
      if (!other.getMetric().isEmpty()) {
        metric_ = other.metric_;
        onChanged();
      }
      if (other.getNeedDetail() != false) {
        setNeedDetail(other.getNeedDetail());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.volcengine.service.vod.model.request.VodListCdnStatusDataRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.request.VodListCdnStatusDataRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object domains_ = "";
    /**
     * <pre>
     * 域名，多个用逗号隔开 
     * </pre>
     *
     * <code>string Domains = 1;</code>
     * @return The domains.
     */
    public java.lang.String getDomains() {
      java.lang.Object ref = domains_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        domains_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 域名，多个用逗号隔开 
     * </pre>
     *
     * <code>string Domains = 1;</code>
     * @return The bytes for domains.
     */
    public com.google.protobuf.ByteString
        getDomainsBytes() {
      java.lang.Object ref = domains_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        domains_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 域名，多个用逗号隔开 
     * </pre>
     *
     * <code>string Domains = 1;</code>
     * @param value The domains to set.
     * @return This builder for chaining.
     */
    public Builder setDomains(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      domains_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 域名，多个用逗号隔开 
     * </pre>
     *
     * <code>string Domains = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDomains() {
      
      domains_ = getDefaultInstance().getDomains();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 域名，多个用逗号隔开 
     * </pre>
     *
     * <code>string Domains = 1;</code>
     * @param value The bytes for domains to set.
     * @return This builder for chaining.
     */
    public Builder setDomainsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      domains_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object interval_ = "";
    /**
     * <pre>
     * 聚合度 
     * </pre>
     *
     * <code>string Interval = 2;</code>
     * @return The interval.
     */
    public java.lang.String getInterval() {
      java.lang.Object ref = interval_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        interval_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 聚合度 
     * </pre>
     *
     * <code>string Interval = 2;</code>
     * @return The bytes for interval.
     */
    public com.google.protobuf.ByteString
        getIntervalBytes() {
      java.lang.Object ref = interval_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        interval_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 聚合度 
     * </pre>
     *
     * <code>string Interval = 2;</code>
     * @param value The interval to set.
     * @return This builder for chaining.
     */
    public Builder setInterval(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      interval_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 聚合度 
     * </pre>
     *
     * <code>string Interval = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearInterval() {
      
      interval_ = getDefaultInstance().getInterval();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 聚合度 
     * </pre>
     *
     * <code>string Interval = 2;</code>
     * @param value The bytes for interval to set.
     * @return This builder for chaining.
     */
    public Builder setIntervalBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      interval_ = value;
      onChanged();
      return this;
    }

    private long startTimestamp_ ;
    /**
     * <pre>
     * 查询范围起始时间 
     * </pre>
     *
     * <code>int64 StartTimestamp = 3;</code>
     * @return The startTimestamp.
     */
    @java.lang.Override
    public long getStartTimestamp() {
      return startTimestamp_;
    }
    /**
     * <pre>
     * 查询范围起始时间 
     * </pre>
     *
     * <code>int64 StartTimestamp = 3;</code>
     * @param value The startTimestamp to set.
     * @return This builder for chaining.
     */
    public Builder setStartTimestamp(long value) {
      
      startTimestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 查询范围起始时间 
     * </pre>
     *
     * <code>int64 StartTimestamp = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartTimestamp() {
      
      startTimestamp_ = 0L;
      onChanged();
      return this;
    }

    private long endTimestamp_ ;
    /**
     * <pre>
     * 查询范围截止时间 
     * </pre>
     *
     * <code>int64 EndTimestamp = 4;</code>
     * @return The endTimestamp.
     */
    @java.lang.Override
    public long getEndTimestamp() {
      return endTimestamp_;
    }
    /**
     * <pre>
     * 查询范围截止时间 
     * </pre>
     *
     * <code>int64 EndTimestamp = 4;</code>
     * @param value The endTimestamp to set.
     * @return This builder for chaining.
     */
    public Builder setEndTimestamp(long value) {
      
      endTimestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 查询范围截止时间 
     * </pre>
     *
     * <code>int64 EndTimestamp = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearEndTimestamp() {
      
      endTimestamp_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object dataType_ = "";
    /**
     * <pre>
     * 统计数据类别 
     * </pre>
     *
     * <code>string DataType = 5;</code>
     * @return The dataType.
     */
    public java.lang.String getDataType() {
      java.lang.Object ref = dataType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dataType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 统计数据类别 
     * </pre>
     *
     * <code>string DataType = 5;</code>
     * @return The bytes for dataType.
     */
    public com.google.protobuf.ByteString
        getDataTypeBytes() {
      java.lang.Object ref = dataType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dataType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 统计数据类别 
     * </pre>
     *
     * <code>string DataType = 5;</code>
     * @param value The dataType to set.
     * @return This builder for chaining.
     */
    public Builder setDataType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dataType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 统计数据类别 
     * </pre>
     *
     * <code>string DataType = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearDataType() {
      
      dataType_ = getDefaultInstance().getDataType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 统计数据类别 
     * </pre>
     *
     * <code>string DataType = 5;</code>
     * @param value The bytes for dataType to set.
     * @return This builder for chaining.
     */
    public Builder setDataTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dataType_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object metric_ = "";
    /**
     * <pre>
     * 指标类别 
     * </pre>
     *
     * <code>string Metric = 6;</code>
     * @return The metric.
     */
    public java.lang.String getMetric() {
      java.lang.Object ref = metric_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        metric_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 指标类别 
     * </pre>
     *
     * <code>string Metric = 6;</code>
     * @return The bytes for metric.
     */
    public com.google.protobuf.ByteString
        getMetricBytes() {
      java.lang.Object ref = metric_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        metric_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 指标类别 
     * </pre>
     *
     * <code>string Metric = 6;</code>
     * @param value The metric to set.
     * @return This builder for chaining.
     */
    public Builder setMetric(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      metric_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 指标类别 
     * </pre>
     *
     * <code>string Metric = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearMetric() {
      
      metric_ = getDefaultInstance().getMetric();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 指标类别 
     * </pre>
     *
     * <code>string Metric = 6;</code>
     * @param value The bytes for metric to set.
     * @return This builder for chaining.
     */
    public Builder setMetricBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      metric_ = value;
      onChanged();
      return this;
    }

    private boolean needDetail_ ;
    /**
     * <code>bool NeedDetail = 7;</code>
     * @return The needDetail.
     */
    @java.lang.Override
    public boolean getNeedDetail() {
      return needDetail_;
    }
    /**
     * <code>bool NeedDetail = 7;</code>
     * @param value The needDetail to set.
     * @return This builder for chaining.
     */
    public Builder setNeedDetail(boolean value) {
      
      needDetail_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool NeedDetail = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearNeedDetail() {
      
      needDetail_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Request.VodListCdnStatusDataRequest)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Request.VodListCdnStatusDataRequest)
  private static final com.volcengine.service.vod.model.request.VodListCdnStatusDataRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.request.VodListCdnStatusDataRequest();
  }

  public static com.volcengine.service.vod.model.request.VodListCdnStatusDataRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodListCdnStatusDataRequest>
      PARSER = new com.google.protobuf.AbstractParser<VodListCdnStatusDataRequest>() {
    @java.lang.Override
    public VodListCdnStatusDataRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodListCdnStatusDataRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodListCdnStatusDataRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodListCdnStatusDataRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.request.VodListCdnStatusDataRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

