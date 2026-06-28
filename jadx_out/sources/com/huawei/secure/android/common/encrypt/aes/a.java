package com.huawei.secure.android.common.encrypt.aes;

import android.text.TextUtils;
import f2.g;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8883a = "security:";

    /* renamed from: b, reason: collision with root package name */
    private static final String f8884b = "AES/CBC/PKCS5Padding";

    /* renamed from: c, reason: collision with root package name */
    private static final String f8885c = "AES";

    /* renamed from: d, reason: collision with root package name */
    private static final String f8886d = "CBC";

    /* renamed from: e, reason: collision with root package name */
    private static final String f8887e = "";

    /* renamed from: f, reason: collision with root package name */
    private static final int f8888f = 16;

    /* renamed from: g, reason: collision with root package name */
    private static final int f8889g = 16;

    private a() {
    }

    private static int a(byte[] bArr) {
        return bArr[16] == 58 ? 16 : -1;
    }

    private static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return str.substring(0, 6) + str.substring(12, 16) + str.substring(26, 32) + str.substring(48);
        } catch (Exception e5) {
            g.d(f8886d, "get encryptword exception : " + e5.getMessage());
            return "";
        }
    }

    private static String c(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                return str2.substring(0, 6) + str.substring(0, 6) + str2.substring(6, 10) + str.substring(6, 16) + str2.substring(10, 16) + str.substring(16) + str2.substring(16);
            } catch (Exception e5) {
                g.d(f8886d, "mix exception: " + e5.getMessage());
            }
        }
        return "";
    }

    private static byte[] d(String str, byte[] bArr, byte[] bArr2) {
        if (TextUtils.isEmpty(str)) {
            g.d(f8886d, "encrypt 5 content is null");
            return new byte[0];
        }
        if (bArr == null) {
            g.d(f8886d, "encrypt 5 key is null");
            return new byte[0];
        }
        if (bArr.length < 16) {
            g.d(f8886d, "encrypt 5 key lengh is not right");
            return new byte[0];
        }
        if (bArr2 == null) {
            g.d(f8886d, "encrypt 5 iv is null");
            return new byte[0];
        }
        if (bArr2.length < 16) {
            g.d(f8886d, "encrypt 5 iv lengh is not right");
            return new byte[0];
        }
        try {
            return y(str.getBytes("UTF-8"), bArr, bArr2);
        } catch (UnsupportedEncodingException e5) {
            g.d(f8886d, " cbc encrypt data error" + e5.getMessage());
            return new byte[0];
        }
    }

    private static byte[] e(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    private static String f(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return str.substring(6, 12) + str.substring(16, 26) + str.substring(32, 48);
        } catch (Exception e5) {
            g.d(f8886d, "getIv exception : " + e5.getMessage());
            return "";
        }
    }

    private static byte[] g(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length - 16];
        System.arraycopy(bArr, 16, bArr2, 0, bArr.length - 16);
        return bArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String h(String str) {
        if (TextUtils.isEmpty(str) || str.indexOf(f8883a) == -1) {
            return "";
        }
        return str.substring(9);
    }

    private static byte[] i(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 0, bArr2, 0, 16);
        return bArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] j(byte[] bArr) {
        String str;
        try {
            str = new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e5) {
            g.d(f8886d, "stripCryptHead: exception : " + e5.getMessage());
            str = "";
        }
        if (!str.startsWith(f8883a)) {
            return new byte[0];
        }
        if (bArr.length > 9) {
            int length = bArr.length - 9;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 9, bArr2, 0, length);
            return bArr2;
        }
        return new byte[0];
    }

    public static String k(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            g.d(f8886d, "decrypt 1 content is null");
            return "";
        }
        if (TextUtils.isEmpty(str2)) {
            g.d(f8886d, "decrypt 1 key is null");
            return "";
        }
        byte[] c5 = f2.c.c(str2);
        if (c5.length < 16) {
            g.d(f8886d, "decrypt 1 key length is not right");
            return "";
        }
        return m(str, c5);
    }

    public static String l(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            g.d(f8886d, "decrypt 3 content is null");
            return "";
        }
        if (TextUtils.isEmpty(str2)) {
            g.d(f8886d, "decrypt 3 key is null");
            return "";
        }
        if (TextUtils.isEmpty(str3)) {
            g.d(f8886d, "decrypt 3 iv is null");
            return "";
        }
        byte[] c5 = f2.c.c(str2);
        byte[] c6 = f2.c.c(str3);
        if (c5.length < 16) {
            g.d(f8886d, "decrypt 3 key length is not right");
            return "";
        }
        if (c6.length < 16) {
            g.d(f8886d, "decrypt 3 iv length is not right");
            return "";
        }
        return n(str, c5, c6);
    }

    public static String m(String str, byte[] bArr) {
        if (TextUtils.isEmpty(str)) {
            g.d(f8886d, "decrypt 2 content is null");
            return "";
        }
        if (bArr == null) {
            g.d(f8886d, "decrypt 2 key is null");
            return "";
        }
        if (bArr.length < 16) {
            g.d(f8886d, "decrypt 2 key lengh is not right");
            return "";
        }
        String f5 = f(str);
        String b5 = b(str);
        if (TextUtils.isEmpty(f5)) {
            g.d(f8886d, "decrypt 2 iv is null");
            return "";
        }
        if (TextUtils.isEmpty(b5)) {
            g.d(f8886d, "decrypt 2 encrypt content is null");
            return "";
        }
        return n(b5, bArr, f2.c.c(f5));
    }

    public static String n(String str, byte[] bArr, byte[] bArr2) {
        if (TextUtils.isEmpty(str)) {
            g.d(f8886d, "decrypt 4 content is null");
            return "";
        }
        if (bArr == null) {
            g.d(f8886d, "decrypt 4 key is null");
            return "";
        }
        if (bArr.length < 16) {
            g.d(f8886d, "decrypt 4 key lengh is not right");
            return "";
        }
        if (bArr2 == null) {
            g.d(f8886d, "decrypt 4 iv is null");
            return "";
        }
        if (bArr2.length < 16) {
            g.d(f8886d, "decrypt 4 iv lengh is not right");
            return "";
        }
        try {
            return new String(p(f2.c.c(str), bArr, bArr2), "UTF-8");
        } catch (UnsupportedEncodingException e5) {
            g.d(f8886d, " cbc decrypt data error" + e5.getMessage());
            return "";
        }
    }

    public static byte[] o(byte[] bArr, byte[] bArr2) {
        return p(g(bArr), bArr2, i(bArr));
    }

    public static byte[] p(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            g.d(f8886d, "decrypt 6 content is null");
            return new byte[0];
        }
        if (bArr.length == 0) {
            g.d(f8886d, "decrypt 6 content length is 0");
            return new byte[0];
        }
        if (bArr2 == null) {
            g.d(f8886d, "decrypt 6 key is null");
            return new byte[0];
        }
        if (bArr2.length < 16) {
            g.d(f8886d, "decrypt 6 key length is error");
            return new byte[0];
        }
        if (bArr3 == null) {
            g.d(f8886d, "decrypt 6 iv is null");
            return new byte[0];
        }
        if (bArr3.length < 16) {
            g.d(f8886d, "decrypt 6 iv length is error");
            return new byte[0];
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, f8885c);
        try {
            Cipher cipher = Cipher.getInstance(f8884b);
            cipher.init(2, secretKeySpec, new IvParameterSpec(bArr3));
            return cipher.doFinal(bArr);
        } catch (InvalidAlgorithmParameterException e5) {
            g.d(f8886d, "InvalidAlgorithmParameterException: " + e5.getMessage());
            return new byte[0];
        } catch (InvalidKeyException e6) {
            g.d(f8886d, "InvalidKeyException: " + e6.getMessage());
            return new byte[0];
        } catch (NoSuchAlgorithmException e7) {
            g.d(f8886d, "NoSuchAlgorithmException: " + e7.getMessage());
            return new byte[0];
        } catch (BadPaddingException e8) {
            g.d(f8886d, "BadPaddingException: " + e8.getMessage());
            g.d(f8886d, "key is not right");
            return new byte[0];
        } catch (IllegalBlockSizeException e9) {
            g.d(f8886d, "IllegalBlockSizeException: " + e9.getMessage());
            return new byte[0];
        } catch (NoSuchPaddingException e10) {
            g.d(f8886d, "NoSuchPaddingException: " + e10.getMessage());
            return new byte[0];
        }
    }

    public static String q(String str, byte[] bArr) {
        if (!TextUtils.isEmpty(str) && bArr != null && bArr.length >= 16) {
            String h5 = h(str);
            if ("".equals(h5)) {
                return "";
            }
            int indexOf = h5.indexOf(58);
            if (indexOf >= 0) {
                return n(f2.c.b(f2.c.c(h5.substring(indexOf + 1))), bArr, f2.c.c(h5.substring(0, indexOf)));
            }
            g.d(f8886d, " cbc cipherText data missing colon");
        }
        return "";
    }

    public static String r(byte[] bArr, byte[] bArr2) {
        try {
            return new String(s(bArr, bArr2), "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            g.d(f8886d, "decryptWithCryptHead UnsupportedEncodingException ");
            return "";
        }
    }

    public static byte[] s(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null && bArr2.length >= 16) {
            byte[] j5 = j(bArr);
            if (j5.length == 0) {
                return new byte[0];
            }
            int a5 = a(j5);
            if (a5 >= 0) {
                byte[] copyOf = Arrays.copyOf(j5, a5);
                int length = (j5.length - copyOf.length) - 1;
                byte[] bArr3 = new byte[length];
                System.arraycopy(j5, a5 + 1, bArr3, 0, length);
                return p(bArr3, bArr2, copyOf);
            }
            g.d(f8886d, " cbc cipherText data missing colon");
            return new byte[0];
        }
        return new byte[0];
    }

    public static String t(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            g.d(f8886d, "encrypt 1 content is null");
            return "";
        }
        if (TextUtils.isEmpty(str2)) {
            g.d(f8886d, "encrypt 1 key is null");
            return "";
        }
        byte[] c5 = f2.c.c(str2);
        if (c5.length < 16) {
            g.d(f8886d, "encrypt 1 key length is not right");
            return "";
        }
        return v(str, c5);
    }

    public static String u(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            g.d(f8886d, "encrypt 3 content is null");
            return "";
        }
        if (TextUtils.isEmpty(str2)) {
            g.d(f8886d, "encrypt 3 key is null");
            return "";
        }
        if (TextUtils.isEmpty(str3)) {
            g.d(f8886d, "encrypt 3 iv is null");
            return "";
        }
        byte[] c5 = f2.c.c(str2);
        byte[] c6 = f2.c.c(str3);
        if (c5.length < 16) {
            g.d(f8886d, "encrypt 3 key length is not right");
            return "";
        }
        if (c6.length < 16) {
            g.d(f8886d, "encrypt 3 iv length is not right");
            return "";
        }
        return w(str, c5, c6);
    }

    public static String v(String str, byte[] bArr) {
        if (TextUtils.isEmpty(str)) {
            g.d(f8886d, "encrypt 2 content is null");
            return "";
        }
        if (bArr == null) {
            g.d(f8886d, "encrypt 2 key is null");
            return "";
        }
        if (bArr.length < 16) {
            g.d(f8886d, "encrypt 2 key lengh is not right");
            return "";
        }
        byte[] d5 = f2.b.d(16);
        byte[] d6 = d(str, bArr, d5);
        if (d6 == null || d6.length == 0) {
            return "";
        }
        return c(f2.c.b(d5), f2.c.b(d6));
    }

    public static String w(String str, byte[] bArr, byte[] bArr2) {
        if (TextUtils.isEmpty(str)) {
            g.d(f8886d, "encrypt 4 content is null");
            return "";
        }
        if (bArr == null) {
            g.d(f8886d, "encrypt 4 key is null");
            return "";
        }
        if (bArr.length < 16) {
            g.d(f8886d, "encrypt 4 key lengh is not right");
            return "";
        }
        if (bArr2 == null) {
            g.d(f8886d, "encrypt 4 iv is null");
            return "";
        }
        if (bArr2.length < 16) {
            g.d(f8886d, "encrypt 4 iv lengh is not right");
            return "";
        }
        return f2.c.b(d(str, bArr, bArr2));
    }

    public static byte[] x(byte[] bArr, byte[] bArr2) {
        byte[] d5 = f2.b.d(16);
        return e(d5, y(bArr, bArr2, d5));
    }

    public static byte[] y(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            g.d(f8886d, "encrypt 6 content is null");
            return new byte[0];
        }
        if (bArr.length == 0) {
            g.d(f8886d, "encrypt 6 content length is 0");
            return new byte[0];
        }
        if (bArr2 == null) {
            g.d(f8886d, "encrypt 6 key is null");
            return new byte[0];
        }
        if (bArr2.length < 16) {
            g.d(f8886d, "encrypt 6 key length is error");
            return new byte[0];
        }
        if (bArr3 == null) {
            g.d(f8886d, "encrypt 6 iv is null");
            return new byte[0];
        }
        if (bArr3.length < 16) {
            g.d(f8886d, "encrypt 6 iv length is error");
            return new byte[0];
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, f8885c);
        try {
            Cipher cipher = Cipher.getInstance(f8884b);
            cipher.init(1, secretKeySpec, new IvParameterSpec(bArr3));
            return cipher.doFinal(bArr);
        } catch (InvalidAlgorithmParameterException e5) {
            g.d(f8886d, "InvalidAlgorithmParameterException: " + e5.getMessage());
            return new byte[0];
        } catch (InvalidKeyException e6) {
            g.d(f8886d, "InvalidKeyException: " + e6.getMessage());
            return new byte[0];
        } catch (NoSuchAlgorithmException e7) {
            g.d(f8886d, "NoSuchAlgorithmException: " + e7.getMessage());
            return new byte[0];
        } catch (BadPaddingException e8) {
            g.d(f8886d, "BadPaddingException: " + e8.getMessage());
            return new byte[0];
        } catch (IllegalBlockSizeException e9) {
            g.d(f8886d, "IllegalBlockSizeException: " + e9.getMessage());
            return new byte[0];
        } catch (NoSuchPaddingException e10) {
            g.d(f8886d, "NoSuchPaddingException: " + e10.getMessage());
            return new byte[0];
        }
    }
}
