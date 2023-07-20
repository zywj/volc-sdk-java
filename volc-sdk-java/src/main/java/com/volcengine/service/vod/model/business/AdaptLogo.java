// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_workflow.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Business.AdaptLogo}
 */
public final class AdaptLogo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Business.AdaptLogo)
    AdaptLogoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AdaptLogo.newBuilder() to construct.
  private AdaptLogo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AdaptLogo() {
    logos_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AdaptLogo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AdaptLogo(
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
          case 10: {
            com.volcengine.service.vod.model.business.AnchorSize.Builder subBuilder = null;
            if (anchorSize_ != null) {
              subBuilder = anchorSize_.toBuilder();
            }
            anchorSize_ = input.readMessage(com.volcengine.service.vod.model.business.AnchorSize.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(anchorSize_);
              anchorSize_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              logos_ = new java.util.ArrayList<com.volcengine.service.vod.model.business.LogoDefinition>();
              mutable_bitField0_ |= 0x00000001;
            }
            logos_.add(
                input.readMessage(com.volcengine.service.vod.model.business.LogoDefinition.parser(), extensionRegistry));
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
        logos_ = java.util.Collections.unmodifiableList(logos_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.volcengine.service.vod.model.business.VodWorkflow.internal_static_Volcengine_Vod_Models_Business_AdaptLogo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.business.VodWorkflow.internal_static_Volcengine_Vod_Models_Business_AdaptLogo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.business.AdaptLogo.class, com.volcengine.service.vod.model.business.AdaptLogo.Builder.class);
  }

  public static final int ANCHORSIZE_FIELD_NUMBER = 1;
  private com.volcengine.service.vod.model.business.AnchorSize anchorSize_;
  /**
   * <code>.Volcengine.Vod.Models.Business.AnchorSize AnchorSize = 1;</code>
   * @return Whether the anchorSize field is set.
   */
  @java.lang.Override
  public boolean hasAnchorSize() {
    return anchorSize_ != null;
  }
  /**
   * <code>.Volcengine.Vod.Models.Business.AnchorSize AnchorSize = 1;</code>
   * @return The anchorSize.
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.AnchorSize getAnchorSize() {
    return anchorSize_ == null ? com.volcengine.service.vod.model.business.AnchorSize.getDefaultInstance() : anchorSize_;
  }
  /**
   * <code>.Volcengine.Vod.Models.Business.AnchorSize AnchorSize = 1;</code>
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.AnchorSizeOrBuilder getAnchorSizeOrBuilder() {
    return getAnchorSize();
  }

  public static final int LOGOS_FIELD_NUMBER = 2;
  private java.util.List<com.volcengine.service.vod.model.business.LogoDefinition> logos_;
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.LogoDefinition Logos = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.volcengine.service.vod.model.business.LogoDefinition> getLogosList() {
    return logos_;
  }
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.LogoDefinition Logos = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.volcengine.service.vod.model.business.LogoDefinitionOrBuilder> 
      getLogosOrBuilderList() {
    return logos_;
  }
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.LogoDefinition Logos = 2;</code>
   */
  @java.lang.Override
  public int getLogosCount() {
    return logos_.size();
  }
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.LogoDefinition Logos = 2;</code>
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.LogoDefinition getLogos(int index) {
    return logos_.get(index);
  }
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.LogoDefinition Logos = 2;</code>
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.LogoDefinitionOrBuilder getLogosOrBuilder(
      int index) {
    return logos_.get(index);
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
    if (anchorSize_ != null) {
      output.writeMessage(1, getAnchorSize());
    }
    for (int i = 0; i < logos_.size(); i++) {
      output.writeMessage(2, logos_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (anchorSize_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAnchorSize());
    }
    for (int i = 0; i < logos_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, logos_.get(i));
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
    if (!(obj instanceof com.volcengine.service.vod.model.business.AdaptLogo)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.business.AdaptLogo other = (com.volcengine.service.vod.model.business.AdaptLogo) obj;

    if (hasAnchorSize() != other.hasAnchorSize()) return false;
    if (hasAnchorSize()) {
      if (!getAnchorSize()
          .equals(other.getAnchorSize())) return false;
    }
    if (!getLogosList()
        .equals(other.getLogosList())) return false;
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
    if (hasAnchorSize()) {
      hash = (37 * hash) + ANCHORSIZE_FIELD_NUMBER;
      hash = (53 * hash) + getAnchorSize().hashCode();
    }
    if (getLogosCount() > 0) {
      hash = (37 * hash) + LOGOS_FIELD_NUMBER;
      hash = (53 * hash) + getLogosList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.business.AdaptLogo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.AdaptLogo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.AdaptLogo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.AdaptLogo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.AdaptLogo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.AdaptLogo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.AdaptLogo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.AdaptLogo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.AdaptLogo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.AdaptLogo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.AdaptLogo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.AdaptLogo parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.business.AdaptLogo prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Business.AdaptLogo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Business.AdaptLogo)
      com.volcengine.service.vod.model.business.AdaptLogoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.business.VodWorkflow.internal_static_Volcengine_Vod_Models_Business_AdaptLogo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.business.VodWorkflow.internal_static_Volcengine_Vod_Models_Business_AdaptLogo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.business.AdaptLogo.class, com.volcengine.service.vod.model.business.AdaptLogo.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.business.AdaptLogo.newBuilder()
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
        getLogosFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (anchorSizeBuilder_ == null) {
        anchorSize_ = null;
      } else {
        anchorSize_ = null;
        anchorSizeBuilder_ = null;
      }
      if (logosBuilder_ == null) {
        logos_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        logosBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.business.VodWorkflow.internal_static_Volcengine_Vod_Models_Business_AdaptLogo_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.AdaptLogo getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.business.AdaptLogo.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.AdaptLogo build() {
      com.volcengine.service.vod.model.business.AdaptLogo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.AdaptLogo buildPartial() {
      com.volcengine.service.vod.model.business.AdaptLogo result = new com.volcengine.service.vod.model.business.AdaptLogo(this);
      int from_bitField0_ = bitField0_;
      if (anchorSizeBuilder_ == null) {
        result.anchorSize_ = anchorSize_;
      } else {
        result.anchorSize_ = anchorSizeBuilder_.build();
      }
      if (logosBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          logos_ = java.util.Collections.unmodifiableList(logos_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.logos_ = logos_;
      } else {
        result.logos_ = logosBuilder_.build();
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
      if (other instanceof com.volcengine.service.vod.model.business.AdaptLogo) {
        return mergeFrom((com.volcengine.service.vod.model.business.AdaptLogo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.business.AdaptLogo other) {
      if (other == com.volcengine.service.vod.model.business.AdaptLogo.getDefaultInstance()) return this;
      if (other.hasAnchorSize()) {
        mergeAnchorSize(other.getAnchorSize());
      }
      if (logosBuilder_ == null) {
        if (!other.logos_.isEmpty()) {
          if (logos_.isEmpty()) {
            logos_ = other.logos_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLogosIsMutable();
            logos_.addAll(other.logos_);
          }
          onChanged();
        }
      } else {
        if (!other.logos_.isEmpty()) {
          if (logosBuilder_.isEmpty()) {
            logosBuilder_.dispose();
            logosBuilder_ = null;
            logos_ = other.logos_;
            bitField0_ = (bitField0_ & ~0x00000001);
            logosBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLogosFieldBuilder() : null;
          } else {
            logosBuilder_.addAllMessages(other.logos_);
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
      com.volcengine.service.vod.model.business.AdaptLogo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.business.AdaptLogo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.volcengine.service.vod.model.business.AnchorSize anchorSize_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.volcengine.service.vod.model.business.AnchorSize, com.volcengine.service.vod.model.business.AnchorSize.Builder, com.volcengine.service.vod.model.business.AnchorSizeOrBuilder> anchorSizeBuilder_;
    /**
     * <code>.Volcengine.Vod.Models.Business.AnchorSize AnchorSize = 1;</code>
     * @return Whether the anchorSize field is set.
     */
    public boolean hasAnchorSize() {
      return anchorSizeBuilder_ != null || anchorSize_ != null;
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.AnchorSize AnchorSize = 1;</code>
     * @return The anchorSize.
     */
    public com.volcengine.service.vod.model.business.AnchorSize getAnchorSize() {
      if (anchorSizeBuilder_ == null) {
        return anchorSize_ == null ? com.volcengine.service.vod.model.business.AnchorSize.getDefaultInstance() : anchorSize_;
      } else {
        return anchorSizeBuilder_.getMessage();
      }
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.AnchorSize AnchorSize = 1;</code>
     */
    public Builder setAnchorSize(com.volcengine.service.vod.model.business.AnchorSize value) {
      if (anchorSizeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        anchorSize_ = value;
        onChanged();
      } else {
        anchorSizeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.AnchorSize AnchorSize = 1;</code>
     */
    public Builder setAnchorSize(
        com.volcengine.service.vod.model.business.AnchorSize.Builder builderForValue) {
      if (anchorSizeBuilder_ == null) {
        anchorSize_ = builderForValue.build();
        onChanged();
      } else {
        anchorSizeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.AnchorSize AnchorSize = 1;</code>
     */
    public Builder mergeAnchorSize(com.volcengine.service.vod.model.business.AnchorSize value) {
      if (anchorSizeBuilder_ == null) {
        if (anchorSize_ != null) {
          anchorSize_ =
            com.volcengine.service.vod.model.business.AnchorSize.newBuilder(anchorSize_).mergeFrom(value).buildPartial();
        } else {
          anchorSize_ = value;
        }
        onChanged();
      } else {
        anchorSizeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.AnchorSize AnchorSize = 1;</code>
     */
    public Builder clearAnchorSize() {
      if (anchorSizeBuilder_ == null) {
        anchorSize_ = null;
        onChanged();
      } else {
        anchorSize_ = null;
        anchorSizeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.AnchorSize AnchorSize = 1;</code>
     */
    public com.volcengine.service.vod.model.business.AnchorSize.Builder getAnchorSizeBuilder() {
      
      onChanged();
      return getAnchorSizeFieldBuilder().getBuilder();
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.AnchorSize AnchorSize = 1;</code>
     */
    public com.volcengine.service.vod.model.business.AnchorSizeOrBuilder getAnchorSizeOrBuilder() {
      if (anchorSizeBuilder_ != null) {
        return anchorSizeBuilder_.getMessageOrBuilder();
      } else {
        return anchorSize_ == null ?
            com.volcengine.service.vod.model.business.AnchorSize.getDefaultInstance() : anchorSize_;
      }
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.AnchorSize AnchorSize = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.volcengine.service.vod.model.business.AnchorSize, com.volcengine.service.vod.model.business.AnchorSize.Builder, com.volcengine.service.vod.model.business.AnchorSizeOrBuilder> 
        getAnchorSizeFieldBuilder() {
      if (anchorSizeBuilder_ == null) {
        anchorSizeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.volcengine.service.vod.model.business.AnchorSize, com.volcengine.service.vod.model.business.AnchorSize.Builder, com.volcengine.service.vod.model.business.AnchorSizeOrBuilder>(
                getAnchorSize(),
                getParentForChildren(),
                isClean());
        anchorSize_ = null;
      }
      return anchorSizeBuilder_;
    }

    private java.util.List<com.volcengine.service.vod.model.business.LogoDefinition> logos_ =
      java.util.Collections.emptyList();
    private void ensureLogosIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        logos_ = new java.util.ArrayList<com.volcengine.service.vod.model.business.LogoDefinition>(logos_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.volcengine.service.vod.model.business.LogoDefinition, com.volcengine.service.vod.model.business.LogoDefinition.Builder, com.volcengine.service.vod.model.business.LogoDefinitionOrBuilder> logosBuilder_;

    /**
     * <code>repeated .Volcengine.Vod.Models.Business.LogoDefinition Logos = 2;</code>
     */
    public java.util.List<com.volcengine.service.vod.model.business.LogoDefinition> getLogosList() {
      if (logosBuilder_ == null) {
        return java.util.Collections.unmodifiableList(logos_);
      } else {
        return logosBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.LogoDefinition Logos = 2;</code>
     */
    public int getLogosCount() {
      if (logosBuilder_ == null) {
        return logos_.size();
      } else {
        return logosBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.LogoDefinition Logos = 2;</code>
     */
    public com.volcengine.service.vod.model.business.LogoDefinition getLogos(int index) {
      if (logosBuilder_ == null) {
        return logos_.get(index);
      } else {
        return logosBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.LogoDefinition Logos = 2;</code>
     */
    public Builder setLogos(
        int index, com.volcengine.service.vod.model.business.LogoDefinition value) {
      if (logosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLogosIsMutable();
        logos_.set(index, value);
        onChanged();
      } else {
        logosBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.LogoDefinition Logos = 2;</code>
     */
    public Builder setLogos(
        int index, com.volcengine.service.vod.model.business.LogoDefinition.Builder builderForValue) {
      if (logosBuilder_ == null) {
        ensureLogosIsMutable();
        logos_.set(index, builderForValue.build());
        onChanged();
      } else {
        logosBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.LogoDefinition Logos = 2;</code>
     */
    public Builder addLogos(com.volcengine.service.vod.model.business.LogoDefinition value) {
      if (logosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLogosIsMutable();
        logos_.add(value);
        onChanged();
      } else {
        logosBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.LogoDefinition Logos = 2;</code>
     */
    public Builder addLogos(
        int index, com.volcengine.service.vod.model.business.LogoDefinition value) {
      if (logosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLogosIsMutable();
        logos_.add(index, value);
        onChanged();
      } else {
        logosBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.LogoDefinition Logos = 2;</code>
     */
    public Builder addLogos(
        com.volcengine.service.vod.model.business.LogoDefinition.Builder builderForValue) {
      if (logosBuilder_ == null) {
        ensureLogosIsMutable();
        logos_.add(builderForValue.build());
        onChanged();
      } else {
        logosBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.LogoDefinition Logos = 2;</code>
     */
    public Builder addLogos(
        int index, com.volcengine.service.vod.model.business.LogoDefinition.Builder builderForValue) {
      if (logosBuilder_ == null) {
        ensureLogosIsMutable();
        logos_.add(index, builderForValue.build());
        onChanged();
      } else {
        logosBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.LogoDefinition Logos = 2;</code>
     */
    public Builder addAllLogos(
        java.lang.Iterable<? extends com.volcengine.service.vod.model.business.LogoDefinition> values) {
      if (logosBuilder_ == null) {
        ensureLogosIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, logos_);
        onChanged();
      } else {
        logosBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.LogoDefinition Logos = 2;</code>
     */
    public Builder clearLogos() {
      if (logosBuilder_ == null) {
        logos_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        logosBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.LogoDefinition Logos = 2;</code>
     */
    public Builder removeLogos(int index) {
      if (logosBuilder_ == null) {
        ensureLogosIsMutable();
        logos_.remove(index);
        onChanged();
      } else {
        logosBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.LogoDefinition Logos = 2;</code>
     */
    public com.volcengine.service.vod.model.business.LogoDefinition.Builder getLogosBuilder(
        int index) {
      return getLogosFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.LogoDefinition Logos = 2;</code>
     */
    public com.volcengine.service.vod.model.business.LogoDefinitionOrBuilder getLogosOrBuilder(
        int index) {
      if (logosBuilder_ == null) {
        return logos_.get(index);  } else {
        return logosBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.LogoDefinition Logos = 2;</code>
     */
    public java.util.List<? extends com.volcengine.service.vod.model.business.LogoDefinitionOrBuilder> 
         getLogosOrBuilderList() {
      if (logosBuilder_ != null) {
        return logosBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(logos_);
      }
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.LogoDefinition Logos = 2;</code>
     */
    public com.volcengine.service.vod.model.business.LogoDefinition.Builder addLogosBuilder() {
      return getLogosFieldBuilder().addBuilder(
          com.volcengine.service.vod.model.business.LogoDefinition.getDefaultInstance());
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.LogoDefinition Logos = 2;</code>
     */
    public com.volcengine.service.vod.model.business.LogoDefinition.Builder addLogosBuilder(
        int index) {
      return getLogosFieldBuilder().addBuilder(
          index, com.volcengine.service.vod.model.business.LogoDefinition.getDefaultInstance());
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.LogoDefinition Logos = 2;</code>
     */
    public java.util.List<com.volcengine.service.vod.model.business.LogoDefinition.Builder> 
         getLogosBuilderList() {
      return getLogosFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.volcengine.service.vod.model.business.LogoDefinition, com.volcengine.service.vod.model.business.LogoDefinition.Builder, com.volcengine.service.vod.model.business.LogoDefinitionOrBuilder> 
        getLogosFieldBuilder() {
      if (logosBuilder_ == null) {
        logosBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.volcengine.service.vod.model.business.LogoDefinition, com.volcengine.service.vod.model.business.LogoDefinition.Builder, com.volcengine.service.vod.model.business.LogoDefinitionOrBuilder>(
                logos_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        logos_ = null;
      }
      return logosBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Business.AdaptLogo)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Business.AdaptLogo)
  private static final com.volcengine.service.vod.model.business.AdaptLogo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.business.AdaptLogo();
  }

  public static com.volcengine.service.vod.model.business.AdaptLogo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdaptLogo>
      PARSER = new com.google.protobuf.AbstractParser<AdaptLogo>() {
    @java.lang.Override
    public AdaptLogo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AdaptLogo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AdaptLogo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdaptLogo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.business.AdaptLogo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
