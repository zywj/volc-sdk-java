// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/business/snapshot_manage.proto

package com.volcengine.service.live.model.business;

/**
 * Protobuf type {@code Volcengine.Live.Models.Business.Pagination}
 */
public final class Pagination extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Live.Models.Business.Pagination)
    PaginationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Pagination.newBuilder() to construct.
  private Pagination(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Pagination() {
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new Pagination();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Pagination(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
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
          case 8: {

            pageCur_ = input.readInt64();
            break;
          }
          case 16: {

            pageSize_ = input.readInt64();
            break;
          }
          case 24: {

            pageTotal_ = input.readInt64();
            break;
          }
          case 32: {

            totalCount_ = input.readInt64();
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
    return SnapshotManage.internal_static_Volcengine_Live_Models_Business_Pagination_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return SnapshotManage.internal_static_Volcengine_Live_Models_Business_Pagination_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Pagination.class, Builder.class);
  }

  public static final int PAGECUR_FIELD_NUMBER = 1;
  private long pageCur_;
  /**
   * <pre>
   * 当前页
   * </pre>
   *
   * <code>int64 PageCur = 1;</code>
   * @return The pageCur.
   */
  @Override
  public long getPageCur() {
    return pageCur_;
  }

  public static final int PAGESIZE_FIELD_NUMBER = 2;
  private long pageSize_;
  /**
   * <pre>
   * 当前页的大小
   * </pre>
   *
   * <code>int64 PageSize = 2;</code>
   * @return The pageSize.
   */
  @Override
  public long getPageSize() {
    return pageSize_;
  }

  public static final int PAGETOTAL_FIELD_NUMBER = 3;
  private long pageTotal_;
  /**
   * <pre>
   * 当前页的数据量
   * </pre>
   *
   * <code>int64 PageTotal = 3;</code>
   * @return The pageTotal.
   */
  @Override
  public long getPageTotal() {
    return pageTotal_;
  }

  public static final int TOTALCOUNT_FIELD_NUMBER = 4;
  private long totalCount_;
  /**
   * <pre>
   * 数据总量
   * </pre>
   *
   * <code>int64 TotalCount = 4;</code>
   * @return The totalCount.
   */
  @Override
  public long getTotalCount() {
    return totalCount_;
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (pageCur_ != 0L) {
      output.writeInt64(1, pageCur_);
    }
    if (pageSize_ != 0L) {
      output.writeInt64(2, pageSize_);
    }
    if (pageTotal_ != 0L) {
      output.writeInt64(3, pageTotal_);
    }
    if (totalCount_ != 0L) {
      output.writeInt64(4, totalCount_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pageCur_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, pageCur_);
    }
    if (pageSize_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, pageSize_);
    }
    if (pageTotal_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, pageTotal_);
    }
    if (totalCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, totalCount_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof Pagination)) {
      return super.equals(obj);
    }
    Pagination other = (Pagination) obj;

    if (getPageCur()
        != other.getPageCur()) return false;
    if (getPageSize()
        != other.getPageSize()) return false;
    if (getPageTotal()
        != other.getPageTotal()) return false;
    if (getTotalCount()
        != other.getTotalCount()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PAGECUR_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPageCur());
    hash = (37 * hash) + PAGESIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPageSize());
    hash = (37 * hash) + PAGETOTAL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPageTotal());
    hash = (37 * hash) + TOTALCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotalCount());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Pagination parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Pagination parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Pagination parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Pagination parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Pagination parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Pagination parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Pagination parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Pagination parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Pagination parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Pagination parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Pagination parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Pagination parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(Pagination prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Volcengine.Live.Models.Business.Pagination}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Live.Models.Business.Pagination)
      PaginationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SnapshotManage.internal_static_Volcengine_Live_Models_Business_Pagination_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SnapshotManage.internal_static_Volcengine_Live_Models_Business_Pagination_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Pagination.class, Builder.class);
    }

    // Construct using com.volcengine.service.live.model.business.Pagination.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      pageCur_ = 0L;

      pageSize_ = 0L;

      pageTotal_ = 0L;

      totalCount_ = 0L;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return SnapshotManage.internal_static_Volcengine_Live_Models_Business_Pagination_descriptor;
    }

    @Override
    public Pagination getDefaultInstanceForType() {
      return Pagination.getDefaultInstance();
    }

    @Override
    public Pagination build() {
      Pagination result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public Pagination buildPartial() {
      Pagination result = new Pagination(this);
      result.pageCur_ = pageCur_;
      result.pageSize_ = pageSize_;
      result.pageTotal_ = pageTotal_;
      result.totalCount_ = totalCount_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof Pagination) {
        return mergeFrom((Pagination)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Pagination other) {
      if (other == Pagination.getDefaultInstance()) return this;
      if (other.getPageCur() != 0L) {
        setPageCur(other.getPageCur());
      }
      if (other.getPageSize() != 0L) {
        setPageSize(other.getPageSize());
      }
      if (other.getPageTotal() != 0L) {
        setPageTotal(other.getPageTotal());
      }
      if (other.getTotalCount() != 0L) {
        setTotalCount(other.getTotalCount());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Pagination parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (Pagination) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long pageCur_ ;
    /**
     * <pre>
     * 当前页
     * </pre>
     *
     * <code>int64 PageCur = 1;</code>
     * @return The pageCur.
     */
    @Override
    public long getPageCur() {
      return pageCur_;
    }
    /**
     * <pre>
     * 当前页
     * </pre>
     *
     * <code>int64 PageCur = 1;</code>
     * @param value The pageCur to set.
     * @return This builder for chaining.
     */
    public Builder setPageCur(long value) {
      
      pageCur_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 当前页
     * </pre>
     *
     * <code>int64 PageCur = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageCur() {
      
      pageCur_ = 0L;
      onChanged();
      return this;
    }

    private long pageSize_ ;
    /**
     * <pre>
     * 当前页的大小
     * </pre>
     *
     * <code>int64 PageSize = 2;</code>
     * @return The pageSize.
     */
    @Override
    public long getPageSize() {
      return pageSize_;
    }
    /**
     * <pre>
     * 当前页的大小
     * </pre>
     *
     * <code>int64 PageSize = 2;</code>
     * @param value The pageSize to set.
     * @return This builder for chaining.
     */
    public Builder setPageSize(long value) {
      
      pageSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 当前页的大小
     * </pre>
     *
     * <code>int64 PageSize = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageSize() {
      
      pageSize_ = 0L;
      onChanged();
      return this;
    }

    private long pageTotal_ ;
    /**
     * <pre>
     * 当前页的数据量
     * </pre>
     *
     * <code>int64 PageTotal = 3;</code>
     * @return The pageTotal.
     */
    @Override
    public long getPageTotal() {
      return pageTotal_;
    }
    /**
     * <pre>
     * 当前页的数据量
     * </pre>
     *
     * <code>int64 PageTotal = 3;</code>
     * @param value The pageTotal to set.
     * @return This builder for chaining.
     */
    public Builder setPageTotal(long value) {
      
      pageTotal_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 当前页的数据量
     * </pre>
     *
     * <code>int64 PageTotal = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageTotal() {
      
      pageTotal_ = 0L;
      onChanged();
      return this;
    }

    private long totalCount_ ;
    /**
     * <pre>
     * 数据总量
     * </pre>
     *
     * <code>int64 TotalCount = 4;</code>
     * @return The totalCount.
     */
    @Override
    public long getTotalCount() {
      return totalCount_;
    }
    /**
     * <pre>
     * 数据总量
     * </pre>
     *
     * <code>int64 TotalCount = 4;</code>
     * @param value The totalCount to set.
     * @return This builder for chaining.
     */
    public Builder setTotalCount(long value) {
      
      totalCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 数据总量
     * </pre>
     *
     * <code>int64 TotalCount = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalCount() {
      
      totalCount_ = 0L;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Volcengine.Live.Models.Business.Pagination)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Live.Models.Business.Pagination)
  private static final Pagination DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Pagination();
  }

  public static Pagination getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Pagination>
      PARSER = new com.google.protobuf.AbstractParser<Pagination>() {
    @Override
    public Pagination parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Pagination(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Pagination> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<Pagination> getParserForType() {
    return PARSER;
  }

  @Override
  public Pagination getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
