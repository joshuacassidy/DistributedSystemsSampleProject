// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service2.proto

package ds.service2;

/**
 * Protobuf type {@code service2.GetAllTodosResponseMessage}
 */
public  final class GetAllTodosResponseMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:service2.GetAllTodosResponseMessage)
    GetAllTodosResponseMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetAllTodosResponseMessage.newBuilder() to construct.
  private GetAllTodosResponseMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetAllTodosResponseMessage() {
    status_ = 0;
    todos_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    message_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetAllTodosResponseMessage(
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

            status_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              todos_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            todos_.add(s);
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            message_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        todos_ = todos_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ds.service2.Service2Impl.internal_static_service2_GetAllTodosResponseMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ds.service2.Service2Impl.internal_static_service2_GetAllTodosResponseMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ds.service2.GetAllTodosResponseMessage.class, ds.service2.GetAllTodosResponseMessage.Builder.class);
  }

  private int bitField0_;
  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>int32 status = 1;</code>
   */
  public int getStatus() {
    return status_;
  }

  public static final int TODOS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList todos_;
  /**
   * <code>repeated string todos = 2;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getTodosList() {
    return todos_;
  }
  /**
   * <code>repeated string todos = 2;</code>
   */
  public int getTodosCount() {
    return todos_.size();
  }
  /**
   * <code>repeated string todos = 2;</code>
   */
  public java.lang.String getTodos(int index) {
    return todos_.get(index);
  }
  /**
   * <code>repeated string todos = 2;</code>
   */
  public com.google.protobuf.ByteString
      getTodosBytes(int index) {
    return todos_.getByteString(index);
  }

  public static final int MESSAGE_FIELD_NUMBER = 3;
  private volatile java.lang.Object message_;
  /**
   * <code>string message = 3;</code>
   */
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>string message = 3;</code>
   */
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (status_ != 0) {
      output.writeInt32(1, status_);
    }
    for (int i = 0; i < todos_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, todos_.getRaw(i));
    }
    if (!getMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, message_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, status_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < todos_.size(); i++) {
        dataSize += computeStringSizeNoTag(todos_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getTodosList().size();
    }
    if (!getMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, message_);
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
    if (!(obj instanceof ds.service2.GetAllTodosResponseMessage)) {
      return super.equals(obj);
    }
    ds.service2.GetAllTodosResponseMessage other = (ds.service2.GetAllTodosResponseMessage) obj;

    boolean result = true;
    result = result && (getStatus()
        == other.getStatus());
    result = result && getTodosList()
        .equals(other.getTodosList());
    result = result && getMessage()
        .equals(other.getMessage());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + getStatus();
    if (getTodosCount() > 0) {
      hash = (37 * hash) + TODOS_FIELD_NUMBER;
      hash = (53 * hash) + getTodosList().hashCode();
    }
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ds.service2.GetAllTodosResponseMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.service2.GetAllTodosResponseMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.service2.GetAllTodosResponseMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.service2.GetAllTodosResponseMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.service2.GetAllTodosResponseMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.service2.GetAllTodosResponseMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.service2.GetAllTodosResponseMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.service2.GetAllTodosResponseMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.service2.GetAllTodosResponseMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ds.service2.GetAllTodosResponseMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.service2.GetAllTodosResponseMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.service2.GetAllTodosResponseMessage parseFrom(
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
  public static Builder newBuilder(ds.service2.GetAllTodosResponseMessage prototype) {
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
   * Protobuf type {@code service2.GetAllTodosResponseMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:service2.GetAllTodosResponseMessage)
      ds.service2.GetAllTodosResponseMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ds.service2.Service2Impl.internal_static_service2_GetAllTodosResponseMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ds.service2.Service2Impl.internal_static_service2_GetAllTodosResponseMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ds.service2.GetAllTodosResponseMessage.class, ds.service2.GetAllTodosResponseMessage.Builder.class);
    }

    // Construct using ds.service2.GetAllTodosResponseMessage.newBuilder()
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
      status_ = 0;

      todos_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      message_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ds.service2.Service2Impl.internal_static_service2_GetAllTodosResponseMessage_descriptor;
    }

    @java.lang.Override
    public ds.service2.GetAllTodosResponseMessage getDefaultInstanceForType() {
      return ds.service2.GetAllTodosResponseMessage.getDefaultInstance();
    }

    @java.lang.Override
    public ds.service2.GetAllTodosResponseMessage build() {
      ds.service2.GetAllTodosResponseMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ds.service2.GetAllTodosResponseMessage buildPartial() {
      ds.service2.GetAllTodosResponseMessage result = new ds.service2.GetAllTodosResponseMessage(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.status_ = status_;
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        todos_ = todos_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.todos_ = todos_;
      result.message_ = message_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ds.service2.GetAllTodosResponseMessage) {
        return mergeFrom((ds.service2.GetAllTodosResponseMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ds.service2.GetAllTodosResponseMessage other) {
      if (other == ds.service2.GetAllTodosResponseMessage.getDefaultInstance()) return this;
      if (other.getStatus() != 0) {
        setStatus(other.getStatus());
      }
      if (!other.todos_.isEmpty()) {
        if (todos_.isEmpty()) {
          todos_ = other.todos_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureTodosIsMutable();
          todos_.addAll(other.todos_);
        }
        onChanged();
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
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
      ds.service2.GetAllTodosResponseMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ds.service2.GetAllTodosResponseMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int status_ ;
    /**
     * <code>int32 status = 1;</code>
     */
    public int getStatus() {
      return status_;
    }
    /**
     * <code>int32 status = 1;</code>
     */
    public Builder setStatus(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 status = 1;</code>
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList todos_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureTodosIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        todos_ = new com.google.protobuf.LazyStringArrayList(todos_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated string todos = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getTodosList() {
      return todos_.getUnmodifiableView();
    }
    /**
     * <code>repeated string todos = 2;</code>
     */
    public int getTodosCount() {
      return todos_.size();
    }
    /**
     * <code>repeated string todos = 2;</code>
     */
    public java.lang.String getTodos(int index) {
      return todos_.get(index);
    }
    /**
     * <code>repeated string todos = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTodosBytes(int index) {
      return todos_.getByteString(index);
    }
    /**
     * <code>repeated string todos = 2;</code>
     */
    public Builder setTodos(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTodosIsMutable();
      todos_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string todos = 2;</code>
     */
    public Builder addTodos(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTodosIsMutable();
      todos_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string todos = 2;</code>
     */
    public Builder addAllTodos(
        java.lang.Iterable<java.lang.String> values) {
      ensureTodosIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, todos_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string todos = 2;</code>
     */
    public Builder clearTodos() {
      todos_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string todos = 2;</code>
     */
    public Builder addTodosBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureTodosIsMutable();
      todos_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <code>string message = 3;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message = 3;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message = 3;</code>
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string message = 3;</code>
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string message = 3;</code>
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:service2.GetAllTodosResponseMessage)
  }

  // @@protoc_insertion_point(class_scope:service2.GetAllTodosResponseMessage)
  private static final ds.service2.GetAllTodosResponseMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ds.service2.GetAllTodosResponseMessage();
  }

  public static ds.service2.GetAllTodosResponseMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetAllTodosResponseMessage>
      PARSER = new com.google.protobuf.AbstractParser<GetAllTodosResponseMessage>() {
    @java.lang.Override
    public GetAllTodosResponseMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetAllTodosResponseMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetAllTodosResponseMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetAllTodosResponseMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ds.service2.GetAllTodosResponseMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
