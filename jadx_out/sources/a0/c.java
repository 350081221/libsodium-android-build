package a0;

import android.util.Base64;
import java.security.SecureRandom;
import java.util.Arrays;
import kotlin.y1;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static volatile SecureRandom f85a;

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f86b = "0123456789ABCDEF".toCharArray();

    public static String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 3);
    }

    public static SecureRandom b() {
        if (f85a != null) {
            return f85a;
        }
        synchronized (c.class) {
            if (f85a == null) {
                f85a = new SecureRandom();
            }
        }
        return f85a;
    }

    public static byte[] c(byte b5) {
        return new byte[]{b5};
    }

    public static byte[] d(char c5) {
        return new byte[]{(byte) (c5 & 255)};
    }

    public static byte[] e(char c5, char c6) {
        return new byte[]{(byte) (c5 & 255), (byte) (c6 & 255)};
    }

    public static byte[] f(int i5) {
        return new byte[]{(byte) i5, (byte) (i5 >> 8), (byte) (i5 >> 16), (byte) (i5 >> 24)};
    }

    public static byte[] g(long j5) {
        return new byte[]{(byte) j5, (byte) (j5 >> 8), (byte) (j5 >> 16), (byte) (j5 >> 24), (byte) (j5 >> 32), (byte) (j5 >> 40), (byte) (j5 >> 48), (byte) (j5 >> 56)};
    }

    public static byte[] h(short s5) {
        return new byte[]{(byte) s5, (byte) (s5 >> 8)};
    }

    public static byte[] i(byte[]... bArr) {
        int i5 = 0;
        for (byte[] bArr2 : bArr) {
            i5 += bArr2.length;
        }
        byte[] bArr3 = null;
        int i6 = 0;
        for (byte[] bArr4 : bArr) {
            if (bArr3 == null) {
                bArr3 = Arrays.copyOf(bArr4, i5);
                i6 = bArr4.length;
            } else {
                System.arraycopy(bArr4, 0, bArr3, i6, bArr4.length);
                i6 += bArr4.length;
            }
        }
        return bArr3;
    }

    public static String j(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i5 = 0; i5 < bArr.length; i5++) {
            int i6 = bArr[i5] & y1.f19838d;
            int i7 = i5 * 2;
            char[] cArr2 = f86b;
            cArr[i7] = cArr2[i6 >>> 4];
            cArr[i7 + 1] = cArr2[i6 & 15];
        }
        return new String(cArr);
    }

    public static byte[] k() {
        byte[] bArr = new byte[2];
        b().nextBytes(bArr);
        return bArr;
    }

    public static byte[] l() {
        byte[] bArr = new byte[4];
        b().nextBytes(bArr);
        return bArr;
    }
}
