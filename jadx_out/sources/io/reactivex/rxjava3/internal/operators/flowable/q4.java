package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.operators.flowable.r4;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class q4<T, U, V> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final org.reactivestreams.o<U> f16987c;

    /* renamed from: d, reason: collision with root package name */
    final m3.o<? super T, ? extends org.reactivestreams.o<V>> f16988d;

    /* renamed from: e, reason: collision with root package name */
    final org.reactivestreams.o<? extends T> f16989e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends AtomicReference<org.reactivestreams.q> implements io.reactivex.rxjava3.core.t<Object>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 8708641127342403073L;
        final long idx;
        final c parent;

        a(long j5, c cVar) {
            this.idx = j5;
            this.parent = cVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return get() == io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            Object obj = get();
            io.reactivex.rxjava3.internal.subscriptions.j jVar = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            if (obj != jVar) {
                lazySet(jVar);
                this.parent.onTimeout(this.idx);
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            Object obj = get();
            io.reactivex.rxjava3.internal.subscriptions.j jVar = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            if (obj != jVar) {
                lazySet(jVar);
                this.parent.onTimeoutError(this.idx, th);
            } else {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(Object obj) {
            org.reactivestreams.q qVar = (org.reactivestreams.q) get();
            io.reactivex.rxjava3.internal.subscriptions.j jVar = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
            if (qVar != jVar) {
                qVar.cancel();
                lazySet(jVar);
                this.parent.onTimeout(this.idx);
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            io.reactivex.rxjava3.internal.subscriptions.j.setOnce(this, qVar, Long.MAX_VALUE);
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T> extends io.reactivex.rxjava3.internal.subscriptions.i implements io.reactivex.rxjava3.core.t<T>, c {
        private static final long serialVersionUID = 3764492702657003550L;
        long consumed;
        final org.reactivestreams.p<? super T> downstream;
        org.reactivestreams.o<? extends T> fallback;
        final AtomicLong index;
        final m3.o<? super T, ? extends org.reactivestreams.o<?>> itemTimeoutIndicator;
        final io.reactivex.rxjava3.internal.disposables.f task;
        final AtomicReference<org.reactivestreams.q> upstream;

        b(org.reactivestreams.p<? super T> pVar, m3.o<? super T, ? extends org.reactivestreams.o<?>> oVar, org.reactivestreams.o<? extends T> oVar2) {
            super(true);
            this.downstream = pVar;
            this.itemTimeoutIndicator = oVar;
            this.task = new io.reactivex.rxjava3.internal.disposables.f();
            this.upstream = new AtomicReference<>();
            this.fallback = oVar2;
            this.index = new AtomicLong();
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.i, org.reactivestreams.q
        public void cancel() {
            super.cancel();
            this.task.dispose();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.task.dispose();
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onError(th);
                this.task.dispose();
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
                    io.reactivex.rxjava3.disposables.e eVar = this.task.get();
                    if (eVar != null) {
                        eVar.dispose();
                    }
                    this.consumed++;
                    this.downstream.onNext(t5);
                    try {
                        org.reactivestreams.o<?> apply = this.itemTimeoutIndicator.apply(t5);
                        Objects.requireNonNull(apply, "The itemTimeoutIndicator returned a null Publisher.");
                        org.reactivestreams.o<?> oVar = apply;
                        a aVar = new a(j6, this);
                        if (this.task.replace(aVar)) {
                            oVar.subscribe(aVar);
                        }
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.b.b(th);
                        this.upstream.get().cancel();
                        this.index.getAndSet(Long.MAX_VALUE);
                        this.downstream.onError(th);
                    }
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
                org.reactivestreams.o<? extends T> oVar = this.fallback;
                this.fallback = null;
                long j6 = this.consumed;
                if (j6 != 0) {
                    produced(j6);
                }
                oVar.subscribe(new r4.a(this.downstream, this));
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.q4.c
        public void onTimeoutError(long j5, Throwable th) {
            if (this.index.compareAndSet(j5, Long.MAX_VALUE)) {
                io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.upstream);
                this.downstream.onError(th);
            } else {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        void startFirstTimeout(org.reactivestreams.o<?> oVar) {
            if (oVar != null) {
                a aVar = new a(0L, this);
                if (this.task.replace(aVar)) {
                    oVar.subscribe(aVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface c extends r4.d {
        void onTimeoutError(long j5, Throwable th);
    }

    /* loaded from: classes3.dex */
    static final class d<T> extends AtomicLong implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q, c {
        private static final long serialVersionUID = 3764492702657003550L;
        final org.reactivestreams.p<? super T> downstream;
        final m3.o<? super T, ? extends org.reactivestreams.o<?>> itemTimeoutIndicator;
        final io.reactivex.rxjava3.internal.disposables.f task = new io.reactivex.rxjava3.internal.disposables.f();
        final AtomicReference<org.reactivestreams.q> upstream = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();

        d(org.reactivestreams.p<? super T> pVar, m3.o<? super T, ? extends org.reactivestreams.o<?>> oVar) {
            this.downstream = pVar;
            this.itemTimeoutIndicator = oVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.upstream);
            this.task.dispose();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onError(th);
            } else {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            long j5 = get();
            if (j5 != Long.MAX_VALUE) {
                long j6 = 1 + j5;
                if (compareAndSet(j5, j6)) {
                    io.reactivex.rxjava3.disposables.e eVar = this.task.get();
                    if (eVar != null) {
                        eVar.dispose();
                    }
                    this.downstream.onNext(t5);
                    try {
                        org.reactivestreams.o<?> apply = this.itemTimeoutIndicator.apply(t5);
                        Objects.requireNonNull(apply, "The itemTimeoutIndicator returned a null Publisher.");
                        org.reactivestreams.o<?> oVar = apply;
                        a aVar = new a(j6, this);
                        if (this.task.replace(aVar)) {
                            oVar.subscribe(aVar);
                        }
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.b.b(th);
                        this.upstream.get().cancel();
                        getAndSet(Long.MAX_VALUE);
                        this.downstream.onError(th);
                    }
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
                this.downstream.onError(new TimeoutException());
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.q4.c
        public void onTimeoutError(long j5, Throwable th) {
            if (compareAndSet(j5, Long.MAX_VALUE)) {
                io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.upstream);
                this.downstream.onError(th);
            } else {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            io.reactivex.rxjava3.internal.subscriptions.j.deferredRequest(this.upstream, this.requested, j5);
        }

        void startFirstTimeout(org.reactivestreams.o<?> oVar) {
            if (oVar != null) {
                a aVar = new a(0L, this);
                if (this.task.replace(aVar)) {
                    oVar.subscribe(aVar);
                }
            }
        }
    }

    public q4(io.reactivex.rxjava3.core.o<T> oVar, org.reactivestreams.o<U> oVar2, m3.o<? super T, ? extends org.reactivestreams.o<V>> oVar3, org.reactivestreams.o<? extends T> oVar4) {
        super(oVar);
        this.f16987c = oVar2;
        this.f16988d = oVar3;
        this.f16989e = oVar4;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        if (this.f16989e == null) {
            d dVar = new d(pVar, this.f16988d);
            pVar.onSubscribe(dVar);
            dVar.startFirstTimeout(this.f16987c);
            this.f16598b.N6(dVar);
            return;
        }
        b bVar = new b(pVar, this.f16988d, this.f16989e);
        pVar.onSubscribe(bVar);
        bVar.startFirstTimeout(this.f16987c);
        this.f16598b.N6(bVar);
    }
}
