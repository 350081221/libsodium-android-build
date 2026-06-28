package f2;

import android.annotation.SuppressLint;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16068a = "BaseKeyUtil";

    /* renamed from: b, reason: collision with root package name */
    private static final int f16069b = 16;

    /* renamed from: c, reason: collision with root package name */
    private static final int f16070c = 16;

    /* renamed from: d, reason: collision with root package name */
    private static final int f16071d = 10000;

    /* renamed from: e, reason: collision with root package name */
    private static final int f16072e = 32;

    /* renamed from: f, reason: collision with root package name */
    private static final int f16073f = 1;

    private static int a(int i5, int i6, int i7) {
        if (i6 < i5) {
            i5 = i6;
        }
        return i7 < i5 ? i7 : i5;
    }

    private static boolean b(int i5) {
        return i5 >= 16;
    }

    private static boolean c(int i5, byte[] bArr) {
        return b(i5) & d(bArr);
    }

    private static boolean d(byte[] bArr) {
        return bArr.length >= 16;
    }

    public static String e(String str, String str2, String str3, byte[] bArr, int i5, boolean z4) {
        return c.b(h(str, str2, str3, bArr, i5, z4));
    }

    public static byte[] f(String str, String str2, String str3, String str4, int i5, boolean z4) {
        return h(str, str2, str3, c.c(str4), i5, z4);
    }

    public static byte[] g(String str, String str2, String str3, byte[] bArr, int i5, int i6, boolean z4) {
        byte[] c5 = c.c(str);
        byte[] c6 = c.c(str2);
        byte[] c7 = c.c(str3);
        int a5 = a(c5.length, c6.length, c7.length);
        if (c(a5, bArr)) {
            char[] cArr = new char[a5];
            for (int i7 = 0; i7 < a5; i7++) {
                cArr[i7] = (char) ((c5[i7] ^ c6[i7]) ^ c7[i7]);
            }
            if (!z4) {
                g.e(f16068a, "exportRootKey: sha1");
                return b2.c.c(cArr, bArr, i5, i6 * 8);
            }
            g.e(f16068a, "exportRootKey: sha256");
            return b2.c.j(cArr, bArr, i5, i6 * 8);
        }
        throw new IllegalArgumentException("key length must be more than 128bit.");
    }

    @SuppressLint({"NewApi"})
    public static byte[] h(String str, String str2, String str3, byte[] bArr, int i5, boolean z4) {
        return g(str, str2, str3, bArr, 10000, i5, z4);
    }

    @SuppressLint({"NewApi"})
    public static byte[] i(String str, String str2, String str3, byte[] bArr, boolean z4) {
        return h(str, str2, str3, bArr, 16, z4);
    }

    public static byte[] j(String str, String str2, String str3, byte[] bArr, boolean z4) {
        return h(str, str2, str3, bArr, 32, z4);
    }

    public static byte[] k(String str, String str2, String str3, byte[] bArr, boolean z4) {
        return g(str, str2, str3, bArr, 1, 32, z4);
    }

    @SuppressLint({"NewApi"})
    public static byte[] l(String str, String str2, String str3, byte[] bArr, boolean z4) {
        return g(str, str2, str3, bArr, 1, 16, z4);
    }
}
