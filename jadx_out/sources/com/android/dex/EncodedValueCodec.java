package com.android.dex;

import com.android.dex.util.ByteInput;
import com.android.dex.util.ByteOutput;
import kotlin.y1;

/* loaded from: classes2.dex */
public final class EncodedValueCodec {
    private EncodedValueCodec() {
    }

    public static int readSignedInt(ByteInput byteInput, int i5) {
        int i6 = 0;
        for (int i7 = i5; i7 >= 0; i7--) {
            i6 = (i6 >>> 8) | ((byteInput.readByte() & y1.f19838d) << 24);
        }
        return i6 >> ((3 - i5) * 8);
    }

    public static long readSignedLong(ByteInput byteInput, int i5) {
        long j5 = 0;
        for (int i6 = i5; i6 >= 0; i6--) {
            j5 = (j5 >>> 8) | ((byteInput.readByte() & 255) << 56);
        }
        return j5 >> ((7 - i5) * 8);
    }

    public static int readUnsignedInt(ByteInput byteInput, int i5, boolean z4) {
        int i6 = 0;
        if (!z4) {
            for (int i7 = i5; i7 >= 0; i7--) {
                i6 = (i6 >>> 8) | ((byteInput.readByte() & y1.f19838d) << 24);
            }
            return i6 >>> ((3 - i5) * 8);
        }
        while (i5 >= 0) {
            i6 = ((byteInput.readByte() & y1.f19838d) << 24) | (i6 >>> 8);
            i5--;
        }
        return i6;
    }

    public static long readUnsignedLong(ByteInput byteInput, int i5, boolean z4) {
        long j5 = 0;
        if (!z4) {
            for (int i6 = i5; i6 >= 0; i6--) {
                j5 = (j5 >>> 8) | ((byteInput.readByte() & 255) << 56);
            }
            return j5 >>> ((7 - i5) * 8);
        }
        while (i5 >= 0) {
            j5 = (j5 >>> 8) | ((byteInput.readByte() & 255) << 56);
            i5--;
        }
        return j5;
    }

    public static void writeRightZeroExtendedValue(ByteOutput byteOutput, int i5, long j5) {
        int numberOfTrailingZeros = 64 - Long.numberOfTrailingZeros(j5);
        if (numberOfTrailingZeros == 0) {
            numberOfTrailingZeros = 1;
        }
        int i6 = (numberOfTrailingZeros + 7) >> 3;
        long j6 = j5 >> (64 - (i6 * 8));
        byteOutput.writeByte(i5 | ((i6 - 1) << 5));
        while (i6 > 0) {
            byteOutput.writeByte((byte) j6);
            j6 >>= 8;
            i6--;
        }
    }

    public static void writeSignedIntegralValue(ByteOutput byteOutput, int i5, long j5) {
        int numberOfLeadingZeros = ((65 - Long.numberOfLeadingZeros((j5 >> 63) ^ j5)) + 7) >> 3;
        byteOutput.writeByte(i5 | ((numberOfLeadingZeros - 1) << 5));
        while (numberOfLeadingZeros > 0) {
            byteOutput.writeByte((byte) j5);
            j5 >>= 8;
            numberOfLeadingZeros--;
        }
    }

    public static void writeUnsignedIntegralValue(ByteOutput byteOutput, int i5, long j5) {
        int numberOfLeadingZeros = 64 - Long.numberOfLeadingZeros(j5);
        if (numberOfLeadingZeros == 0) {
            numberOfLeadingZeros = 1;
        }
        int i6 = (numberOfLeadingZeros + 7) >> 3;
        byteOutput.writeByte(i5 | ((i6 - 1) << 5));
        while (i6 > 0) {
            byteOutput.writeByte((byte) j5);
            j5 >>= 8;
            i6--;
        }
    }
}
