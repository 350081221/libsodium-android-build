package androidx.emoji2.text.flatbuffer;

import com.umeng.analytics.pro.cx;
import java.nio.ByteBuffer;
import okio.q1;

/* loaded from: classes2.dex */
public abstract class Utf8 {
    private static Utf8 DEFAULT;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class DecodeUtil {
        DecodeUtil() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static void handleFourBytes(byte b5, byte b6, byte b7, byte b8, char[] cArr, int i5) throws IllegalArgumentException {
            if (!isNotTrailingByte(b6) && (((b5 << 28) + (b6 + 112)) >> 30) == 0 && !isNotTrailingByte(b7) && !isNotTrailingByte(b8)) {
                int trailingByteValue = ((b5 & 7) << 18) | (trailingByteValue(b6) << 12) | (trailingByteValue(b7) << 6) | trailingByteValue(b8);
                cArr[i5] = highSurrogate(trailingByteValue);
                cArr[i5 + 1] = lowSurrogate(trailingByteValue);
                return;
            }
            throw new IllegalArgumentException("Invalid UTF-8");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static void handleOneByte(byte b5, char[] cArr, int i5) {
            cArr[i5] = (char) b5;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static void handleThreeBytes(byte b5, byte b6, byte b7, char[] cArr, int i5) throws IllegalArgumentException {
            if (!isNotTrailingByte(b6) && ((b5 != -32 || b6 >= -96) && ((b5 != -19 || b6 < -96) && !isNotTrailingByte(b7)))) {
                cArr[i5] = (char) (((b5 & cx.f12477m) << 12) | (trailingByteValue(b6) << 6) | trailingByteValue(b7));
                return;
            }
            throw new IllegalArgumentException("Invalid UTF-8");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static void handleTwoBytes(byte b5, byte b6, char[] cArr, int i5) throws IllegalArgumentException {
            if (b5 >= -62) {
                if (!isNotTrailingByte(b6)) {
                    cArr[i5] = (char) (((b5 & 31) << 6) | trailingByteValue(b6));
                    return;
                }
                throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
            }
            throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
        }

        private static char highSurrogate(int i5) {
            return (char) ((i5 >>> 10) + q1.f21024d);
        }

        private static boolean isNotTrailingByte(byte b5) {
            return b5 > -65;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static boolean isOneByte(byte b5) {
            return b5 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static boolean isThreeBytes(byte b5) {
            return b5 < -16;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static boolean isTwoBytes(byte b5) {
            return b5 < -32;
        }

        private static char lowSurrogate(int i5) {
            return (char) ((i5 & 1023) + q1.f21025e);
        }

        private static int trailingByteValue(byte b5) {
            return b5 & q1.f21021a;
        }
    }

    /* loaded from: classes2.dex */
    static class UnpairedSurrogateException extends IllegalArgumentException {
        UnpairedSurrogateException(int i5, int i6) {
            super("Unpaired surrogate at index " + i5 + " of " + i6);
        }
    }

    public static Utf8 getDefault() {
        if (DEFAULT == null) {
            DEFAULT = new Utf8Safe();
        }
        return DEFAULT;
    }

    public static void setDefault(Utf8 utf8) {
        DEFAULT = utf8;
    }

    public abstract String decodeUtf8(ByteBuffer byteBuffer, int i5, int i6);

    public abstract void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer);

    public abstract int encodedLength(CharSequence charSequence);
}
