package e2;

import android.text.TextUtils;
import android.util.Base64;
import f2.g;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f15913a = "SHA256WithRSA";

    /* renamed from: b, reason: collision with root package name */
    private static final String f15914b = "SHA256WithRSA/PSS";

    /* renamed from: c, reason: collision with root package name */
    private static final String f15915c = "RSASign";

    /* renamed from: d, reason: collision with root package name */
    private static final String f15916d = "UTF-8";

    /* renamed from: e, reason: collision with root package name */
    private static final String f15917e = "";

    private static String a(String str, String str2, boolean z4) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            PrivateKey f5 = f2.b.f(str2);
            if (z4) {
                return g(str, f5);
            }
            return k(str, f5);
        }
        g.d(f15915c, "sign content or key is null");
        return "";
    }

    private static String b(String str, PrivateKey privateKey, boolean z4) {
        try {
            return Base64.encodeToString(m(str.getBytes("UTF-8"), privateKey, z4), 0);
        } catch (UnsupportedEncodingException e5) {
            g.d(f15915c, "sign UnsupportedEncodingException: " + e5.getMessage());
            return "";
        }
    }

    private static boolean c(String str, String str2, String str3, boolean z4) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str2)) {
            RSAPublicKey g5 = f2.b.g(str3);
            if (z4) {
                return i(str, str2, g5);
            }
            return o(str, str2, g5);
        }
        g.d(f15915c, "content or public key or sign value is null");
        return false;
    }

    private static boolean d(String str, String str2, PublicKey publicKey, boolean z4) {
        try {
            return q(str.getBytes("UTF-8"), Base64.decode(str2, 0), publicKey, z4);
        } catch (UnsupportedEncodingException e5) {
            g.d(f15915c, "verifySign UnsupportedEncodingException: " + e5.getMessage());
            return false;
        } catch (Exception e6) {
            g.d(f15915c, "base64 decode Exception : " + e6.getMessage());
            return false;
        }
    }

    public static boolean e() {
        return true;
    }

    public static String f(String str, String str2) {
        if (!e()) {
            g.d(f15915c, "sdk version is too low");
            return "";
        }
        return a(str, str2, true);
    }

    public static String g(String str, PrivateKey privateKey) {
        if (!e()) {
            g.d(f15915c, "sdk version is too low");
            return "";
        }
        return b(str, privateKey, true);
    }

    public static boolean h(String str, String str2, String str3) {
        if (!e()) {
            g.d(f15915c, "sdk version is too low");
            return false;
        }
        return c(str, str2, str3, true);
    }

    public static boolean i(String str, String str2, PublicKey publicKey) {
        if (!e()) {
            g.d(f15915c, "sdk version is too low");
            return false;
        }
        return d(str, str2, publicKey, true);
    }

    @Deprecated
    public static String j(String str, String str2) {
        return a(str, str2, false);
    }

    @Deprecated
    public static String k(String str, PrivateKey privateKey) {
        return b(str, privateKey, false);
    }

    public static byte[] l(ByteBuffer byteBuffer, PrivateKey privateKey, boolean z4) {
        Signature signature;
        byte[] bArr = new byte[0];
        if (byteBuffer != null && privateKey != null && a.h((RSAPrivateKey) privateKey)) {
            try {
                if (z4) {
                    signature = Signature.getInstance(f15914b);
                    signature.setParameter(new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                } else {
                    signature = Signature.getInstance(f15913a);
                }
                signature.initSign(privateKey);
                signature.update(byteBuffer);
                bArr = signature.sign();
                g.e(f15915c, "result is : " + Arrays.toString(bArr));
                return bArr;
            } catch (InvalidAlgorithmParameterException e5) {
                g.d(f15915c, "sign InvalidAlgorithmParameterException: " + e5.getMessage());
                return bArr;
            } catch (InvalidKeyException e6) {
                g.d(f15915c, "sign InvalidKeyException: " + e6.getMessage());
                return bArr;
            } catch (NoSuchAlgorithmException e7) {
                g.d(f15915c, "sign NoSuchAlgorithmException: " + e7.getMessage());
                return bArr;
            } catch (SignatureException e8) {
                g.d(f15915c, "sign SignatureException: " + e8.getMessage());
                return bArr;
            } catch (Exception e9) {
                g.d(f15915c, "sign Exception: " + e9.getMessage());
                return bArr;
            }
        }
        g.d(f15915c, "content or privateKey is null , or length is too short");
        return bArr;
    }

    public static byte[] m(byte[] bArr, PrivateKey privateKey, boolean z4) {
        Signature signature;
        byte[] bArr2 = new byte[0];
        if (bArr != null && privateKey != null && a.h((RSAPrivateKey) privateKey)) {
            try {
                if (z4) {
                    signature = Signature.getInstance(f15914b);
                    signature.setParameter(new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                } else {
                    signature = Signature.getInstance(f15913a);
                }
                signature.initSign(privateKey);
                signature.update(bArr);
                return signature.sign();
            } catch (InvalidAlgorithmParameterException e5) {
                g.d(f15915c, "sign InvalidAlgorithmParameterException: " + e5.getMessage());
                return bArr2;
            } catch (InvalidKeyException e6) {
                g.d(f15915c, "sign InvalidKeyException: " + e6.getMessage());
                return bArr2;
            } catch (NoSuchAlgorithmException e7) {
                g.d(f15915c, "sign NoSuchAlgorithmException: " + e7.getMessage());
                return bArr2;
            } catch (SignatureException e8) {
                g.d(f15915c, "sign SignatureException: " + e8.getMessage());
                return bArr2;
            } catch (Exception e9) {
                g.d(f15915c, "sign Exception: " + e9.getMessage());
                return bArr2;
            }
        }
        g.d(f15915c, "content or privateKey is null , or length is too short");
        return bArr2;
    }

    @Deprecated
    public static boolean n(String str, String str2, String str3) {
        return c(str, str2, str3, false);
    }

    @Deprecated
    public static boolean o(String str, String str2, PublicKey publicKey) {
        return d(str, str2, publicKey, false);
    }

    public static boolean p(ByteBuffer byteBuffer, byte[] bArr, PublicKey publicKey, boolean z4) {
        Signature signature;
        if (byteBuffer != null && publicKey != null && bArr != null && a.i((RSAPublicKey) publicKey)) {
            try {
                if (z4) {
                    signature = Signature.getInstance(f15914b);
                    signature.setParameter(new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                } else {
                    signature = Signature.getInstance(f15913a);
                }
                signature.initVerify(publicKey);
                signature.update(byteBuffer);
                return signature.verify(bArr);
            } catch (GeneralSecurityException e5) {
                g.d(f15915c, "check sign exception: " + e5.getMessage());
                return false;
            } catch (Exception e6) {
                g.d(f15915c, "exception : " + e6.getMessage());
                return false;
            }
        }
        g.d(f15915c, "content or publicKey is null , or length is too short");
        return false;
    }

    public static boolean q(byte[] bArr, byte[] bArr2, PublicKey publicKey, boolean z4) {
        Signature signature;
        if (bArr != null && publicKey != null && bArr2 != null && a.i((RSAPublicKey) publicKey)) {
            try {
                if (z4) {
                    signature = Signature.getInstance(f15914b);
                    signature.setParameter(new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                } else {
                    signature = Signature.getInstance(f15913a);
                }
                signature.initVerify(publicKey);
                signature.update(bArr);
                return signature.verify(bArr2);
            } catch (GeneralSecurityException e5) {
                g.d(f15915c, "check sign exception: " + e5.getMessage());
                return false;
            } catch (Exception e6) {
                g.d(f15915c, "exception : " + e6.getMessage());
                return false;
            }
        }
        g.d(f15915c, "content or publicKey is null , or length is too short");
        return false;
    }
}
