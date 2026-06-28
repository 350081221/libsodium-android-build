package com.huawei.secure.android.common.util;

import android.util.Log;

/* loaded from: classes3.dex */
public class SafeString {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9044a = "SafeString";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9045b = "";

    public static String replace(String str, CharSequence charSequence, CharSequence charSequence2) {
        if (str != null && charSequence != null && charSequence2 != null) {
            try {
                return str.replace(charSequence, charSequence2);
            } catch (Exception e5) {
                Log.e(f9044a, "replace: " + e5.getMessage());
            }
        }
        return str;
    }

    public static String substring(String str, int i5) {
        if (str != null && str.length() >= i5 && i5 >= 0) {
            try {
                return str.substring(i5);
            } catch (Exception e5) {
                Log.e(f9044a, "substring exception: " + e5.getMessage());
            }
        }
        return "";
    }

    public static String substring(String str, int i5, int i6) {
        if (str != null && i5 >= 0 && i6 <= str.length() && i6 >= i5) {
            try {
                return str.substring(i5, i6);
            } catch (Exception e5) {
                Log.e(f9044a, "substring: " + e5.getMessage());
            }
        }
        return "";
    }
}
