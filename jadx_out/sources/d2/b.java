package d2;

import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
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
import java.security.Signature;
import java.security.SignatureException;
import java.security.UnrecoverableEntryException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import o0.d;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f15883a = "RSASignKS";

    /* renamed from: b, reason: collision with root package name */
    private static final String f15884b = "AndroidKeyStore";

    /* renamed from: c, reason: collision with root package name */
    private static final String f15885c = "SHA256withRSA/PSS";

    /* renamed from: d, reason: collision with root package name */
    private static final String f15886d = "";

    /* renamed from: e, reason: collision with root package name */
    private static final int f15887e = 2048;

    /* renamed from: f, reason: collision with root package name */
    private static final int f15888f = 3072;

    private static synchronized KeyPair a(String str, boolean z4) {
        synchronized (b.class) {
            KeyPair keyPair = null;
            if (b(str)) {
                g.d(f15883a, "Key pair exits");
                return null;
            }
            try {
                try {
                    KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(d.f20838a, f15884b);
                    if (!z4) {
                        keyPairGenerator.initialize(new KeyGenParameterSpec.Builder(str, 12).setDigests("SHA-256", "SHA-512").setSignaturePaddings("PSS").setKeySize(2048).build());
                    } else {
                        keyPairGenerator.initialize(new KeyGenParameterSpec.Builder(str, 12).setDigests("SHA-256", "SHA-512").setSignaturePaddings("PSS").setKeySize(f15888f).build());
                    }
                    keyPair = keyPairGenerator.generateKeyPair();
                } catch (NoSuchAlgorithmException e5) {
                    g.d(f15883a, "NoSuchAlgorithmException: " + e5.getMessage());
                }
            } catch (InvalidAlgorithmParameterException e6) {
                g.d(f15883a, "InvalidAlgorithmParameterException: " + e6.getMessage());
            } catch (NoSuchProviderException e7) {
                g.d(f15883a, "NoSuchProviderException: " + e7.getMessage());
            }
            return keyPair;
        }
    }

    private static boolean b(String str) {
        try {
            KeyStore keyStore = KeyStore.getInstance(f15884b);
            keyStore.load(null);
            if (keyStore.getKey(str, null) == null) {
                return false;
            }
            return true;
        } catch (IOException e5) {
            g.d(f15883a, "IOException: " + e5.getMessage());
            return false;
        } catch (KeyStoreException e6) {
            g.d(f15883a, "KeyStoreException: " + e6.getMessage());
            return false;
        } catch (NoSuchAlgorithmException e7) {
            g.d(f15883a, "NoSuchAlgorithmException: " + e7.getMessage());
            return false;
        } catch (UnrecoverableKeyException e8) {
            g.d(f15883a, "UnrecoverableKeyException: " + e8.getMessage());
            return false;
        } catch (CertificateException e9) {
            g.d(f15883a, "CertificateException: " + e9.getMessage());
            return false;
        }
    }

    private static boolean c(String str, byte[] bArr, byte[] bArr2, boolean z4) {
        if (!TextUtils.isEmpty(str) && bArr != null && bArr2 != null) {
            if (!f()) {
                g.d(f15883a, "sdk version is too low");
                return false;
            }
            KeyStore.Entry e5 = e(str, z4);
            if (!(e5 instanceof KeyStore.PrivateKeyEntry)) {
                g.d(f15883a, "Not an instance of a PrivateKeyEntry");
                return false;
            }
            try {
                Signature signature = Signature.getInstance(f15885c);
                signature.initVerify(((KeyStore.PrivateKeyEntry) e5).getCertificate());
                signature.update(bArr);
                return signature.verify(bArr2);
            } catch (InvalidKeyException e6) {
                g.d(f15883a, "InvalidKeyException: " + e6.getMessage());
                return false;
            } catch (NoSuchAlgorithmException e7) {
                g.d(f15883a, "NoSuchAlgorithmException: " + e7.getMessage());
                return false;
            } catch (SignatureException e8) {
                g.d(f15883a, "SignatureException: " + e8.getMessage());
                return false;
            } catch (Exception e9) {
                g.d(f15883a, "Exception: " + e9.getMessage());
                return false;
            }
        }
        g.d(f15883a, "alias or content or sign value is null");
        return false;
    }

    private static byte[] d(String str, byte[] bArr, boolean z4) {
        byte[] bArr2 = new byte[0];
        if (!TextUtils.isEmpty(str) && bArr != null) {
            if (!f()) {
                g.d(f15883a, "sdk version is too low");
                return bArr2;
            }
            KeyStore.Entry e5 = e(str, z4);
            if (!(e5 instanceof KeyStore.PrivateKeyEntry)) {
                g.d(f15883a, "Not an instance of a PrivateKeyEntry");
                return bArr2;
            }
            try {
                Signature signature = Signature.getInstance(f15885c);
                signature.initSign(((KeyStore.PrivateKeyEntry) e5).getPrivateKey());
                signature.update(bArr);
                return signature.sign();
            } catch (InvalidKeyException e6) {
                g.d(f15883a, "InvalidKeyException: " + e6.getMessage());
                return bArr2;
            } catch (NoSuchAlgorithmException e7) {
                g.d(f15883a, "NoSuchAlgorithmException: " + e7.getMessage());
                return bArr2;
            } catch (SignatureException e8) {
                g.d(f15883a, "SignatureException: " + e8.getMessage());
                return bArr2;
            } catch (Exception e9) {
                g.d(f15883a, "Exception: " + e9.getMessage());
                return bArr2;
            }
        }
        g.d(f15883a, "alias or content is null");
        return bArr2;
    }

    private static KeyStore.Entry e(String str, boolean z4) {
        if (!b(str)) {
            a(str, z4);
        }
        try {
            KeyStore keyStore = KeyStore.getInstance(f15884b);
            keyStore.load(null);
            return keyStore.getEntry(str, null);
        } catch (IOException e5) {
            g.d(f15883a, "IOException: " + e5.getMessage());
            return null;
        } catch (KeyStoreException e6) {
            g.d(f15883a, "KeyStoreException: " + e6.getMessage());
            return null;
        } catch (NoSuchAlgorithmException e7) {
            g.d(f15883a, "NoSuchAlgorithmException: " + e7.getMessage());
            return null;
        } catch (UnrecoverableEntryException e8) {
            g.d(f15883a, "UnrecoverableEntryException: " + e8.getMessage());
            return null;
        } catch (CertificateException e9) {
            g.d(f15883a, "CertificateException: " + e9.getMessage());
            return null;
        }
    }

    public static boolean f() {
        return true;
    }

    @Deprecated
    public static String g(String str, String str2) {
        try {
            return Base64.encodeToString(h(str, str2.getBytes("UTF-8")), 0);
        } catch (UnsupportedEncodingException e5) {
            Log.e(f15883a, "sign UnsupportedEncodingException : " + e5.getMessage());
            return "";
        }
    }

    @Deprecated
    public static byte[] h(String str, byte[] bArr) {
        return d(str, bArr, false);
    }

    public static String i(String str, String str2) {
        try {
            return Base64.encodeToString(j(str, str2.getBytes("UTF-8")), 0);
        } catch (UnsupportedEncodingException e5) {
            Log.e(f15883a, "sign UnsupportedEncodingException : " + e5.getMessage());
            return "";
        }
    }

    public static byte[] j(String str, byte[] bArr) {
        return d(str, bArr, true);
    }

    @Deprecated
    public static boolean k(String str, String str2, String str3) {
        try {
            return l(str, str2.getBytes("UTF-8"), Base64.decode(str3, 0));
        } catch (UnsupportedEncodingException e5) {
            Log.e(f15883a, "verifySign UnsupportedEncodingException: " + e5.getMessage());
            return false;
        } catch (Exception e6) {
            g.d(f15883a, "base64 decode Exception" + e6.getMessage());
            return false;
        }
    }

    @Deprecated
    public static boolean l(String str, byte[] bArr, byte[] bArr2) {
        return c(str, bArr, bArr2, false);
    }

    public static boolean m(String str, String str2, String str3) {
        try {
            return n(str, str2.getBytes("UTF-8"), Base64.decode(str3, 0));
        } catch (UnsupportedEncodingException e5) {
            Log.e(f15883a, "verifySign UnsupportedEncodingException: " + e5.getMessage());
            return false;
        } catch (Exception e6) {
            g.d(f15883a, "base64 decode Exception" + e6.getMessage());
            return false;
        }
    }

    public static boolean n(String str, byte[] bArr, byte[] bArr2) {
        return c(str, bArr, bArr2, true);
    }
}
