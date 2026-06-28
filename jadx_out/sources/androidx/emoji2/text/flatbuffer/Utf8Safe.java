package androidx.emoji2.text.flatbuffer;

import androidx.emoji2.text.flatbuffer.Utf8;
import com.android.dx.io.Opcodes;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class Utf8Safe extends Utf8 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class UnpairedSurrogateException extends IllegalArgumentException {
        UnpairedSurrogateException(int i5, int i6) {
            super("Unpaired surrogate at index " + i5 + " of " + i6);
        }
    }

    private static int computeEncodedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int i5 = 0;
        while (i5 < length && charSequence.charAt(i5) < 128) {
            i5++;
        }
        int i6 = length;
        while (true) {
            if (i5 < length) {
                char charAt = charSequence.charAt(i5);
                if (charAt < 2048) {
                    i6 += (127 - charAt) >>> 31;
                    i5++;
                } else {
                    i6 += encodedLengthGeneral(charSequence, i5);
                    break;
                }
            } else {
                break;
            }
        }
        if (i6 >= length) {
            return i6;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i6 + 4294967296L));
    }

    public static String decodeUtf8Array(byte[] bArr, int i5, int i6) {
        if ((i5 | i6 | ((bArr.length - i5) - i6)) >= 0) {
            int i7 = i5 + i6;
            char[] cArr = new char[i6];
            int i8 = 0;
            while (i5 < i7) {
                byte b5 = bArr[i5];
                if (!Utf8.DecodeUtil.isOneByte(b5)) {
                    break;
                }
                i5++;
                Utf8.DecodeUtil.handleOneByte(b5, cArr, i8);
                i8++;
            }
            int i9 = i8;
            while (i5 < i7) {
                int i10 = i5 + 1;
                byte b6 = bArr[i5];
                if (Utf8.DecodeUtil.isOneByte(b6)) {
                    int i11 = i9 + 1;
                    Utf8.DecodeUtil.handleOneByte(b6, cArr, i9);
                    while (i10 < i7) {
                        byte b7 = bArr[i10];
                        if (!Utf8.DecodeUtil.isOneByte(b7)) {
                            break;
                        }
                        i10++;
                        Utf8.DecodeUtil.handleOneByte(b7, cArr, i11);
                        i11++;
                    }
                    i5 = i10;
                    i9 = i11;
                } else if (Utf8.DecodeUtil.isTwoBytes(b6)) {
                    if (i10 < i7) {
                        Utf8.DecodeUtil.handleTwoBytes(b6, bArr[i10], cArr, i9);
                        i5 = i10 + 1;
                        i9++;
                    } else {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                } else if (Utf8.DecodeUtil.isThreeBytes(b6)) {
                    if (i10 < i7 - 1) {
                        int i12 = i10 + 1;
                        Utf8.DecodeUtil.handleThreeBytes(b6, bArr[i10], bArr[i12], cArr, i9);
                        i5 = i12 + 1;
                        i9++;
                    } else {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                } else if (i10 < i7 - 2) {
                    int i13 = i10 + 1;
                    byte b8 = bArr[i10];
                    int i14 = i13 + 1;
                    Utf8.DecodeUtil.handleFourBytes(b6, b8, bArr[i13], bArr[i14], cArr, i9);
                    i5 = i14 + 1;
                    i9 = i9 + 1 + 1;
                } else {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
            }
            return new String(cArr, 0, i9);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i5), Integer.valueOf(i6)));
    }

    public static String decodeUtf8Buffer(ByteBuffer byteBuffer, int i5, int i6) {
        if ((i5 | i6 | ((byteBuffer.limit() - i5) - i6)) >= 0) {
            int i7 = i5 + i6;
            char[] cArr = new char[i6];
            int i8 = 0;
            while (i5 < i7) {
                byte b5 = byteBuffer.get(i5);
                if (!Utf8.DecodeUtil.isOneByte(b5)) {
                    break;
                }
                i5++;
                Utf8.DecodeUtil.handleOneByte(b5, cArr, i8);
                i8++;
            }
            int i9 = i8;
            while (i5 < i7) {
                int i10 = i5 + 1;
                byte b6 = byteBuffer.get(i5);
                if (Utf8.DecodeUtil.isOneByte(b6)) {
                    int i11 = i9 + 1;
                    Utf8.DecodeUtil.handleOneByte(b6, cArr, i9);
                    while (i10 < i7) {
                        byte b7 = byteBuffer.get(i10);
                        if (!Utf8.DecodeUtil.isOneByte(b7)) {
                            break;
                        }
                        i10++;
                        Utf8.DecodeUtil.handleOneByte(b7, cArr, i11);
                        i11++;
                    }
                    i5 = i10;
                    i9 = i11;
                } else if (Utf8.DecodeUtil.isTwoBytes(b6)) {
                    if (i10 < i7) {
                        Utf8.DecodeUtil.handleTwoBytes(b6, byteBuffer.get(i10), cArr, i9);
                        i5 = i10 + 1;
                        i9++;
                    } else {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                } else if (Utf8.DecodeUtil.isThreeBytes(b6)) {
                    if (i10 < i7 - 1) {
                        int i12 = i10 + 1;
                        Utf8.DecodeUtil.handleThreeBytes(b6, byteBuffer.get(i10), byteBuffer.get(i12), cArr, i9);
                        i5 = i12 + 1;
                        i9++;
                    } else {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                } else if (i10 < i7 - 2) {
                    int i13 = i10 + 1;
                    byte b8 = byteBuffer.get(i10);
                    int i14 = i13 + 1;
                    Utf8.DecodeUtil.handleFourBytes(b6, b8, byteBuffer.get(i13), byteBuffer.get(i14), cArr, i9);
                    i5 = i14 + 1;
                    i9 = i9 + 1 + 1;
                } else {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
            }
            return new String(cArr, 0, i9);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i5), Integer.valueOf(i6)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int encodeUtf8Array(java.lang.CharSequence r7, byte[] r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.flatbuffer.Utf8Safe.encodeUtf8Array(java.lang.CharSequence, byte[], int, int):int");
    }

    private static void encodeUtf8Buffer(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int position = byteBuffer.position();
        int i5 = 0;
        while (i5 < length) {
            try {
                char charAt = charSequence.charAt(i5);
                if (charAt >= 128) {
                    break;
                }
                byteBuffer.put(position + i5, (byte) charAt);
                i5++;
            } catch (IndexOutOfBoundsException unused) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i5) + " at index " + (byteBuffer.position() + Math.max(i5, (position - byteBuffer.position()) + 1)));
            }
        }
        if (i5 == length) {
            byteBuffer.position(position + i5);
            return;
        }
        position += i5;
        while (i5 < length) {
            char charAt2 = charSequence.charAt(i5);
            if (charAt2 < 128) {
                byteBuffer.put(position, (byte) charAt2);
            } else if (charAt2 < 2048) {
                int i6 = position + 1;
                try {
                    byteBuffer.put(position, (byte) ((charAt2 >>> 6) | 192));
                    byteBuffer.put(i6, (byte) ((charAt2 & '?') | 128));
                    position = i6;
                } catch (IndexOutOfBoundsException unused2) {
                    position = i6;
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i5) + " at index " + (byteBuffer.position() + Math.max(i5, (position - byteBuffer.position()) + 1)));
                }
            } else {
                if (charAt2 >= 55296 && 57343 >= charAt2) {
                    int i7 = i5 + 1;
                    if (i7 != length) {
                        try {
                            char charAt3 = charSequence.charAt(i7);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                int i8 = position + 1;
                                try {
                                    byteBuffer.put(position, (byte) ((codePoint >>> 18) | 240));
                                    int i9 = i8 + 1;
                                    byteBuffer.put(i8, (byte) (((codePoint >>> 12) & 63) | 128));
                                    int i10 = i9 + 1;
                                    byteBuffer.put(i9, (byte) (((codePoint >>> 6) & 63) | 128));
                                    byteBuffer.put(i10, (byte) ((codePoint & 63) | 128));
                                    position = i10;
                                    i5 = i7;
                                } catch (IndexOutOfBoundsException unused3) {
                                    position = i8;
                                    i5 = i7;
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i5) + " at index " + (byteBuffer.position() + Math.max(i5, (position - byteBuffer.position()) + 1)));
                                }
                            } else {
                                i5 = i7;
                            }
                        } catch (IndexOutOfBoundsException unused4) {
                        }
                    }
                    throw new UnpairedSurrogateException(i5, length);
                }
                int i11 = position + 1;
                byteBuffer.put(position, (byte) ((charAt2 >>> '\f') | Opcodes.SHL_INT_LIT8));
                position = i11 + 1;
                byteBuffer.put(i11, (byte) (((charAt2 >>> 6) & 63) | 128));
                byteBuffer.put(position, (byte) ((charAt2 & '?') | 128));
            }
            i5++;
            position++;
        }
        byteBuffer.position(position);
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i5) {
        int length = charSequence.length();
        int i6 = 0;
        while (i5 < length) {
            char charAt = charSequence.charAt(i5);
            if (charAt < 2048) {
                i6 += (127 - charAt) >>> 31;
            } else {
                i6 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i5) >= 65536) {
                        i5++;
                    } else {
                        throw new UnpairedSurrogateException(i5, length);
                    }
                }
            }
            i5++;
        }
        return i6;
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public String decodeUtf8(ByteBuffer byteBuffer, int i5, int i6) throws IllegalArgumentException {
        if (byteBuffer.hasArray()) {
            return decodeUtf8Array(byteBuffer.array(), byteBuffer.arrayOffset() + i5, i6);
        }
        return decodeUtf8Buffer(byteBuffer, i5, i6);
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(encodeUtf8Array(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
        } else {
            encodeUtf8Buffer(charSequence, byteBuffer);
        }
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public int encodedLength(CharSequence charSequence) {
        return computeEncodedLength(charSequence);
    }
}
