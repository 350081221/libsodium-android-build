package com.huawei.secure.android.common.encrypt.aes;

import android.text.TextUtils;
import f2.g;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8890a = "security:";

    /* renamed from: b, reason: collision with root package name */
    private static final String f8891b = "AES/GCM/NoPadding";

    /* renamed from: c, reason: collision with root package name */
    private static final String f8892c = "AES";

    /* renamed from: d, reason: collision with root package name */
    private static final String f8893d = "GCM";

    /* renamed from: e, reason: collision with root package name */
    private static final String f8894e = "";

    /* renamed from: f, reason: collision with root package name */
    private static final int f8895f = 16;

    /* renamed from: g, reason: collision with root package name */
    private static final int f8896g = 12;

    /* renamed from: h, reason: collision with root package name */
    private static final int f8897h = 2;

    private b() {
    }

    private static int a(byte[] bArr) {
        return bArr[12] == 58 ? 12 : -1;
    }

    private static String b(String str) {
        if (!TextUtils.isEmpty(str) && str.length() >= 24) {
            return str.substring(24);
        }
        return "";
    }

    private static byte[] c(String str, byte[] bArr, byte[] bArr2) {
        if (TextUtils.isEmpty(str)) {
            g.d(f8893d, "encrypt 5 content is null");
            return new byte[0];
        }
        if (bArr == null) {
            g.d(f8893d, "encrypt 5 key is null");
            return new byte[0];
        }
        if (bArr.length < 16) {
            g.d(f8893d, "encrypt 5 key lengh is not right");
            return new byte[0];
        }
        if (bArr2 == null) {
            g.d(f8893d, "encrypt 5 iv is null");
            return new byte[0];
        }
        if (bArr2.length < 12) {
            g.d(f8893d, "encrypt 5 iv lengh is not right");
            return new byte[0];
        }
        if (!x()) {
            g.d(f8893d, "encrypt 5 build version not higher than 19");
            return new byte[0];
        }
        try {
            return v(str.getBytes("UTF-8"), bArr, bArr2);
        } catch (UnsupportedEncodingException e5) {
            g.d(f8893d, "GCM encrypt data error" + e5.getMessage());
            return new byte[0];
        }
    }

    private static byte[] d(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    private static String e(String str) {
        if (!TextUtils.isEmpty(str) && str.length() >= 24) {
            return str.substring(0, 24);
        }
        g.d(f8893d, "IV is invalid.");
        return "";
    }

    private static byte[] f(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length - 12];
        System.arraycopy(bArr, 12, bArr2, 0, bArr.length - 12);
        return bArr2;
    }

    private static byte[] g(byte[] bArr) {
        byte[] bArr2 = new byte[12];
        System.arraycopy(bArr, 0, bArr2, 0, 12);
        return bArr2;
    }

    public static String h(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            g.d(f8893d, "decrypt 1 content is null");
            return "";
        }
        if (TextUtils.isEmpty(str2)) {
            g.d(f8893d, "decrypt 1 key is null");
            return "";
        }
        if (!x()) {
            g.d(f8893d, "decrypt 1 build version not higher than 19");
            return "";
        }
        byte[] c5 = f2.c.c(str2);
        if (c5.length < 16) {
            g.d(f8893d, "decrypt 1 key length is not right");
            return "";
        }
        return j(str, c5);
    }

    public static String i(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            g.d(f8893d, "decrypt 3 content is null");
            return "";
        }
        if (TextUtils.isEmpty(str2)) {
            g.d(f8893d, "decrypt 3 key is null");
            return "";
        }
        if (TextUtils.isEmpty(str3)) {
            g.d(f8893d, "decrypt 3 iv is null");
            return "";
        }
        if (!x()) {
            g.d(f8893d, "decrypt 3 build version not higher than 19");
            return "";
        }
        byte[] c5 = f2.c.c(str2);
        byte[] c6 = f2.c.c(str3);
        if (c5.length < 16) {
            g.d(f8893d, "decrypt 3 key length is not right");
            return "";
        }
        if (c6.length < 12) {
            g.d(f8893d, "decrypt 3 iv length is not right");
            return "";
        }
        return k(str, c5, c6);
    }

    public static String j(String str, byte[] bArr) {
        if (TextUtils.isEmpty(str)) {
            g.d(f8893d, "decrypt 2 content is null");
            return "";
        }
        if (bArr == null) {
            g.d(f8893d, "decrypt 2 key is null");
            return "";
        }
        if (bArr.length < 16) {
            g.d(f8893d, "decrypt 2 key lengh is not right");
            return "";
        }
        if (!x()) {
            g.d(f8893d, "decrypt 2 build version not higher than 19");
            return "";
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, f8892c);
            Cipher cipher = Cipher.getInstance(f8891b);
            String e5 = e(str);
            String b5 = b(str);
            if (TextUtils.isEmpty(e5)) {
                g.d(f8893d, "decrypt 2 iv is null");
                return "";
            }
            if (TextUtils.isEmpty(b5)) {
                g.d(f8893d, "decrypt 2 encrypt content is null");
                return "";
            }
            cipher.init(2, secretKeySpec, w(f2.c.c(e5)));
            return new String(cipher.doFinal(f2.c.c(b5)), "UTF-8");
        } catch (UnsupportedEncodingException | NullPointerException | GeneralSecurityException e6) {
            g.d(f8893d, "GCM decrypt data exception: " + e6.getMessage());
            return "";
        }
    }

    public static String k(String str, byte[] bArr, byte[] bArr2) {
        if (TextUtils.isEmpty(str)) {
            g.d(f8893d, "decrypt 4 content is null");
            return "";
        }
        if (bArr == null) {
            g.d(f8893d, "decrypt 4 key is null");
            return "";
        }
        if (bArr.length < 16) {
            g.d(f8893d, "decrypt 4 key lengh is not right");
            return "";
        }
        if (bArr2 == null) {
            g.d(f8893d, "decrypt 4 iv is null");
            return "";
        }
        if (bArr2.length < 12) {
            g.d(f8893d, "decrypt 4 iv lengh is not right");
            return "";
        }
        if (!x()) {
            g.d(f8893d, "decrypt 4 build version not higher than 19");
            return "";
        }
        try {
            return new String(m(f2.c.c(str), bArr, bArr2), "UTF-8");
        } catch (UnsupportedEncodingException e5) {
            g.d(f8893d, "GCM decrypt data exception: " + e5.getMessage());
            return "";
        }
    }

    public static byte[] l(byte[] bArr, byte[] bArr2) {
        return m(f(bArr), bArr2, g(bArr));
    }

    public static byte[] m(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            g.d(f8893d, "decrypt 6 content is null");
            return new byte[0];
        }
        if (bArr.length == 0) {
            g.d(f8893d, "decrypt 6 content length is 0");
            return new byte[0];
        }
        if (bArr2 == null) {
            g.d(f8893d, "decrypt 6 key is null");
            return new byte[0];
        }
        if (bArr2.length < 16) {
            g.d(f8893d, "decrypt 6 key length is error");
            return new byte[0];
        }
        if (bArr3 == null) {
            g.d(f8893d, "decrypt 6 iv is null");
            return new byte[0];
        }
        if (bArr3.length < 12) {
            g.d(f8893d, "decrypt 6 iv length is error");
            return new byte[0];
        }
        if (!x()) {
            g.d(f8893d, "decrypt 6 build version not higher than 19");
            return new byte[0];
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, f8892c);
            Cipher cipher = Cipher.getInstance(f8891b);
            cipher.init(2, secretKeySpec, w(bArr3));
            return cipher.doFinal(bArr);
        } catch (GeneralSecurityException e5) {
            g.d(f8893d, "GCM decrypt data exception: " + e5.getMessage());
            return new byte[0];
        }
    }

    public static String n(String str, byte[] bArr) {
        if (!TextUtils.isEmpty(str) && bArr != null && bArr.length >= 16) {
            String h5 = a.h(str);
            if ("".equals(h5)) {
                return "";
            }
            int indexOf = h5.indexOf(58);
            if (indexOf >= 0) {
                return k(f2.c.b(f2.c.c(h5.substring(indexOf + 1))), bArr, f2.c.c(h5.substring(0, indexOf)));
            }
            g.d(f8893d, " gcm cipherText data missing colon");
        }
        return "";
    }

    public static String o(byte[] bArr, byte[] bArr2) {
        try {
            return new String(p(bArr, bArr2), "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            g.d(f8893d, "UnsupportedEncodingException");
            return "";
        }
    }

    public static byte[] p(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null && bArr2.length >= 16) {
            byte[] j5 = a.j(bArr);
            if (j5.length == 0) {
                return new byte[0];
            }
            int a5 = a(j5);
            if (a5 >= 0) {
                byte[] copyOf = Arrays.copyOf(j5, a5);
                int length = (j5.length - copyOf.length) - 1;
                byte[] bArr3 = new byte[length];
                System.arraycopy(j5, a5 + 1, bArr3, 0, length);
                return m(bArr3, bArr2, copyOf);
            }
            g.d(f8893d, " gcm cipherText data missing colon");
            return new byte[0];
        }
        return new byte[0];
    }

    public static String q(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            g.d(f8893d, "encrypt 1 content is null");
            return "";
        }
        if (TextUtils.isEmpty(str2)) {
            g.d(f8893d, "encrypt 1 key is null");
            return "";
        }
        if (!x()) {
            g.d(f8893d, "encrypt 1 build version not higher than 19");
            return "";
        }
        byte[] c5 = f2.c.c(str2);
        if (c5.length < 16) {
            g.d(f8893d, "encrypt 1 key length is not right");
            return "";
        }
        return s(str, c5);
    }

    public static String r(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            g.d(f8893d, "encrypt 3 content is null");
            return "";
        }
        if (TextUtils.isEmpty(str2)) {
            g.d(f8893d, "encrypt 3 key is null");
            return "";
        }
        if (TextUtils.isEmpty(str3)) {
            g.d(f8893d, "encrypt 3 iv is null");
            return "";
        }
        if (!x()) {
            g.d(f8893d, "encrypt 3 build version not higher than 19");
            return "";
        }
        byte[] c5 = f2.c.c(str2);
        byte[] c6 = f2.c.c(str3);
        if (c5.length < 16) {
            g.d(f8893d, "encrypt 3 key length is not right");
            return "";
        }
        if (c6.length < 12) {
            g.d(f8893d, "encrypt 3 iv length is not right");
            return "";
        }
        return t(str, c5, c6);
    }

    public static String s(String str, byte[] bArr) {
        if (TextUtils.isEmpty(str)) {
            g.d(f8893d, "encrypt 2 content is null");
            return "";
        }
        if (bArr == null) {
            g.d(f8893d, "encrypt 2 key is null");
            return "";
        }
        if (bArr.length < 16) {
            g.d(f8893d, "encrypt 2 key lengh is not right");
            return "";
        }
        if (!x()) {
            g.d(f8893d, "encrypt 2 build version not higher than 19");
            return "";
        }
        byte[] d5 = f2.b.d(12);
        byte[] c5 = c(str, bArr, d5);
        if (c5 == null || c5.length == 0) {
            return "";
        }
        return f2.c.b(d5) + f2.c.b(c5);
    }

    public static String t(String str, byte[] bArr, byte[] bArr2) {
        if (TextUtils.isEmpty(str)) {
            g.d(f8893d, "encrypt 4 content is null");
            return "";
        }
        if (bArr == null) {
            g.d(f8893d, "encrypt 4 key is null");
            return "";
        }
        if (bArr.length < 16) {
            g.d(f8893d, "encrypt 4 key lengh is not right");
            return "";
        }
        if (bArr2 == null) {
            g.d(f8893d, "encrypt 4 iv is null");
            return "";
        }
        if (bArr2.length < 12) {
            g.d(f8893d, "encrypt 4 iv lengh is not right");
            return "";
        }
        if (!x()) {
            g.d(f8893d, "encrypt 4 build version not higher than 19");
            return "";
        }
        return f2.c.b(c(str, bArr, bArr2));
    }

    public static byte[] u(byte[] bArr, byte[] bArr2) {
        byte[] d5 = f2.b.d(12);
        return d(d5, v(bArr, bArr2, d5));
    }

    public static byte[] v(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            g.d(f8893d, "encrypt 6 content is null");
            return new byte[0];
        }
        if (bArr.length == 0) {
            g.d(f8893d, "encrypt 6 content length is 0");
            return new byte[0];
        }
        if (bArr2 == null) {
            g.d(f8893d, "encrypt 6 key is null");
            return new byte[0];
        }
        if (bArr2.length < 16) {
            g.d(f8893d, "encrypt 6 key length is error");
            return new byte[0];
        }
        if (bArr3 == null) {
            g.d(f8893d, "encrypt 6 iv is null");
            return new byte[0];
        }
        if (bArr3.length < 12) {
            g.d(f8893d, "encrypt 6 iv length is error");
            return new byte[0];
        }
        if (!x()) {
            g.d(f8893d, "encrypt 6 build version not higher than 19");
            return new byte[0];
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, f8892c);
            Cipher cipher = Cipher.getInstance(f8891b);
            cipher.init(1, secretKeySpec, w(bArr3));
            return cipher.doFinal(bArr);
        } catch (GeneralSecurityException e5) {
            g.d(f8893d, "GCM encrypt data error" + e5.getMessage());
            return new byte[0];
        }
    }

    public static AlgorithmParameterSpec w(byte[] bArr) {
        return new GCMParameterSpec(128, bArr);
    }

    public static boolean x() {
        return true;
    }
}
