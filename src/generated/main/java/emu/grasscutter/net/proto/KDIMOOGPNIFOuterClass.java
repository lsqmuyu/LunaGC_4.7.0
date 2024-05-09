// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: KDIMOOGPNIF.proto

package emu.grasscutter.net.proto;

public final class KDIMOOGPNIFOuterClass {
  private KDIMOOGPNIFOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface KDIMOOGPNIFOrBuilder extends
      // @@protoc_insertion_point(interface_extends:KDIMOOGPNIF)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float cur_value = 9;</code>
     * @return The curValue.
     */
    float getCurValue();

    /**
     * <code>int32 hash_value = 2;</code>
     * @return The hashValue.
     */
    int getHashValue();
  }
  /**
   * Protobuf type {@code KDIMOOGPNIF}
   */
  public static final class KDIMOOGPNIF extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:KDIMOOGPNIF)
      KDIMOOGPNIFOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use KDIMOOGPNIF.newBuilder() to construct.
    private KDIMOOGPNIF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private KDIMOOGPNIF() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new KDIMOOGPNIF();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private KDIMOOGPNIF(
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
            case 16: {

              hashValue_ = input.readInt32();
              break;
            }
            case 77: {

              curValue_ = input.readFloat();
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
      return emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.internal_static_KDIMOOGPNIF_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.internal_static_KDIMOOGPNIF_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF.class, emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF.Builder.class);
    }

    public static final int CUR_VALUE_FIELD_NUMBER = 9;
    private float curValue_;
    /**
     * <code>float cur_value = 9;</code>
     * @return The curValue.
     */
    @java.lang.Override
    public float getCurValue() {
      return curValue_;
    }

    public static final int HASH_VALUE_FIELD_NUMBER = 2;
    private int hashValue_;
    /**
     * <code>int32 hash_value = 2;</code>
     * @return The hashValue.
     */
    @java.lang.Override
    public int getHashValue() {
      return hashValue_;
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
      if (hashValue_ != 0) {
        output.writeInt32(2, hashValue_);
      }
      if (curValue_ != 0F) {
        output.writeFloat(9, curValue_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (hashValue_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, hashValue_);
      }
      if (curValue_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(9, curValue_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF other = (emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF) obj;

      if (java.lang.Float.floatToIntBits(getCurValue())
          != java.lang.Float.floatToIntBits(
              other.getCurValue())) return false;
      if (getHashValue()
          != other.getHashValue()) return false;
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
      hash = (37 * hash) + CUR_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getCurValue());
      hash = (37 * hash) + HASH_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getHashValue();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF prototype) {
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
     * Protobuf type {@code KDIMOOGPNIF}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:KDIMOOGPNIF)
        emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIFOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.internal_static_KDIMOOGPNIF_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.internal_static_KDIMOOGPNIF_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF.class, emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF.newBuilder()
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
        curValue_ = 0F;

        hashValue_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.internal_static_KDIMOOGPNIF_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF build() {
        emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF buildPartial() {
        emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF result = new emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF(this);
        result.curValue_ = curValue_;
        result.hashValue_ = hashValue_;
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
        if (other instanceof emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF) {
          return mergeFrom((emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF other) {
        if (other == emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF.getDefaultInstance()) return this;
        if (other.getCurValue() != 0F) {
          setCurValue(other.getCurValue());
        }
        if (other.getHashValue() != 0) {
          setHashValue(other.getHashValue());
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
        emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private float curValue_ ;
      /**
       * <code>float cur_value = 9;</code>
       * @return The curValue.
       */
      @java.lang.Override
      public float getCurValue() {
        return curValue_;
      }
      /**
       * <code>float cur_value = 9;</code>
       * @param value The curValue to set.
       * @return This builder for chaining.
       */
      public Builder setCurValue(float value) {
        
        curValue_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float cur_value = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurValue() {
        
        curValue_ = 0F;
        onChanged();
        return this;
      }

      private int hashValue_ ;
      /**
       * <code>int32 hash_value = 2;</code>
       * @return The hashValue.
       */
      @java.lang.Override
      public int getHashValue() {
        return hashValue_;
      }
      /**
       * <code>int32 hash_value = 2;</code>
       * @param value The hashValue to set.
       * @return This builder for chaining.
       */
      public Builder setHashValue(int value) {
        
        hashValue_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 hash_value = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearHashValue() {
        
        hashValue_ = 0;
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


      // @@protoc_insertion_point(builder_scope:KDIMOOGPNIF)
    }

    // @@protoc_insertion_point(class_scope:KDIMOOGPNIF)
    private static final emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF();
    }

    public static emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<KDIMOOGPNIF>
        PARSER = new com.google.protobuf.AbstractParser<KDIMOOGPNIF>() {
      @java.lang.Override
      public KDIMOOGPNIF parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new KDIMOOGPNIF(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<KDIMOOGPNIF> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<KDIMOOGPNIF> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_KDIMOOGPNIF_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_KDIMOOGPNIF_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021KDIMOOGPNIF.proto\"4\n\013KDIMOOGPNIF\022\021\n\tcu" +
      "r_value\030\t \001(\002\022\022\n\nhash_value\030\002 \001(\005B\033\n\031emu" +
      ".grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_KDIMOOGPNIF_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_KDIMOOGPNIF_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_KDIMOOGPNIF_descriptor,
        new java.lang.String[] { "CurValue", "HashValue", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}