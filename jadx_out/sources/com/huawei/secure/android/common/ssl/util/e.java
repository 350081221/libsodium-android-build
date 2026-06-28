package com.huawei.secure.android.common.ssl.util;

import android.content.Context;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static Context f9026a;

    public static Context a() {
        return f9026a;
    }

    public static void b(Context context) {
        if (context != null && f9026a == null) {
            f9026a = context.getApplicationContext();
        }
    }
}
