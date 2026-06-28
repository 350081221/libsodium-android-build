package l0;

import com.umeng.analytics.pro.cx;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okio.q1;

/* loaded from: classes2.dex */
public class a {
    public static String a(String str) {
        byte[] bArr;
        try {
            bArr = f(d(), str.getBytes());
        } catch (Exception unused) {
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return b(bArr);
    }

    public static String b(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (byte b5 : bArr) {
            c(stringBuffer, b5);
        }
        return stringBuffer.toString();
    }

    public static void c(StringBuffer stringBuffer, byte b5) {
        stringBuffer.append("0123456789ABCDEF".charAt((b5 >> 4) & 15));
        stringBuffer.append("0123456789ABCDEF".charAt(b5 & cx.f12477m));
    }

    public static byte[] d() throws Exception {
        return e.b(new byte[]{33, 83, -50, -89, -84, -114, 80, 99, 10, q1.f21021a, 22, -65, -11, 30, 101, -118});
    }

    public static byte[] e(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = i5 * 2;
            bArr[i5] = Integer.valueOf(str.substring(i6, i6 + 2), 16).byteValue();
        }
        return bArr;
    }

    public static byte[] f(byte[] bArr, byte[] bArr2) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, new IvParameterSpec(h()));
        return cipher.doFinal(bArr2);
    }

    public static String g(String str) {
        try {
            return new String(i(d(), e(str)));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] h() {
        try {
            byte[] a5 = b.a("IUQSvE6r1TfFPdPEjfklLw==".getBytes("UTF-8"), 2);
            if (a5 != null) {
                return e.b(a5);
            }
        } catch (Exception unused) {
        }
        return new byte[16];
    }

    public static byte[] i(byte[] bArr, byte[] bArr2) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, secretKeySpec, new IvParameterSpec(h()));
        return cipher.doFinal(bArr2);
    }
}
