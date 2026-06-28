package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.q0;
import io.reactivex.rxjava3.internal.schedulers.o;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class b extends q0 implements o {

    /* renamed from: d, reason: collision with root package name */
    static final C0528b f18516d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f18517e = "RxComputationThreadPool";

    /* renamed from: f, reason: collision with root package name */
    static final k f18518f;

    /* renamed from: g, reason: collision with root package name */
    static final String f18519g = "rx3.computation-threads";

    /* renamed from: h, reason: collision with root package name */
    static final int f18520h = t(Runtime.getRuntime().availableProcessors(), Integer.getInteger(f18519g, 0).intValue());

    /* renamed from: i, reason: collision with root package name */
    static final c f18521i;

    /* renamed from: j, reason: collision with root package name */
    private static final String f18522j = "rx3.computation-priority";

    /* renamed from: b, reason: collision with root package name */
    final ThreadFactory f18523b;

    /* renamed from: c, reason: collision with root package name */
    final AtomicReference<C0528b> f18524c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends q0.c {

        /* renamed from: a, reason: collision with root package name */
        private final io.reactivex.rxjava3.internal.disposables.e f18525a;

        /* renamed from: b, reason: collision with root package name */
        private final io.reactivex.rxjava3.disposables.c f18526b;

        /* renamed from: c, reason: collision with root package name */
        private final io.reactivex.rxjava3.internal.disposables.e f18527c;

        /* renamed from: d, reason: collision with root package name */
        private final c f18528d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f18529e;

        a(c cVar) {
            this.f18528d = cVar;
            io.reactivex.rxjava3.internal.disposables.e eVar = new io.reactivex.rxjava3.internal.disposables.e();
            this.f18525a = eVar;
            io.reactivex.rxjava3.disposables.c cVar2 = new io.reactivex.rxjava3.disposables.c();
            this.f18526b = cVar2;
            io.reactivex.rxjava3.internal.disposables.e eVar2 = new io.reactivex.rxjava3.internal.disposables.e();
            this.f18527c = eVar2;
            eVar2.b(eVar);
            eVar2.b(cVar2);
        }

        @Override // io.reactivex.rxjava3.core.q0.c
        @l3.f
        public io.reactivex.rxjava3.disposables.e b(@l3.f Runnable runnable) {
            if (this.f18529e) {
                return io.reactivex.rxjava3.internal.disposables.d.INSTANCE;
            }
            return this.f18528d.e(runnable, 0L, TimeUnit.MILLISECONDS, this.f18525a);
        }

        @Override // io.reactivex.rxjava3.core.q0.c
        @l3.f
        public io.reactivex.rxjava3.disposables.e c(@l3.f Runnable runnable, long j5, @l3.f TimeUnit timeUnit) {
            if (this.f18529e) {
                return io.reactivex.rxjava3.internal.disposables.d.INSTANCE;
            }
            return this.f18528d.e(runnable, j5, timeUnit, this.f18526b);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            if (!this.f18529e) {
                this.f18529e = true;
                this.f18527c.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f18529e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.reactivex.rxjava3.internal.schedulers.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0528b implements o {

        /* renamed from: a, reason: collision with root package name */
        final int f18530a;

        /* renamed from: b, reason: collision with root package name */
        final c[] f18531b;

        /* renamed from: c, reason: collision with root package name */
        long f18532c;

        C0528b(int i5, ThreadFactory threadFactory) {
            this.f18530a = i5;
            this.f18531b = new c[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                this.f18531b[i6] = new c(threadFactory);
            }
        }

        @Override // io.reactivex.rxjava3.internal.schedulers.o
        public void a(int i5, o.a aVar) {
            int i6 = this.f18530a;
            if (i6 == 0) {
                for (int i7 = 0; i7 < i5; i7++) {
                    aVar.a(i7, b.f18521i);
                }
                return;
            }
            int i8 = ((int) this.f18532c) % i6;
            for (int i9 = 0; i9 < i5; i9++) {
                aVar.a(i9, new a(this.f18531b[i8]));
                i8++;
                if (i8 == i6) {
                    i8 = 0;
                }
            }
            this.f18532c = i8;
        }

        public c b() {
            int i5 = this.f18530a;
            if (i5 == 0) {
                return b.f18521i;
            }
            c[] cVarArr = this.f18531b;
            long j5 = this.f18532c;
            this.f18532c = 1 + j5;
            return cVarArr[(int) (j5 % i5)];
        }

        public void c() {
            for (c cVar : this.f18531b) {
                cVar.dispose();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class c extends i {
        c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        c cVar = new c(new k("RxComputationShutdown"));
        f18521i = cVar;
        cVar.dispose();
        k kVar = new k(f18517e, Math.max(1, Math.min(10, Integer.getInteger(f18522j, 5).intValue())), true);
        f18518f = kVar;
        C0528b c0528b = new C0528b(0, kVar);
        f18516d = c0528b;
        c0528b.c();
    }

    public b() {
        this(f18518f);
    }

    static int t(int i5, int i6) {
        return (i6 <= 0 || i6 > i5) ? i5 : i6;
    }

    @Override // io.reactivex.rxjava3.internal.schedulers.o
    public void a(int i5, o.a aVar) {
        io.reactivex.rxjava3.internal.functions.b.b(i5, "number > 0 required");
        this.f18524c.get().a(i5, aVar);
    }

    @Override // io.reactivex.rxjava3.core.q0
    @l3.f
    public q0.c c() {
        return new a(this.f18524c.get().b());
    }

    @Override // io.reactivex.rxjava3.core.q0
    @l3.f
    public io.reactivex.rxjava3.disposables.e g(@l3.f Runnable runnable, long j5, TimeUnit timeUnit) {
        return this.f18524c.get().b().g(runnable, j5, timeUnit);
    }

    @Override // io.reactivex.rxjava3.core.q0
    @l3.f
    public io.reactivex.rxjava3.disposables.e o(@l3.f Runnable runnable, long j5, long j6, TimeUnit timeUnit) {
        return this.f18524c.get().b().o(runnable, j5, j6, timeUnit);
    }

    @Override // io.reactivex.rxjava3.core.q0
    public void q() {
        AtomicReference<C0528b> atomicReference = this.f18524c;
        C0528b c0528b = f18516d;
        C0528b andSet = atomicReference.getAndSet(c0528b);
        if (andSet != c0528b) {
            andSet.c();
        }
    }

    @Override // io.reactivex.rxjava3.core.q0
    public void r() {
        C0528b c0528b = new C0528b(f18520h, this.f18523b);
        if (!androidx.compose.animation.core.h.a(this.f18524c, f18516d, c0528b)) {
            c0528b.c();
        }
    }

    public b(ThreadFactory threadFactory) {
        this.f18523b = threadFactory;
        this.f18524c = new AtomicReference<>(f18516d);
        r();
    }
}
