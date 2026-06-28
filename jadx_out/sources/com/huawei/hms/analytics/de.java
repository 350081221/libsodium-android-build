package com.huawei.hms.analytics;

import android.text.TextUtils;
import com.huawei.hms.analytics.core.log.HiLog;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.y1;

/* loaded from: classes3.dex */
public final class de {
    private static final String[] lmn = {"SHA-256", "SHA-384", "SHA-512"};

    public static String lmn(String str) {
        return lmn(str, "SHA-256");
    }

    private static String lmn(String str, String str2) {
        boolean z4;
        String str3;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            HiLog.e("SHA", "content or algorithm is null.");
            return "";
        }
        String[] strArr = lmn;
        int length = strArr.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                z4 = false;
                break;
            }
            if (strArr[i5].equals(str2)) {
                z4 = true;
                break;
            }
            i5++;
        }
        if (z4) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str2);
                messageDigest.update(str.getBytes("UTF-8"));
                byte[] digest = messageDigest.digest();
                if (digest == null || digest.length == 0) {
                    return "";
                }
                StringBuilder sb = new StringBuilder();
                for (byte b5 : digest) {
                    String hexString = Integer.toHexString(b5 & y1.f19838d);
                    if (hexString.length() == 1) {
                        sb.append('0');
                    }
                    sb.append(hexString);
                }
                return sb.toString();
            } catch (UnsupportedEncodingException unused) {
                str3 = "Error in generate SHA UnsupportedEncodingException";
            } catch (NoSuchAlgorithmException unused2) {
                str3 = "Error in generate SHA NoSuchAlgorithmException";
            }
        } else {
            str3 = "algorithm is not safe or legal";
        }
        HiLog.e("SHA", str3);
        return "";
    }
}
