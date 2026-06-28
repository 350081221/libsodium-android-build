package com.ss.android.socialbase.appdownloader.f;

import android.text.TextUtils;
import android.util.Base64;

/* loaded from: classes3.dex */
public class c {
    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        byte[] decode = Base64.decode(com.ss.android.socialbase.downloader.i.f.a(str), 0);
        int length = str2.length();
        StringBuilder sb = new StringBuilder();
        int i5 = 0;
        for (byte b5 : decode) {
            if (i5 >= length) {
                i5 %= length;
            }
            sb.append((char) (b5 ^ str2.charAt(i5)));
            i5++;
        }
        return sb.toString();
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new String(Base64.decode(com.ss.android.socialbase.downloader.i.f.a(str), 0));
    }
}
