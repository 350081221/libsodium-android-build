package com.huawei.hms.hatool;

import android.util.Pair;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f8527a = Charset.forName("UTF-8");

    public static Pair<byte[], String> a(String str) {
        if (str == null || str.length() < 32) {
            return new Pair<>(new byte[0], str);
        }
        String substring = str.substring(0, 32);
        return new Pair<>(f2.c.c(substring), str.substring(32));
    }

    public static String a(String str, String str2) {
        Pair<byte[], String> a5 = a(str);
        return new String(com.huawei.secure.android.common.encrypt.aes.a.p(f2.c.c((String) a5.second), f2.c.c(str2), (byte[]) a5.first), f8527a);
    }

    public static String a(byte[] bArr, String str) {
        String str2;
        if (bArr == null || bArr.length == 0 || str == null) {
            str2 = "cbc encrypt(byte) param is not right";
        } else {
            byte[] c5 = f2.c.c(str);
            if (c5.length >= 16) {
                return f2.c.b(com.huawei.secure.android.common.encrypt.aes.a.x(bArr, c5));
            }
            str2 = "key length is not right";
        }
        y.b("AesCipher", str2);
        return "";
    }

    public static String b(String str, String str2) {
        return f2.c.b(com.huawei.secure.android.common.encrypt.aes.a.x(str.getBytes(f8527a), f2.c.c(str2)));
    }
}
