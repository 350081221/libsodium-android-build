package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.q0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class r4<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final long f17010c;

    /* renamed from: d, reason: collision with root package name */
    final TimeUnit f17011d;

    /* renamed from: e, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f17012e;

    /* renamed from: f, reason: collision with root package name */
    final org.reactivestreams.o<? extends T> f17013f;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.t<T> {

        /* renamed from: a, reason: collision with root package name */
        final org.reactivestreams.p<? super T> f17014a;

        /* renamed from: b, reason: collision with root package name */
        final io.reactivex.rxjava3.internal.subscriptions.i f17015b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(org.reactivestreams.p<? super T> pVar, io.reactivex.rxjava3.internal.subscriptions.i iVar) {
            this.f17014a = pVar;
            this.f17015b = iVar;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.f17014a.onComplete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.f17014a.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            this.f17014a.onNext(t5);
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            this.f17015b.setSubscription(qVar);
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T> extends io.reactivex.rxjava3.internal.subscriptions.i implements io.reactivex.rxjava3.core.t<T>, d {
        private static final long serialVersionUID = 3764492702657003550L;
        long consumed;
        final org.reactivestreams.p<? super T> downstream;
        org.reactivestreams.o<? extends T> fallback;
        final AtomicLong index;
        final io.reactivex.rxjava3.internal.disposables.f task;
        final long timeout;
        final TimeUnit unit;
        final AtomicReference<org.reactivestreams.q> upstream;
        final q0.c worker;

        b(org.reactivestreams.p<? super T> pVar, long j5, TimeUnit timeUnit, q0.c cVar, org.reactivestreams.o<? extends T> oVar) {
            super(true);
            this.downstream = pVar;
            this.timeout = j5;
            this.unit = timeUnit;
            this.worker = cVar;
            this.fallback = oVar;
            this.task = new io.reactivex.rxjava3.internal.disposables.f();
            this.upstream = new AtomicReference<>();
            this.index = new AtomicLong();
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.i, org.reactivestreams.q
        public void cancel() {
            super.cancel();
            this.worker.dispose();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onError(th);
                this.worker.dispose();
                return;
            }
            io.reactivex.rxjava3.plugins.a.Y(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            long j5 = this.index.get();
            if (j5 != Long.MAX_VALUE) {
                long j6 = j5 + 1;
                if (this.index.compareAndSet(j5, j6)) {
                    this.task.get().dispose();
                    this.consumed++;
                    this.downstream.onNext(t5);
                    startTimeout(j6);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.setOnce(this.upstream, qVar)) {
                setSubscription(qVar);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.r4.d
        public void onTimeout(long j5) {
            if (this.index.compareAndSet(j5, Long.MAX_VALUE)) {
                io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.upstream);
                long j6 = this.consumed;
                if (j6 != 0) {
                    produced(j6);
                }
                org.reactivestreams.o<? extends T> oVar = this.fallback;
                this.fallback = null;
                oVar.subscribe(new a(this.downstream, this));
                this.worker.dispose();
            }
        }

        void startTimeout(long j5) {
            this.task.replace(this.worker.c(new e(j5, this), this.timeout, this.unit));
        }
    }

    /* loaded from: classes3.dex */
    static final class c<T> extends AtomicLong implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q, d {
        private static final long serialVersionUID = 3764492702657003550L;
        final org.reactivestreams.p<? super T> downstream;
        final long timeout;
        final TimeUnit unit;
        final q0.c worker;
        final io.reactivex.rxjava3.internal.disposables.f task = new io.reactivex.rxjava3.internal.disposables.f();
        final AtomicReference<org.reactivestreams.q> upstream = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();

        c(org.reactivestreams.p<? super T> pVar, long j5, TimeUnit timeUnit, q0.c cVar) {
            this.downstream = pVar;
            this.timeout = j5;
            this.unit = timeUnit;
            this.worker = cVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.upstream);
            this.worker.dispose();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onError(th);
                this.worker.dispose();
                return;
            }
            io.reactivex.rxjava3.plugins.a.Y(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            long j5 = get();
            if (j5 != Long.MAX_VALUE) {
                long j6 = 1 + j5;
                if (compareAndSet(j5, j6)) {
                    this.task.get().dispose();
                    this.downstream.onNext(t5);
                    startTimeout(j6);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            io.reactivex.rxjava3.internal.subscriptions.j.deferredSetOnce(this.upstream, this.requested, qVar);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.r4.d
        public void onTimeout(long j5) {
            if (compareAndSet(j5, Long.MAX_VALUE)) {
                io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.upstream);
                this.downstream.onError(new TimeoutException(io.reactivex.rxjava3.internal.util.k.h(this.timeout, this.unit)));
                this.worker.dispose();
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            io.reactivex.rxjava3.internal.subscriptions.j.deferredRequest(this.upstream, this.requested, j5);
        }

        void startTimeout(long j5) {
            this.task.replace(this.worker.c(new e(j5, this), this.timeout, this.unit));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface d {
        void onTimeout(long j5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final d f17016a;

        /* renamed from: b, reason: collision with root package name */
        final long f17017b;

        e(long j5, d dVar) {
            this.f17017b = j5;
            this.f17016a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f17016a.onTimeout(this.f17017b);
        }
    }

    public r4(io.reactivex.rxjava3.core.o<T> oVar, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, org.reactivestreams.o<? extends T> oVar2) {
        super(oVar);
        this.f17010c = j5;
        this.f17011d = timeUnit;
        this.f17012e = q0Var;
        this.f17013f = oVar2;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        if (this.f17013f == null) {
            c cVar = new c(pVar, this.f17010c, this.f17011d, this.f17012e.c());
            pVar.onSubscribe(cVar);
            cVar.startTimeout(0L);
            this.f16598b.N6(cVar);
            return;
        }
        b bVar = new b(pVar, this.f17010c, this.f17011d, this.f17012e.c(), this.f17013f);
        pVar.onSubscribe(bVar);
        bVar.startTimeout(0L);
        this.f16598b.N6(bVar);
    }
}
