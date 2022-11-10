// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/response/response_live.proto

package com.volcengine.service.live.model.response;

/**
 * Protobuf type {@code Volcengine.Live.Models.Response.GeneratePushURLResponse}
 */
public final class GeneratePushURLResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Live.Models.Response.GeneratePushURLResponse)
    GeneratePushURLResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GeneratePushURLResponse.newBuilder() to construct.
  private GeneratePushURLResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GeneratePushURLResponse() {
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new GeneratePushURLResponse();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GeneratePushURLResponse(
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
          case 10: {
            com.volcengine.service.base.model.base.ResponseMetadata.Builder subBuilder = null;
            if (responseMetadata_ != null) {
              subBuilder = responseMetadata_.toBuilder();
            }
            responseMetadata_ = input.readMessage(com.volcengine.service.base.model.base.ResponseMetadata.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(responseMetadata_);
              responseMetadata_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.volcengine.service.live.model.business.GeneratePushURLResult.Builder subBuilder = null;
            if (result_ != null) {
              subBuilder = result_.toBuilder();
            }
            result_ = input.readMessage(com.volcengine.service.live.model.business.GeneratePushURLResult.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(result_);
              result_ = subBuilder.buildPartial();
            }

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
    return LiveResponse.internal_static_Volcengine_Live_Models_Response_GeneratePushURLResponse_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return LiveResponse.internal_static_Volcengine_Live_Models_Response_GeneratePushURLResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            GeneratePushURLResponse.class, Builder.class);
  }

  public static final int RESPONSEMETADATA_FIELD_NUMBER = 1;
  private com.volcengine.service.base.model.base.ResponseMetadata responseMetadata_;
  /**
   * <pre>
   * 响应通用信息
   * </pre>
   *
   * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   * @return Whether the responseMetadata field is set.
   */
  @Override
  public boolean hasResponseMetadata() {
    return responseMetadata_ != null;
  }
  /**
   * <pre>
   * 响应通用信息
   * </pre>
   *
   * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   * @return The responseMetadata.
   */
  @Override
  public com.volcengine.service.base.model.base.ResponseMetadata getResponseMetadata() {
    return responseMetadata_ == null ? com.volcengine.service.base.model.base.ResponseMetadata.getDefaultInstance() : responseMetadata_;
  }
  /**
   * <pre>
   * 响应通用信息
   * </pre>
   *
   * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   */
  @Override
  public com.volcengine.service.base.model.base.ResponseMetadataOrBuilder getResponseMetadataOrBuilder() {
    return getResponseMetadata();
  }

  public static final int RESULT_FIELD_NUMBER = 2;
  private com.volcengine.service.live.model.business.GeneratePushURLResult result_;
  /**
   * <pre>
   *返回结果
   * </pre>
   *
   * <code>.Volcengine.Live.Models.Business.GeneratePushURLResult Result = 2;</code>
   * @return Whether the result field is set.
   */
  @Override
  public boolean hasResult() {
    return result_ != null;
  }
  /**
   * <pre>
   *返回结果
   * </pre>
   *
   * <code>.Volcengine.Live.Models.Business.GeneratePushURLResult Result = 2;</code>
   * @return The result.
   */
  @Override
  public com.volcengine.service.live.model.business.GeneratePushURLResult getResult() {
    return result_ == null ? com.volcengine.service.live.model.business.GeneratePushURLResult.getDefaultInstance() : result_;
  }
  /**
   * <pre>
   *返回结果
   * </pre>
   *
   * <code>.Volcengine.Live.Models.Business.GeneratePushURLResult Result = 2;</code>
   */
  @Override
  public com.volcengine.service.live.model.business.GeneratePushURLResultOrBuilder getResultOrBuilder() {
    return getResult();
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
    if (responseMetadata_ != null) {
      output.writeMessage(1, getResponseMetadata());
    }
    if (result_ != null) {
      output.writeMessage(2, getResult());
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (responseMetadata_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getResponseMetadata());
    }
    if (result_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getResult());
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
    if (!(obj instanceof GeneratePushURLResponse)) {
      return super.equals(obj);
    }
    GeneratePushURLResponse other = (GeneratePushURLResponse) obj;

    if (hasResponseMetadata() != other.hasResponseMetadata()) return false;
    if (hasResponseMetadata()) {
      if (!getResponseMetadata()
          .equals(other.getResponseMetadata())) return false;
    }
    if (hasResult() != other.hasResult()) return false;
    if (hasResult()) {
      if (!getResult()
          .equals(other.getResult())) return false;
    }
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
    if (hasResponseMetadata()) {
      hash = (37 * hash) + RESPONSEMETADATA_FIELD_NUMBER;
      hash = (53 * hash) + getResponseMetadata().hashCode();
    }
    if (hasResult()) {
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + getResult().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static GeneratePushURLResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GeneratePushURLResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GeneratePushURLResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GeneratePushURLResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GeneratePushURLResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GeneratePushURLResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GeneratePushURLResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static GeneratePushURLResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static GeneratePushURLResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static GeneratePushURLResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static GeneratePushURLResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static GeneratePushURLResponse parseFrom(
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
  public static Builder newBuilder(GeneratePushURLResponse prototype) {
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
   * Protobuf type {@code Volcengine.Live.Models.Response.GeneratePushURLResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Live.Models.Response.GeneratePushURLResponse)
      GeneratePushURLResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LiveResponse.internal_static_Volcengine_Live_Models_Response_GeneratePushURLResponse_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LiveResponse.internal_static_Volcengine_Live_Models_Response_GeneratePushURLResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              GeneratePushURLResponse.class, Builder.class);
    }

    // Construct using com.volcengine.service.live.model.response.GeneratePushURLResponse.newBuilder()
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
      if (responseMetadataBuilder_ == null) {
        responseMetadata_ = null;
      } else {
        responseMetadata_ = null;
        responseMetadataBuilder_ = null;
      }
      if (resultBuilder_ == null) {
        result_ = null;
      } else {
        result_ = null;
        resultBuilder_ = null;
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return LiveResponse.internal_static_Volcengine_Live_Models_Response_GeneratePushURLResponse_descriptor;
    }

    @Override
    public GeneratePushURLResponse getDefaultInstanceForType() {
      return GeneratePushURLResponse.getDefaultInstance();
    }

    @Override
    public GeneratePushURLResponse build() {
      GeneratePushURLResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public GeneratePushURLResponse buildPartial() {
      GeneratePushURLResponse result = new GeneratePushURLResponse(this);
      if (responseMetadataBuilder_ == null) {
        result.responseMetadata_ = responseMetadata_;
      } else {
        result.responseMetadata_ = responseMetadataBuilder_.build();
      }
      if (resultBuilder_ == null) {
        result.result_ = result_;
      } else {
        result.result_ = resultBuilder_.build();
      }
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
      if (other instanceof GeneratePushURLResponse) {
        return mergeFrom((GeneratePushURLResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(GeneratePushURLResponse other) {
      if (other == GeneratePushURLResponse.getDefaultInstance()) return this;
      if (other.hasResponseMetadata()) {
        mergeResponseMetadata(other.getResponseMetadata());
      }
      if (other.hasResult()) {
        mergeResult(other.getResult());
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
      GeneratePushURLResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (GeneratePushURLResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.volcengine.service.base.model.base.ResponseMetadata responseMetadata_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.volcengine.service.base.model.base.ResponseMetadata, com.volcengine.service.base.model.base.ResponseMetadata.Builder, com.volcengine.service.base.model.base.ResponseMetadataOrBuilder> responseMetadataBuilder_;
    /**
     * <pre>
     * 响应通用信息
     * </pre>
     *
     * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
     * @return Whether the responseMetadata field is set.
     */
    public boolean hasResponseMetadata() {
      return responseMetadataBuilder_ != null || responseMetadata_ != null;
    }
    /**
     * <pre>
     * 响应通用信息
     * </pre>
     *
     * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
     * @return The responseMetadata.
     */
    public com.volcengine.service.base.model.base.ResponseMetadata getResponseMetadata() {
      if (responseMetadataBuilder_ == null) {
        return responseMetadata_ == null ? com.volcengine.service.base.model.base.ResponseMetadata.getDefaultInstance() : responseMetadata_;
      } else {
        return responseMetadataBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 响应通用信息
     * </pre>
     *
     * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
     */
    public Builder setResponseMetadata(com.volcengine.service.base.model.base.ResponseMetadata value) {
      if (responseMetadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        responseMetadata_ = value;
        onChanged();
      } else {
        responseMetadataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * 响应通用信息
     * </pre>
     *
     * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
     */
    public Builder setResponseMetadata(
        com.volcengine.service.base.model.base.ResponseMetadata.Builder builderForValue) {
      if (responseMetadataBuilder_ == null) {
        responseMetadata_ = builderForValue.build();
        onChanged();
      } else {
        responseMetadataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * 响应通用信息
     * </pre>
     *
     * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
     */
    public Builder mergeResponseMetadata(com.volcengine.service.base.model.base.ResponseMetadata value) {
      if (responseMetadataBuilder_ == null) {
        if (responseMetadata_ != null) {
          responseMetadata_ =
            com.volcengine.service.base.model.base.ResponseMetadata.newBuilder(responseMetadata_).mergeFrom(value).buildPartial();
        } else {
          responseMetadata_ = value;
        }
        onChanged();
      } else {
        responseMetadataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * 响应通用信息
     * </pre>
     *
     * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
     */
    public Builder clearResponseMetadata() {
      if (responseMetadataBuilder_ == null) {
        responseMetadata_ = null;
        onChanged();
      } else {
        responseMetadata_ = null;
        responseMetadataBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * 响应通用信息
     * </pre>
     *
     * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
     */
    public com.volcengine.service.base.model.base.ResponseMetadata.Builder getResponseMetadataBuilder() {
      
      onChanged();
      return getResponseMetadataFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 响应通用信息
     * </pre>
     *
     * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
     */
    public com.volcengine.service.base.model.base.ResponseMetadataOrBuilder getResponseMetadataOrBuilder() {
      if (responseMetadataBuilder_ != null) {
        return responseMetadataBuilder_.getMessageOrBuilder();
      } else {
        return responseMetadata_ == null ?
            com.volcengine.service.base.model.base.ResponseMetadata.getDefaultInstance() : responseMetadata_;
      }
    }
    /**
     * <pre>
     * 响应通用信息
     * </pre>
     *
     * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.volcengine.service.base.model.base.ResponseMetadata, com.volcengine.service.base.model.base.ResponseMetadata.Builder, com.volcengine.service.base.model.base.ResponseMetadataOrBuilder> 
        getResponseMetadataFieldBuilder() {
      if (responseMetadataBuilder_ == null) {
        responseMetadataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.volcengine.service.base.model.base.ResponseMetadata, com.volcengine.service.base.model.base.ResponseMetadata.Builder, com.volcengine.service.base.model.base.ResponseMetadataOrBuilder>(
                getResponseMetadata(),
                getParentForChildren(),
                isClean());
        responseMetadata_ = null;
      }
      return responseMetadataBuilder_;
    }

    private com.volcengine.service.live.model.business.GeneratePushURLResult result_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.volcengine.service.live.model.business.GeneratePushURLResult, com.volcengine.service.live.model.business.GeneratePushURLResult.Builder, com.volcengine.service.live.model.business.GeneratePushURLResultOrBuilder> resultBuilder_;
    /**
     * <pre>
     *返回结果
     * </pre>
     *
     * <code>.Volcengine.Live.Models.Business.GeneratePushURLResult Result = 2;</code>
     * @return Whether the result field is set.
     */
    public boolean hasResult() {
      return resultBuilder_ != null || result_ != null;
    }
    /**
     * <pre>
     *返回结果
     * </pre>
     *
     * <code>.Volcengine.Live.Models.Business.GeneratePushURLResult Result = 2;</code>
     * @return The result.
     */
    public com.volcengine.service.live.model.business.GeneratePushURLResult getResult() {
      if (resultBuilder_ == null) {
        return result_ == null ? com.volcengine.service.live.model.business.GeneratePushURLResult.getDefaultInstance() : result_;
      } else {
        return resultBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     *返回结果
     * </pre>
     *
     * <code>.Volcengine.Live.Models.Business.GeneratePushURLResult Result = 2;</code>
     */
    public Builder setResult(com.volcengine.service.live.model.business.GeneratePushURLResult value) {
      if (resultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        result_ = value;
        onChanged();
      } else {
        resultBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     *返回结果
     * </pre>
     *
     * <code>.Volcengine.Live.Models.Business.GeneratePushURLResult Result = 2;</code>
     */
    public Builder setResult(
        com.volcengine.service.live.model.business.GeneratePushURLResult.Builder builderForValue) {
      if (resultBuilder_ == null) {
        result_ = builderForValue.build();
        onChanged();
      } else {
        resultBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     *返回结果
     * </pre>
     *
     * <code>.Volcengine.Live.Models.Business.GeneratePushURLResult Result = 2;</code>
     */
    public Builder mergeResult(com.volcengine.service.live.model.business.GeneratePushURLResult value) {
      if (resultBuilder_ == null) {
        if (result_ != null) {
          result_ =
            com.volcengine.service.live.model.business.GeneratePushURLResult.newBuilder(result_).mergeFrom(value).buildPartial();
        } else {
          result_ = value;
        }
        onChanged();
      } else {
        resultBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     *返回结果
     * </pre>
     *
     * <code>.Volcengine.Live.Models.Business.GeneratePushURLResult Result = 2;</code>
     */
    public Builder clearResult() {
      if (resultBuilder_ == null) {
        result_ = null;
        onChanged();
      } else {
        result_ = null;
        resultBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     *返回结果
     * </pre>
     *
     * <code>.Volcengine.Live.Models.Business.GeneratePushURLResult Result = 2;</code>
     */
    public com.volcengine.service.live.model.business.GeneratePushURLResult.Builder getResultBuilder() {
      
      onChanged();
      return getResultFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     *返回结果
     * </pre>
     *
     * <code>.Volcengine.Live.Models.Business.GeneratePushURLResult Result = 2;</code>
     */
    public com.volcengine.service.live.model.business.GeneratePushURLResultOrBuilder getResultOrBuilder() {
      if (resultBuilder_ != null) {
        return resultBuilder_.getMessageOrBuilder();
      } else {
        return result_ == null ?
            com.volcengine.service.live.model.business.GeneratePushURLResult.getDefaultInstance() : result_;
      }
    }
    /**
     * <pre>
     *返回结果
     * </pre>
     *
     * <code>.Volcengine.Live.Models.Business.GeneratePushURLResult Result = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.volcengine.service.live.model.business.GeneratePushURLResult, com.volcengine.service.live.model.business.GeneratePushURLResult.Builder, com.volcengine.service.live.model.business.GeneratePushURLResultOrBuilder> 
        getResultFieldBuilder() {
      if (resultBuilder_ == null) {
        resultBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.volcengine.service.live.model.business.GeneratePushURLResult, com.volcengine.service.live.model.business.GeneratePushURLResult.Builder, com.volcengine.service.live.model.business.GeneratePushURLResultOrBuilder>(
                getResult(),
                getParentForChildren(),
                isClean());
        result_ = null;
      }
      return resultBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Live.Models.Response.GeneratePushURLResponse)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Live.Models.Response.GeneratePushURLResponse)
  private static final GeneratePushURLResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new GeneratePushURLResponse();
  }

  public static GeneratePushURLResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GeneratePushURLResponse>
      PARSER = new com.google.protobuf.AbstractParser<GeneratePushURLResponse>() {
    @Override
    public GeneratePushURLResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GeneratePushURLResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GeneratePushURLResponse> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<GeneratePushURLResponse> getParserForType() {
    return PARSER;
  }

  @Override
  public GeneratePushURLResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
