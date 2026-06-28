package b2;

import android.text.TextUtils;
import f2.g;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f650a = "SHA";

    /* renamed from: c, reason: collision with root package name */
    private static final String f652c = "";

    /* renamed from: b, reason: collision with root package name */
    private static final String f651b = "SHA-256";

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f653d = {f651b, "SHA-384", "SHA-512"};

    private d() {
    }

    private static boolean a(String str) {
        for (String str2 : f653d) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static String b(String str) {
        return c(str, f651b);
    }

    public static String c(String str, String str2) {
        byte[] bArr;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (!a(str2)) {
                g.d(f650a, "algorithm is not safe or legal");
                return "";
            }
            try {
                bArr = str.getBytes("UTF-8");
            } catch (UnsupportedEncodingException unused) {
                bArr = new byte[0];
                g.d(f650a, "Error in generate SHA UnsupportedEncodingException");
            }
            return f2.c.b(d(bArr, str2));
        }
        g.d(f650a, "content or algorithm is null.");
        return "";
    }

    public static byte[] d(byte[] bArr, String str) {
        if (bArr != null && !TextUtils.isEmpty(str)) {
            if (!a(str)) {
                g.d(f650a, "algorithm is not safe or legal");
                return new byte[0];
            }
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str);
                messageDigest.update(bArr);
                return messageDigest.digest();
            } catch (NoSuchAlgorithmException unused) {
                g.d(f650a, "Error in generate SHA NoSuchAlgorithmException");
                return new byte[0];
            }
        }
        g.d(f650a, "content or algorithm is null.");
        return new byte[0];
    }

    public static boolean e(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            return str2.equals(c(str, str3));
        }
        return false;
    }

    public static boolean f(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return str2.equals(b(str));
        }
        return false;
    }
}
