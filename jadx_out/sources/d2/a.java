package d2;

import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Base64;
import f2.g;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import o0.d;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f15877a = "RSAEncryptKS";

    /* renamed from: b, reason: collision with root package name */
    private static final String f15878b = "AndroidKeyStore";

    /* renamed from: c, reason: collision with root package name */
    private static final String f15879c = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding";

    /* renamed from: d, reason: collision with root package name */
    private static final String f15880d = "";

    /* renamed from: e, reason: collision with root package name */
    private static final int f15881e = 2048;

    /* renamed from: f, reason: collision with root package name */
    private static final int f15882f = 3072;

    private static synchronized KeyPair a(String str, boolean z4) {
        synchronized (a.class) {
            KeyPair keyPair = null;
            if (f(str)) {
                g.d(f15877a, "Key pair exits");
                return null;
            }
            g.e(f15877a, "generate key pair.");
            try {
                try {
                    try {
                        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(d.f20838a, f15878b);
                        if (!z4) {
                            keyPairGenerator.initialize(new KeyGenParameterSpec.Builder(str, 2).setDigests("SHA-256", "SHA-512").setEncryptionPaddings("OAEPPadding").setKeySize(2048).build());
                        } else {
                            keyPairGenerator.initialize(new KeyGenParameterSpec.Builder(str, 2).setDigests("SHA-256", "SHA-512").setEncryptionPaddings("OAEPPadding").setKeySize(f15882f).build());
                        }
                        keyPair = keyPairGenerator.generateKeyPair();
                    } catch (NoSuchAlgorithmException e5) {
                        g.d(f15877a, "NoSuchAlgorithmException: " + e5.getMessage());
                    }
                } catch (InvalidAlgorithmParameterException e6) {
                    g.d(f15877a, "InvalidAlgorithmParameterException: " + e6.getMessage());
                }
            } catch (NoSuchProviderException e7) {
                g.d(f15877a, "NoSuchProviderException: " + e7.getMessage());
            } catch (Exception e8) {
                g.d(f15877a, "Exception: " + e8.getMessage());
            }
            return keyPair;
        }
    }

    private static PrivateKey b(String str) {
        if (!f(str)) {
            return null;
        }
        try {
            KeyStore keyStore = KeyStore.getInstance(f15878b);
            keyStore.load(null);
            return (PrivateKey) keyStore.getKey(str, null);
        } catch (IOException e5) {
            g.d(f15877a, "IOException: " + e5.getMessage());
            return null;
        } catch (KeyStoreException e6) {
            g.d(f15877a, "KeyStoreException: " + e6.getMessage());
            return null;
        } catch (NoSuchAlgorithmException e7) {
            g.d(f15877a, "NoSuchAlgorithmException: " + e7.getMessage());
            return null;
        } catch (UnrecoverableKeyException e8) {
            g.d(f15877a, "UnrecoverableKeyException: " + e8.getMessage());
            return null;
        } catch (CertificateException e9) {
            g.d(f15877a, "CertificateException: " + e9.getMessage());
            return null;
        } catch (Exception e10) {
            g.d(f15877a, "Exception: " + e10.getMessage());
            return null;
        }
    }

    private static boolean c() {
        return true;
    }

    private static byte[] d(String str, byte[] bArr, boolean z4) {
        byte[] bArr2 = new byte[0];
        if (!TextUtils.isEmpty(str) && bArr != null) {
            if (!c()) {
                g.d(f15877a, "sdk version is too low");
                return bArr2;
            }
            PublicKey e5 = e(str, z4);
            if (e5 == null) {
                g.d(f15877a, "Public key is null");
                return bArr2;
            }
            try {
                Cipher cipher = Cipher.getInstance(f15879c);
                cipher.init(1, e5, new OAEPParameterSpec("SHA-256", "MGF1", new MGF1ParameterSpec("SHA-1"), PSource.PSpecified.DEFAULT));
                return cipher.doFinal(bArr);
            } catch (InvalidAlgorithmParameterException e6) {
                g.d(f15877a, "InvalidAlgorithmParameterException: " + e6.getMessage());
                return bArr2;
            } catch (InvalidKeyException e7) {
                g.d(f15877a, "InvalidKeyException: " + e7.getMessage());
                return bArr2;
            } catch (NoSuchAlgorithmException e8) {
                g.d(f15877a, "NoSuchAlgorithmException: " + e8.getMessage());
                return bArr2;
            } catch (BadPaddingException e9) {
                g.d(f15877a, "BadPaddingException: " + e9.getMessage());
                return bArr2;
            } catch (IllegalBlockSizeException e10) {
                g.d(f15877a, "IllegalBlockSizeException: " + e10.getMessage());
                return bArr2;
            } catch (NoSuchPaddingException e11) {
                g.d(f15877a, "NoSuchPaddingException: " + e11.getMessage());
                return bArr2;
            } catch (Exception e12) {
                g.d(f15877a, "Exception: " + e12.getMessage());
                return bArr2;
            }
        }
        g.d(f15877a, "alias or content is null");
        return bArr2;
    }

    private static PublicKey e(String str, boolean z4) {
        if (!f(str)) {
            a(str, z4);
        }
        Certificate g5 = g(str);
        if (g5 != null) {
            return g5.getPublicKey();
        }
        return null;
    }

    private static boolean f(String str) {
        try {
            KeyStore keyStore = KeyStore.getInstance(f15878b);
            keyStore.load(null);
            if (keyStore.getKey(str, null) == null) {
                return false;
            }
            return true;
        } catch (IOException e5) {
            g.d(f15877a, "IOException: " + e5.getMessage());
            return false;
        } catch (KeyStoreException e6) {
            g.d(f15877a, "KeyStoreException: " + e6.getMessage());
            return false;
        } catch (NoSuchAlgorithmException e7) {
            g.d(f15877a, "NoSuchAlgorithmException: " + e7.getMessage());
            return false;
        } catch (UnrecoverableKeyException e8) {
            g.d(f15877a, "UnrecoverableKeyException: " + e8.getMessage());
            return false;
        } catch (CertificateException e9) {
            g.d(f15877a, "CertificateException: " + e9.getMessage());
            return false;
        } catch (Exception e10) {
            g.d(f15877a, "Exception: " + e10.getMessage());
            return false;
        }
    }

    private static Certificate g(String str) {
        try {
            KeyStore keyStore = KeyStore.getInstance(f15878b);
            keyStore.load(null);
            return keyStore.getCertificate(str);
        } catch (IOException e5) {
            g.d(f15877a, "IOException: " + e5.getMessage());
            return null;
        } catch (KeyStoreException e6) {
            g.d(f15877a, "KeyStoreException: " + e6.getMessage());
            return null;
        } catch (NoSuchAlgorithmException e7) {
            g.d(f15877a, "NoSuchAlgorithmException: " + e7.getMessage());
            return null;
        } catch (CertificateException e8) {
            g.d(f15877a, "CertificateException: " + e8.getMessage());
            return null;
        } catch (Exception e9) {
            g.d(f15877a, "Exception: " + e9.getMessage());
            return null;
        }
    }

    @Deprecated
    public static String h(String str, String str2) {
        try {
            return new String(i(str, Base64.decode(str2, 0)), "UTF-8");
        } catch (UnsupportedEncodingException e5) {
            g.d(f15877a, "UnsupportedEncodingException: " + e5.getMessage());
            return "";
        } catch (Exception e6) {
            g.d(f15877a, "Exception: " + e6.getMessage());
            return "";
        }
    }

    @Deprecated
    public static byte[] i(String str, byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (!TextUtils.isEmpty(str) && bArr != null) {
            if (!c()) {
                g.d(f15877a, "sdk version is too low");
                return bArr2;
            }
            PrivateKey b5 = b(str);
            if (b5 == null) {
                g.d(f15877a, "Private key is null");
                return bArr2;
            }
            try {
                Cipher cipher = Cipher.getInstance(f15879c);
                cipher.init(2, b5, new OAEPParameterSpec("SHA-256", "MGF1", new MGF1ParameterSpec("SHA-1"), PSource.PSpecified.DEFAULT));
                return cipher.doFinal(bArr);
            } catch (InvalidAlgorithmParameterException e5) {
                g.d(f15877a, "InvalidAlgorithmParameterException: " + e5.getMessage());
                return bArr2;
            } catch (InvalidKeyException e6) {
                g.d(f15877a, "InvalidKeyException: " + e6.getMessage());
                return bArr2;
            } catch (NoSuchAlgorithmException e7) {
                g.d(f15877a, "NoSuchAlgorithmException: " + e7.getMessage());
                return bArr2;
            } catch (BadPaddingException e8) {
                g.d(f15877a, "BadPaddingException: " + e8.getMessage());
                return bArr2;
            } catch (IllegalBlockSizeException e9) {
                g.d(f15877a, "IllegalBlockSizeException: " + e9.getMessage());
                return bArr2;
            } catch (NoSuchPaddingException e10) {
                g.d(f15877a, "NoSuchPaddingException: " + e10.getMessage());
                return bArr2;
            } catch (Exception e11) {
                g.d(f15877a, "Exception: " + e11.getMessage());
                return bArr2;
            }
        }
        g.d(f15877a, "alias or encrypted content is null");
        return bArr2;
    }

    public static String j(String str, String str2) {
        try {
            return new String(k(str, Base64.decode(str2, 0)), "UTF-8");
        } catch (UnsupportedEncodingException e5) {
            g.d(f15877a, "UnsupportedEncodingException: " + e5.getMessage());
            return "";
        } catch (Exception e6) {
            g.d(f15877a, "Exception: " + e6.getMessage());
            return "";
        }
    }

    public static byte[] k(String str, byte[] bArr) {
        return i(str, bArr);
    }

    @Deprecated
    public static String l(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            try {
                return Base64.encodeToString(m(str, str2.getBytes("UTF-8")), 0);
            } catch (UnsupportedEncodingException e5) {
                g.d(f15877a, "UnsupportedEncodingException: " + e5.getMessage());
                return "";
            }
        }
        return "";
    }

    @Deprecated
    public static byte[] m(String str, byte[] bArr) {
        return d(str, bArr, false);
    }

    public static String n(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            try {
                return Base64.encodeToString(o(str, str2.getBytes("UTF-8")), 0);
            } catch (UnsupportedEncodingException e5) {
                g.d(f15877a, "UnsupportedEncodingException: " + e5.getMessage());
                return "";
            }
        }
        return "";
    }

    public static byte[] o(String str, byte[] bArr) {
        return d(str, bArr, true);
    }
}
