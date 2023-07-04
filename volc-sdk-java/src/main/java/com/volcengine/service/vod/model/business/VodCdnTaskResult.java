// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_cdn.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Business.VodCdnTaskResult}
 */
public final class VodCdnTaskResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Business.VodCdnTaskResult)
    VodCdnTaskResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodCdnTaskResult.newBuilder() to construct.
  private VodCdnTaskResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodCdnTaskResult() {
    contentInfos_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodCdnTaskResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodCdnTaskResult(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 8: {

            totalCount_ = input.readInt32();
            break;
          }
          case 16: {

            pageNum_ = input.readInt32();
            break;
          }
          case 24: {

            pageSize_ = input.readInt32();
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              contentInfos_ = new java.util.ArrayList<com.volcengine.service.vod.model.business.VodContentInfo>();
              mutable_bitField0_ |= 0x00000001;
            }
            contentInfos_.add(
                input.readMessage(com.volcengine.service.vod.model.business.VodContentInfo.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        contentInfos_ = java.util.Collections.unmodifiableList(contentInfos_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.volcengine.service.vod.model.business.VodCdn.internal_static_Volcengine_Vod_Models_Business_VodCdnTaskResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.business.VodCdn.internal_static_Volcengine_Vod_Models_Business_VodCdnTaskResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.business.VodCdnTaskResult.class, com.volcengine.service.vod.model.business.VodCdnTaskResult.Builder.class);
  }

  public static final int TOTALCOUNT_FIELD_NUMBER = 1;
  private int totalCount_;
  /**
   * <pre>
   *结果总数
   * </pre>
   *
   * <code>int32 TotalCount = 1;</code>
   * @return The totalCount.
   */
  @java.lang.Override
  public int getTotalCount() {
    return totalCount_;
  }

  public static final int PAGENUM_FIELD_NUMBER = 2;
  private int pageNum_;
  /**
   * <pre>
   *页码
   * </pre>
   *
   * <code>int32 PageNum = 2;</code>
   * @return The pageNum.
   */
  @java.lang.Override
  public int getPageNum() {
    return pageNum_;
  }

  public static final int PAGESIZE_FIELD_NUMBER = 3;
  private int pageSize_;
  /**
   * <pre>
   *页面大小
   * </pre>
   *
   * <code>int32 PageSize = 3;</code>
   * @return The pageSize.
   */
  @java.lang.Override
  public int getPageSize() {
    return pageSize_;
  }

  public static final int CONTENTINFOS_FIELD_NUMBER = 4;
  private java.util.List<com.volcengine.service.vod.model.business.VodContentInfo> contentInfos_;
  /**
   * <pre>
   *任务列表
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodContentInfo ContentInfos = 4;</code>
   */
  @java.lang.Override
  public java.util.List<com.volcengine.service.vod.model.business.VodContentInfo> getContentInfosList() {
    return contentInfos_;
  }
  /**
   * <pre>
   *任务列表
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodContentInfo ContentInfos = 4;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.volcengine.service.vod.model.business.VodContentInfoOrBuilder> 
      getContentInfosOrBuilderList() {
    return contentInfos_;
  }
  /**
   * <pre>
   *任务列表
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodContentInfo ContentInfos = 4;</code>
   */
  @java.lang.Override
  public int getContentInfosCount() {
    return contentInfos_.size();
  }
  /**
   * <pre>
   *任务列表
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodContentInfo ContentInfos = 4;</code>
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodContentInfo getContentInfos(int index) {
    return contentInfos_.get(index);
  }
  /**
   * <pre>
   *任务列表
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodContentInfo ContentInfos = 4;</code>
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodContentInfoOrBuilder getContentInfosOrBuilder(
      int index) {
    return contentInfos_.get(index);
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
    if (totalCount_ != 0) {
      output.writeInt32(1, totalCount_);
    }
    if (pageNum_ != 0) {
      output.writeInt32(2, pageNum_);
    }
    if (pageSize_ != 0) {
      output.writeInt32(3, pageSize_);
    }
    for (int i = 0; i < contentInfos_.size(); i++) {
      output.writeMessage(4, contentInfos_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (totalCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, totalCount_);
    }
    if (pageNum_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, pageNum_);
    }
    if (pageSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, pageSize_);
    }
    for (int i = 0; i < contentInfos_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, contentInfos_.get(i));
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
    if (!(obj instanceof com.volcengine.service.vod.model.business.VodCdnTaskResult)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.business.VodCdnTaskResult other = (com.volcengine.service.vod.model.business.VodCdnTaskResult) obj;

    if (getTotalCount()
        != other.getTotalCount()) return false;
    if (getPageNum()
        != other.getPageNum()) return false;
    if (getPageSize()
        != other.getPageSize()) return false;
    if (!getContentInfosList()
        .equals(other.getContentInfosList())) return false;
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
    hash = (37 * hash) + TOTALCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getTotalCount();
    hash = (37 * hash) + PAGENUM_FIELD_NUMBER;
    hash = (53 * hash) + getPageNum();
    hash = (37 * hash) + PAGESIZE_FIELD_NUMBER;
    hash = (53 * hash) + getPageSize();
    if (getContentInfosCount() > 0) {
      hash = (37 * hash) + CONTENTINFOS_FIELD_NUMBER;
      hash = (53 * hash) + getContentInfosList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.business.VodCdnTaskResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodCdnTaskResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodCdnTaskResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodCdnTaskResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodCdnTaskResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodCdnTaskResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodCdnTaskResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodCdnTaskResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodCdnTaskResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodCdnTaskResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodCdnTaskResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodCdnTaskResult parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.business.VodCdnTaskResult prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Business.VodCdnTaskResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Business.VodCdnTaskResult)
      com.volcengine.service.vod.model.business.VodCdnTaskResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.business.VodCdn.internal_static_Volcengine_Vod_Models_Business_VodCdnTaskResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.business.VodCdn.internal_static_Volcengine_Vod_Models_Business_VodCdnTaskResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.business.VodCdnTaskResult.class, com.volcengine.service.vod.model.business.VodCdnTaskResult.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.business.VodCdnTaskResult.newBuilder()
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
        getContentInfosFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      totalCount_ = 0;

      pageNum_ = 0;

      pageSize_ = 0;

      if (contentInfosBuilder_ == null) {
        contentInfos_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        contentInfosBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.business.VodCdn.internal_static_Volcengine_Vod_Models_Business_VodCdnTaskResult_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodCdnTaskResult getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.business.VodCdnTaskResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodCdnTaskResult build() {
      com.volcengine.service.vod.model.business.VodCdnTaskResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodCdnTaskResult buildPartial() {
      com.volcengine.service.vod.model.business.VodCdnTaskResult result = new com.volcengine.service.vod.model.business.VodCdnTaskResult(this);
      int from_bitField0_ = bitField0_;
      result.totalCount_ = totalCount_;
      result.pageNum_ = pageNum_;
      result.pageSize_ = pageSize_;
      if (contentInfosBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          contentInfos_ = java.util.Collections.unmodifiableList(contentInfos_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.contentInfos_ = contentInfos_;
      } else {
        result.contentInfos_ = contentInfosBuilder_.build();
      }
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
      if (other instanceof com.volcengine.service.vod.model.business.VodCdnTaskResult) {
        return mergeFrom((com.volcengine.service.vod.model.business.VodCdnTaskResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.business.VodCdnTaskResult other) {
      if (other == com.volcengine.service.vod.model.business.VodCdnTaskResult.getDefaultInstance()) return this;
      if (other.getTotalCount() != 0) {
        setTotalCount(other.getTotalCount());
      }
      if (other.getPageNum() != 0) {
        setPageNum(other.getPageNum());
      }
      if (other.getPageSize() != 0) {
        setPageSize(other.getPageSize());
      }
      if (contentInfosBuilder_ == null) {
        if (!other.contentInfos_.isEmpty()) {
          if (contentInfos_.isEmpty()) {
            contentInfos_ = other.contentInfos_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureContentInfosIsMutable();
            contentInfos_.addAll(other.contentInfos_);
          }
          onChanged();
        }
      } else {
        if (!other.contentInfos_.isEmpty()) {
          if (contentInfosBuilder_.isEmpty()) {
            contentInfosBuilder_.dispose();
            contentInfosBuilder_ = null;
            contentInfos_ = other.contentInfos_;
            bitField0_ = (bitField0_ & ~0x00000001);
            contentInfosBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getContentInfosFieldBuilder() : null;
          } else {
            contentInfosBuilder_.addAllMessages(other.contentInfos_);
          }
        }
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
      com.volcengine.service.vod.model.business.VodCdnTaskResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.business.VodCdnTaskResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int totalCount_ ;
    /**
     * <pre>
     *结果总数
     * </pre>
     *
     * <code>int32 TotalCount = 1;</code>
     * @return The totalCount.
     */
    @java.lang.Override
    public int getTotalCount() {
      return totalCount_;
    }
    /**
     * <pre>
     *结果总数
     * </pre>
     *
     * <code>int32 TotalCount = 1;</code>
     * @param value The totalCount to set.
     * @return This builder for chaining.
     */
    public Builder setTotalCount(int value) {
      
      totalCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *结果总数
     * </pre>
     *
     * <code>int32 TotalCount = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalCount() {
      
      totalCount_ = 0;
      onChanged();
      return this;
    }

    private int pageNum_ ;
    /**
     * <pre>
     *页码
     * </pre>
     *
     * <code>int32 PageNum = 2;</code>
     * @return The pageNum.
     */
    @java.lang.Override
    public int getPageNum() {
      return pageNum_;
    }
    /**
     * <pre>
     *页码
     * </pre>
     *
     * <code>int32 PageNum = 2;</code>
     * @param value The pageNum to set.
     * @return This builder for chaining.
     */
    public Builder setPageNum(int value) {
      
      pageNum_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *页码
     * </pre>
     *
     * <code>int32 PageNum = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageNum() {
      
      pageNum_ = 0;
      onChanged();
      return this;
    }

    private int pageSize_ ;
    /**
     * <pre>
     *页面大小
     * </pre>
     *
     * <code>int32 PageSize = 3;</code>
     * @return The pageSize.
     */
    @java.lang.Override
    public int getPageSize() {
      return pageSize_;
    }
    /**
     * <pre>
     *页面大小
     * </pre>
     *
     * <code>int32 PageSize = 3;</code>
     * @param value The pageSize to set.
     * @return This builder for chaining.
     */
    public Builder setPageSize(int value) {
      
      pageSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *页面大小
     * </pre>
     *
     * <code>int32 PageSize = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageSize() {
      
      pageSize_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.volcengine.service.vod.model.business.VodContentInfo> contentInfos_ =
      java.util.Collections.emptyList();
    private void ensureContentInfosIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        contentInfos_ = new java.util.ArrayList<com.volcengine.service.vod.model.business.VodContentInfo>(contentInfos_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.volcengine.service.vod.model.business.VodContentInfo, com.volcengine.service.vod.model.business.VodContentInfo.Builder, com.volcengine.service.vod.model.business.VodContentInfoOrBuilder> contentInfosBuilder_;

    /**
     * <pre>
     *任务列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodContentInfo ContentInfos = 4;</code>
     */
    public java.util.List<com.volcengine.service.vod.model.business.VodContentInfo> getContentInfosList() {
      if (contentInfosBuilder_ == null) {
        return java.util.Collections.unmodifiableList(contentInfos_);
      } else {
        return contentInfosBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     *任务列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodContentInfo ContentInfos = 4;</code>
     */
    public int getContentInfosCount() {
      if (contentInfosBuilder_ == null) {
        return contentInfos_.size();
      } else {
        return contentInfosBuilder_.getCount();
      }
    }
    /**
     * <pre>
     *任务列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodContentInfo ContentInfos = 4;</code>
     */
    public com.volcengine.service.vod.model.business.VodContentInfo getContentInfos(int index) {
      if (contentInfosBuilder_ == null) {
        return contentInfos_.get(index);
      } else {
        return contentInfosBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     *任务列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodContentInfo ContentInfos = 4;</code>
     */
    public Builder setContentInfos(
        int index, com.volcengine.service.vod.model.business.VodContentInfo value) {
      if (contentInfosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContentInfosIsMutable();
        contentInfos_.set(index, value);
        onChanged();
      } else {
        contentInfosBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *任务列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodContentInfo ContentInfos = 4;</code>
     */
    public Builder setContentInfos(
        int index, com.volcengine.service.vod.model.business.VodContentInfo.Builder builderForValue) {
      if (contentInfosBuilder_ == null) {
        ensureContentInfosIsMutable();
        contentInfos_.set(index, builderForValue.build());
        onChanged();
      } else {
        contentInfosBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *任务列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodContentInfo ContentInfos = 4;</code>
     */
    public Builder addContentInfos(com.volcengine.service.vod.model.business.VodContentInfo value) {
      if (contentInfosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContentInfosIsMutable();
        contentInfos_.add(value);
        onChanged();
      } else {
        contentInfosBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     *任务列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodContentInfo ContentInfos = 4;</code>
     */
    public Builder addContentInfos(
        int index, com.volcengine.service.vod.model.business.VodContentInfo value) {
      if (contentInfosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContentInfosIsMutable();
        contentInfos_.add(index, value);
        onChanged();
      } else {
        contentInfosBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *任务列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodContentInfo ContentInfos = 4;</code>
     */
    public Builder addContentInfos(
        com.volcengine.service.vod.model.business.VodContentInfo.Builder builderForValue) {
      if (contentInfosBuilder_ == null) {
        ensureContentInfosIsMutable();
        contentInfos_.add(builderForValue.build());
        onChanged();
      } else {
        contentInfosBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *任务列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodContentInfo ContentInfos = 4;</code>
     */
    public Builder addContentInfos(
        int index, com.volcengine.service.vod.model.business.VodContentInfo.Builder builderForValue) {
      if (contentInfosBuilder_ == null) {
        ensureContentInfosIsMutable();
        contentInfos_.add(index, builderForValue.build());
        onChanged();
      } else {
        contentInfosBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *任务列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodContentInfo ContentInfos = 4;</code>
     */
    public Builder addAllContentInfos(
        java.lang.Iterable<? extends com.volcengine.service.vod.model.business.VodContentInfo> values) {
      if (contentInfosBuilder_ == null) {
        ensureContentInfosIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, contentInfos_);
        onChanged();
      } else {
        contentInfosBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     *任务列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodContentInfo ContentInfos = 4;</code>
     */
    public Builder clearContentInfos() {
      if (contentInfosBuilder_ == null) {
        contentInfos_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        contentInfosBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     *任务列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodContentInfo ContentInfos = 4;</code>
     */
    public Builder removeContentInfos(int index) {
      if (contentInfosBuilder_ == null) {
        ensureContentInfosIsMutable();
        contentInfos_.remove(index);
        onChanged();
      } else {
        contentInfosBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     *任务列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodContentInfo ContentInfos = 4;</code>
     */
    public com.volcengine.service.vod.model.business.VodContentInfo.Builder getContentInfosBuilder(
        int index) {
      return getContentInfosFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     *任务列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodContentInfo ContentInfos = 4;</code>
     */
    public com.volcengine.service.vod.model.business.VodContentInfoOrBuilder getContentInfosOrBuilder(
        int index) {
      if (contentInfosBuilder_ == null) {
        return contentInfos_.get(index);  } else {
        return contentInfosBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     *任务列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodContentInfo ContentInfos = 4;</code>
     */
    public java.util.List<? extends com.volcengine.service.vod.model.business.VodContentInfoOrBuilder> 
         getContentInfosOrBuilderList() {
      if (contentInfosBuilder_ != null) {
        return contentInfosBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(contentInfos_);
      }
    }
    /**
     * <pre>
     *任务列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodContentInfo ContentInfos = 4;</code>
     */
    public com.volcengine.service.vod.model.business.VodContentInfo.Builder addContentInfosBuilder() {
      return getContentInfosFieldBuilder().addBuilder(
          com.volcengine.service.vod.model.business.VodContentInfo.getDefaultInstance());
    }
    /**
     * <pre>
     *任务列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodContentInfo ContentInfos = 4;</code>
     */
    public com.volcengine.service.vod.model.business.VodContentInfo.Builder addContentInfosBuilder(
        int index) {
      return getContentInfosFieldBuilder().addBuilder(
          index, com.volcengine.service.vod.model.business.VodContentInfo.getDefaultInstance());
    }
    /**
     * <pre>
     *任务列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodContentInfo ContentInfos = 4;</code>
     */
    public java.util.List<com.volcengine.service.vod.model.business.VodContentInfo.Builder> 
         getContentInfosBuilderList() {
      return getContentInfosFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.volcengine.service.vod.model.business.VodContentInfo, com.volcengine.service.vod.model.business.VodContentInfo.Builder, com.volcengine.service.vod.model.business.VodContentInfoOrBuilder> 
        getContentInfosFieldBuilder() {
      if (contentInfosBuilder_ == null) {
        contentInfosBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.volcengine.service.vod.model.business.VodContentInfo, com.volcengine.service.vod.model.business.VodContentInfo.Builder, com.volcengine.service.vod.model.business.VodContentInfoOrBuilder>(
                contentInfos_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        contentInfos_ = null;
      }
      return contentInfosBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Business.VodCdnTaskResult)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Business.VodCdnTaskResult)
  private static final com.volcengine.service.vod.model.business.VodCdnTaskResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.business.VodCdnTaskResult();
  }

  public static com.volcengine.service.vod.model.business.VodCdnTaskResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodCdnTaskResult>
      PARSER = new com.google.protobuf.AbstractParser<VodCdnTaskResult>() {
    @java.lang.Override
    public VodCdnTaskResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodCdnTaskResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodCdnTaskResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodCdnTaskResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodCdnTaskResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

