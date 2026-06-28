package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class j0<T, U> extends io.reactivex.rxjava3.core.o<T> {

    /* renamed from: b, reason: collision with root package name */
    final org.reactivestreams.o<? extends T> f16827b;

    /* renamed from: c, reason: collision with root package name */
    final org.reactivestreams.o<U> f16828c;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicLong implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {
        private static final long serialVersionUID = 2259811067697317255L;
        final org.reactivestreams.p<? super T> downstream;
        final org.reactivestreams.o<? extends T> main;
        final a<T>.C0470a other = new C0470a();
        final AtomicReference<org.reactivestreams.q> upstream = new AtomicReference<>();

        /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.j0$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class C0470a extends AtomicReference<org.reactivestreams.q> implements io.reactivex.rxjava3.core.t<Object> {
            private static final long serialVersionUID = -3892798459447644106L;

            C0470a() {
            }

            @Override // org.reactivestreams.p
            public void onComplete() {
                if (get() != io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED) {
                    a.this.next();
                }
            }

            @Override // org.reactivestreams.p
            public void onError(Throwable th) {
                if (get() != io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED) {
                    a.this.downstream.onError(th);
                } else {
                    io.reactivex.rxjava3.plugins.a.Y(th);
                }
            }

            @Override // org.reactivestreams.p
            public void onNext(Object obj) {
                org.reactivestreams.q qVar = get();
                io.reactivex.rxjava3.internal.subscriptions.j jVar = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
                if (qVar != jVar) {
                    lazySet(jVar);
                    qVar.cancel();
                    a.this.next();
                }
            }

            @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
            public void onSubscribe(org.reactivestreams.q qVar) {
                if (io.reactivex.rxjava3.internal.subscriptions.j.setOnce(this, qVar)) {
                    qVar.request(Long.MAX_VALUE);
                }
            }
        }

        a(org.reactivestreams.p<? super T> pVar, org.reactivestreams.o<? extends T> oVar) {
            this.downstream = pVar;
            this.main = oVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.other);
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.upstream);
        }

        void next() {
            this.main.subscribe(this);
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            this.downstream.onNext(t5);
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            io.reactivex.rxjava3.internal.subscriptions.j.deferredSetOnce(this.upstream, this, qVar);
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(j5)) {
                io.reactivex.rxjava3.internal.subscriptions.j.deferredRequest(this.upstream, this, j5);
            }
        }
    }

    public j0(org.reactivestreams.o<? extends T> oVar, org.reactivestreams.o<U> oVar2) {
        this.f16827b = oVar;
        this.f16828c = oVar2;
    }

    @Override // io.reactivex.rxjava3.core.o
    public void O6(org.reactivestreams.p<? super T> pVar) {
        a aVar = new a(pVar, this.f16827b);
        pVar.onSubscribe(aVar);
        this.f16828c.subscribe(aVar.other);
    }
}
