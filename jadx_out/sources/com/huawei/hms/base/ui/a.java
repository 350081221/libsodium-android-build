package com.huawei.hms.base.ui;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f8362a = Pattern.compile("[0-9]*[a-z|A-Z]*[一-龥]*");

    public static void a(String str, String str2, boolean z4) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.e(str, a(str2, z4));
    }

    public static void a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.e(str, a(str2, false));
    }

    public static String a(String str, boolean z4) {
        StringBuilder sb = new StringBuilder(512);
        if (!TextUtils.isEmpty(str)) {
            if (z4) {
                sb.append(a(str));
            } else {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i5 = 1;
        if (1 == length) {
            return String.valueOf('*');
        }
        StringBuilder sb = new StringBuilder(length);
        for (int i6 = 0; i6 < length; i6++) {
            char charAt = str.charAt(i6);
            if (f8362a.matcher(String.valueOf(charAt)).matches()) {
                if (i5 % 2 == 0) {
                    charAt = '*';
                }
                i5++;
            }
            sb.append(charAt);
        }
        return sb.toString();
    }
}
