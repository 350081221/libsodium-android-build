package com.efs.sdk.net.a;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f6797a = "com.efs.sdk.net.a.b";

    /* renamed from: b, reason: collision with root package name */
    private static volatile ScheduledThreadPoolExecutor f6798b;

    /* renamed from: c, reason: collision with root package name */
    private static ThreadFactory f6799c = new ThreadFactory() { // from class: com.efs.sdk.net.a.b.1

        /* renamed from: a, reason: collision with root package name */
        private AtomicInteger f6800a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("NetThreadPoolExecutor" + this.f6800a.addAndGet(1));
            return thread;
        }
    };

    private static ScheduledThreadPoolExecutor a() {
        if (f6798b == null) {
            synchronized (b.class) {
                if (f6798b == null) {
                    f6798b = new ScheduledThreadPoolExecutor(4, f6799c);
                }
            }
        }
        return f6798b;
    }

    public static void a(Runnable runnable) {
        try {
            a().execute(runnable);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
