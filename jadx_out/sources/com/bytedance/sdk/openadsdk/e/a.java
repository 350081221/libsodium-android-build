package com.bytedance.sdk.openadsdk.e;

import com.bytedance.sdk.openadsdk.api.c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f4974a;

    /* renamed from: b, reason: collision with root package name */
    private volatile ExecutorService f4975b;

    /* renamed from: c, reason: collision with root package name */
    private volatile ThreadPoolExecutor f4976c;

    /* renamed from: d, reason: collision with root package name */
    private volatile ThreadPoolExecutor f4977d;

    private a() {
    }

    private ExecutorService c() {
        if (this.f4977d == null) {
            this.f4977d = new ThreadPoolExecutor(2, 5, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0130a());
        }
        return this.f4977d;
    }

    public static a a() {
        if (f4974a == null) {
            synchronized (a.class) {
                f4974a = new a();
            }
        }
        return f4974a;
    }

    private ExecutorService b() {
        if (this.f4976c == null) {
            this.f4976c = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0130a("init"));
        }
        return this.f4976c;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.e.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class ThreadFactoryC0130a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final ThreadGroup f4979a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicInteger f4980b;

        /* renamed from: c, reason: collision with root package name */
        private final String f4981c;

        ThreadFactoryC0130a() {
            this.f4980b = new AtomicInteger(1);
            this.f4979a = new ThreadGroup("csj_api");
            this.f4981c = "csj_api";
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(this.f4979a, runnable, this.f4981c + "_" + this.f4980b.getAndIncrement(), 0L);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 10) {
                thread.setPriority(10);
            }
            return thread;
        }

        ThreadFactoryC0130a(String str) {
            this.f4980b = new AtomicInteger(1);
            this.f4979a = new ThreadGroup("csj_api");
            this.f4981c = "csj_api_" + str;
        }
    }

    public void b(Runnable runnable) {
        if (runnable != null) {
            try {
                a(false).execute(runnable);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private void b(ExecutorService executorService) {
        executorService.execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.e.a.1
            @Override // java.lang.Runnable
            public void run() {
                if (a.this.f4976c != null) {
                    try {
                        a aVar = a.this;
                        aVar.a(aVar.f4976c);
                        c.b("ApiThread", "release init pool!");
                    } catch (Throwable th) {
                        c.a("ApiThread", "release mInitExecutor failed", th);
                    }
                    a.this.f4976c = null;
                }
                if (a.this.f4977d != null) {
                    try {
                        a aVar2 = a.this;
                        aVar2.a(aVar2.f4977d);
                        c.b("ApiThread", "release api pool!");
                    } catch (Throwable th2) {
                        c.a("ApiThread", "release mApiExecutor failed", th2);
                    }
                    a.this.f4977d = null;
                }
            }
        });
    }

    public void a(Runnable runnable) {
        if (runnable != null) {
            try {
                a(true).execute(runnable);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private ExecutorService a(boolean z4) {
        if (this.f4975b == null) {
            return z4 ? b() : c();
        }
        return this.f4975b;
    }

    public void a(ExecutorService executorService) {
        if (executorService != null) {
            this.f4975b = executorService;
            if (this.f4977d == null && this.f4976c == null) {
                return;
            }
            b(executorService);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ThreadPoolExecutor threadPoolExecutor) {
        threadPoolExecutor.setKeepAliveTime(1L, TimeUnit.MILLISECONDS);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        while (true) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused) {
            }
            if (threadPoolExecutor.getQueue().size() <= 0 && threadPoolExecutor.getActiveCount() == 0) {
                threadPoolExecutor.shutdown();
                return;
            }
        }
    }
}
