package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class n3<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final long f16906c;

    /* renamed from: d, reason: collision with root package name */
    final TimeUnit f16907d;

    /* renamed from: e, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f16908e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f16909f;

    /* loaded from: classes3.dex */
    static final class a<T> extends c<T> {
        private static final long serialVersionUID = -7139995637533111443L;
        final AtomicInteger wip;

        a(org.reactivestreams.p<? super T> pVar, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var) {
            super(pVar, j5, timeUnit, q0Var);
            this.wip = new AtomicInteger(1);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.n3.c
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

        b(org.reactivestreams.p<? super T> pVar, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var) {
            super(pVar, j5, timeUnit, q0Var);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.n3.c
        void complete() {
            this.downstream.onComplete();
        }

        @Override // java.lang.Runnable
        public void run() {
            emit();
        }
    }

    /* loaded from: classes3.dex */
    static abstract class c<T> extends AtomicReference<T> implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;
        final org.reactivestreams.p<? super T> downstream;
        final long period;
        final io.reactivex.rxjava3.core.q0 scheduler;
        final TimeUnit unit;
        org.reactivestreams.q upstream;
        final AtomicLong requested = new AtomicLong();
        final io.reactivex.rxjava3.internal.disposables.f timer = new io.reactivex.rxjava3.internal.disposables.f();

        c(org.reactivestreams.p<? super T> pVar, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var) {
            this.downstream = pVar;
            this.period = j5;
            this.unit = timeUnit;
            this.scheduler = q0Var;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            cancelTimer();
            this.upstream.cancel();
        }

        void cancelTimer() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this.timer);
        }

        abstract void complete();

        void emit() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                if (this.requested.get() != 0) {
                    this.downstream.onNext(andSet);
                    io.reactivex.rxjava3.internal.util.d.e(this.requested, 1L);
                } else {
                    cancel();
                    this.downstream.onError(new io.reactivex.rxjava3.exceptions.c("Couldn't emit value due to lack of requests!"));
                }
            }
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            cancelTimer();
            complete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            cancelTimer();
            this.downstream.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            lazySet(t5);
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.upstream, qVar)) {
                this.upstream = qVar;
                this.downstream.onSubscribe(this);
                io.reactivex.rxjava3.internal.disposables.f fVar = this.timer;
                io.reactivex.rxjava3.core.q0 q0Var = this.scheduler;
                long j5 = this.period;
                fVar.replace(q0Var.o(this, j5, j5, this.unit));
                qVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(j5)) {
                io.reactivex.rxjava3.internal.util.d.a(this.requested, j5);
            }
        }
    }

    public n3(io.reactivex.rxjava3.core.o<T> oVar, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, boolean z4) {
        super(oVar);
        this.f16906c = j5;
        this.f16907d = timeUnit;
        this.f16908e = q0Var;
        this.f16909f = z4;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        io.reactivex.rxjava3.subscribers.e eVar = new io.reactivex.rxjava3.subscribers.e(pVar);
        if (this.f16909f) {
            this.f16598b.N6(new a(eVar, this.f16906c, this.f16907d, this.f16908e));
        } else {
            this.f16598b.N6(new b(eVar, this.f16906c, this.f16907d, this.f16908e));
        }
    }
}
