package com.android.dex;

import com.android.dex.util.ByteInput;
import com.android.dx.io.Opcodes;
import java.io.UTFDataFormatException;
import kotlin.y1;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes2.dex */
public final class Mutf8 {
    private Mutf8() {
    }

    private static long countBytes(String str, boolean z4) throws UTFDataFormatException {
        long j5;
        int length = str.length();
        long j6 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = str.charAt(i5);
            if (charAt != 0 && charAt <= 127) {
                j5 = 1;
            } else if (charAt <= 2047) {
                j5 = 2;
            } else {
                j5 = 3;
            }
            j6 += j5;
            if (z4 && j6 > WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                throw new UTFDataFormatException("String more than 65535 UTF bytes long");
            }
        }
        return j6;
    }

    public static String decode(ByteInput byteInput, char[] cArr) throws UTFDataFormatException {
        int i5;
        int i6 = 0;
        while (true) {
            char readByte = (char) (byteInput.readByte() & y1.f19838d);
            if (readByte == 0) {
                return new String(cArr, 0, i6);
            }
            cArr[i6] = readByte;
            if (readByte < 128) {
                i6++;
            } else {
                if ((readByte & 224) == 192) {
                    int readByte2 = byteInput.readByte() & y1.f19838d;
                    if ((readByte2 & 192) == 128) {
                        i5 = i6 + 1;
                        cArr[i6] = (char) (((readByte & 31) << 6) | (readByte2 & 63));
                    } else {
                        throw new UTFDataFormatException("bad second byte");
                    }
                } else if ((readByte & 240) == 224) {
                    int readByte3 = byteInput.readByte() & y1.f19838d;
                    int readByte4 = byteInput.readByte() & y1.f19838d;
                    if ((readByte3 & 192) != 128 || (readByte4 & 192) != 128) {
                        break;
                    }
                    i5 = i6 + 1;
                    cArr[i6] = (char) (((readByte & 15) << 12) | ((readByte3 & 63) << 6) | (readByte4 & 63));
                } else {
                    throw new UTFDataFormatException("bad byte");
                }
                i6 = i5;
            }
        }
        throw new UTFDataFormatException("bad second or third byte");
    }

    public static void encode(byte[] bArr, int i5, String str) {
        int i6;
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = str.charAt(i7);
            if (charAt != 0 && charAt <= 127) {
                i6 = i5 + 1;
                bArr[i5] = (byte) charAt;
            } else if (charAt <= 2047) {
                int i8 = i5 + 1;
                bArr[i5] = (byte) (((charAt >> 6) & 31) | 192);
                i5 = i8 + 1;
                bArr[i8] = (byte) ((charAt & '?') | 128);
            } else {
                int i9 = i5 + 1;
                bArr[i5] = (byte) (((charAt >> '\f') & 15) | Opcodes.SHL_INT_LIT8);
                int i10 = i9 + 1;
                bArr[i9] = (byte) (((charAt >> 6) & 63) | 128);
                i6 = i10 + 1;
                bArr[i10] = (byte) ((charAt & '?') | 128);
            }
            i5 = i6;
        }
    }

    public static byte[] encode(String str) throws UTFDataFormatException {
        byte[] bArr = new byte[(int) countBytes(str, true)];
        encode(bArr, 0, str);
        return bArr;
    }
}
