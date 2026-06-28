package com.bytedance.pangle.download;

import android.os.Handler;
import android.os.Looper;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: e, reason: collision with root package name */
    private static volatile b f4331e;

    /* renamed from: a, reason: collision with root package name */
    final Map<String, Long> f4332a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Handler f4333b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, Runnable> f4334c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    final Map<String, Runnable> f4335d = new ConcurrentHashMap();

    private b() {
    }

    public static b a() {
        if (f4331e == null) {
            synchronized (b.class) {
                if (f4331e == null) {
                    f4331e = new b();
                }
            }
        }
        return f4331e;
    }
}
