package b2;

import android.text.TextUtils;
import f2.g;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f637a = "HMACSHA256";

    /* renamed from: b, reason: collision with root package name */
    private static final String f638b = "HmacSHA256";

    /* renamed from: c, reason: collision with root package name */
    private static final String f639c = "";

    /* renamed from: d, reason: collision with root package name */
    private static final int f640d = 32;

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null) {
            if (bArr2.length < 32) {
                g.d(f637a, "hmac key length is not right");
                return new byte[0];
            }
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, f638b);
                Mac mac = Mac.getInstance(secretKeySpec.getAlgorithm());
                mac.init(secretKeySpec);
                return mac.doFinal(bArr);
            } catch (InvalidKeyException | NoSuchAlgorithmException e5) {
                g.d(f637a, "hmacsha256 encrypt exception" + e5.getMessage());
                return new byte[0];
            }
        }
        g.d(f637a, "content or key is null.");
        return new byte[0];
    }

    public static String b(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return c(str, f2.c.c(str2));
        }
        return "";
    }

    public static String c(String str, byte[] bArr) {
        byte[] bArr2;
        if (TextUtils.isEmpty(str) || bArr == null) {
            return "";
        }
        if (bArr.length < 32) {
            g.d(f637a, "hmac key length is not right");
            return "";
        }
        try {
            bArr2 = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e5) {
            g.d(f637a, "hmacsha256 encrypt exception" + e5.getMessage());
            bArr2 = new byte[0];
        }
        return f2.c.b(a(bArr2, bArr));
    }
}
