package com.android.dex;

import com.android.dex.util.ByteInput;
import com.android.dex.util.ByteOutput;
import kotlin.y1;

/* loaded from: classes2.dex */
public final class Leb128 {
    private Leb128() {
    }

    public static int readSignedLeb128(ByteInput byteInput) {
        int i5;
        int i6 = 0;
        int i7 = -1;
        int i8 = 0;
        do {
            int readByte = byteInput.readByte() & y1.f19838d;
            i6 |= (readByte & 127) << (i8 * 7);
            i7 <<= 7;
            i8++;
            i5 = readByte & 128;
            if (i5 != 128) {
                break;
            }
        } while (i8 < 5);
        if (i5 != 128) {
            if (((i7 >> 1) & i6) != 0) {
                return i6 | i7;
            }
            return i6;
        }
        throw new DexException("invalid LEB128 sequence");
    }

    public static int readUnsignedLeb128(ByteInput byteInput) {
        int i5;
        int i6 = 0;
        int i7 = 0;
        do {
            int readByte = byteInput.readByte() & y1.f19838d;
            i6 |= (readByte & 127) << (i7 * 7);
            i7++;
            i5 = readByte & 128;
            if (i5 != 128) {
                break;
            }
        } while (i7 < 5);
        if (i5 != 128) {
            return i6;
        }
        throw new DexException("invalid LEB128 sequence");
    }

    public static int unsignedLeb128Size(int i5) {
        int i6 = i5 >> 7;
        int i7 = 0;
        while (i6 != 0) {
            i6 >>= 7;
            i7++;
        }
        return i7 + 1;
    }

    public static void writeSignedLeb128(ByteOutput byteOutput, int i5) {
        int i6 = i5 >> 7;
        int i7 = (Integer.MIN_VALUE & i5) == 0 ? 0 : -1;
        boolean z4 = true;
        while (true) {
            int i8 = i6;
            int i9 = i5;
            i5 = i8;
            if (!z4) {
                return;
            }
            z4 = (i5 == i7 && (i5 & 1) == ((i9 >> 6) & 1)) ? false : true;
            byteOutput.writeByte((byte) ((i9 & 127) | (z4 ? 128 : 0)));
            i6 = i5 >> 7;
        }
    }

    public static void writeUnsignedLeb128(ByteOutput byteOutput, int i5) {
        while (true) {
            int i6 = i5;
            i5 >>>= 7;
            if (i5 != 0) {
                byteOutput.writeByte((byte) ((i6 & 127) | 128));
            } else {
                byteOutput.writeByte((byte) (i6 & 127));
                return;
            }
        }
    }
}
