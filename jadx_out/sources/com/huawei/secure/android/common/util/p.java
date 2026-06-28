package com.huawei.secure.android.common.util;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private static Handler f9085a = new Handler(Looper.getMainLooper());

    public static void a(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        f9085a.post(runnable);
    }
}
