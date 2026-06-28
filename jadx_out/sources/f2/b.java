package f2;

import android.os.Build;
import android.util.Base64;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16074a = "EncryptUtil";

    /* renamed from: b, reason: collision with root package name */
    private static final String f16075b = "RSA";

    /* renamed from: c, reason: collision with root package name */
    private static boolean f16076c = false;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f16077d = true;

    /* JADX WARN: Removed duplicated region for block: B:19:0x001b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.security.SecureRandom a() {
        /*
            java.lang.String r0 = "generateSecureRandomNew "
            java.lang.String r1 = "EncryptUtil"
            f2.g.b(r1, r0)
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.security.NoSuchAlgorithmException -> L12
            r2 = 26
            if (r0 < r2) goto L17
            java.security.SecureRandom r0 = l1.a.a()     // Catch: java.security.NoSuchAlgorithmException -> L12
            goto L18
        L12:
            java.lang.String r0 = "getSecureRandomBytes: NoSuchAlgorithmException"
            f2.g.d(r1, r0)
        L17:
            r0 = 0
        L18:
            r2 = 0
            if (r0 != 0) goto L24
            java.lang.String r3 = "SHA1PRNG"
            java.security.SecureRandom r0 = java.security.SecureRandom.getInstance(r3)     // Catch: java.lang.Throwable -> L22 java.security.NoSuchAlgorithmException -> L67
            goto L24
        L22:
            r3 = move-exception
            goto L43
        L24:
            org.bouncycastle.crypto.engines.AESEngine r3 = new org.bouncycastle.crypto.engines.AESEngine     // Catch: java.lang.Throwable -> L22 java.security.NoSuchAlgorithmException -> L67
            r3.<init>()     // Catch: java.lang.Throwable -> L22 java.security.NoSuchAlgorithmException -> L67
            r4 = 32
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L22 java.security.NoSuchAlgorithmException -> L67
            r0.nextBytes(r4)     // Catch: java.lang.Throwable -> L22 java.security.NoSuchAlgorithmException -> L67
            org.bouncycastle.crypto.prng.SP800SecureRandomBuilder r5 = new org.bouncycastle.crypto.prng.SP800SecureRandomBuilder     // Catch: java.lang.Throwable -> L22 java.security.NoSuchAlgorithmException -> L67
            r6 = 1
            r5.<init>(r0, r6)     // Catch: java.lang.Throwable -> L22 java.security.NoSuchAlgorithmException -> L67
            r6 = 384(0x180, float:5.38E-43)
            org.bouncycastle.crypto.prng.SP800SecureRandomBuilder r5 = r5.setEntropyBitsRequired(r6)     // Catch: java.lang.Throwable -> L22 java.security.NoSuchAlgorithmException -> L67
            r6 = 256(0x100, float:3.59E-43)
            org.bouncycastle.crypto.prng.SP800SecureRandom r0 = r5.buildCTR(r3, r6, r4, r2)     // Catch: java.lang.Throwable -> L22 java.security.NoSuchAlgorithmException -> L67
            return r0
        L43:
            boolean r4 = f2.b.f16077d
            if (r4 == 0) goto L6c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "exception : "
            r4.append(r5)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = " , you should implementation bcprov-jdk15on library"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            f2.g.d(r1, r3)
            f2.b.f16077d = r2
            goto L6c
        L67:
            java.lang.String r2 = "NoSuchAlgorithmException"
            f2.g.d(r1, r2)
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.b.a():java.security.SecureRandom");
    }

    private static byte[] b(int i5) {
        SecureRandom a5 = a();
        if (a5 == null) {
            return new byte[0];
        }
        byte[] bArr = new byte[i5];
        a5.nextBytes(bArr);
        return bArr;
    }

    public static SecureRandom c() {
        SecureRandom secureRandom;
        if (!f16076c) {
            try {
                if (Build.VERSION.SDK_INT >= 26) {
                    secureRandom = SecureRandom.getInstanceStrong();
                } else {
                    secureRandom = SecureRandom.getInstance("SHA1PRNG");
                }
                return secureRandom;
            } catch (NoSuchAlgorithmException unused) {
                g.d(f16074a, "genSecureRandom: NoSuchAlgorithmException");
                return null;
            }
        }
        return a();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x001b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] d(int r3) {
        /*
            java.lang.String r0 = "EncryptUtil"
            boolean r1 = f2.b.f16076c
            if (r1 != 0) goto L48
            byte[] r3 = new byte[r3]
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.security.NoSuchAlgorithmException -> L13
            r2 = 26
            if (r1 < r2) goto L18
            java.security.SecureRandom r1 = l1.a.a()     // Catch: java.security.NoSuchAlgorithmException -> L13
            goto L19
        L13:
            java.lang.String r1 = "getSecureRandomBytes: NoSuchAlgorithmException"
            f2.g.d(r0, r1)
        L18:
            r1 = 0
        L19:
            if (r1 != 0) goto L21
            java.lang.String r1 = "SHA1PRNG"
            java.security.SecureRandom r1 = java.security.SecureRandom.getInstance(r1)     // Catch: java.lang.Exception -> L25 java.security.NoSuchAlgorithmException -> L3f
        L21:
            r1.nextBytes(r3)     // Catch: java.lang.Exception -> L25 java.security.NoSuchAlgorithmException -> L3f
            return r3
        L25:
            r3 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getSecureRandomBytes getInstance: exception : "
            r1.append(r2)
            java.lang.String r3 = r3.getMessage()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            f2.g.d(r0, r3)
            goto L44
        L3f:
            java.lang.String r3 = "getSecureRandomBytes getInstance: NoSuchAlgorithmException"
            f2.g.d(r0, r3)
        L44:
            r3 = 0
            byte[] r3 = new byte[r3]
            return r3
        L48:
            byte[] r3 = b(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.b.d(int):byte[]");
    }

    public static String e(int i5) {
        return c.b(d(i5));
    }

    public static PrivateKey f(String str) {
        try {
            try {
                return KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(str, 0)));
            } catch (GeneralSecurityException e5) {
                g.d(f16074a, "load Key Exception:" + e5.getMessage());
                return null;
            }
        } catch (IllegalArgumentException unused) {
            g.d(f16074a, "base64 decode IllegalArgumentException");
            return null;
        } catch (Exception e6) {
            g.d(f16074a, "base64 decode Exception" + e6.getMessage());
            return null;
        }
    }

    public static RSAPublicKey g(String str) {
        try {
            try {
                return (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
            } catch (GeneralSecurityException e5) {
                g.d(f16074a, "load Key Exception:" + e5.getMessage());
                return null;
            }
        } catch (IllegalArgumentException unused) {
            g.d(f16074a, "base64 decode IllegalArgumentException");
            return null;
        } catch (Exception e6) {
            g.d(f16074a, "base64 decode Exception" + e6.getMessage());
            return null;
        }
    }

    public static boolean h() {
        return f16076c;
    }

    public static void i(boolean z4) {
        g.e(f16074a, "setBouncycastleFlag: " + z4);
        f16076c = z4;
    }
}
