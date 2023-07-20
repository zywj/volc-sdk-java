// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_workflow.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Business.VodWorkflowTemplateResult}
 */
public final class VodWorkflowTemplateResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Business.VodWorkflowTemplateResult)
    VodWorkflowTemplateResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodWorkflowTemplateResult.newBuilder() to construct.
  private VodWorkflowTemplateResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodWorkflowTemplateResult() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodWorkflowTemplateResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodWorkflowTemplateResult(
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
          case 18: {
            com.volcengine.service.vod.model.business.WorkflowTemplate.Builder subBuilder = null;
            if (workflowTemplate_ != null) {
              subBuilder = workflowTemplate_.toBuilder();
            }
            workflowTemplate_ = input.readMessage(com.volcengine.service.vod.model.business.WorkflowTemplate.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(workflowTemplate_);
              workflowTemplate_ = subBuilder.buildPartial();
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
    return com.volcengine.service.vod.model.business.VodWorkflow.internal_static_Volcengine_Vod_Models_Business_VodWorkflowTemplateResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.business.VodWorkflow.internal_static_Volcengine_Vod_Models_Business_VodWorkflowTemplateResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.business.VodWorkflowTemplateResult.class, com.volcengine.service.vod.model.business.VodWorkflowTemplateResult.Builder.class);
  }

  public static final int WORKFLOWTEMPLATE_FIELD_NUMBER = 2;
  private com.volcengine.service.vod.model.business.WorkflowTemplate workflowTemplate_;
  /**
   * <code>.Volcengine.Vod.Models.Business.WorkflowTemplate WorkflowTemplate = 2;</code>
   * @return Whether the workflowTemplate field is set.
   */
  @java.lang.Override
  public boolean hasWorkflowTemplate() {
    return workflowTemplate_ != null;
  }
  /**
   * <code>.Volcengine.Vod.Models.Business.WorkflowTemplate WorkflowTemplate = 2;</code>
   * @return The workflowTemplate.
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.WorkflowTemplate getWorkflowTemplate() {
    return workflowTemplate_ == null ? com.volcengine.service.vod.model.business.WorkflowTemplate.getDefaultInstance() : workflowTemplate_;
  }
  /**
   * <code>.Volcengine.Vod.Models.Business.WorkflowTemplate WorkflowTemplate = 2;</code>
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.WorkflowTemplateOrBuilder getWorkflowTemplateOrBuilder() {
    return getWorkflowTemplate();
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
    if (workflowTemplate_ != null) {
      output.writeMessage(2, getWorkflowTemplate());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (workflowTemplate_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getWorkflowTemplate());
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
    if (!(obj instanceof com.volcengine.service.vod.model.business.VodWorkflowTemplateResult)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.business.VodWorkflowTemplateResult other = (com.volcengine.service.vod.model.business.VodWorkflowTemplateResult) obj;

    if (hasWorkflowTemplate() != other.hasWorkflowTemplate()) return false;
    if (hasWorkflowTemplate()) {
      if (!getWorkflowTemplate()
          .equals(other.getWorkflowTemplate())) return false;
    }
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
    if (hasWorkflowTemplate()) {
      hash = (37 * hash) + WORKFLOWTEMPLATE_FIELD_NUMBER;
      hash = (53 * hash) + getWorkflowTemplate().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.business.VodWorkflowTemplateResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodWorkflowTemplateResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodWorkflowTemplateResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodWorkflowTemplateResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodWorkflowTemplateResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodWorkflowTemplateResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodWorkflowTemplateResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodWorkflowTemplateResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodWorkflowTemplateResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodWorkflowTemplateResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodWorkflowTemplateResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodWorkflowTemplateResult parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.business.VodWorkflowTemplateResult prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Business.VodWorkflowTemplateResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Business.VodWorkflowTemplateResult)
      com.volcengine.service.vod.model.business.VodWorkflowTemplateResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.business.VodWorkflow.internal_static_Volcengine_Vod_Models_Business_VodWorkflowTemplateResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.business.VodWorkflow.internal_static_Volcengine_Vod_Models_Business_VodWorkflowTemplateResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.business.VodWorkflowTemplateResult.class, com.volcengine.service.vod.model.business.VodWorkflowTemplateResult.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.business.VodWorkflowTemplateResult.newBuilder()
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
      if (workflowTemplateBuilder_ == null) {
        workflowTemplate_ = null;
      } else {
        workflowTemplate_ = null;
        workflowTemplateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.business.VodWorkflow.internal_static_Volcengine_Vod_Models_Business_VodWorkflowTemplateResult_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodWorkflowTemplateResult getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.business.VodWorkflowTemplateResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodWorkflowTemplateResult build() {
      com.volcengine.service.vod.model.business.VodWorkflowTemplateResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodWorkflowTemplateResult buildPartial() {
      com.volcengine.service.vod.model.business.VodWorkflowTemplateResult result = new com.volcengine.service.vod.model.business.VodWorkflowTemplateResult(this);
      if (workflowTemplateBuilder_ == null) {
        result.workflowTemplate_ = workflowTemplate_;
      } else {
        result.workflowTemplate_ = workflowTemplateBuilder_.build();
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
      if (other instanceof com.volcengine.service.vod.model.business.VodWorkflowTemplateResult) {
        return mergeFrom((com.volcengine.service.vod.model.business.VodWorkflowTemplateResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.business.VodWorkflowTemplateResult other) {
      if (other == com.volcengine.service.vod.model.business.VodWorkflowTemplateResult.getDefaultInstance()) return this;
      if (other.hasWorkflowTemplate()) {
        mergeWorkflowTemplate(other.getWorkflowTemplate());
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
      com.volcengine.service.vod.model.business.VodWorkflowTemplateResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.business.VodWorkflowTemplateResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.volcengine.service.vod.model.business.WorkflowTemplate workflowTemplate_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.volcengine.service.vod.model.business.WorkflowTemplate, com.volcengine.service.vod.model.business.WorkflowTemplate.Builder, com.volcengine.service.vod.model.business.WorkflowTemplateOrBuilder> workflowTemplateBuilder_;
    /**
     * <code>.Volcengine.Vod.Models.Business.WorkflowTemplate WorkflowTemplate = 2;</code>
     * @return Whether the workflowTemplate field is set.
     */
    public boolean hasWorkflowTemplate() {
      return workflowTemplateBuilder_ != null || workflowTemplate_ != null;
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.WorkflowTemplate WorkflowTemplate = 2;</code>
     * @return The workflowTemplate.
     */
    public com.volcengine.service.vod.model.business.WorkflowTemplate getWorkflowTemplate() {
      if (workflowTemplateBuilder_ == null) {
        return workflowTemplate_ == null ? com.volcengine.service.vod.model.business.WorkflowTemplate.getDefaultInstance() : workflowTemplate_;
      } else {
        return workflowTemplateBuilder_.getMessage();
      }
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.WorkflowTemplate WorkflowTemplate = 2;</code>
     */
    public Builder setWorkflowTemplate(com.volcengine.service.vod.model.business.WorkflowTemplate value) {
      if (workflowTemplateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        workflowTemplate_ = value;
        onChanged();
      } else {
        workflowTemplateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.WorkflowTemplate WorkflowTemplate = 2;</code>
     */
    public Builder setWorkflowTemplate(
        com.volcengine.service.vod.model.business.WorkflowTemplate.Builder builderForValue) {
      if (workflowTemplateBuilder_ == null) {
        workflowTemplate_ = builderForValue.build();
        onChanged();
      } else {
        workflowTemplateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.WorkflowTemplate WorkflowTemplate = 2;</code>
     */
    public Builder mergeWorkflowTemplate(com.volcengine.service.vod.model.business.WorkflowTemplate value) {
      if (workflowTemplateBuilder_ == null) {
        if (workflowTemplate_ != null) {
          workflowTemplate_ =
            com.volcengine.service.vod.model.business.WorkflowTemplate.newBuilder(workflowTemplate_).mergeFrom(value).buildPartial();
        } else {
          workflowTemplate_ = value;
        }
        onChanged();
      } else {
        workflowTemplateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.WorkflowTemplate WorkflowTemplate = 2;</code>
     */
    public Builder clearWorkflowTemplate() {
      if (workflowTemplateBuilder_ == null) {
        workflowTemplate_ = null;
        onChanged();
      } else {
        workflowTemplate_ = null;
        workflowTemplateBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.WorkflowTemplate WorkflowTemplate = 2;</code>
     */
    public com.volcengine.service.vod.model.business.WorkflowTemplate.Builder getWorkflowTemplateBuilder() {
      
      onChanged();
      return getWorkflowTemplateFieldBuilder().getBuilder();
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.WorkflowTemplate WorkflowTemplate = 2;</code>
     */
    public com.volcengine.service.vod.model.business.WorkflowTemplateOrBuilder getWorkflowTemplateOrBuilder() {
      if (workflowTemplateBuilder_ != null) {
        return workflowTemplateBuilder_.getMessageOrBuilder();
      } else {
        return workflowTemplate_ == null ?
            com.volcengine.service.vod.model.business.WorkflowTemplate.getDefaultInstance() : workflowTemplate_;
      }
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.WorkflowTemplate WorkflowTemplate = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.volcengine.service.vod.model.business.WorkflowTemplate, com.volcengine.service.vod.model.business.WorkflowTemplate.Builder, com.volcengine.service.vod.model.business.WorkflowTemplateOrBuilder> 
        getWorkflowTemplateFieldBuilder() {
      if (workflowTemplateBuilder_ == null) {
        workflowTemplateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.volcengine.service.vod.model.business.WorkflowTemplate, com.volcengine.service.vod.model.business.WorkflowTemplate.Builder, com.volcengine.service.vod.model.business.WorkflowTemplateOrBuilder>(
                getWorkflowTemplate(),
                getParentForChildren(),
                isClean());
        workflowTemplate_ = null;
      }
      return workflowTemplateBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Business.VodWorkflowTemplateResult)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Business.VodWorkflowTemplateResult)
  private static final com.volcengine.service.vod.model.business.VodWorkflowTemplateResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.business.VodWorkflowTemplateResult();
  }

  public static com.volcengine.service.vod.model.business.VodWorkflowTemplateResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodWorkflowTemplateResult>
      PARSER = new com.google.protobuf.AbstractParser<VodWorkflowTemplateResult>() {
    @java.lang.Override
    public VodWorkflowTemplateResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodWorkflowTemplateResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodWorkflowTemplateResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodWorkflowTemplateResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodWorkflowTemplateResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
