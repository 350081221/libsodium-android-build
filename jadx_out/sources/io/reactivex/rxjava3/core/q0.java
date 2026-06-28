package io.reactivex.rxjava3.core;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    static final long f16226a = TimeUnit.MINUTES.toNanos(Long.getLong("rx3.scheduler.drift-tolerance", 15).longValue());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a implements io.reactivex.rxjava3.disposables.e, Runnable, io.reactivex.rxjava3.schedulers.a {

        /* renamed from: a, reason: collision with root package name */
        @l3.f
        final Runnable f16227a;

        /* renamed from: b, reason: collision with root package name */
        @l3.f
        final c f16228b;

        /* renamed from: c, reason: collision with root package name */
        @l3.g
        Thread f16229c;

        a(@l3.f Runnable runnable, @l3.f c cVar) {
            this.f16227a = runnable;
            this.f16228b = cVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            if (this.f16229c == Thread.currentThread()) {
                c cVar = this.f16228b;
                if (cVar instanceof io.reactivex.rxjava3.internal.schedulers.i) {
                    ((io.reactivex.rxjava3.internal.schedulers.i) cVar).q();
                    return;
                }
            }
            this.f16228b.dispose();
        }

        @Override // io.reactivex.rxjava3.schedulers.a
        public Runnable getWrappedRunnable() {
            return this.f16227a;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f16228b.isDisposed();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f16229c = Thread.currentThread();
            try {
                this.f16227a.run();
            } finally {
                dispose();
                this.f16229c = null;
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class b implements io.reactivex.rxjava3.disposables.e, Runnable, io.reactivex.rxjava3.schedulers.a {

        /* renamed from: a, reason: collision with root package name */
        @l3.f
        final Runnable f16230a;

        /* renamed from: b, reason: collision with root package name */
        @l3.f
        final c f16231b;

        /* renamed from: c, reason: collision with root package name */
        volatile boolean f16232c;

        b(@l3.f Runnable runnable, @l3.f c cVar) {
            this.f16230a = runnable;
            this.f16231b = cVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f16232c = true;
            this.f16231b.dispose();
        }

        @Override // io.reactivex.rxjava3.schedulers.a
        public Runnable getWrappedRunnable() {
            return this.f16230a;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f16232c;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f16232c) {
                try {
                    this.f16230a.run();
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    this.f16231b.dispose();
                    throw io.reactivex.rxjava3.internal.util.k.i(th);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class c implements io.reactivex.rxjava3.disposables.e {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public final class a implements Runnable, io.reactivex.rxjava3.schedulers.a {

            /* renamed from: a, reason: collision with root package name */
            @l3.f
            final Runnable f16233a;

            /* renamed from: b, reason: collision with root package name */
            @l3.f
            final io.reactivex.rxjava3.internal.disposables.f f16234b;

            /* renamed from: c, reason: collision with root package name */
            final long f16235c;

            /* renamed from: d, reason: collision with root package name */
            long f16236d;

            /* renamed from: e, reason: collision with root package name */
            long f16237e;

            /* renamed from: f, reason: collision with root package name */
            long f16238f;

            a(long j5, @l3.f Runnable runnable, long j6, @l3.f io.reactivex.rxjava3.internal.disposables.f fVar, long j7) {
                this.f16233a = runnable;
                this.f16234b = fVar;
                this.f16235c = j7;
                this.f16237e = j6;
                this.f16238f = j5;
            }

            @Override // io.reactivex.rxjava3.schedulers.a
            public Runnable getWrappedRunnable() {
                return this.f16233a;
            }

            @Override // java.lang.Runnable
            public void run() {
                long j5;
                this.f16233a.run();
                if (!this.f16234b.isDisposed()) {
                    c cVar = c.this;
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    long a5 = cVar.a(timeUnit);
                    long j6 = q0.f16226a;
                    long j7 = a5 + j6;
                    long j8 = this.f16237e;
                    if (j7 >= j8) {
                        long j9 = this.f16235c;
                        if (a5 < j8 + j9 + j6) {
                            long j10 = this.f16238f;
                            long j11 = this.f16236d + 1;
                            this.f16236d = j11;
                            j5 = j10 + (j11 * j9);
                            this.f16237e = a5;
                            this.f16234b.replace(c.this.c(this, j5 - a5, timeUnit));
                        }
                    }
                    long j12 = this.f16235c;
                    long j13 = a5 + j12;
                    long j14 = this.f16236d + 1;
                    this.f16236d = j14;
                    this.f16238f = j13 - (j12 * j14);
                    j5 = j13;
                    this.f16237e = a5;
                    this.f16234b.replace(c.this.c(this, j5 - a5, timeUnit));
                }
            }
        }

        public long a(@l3.f TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @l3.f
        public io.reactivex.rxjava3.disposables.e b(@l3.f Runnable runnable) {
            return c(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        @l3.f
        public abstract io.reactivex.rxjava3.disposables.e c(@l3.f Runnable runnable, long j5, @l3.f TimeUnit timeUnit);

        @l3.f
        public io.reactivex.rxjava3.disposables.e d(@l3.f Runnable runnable, long j5, long j6, @l3.f TimeUnit timeUnit) {
            io.reactivex.rxjava3.internal.disposables.f fVar = new io.reactivex.rxjava3.internal.disposables.f();
            io.reactivex.rxjava3.internal.disposables.f fVar2 = new io.reactivex.rxjava3.internal.disposables.f(fVar);
            Runnable b02 = io.reactivex.rxjava3.plugins.a.b0(runnable);
            long nanos = timeUnit.toNanos(j6);
            long a5 = a(TimeUnit.NANOSECONDS);
            io.reactivex.rxjava3.disposables.e c5 = c(new a(a5 + timeUnit.toNanos(j5), b02, a5, fVar2, nanos), j5, timeUnit);
            if (c5 == io.reactivex.rxjava3.internal.disposables.d.INSTANCE) {
                return c5;
            }
            fVar.replace(c5);
            return fVar2;
        }
    }

    public static long b() {
        return f16226a;
    }

    @l3.f
    public abstract c c();

    public long d(@l3.f TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @l3.f
    public io.reactivex.rxjava3.disposables.e e(@l3.f Runnable runnable) {
        return g(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    @l3.f
    public io.reactivex.rxjava3.disposables.e g(@l3.f Runnable runnable, long j5, @l3.f TimeUnit timeUnit) {
        c c5 = c();
        a aVar = new a(io.reactivex.rxjava3.plugins.a.b0(runnable), c5);
        c5.c(aVar, j5, timeUnit);
        return aVar;
    }

    @l3.f
    public io.reactivex.rxjava3.disposables.e o(@l3.f Runnable runnable, long j5, long j6, @l3.f TimeUnit timeUnit) {
        c c5 = c();
        b bVar = new b(io.reactivex.rxjava3.plugins.a.b0(runnable), c5);
        io.reactivex.rxjava3.disposables.e d5 = c5.d(bVar, j5, j6, timeUnit);
        if (d5 == io.reactivex.rxjava3.internal.disposables.d.INSTANCE) {
            return d5;
        }
        return bVar;
    }

    public void q() {
    }

    public void r() {
    }

    @l3.f
    public <S extends q0 & io.reactivex.rxjava3.disposables.e> S s(@l3.f m3.o<o<o<io.reactivex.rxjava3.core.c>>, io.reactivex.rxjava3.core.c> oVar) {
        Objects.requireNonNull(oVar, "combine is null");
        return new io.reactivex.rxjava3.internal.schedulers.q(oVar, this);
    }
}
