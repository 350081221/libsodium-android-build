package com.yuanqi.group.abs.ui;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final org.jdeferred.android.b f13743a = new org.jdeferred.android.b();

    /* renamed from: b, reason: collision with root package name */
    private static final Handler f13744b = new Handler(Looper.getMainLooper());

    public static org.jdeferred.android.b a() {
        return f13743a;
    }

    public static int b(Context context, int i5) {
        return (int) TypedValue.applyDimension(1, i5, context.getResources().getDisplayMetrics());
    }

    public static void c(Runnable runnable) {
        f13744b.post(runnable);
    }

    public static void d(long j5, Runnable runnable) {
        f13744b.postDelayed(runnable, j5);
    }

    public static void e(long j5) {
        try {
            Thread.sleep(j5);
        } catch (InterruptedException e5) {
            e5.printStackTrace();
        }
    }
}
