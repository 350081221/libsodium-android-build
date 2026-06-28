package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.q0;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class g extends q0 {

    /* renamed from: d, reason: collision with root package name */
    private static final String f18559d = "RxCachedThreadScheduler";

    /* renamed from: e, reason: collision with root package name */
    static final k f18560e;

    /* renamed from: f, reason: collision with root package name */
    private static final String f18561f = "RxCachedWorkerPoolEvictor";

    /* renamed from: g, reason: collision with root package name */
    static final k f18562g;

    /* renamed from: i, reason: collision with root package name */
    public static final long f18564i = 60;

    /* renamed from: l, reason: collision with root package name */
    static final c f18567l;

    /* renamed from: m, reason: collision with root package name */
    private static final String f18568m = "rx3.io-priority";

    /* renamed from: n, reason: collision with root package name */
    static final a f18569n;

    /* renamed from: b, reason: collision with root package name */
    final ThreadFactory f18570b;

    /* renamed from: c, reason: collision with root package name */
    final AtomicReference<a> f18571c;

    /* renamed from: k, reason: collision with root package name */
    private static final TimeUnit f18566k = TimeUnit.SECONDS;

    /* renamed from: h, reason: collision with root package name */
    private static final String f18563h = "rx3.io-keep-alive-time";

    /* renamed from: j, reason: collision with root package name */
    private static final long f18565j = Long.getLong(f18563h, 60).longValue();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final long f18572a;

        /* renamed from: b, reason: collision with root package name */
        private final ConcurrentLinkedQueue<c> f18573b;

        /* renamed from: c, reason: collision with root package name */
        final io.reactivex.rxjava3.disposables.c f18574c;

        /* renamed from: d, reason: collision with root package name */
        private final ScheduledExecutorService f18575d;

        /* renamed from: e, reason: collision with root package name */
        private final Future<?> f18576e;

        /* renamed from: f, reason: collision with root package name */
        private final ThreadFactory f18577f;

        a(long j5, TimeUnit timeUnit, ThreadFactory threadFactory) {
            long j6;
            ScheduledExecutorService scheduledExecutorService;
            ScheduledFuture<?> scheduledFuture;
            if (timeUnit != null) {
                j6 = timeUnit.toNanos(j5);
            } else {
                j6 = 0;
            }
            long j7 = j6;
            this.f18572a = j7;
            this.f18573b = new ConcurrentLinkedQueue<>();
            this.f18574c = new io.reactivex.rxjava3.disposables.c();
            this.f18577f = threadFactory;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, g.f18562g);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, j7, j7, TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorService = null;
                scheduledFuture = null;
            }
            this.f18575d = scheduledExecutorService;
            this.f18576e = scheduledFuture;
        }

        static void a(ConcurrentLinkedQueue<c> concurrentLinkedQueue, io.reactivex.rxjava3.disposables.c cVar) {
            if (!concurrentLinkedQueue.isEmpty()) {
                long c5 = c();
                Iterator<c> it = concurrentLinkedQueue.iterator();
                while (it.hasNext()) {
                    c next = it.next();
                    if (next.r() <= c5) {
                        if (concurrentLinkedQueue.remove(next)) {
                            cVar.a(next);
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        static long c() {
            return System.nanoTime();
        }

        c b() {
            if (this.f18574c.isDisposed()) {
                return g.f18567l;
            }
            while (!this.f18573b.isEmpty()) {
                c poll = this.f18573b.poll();
                if (poll != null) {
                    return poll;
                }
            }
            c cVar = new c(this.f18577f);
            this.f18574c.b(cVar);
            return cVar;
        }

        void d(c cVar) {
            cVar.s(c() + this.f18572a);
            this.f18573b.offer(cVar);
        }

        void e() {
            this.f18574c.dispose();
            Future<?> future = this.f18576e;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f18575d;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            a(this.f18573b, this.f18574c);
        }
    }

    /* loaded from: classes3.dex */
    static final class b extends q0.c {

        /* renamed from: b, reason: collision with root package name */
        private final a f18579b;

        /* renamed from: c, reason: collision with root package name */
        private final c f18580c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicBoolean f18581d = new AtomicBoolean();

        /* renamed from: a, reason: collision with root package name */
        private final io.reactivex.rxjava3.disposables.c f18578a = new io.reactivex.rxjava3.disposables.c();

        b(a aVar) {
            this.f18579b = aVar;
            this.f18580c = aVar.b();
        }

        @Override // io.reactivex.rxjava3.core.q0.c
        @l3.f
        public io.reactivex.rxjava3.disposables.e c(@l3.f Runnable runnable, long j5, @l3.f TimeUnit timeUnit) {
            if (this.f18578a.isDisposed()) {
                return io.reactivex.rxjava3.internal.disposables.d.INSTANCE;
            }
            return this.f18580c.e(runnable, j5, timeUnit, this.f18578a);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            if (this.f18581d.compareAndSet(false, true)) {
                this.f18578a.dispose();
                this.f18579b.d(this.f18580c);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f18581d.get();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class c extends i {

        /* renamed from: c, reason: collision with root package name */
        long f18582c;

        c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f18582c = 0L;
        }

        public long r() {
            return this.f18582c;
        }

        public void s(long j5) {
            this.f18582c = j5;
        }
    }

    static {
        c cVar = new c(new k("RxCachedThreadSchedulerShutdown"));
        f18567l = cVar;
        cVar.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger(f18568m, 5).intValue()));
        k kVar = new k(f18559d, max);
        f18560e = kVar;
        f18562g = new k(f18561f, max);
        a aVar = new a(0L, null, kVar);
        f18569n = aVar;
        aVar.e();
    }

    public g() {
        this(f18560e);
    }

    @Override // io.reactivex.rxjava3.core.q0
    @l3.f
    public q0.c c() {
        return new b(this.f18571c.get());
    }

    @Override // io.reactivex.rxjava3.core.q0
    public void q() {
        AtomicReference<a> atomicReference = this.f18571c;
        a aVar = f18569n;
        a andSet = atomicReference.getAndSet(aVar);
        if (andSet != aVar) {
            andSet.e();
        }
    }

    @Override // io.reactivex.rxjava3.core.q0
    public void r() {
        a aVar = new a(f18565j, f18566k, this.f18570b);
        if (!androidx.compose.animation.core.h.a(this.f18571c, f18569n, aVar)) {
            aVar.e();
        }
    }

    public int t() {
        return this.f18571c.get().f18574c.o();
    }

    public g(ThreadFactory threadFactory) {
        this.f18570b = threadFactory;
        this.f18571c = new AtomicReference<>(f18569n);
        r();
    }
}
