package com.huawei.hmf.tasks.a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f8038b = new a();

    /* renamed from: c, reason: collision with root package name */
    private static final int f8039c;

    /* renamed from: d, reason: collision with root package name */
    private static final int f8040d;

    /* renamed from: e, reason: collision with root package name */
    private static final int f8041e;

    /* renamed from: a, reason: collision with root package name */
    private final Executor f8042a = new ExecutorC0157a(0);

    /* renamed from: com.huawei.hmf.tasks.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static class ExecutorC0157a implements Executor {
        private ExecutorC0157a() {
        }

        /* synthetic */ ExecutorC0157a(byte b5) {
            this();
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f8039c = availableProcessors;
        f8040d = availableProcessors + 1;
        f8041e = (availableProcessors * 2) + 1;
    }

    public static ExecutorService a() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f8040d, f8041e, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static Executor b() {
        return f8038b.f8042a;
    }
}
