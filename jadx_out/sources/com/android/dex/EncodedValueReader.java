package com.android.dex;

import com.android.dex.util.ByteInput;
import com.android.dx.io.Opcodes;
import kotlin.y1;

/* loaded from: classes2.dex */
public final class EncodedValueReader {
    public static final int ENCODED_ANNOTATION = 29;
    public static final int ENCODED_ARRAY = 28;
    public static final int ENCODED_BOOLEAN = 31;
    public static final int ENCODED_BYTE = 0;
    public static final int ENCODED_CHAR = 3;
    public static final int ENCODED_DOUBLE = 17;
    public static final int ENCODED_ENUM = 27;
    public static final int ENCODED_FIELD = 25;
    public static final int ENCODED_FLOAT = 16;
    public static final int ENCODED_INT = 4;
    public static final int ENCODED_LONG = 6;
    public static final int ENCODED_METHOD = 26;
    public static final int ENCODED_METHOD_HANDLE = 22;
    public static final int ENCODED_METHOD_TYPE = 21;
    public static final int ENCODED_NULL = 30;
    public static final int ENCODED_SHORT = 2;
    public static final int ENCODED_STRING = 23;
    public static final int ENCODED_TYPE = 24;
    private static final int MUST_READ = -1;
    private int annotationType;
    private int arg;
    protected final ByteInput in;
    private int type;

    public EncodedValueReader(ByteInput byteInput) {
        this.type = -1;
        this.in = byteInput;
    }

    private void checkType(int i5) {
        if (peek() == i5) {
        } else {
            throw new IllegalStateException(String.format("Expected %x but was %x", Integer.valueOf(i5), Integer.valueOf(peek())));
        }
    }

    public int getAnnotationType() {
        return this.annotationType;
    }

    public int peek() {
        if (this.type == -1) {
            int readByte = this.in.readByte() & y1.f19838d;
            this.type = readByte & 31;
            this.arg = (readByte & Opcodes.SHL_INT_LIT8) >> 5;
        }
        return this.type;
    }

    public int readAnnotation() {
        checkType(29);
        this.type = -1;
        this.annotationType = Leb128.readUnsignedLeb128(this.in);
        return Leb128.readUnsignedLeb128(this.in);
    }

    public int readAnnotationName() {
        return Leb128.readUnsignedLeb128(this.in);
    }

    public int readArray() {
        checkType(28);
        this.type = -1;
        return Leb128.readUnsignedLeb128(this.in);
    }

    public boolean readBoolean() {
        checkType(31);
        this.type = -1;
        if (this.arg != 0) {
            return true;
        }
        return false;
    }

    public byte readByte() {
        checkType(0);
        this.type = -1;
        return (byte) EncodedValueCodec.readSignedInt(this.in, this.arg);
    }

    public char readChar() {
        checkType(3);
        this.type = -1;
        return (char) EncodedValueCodec.readUnsignedInt(this.in, this.arg, false);
    }

    public double readDouble() {
        checkType(17);
        this.type = -1;
        return Double.longBitsToDouble(EncodedValueCodec.readUnsignedLong(this.in, this.arg, true));
    }

    public int readEnum() {
        checkType(27);
        this.type = -1;
        return EncodedValueCodec.readUnsignedInt(this.in, this.arg, false);
    }

    public int readField() {
        checkType(25);
        this.type = -1;
        return EncodedValueCodec.readUnsignedInt(this.in, this.arg, false);
    }

    public float readFloat() {
        checkType(16);
        this.type = -1;
        return Float.intBitsToFloat(EncodedValueCodec.readUnsignedInt(this.in, this.arg, true));
    }

    public int readInt() {
        checkType(4);
        this.type = -1;
        return EncodedValueCodec.readSignedInt(this.in, this.arg);
    }

    public long readLong() {
        checkType(6);
        this.type = -1;
        return EncodedValueCodec.readSignedLong(this.in, this.arg);
    }

    public int readMethod() {
        checkType(26);
        this.type = -1;
        return EncodedValueCodec.readUnsignedInt(this.in, this.arg, false);
    }

    public int readMethodHandle() {
        checkType(22);
        this.type = -1;
        return EncodedValueCodec.readUnsignedInt(this.in, this.arg, false);
    }

    public int readMethodType() {
        checkType(21);
        this.type = -1;
        return EncodedValueCodec.readUnsignedInt(this.in, this.arg, false);
    }

    public void readNull() {
        checkType(30);
        this.type = -1;
    }

    public short readShort() {
        checkType(2);
        this.type = -1;
        return (short) EncodedValueCodec.readSignedInt(this.in, this.arg);
    }

    public int readString() {
        checkType(23);
        this.type = -1;
        return EncodedValueCodec.readUnsignedInt(this.in, this.arg, false);
    }

    public int readType() {
        checkType(24);
        this.type = -1;
        return EncodedValueCodec.readUnsignedInt(this.in, this.arg, false);
    }

    public void skipValue() {
        int peek = peek();
        if (peek != 0) {
            if (peek != 6) {
                if (peek != 2) {
                    if (peek != 3) {
                        if (peek != 4) {
                            if (peek != 16) {
                                if (peek != 17) {
                                    int i5 = 0;
                                    switch (peek) {
                                        case 21:
                                            readMethodType();
                                            return;
                                        case 22:
                                            readMethodHandle();
                                            return;
                                        case 23:
                                            readString();
                                            return;
                                        case 24:
                                            readType();
                                            return;
                                        case 25:
                                            readField();
                                            return;
                                        case 26:
                                            readMethod();
                                            return;
                                        case 27:
                                            readEnum();
                                            return;
                                        case 28:
                                            int readArray = readArray();
                                            while (i5 < readArray) {
                                                skipValue();
                                                i5++;
                                            }
                                            return;
                                        case 29:
                                            int readAnnotation = readAnnotation();
                                            while (i5 < readAnnotation) {
                                                readAnnotationName();
                                                skipValue();
                                                i5++;
                                            }
                                            return;
                                        case 30:
                                            readNull();
                                            return;
                                        case 31:
                                            readBoolean();
                                            return;
                                        default:
                                            throw new DexException("Unexpected type: " + Integer.toHexString(this.type));
                                    }
                                }
                                readDouble();
                                return;
                            }
                            readFloat();
                            return;
                        }
                        readInt();
                        return;
                    }
                    readChar();
                    return;
                }
                readShort();
                return;
            }
            readLong();
            return;
        }
        readByte();
    }

    public EncodedValueReader(EncodedValue encodedValue) {
        this(encodedValue.asByteInput());
    }

    public EncodedValueReader(ByteInput byteInput, int i5) {
        this.in = byteInput;
        this.type = i5;
    }

    public EncodedValueReader(EncodedValue encodedValue, int i5) {
        this(encodedValue.asByteInput(), i5);
    }
}
