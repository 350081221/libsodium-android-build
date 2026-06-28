package com.zzhoujay.richtext.ext;

import android.text.TextUtils;

/* loaded from: classes3.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f15725a = "file:///android_asset/";

    /* renamed from: b, reason: collision with root package name */
    private static final String f15726b = "/";

    public static boolean a(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith(f15725a);
    }

    public static boolean b(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith(f15726b);
    }
}
