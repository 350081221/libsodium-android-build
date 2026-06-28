package com.efs.sdk.launch;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f6691a = "com.efs.sdk.launch.a";

    /* renamed from: b, reason: collision with root package name */
    private static volatile ScheduledThreadPoolExecutor f6692b;

    /* renamed from: c, reason: collision with root package name */
    private static ThreadFactory f6693c = new ThreadFactory() { // from class: com.efs.sdk.launch.a.1

        /* renamed from: a, reason: collision with root package name */
        private AtomicInteger f6694a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("LaunchThreadPoolExecutor" + this.f6694a.addAndGet(1));
            return thread;
        }
    };

    private static ScheduledThreadPoolExecutor a() {
        if (f6692b == null) {
            synchronized (a.class) {
                if (f6692b == null) {
                    f6692b = new ScheduledThreadPoolExecutor(4, f6693c);
                }
            }
        }
        return f6692b;
    }

    public static void a(Runnable runnable) {
        try {
            a().execute(runnable);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
