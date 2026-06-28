package com.umeng.umzid;

import android.util.Log;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static volatile ScheduledThreadPoolExecutor f13637a;

    /* renamed from: b, reason: collision with root package name */
    public static ThreadFactory f13638b = new a();

    /* loaded from: classes3.dex */
    public static class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public AtomicInteger f13639a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("ZIDThreadPoolExecutor" + this.f13639a.addAndGet(1));
            return thread;
        }
    }

    public static ScheduledThreadPoolExecutor a() {
        if (f13637a == null) {
            synchronized (c.class) {
                if (f13637a == null) {
                    f13637a = new ScheduledThreadPoolExecutor(Runtime.getRuntime().availableProcessors() * 4, f13638b);
                }
            }
        }
        return f13637a;
    }

    public static void a(Runnable runnable) {
        try {
            a().execute(runnable);
        } catch (Throwable unused) {
            Log.e("com.umeng.umzid.c", "UmengThreadPoolExecutorFactory execute exception");
        }
    }
}
