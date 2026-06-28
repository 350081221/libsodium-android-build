package com.umeng.analytics.pro;

import com.umeng.commonsdk.debug.UMRTLog;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class as {

    /* renamed from: a, reason: collision with root package name */
    private static final String f12189a = "UMExecutor";

    /* renamed from: b, reason: collision with root package name */
    private static volatile ScheduledThreadPoolExecutor f12190b;

    /* renamed from: c, reason: collision with root package name */
    private static final ThreadFactory f12191c = new ThreadFactory() { // from class: com.umeng.analytics.pro.as.1

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f12192a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ccg-" + this.f12192a.incrementAndGet());
        }
    };

    private static ScheduledThreadPoolExecutor a() {
        if (f12190b == null) {
            synchronized (as.class) {
                if (f12190b == null) {
                    f12190b = new ScheduledThreadPoolExecutor(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors(), 4)), f12191c);
                    f12190b.setKeepAliveTime(3L, TimeUnit.SECONDS);
                    f12190b.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f12190b;
    }

    public static void a(Runnable runnable, long j5, TimeUnit timeUnit) {
        try {
            a().schedule(runnable, j5, timeUnit);
        } catch (Throwable th) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "schedule error:" + th.getMessage());
        }
    }
}
