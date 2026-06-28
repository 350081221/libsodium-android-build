package com.huawei.secure.android.common.detect;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8863a = "ProxyDetect";

    public static boolean a(Context context) {
        int i5;
        String str = null;
        try {
            str = System.getProperty("http.proxyHost");
            String property = System.getProperty("http.proxyPort");
            if (property == null) {
                property = "-1";
            }
            i5 = Integer.parseInt(property);
        } catch (SecurityException e5) {
            z1.c.d(f8863a, "message : " + e5.getMessage());
            i5 = 0;
        }
        if (TextUtils.isEmpty(str) || i5 == -1) {
            return false;
        }
        return true;
    }
}
