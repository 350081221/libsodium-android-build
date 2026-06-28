package com.huawei.hms.framework.network.grs.h;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;
import kotlin.y1;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8507a = "b";

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f8508b = Pattern.compile("[0-9]*[a-z|A-Z]*[一-龥]*");

    public static String a(String str) {
        return a(str, "SHA-256");
    }

    private static String a(String str, String str2) {
        String str3;
        String str4;
        try {
            try {
                return a(MessageDigest.getInstance(str2).digest(str.getBytes("UTF-8")));
            } catch (NoSuchAlgorithmException unused) {
                str3 = f8507a;
                str4 = "encrypt NoSuchAlgorithmException";
                Logger.w(str3, str4);
                return null;
            }
        } catch (UnsupportedEncodingException unused2) {
            str3 = f8507a;
            str4 = "encrypt UnsupportedEncodingException";
        }
    }

    private static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b5 : bArr) {
            String hexString = Integer.toHexString(b5 & y1.f19838d);
            if (hexString.length() == 1) {
                sb.append("0");
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int i5 = 1;
        if (str.length() == 1) {
            return org.slf4j.d.ANY_MARKER;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i6 = 0; i6 < str.length(); i6++) {
            String str2 = str.charAt(i6) + "";
            if (f8508b.matcher(str2).matches()) {
                if (i5 % 2 == 0) {
                    str2 = org.slf4j.d.ANY_MARKER;
                }
                i5++;
            }
            stringBuffer.append(str2);
        }
        return stringBuffer.toString();
    }
}
