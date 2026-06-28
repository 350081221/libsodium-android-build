package com.huawei.agconnect.credential.obs;

import android.text.TextUtils;
import com.huawei.agconnect.common.api.Logger;
import com.umeng.analytics.pro.cx;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes3.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final String f7858a = "SHA-256";

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f7859b = "0123456789ABCDEF".toCharArray();

    f() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str2)) {
                str2 = f7858a;
            }
            MessageDigest messageDigest = MessageDigest.getInstance(str2);
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            return b(messageDigest.digest());
        } catch (NoSuchAlgorithmException e5) {
            Logger.e("", "", e5);
            return null;
        }
    }

    static byte[] a(String str) {
        return a(str.getBytes(Charset.defaultCharset()));
    }

    static byte[] a(byte[] bArr) {
        try {
            return MessageDigest.getInstance(f7858a).digest(bArr);
        } catch (NoSuchAlgorithmException unused) {
            throw new RuntimeException("encrypt failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b5 : bArr) {
            char[] cArr = f7859b;
            sb.append(cArr[(b5 >> 4) & 15]);
            sb.append(cArr[b5 & cx.f12477m]);
        }
        return sb.toString();
    }
}
