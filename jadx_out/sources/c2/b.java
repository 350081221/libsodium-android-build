package c2;

import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import f2.c;
import f2.g;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f718a = "GCMKS";

    /* renamed from: b, reason: collision with root package name */
    private static final String f719b = "AndroidKeyStore";

    /* renamed from: c, reason: collision with root package name */
    private static final String f720c = "AES/GCM/NoPadding";

    /* renamed from: d, reason: collision with root package name */
    private static final String f721d = "";

    /* renamed from: e, reason: collision with root package name */
    private static final int f722e = 12;

    /* renamed from: f, reason: collision with root package name */
    private static final int f723f = 256;

    /* renamed from: g, reason: collision with root package name */
    private static Map<String, SecretKey> f724g = new HashMap();

    private static SecretKey a(String str) {
        g.e(f718a, "load key");
        SecretKey secretKey = null;
        try {
            KeyStore keyStore = KeyStore.getInstance(f719b);
            keyStore.load(null);
            Key key = keyStore.getKey(str, null);
            if (key instanceof SecretKey) {
                secretKey = (SecretKey) key;
            } else {
                g.e(f718a, "generate key");
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", f719b);
                keyGenerator.init(new KeyGenParameterSpec.Builder(str, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build());
                secretKey = keyGenerator.generateKey();
            }
        } catch (IOException e5) {
            g.d(f718a, "IOException : " + e5.getMessage());
        } catch (InvalidAlgorithmParameterException e6) {
            g.d(f718a, "InvalidAlgorithmParameterException : " + e6.getMessage());
        } catch (KeyStoreException e7) {
            g.d(f718a, "KeyStoreException : " + e7.getMessage());
        } catch (NoSuchAlgorithmException e8) {
            g.d(f718a, "NoSuchAlgorithmException : " + e8.getMessage());
        } catch (NoSuchProviderException e9) {
            g.d(f718a, "NoSuchProviderException : " + e9.getMessage());
        } catch (UnrecoverableKeyException e10) {
            g.d(f718a, "UnrecoverableKeyException : " + e10.getMessage());
        } catch (CertificateException e11) {
            g.d(f718a, "CertificateException : " + e11.getMessage());
        } catch (Exception e12) {
            g.d(f718a, "Exception: " + e12.getMessage());
        }
        f724g.put(str, secretKey);
        return secretKey;
    }

    private static boolean b() {
        return true;
    }

    private static SecretKey c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (f724g.get(str) == null) {
            a(str);
        }
        return f724g.get(str);
    }

    public static String d(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                return new String(e(str, c.c(str2)), "UTF-8");
            } catch (UnsupportedEncodingException e5) {
                g.d(f718a, "decrypt: UnsupportedEncodingException : " + e5.getMessage());
                return "";
            }
        }
        g.d(f718a, "alias or encrypt content is null");
        return "";
    }

    public static byte[] e(String str, byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (!TextUtils.isEmpty(str) && bArr != null) {
            if (!b()) {
                g.d(f718a, "sdk version is too low");
                return bArr2;
            }
            if (bArr.length <= 12) {
                g.d(f718a, "Decrypt source data is invalid.");
                return bArr2;
            }
            return f(c(str), bArr);
        }
        g.d(f718a, "alias or encrypt content is null");
        return bArr2;
    }

    public static byte[] f(SecretKey secretKey, byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (secretKey == null) {
            g.d(f718a, "Decrypt secret key is null");
            return bArr2;
        }
        if (bArr == null) {
            g.d(f718a, "content is null");
            return bArr2;
        }
        if (!b()) {
            g.d(f718a, "sdk version is too low");
            return bArr2;
        }
        if (bArr.length <= 12) {
            g.d(f718a, "Decrypt source data is invalid.");
            return bArr2;
        }
        byte[] copyOf = Arrays.copyOf(bArr, 12);
        try {
            Cipher cipher = Cipher.getInstance(f720c);
            cipher.init(2, secretKey, new GCMParameterSpec(128, copyOf));
            return cipher.doFinal(bArr, 12, bArr.length - 12);
        } catch (InvalidAlgorithmParameterException e5) {
            g.d(f718a, "InvalidAlgorithmParameterException : " + e5.getMessage());
            return bArr2;
        } catch (InvalidKeyException e6) {
            g.d(f718a, "InvalidKeyException : " + e6.getMessage());
            return bArr2;
        } catch (NoSuchAlgorithmException e7) {
            g.d(f718a, "NoSuchAlgorithmException : " + e7.getMessage());
            return bArr2;
        } catch (BadPaddingException e8) {
            g.d(f718a, "BadPaddingException : " + e8.getMessage());
            return bArr2;
        } catch (IllegalBlockSizeException e9) {
            g.d(f718a, "IllegalBlockSizeException : " + e9.getMessage());
            return bArr2;
        } catch (NoSuchPaddingException e10) {
            g.d(f718a, "NoSuchPaddingException : " + e10.getMessage());
            return bArr2;
        } catch (Exception e11) {
            g.d(f718a, "Exception: " + e11.getMessage());
            return bArr2;
        }
    }

    public static String g(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                return c.b(h(str, str2.getBytes("UTF-8")));
            } catch (UnsupportedEncodingException e5) {
                g.d(f718a, "encrypt: UnsupportedEncodingException : " + e5.getMessage());
                return "";
            }
        }
        g.d(f718a, "alias or encrypt content is null");
        return "";
    }

    public static byte[] h(String str, byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (!TextUtils.isEmpty(str) && bArr != null) {
            if (!b()) {
                g.d(f718a, "sdk version is too low");
                return bArr2;
            }
            return i(c(str), bArr);
        }
        g.d(f718a, "alias or encrypt content is null");
        return bArr2;
    }

    public static byte[] i(SecretKey secretKey, byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (bArr == null) {
            g.d(f718a, "content is null");
            return bArr2;
        }
        if (secretKey == null) {
            g.d(f718a, "secret key is null");
            return bArr2;
        }
        if (!b()) {
            g.d(f718a, "sdk version is too low");
            return bArr2;
        }
        try {
            Cipher cipher = Cipher.getInstance(f720c);
            cipher.init(1, secretKey);
            byte[] doFinal = cipher.doFinal(bArr);
            byte[] iv = cipher.getIV();
            if (iv != null && iv.length == 12) {
                byte[] copyOf = Arrays.copyOf(iv, iv.length + doFinal.length);
                System.arraycopy(doFinal, 0, copyOf, iv.length, doFinal.length);
                return copyOf;
            }
            g.d(f718a, "IV is invalid.");
            return bArr2;
        } catch (InvalidKeyException e5) {
            g.d(f718a, "InvalidKeyException : " + e5.getMessage());
            return bArr2;
        } catch (NoSuchAlgorithmException e6) {
            g.d(f718a, "NoSuchAlgorithmException : " + e6.getMessage());
            return bArr2;
        } catch (BadPaddingException e7) {
            g.d(f718a, "BadPaddingException : " + e7.getMessage());
            return bArr2;
        } catch (IllegalBlockSizeException e8) {
            g.d(f718a, "IllegalBlockSizeException : " + e8.getMessage());
            return bArr2;
        } catch (NoSuchPaddingException e9) {
            g.d(f718a, "NoSuchPaddingException : " + e9.getMessage());
            return bArr2;
        } catch (Exception e10) {
            g.d(f718a, "Exception: " + e10.getMessage());
            return bArr2;
        }
    }
}
