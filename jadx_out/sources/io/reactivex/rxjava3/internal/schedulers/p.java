package io.reactivex.rxjava3.internal.schedulers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    static final String f18589a = "rx3.purge-enabled";

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f18590b;

    /* renamed from: c, reason: collision with root package name */
    static final String f18591c = "rx3.purge-period-seconds";

    /* renamed from: d, reason: collision with root package name */
    public static final int f18592d;

    /* renamed from: e, reason: collision with root package name */
    static final AtomicReference<ScheduledExecutorService> f18593e = new AtomicReference<>();

    /* renamed from: f, reason: collision with root package name */
    static final Map<ScheduledThreadPoolExecutor, Object> f18594f = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = new ArrayList(p.f18594f.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    p.f18594f.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class b implements m3.o<String, String> {
        b() {
        }

        @Override // m3.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String apply(String str) {
            return System.getProperty(str);
        }
    }

    static {
        b bVar = new b();
        boolean b5 = b(true, f18589a, true, true, bVar);
        f18590b = b5;
        f18592d = c(b5, f18591c, 1, 1, bVar);
        e();
    }

    private p() {
        throw new IllegalStateException("No instances!");
    }

    public static ScheduledExecutorService a(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        f(f18590b, newScheduledThreadPool);
        return newScheduledThreadPool;
    }

    static boolean b(boolean z4, String str, boolean z5, boolean z6, m3.o<String, String> oVar) {
        if (z4) {
            try {
                String apply = oVar.apply(str);
                if (apply == null) {
                    return z5;
                }
                return "true".equals(apply);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                return z5;
            }
        }
        return z6;
    }

    static int c(boolean z4, String str, int i5, int i6, m3.o<String, String> oVar) {
        if (z4) {
            try {
                String apply = oVar.apply(str);
                if (apply == null) {
                    return i5;
                }
                return Integer.parseInt(apply);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                return i5;
            }
        }
        return i6;
    }

    public static void d() {
        ScheduledExecutorService andSet = f18593e.getAndSet(null);
        if (andSet != null) {
            andSet.shutdownNow();
        }
        f18594f.clear();
    }

    public static void e() {
        g(f18590b);
    }

    static void f(boolean z4, ScheduledExecutorService scheduledExecutorService) {
        if (z4 && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            f18594f.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }

    static void g(boolean z4) {
        if (!z4) {
            return;
        }
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = f18593e;
            ScheduledExecutorService scheduledExecutorService = atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new k("RxSchedulerPurge"));
            if (androidx.compose.animation.core.h.a(atomicReference, scheduledExecutorService, newScheduledThreadPool)) {
                a aVar = new a();
                int i5 = f18592d;
                newScheduledThreadPool.scheduleAtFixedRate(aVar, i5, i5, TimeUnit.SECONDS);
                return;
            }
            newScheduledThreadPool.shutdownNow();
        }
    }
}
