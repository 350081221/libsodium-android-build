package com.huawei.hms.analytics.framework.f;

import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.framework.b.b;
import com.huawei.hms.analytics.framework.config.ICollectorConfig;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static a f8281a = new a(5);

    /* renamed from: b, reason: collision with root package name */
    private static a f8282b = new a(1);

    /* renamed from: c, reason: collision with root package name */
    private ThreadPoolExecutor f8283c;

    /* renamed from: com.huawei.hms.analytics.framework.f.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static class RunnableC0161a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private Runnable f8284a;

        public RunnableC0161a(Runnable runnable) {
            this.f8284a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Runnable runnable = this.f8284a;
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    ICollectorConfig a5 = b.a().a("_openness_config_tag");
                    if (a5 != null) {
                        a5.handlerThrowable(th);
                    }
                    HiLog.e("MissionThread", "other error :" + th.getMessage());
                }
            }
        }
    }

    private a(int i5) {
        this.f8283c = new ThreadPoolExecutor(0, i5, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(com.alipay.sdk.app.b.f3003h));
    }

    public static a a() {
        return f8281a;
    }

    public static a b() {
        return f8282b;
    }

    public final void a(Runnable runnable) {
        try {
            this.f8283c.execute(new RunnableC0161a(runnable));
        } catch (RejectedExecutionException unused) {
            HiLog.w("MissionThread", "addToQueue() Exception has happened! From rejected execution");
        }
    }
}
