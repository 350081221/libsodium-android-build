package com.huawei.hms.hatool;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.osmdroid.tileprovider.constants.OpenStreetMapTileProviderConstants;

/* loaded from: classes3.dex */
public class o0 {

    /* renamed from: b, reason: collision with root package name */
    public static o0 f8647b;

    /* renamed from: c, reason: collision with root package name */
    public static o0 f8648c;

    /* renamed from: d, reason: collision with root package name */
    public static o0 f8649d;

    /* renamed from: a, reason: collision with root package name */
    public ThreadPoolExecutor f8650a = new ThreadPoolExecutor(0, 1, OpenStreetMapTileProviderConstants.ONE_MINUTE, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(com.alipay.sdk.app.b.f3003h), new b());

    /* loaded from: classes3.dex */
    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public Runnable f8651a;

        public a(Runnable runnable) {
            this.f8651a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = this.f8651a;
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Exception unused) {
                    y.e("hmsSdk", "InnerTask : Exception has happened,From internal operations!");
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class b implements ThreadFactory {

        /* renamed from: d, reason: collision with root package name */
        public static final AtomicInteger f8652d = new AtomicInteger(1);

        /* renamed from: a, reason: collision with root package name */
        public final ThreadGroup f8653a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicInteger f8654b = new AtomicInteger(1);

        /* renamed from: c, reason: collision with root package name */
        public final String f8655c;

        public b() {
            SecurityManager securityManager = System.getSecurityManager();
            this.f8653a = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
            this.f8655c = "FormalHASDK-base-" + f8652d.getAndIncrement();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(this.f8653a, runnable, this.f8655c + this.f8654b.getAndIncrement(), 0L);
        }
    }

    static {
        new o0();
        new o0();
        f8647b = new o0();
        f8648c = new o0();
        f8649d = new o0();
    }

    public static o0 a() {
        return f8649d;
    }

    public static o0 b() {
        return f8648c;
    }

    public static o0 c() {
        return f8647b;
    }

    public void a(n0 n0Var) {
        try {
            this.f8650a.execute(new a(n0Var));
        } catch (RejectedExecutionException unused) {
            y.e("hmsSdk", "addToQueue() Exception has happened!Form rejected execution");
        }
    }
}
