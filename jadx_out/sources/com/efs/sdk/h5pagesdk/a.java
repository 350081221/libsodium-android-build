package com.efs.sdk.h5pagesdk;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class a {
    private static final String TAG = "com.efs.sdk.h5pagesdk.a";

    /* renamed from: i, reason: collision with root package name */
    private static volatile ScheduledThreadPoolExecutor f6674i;

    /* renamed from: j, reason: collision with root package name */
    private static ThreadFactory f6675j = new ThreadFactory() { // from class: com.efs.sdk.h5pagesdk.a.1

        /* renamed from: k, reason: collision with root package name */
        private AtomicInteger f6676k = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("H5ThreadPoolExecutor" + this.f6676k.addAndGet(1));
            return thread;
        }
    };

    private static ScheduledThreadPoolExecutor a() {
        if (f6674i == null) {
            synchronized (a.class) {
                if (f6674i == null) {
                    f6674i = new ScheduledThreadPoolExecutor(4, f6675j);
                }
            }
        }
        return f6674i;
    }

    public static void execute(Runnable runnable) {
        try {
            a().execute(runnable);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
