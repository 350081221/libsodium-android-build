package com.huawei.secure.android.common.util;

import android.util.Log;

/* loaded from: classes3.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9063a = "SafeStringBuffer";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9064b = "";

    public static String a(StringBuffer stringBuffer, int i5) {
        if (stringBuffer != null && stringBuffer.length() >= i5 && i5 >= 0) {
            try {
                return stringBuffer.substring(i5);
            } catch (Exception e5) {
                Log.e(f9063a, "substring exception: " + e5.getMessage());
            }
        }
        return "";
    }

    public static String b(StringBuffer stringBuffer, int i5, int i6) {
        if (stringBuffer != null && i5 >= 0 && i6 <= stringBuffer.length() && i6 >= i5) {
            try {
                return stringBuffer.substring(i5, i6);
            } catch (Exception e5) {
                Log.e(f9063a, "substring: " + e5.getMessage());
            }
        }
        return "";
    }
}
