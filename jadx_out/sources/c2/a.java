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
import javax.crypto.spec.IvParameterSpec;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f711a = "CBCKS";

    /* renamed from: b, reason: collision with root package name */
    private static final String f712b = "AndroidKeyStore";

    /* renamed from: c, reason: collision with root package name */
    private static final String f713c = "AES/CBC/PKCS7Padding";

    /* renamed from: d, reason: collision with root package name */
    private static final String f714d = "";

    /* renamed from: e, reason: collision with root package name */
    private static final int f715e = 16;

    /* renamed from: f, reason: collision with root package name */
    private static final int f716f = 256;

    /* renamed from: g, reason: collision with root package name */
    private static Map<String, SecretKey> f717g = new HashMap();

    private static synchronized SecretKey a(String str) {
        SecretKey secretKey;
        synchronized (a.class) {
            g.e(f711a, "load key");
            secretKey = null;
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    KeyStore keyStore = KeyStore.getInstance(f712b);
                                    keyStore.load(null);
                                    Key key = keyStore.getKey(str, null);
                                    if (key != null && (key instanceof SecretKey)) {
                                        secretKey = (SecretKey) key;
                                    } else {
                                        g.e(f711a, "generate key");
                                        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", f712b);
                                        keyGenerator.init(new KeyGenParameterSpec.Builder(str, 3).setBlockModes("CBC").setEncryptionPaddings("PKCS7Padding").setKeySize(256).build());
                                        secretKey = keyGenerator.generateKey();
                                    }
                                } catch (CertificateException e5) {
                                    g.d(f711a, "CertificateException: " + e5.getMessage());
                                }
                            } catch (InvalidAlgorithmParameterException e6) {
                                g.d(f711a, "InvalidAlgorithmParameterException: " + e6.getMessage());
                            }
                        } catch (NoSuchProviderException e7) {
                            g.d(f711a, "NoSuchProviderException: " + e7.getMessage());
                        }
                    } catch (UnrecoverableKeyException e8) {
                        g.d(f711a, "UnrecoverableKeyException: " + e8.getMessage());
                    }
                } catch (IOException e9) {
                    g.d(f711a, "IOException: " + e9.getMessage());
                } catch (Exception e10) {
                    g.d(f711a, "Exception: " + e10.getMessage());
                }
            } catch (KeyStoreException e11) {
                g.d(f711a, "KeyStoreException: " + e11.getMessage());
            } catch (NoSuchAlgorithmException e12) {
                g.d(f711a, "NoSuchAlgorithmException: " + e12.getMessage());
            }
            f717g.put(str, secretKey);
        }
        return secretKey;
    }

    private static boolean b() {
        return true;
    }

    private static SecretKey c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (f717g.get(str) == null) {
            a(str);
        }
        return f717g.get(str);
    }

    public static String d(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                return new String(e(str, c.c(str2)), "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                g.d(f711a, "encrypt: UnsupportedEncodingException");
                return "";
            }
        }
        g.d(f711a, "alias or encrypt content is null");
        return "";
    }

    public static byte[] e(String str, byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (!TextUtils.isEmpty(str) && bArr != null) {
            if (!b()) {
                g.d(f711a, "sdk version is too low");
                return bArr2;
            }
            if (bArr.length <= 16) {
                g.d(f711a, "Decrypt source data is invalid.");
                return bArr2;
            }
            SecretKey c5 = c(str);
            if (c5 == null) {
                g.d(f711a, "decrypt secret key is null");
                return bArr2;
            }
            byte[] copyOf = Arrays.copyOf(bArr, 16);
            try {
                Cipher cipher = Cipher.getInstance(f713c);
                cipher.init(2, c5, new IvParameterSpec(copyOf));
                return cipher.doFinal(bArr, 16, bArr.length - 16);
            } catch (InvalidAlgorithmParameterException e5) {
                g.d(f711a, "InvalidAlgorithmParameterException: " + e5.getMessage());
                return bArr2;
            } catch (InvalidKeyException e6) {
                g.d(f711a, "InvalidKeyException: " + e6.getMessage());
                return bArr2;
            } catch (NoSuchAlgorithmException e7) {
                g.d(f711a, "NoSuchAlgorithmException: " + e7.getMessage());
                return bArr2;
            } catch (BadPaddingException e8) {
                g.d(f711a, "BadPaddingException: " + e8.getMessage());
                return bArr2;
            } catch (IllegalBlockSizeException e9) {
                g.d(f711a, "IllegalBlockSizeException: " + e9.getMessage());
                return bArr2;
            } catch (NoSuchPaddingException e10) {
                g.d(f711a, "NoSuchPaddingException: " + e10.getMessage());
                return bArr2;
            } catch (Exception e11) {
                g.d(f711a, "Exception: " + e11.getMessage());
                return bArr2;
            }
        }
        g.d(f711a, "alias or encrypt content is null");
        return bArr2;
    }

    public static String f(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            g.d(f711a, "encrypt 1 content is null");
            return "";
        }
        try {
            return c.b(g(str, str2.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException unused) {
            g.d(f711a, "encrypt: UnsupportedEncodingException");
            return "";
        }
    }

    public static byte[] g(String str, byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (!TextUtils.isEmpty(str) && bArr != null) {
            if (!b()) {
                g.d(f711a, "sdk version is too low");
                return bArr2;
            }
            try {
                Cipher cipher = Cipher.getInstance(f713c);
                SecretKey c5 = c(str);
                if (c5 == null) {
                    g.d(f711a, "encrypt secret key is null");
                    return bArr2;
                }
                cipher.init(1, c5);
                byte[] doFinal = cipher.doFinal(bArr);
                byte[] iv = cipher.getIV();
                if (iv != null && iv.length == 16) {
                    byte[] copyOf = Arrays.copyOf(iv, iv.length + doFinal.length);
                    System.arraycopy(doFinal, 0, copyOf, iv.length, doFinal.length);
                    return copyOf;
                }
                g.d(f711a, "IV is invalid.");
                return bArr2;
            } catch (InvalidKeyException e5) {
                g.d(f711a, "InvalidKeyException: " + e5.getMessage());
                return bArr2;
            } catch (NoSuchAlgorithmException e6) {
                g.d(f711a, "NoSuchAlgorithmException: " + e6.getMessage());
                return bArr2;
            } catch (BadPaddingException e7) {
                g.d(f711a, "BadPaddingException: " + e7.getMessage());
                return bArr2;
            } catch (IllegalBlockSizeException e8) {
                g.d(f711a, "IllegalBlockSizeException: " + e8.getMessage());
                return bArr2;
            } catch (NoSuchPaddingException e9) {
                g.d(f711a, "NoSuchPaddingException: " + e9.getMessage());
                return bArr2;
            } catch (Exception e10) {
                g.d(f711a, "Exception: " + e10.getMessage());
                return bArr2;
            }
        }
        g.d(f711a, "alias or encrypt content is null");
        return bArr2;
    }
}
