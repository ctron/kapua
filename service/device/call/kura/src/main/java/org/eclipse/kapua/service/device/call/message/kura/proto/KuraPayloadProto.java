/*******************************************************************************
 * Copyright (c) 2011, 2016 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech
 *******************************************************************************/
package org.eclipse.kapua.service.device.call.message.kura.proto;

/**
 * Kura payload protobuf definition
 *
 * @since 1.0
 *
 */
public final class KuraPayloadProto {

    private KuraPayloadProto() {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
    }

    public interface KuraPayloadOrBuilder extends
            // @@protoc_insertion_point(interface_extends:kuradatatypes.KuraPayload)
            com.google.protobuf.GeneratedMessage.ExtendableMessageOrBuilder<KuraPayload> {

        /**
         * <code>optional int64 timestamp = 1;</code>
         */
        boolean hasTimestamp();

        /**
         * <code>optional int64 timestamp = 1;</code>
         */
        long getTimestamp();

        /**
         * <code>optional .kuradatatypes.KuraPayload.KuraPosition position = 2;</code>
         */
        boolean hasPosition();

        /**
         * <code>optional .kuradatatypes.KuraPayload.KuraPosition position = 2;</code>
         */
        org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition getPosition();

        /**
         * <code>optional .kuradatatypes.KuraPayload.KuraPosition position = 2;</code>
         */
        org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPositionOrBuilder getPositionOrBuilder();

        /**
         * <code>repeated .kuradatatypes.KuraPayload.KuraMetric metric = 5000;</code>
         *
         * <pre>
         * can be zero, so optional
         * </pre>
         */
        java.util.List<org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric> getMetricList();

        /**
         * <code>repeated .kuradatatypes.KuraPayload.KuraMetric metric = 5000;</code>
         *
         * <pre>
         * can be zero, so optional
         * </pre>
         */
        org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric getMetric(int index);

        /**
         * <code>repeated .kuradatatypes.KuraPayload.KuraMetric metric = 5000;</code>
         *
         * <pre>
         * can be zero, so optional
         * </pre>
         */
        int getMetricCount();

        /**
         * <code>repeated .kuradatatypes.KuraPayload.KuraMetric metric = 5000;</code>
         *
         * <pre>
         * can be zero, so optional
         * </pre>
         */
        java.util.List<? extends org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetricOrBuilder> getMetricOrBuilderList();

        /**
         * <code>repeated .kuradatatypes.KuraPayload.KuraMetric metric = 5000;</code>
         *
         * <pre>
         * can be zero, so optional
         * </pre>
         */
        org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetricOrBuilder getMetricOrBuilder(
                int index);

        /**
         * <code>optional bytes body = 5001;</code>
         */
        boolean hasBody();

        /**
         * <code>optional bytes body = 5001;</code>
         */
        com.google.protobuf.ByteString getBody();
    }

    /**
     * Protobuf type {@code kuradatatypes.KuraPayload}
     */
    public static final class KuraPayload extends
            com.google.protobuf.GeneratedMessage.ExtendableMessage<KuraPayload> implements
            // @@protoc_insertion_point(message_implements:kuradatatypes.KuraPayload)
            KuraPayloadOrBuilder {

        // Use KuraPayload.newBuilder() to construct.
        private KuraPayload(com.google.protobuf.GeneratedMessage.ExtendableBuilder<org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload, ?> builder) {
            super(builder);
            unknownFields = builder.getUnknownFields();
        }

        private KuraPayload(boolean noInit) {
            unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        private static final KuraPayload DEFAULT_INSTANCE;

        public static KuraPayload getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @Override
        public KuraPayload getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return unknownFields;
        }

        private KuraPayload(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                    case 0:
                        done = true;
                        break;
                    default: {
                        if (!parseUnknownField(input, unknownFields,
                                extensionRegistry, tag)) {
                            done = true;
                        }
                        break;
                    }
                    case 8: {
                        bitField0_ |= 0x00000001;
                        timestamp_ = input.readInt64();
                        break;
                    }
                    case 18: {
                        org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition.Builder subBuilder = null;
                        if ((bitField0_ & 0x00000002) == 0x00000002) {
                            subBuilder = position_.toBuilder();
                        }
                        position_ = input.readMessage(org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(position_);
                            position_ = subBuilder.buildPartial();
                        }
                        bitField0_ |= 0x00000002;
                        break;
                    }
                    case 40002: {
                        if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                            metric_ = new java.util.ArrayList<>();
                            mutable_bitField0_ |= 0x00000004;
                        }
                        metric_.add(input.readMessage(org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric.PARSER, extensionRegistry));
                        break;
                    }
                    case 40010: {
                        bitField0_ |= 0x00000004;
                        body_ = input.readBytes();
                        break;
                    }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e.getMessage()).setUnfinishedMessage(this);
            } finally {
                if ((mutable_bitField0_ & 0x00000004) == 0x00000004) {
                    metric_ = java.util.Collections.unmodifiableList(metric_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.INTERNAL_STATIC_KURADATATYPES_KURAPAYLOAD_DESCRIPTOR;
        }

        @Override
        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.internal_static_kuradatatypes_KuraPayload_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.class,
                            org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.Builder.class);
        }

        public static com.google.protobuf.Parser<KuraPayload> PARSER = new com.google.protobuf.AbstractParser<KuraPayload>() {

            @Override
            public KuraPayload parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new KuraPayload(input, extensionRegistry);
            }
        };

        @java.lang.Override
        public com.google.protobuf.Parser<KuraPayload> getParserForType() {
            return PARSER;
        }

        public interface KuraMetricOrBuilder extends
                // @@protoc_insertion_point(interface_extends:kuradatatypes.KuraPayload.KuraMetric)
                com.google.protobuf.MessageOrBuilder {

            /**
             * <code>required string name = 1;</code>
             */
            boolean hasName();

            /**
             * <code>required string name = 1;</code>
             */
            java.lang.String getName();

            /**
             * <code>required string name = 1;</code>
             */
            com.google.protobuf.ByteString getNameBytes();

            /**
             * <code>required .kuradatatypes.KuraPayload.KuraMetric.ValueType type = 2;</code>
             */
            boolean hasType();

            /**
             * <code>required .kuradatatypes.KuraPayload.KuraMetric.ValueType type = 2;</code>
             */
            org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric.ValueType getType();

            /**
             * <code>optional double double_value = 3;</code>
             */
            boolean hasDoubleValue();

            /**
             * <code>optional double double_value = 3;</code>
             */
            double getDoubleValue();

            /**
             * <code>optional float float_value = 4;</code>
             */
            boolean hasFloatValue();

            /**
             * <code>optional float float_value = 4;</code>
             */
            float getFloatValue();

            /**
             * <code>optional int64 long_value = 5;</code>
             */
            boolean hasLongValue();

            /**
             * <code>optional int64 long_value = 5;</code>
             */
            long getLongValue();

            /**
             * <code>optional int32 int_value = 6;</code>
             */
            boolean hasIntValue();

            /**
             * <code>optional int32 int_value = 6;</code>
             */
            int getIntValue();

            /**
             * <code>optional bool bool_value = 7;</code>
             */
            boolean hasBoolValue();

            /**
             * <code>optional bool bool_value = 7;</code>
             */
            boolean getBoolValue();

            /**
             * <code>optional string string_value = 8;</code>
             */
            boolean hasStringValue();

            /**
             * <code>optional string string_value = 8;</code>
             */
            java.lang.String getStringValue();

            /**
             * <code>optional string string_value = 8;</code>
             */
            com.google.protobuf.ByteString getStringValueBytes();

            /**
             * <code>optional bytes bytes_value = 9;</code>
             */
            boolean hasBytesValue();

            /**
             * <code>optional bytes bytes_value = 9;</code>
             */
            com.google.protobuf.ByteString getBytesValue();
        }

        /**
         * Protobuf type {@code kuradatatypes.KuraPayload.KuraMetric}
         */
        public static final class KuraMetric extends
                com.google.protobuf.GeneratedMessage implements
                // @@protoc_insertion_point(message_implements:kuradatatypes.KuraPayload.KuraMetric)
                KuraMetricOrBuilder {

            // Use KuraMetric.newBuilder() to construct.
            private KuraMetric(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
                super(builder);
                unknownFields = builder.getUnknownFields();
            }

            private KuraMetric(boolean noInit) {
                unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
            }

            private static final KuraMetric DEFAULT_INSTANCE;

            public static KuraMetric getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            @Override
            public KuraMetric getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            private final com.google.protobuf.UnknownFieldSet unknownFields;

            @java.lang.Override
            public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
                return unknownFields;
            }

            private KuraMetric(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                initFields();
                com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            com.google.protobuf.ByteString bs = input.readBytes();
                            bitField0_ |= 0x00000001;
                            name_ = bs;
                            break;
                        }
                        case 16: {
                            int rawValue = input.readEnum();
                            org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric.ValueType value = org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric.ValueType
                                    .valueOf(rawValue);
                            if (value == null) {
                                unknownFields.mergeVarintField(2, rawValue);
                            } else {
                                bitField0_ |= 0x00000002;
                                type_ = value;
                            }
                            break;
                        }
                        case 25: {
                            bitField0_ |= 0x00000004;
                            doubleValue_ = input.readDouble();
                            break;
                        }
                        case 37: {
                            bitField0_ |= 0x00000008;
                            floatValue_ = input.readFloat();
                            break;
                        }
                        case 40: {
                            bitField0_ |= 0x00000010;
                            longValue_ = input.readInt64();
                            break;
                        }
                        case 48: {
                            bitField0_ |= 0x00000020;
                            intValue_ = input.readInt32();
                            break;
                        }
                        case 56: {
                            bitField0_ |= 0x00000040;
                            boolValue_ = input.readBool();
                            break;
                        }
                        case 66: {
                            com.google.protobuf.ByteString bs = input.readBytes();
                            bitField0_ |= 0x00000080;
                            stringValue_ = bs;
                            break;
                        }
                        case 74: {
                            bitField0_ |= 0x00000100;
                            bytesValue_ = input.readBytes();
                            break;
                        }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e.getMessage()).setUnfinishedMessage(this);
                } finally {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.INTERNAL_STATIC_KURADATATYPES_KURAPAYLOAD_KURAMETRIC_DESCRIPTOR;
            }

            @Override
            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.internal_static_kuradatatypes_KuraPayload_KuraMetric_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric.class,
                                org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric.Builder.class);
            }

            public static com.google.protobuf.Parser<KuraMetric> PARSER = new com.google.protobuf.AbstractParser<KuraMetric>() {

                @Override
                public KuraMetric parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new KuraMetric(input, extensionRegistry);
                }
            };

            @java.lang.Override
            public com.google.protobuf.Parser<KuraMetric> getParserForType() {
                return PARSER;
            }

            /**
             * Protobuf enum {@code kuradatatypes.KuraPayload.KuraMetric.ValueType}
             */
            public enum ValueType
                    implements com.google.protobuf.ProtocolMessageEnum {
                /**
                 * <code>DOUBLE = 0;</code>
                 */
                DOUBLE(0, 0),
                /**
                 * <code>FLOAT = 1;</code>
                 */
                FLOAT(1, 1),
                /**
                 * <code>INT64 = 2;</code>
                 */
                INT64(2, 2),
                /**
                 * <code>INT32 = 3;</code>
                 */
                INT32(3, 3),
                /**
                 * <code>BOOL = 4;</code>
                 */
                BOOL(4, 4),
                /**
                 * <code>STRING = 5;</code>
                 */
                STRING(5, 5),
                /**
                 * <code>BYTES = 6;</code>
                 */
                BYTES(6, 6),
                ;

                /**
                 * <code>DOUBLE = 0;</code>
                 */
                public static final int DOUBLE_VALUE = 0;
                /**
                 * <code>FLOAT = 1;</code>
                 */
                public static final int FLOAT_VALUE = 1;
                /**
                 * <code>INT64 = 2;</code>
                 */
                public static final int INT64_VALUE = 2;
                /**
                 * <code>INT32 = 3;</code>
                 */
                public static final int INT32_VALUE = 3;
                /**
                 * <code>BOOL = 4;</code>
                 */
                public static final int BOOL_VALUE = 4;
                /**
                 * <code>STRING = 5;</code>
                 */
                public static final int STRING_VALUE = 5;
                /**
                 * <code>BYTES = 6;</code>
                 */
                public static final int BYTES_VALUE = 6;

                @Override
                public final int getNumber() {
                    return value;
                }

                public static ValueType valueOf(int value) {
                    switch (value) {
                    case 0:
                        return DOUBLE;
                    case 1:
                        return FLOAT;
                    case 2:
                        return INT64;
                    case 3:
                        return INT32;
                    case 4:
                        return BOOL;
                    case 5:
                        return STRING;
                    case 6:
                        return BYTES;
                    default:
                        return null;
                    }
                }

                public static com.google.protobuf.Internal.EnumLiteMap<ValueType> internalGetValueMap() {
                    return internalValueMap;
                }

                private static com.google.protobuf.Internal.EnumLiteMap<ValueType> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<ValueType>() {

                    @Override
                    public ValueType findValueByNumber(int number) {
                        return ValueType.valueOf(number);
                    }
                };

                @Override
                public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
                    return getDescriptor().getValues().get(index);
                }

                @Override
                public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
                    return getDescriptor();
                }

                public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
                    return org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric.getDescriptor().getEnumTypes().get(0);
                }

                private static final ValueType[] VALUES = values();

                public static ValueType valueOf(
                        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
                    if (desc.getType() != getDescriptor()) {
                        throw new java.lang.IllegalArgumentException(
                                "EnumValueDescriptor is not for this type.");
                    }
                    return VALUES[desc.getIndex()];
                }

                private final int index;
                private final int value;

                private ValueType(int index, int value) {
                    this.index = index;
                    this.value = value;
                }

                // @@protoc_insertion_point(enum_scope:kuradatatypes.KuraPayload.KuraMetric.ValueType)
            }

            private int bitField0_;
            public static final int NAME_FIELD_NUMBER = 1;
            private java.lang.Object name_;

            /**
             * <code>required string name = 1;</code>
             */
            @Override
            public boolean hasName() {
                return (bitField0_ & 0x00000001) == 0x00000001;
            }

            /**
             * <code>required string name = 1;</code>
             */
            @Override
            public java.lang.String getName() {
                java.lang.Object ref = name_;
                if (ref instanceof java.lang.String) {
                    return (java.lang.String) ref;
                } else {
                    com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        name_ = s;
                    }
                    return s;
                }
            }

            /**
             * <code>required string name = 1;</code>
             */
            @Override
            public com.google.protobuf.ByteString getNameBytes() {
                java.lang.Object ref = name_;
                if (ref instanceof java.lang.String) {
                    com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8(
                            (java.lang.String) ref);
                    name_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            public static final int TYPE_FIELD_NUMBER = 2;
            private org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric.ValueType type_;

            /**
             * <code>required .kuradatatypes.KuraPayload.KuraMetric.ValueType type = 2;</code>
             */
            @Override
            public boolean hasType() {
                return (bitField0_ & 0x00000002) == 0x00000002;
            }

            /**
             * <code>required .kuradatatypes.KuraPayload.KuraMetric.ValueType type = 2;</code>
             */
            @Override
            public org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric.ValueType getType() {
                return type_;
            }

            public static final int DOUBLE_VALUE_FIELD_NUMBER = 3;
            private double doubleValue_;

            /**
             * <code>optional double double_value = 3;</code>
             */
            @Override
            public boolean hasDoubleValue() {
                return (bitField0_ & 0x00000004) == 0x00000004;
            }

            /**
             * <code>optional double double_value = 3;</code>
             */
            @Override
            public double getDoubleValue() {
                return doubleValue_;
            }

            public static final int FLOAT_VALUE_FIELD_NUMBER = 4;
            private float floatValue_;

            /**
             * <code>optional float float_value = 4;</code>
             */
            @Override
            public boolean hasFloatValue() {
                return (bitField0_ & 0x00000008) == 0x00000008;
            }

            /**
             * <code>optional float float_value = 4;</code>
             */
            @Override
            public float getFloatValue() {
                return floatValue_;
            }

            public static final int LONG_VALUE_FIELD_NUMBER = 5;
            private long longValue_;

            /**
             * <code>optional int64 long_value = 5;</code>
             */
            @Override
            public boolean hasLongValue() {
                return (bitField0_ & 0x00000010) == 0x00000010;
            }

            /**
             * <code>optional int64 long_value = 5;</code>
             */
            @Override
            public long getLongValue() {
                return longValue_;
            }

            public static final int INT_VALUE_FIELD_NUMBER = 6;
            private int intValue_;

            /**
             * <code>optional int32 int_value = 6;</code>
             */
            @Override
            public boolean hasIntValue() {
                return (bitField0_ & 0x00000020) == 0x00000020;
            }

            /**
             * <code>optional int32 int_value = 6;</code>
             */
            @Override
            public int getIntValue() {
                return intValue_;
            }

            public static final int BOOL_VALUE_FIELD_NUMBER = 7;
            private boolean boolValue_;

            /**
             * <code>optional bool bool_value = 7;</code>
             */
            @Override
            public boolean hasBoolValue() {
                return (bitField0_ & 0x00000040) == 0x00000040;
            }

            /**
             * <code>optional bool bool_value = 7;</code>
             */
            @Override
            public boolean getBoolValue() {
                return boolValue_;
            }

            public static final int STRING_VALUE_FIELD_NUMBER = 8;
            private java.lang.Object stringValue_;

            /**
             * <code>optional string string_value = 8;</code>
             */
            @Override
            public boolean hasStringValue() {
                return (bitField0_ & 0x00000080) == 0x00000080;
            }

            /**
             * <code>optional string string_value = 8;</code>
             */
            @Override
            public java.lang.String getStringValue() {
                java.lang.Object ref = stringValue_;
                if (ref instanceof java.lang.String) {
                    return (java.lang.String) ref;
                } else {
                    com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        stringValue_ = s;
                    }
                    return s;
                }
            }

            /**
             * <code>optional string string_value = 8;</code>
             */
            @Override
            public com.google.protobuf.ByteString getStringValueBytes() {
                java.lang.Object ref = stringValue_;
                if (ref instanceof java.lang.String) {
                    com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8(
                            (java.lang.String) ref);
                    stringValue_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            public static final int BYTES_VALUE_FIELD_NUMBER = 9;
            private com.google.protobuf.ByteString bytesValue_;

            /**
             * <code>optional bytes bytes_value = 9;</code>
             */
            @Override
            public boolean hasBytesValue() {
                return (bitField0_ & 0x00000100) == 0x00000100;
            }

            /**
             * <code>optional bytes bytes_value = 9;</code>
             */
            @Override
            public com.google.protobuf.ByteString getBytesValue() {
                return bytesValue_;
            }

            private void initFields() {
                name_ = "";
                type_ = org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric.ValueType.DOUBLE;
                doubleValue_ = 0D;
                floatValue_ = 0F;
                longValue_ = 0L;
                intValue_ = 0;
                boolValue_ = false;
                stringValue_ = "";
                bytesValue_ = com.google.protobuf.ByteString.EMPTY;
            }

            private byte memoizedIsInitialized = -1;

            @Override
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized == 1) {
                    return true;
                }
                if (isInitialized == 0) {
                    return false;
                }

                if (!hasName()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
                if (!hasType()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
                memoizedIsInitialized = 1;
                return true;
            }

            @Override
            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                getSerializedSize();
                if ((bitField0_ & 0x00000001) == 0x00000001) {
                    output.writeBytes(1, getNameBytes());
                }
                if ((bitField0_ & 0x00000002) == 0x00000002) {
                    output.writeEnum(2, type_.getNumber());
                }
                if ((bitField0_ & 0x00000004) == 0x00000004) {
                    output.writeDouble(3, doubleValue_);
                }
                if ((bitField0_ & 0x00000008) == 0x00000008) {
                    output.writeFloat(4, floatValue_);
                }
                if ((bitField0_ & 0x00000010) == 0x00000010) {
                    output.writeInt64(5, longValue_);
                }
                if ((bitField0_ & 0x00000020) == 0x00000020) {
                    output.writeInt32(6, intValue_);
                }
                if ((bitField0_ & 0x00000040) == 0x00000040) {
                    output.writeBool(7, boolValue_);
                }
                if ((bitField0_ & 0x00000080) == 0x00000080) {
                    output.writeBytes(8, getStringValueBytes());
                }
                if ((bitField0_ & 0x00000100) == 0x00000100) {
                    output.writeBytes(9, bytesValue_);
                }
                getUnknownFields().writeTo(output);
            }

            private int memoizedSerializedSize = -1;

            @Override
            public int getSerializedSize() {
                int size = memoizedSerializedSize;
                if (size != -1) {
                    return size;
                }

                size = 0;
                if ((bitField0_ & 0x00000001) == 0x00000001) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeBytesSize(1, getNameBytes());
                }
                if ((bitField0_ & 0x00000002) == 0x00000002) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeEnumSize(2, type_.getNumber());
                }
                if ((bitField0_ & 0x00000004) == 0x00000004) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeDoubleSize(3, doubleValue_);
                }
                if ((bitField0_ & 0x00000008) == 0x00000008) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeFloatSize(4, floatValue_);
                }
                if ((bitField0_ & 0x00000010) == 0x00000010) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeInt64Size(5, longValue_);
                }
                if ((bitField0_ & 0x00000020) == 0x00000020) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeInt32Size(6, intValue_);
                }
                if ((bitField0_ & 0x00000040) == 0x00000040) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeBoolSize(7, boolValue_);
                }
                if ((bitField0_ & 0x00000080) == 0x00000080) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeBytesSize(8, getStringValueBytes());
                }
                if ((bitField0_ & 0x00000100) == 0x00000100) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeBytesSize(9, bytesValue_);
                }
                size += getUnknownFields().getSerializedSize();
                memoizedSerializedSize = size;
                return size;
            }

            private static final long serialVersionUID = 0L;

            @java.lang.Override
            protected java.lang.Object writeReplace()
                    throws java.io.ObjectStreamException {
                return super.writeReplace();
            }

            public static org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }

            public static org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }

            public static org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }

            public static org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }

            public static org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return PARSER.parseFrom(input);
            }

            public static org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseFrom(input, extensionRegistry);
            }

            public static org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return PARSER.parseDelimitedFrom(input);
            }

            public static org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseDelimitedFrom(input, extensionRegistry);
            }

            public static org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return PARSER.parseFrom(input);
            }

            public static org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseFrom(input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return Builder.create();
            }

            @Override
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Builder newBuilder(org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric prototype) {
                return newBuilder().mergeFrom(prototype);
            }

            @Override
            public Builder toBuilder() {
                return newBuilder(this);
            }

            @java.lang.Override
            protected Builder newBuilderForType(
                    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }

            /**
             * Protobuf type {@code kuradatatypes.KuraPayload.KuraMetric}
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessage.Builder<Builder> implements
                    // @@protoc_insertion_point(builder_implements:kuradatatypes.KuraPayload.KuraMetric)
                    org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetricOrBuilder {

                public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                    return org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.INTERNAL_STATIC_KURADATATYPES_KURAPAYLOAD_KURAMETRIC_DESCRIPTOR;
                }

                @Override
                protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.internal_static_kuradatatypes_KuraPayload_KuraMetric_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric.class,
                                    org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric.Builder.class);
                }

                // Construct using org.eclipse.kapua.service.device.call.message.tmp.kura.KuraPayloadProto.KuraPayload.KuraMetric.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }

                private void maybeForceBuilderInitialization() {
                }

                private static Builder create() {
                    return new Builder();
                }

                @Override
                public Builder clear() {
                    super.clear();
                    name_ = "";
                    bitField0_ = bitField0_ & ~0x00000001;
                    type_ = org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric.ValueType.DOUBLE;
                    bitField0_ = bitField0_ & ~0x00000002;
                    doubleValue_ = 0D;
                    bitField0_ = bitField0_ & ~0x00000004;
                    floatValue_ = 0F;
                    bitField0_ = bitField0_ & ~0x00000008;
                    longValue_ = 0L;
                    bitField0_ = bitField0_ & ~0x00000010;
                    intValue_ = 0;
                    bitField0_ = bitField0_ & ~0x00000020;
                    boolValue_ = false;
                    bitField0_ = bitField0_ & ~0x00000040;
                    stringValue_ = "";
                    bitField0_ = bitField0_ & ~0x00000080;
                    bytesValue_ = com.google.protobuf.ByteString.EMPTY;
                    bitField0_ = bitField0_ & ~0x00000100;
                    return this;
                }

                @Override
                public Builder clone() {
                    return create().mergeFrom(buildPartial());
                }

                @Override
                public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                    return org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.INTERNAL_STATIC_KURADATATYPES_KURAPAYLOAD_KURAMETRIC_DESCRIPTOR;
                }

                @Override
                public org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric getDefaultInstanceForType() {
                    return org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric.getDefaultInstance();
                }

                @Override
                public org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric build() {
                    org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                @Override
                public org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric buildPartial() {
                    org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric result = new org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric(
                            this);
                    int from_bitField0_ = bitField0_;
                    int to_bitField0_ = 0;
                    if ((from_bitField0_ & 0x00000001) == 0x00000001) {
                        to_bitField0_ |= 0x00000001;
                    }
                    result.name_ = name_;
                    if ((from_bitField0_ & 0x00000002) == 0x00000002) {
                        to_bitField0_ |= 0x00000002;
                    }
                    result.type_ = type_;
                    if ((from_bitField0_ & 0x00000004) == 0x00000004) {
                        to_bitField0_ |= 0x00000004;
                    }
                    result.doubleValue_ = doubleValue_;
                    if ((from_bitField0_ & 0x00000008) == 0x00000008) {
                        to_bitField0_ |= 0x00000008;
                    }
                    result.floatValue_ = floatValue_;
                    if ((from_bitField0_ & 0x00000010) == 0x00000010) {
                        to_bitField0_ |= 0x00000010;
                    }
                    result.longValue_ = longValue_;
                    if ((from_bitField0_ & 0x00000020) == 0x00000020) {
                        to_bitField0_ |= 0x00000020;
                    }
                    result.intValue_ = intValue_;
                    if ((from_bitField0_ & 0x00000040) == 0x00000040) {
                        to_bitField0_ |= 0x00000040;
                    }
                    result.boolValue_ = boolValue_;
                    if ((from_bitField0_ & 0x00000080) == 0x00000080) {
                        to_bitField0_ |= 0x00000080;
                    }
                    result.stringValue_ = stringValue_;
                    if ((from_bitField0_ & 0x00000100) == 0x00000100) {
                        to_bitField0_ |= 0x00000100;
                    }
                    result.bytesValue_ = bytesValue_;
                    result.bitField0_ = to_bitField0_;
                    onBuilt();
                    return result;
                }

                @Override
                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric) {
                        return mergeFrom((org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric) other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric other) {
                    if (other == org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric.getDefaultInstance()) {
                        return this;
                    }
                    if (other.hasName()) {
                        bitField0_ |= 0x00000001;
                        name_ = other.name_;
                        onChanged();
                    }
                    if (other.hasType()) {
                        setType(other.getType());
                    }
                    if (other.hasDoubleValue()) {
                        setDoubleValue(other.getDoubleValue());
                    }
                    if (other.hasFloatValue()) {
                        setFloatValue(other.getFloatValue());
                    }
                    if (other.hasLongValue()) {
                        setLongValue(other.getLongValue());
                    }
                    if (other.hasIntValue()) {
                        setIntValue(other.getIntValue());
                    }
                    if (other.hasBoolValue()) {
                        setBoolValue(other.getBoolValue());
                    }
                    if (other.hasStringValue()) {
                        bitField0_ |= 0x00000080;
                        stringValue_ = other.stringValue_;
                        onChanged();
                    }
                    if (other.hasBytesValue()) {
                        setBytesValue(other.getBytesValue());
                    }
                    mergeUnknownFields(other.getUnknownFields());
                    return this;
                }

                @Override
                public final boolean isInitialized() {
                    if (!hasName()) {

                        return false;
                    }
                    if (!hasType()) {

                        return false;
                    }
                    return true;
                }

                @Override
                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric) e.getUnfinishedMessage();
                        throw e;
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }

                private int bitField0_;

                private java.lang.Object name_ = "";

                /**
                 * <code>required string name = 1;</code>
                 */
                @Override
                public boolean hasName() {
                    return (bitField0_ & 0x00000001) == 0x00000001;
                }

                /**
                 * <code>required string name = 1;</code>
                 */
                @Override
                public java.lang.String getName() {
                    java.lang.Object ref = name_;
                    if (!(ref instanceof java.lang.String)) {
                        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
                        java.lang.String s = bs.toStringUtf8();
                        if (bs.isValidUtf8()) {
                            name_ = s;
                        }
                        return s;
                    } else {
                        return (java.lang.String) ref;
                    }
                }

                /**
                 * <code>required string name = 1;</code>
                 */
                @Override
                public com.google.protobuf.ByteString getNameBytes() {
                    java.lang.Object ref = name_;
                    if (ref instanceof String) {
                        com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                        name_ = b;
                        return b;
                    } else {
                        return (com.google.protobuf.ByteString) ref;
                    }
                }

                /**
                 * <code>required string name = 1;</code>
                 */
                public Builder setName(
                        java.lang.String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000001;
                    name_ = value;
                    onChanged();
                    return this;
                }

                /**
                 * <code>required string name = 1;</code>
                 */
                public Builder clearName() {
                    bitField0_ = bitField0_ & ~0x00000001;
                    name_ = getDefaultInstance().getName();
                    onChanged();
                    return this;
                }

                /**
                 * <code>required string name = 1;</code>
                 */
                public Builder setNameBytes(
                        com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000001;
                    name_ = value;
                    onChanged();
                    return this;
                }

                private org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric.ValueType type_ = org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric.ValueType.DOUBLE;

                /**
                 * <code>required .kuradatatypes.KuraPayload.KuraMetric.ValueType type = 2;</code>
                 */
                @Override
                public boolean hasType() {
                    return (bitField0_ & 0x00000002) == 0x00000002;
                }

                /**
                 * <code>required .kuradatatypes.KuraPayload.KuraMetric.ValueType type = 2;</code>
                 */
                @Override
                public org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric.ValueType getType() {
                    return type_;
                }

                /**
                 * <code>required .kuradatatypes.KuraPayload.KuraMetric.ValueType type = 2;</code>
                 */
                public Builder setType(org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric.ValueType value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000002;
                    type_ = value;
                    onChanged();
                    return this;
                }

                /**
                 * <code>required .kuradatatypes.KuraPayload.KuraMetric.ValueType type = 2;</code>
                 */
                public Builder clearType() {
                    bitField0_ = bitField0_ & ~0x00000002;
                    type_ = org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric.ValueType.DOUBLE;
                    onChanged();
                    return this;
                }

                private double doubleValue_;

                /**
                 * <code>optional double double_value = 3;</code>
                 */
                @Override
                public boolean hasDoubleValue() {
                    return (bitField0_ & 0x00000004) == 0x00000004;
                }

                /**
                 * <code>optional double double_value = 3;</code>
                 */
                @Override
                public double getDoubleValue() {
                    return doubleValue_;
                }

                /**
                 * <code>optional double double_value = 3;</code>
                 */
                public Builder setDoubleValue(double value) {
                    bitField0_ |= 0x00000004;
                    doubleValue_ = value;
                    onChanged();
                    return this;
                }

                /**
                 * <code>optional double double_value = 3;</code>
                 */
                public Builder clearDoubleValue() {
                    bitField0_ = bitField0_ & ~0x00000004;
                    doubleValue_ = 0D;
                    onChanged();
                    return this;
                }

                private float floatValue_;

                /**
                 * <code>optional float float_value = 4;</code>
                 */
                @Override
                public boolean hasFloatValue() {
                    return (bitField0_ & 0x00000008) == 0x00000008;
                }

                /**
                 * <code>optional float float_value = 4;</code>
                 */
                @Override
                public float getFloatValue() {
                    return floatValue_;
                }

                /**
                 * <code>optional float float_value = 4;</code>
                 */
                public Builder setFloatValue(float value) {
                    bitField0_ |= 0x00000008;
                    floatValue_ = value;
                    onChanged();
                    return this;
                }

                /**
                 * <code>optional float float_value = 4;</code>
                 */
                public Builder clearFloatValue() {
                    bitField0_ = bitField0_ & ~0x00000008;
                    floatValue_ = 0F;
                    onChanged();
                    return this;
                }

                private long longValue_;

                /**
                 * <code>optional int64 long_value = 5;</code>
                 */
                @Override
                public boolean hasLongValue() {
                    return (bitField0_ & 0x00000010) == 0x00000010;
                }

                /**
                 * <code>optional int64 long_value = 5;</code>
                 */
                @Override
                public long getLongValue() {
                    return longValue_;
                }

                /**
                 * <code>optional int64 long_value = 5;</code>
                 */
                public Builder setLongValue(long value) {
                    bitField0_ |= 0x00000010;
                    longValue_ = value;
                    onChanged();
                    return this;
                }

                /**
                 * <code>optional int64 long_value = 5;</code>
                 */
                public Builder clearLongValue() {
                    bitField0_ = bitField0_ & ~0x00000010;
                    longValue_ = 0L;
                    onChanged();
                    return this;
                }

                private int intValue_;

                /**
                 * <code>optional int32 int_value = 6;</code>
                 */
                @Override
                public boolean hasIntValue() {
                    return (bitField0_ & 0x00000020) == 0x00000020;
                }

                /**
                 * <code>optional int32 int_value = 6;</code>
                 */
                @Override
                public int getIntValue() {
                    return intValue_;
                }

                /**
                 * <code>optional int32 int_value = 6;</code>
                 */
                public Builder setIntValue(int value) {
                    bitField0_ |= 0x00000020;
                    intValue_ = value;
                    onChanged();
                    return this;
                }

                /**
                 * <code>optional int32 int_value = 6;</code>
                 */
                public Builder clearIntValue() {
                    bitField0_ = bitField0_ & ~0x00000020;
                    intValue_ = 0;
                    onChanged();
                    return this;
                }

                private boolean boolValue_;

                /**
                 * <code>optional bool bool_value = 7;</code>
                 */
                @Override
                public boolean hasBoolValue() {
                    return (bitField0_ & 0x00000040) == 0x00000040;
                }

                /**
                 * <code>optional bool bool_value = 7;</code>
                 */
                @Override
                public boolean getBoolValue() {
                    return boolValue_;
                }

                /**
                 * <code>optional bool bool_value = 7;</code>
                 */
                public Builder setBoolValue(boolean value) {
                    bitField0_ |= 0x00000040;
                    boolValue_ = value;
                    onChanged();
                    return this;
                }

                /**
                 * <code>optional bool bool_value = 7;</code>
                 */
                public Builder clearBoolValue() {
                    bitField0_ = bitField0_ & ~0x00000040;
                    boolValue_ = false;
                    onChanged();
                    return this;
                }

                private java.lang.Object stringValue_ = "";

                /**
                 * <code>optional string string_value = 8;</code>
                 */
                @Override
                public boolean hasStringValue() {
                    return (bitField0_ & 0x00000080) == 0x00000080;
                }

                /**
                 * <code>optional string string_value = 8;</code>
                 */
                @Override
                public java.lang.String getStringValue() {
                    java.lang.Object ref = stringValue_;
                    if (!(ref instanceof java.lang.String)) {
                        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
                        java.lang.String s = bs.toStringUtf8();
                        if (bs.isValidUtf8()) {
                            stringValue_ = s;
                        }
                        return s;
                    } else {
                        return (java.lang.String) ref;
                    }
                }

                /**
                 * <code>optional string string_value = 8;</code>
                 */
                @Override
                public com.google.protobuf.ByteString getStringValueBytes() {
                    java.lang.Object ref = stringValue_;
                    if (ref instanceof String) {
                        com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                        stringValue_ = b;
                        return b;
                    } else {
                        return (com.google.protobuf.ByteString) ref;
                    }
                }

                /**
                 * <code>optional string string_value = 8;</code>
                 */
                public Builder setStringValue(
                        java.lang.String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000080;
                    stringValue_ = value;
                    onChanged();
                    return this;
                }

                /**
                 * <code>optional string string_value = 8;</code>
                 */
                public Builder clearStringValue() {
                    bitField0_ = bitField0_ & ~0x00000080;
                    stringValue_ = getDefaultInstance().getStringValue();
                    onChanged();
                    return this;
                }

                /**
                 * <code>optional string string_value = 8;</code>
                 */
                public Builder setStringValueBytes(
                        com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000080;
                    stringValue_ = value;
                    onChanged();
                    return this;
                }

                private com.google.protobuf.ByteString bytesValue_ = com.google.protobuf.ByteString.EMPTY;

                /**
                 * <code>optional bytes bytes_value = 9;</code>
                 */
                @Override
                public boolean hasBytesValue() {
                    return (bitField0_ & 0x00000100) == 0x00000100;
                }

                /**
                 * <code>optional bytes bytes_value = 9;</code>
                 */
                @Override
                public com.google.protobuf.ByteString getBytesValue() {
                    return bytesValue_;
                }

                /**
                 * <code>optional bytes bytes_value = 9;</code>
                 */
                public Builder setBytesValue(com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000100;
                    bytesValue_ = value;
                    onChanged();
                    return this;
                }

                /**
                 * <code>optional bytes bytes_value = 9;</code>
                 */
                public Builder clearBytesValue() {
                    bitField0_ = bitField0_ & ~0x00000100;
                    bytesValue_ = getDefaultInstance().getBytesValue();
                    onChanged();
                    return this;
                }

                // @@protoc_insertion_point(builder_scope:kuradatatypes.KuraPayload.KuraMetric)
            }

            static {
                DEFAULT_INSTANCE = new KuraMetric(true);
                DEFAULT_INSTANCE.initFields();
            }

            // @@protoc_insertion_point(class_scope:kuradatatypes.KuraPayload.KuraMetric)
        }

        public interface KuraPositionOrBuilder extends
                // @@protoc_insertion_point(interface_extends:kuradatatypes.KuraPayload.KuraPosition)
                com.google.protobuf.MessageOrBuilder {

            /**
             * <code>required double latitude = 1;</code>
             */
            boolean hasLatitude();

            /**
             * <code>required double latitude = 1;</code>
             */
            double getLatitude();

            /**
             * <code>required double longitude = 2;</code>
             */
            boolean hasLongitude();

            /**
             * <code>required double longitude = 2;</code>
             */
            double getLongitude();

            /**
             * <code>optional double altitude = 3;</code>
             */
            boolean hasAltitude();

            /**
             * <code>optional double altitude = 3;</code>
             */
            double getAltitude();

            /**
             * <code>optional double precision = 4;</code>
             *
             * <pre>
             * dilution of precision of the current satellite fix.
             * </pre>
             */
            boolean hasPrecision();

            /**
             * <code>optional double precision = 4;</code>
             *
             * <pre>
             * dilution of precision of the current satellite fix.
             * </pre>
             */
            double getPrecision();

            /**
             * <code>optional double heading = 5;</code>
             *
             * <pre>
             * heading in degrees
             * </pre>
             */
            boolean hasHeading();

            /**
             * <code>optional double heading = 5;</code>
             *
             * <pre>
             * heading in degrees
             * </pre>
             */
            double getHeading();

            /**
             * <code>optional double speed = 6;</code>
             *
             * <pre>
             * meters per second
             * </pre>
             */
            boolean hasSpeed();

            /**
             * <code>optional double speed = 6;</code>
             *
             * <pre>
             * meters per second
             * </pre>
             */
            double getSpeed();

            /**
             * <code>optional int64 timestamp = 7;</code>
             */
            boolean hasTimestamp();

            /**
             * <code>optional int64 timestamp = 7;</code>
             */
            long getTimestamp();

            /**
             * <code>optional int32 satellites = 8;</code>
             *
             * <pre>
             * number satellites locked by the GPS device
             * </pre>
             */
            boolean hasSatellites();

            /**
             * <code>optional int32 satellites = 8;</code>
             *
             * <pre>
             * number satellites locked by the GPS device
             * </pre>
             */
            int getSatellites();

            /**
             * <code>optional int32 status = 9;</code>
             *
             * <pre>
             * status indicator for the GPS data: 1 = no GPS response; 2 = error in response; 4 = valid.
             * </pre>
             */
            boolean hasStatus();

            /**
             * <code>optional int32 status = 9;</code>
             *
             * <pre>
             * status indicator for the GPS data: 1 = no GPS response; 2 = error in response; 4 = valid.
             * </pre>
             */
            int getStatus();
        }

        /**
         * Protobuf type {@code kuradatatypes.KuraPayload.KuraPosition}
         */
        public static final class KuraPosition extends
                com.google.protobuf.GeneratedMessage implements
                // @@protoc_insertion_point(message_implements:kuradatatypes.KuraPayload.KuraPosition)
                KuraPositionOrBuilder {

            // Use KuraPosition.newBuilder() to construct.
            private KuraPosition(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
                super(builder);
                unknownFields = builder.getUnknownFields();
            }

            private KuraPosition(boolean noInit) {
                unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
            }

            private static final KuraPosition DEFAULT_INSTANCE;

            public static KuraPosition getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            @Override
            public KuraPosition getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            private final com.google.protobuf.UnknownFieldSet unknownFields;

            @java.lang.Override
            public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
                return unknownFields;
            }

            private KuraPosition(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                initFields();
                com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 9: {
                            bitField0_ |= 0x00000001;
                            latitude_ = input.readDouble();
                            break;
                        }
                        case 17: {
                            bitField0_ |= 0x00000002;
                            longitude_ = input.readDouble();
                            break;
                        }
                        case 25: {
                            bitField0_ |= 0x00000004;
                            altitude_ = input.readDouble();
                            break;
                        }
                        case 33: {
                            bitField0_ |= 0x00000008;
                            precision_ = input.readDouble();
                            break;
                        }
                        case 41: {
                            bitField0_ |= 0x00000010;
                            heading_ = input.readDouble();
                            break;
                        }
                        case 49: {
                            bitField0_ |= 0x00000020;
                            speed_ = input.readDouble();
                            break;
                        }
                        case 56: {
                            bitField0_ |= 0x00000040;
                            timestamp_ = input.readInt64();
                            break;
                        }
                        case 64: {
                            bitField0_ |= 0x00000080;
                            satellites_ = input.readInt32();
                            break;
                        }
                        case 72: {
                            bitField0_ |= 0x00000100;
                            status_ = input.readInt32();
                            break;
                        }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e.getMessage()).setUnfinishedMessage(this);
                } finally {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.INTERNAL_STATIC_KURADATATYPES_KURAPAYLOAD_KURAPOSITION_DESCRIPTOR;
            }

            @Override
            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.internal_static_kuradatatypes_KuraPayload_KuraPosition_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition.class,
                                org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition.Builder.class);
            }

            public static com.google.protobuf.Parser<KuraPosition> PARSER = new com.google.protobuf.AbstractParser<KuraPosition>() {

                @Override
                public KuraPosition parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new KuraPosition(input, extensionRegistry);
                }
            };

            @java.lang.Override
            public com.google.protobuf.Parser<KuraPosition> getParserForType() {
                return PARSER;
            }

            private int bitField0_;
            public static final int LATITUDE_FIELD_NUMBER = 1;
            private double latitude_;

            /**
             * <code>required double latitude = 1;</code>
             */
            @Override
            public boolean hasLatitude() {
                return (bitField0_ & 0x00000001) == 0x00000001;
            }

            /**
             * <code>required double latitude = 1;</code>
             */
            @Override
            public double getLatitude() {
                return latitude_;
            }

            public static final int LONGITUDE_FIELD_NUMBER = 2;
            private double longitude_;

            /**
             * <code>required double longitude = 2;</code>
             */
            @Override
            public boolean hasLongitude() {
                return (bitField0_ & 0x00000002) == 0x00000002;
            }

            /**
             * <code>required double longitude = 2;</code>
             */
            @Override
            public double getLongitude() {
                return longitude_;
            }

            public static final int ALTITUDE_FIELD_NUMBER = 3;
            private double altitude_;

            /**
             * <code>optional double altitude = 3;</code>
             */
            @Override
            public boolean hasAltitude() {
                return (bitField0_ & 0x00000004) == 0x00000004;
            }

            /**
             * <code>optional double altitude = 3;</code>
             */
            @Override
            public double getAltitude() {
                return altitude_;
            }

            public static final int PRECISION_FIELD_NUMBER = 4;
            private double precision_;

            /**
             * <code>optional double precision = 4;</code>
             *
             * <pre>
             * dilution of precision of the current satellite fix.
             * </pre>
             */
            @Override
            public boolean hasPrecision() {
                return (bitField0_ & 0x00000008) == 0x00000008;
            }

            /**
             * <code>optional double precision = 4;</code>
             *
             * <pre>
             * dilution of precision of the current satellite fix.
             * </pre>
             */
            @Override
            public double getPrecision() {
                return precision_;
            }

            public static final int HEADING_FIELD_NUMBER = 5;
            private double heading_;

            /**
             * <code>optional double heading = 5;</code>
             *
             * <pre>
             * heading in degrees
             * </pre>
             */
            @Override
            public boolean hasHeading() {
                return (bitField0_ & 0x00000010) == 0x00000010;
            }

            /**
             * <code>optional double heading = 5;</code>
             *
             * <pre>
             * heading in degrees
             * </pre>
             */
            @Override
            public double getHeading() {
                return heading_;
            }

            public static final int SPEED_FIELD_NUMBER = 6;
            private double speed_;

            /**
             * <code>optional double speed = 6;</code>
             *
             * <pre>
             * meters per second
             * </pre>
             */
            @Override
            public boolean hasSpeed() {
                return (bitField0_ & 0x00000020) == 0x00000020;
            }

            /**
             * <code>optional double speed = 6;</code>
             *
             * <pre>
             * meters per second
             * </pre>
             */
            @Override
            public double getSpeed() {
                return speed_;
            }

            public static final int TIMESTAMP_FIELD_NUMBER = 7;
            private long timestamp_;

            /**
             * <code>optional int64 timestamp = 7;</code>
             */
            @Override
            public boolean hasTimestamp() {
                return (bitField0_ & 0x00000040) == 0x00000040;
            }

            /**
             * <code>optional int64 timestamp = 7;</code>
             */
            @Override
            public long getTimestamp() {
                return timestamp_;
            }

            public static final int SATELLITES_FIELD_NUMBER = 8;
            private int satellites_;

            /**
             * <code>optional int32 satellites = 8;</code>
             *
             * <pre>
             * number satellites locked by the GPS device
             * </pre>
             */
            @Override
            public boolean hasSatellites() {
                return (bitField0_ & 0x00000080) == 0x00000080;
            }

            /**
             * <code>optional int32 satellites = 8;</code>
             *
             * <pre>
             * number satellites locked by the GPS device
             * </pre>
             */
            @Override
            public int getSatellites() {
                return satellites_;
            }

            public static final int STATUS_FIELD_NUMBER = 9;
            private int status_;

            /**
             * <code>optional int32 status = 9;</code>
             *
             * <pre>
             * status indicator for the GPS data: 1 = no GPS response; 2 = error in response; 4 = valid.
             * </pre>
             */
            @Override
            public boolean hasStatus() {
                return (bitField0_ & 0x00000100) == 0x00000100;
            }

            /**
             * <code>optional int32 status = 9;</code>
             *
             * <pre>
             * status indicator for the GPS data: 1 = no GPS response; 2 = error in response; 4 = valid.
             * </pre>
             */
            @Override
            public int getStatus() {
                return status_;
            }

            private void initFields() {
                latitude_ = 0D;
                longitude_ = 0D;
                altitude_ = 0D;
                precision_ = 0D;
                heading_ = 0D;
                speed_ = 0D;
                timestamp_ = 0L;
                satellites_ = 0;
                status_ = 0;
            }

            private byte memoizedIsInitialized = -1;

            @Override
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized == 1) {
                    return true;
                }
                if (isInitialized == 0) {
                    return false;
                }

                if (!hasLatitude()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
                if (!hasLongitude()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
                memoizedIsInitialized = 1;
                return true;
            }

            @Override
            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                getSerializedSize();
                if ((bitField0_ & 0x00000001) == 0x00000001) {
                    output.writeDouble(1, latitude_);
                }
                if ((bitField0_ & 0x00000002) == 0x00000002) {
                    output.writeDouble(2, longitude_);
                }
                if ((bitField0_ & 0x00000004) == 0x00000004) {
                    output.writeDouble(3, altitude_);
                }
                if ((bitField0_ & 0x00000008) == 0x00000008) {
                    output.writeDouble(4, precision_);
                }
                if ((bitField0_ & 0x00000010) == 0x00000010) {
                    output.writeDouble(5, heading_);
                }
                if ((bitField0_ & 0x00000020) == 0x00000020) {
                    output.writeDouble(6, speed_);
                }
                if ((bitField0_ & 0x00000040) == 0x00000040) {
                    output.writeInt64(7, timestamp_);
                }
                if ((bitField0_ & 0x00000080) == 0x00000080) {
                    output.writeInt32(8, satellites_);
                }
                if ((bitField0_ & 0x00000100) == 0x00000100) {
                    output.writeInt32(9, status_);
                }
                getUnknownFields().writeTo(output);
            }

            private int memoizedSerializedSize = -1;

            @Override
            public int getSerializedSize() {
                int size = memoizedSerializedSize;
                if (size != -1) {
                    return size;
                }

                size = 0;
                if ((bitField0_ & 0x00000001) == 0x00000001) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeDoubleSize(1, latitude_);
                }
                if ((bitField0_ & 0x00000002) == 0x00000002) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeDoubleSize(2, longitude_);
                }
                if ((bitField0_ & 0x00000004) == 0x00000004) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeDoubleSize(3, altitude_);
                }
                if ((bitField0_ & 0x00000008) == 0x00000008) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeDoubleSize(4, precision_);
                }
                if ((bitField0_ & 0x00000010) == 0x00000010) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeDoubleSize(5, heading_);
                }
                if ((bitField0_ & 0x00000020) == 0x00000020) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeDoubleSize(6, speed_);
                }
                if ((bitField0_ & 0x00000040) == 0x00000040) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeInt64Size(7, timestamp_);
                }
                if ((bitField0_ & 0x00000080) == 0x00000080) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeInt32Size(8, satellites_);
                }
                if ((bitField0_ & 0x00000100) == 0x00000100) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeInt32Size(9, status_);
                }
                size += getUnknownFields().getSerializedSize();
                memoizedSerializedSize = size;
                return size;
            }

            private static final long serialVersionUID = 0L;

            @java.lang.Override
            protected java.lang.Object writeReplace()
                    throws java.io.ObjectStreamException {
                return super.writeReplace();
            }

            public static org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }

            public static org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }

            public static org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }

            public static org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }

            public static org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return PARSER.parseFrom(input);
            }

            public static org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseFrom(input, extensionRegistry);
            }

            public static org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return PARSER.parseDelimitedFrom(input);
            }

            public static org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseDelimitedFrom(input, extensionRegistry);
            }

            public static org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return PARSER.parseFrom(input);
            }

            public static org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseFrom(input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return Builder.create();
            }

            @Override
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Builder newBuilder(org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition prototype) {
                return newBuilder().mergeFrom(prototype);
            }

            @Override
            public Builder toBuilder() {
                return newBuilder(this);
            }

            @java.lang.Override
            protected Builder newBuilderForType(
                    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }

            /**
             * Protobuf type {@code kuradatatypes.KuraPayload.KuraPosition}
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessage.Builder<Builder> implements
                    // @@protoc_insertion_point(builder_implements:kuradatatypes.KuraPayload.KuraPosition)
                    org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPositionOrBuilder {

                public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                    return org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.INTERNAL_STATIC_KURADATATYPES_KURAPAYLOAD_KURAPOSITION_DESCRIPTOR;
                }

                @Override
                protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.internal_static_kuradatatypes_KuraPayload_KuraPosition_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition.class,
                                    org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition.Builder.class);
                }

                // Construct using org.eclipse.kapua.service.device.call.message.tmp.kura.KuraPayloadProto.KuraPayload.KuraPosition.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }

                private void maybeForceBuilderInitialization() {
                }

                private static Builder create() {
                    return new Builder();
                }

                @Override
                public Builder clear() {
                    super.clear();
                    latitude_ = 0D;
                    bitField0_ = bitField0_ & ~0x00000001;
                    longitude_ = 0D;
                    bitField0_ = bitField0_ & ~0x00000002;
                    altitude_ = 0D;
                    bitField0_ = bitField0_ & ~0x00000004;
                    precision_ = 0D;
                    bitField0_ = bitField0_ & ~0x00000008;
                    heading_ = 0D;
                    bitField0_ = bitField0_ & ~0x00000010;
                    speed_ = 0D;
                    bitField0_ = bitField0_ & ~0x00000020;
                    timestamp_ = 0L;
                    bitField0_ = bitField0_ & ~0x00000040;
                    satellites_ = 0;
                    bitField0_ = bitField0_ & ~0x00000080;
                    status_ = 0;
                    bitField0_ = bitField0_ & ~0x00000100;
                    return this;
                }

                @Override
                public Builder clone() {
                    return create().mergeFrom(buildPartial());
                }

                @Override
                public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                    return org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.INTERNAL_STATIC_KURADATATYPES_KURAPAYLOAD_KURAPOSITION_DESCRIPTOR;
                }

                @Override
                public org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition getDefaultInstanceForType() {
                    return org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition.getDefaultInstance();
                }

                @Override
                public org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition build() {
                    org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                @Override
                public org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition buildPartial() {
                    org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition result = new org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition(
                            this);
                    int from_bitField0_ = bitField0_;
                    int to_bitField0_ = 0;
                    if ((from_bitField0_ & 0x00000001) == 0x00000001) {
                        to_bitField0_ |= 0x00000001;
                    }
                    result.latitude_ = latitude_;
                    if ((from_bitField0_ & 0x00000002) == 0x00000002) {
                        to_bitField0_ |= 0x00000002;
                    }
                    result.longitude_ = longitude_;
                    if ((from_bitField0_ & 0x00000004) == 0x00000004) {
                        to_bitField0_ |= 0x00000004;
                    }
                    result.altitude_ = altitude_;
                    if ((from_bitField0_ & 0x00000008) == 0x00000008) {
                        to_bitField0_ |= 0x00000008;
                    }
                    result.precision_ = precision_;
                    if ((from_bitField0_ & 0x00000010) == 0x00000010) {
                        to_bitField0_ |= 0x00000010;
                    }
                    result.heading_ = heading_;
                    if ((from_bitField0_ & 0x00000020) == 0x00000020) {
                        to_bitField0_ |= 0x00000020;
                    }
                    result.speed_ = speed_;
                    if ((from_bitField0_ & 0x00000040) == 0x00000040) {
                        to_bitField0_ |= 0x00000040;
                    }
                    result.timestamp_ = timestamp_;
                    if ((from_bitField0_ & 0x00000080) == 0x00000080) {
                        to_bitField0_ |= 0x00000080;
                    }
                    result.satellites_ = satellites_;
                    if ((from_bitField0_ & 0x00000100) == 0x00000100) {
                        to_bitField0_ |= 0x00000100;
                    }
                    result.status_ = status_;
                    result.bitField0_ = to_bitField0_;
                    onBuilt();
                    return result;
                }

                @Override
                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition) {
                        return mergeFrom((org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition) other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition other) {
                    if (other == org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition.getDefaultInstance()) {
                        return this;
                    }
                    if (other.hasLatitude()) {
                        setLatitude(other.getLatitude());
                    }
                    if (other.hasLongitude()) {
                        setLongitude(other.getLongitude());
                    }
                    if (other.hasAltitude()) {
                        setAltitude(other.getAltitude());
                    }
                    if (other.hasPrecision()) {
                        setPrecision(other.getPrecision());
                    }
                    if (other.hasHeading()) {
                        setHeading(other.getHeading());
                    }
                    if (other.hasSpeed()) {
                        setSpeed(other.getSpeed());
                    }
                    if (other.hasTimestamp()) {
                        setTimestamp(other.getTimestamp());
                    }
                    if (other.hasSatellites()) {
                        setSatellites(other.getSatellites());
                    }
                    if (other.hasStatus()) {
                        setStatus(other.getStatus());
                    }
                    mergeUnknownFields(other.getUnknownFields());
                    return this;
                }

                @Override
                public final boolean isInitialized() {
                    if (!hasLatitude()) {

                        return false;
                    }
                    if (!hasLongitude()) {

                        return false;
                    }
                    return true;
                }

                @Override
                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition) e.getUnfinishedMessage();
                        throw e;
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }

                private int bitField0_;

                private double latitude_;

                /**
                 * <code>required double latitude = 1;</code>
                 */
                @Override
                public boolean hasLatitude() {
                    return (bitField0_ & 0x00000001) == 0x00000001;
                }

                /**
                 * <code>required double latitude = 1;</code>
                 */
                @Override
                public double getLatitude() {
                    return latitude_;
                }

                /**
                 * <code>required double latitude = 1;</code>
                 */
                public Builder setLatitude(double value) {
                    bitField0_ |= 0x00000001;
                    latitude_ = value;
                    onChanged();
                    return this;
                }

                /**
                 * <code>required double latitude = 1;</code>
                 */
                public Builder clearLatitude() {
                    bitField0_ = bitField0_ & ~0x00000001;
                    latitude_ = 0D;
                    onChanged();
                    return this;
                }

                private double longitude_;

                /**
                 * <code>required double longitude = 2;</code>
                 */
                @Override
                public boolean hasLongitude() {
                    return (bitField0_ & 0x00000002) == 0x00000002;
                }

                /**
                 * <code>required double longitude = 2;</code>
                 */
                @Override
                public double getLongitude() {
                    return longitude_;
                }

                /**
                 * <code>required double longitude = 2;</code>
                 */
                public Builder setLongitude(double value) {
                    bitField0_ |= 0x00000002;
                    longitude_ = value;
                    onChanged();
                    return this;
                }

                /**
                 * <code>required double longitude = 2;</code>
                 */
                public Builder clearLongitude() {
                    bitField0_ = bitField0_ & ~0x00000002;
                    longitude_ = 0D;
                    onChanged();
                    return this;
                }

                private double altitude_;

                /**
                 * <code>optional double altitude = 3;</code>
                 */
                @Override
                public boolean hasAltitude() {
                    return (bitField0_ & 0x00000004) == 0x00000004;
                }

                /**
                 * <code>optional double altitude = 3;</code>
                 */
                @Override
                public double getAltitude() {
                    return altitude_;
                }

                /**
                 * <code>optional double altitude = 3;</code>
                 */
                public Builder setAltitude(double value) {
                    bitField0_ |= 0x00000004;
                    altitude_ = value;
                    onChanged();
                    return this;
                }

                /**
                 * <code>optional double altitude = 3;</code>
                 */
                public Builder clearAltitude() {
                    bitField0_ = bitField0_ & ~0x00000004;
                    altitude_ = 0D;
                    onChanged();
                    return this;
                }

                private double precision_;

                /**
                 * <code>optional double precision = 4;</code>
                 *
                 * <pre>
                 * dilution of precision of the current satellite fix.
                 * </pre>
                 */
                @Override
                public boolean hasPrecision() {
                    return (bitField0_ & 0x00000008) == 0x00000008;
                }

                /**
                 * <code>optional double precision = 4;</code>
                 *
                 * <pre>
                 * dilution of precision of the current satellite fix.
                 * </pre>
                 */
                @Override
                public double getPrecision() {
                    return precision_;
                }

                /**
                 * <code>optional double precision = 4;</code>
                 *
                 * <pre>
                 * dilution of precision of the current satellite fix.
                 * </pre>
                 */
                public Builder setPrecision(double value) {
                    bitField0_ |= 0x00000008;
                    precision_ = value;
                    onChanged();
                    return this;
                }

                /**
                 * <code>optional double precision = 4;</code>
                 *
                 * <pre>
                 * dilution of precision of the current satellite fix.
                 * </pre>
                 */
                public Builder clearPrecision() {
                    bitField0_ = bitField0_ & ~0x00000008;
                    precision_ = 0D;
                    onChanged();
                    return this;
                }

                private double heading_;

                /**
                 * <code>optional double heading = 5;</code>
                 *
                 * <pre>
                 * heading in degrees
                 * </pre>
                 */
                @Override
                public boolean hasHeading() {
                    return (bitField0_ & 0x00000010) == 0x00000010;
                }

                /**
                 * <code>optional double heading = 5;</code>
                 *
                 * <pre>
                 * heading in degrees
                 * </pre>
                 */
                @Override
                public double getHeading() {
                    return heading_;
                }

                /**
                 * <code>optional double heading = 5;</code>
                 *
                 * <pre>
                 * heading in degrees
                 * </pre>
                 */
                public Builder setHeading(double value) {
                    bitField0_ |= 0x00000010;
                    heading_ = value;
                    onChanged();
                    return this;
                }

                /**
                 * <code>optional double heading = 5;</code>
                 *
                 * <pre>
                 * heading in degrees
                 * </pre>
                 */
                public Builder clearHeading() {
                    bitField0_ = bitField0_ & ~0x00000010;
                    heading_ = 0D;
                    onChanged();
                    return this;
                }

                private double speed_;

                /**
                 * <code>optional double speed = 6;</code>
                 *
                 * <pre>
                 * meters per second
                 * </pre>
                 */
                @Override
                public boolean hasSpeed() {
                    return (bitField0_ & 0x00000020) == 0x00000020;
                }

                /**
                 * <code>optional double speed = 6;</code>
                 *
                 * <pre>
                 * meters per second
                 * </pre>
                 */
                @Override
                public double getSpeed() {
                    return speed_;
                }

                /**
                 * <code>optional double speed = 6;</code>
                 *
                 * <pre>
                 * meters per second
                 * </pre>
                 */
                public Builder setSpeed(double value) {
                    bitField0_ |= 0x00000020;
                    speed_ = value;
                    onChanged();
                    return this;
                }

                /**
                 * <code>optional double speed = 6;</code>
                 *
                 * <pre>
                 * meters per second
                 * </pre>
                 */
                public Builder clearSpeed() {
                    bitField0_ = bitField0_ & ~0x00000020;
                    speed_ = 0D;
                    onChanged();
                    return this;
                }

                private long timestamp_;

                /**
                 * <code>optional int64 timestamp = 7;</code>
                 */
                @Override
                public boolean hasTimestamp() {
                    return (bitField0_ & 0x00000040) == 0x00000040;
                }

                /**
                 * <code>optional int64 timestamp = 7;</code>
                 */
                @Override
                public long getTimestamp() {
                    return timestamp_;
                }

                /**
                 * <code>optional int64 timestamp = 7;</code>
                 */
                public Builder setTimestamp(long value) {
                    bitField0_ |= 0x00000040;
                    timestamp_ = value;
                    onChanged();
                    return this;
                }

                /**
                 * <code>optional int64 timestamp = 7;</code>
                 */
                public Builder clearTimestamp() {
                    bitField0_ = bitField0_ & ~0x00000040;
                    timestamp_ = 0L;
                    onChanged();
                    return this;
                }

                private int satellites_;

                /**
                 * <code>optional int32 satellites = 8;</code>
                 *
                 * <pre>
                 * number satellites locked by the GPS device
                 * </pre>
                 */
                @Override
                public boolean hasSatellites() {
                    return (bitField0_ & 0x00000080) == 0x00000080;
                }

                /**
                 * <code>optional int32 satellites = 8;</code>
                 *
                 * <pre>
                 * number satellites locked by the GPS device
                 * </pre>
                 */
                @Override
                public int getSatellites() {
                    return satellites_;
                }

                /**
                 * <code>optional int32 satellites = 8;</code>
                 *
                 * <pre>
                 * number satellites locked by the GPS device
                 * </pre>
                 */
                public Builder setSatellites(int value) {
                    bitField0_ |= 0x00000080;
                    satellites_ = value;
                    onChanged();
                    return this;
                }

                /**
                 * <code>optional int32 satellites = 8;</code>
                 *
                 * <pre>
                 * number satellites locked by the GPS device
                 * </pre>
                 */
                public Builder clearSatellites() {
                    bitField0_ = bitField0_ & ~0x00000080;
                    satellites_ = 0;
                    onChanged();
                    return this;
                }

                private int status_;

                /**
                 * <code>optional int32 status = 9;</code>
                 *
                 * <pre>
                 * status indicator for the GPS data: 1 = no GPS response; 2 = error in response; 4 = valid.
                 * </pre>
                 */
                @Override
                public boolean hasStatus() {
                    return (bitField0_ & 0x00000100) == 0x00000100;
                }

                /**
                 * <code>optional int32 status = 9;</code>
                 *
                 * <pre>
                 * status indicator for the GPS data: 1 = no GPS response; 2 = error in response; 4 = valid.
                 * </pre>
                 */
                @Override
                public int getStatus() {
                    return status_;
                }

                /**
                 * <code>optional int32 status = 9;</code>
                 *
                 * <pre>
                 * status indicator for the GPS data: 1 = no GPS response; 2 = error in response; 4 = valid.
                 * </pre>
                 */
                public Builder setStatus(int value) {
                    bitField0_ |= 0x00000100;
                    status_ = value;
                    onChanged();
                    return this;
                }

                /**
                 * <code>optional int32 status = 9;</code>
                 *
                 * <pre>
                 * status indicator for the GPS data: 1 = no GPS response; 2 = error in response; 4 = valid.
                 * </pre>
                 */
                public Builder clearStatus() {
                    bitField0_ = bitField0_ & ~0x00000100;
                    status_ = 0;
                    onChanged();
                    return this;
                }

                // @@protoc_insertion_point(builder_scope:kuradatatypes.KuraPayload.KuraPosition)
            }

            static {
                DEFAULT_INSTANCE = new KuraPosition(true);
                DEFAULT_INSTANCE.initFields();
            }

            // @@protoc_insertion_point(class_scope:kuradatatypes.KuraPayload.KuraPosition)
        }

        private int bitField0_;
        public static final int TIMESTAMP_FIELD_NUMBER = 1;
        private long timestamp_;

        /**
         * <code>optional int64 timestamp = 1;</code>
         */
        @Override
        public boolean hasTimestamp() {
            return (bitField0_ & 0x00000001) == 0x00000001;
        }

        /**
         * <code>optional int64 timestamp = 1;</code>
         */
        @Override
        public long getTimestamp() {
            return timestamp_;
        }

        public static final int POSITION_FIELD_NUMBER = 2;
        private org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition position_;

        /**
         * <code>optional .kuradatatypes.KuraPayload.KuraPosition position = 2;</code>
         */
        @Override
        public boolean hasPosition() {
            return (bitField0_ & 0x00000002) == 0x00000002;
        }

        /**
         * <code>optional .kuradatatypes.KuraPayload.KuraPosition position = 2;</code>
         */
        @Override
        public org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition getPosition() {
            return position_;
        }

        /**
         * <code>optional .kuradatatypes.KuraPayload.KuraPosition position = 2;</code>
         */
        @Override
        public org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPositionOrBuilder getPositionOrBuilder() {
            return position_;
        }

        public static final int METRIC_FIELD_NUMBER = 5000;
        private java.util.List<org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric> metric_;

        /**
         * <code>repeated .kuradatatypes.KuraPayload.KuraMetric metric = 5000;</code>
         *
         * <pre>
         * can be zero, so optional
         * </pre>
         */
        @Override
        public java.util.List<org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric> getMetricList() {
            return metric_;
        }

        /**
         * <code>repeated .kuradatatypes.KuraPayload.KuraMetric metric = 5000;</code>
         *
         * <pre>
         * can be zero, so optional
         * </pre>
         */
        @Override
        public java.util.List<? extends org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetricOrBuilder> getMetricOrBuilderList() {
            return metric_;
        }

        /**
         * <code>repeated .kuradatatypes.KuraPayload.KuraMetric metric = 5000;</code>
         *
         * <pre>
         * can be zero, so optional
         * </pre>
         */
        @Override
        public int getMetricCount() {
            return metric_.size();
        }

        /**
         * <code>repeated .kuradatatypes.KuraPayload.KuraMetric metric = 5000;</code>
         *
         * <pre>
         * can be zero, so optional
         * </pre>
         */
        @Override
        public org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric getMetric(int index) {
            return metric_.get(index);
        }

        /**
         * <code>repeated .kuradatatypes.KuraPayload.KuraMetric metric = 5000;</code>
         *
         * <pre>
         * can be zero, so optional
         * </pre>
         */
        @Override
        public org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetricOrBuilder getMetricOrBuilder(
                int index) {
            return metric_.get(index);
        }

        public static final int BODY_FIELD_NUMBER = 5001;
        private com.google.protobuf.ByteString body_;

        /**
         * <code>optional bytes body = 5001;</code>
         */
        @Override
        public boolean hasBody() {
            return (bitField0_ & 0x00000004) == 0x00000004;
        }

        /**
         * <code>optional bytes body = 5001;</code>
         */
        @Override
        public com.google.protobuf.ByteString getBody() {
            return body_;
        }

        private void initFields() {
            timestamp_ = 0L;
            position_ = org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition.getDefaultInstance();
            metric_ = java.util.Collections.emptyList();
            body_ = com.google.protobuf.ByteString.EMPTY;
        }

        private byte memoizedIsInitialized = -1;

        @Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }

            if (hasPosition()) {
                if (!getPosition().isInitialized()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
            }
            for (int i = 0; i < getMetricCount(); i++) {
                if (!getMetric(i).isInitialized()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
            }
            if (!extensionsAreInitialized()) {
                memoizedIsInitialized = 0;
                return false;
            }
            memoizedIsInitialized = 1;
            return true;
        }

        @Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            com.google.protobuf.GeneratedMessage.ExtendableMessage<org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload>.ExtensionWriter extensionWriter = newExtensionWriter();
            if ((bitField0_ & 0x00000001) == 0x00000001) {
                output.writeInt64(1, timestamp_);
            }
            if ((bitField0_ & 0x00000002) == 0x00000002) {
                output.writeMessage(2, position_);
            }
            extensionWriter.writeUntil(5000, output);
            for (int i = 0; i < metric_.size(); i++) {
                output.writeMessage(5000, metric_.get(i));
            }
            if ((bitField0_ & 0x00000004) == 0x00000004) {
                output.writeBytes(5001, body_);
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;

        @Override
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) {
                return size;
            }

            size = 0;
            if ((bitField0_ & 0x00000001) == 0x00000001) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt64Size(1, timestamp_);
            }
            if ((bitField0_ & 0x00000002) == 0x00000002) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(2, position_);
            }
            for (int i = 0; i < metric_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(5000, metric_.get(i));
            }
            if ((bitField0_ & 0x00000004) == 0x00000004) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(5001, body_);
            }
            size += extensionsSerializedSize();
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;

        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }

        public static org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }

        public static org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }

        public static org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        @Override
        public Builder toBuilder() {
            return newBuilder(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        /**
         * Protobuf type {@code kuradatatypes.KuraPayload}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.ExtendableBuilder<org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload, Builder> implements
                // @@protoc_insertion_point(builder_implements:kuradatatypes.KuraPayload)
                org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayloadOrBuilder {

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.INTERNAL_STATIC_KURADATATYPES_KURAPAYLOAD_DESCRIPTOR;
            }

            @Override
            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.internal_static_kuradatatypes_KuraPayload_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.class,
                                org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.Builder.class);
            }

            // Construct using org.eclipse.kapua.service.device.call.message.tmp.kura.KuraPayloadProto.KuraPayload.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                    getPositionFieldBuilder();
                    getMetricFieldBuilder();
                }
            }

            private static Builder create() {
                return new Builder();
            }

            @Override
            public Builder clear() {
                super.clear();
                timestamp_ = 0L;
                bitField0_ = bitField0_ & ~0x00000001;
                if (positionBuilder_ == null) {
                    position_ = org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition.getDefaultInstance();
                } else {
                    positionBuilder_.clear();
                }
                bitField0_ = bitField0_ & ~0x00000002;
                if (metricBuilder_ == null) {
                    metric_ = java.util.Collections.emptyList();
                    bitField0_ = bitField0_ & ~0x00000004;
                } else {
                    metricBuilder_.clear();
                }
                body_ = com.google.protobuf.ByteString.EMPTY;
                bitField0_ = bitField0_ & ~0x00000008;
                return this;
            }

            @Override
            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            @Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.INTERNAL_STATIC_KURADATATYPES_KURAPAYLOAD_DESCRIPTOR;
            }

            @Override
            public org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload getDefaultInstanceForType() {
                return org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.getDefaultInstance();
            }

            @Override
            public org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload build() {
                org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @Override
            public org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload buildPartial() {
                org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload result = new org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload(
                        this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x00000001) == 0x00000001) {
                    to_bitField0_ |= 0x00000001;
                }
                result.timestamp_ = timestamp_;
                if ((from_bitField0_ & 0x00000002) == 0x00000002) {
                    to_bitField0_ |= 0x00000002;
                }
                if (positionBuilder_ == null) {
                    result.position_ = position_;
                } else {
                    result.position_ = positionBuilder_.build();
                }
                if (metricBuilder_ == null) {
                    if ((bitField0_ & 0x00000004) == 0x00000004) {
                        metric_ = java.util.Collections.unmodifiableList(metric_);
                        bitField0_ = bitField0_ & ~0x00000004;
                    }
                    result.metric_ = metric_;
                } else {
                    result.metric_ = metricBuilder_.build();
                }
                if ((from_bitField0_ & 0x00000008) == 0x00000008) {
                    to_bitField0_ |= 0x00000004;
                }
                result.body_ = body_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            @Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload) {
                    return mergeFrom((org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload other) {
                if (other == org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.getDefaultInstance()) {
                    return this;
                }
                if (other.hasTimestamp()) {
                    setTimestamp(other.getTimestamp());
                }
                if (other.hasPosition()) {
                    mergePosition(other.getPosition());
                }
                if (metricBuilder_ == null) {
                    if (!other.metric_.isEmpty()) {
                        if (metric_.isEmpty()) {
                            metric_ = other.metric_;
                            bitField0_ = bitField0_ & ~0x00000004;
                        } else {
                            ensureMetricIsMutable();
                            metric_.addAll(other.metric_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.metric_.isEmpty()) {
                        if (metricBuilder_.isEmpty()) {
                            metricBuilder_.dispose();
                            metricBuilder_ = null;
                            metric_ = other.metric_;
                            bitField0_ = bitField0_ & ~0x00000004;
                            metricBuilder_ = com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ? getMetricFieldBuilder() : null;
                        } else {
                            metricBuilder_.addAllMessages(other.metric_);
                        }
                    }
                }
                if (other.hasBody()) {
                    setBody(other.getBody());
                }
                mergeExtensionFields(other);
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            @Override
            public final boolean isInitialized() {
                if (hasPosition()) {
                    if (!getPosition().isInitialized()) {

                        return false;
                    }
                }
                for (int i = 0; i < getMetricCount(); i++) {
                    if (!getMetric(i).isInitialized()) {

                        return false;
                    }
                }
                if (!extensionsAreInitialized()) {

                    return false;
                }
                return true;
            }

            @Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int bitField0_;

            private long timestamp_;

            /**
             * <code>optional int64 timestamp = 1;</code>
             */
            @Override
            public boolean hasTimestamp() {
                return (bitField0_ & 0x00000001) == 0x00000001;
            }

            /**
             * <code>optional int64 timestamp = 1;</code>
             */
            @Override
            public long getTimestamp() {
                return timestamp_;
            }

            /**
             * <code>optional int64 timestamp = 1;</code>
             */
            public Builder setTimestamp(long value) {
                bitField0_ |= 0x00000001;
                timestamp_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional int64 timestamp = 1;</code>
             */
            public Builder clearTimestamp() {
                bitField0_ = bitField0_ & ~0x00000001;
                timestamp_ = 0L;
                onChanged();
                return this;
            }

            private org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition position_ = org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition
                    .getDefaultInstance();
            private com.google.protobuf.SingleFieldBuilder<org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition, org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition.Builder, org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPositionOrBuilder> positionBuilder_;

            /**
             * <code>optional .kuradatatypes.KuraPayload.KuraPosition position = 2;</code>
             */
            @Override
            public boolean hasPosition() {
                return (bitField0_ & 0x00000002) == 0x00000002;
            }

            /**
             * <code>optional .kuradatatypes.KuraPayload.KuraPosition position = 2;</code>
             */
            @Override
            public org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition getPosition() {
                if (positionBuilder_ == null) {
                    return position_;
                } else {
                    return positionBuilder_.getMessage();
                }
            }

            /**
             * <code>optional .kuradatatypes.KuraPayload.KuraPosition position = 2;</code>
             */
            public Builder setPosition(org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition value) {
                if (positionBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    position_ = value;
                    onChanged();
                } else {
                    positionBuilder_.setMessage(value);
                }
                bitField0_ |= 0x00000002;
                return this;
            }

            /**
             * <code>optional .kuradatatypes.KuraPayload.KuraPosition position = 2;</code>
             */
            public Builder setPosition(
                    org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition.Builder builderForValue) {
                if (positionBuilder_ == null) {
                    position_ = builderForValue.build();
                    onChanged();
                } else {
                    positionBuilder_.setMessage(builderForValue.build());
                }
                bitField0_ |= 0x00000002;
                return this;
            }

            /**
             * <code>optional .kuradatatypes.KuraPayload.KuraPosition position = 2;</code>
             */
            public Builder mergePosition(org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition value) {
                if (positionBuilder_ == null) {
                    if ((bitField0_ & 0x00000002) == 0x00000002 &&
                            position_ != org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition.getDefaultInstance()) {
                        position_ = org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition.newBuilder(position_).mergeFrom(value).buildPartial();
                    } else {
                        position_ = value;
                    }
                    onChanged();
                } else {
                    positionBuilder_.mergeFrom(value);
                }
                bitField0_ |= 0x00000002;
                return this;
            }

            /**
             * <code>optional .kuradatatypes.KuraPayload.KuraPosition position = 2;</code>
             */
            public Builder clearPosition() {
                if (positionBuilder_ == null) {
                    position_ = org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition.getDefaultInstance();
                    onChanged();
                } else {
                    positionBuilder_.clear();
                }
                bitField0_ = bitField0_ & ~0x00000002;
                return this;
            }

            /**
             * <code>optional .kuradatatypes.KuraPayload.KuraPosition position = 2;</code>
             */
            public org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition.Builder getPositionBuilder() {
                bitField0_ |= 0x00000002;
                onChanged();
                return getPositionFieldBuilder().getBuilder();
            }

            /**
             * <code>optional .kuradatatypes.KuraPayload.KuraPosition position = 2;</code>
             */
            @Override
            public org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPositionOrBuilder getPositionOrBuilder() {
                if (positionBuilder_ != null) {
                    return positionBuilder_.getMessageOrBuilder();
                } else {
                    return position_;
                }
            }

            /**
             * <code>optional .kuradatatypes.KuraPayload.KuraPosition position = 2;</code>
             */
            private com.google.protobuf.SingleFieldBuilder<org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition, org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPosition.Builder, org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraPositionOrBuilder> getPositionFieldBuilder() {
                if (positionBuilder_ == null) {
                    positionBuilder_ = new com.google.protobuf.SingleFieldBuilder<>(
                            getPosition(),
                            getParentForChildren(),
                            isClean());
                    position_ = null;
                }
                return positionBuilder_;
            }

            private java.util.List<org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric> metric_ = java.util.Collections.emptyList();

            private void ensureMetricIsMutable() {
                if (!((bitField0_ & 0x00000004) == 0x00000004)) {
                    metric_ = new java.util.ArrayList<>(metric_);
                    bitField0_ |= 0x00000004;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilder<org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric, org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric.Builder, org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetricOrBuilder> metricBuilder_;

            /**
             * <code>repeated .kuradatatypes.KuraPayload.KuraMetric metric = 5000;</code>
             *
             * <pre>
             * can be zero, so optional
             * </pre>
             */
            @Override
            public java.util.List<org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric> getMetricList() {
                if (metricBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(metric_);
                } else {
                    return metricBuilder_.getMessageList();
                }
            }

            /**
             * <code>repeated .kuradatatypes.KuraPayload.KuraMetric metric = 5000;</code>
             *
             * <pre>
             * can be zero, so optional
             * </pre>
             */
            @Override
            public int getMetricCount() {
                if (metricBuilder_ == null) {
                    return metric_.size();
                } else {
                    return metricBuilder_.getCount();
                }
            }

            /**
             * <code>repeated .kuradatatypes.KuraPayload.KuraMetric metric = 5000;</code>
             *
             * <pre>
             * can be zero, so optional
             * </pre>
             */
            @Override
            public org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric getMetric(int index) {
                if (metricBuilder_ == null) {
                    return metric_.get(index);
                } else {
                    return metricBuilder_.getMessage(index);
                }
            }

            /**
             * <code>repeated .kuradatatypes.KuraPayload.KuraMetric metric = 5000;</code>
             *
             * <pre>
             * can be zero, so optional
             * </pre>
             */
            public Builder setMetric(
                    int index, org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric value) {
                if (metricBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureMetricIsMutable();
                    metric_.set(index, value);
                    onChanged();
                } else {
                    metricBuilder_.setMessage(index, value);
                }
                return this;
            }

            /**
             * <code>repeated .kuradatatypes.KuraPayload.KuraMetric metric = 5000;</code>
             *
             * <pre>
             * can be zero, so optional
             * </pre>
             */
            public Builder setMetric(
                    int index, org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric.Builder builderForValue) {
                if (metricBuilder_ == null) {
                    ensureMetricIsMutable();
                    metric_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    metricBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .kuradatatypes.KuraPayload.KuraMetric metric = 5000;</code>
             *
             * <pre>
             * can be zero, so optional
             * </pre>
             */
            public Builder addMetric(org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric value) {
                if (metricBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureMetricIsMutable();
                    metric_.add(value);
                    onChanged();
                } else {
                    metricBuilder_.addMessage(value);
                }
                return this;
            }

            /**
             * <code>repeated .kuradatatypes.KuraPayload.KuraMetric metric = 5000;</code>
             *
             * <pre>
             * can be zero, so optional
             * </pre>
             */
            public Builder addMetric(
                    int index, org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric value) {
                if (metricBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureMetricIsMutable();
                    metric_.add(index, value);
                    onChanged();
                } else {
                    metricBuilder_.addMessage(index, value);
                }
                return this;
            }

            /**
             * <code>repeated .kuradatatypes.KuraPayload.KuraMetric metric = 5000;</code>
             *
             * <pre>
             * can be zero, so optional
             * </pre>
             */
            public Builder addMetric(
                    org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric.Builder builderForValue) {
                if (metricBuilder_ == null) {
                    ensureMetricIsMutable();
                    metric_.add(builderForValue.build());
                    onChanged();
                } else {
                    metricBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .kuradatatypes.KuraPayload.KuraMetric metric = 5000;</code>
             *
             * <pre>
             * can be zero, so optional
             * </pre>
             */
            public Builder addMetric(
                    int index, org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric.Builder builderForValue) {
                if (metricBuilder_ == null) {
                    ensureMetricIsMutable();
                    metric_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    metricBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .kuradatatypes.KuraPayload.KuraMetric metric = 5000;</code>
             *
             * <pre>
             * can be zero, so optional
             * </pre>
             */
            public Builder addAllMetric(
                    java.lang.Iterable<? extends org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric> values) {
                if (metricBuilder_ == null) {
                    ensureMetricIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(
                            values, metric_);
                    onChanged();
                } else {
                    metricBuilder_.addAllMessages(values);
                }
                return this;
            }

            /**
             * <code>repeated .kuradatatypes.KuraPayload.KuraMetric metric = 5000;</code>
             *
             * <pre>
             * can be zero, so optional
             * </pre>
             */
            public Builder clearMetric() {
                if (metricBuilder_ == null) {
                    metric_ = java.util.Collections.emptyList();
                    bitField0_ = bitField0_ & ~0x00000004;
                    onChanged();
                } else {
                    metricBuilder_.clear();
                }
                return this;
            }

            /**
             * <code>repeated .kuradatatypes.KuraPayload.KuraMetric metric = 5000;</code>
             *
             * <pre>
             * can be zero, so optional
             * </pre>
             */
            public Builder removeMetric(int index) {
                if (metricBuilder_ == null) {
                    ensureMetricIsMutable();
                    metric_.remove(index);
                    onChanged();
                } else {
                    metricBuilder_.remove(index);
                }
                return this;
            }

            /**
             * <code>repeated .kuradatatypes.KuraPayload.KuraMetric metric = 5000;</code>
             *
             * <pre>
             * can be zero, so optional
             * </pre>
             */
            public org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric.Builder getMetricBuilder(
                    int index) {
                return getMetricFieldBuilder().getBuilder(index);
            }

            /**
             * <code>repeated .kuradatatypes.KuraPayload.KuraMetric metric = 5000;</code>
             *
             * <pre>
             * can be zero, so optional
             * </pre>
             */
            @Override
            public org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetricOrBuilder getMetricOrBuilder(
                    int index) {
                if (metricBuilder_ == null) {
                    return metric_.get(index);
                } else {
                    return metricBuilder_.getMessageOrBuilder(index);
                }
            }

            /**
             * <code>repeated .kuradatatypes.KuraPayload.KuraMetric metric = 5000;</code>
             *
             * <pre>
             * can be zero, so optional
             * </pre>
             */
            @Override
            public java.util.List<? extends org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetricOrBuilder> getMetricOrBuilderList() {
                if (metricBuilder_ != null) {
                    return metricBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(metric_);
                }
            }

            /**
             * <code>repeated .kuradatatypes.KuraPayload.KuraMetric metric = 5000;</code>
             *
             * <pre>
             * can be zero, so optional
             * </pre>
             */
            public org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric.Builder addMetricBuilder() {
                return getMetricFieldBuilder().addBuilder(
                        org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric.getDefaultInstance());
            }

            /**
             * <code>repeated .kuradatatypes.KuraPayload.KuraMetric metric = 5000;</code>
             *
             * <pre>
             * can be zero, so optional
             * </pre>
             */
            public org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric.Builder addMetricBuilder(
                    int index) {
                return getMetricFieldBuilder().addBuilder(
                        index, org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric.getDefaultInstance());
            }

            /**
             * <code>repeated .kuradatatypes.KuraPayload.KuraMetric metric = 5000;</code>
             *
             * <pre>
             * can be zero, so optional
             * </pre>
             */
            public java.util.List<org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric.Builder> getMetricBuilderList() {
                return getMetricFieldBuilder().getBuilderList();
            }

            private com.google.protobuf.RepeatedFieldBuilder<org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric, org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetric.Builder, org.eclipse.kapua.service.device.call.message.kura.proto.KuraPayloadProto.KuraPayload.KuraMetricOrBuilder> getMetricFieldBuilder() {
                if (metricBuilder_ == null) {
                    metricBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<>(
                            metric_,
                            (bitField0_
                                    & 0x00000004) == 0x00000004,
                            getParentForChildren(),
                            isClean());
                    metric_ = null;
                }
                return metricBuilder_;
            }

            private com.google.protobuf.ByteString body_ = com.google.protobuf.ByteString.EMPTY;

            /**
             * <code>optional bytes body = 5001;</code>
             */
            @Override
            public boolean hasBody() {
                return (bitField0_ & 0x00000008) == 0x00000008;
            }

            /**
             * <code>optional bytes body = 5001;</code>
             */
            @Override
            public com.google.protobuf.ByteString getBody() {
                return body_;
            }

            /**
             * <code>optional bytes body = 5001;</code>
             */
            public Builder setBody(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000008;
                body_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional bytes body = 5001;</code>
             */
            public Builder clearBody() {
                bitField0_ = bitField0_ & ~0x00000008;
                body_ = getDefaultInstance().getBody();
                onChanged();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:kuradatatypes.KuraPayload)
        }

        static {
            DEFAULT_INSTANCE = new KuraPayload(true);
            DEFAULT_INSTANCE.initFields();
        }

        // @@protoc_insertion_point(class_scope:kuradatatypes.KuraPayload)
    }

    private static final com.google.protobuf.Descriptors.Descriptor INTERNAL_STATIC_KURADATATYPES_KURAPAYLOAD_DESCRIPTOR;
    private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_kuradatatypes_KuraPayload_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor INTERNAL_STATIC_KURADATATYPES_KURAPAYLOAD_KURAMETRIC_DESCRIPTOR;
    private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_kuradatatypes_KuraPayload_KuraMetric_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor INTERNAL_STATIC_KURADATATYPES_KURAPAYLOAD_KURAPOSITION_DESCRIPTOR;
    private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_kuradatatypes_KuraPayload_KuraPosition_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;
    static {
        java.lang.String[] descriptorData = {
                "\n\021kurapayload.proto\022\rkuradatatypes\"\243\005\n\013K" +
                        "uraPayload\022\021\n\ttimestamp\030\001 \001(\003\0229\n\010positio" +
                        "n\030\002 \001(\0132\'.kuradatatypes.KuraPayload.Kura" +
                        "Position\0226\n\006metric\030\210\' \003(\0132%.kuradatatype" +
                        "s.KuraPayload.KuraMetric\022\r\n\004body\030\211\' \001(\014\032" +
                        "\305\002\n\nKuraMetric\022\014\n\004name\030\001 \002(\t\022=\n\004type\030\002 \002" +
                        "(\0162/.kuradatatypes.KuraPayload.KuraMetri" +
                        "c.ValueType\022\024\n\014double_value\030\003 \001(\001\022\023\n\013flo" +
                        "at_value\030\004 \001(\002\022\022\n\nlong_value\030\005 \001(\003\022\021\n\tin" +
                        "t_value\030\006 \001(\005\022\022\n\nbool_value\030\007 \001(\010\022\024\n\014str",
                "ing_value\030\010 \001(\t\022\023\n\013bytes_value\030\t \001(\014\"Y\n\t" +
                        "ValueType\022\n\n\006DOUBLE\020\000\022\t\n\005FLOAT\020\001\022\t\n\005INT6"
                        +
                        "4\020\002\022\t\n\005INT32\020\003\022\010\n\004BOOL\020\004\022\n\n\006STRING\020\005\022\t\n\005"
                        +
                        "BYTES\020\006\032\257\001\n\014KuraPosition\022\020\n\010latitude\030\001 \002"
                        +
                        "(\001\022\021\n\tlongitude\030\002 \002(\001\022\020\n\010altitude\030\003 \001(\001\022"
                        +
                        "\021\n\tprecision\030\004 \001(\001\022\017\n\007heading\030\005 \001(\001\022\r\n\005s"
                        +
                        "peed\030\006 \001(\001\022\021\n\ttimestamp\030\007 \001(\003\022\022\n\nsatelli"
                        +
                        "tes\030\010 \001(\005\022\016\n\006status\030\t \001(\005*\005\010\003\020\210\'B:\n&org."
                        +
                        "eclipse.kapua.service.device.call.message.tmp.kuraB\020Kura" +
                        "PayloadProto"
        };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner = new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {

            @Override
            public com.google.protobuf.ExtensionRegistry assignDescriptors(
                    com.google.protobuf.Descriptors.FileDescriptor root) {
                descriptor = root;
                return null;
            }
        };
        com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                        }, assigner);
        INTERNAL_STATIC_KURADATATYPES_KURAPAYLOAD_DESCRIPTOR = getDescriptor().getMessageTypes().get(0);
        internal_static_kuradatatypes_KuraPayload_fieldAccessorTable = new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                INTERNAL_STATIC_KURADATATYPES_KURAPAYLOAD_DESCRIPTOR,
                new java.lang.String[] { "Timestamp", "Position", "Metric",
                        "Body", });
        INTERNAL_STATIC_KURADATATYPES_KURAPAYLOAD_KURAMETRIC_DESCRIPTOR = INTERNAL_STATIC_KURADATATYPES_KURAPAYLOAD_DESCRIPTOR.getNestedTypes().get(0);
        internal_static_kuradatatypes_KuraPayload_KuraMetric_fieldAccessorTable = new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                INTERNAL_STATIC_KURADATATYPES_KURAPAYLOAD_KURAMETRIC_DESCRIPTOR,
                new java.lang.String[] { "Name", "Type", "DoubleValue",
                        "FloatValue", "LongValue",
                        "IntValue", "BoolValue",
                        "StringValue", "BytesValue", });
        INTERNAL_STATIC_KURADATATYPES_KURAPAYLOAD_KURAPOSITION_DESCRIPTOR = INTERNAL_STATIC_KURADATATYPES_KURAPAYLOAD_DESCRIPTOR.getNestedTypes().get(1);
        internal_static_kuradatatypes_KuraPayload_KuraPosition_fieldAccessorTable = new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                INTERNAL_STATIC_KURADATATYPES_KURAPAYLOAD_KURAPOSITION_DESCRIPTOR,
                new java.lang.String[] { "Latitude", "Longitude",
                        "Altitude", "Precision",
                        "Heading", "Speed",
                        "Timestamp", "Satellites",
                        "Status", });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
