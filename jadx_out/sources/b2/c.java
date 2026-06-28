package b2;

import android.os.Build;
import android.text.TextUtils;
import f2.g;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f641a = "PBKDF2";

    /* renamed from: b, reason: collision with root package name */
    private static final String f642b = "PBKDF2WithHmacSHA1";

    /* renamed from: c, reason: collision with root package name */
    private static final String f643c = "PBKDF2WithHmacSHA256";

    /* renamed from: d, reason: collision with root package name */
    private static final String f644d = "";

    /* renamed from: e, reason: collision with root package name */
    private static final int f645e = 8;

    /* renamed from: f, reason: collision with root package name */
    private static final int f646f = 16;

    /* renamed from: g, reason: collision with root package name */
    private static final int f647g = 32;

    /* renamed from: h, reason: collision with root package name */
    private static final int f648h = 10000;

    /* renamed from: i, reason: collision with root package name */
    private static final int f649i = 1000;

    private static boolean a(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            return false;
        }
        int length = bArr.length ^ bArr2.length;
        for (int i5 = 0; i5 < bArr.length && i5 < bArr2.length; i5++) {
            length |= bArr[i5] ^ bArr2[i5];
        }
        if (length != 0) {
            return false;
        }
        return true;
    }

    private static byte[] b(char[] cArr, byte[] bArr, int i5, int i6, boolean z4) {
        SecretKeyFactory secretKeyFactory;
        try {
            PBEKeySpec pBEKeySpec = new PBEKeySpec(cArr, bArr, i5, i6);
            if (z4) {
                secretKeyFactory = SecretKeyFactory.getInstance(f643c);
            } else {
                secretKeyFactory = SecretKeyFactory.getInstance(f642b);
            }
            return secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e5) {
            g.d(f641a, "pbkdf exception : " + e5.getMessage());
            return new byte[0];
        }
    }

    public static byte[] c(char[] cArr, byte[] bArr, int i5, int i6) {
        return b(cArr, bArr, i5, i6, false);
    }

    @Deprecated
    public static String d(String str) {
        return e(str, 10000);
    }

    @Deprecated
    public static String e(String str, int i5) {
        return f(str, f2.b.d(8), i5, 32);
    }

    @Deprecated
    public static String f(String str, byte[] bArr, int i5, int i6) {
        if (TextUtils.isEmpty(str)) {
            g.d(f641a, "pwd is null.");
            return "";
        }
        if (i5 < 1000) {
            g.d(f641a, "iterations times is not enough.");
            return "";
        }
        if (bArr != null && bArr.length >= 8) {
            if (i6 < 32) {
                g.d(f641a, "cipherLen length is not enough");
                return "";
            }
            return f2.c.b(bArr) + f2.c.b(c(str.toCharArray(), bArr, i5, i6 * 8));
        }
        g.d(f641a, "salt parameter is null or length is not enough");
        return "";
    }

    public static String g(String str) {
        return h(str, 10000);
    }

    public static String h(String str, int i5) {
        return i(str, f2.b.d(16), i5, 32);
    }

    public static String i(String str, byte[] bArr, int i5, int i6) {
        byte[] j5;
        if (TextUtils.isEmpty(str)) {
            g.d(f641a, "pwd is null.");
            return "";
        }
        if (i5 < 1000) {
            g.d(f641a, "iterations times is not enough.");
            return "";
        }
        if (bArr != null && bArr.length >= 16) {
            if (i6 < 32) {
                g.d(f641a, "cipherLen length is not enough");
                return "";
            }
            if (Build.VERSION.SDK_INT < 26) {
                g.e(f641a, "sha 1");
                j5 = c(str.toCharArray(), bArr, i5, i6 * 8);
            } else {
                g.e(f641a, "sha 256");
                j5 = j(str.toCharArray(), bArr, i5, i6 * 8);
            }
            return f2.c.b(bArr) + f2.c.b(j5);
        }
        g.d(f641a, "salt parameter is null or length is not enough");
        return "";
    }

    public static byte[] j(char[] cArr, byte[] bArr, int i5, int i6) {
        byte[] bArr2 = new byte[0];
        if (Build.VERSION.SDK_INT < 26) {
            g.d(f641a, "system version not high than 26");
            return bArr2;
        }
        return b(cArr, bArr, i5, i6, true);
    }

    @Deprecated
    public static boolean k(String str, String str2) {
        return l(str, str2, 10000);
    }

    @Deprecated
    public static boolean l(String str, String str2, int i5) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || str2.length() < 16) {
            return false;
        }
        return a(c(str.toCharArray(), f2.c.c(str2.substring(0, 16)), i5, 256), f2.c.c(str2.substring(16)));
    }

    public static boolean m(String str, String str2) {
        return n(str, str2, 10000);
    }

    public static boolean n(String str, String str2, int i5) {
        byte[] j5;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || str2.length() < 32) {
            return false;
        }
        String substring = str2.substring(0, 32);
        String substring2 = str2.substring(32);
        if (Build.VERSION.SDK_INT < 26) {
            j5 = c(str.toCharArray(), f2.c.c(substring), i5, 256);
        } else {
            j5 = j(str.toCharArray(), f2.c.c(substring), i5, 256);
        }
        return a(j5, f2.c.c(substring2));
    }
}
