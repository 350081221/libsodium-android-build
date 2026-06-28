package com.bytedance.pangle.d;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static Executor f4321a = Executors.newCachedThreadPool(new ThreadFactory() { // from class: com.bytedance.pangle.d.e.1

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f4324a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "pangle-Fast-" + this.f4324a.getAndIncrement());
        }
    });

    /* renamed from: b, reason: collision with root package name */
    private static final Object f4322b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static Handler f4323c = null;

    public static void a(Runnable runnable) {
        f4321a.execute(runnable);
    }

    public static void b(Runnable runnable) {
        if (a().getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            a().post(runnable);
        }
    }

    public static ExecutorService a(int i5) {
        return Executors.newFixedThreadPool(i5, new ThreadFactory() { // from class: com.bytedance.pangle.d.e.2

            /* renamed from: a, reason: collision with root package name */
            private final AtomicInteger f4325a = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, "pangle-Install-" + this.f4325a.getAndIncrement());
            }
        });
    }

    private static Handler a() {
        Handler handler;
        synchronized (f4322b) {
            if (f4323c == null) {
                f4323c = new Handler(Looper.getMainLooper());
            }
            handler = f4323c;
        }
        return handler;
    }
}
