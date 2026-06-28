package com.bytedance.pangle.util;

import com.umeng.analytics.pro.cx;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f4643a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(String str) {
        return a(str.getBytes());
    }

    public static String a(byte[] bArr) {
        int length;
        if (bArr != null && bArr.length > 0) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(bArr);
                byte[] digest = messageDigest.digest();
                if (digest == null || (length = digest.length) <= 0) {
                    return null;
                }
                char[] cArr = new char[length << 1];
                int i5 = 0;
                for (byte b5 : digest) {
                    int i6 = i5 + 1;
                    char[] cArr2 = f4643a;
                    cArr[i5] = cArr2[(b5 >>> 4) & 15];
                    i5 = i6 + 1;
                    cArr[i6] = cArr2[b5 & cx.f12477m];
                }
                return new String(cArr);
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
