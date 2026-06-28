package com.huawei.secure.android.common.util;

import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes3.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9065a = "SafeStringBuilder";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9066b = "";

    public static String a(StringBuilder sb, int i5) {
        if (!TextUtils.isEmpty(sb) && sb.length() >= i5 && i5 >= 0) {
            try {
                return sb.substring(i5);
            } catch (Exception e5) {
                Log.e(f9065a, "substring exception: " + e5.getMessage());
            }
        }
        return "";
    }

    public static String b(StringBuilder sb, int i5, int i6) {
        if (!TextUtils.isEmpty(sb) && i5 >= 0 && i6 <= sb.length() && i6 >= i5) {
            try {
                return sb.substring(i5, i6);
            } catch (Exception e5) {
                Log.e(f9065a, "substring: " + e5.getMessage());
            }
        }
        return "";
    }
}
