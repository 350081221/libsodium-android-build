package e1;

import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class b {
    public static String a(String str) {
        try {
            if (f1.a.c(str)) {
                return null;
            }
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes("UTF-8"));
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b5 : digest) {
                sb.append(String.format("%02x", Byte.valueOf(b5)));
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }
}
