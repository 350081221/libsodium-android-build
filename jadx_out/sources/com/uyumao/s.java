package com.uyumao;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public static volatile ScheduledThreadPoolExecutor f13709a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile ExecutorService f13710b;

    /* renamed from: c, reason: collision with root package name */
    public static final ThreadFactory f13711c = new a();

    /* loaded from: classes3.dex */
    public static class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicInteger f13712a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "Azx-" + this.f13712a.incrementAndGet());
        }
    }

    /* loaded from: classes3.dex */
    public static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f13713a;

        public b(Runnable runnable) {
            this.f13713a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Runnable runnable = this.f13713a;
                if (runnable != null) {
                    runnable.run();
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    public static ScheduledThreadPoolExecutor a() {
        if (f13709a == null) {
            synchronized (s.class) {
                if (f13709a == null) {
                    f13709a = new ScheduledThreadPoolExecutor(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors(), 4)), f13711c);
                    f13709a.setKeepAliveTime(3L, TimeUnit.SECONDS);
                    f13709a.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f13709a;
    }

    public static Future<?> a(Runnable runnable) {
        try {
            if (f13710b == null) {
                synchronized (s.class) {
                    if (f13710b == null) {
                        f13710b = Executors.newSingleThreadExecutor(f13711c);
                    }
                }
            }
            return f13710b.submit(new b(runnable));
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public static void a(Runnable runnable, long j5, TimeUnit timeUnit) {
        try {
            a().schedule(runnable, j5, timeUnit);
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
