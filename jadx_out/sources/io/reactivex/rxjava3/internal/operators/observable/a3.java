package io.reactivex.rxjava3.internal.operators.observable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class a3<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f17536b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f17537c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f17538d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f17539e;

    /* loaded from: classes3.dex */
    static final class a<T> extends c<T> {
        private static final long serialVersionUID = -7139995637533111443L;
        final AtomicInteger wip;

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var) {
            super(p0Var, j5, timeUnit, q0Var);
            this.wip = new AtomicInteger(1);
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.a3.c
        void complete() {
            emit();
            if (this.wip.decrementAndGet() == 0) {
                this.downstream.onComplete();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.wip.incrementAndGet() == 2) {
                emit();
                if (this.wip.decrementAndGet() == 0) {
                    this.downstream.onComplete();
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T> extends c<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        b(io.reactivex.rxjava3.core.p0<? super T> p0Var, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var) {
            super(p0Var, j5, timeUnit, q0Var);
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.a3.c
        void complete() {
            this.downstream.onComplete();
        }

        @Override // java.lang.Runnable
        public void run() {
            emit();
        }
    }

    /* loaded from: classes3.dex */
    static abstract class c<T> extends AtomicReference<T> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;
        final io.reactivex.rxjava3.core.p0<? super T> downstream;
        final long period;
        final io.reactivex.rxjava3.core.q0 scheduler;
        final AtomicReference<io.reactivex.rxjava3.disposables.e> timer = new AtomicReference<>();
        final TimeUnit unit;
        io.reactivex.rxjava3.disposables.e upstream;

        c(io.reactivex.rxjava3.core.p0<? super T> p0Var, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var) {
            this.downstream = p0Var;
            this.period = j5;
            this.unit = timeUnit;
            this.scheduler = q0Var;
        }

        void cancelTimer() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.timer);
        }

        abstract void complete();

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            cancelTimer();
            this.upstream.dispose();
        }

        void emit() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.downstream.onNext(andSet);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            cancelTimer();
            complete();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            cancelTimer();
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            lazySet(t5);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.upstream, eVar)) {
                this.upstream = eVar;
                this.downstream.onSubscribe(this);
                io.reactivex.rxjava3.core.q0 q0Var = this.scheduler;
                long j5 = this.period;
                io.reactivex.rxjava3.internal.disposables.c.replace(this.timer, q0Var.o(this, j5, j5, this.unit));
            }
        }
    }

    public a3(io.reactivex.rxjava3.core.n0<T> n0Var, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, boolean z4) {
        super(n0Var);
        this.f17536b = j5;
        this.f17537c = timeUnit;
        this.f17538d = q0Var;
        this.f17539e = z4;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        io.reactivex.rxjava3.observers.m mVar = new io.reactivex.rxjava3.observers.m(p0Var);
        if (this.f17539e) {
            this.f17528a.subscribe(new a(mVar, this.f17536b, this.f17537c, this.f17538d));
        } else {
            this.f17528a.subscribe(new b(mVar, this.f17536b, this.f17537c, this.f17538d));
        }
    }
}
