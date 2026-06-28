package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class a4<T, U> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final org.reactivestreams.o<U> f16608c;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.internal.fuseable.c<T>, org.reactivestreams.q {
        private static final long serialVersionUID = -6270983465606289181L;
        final org.reactivestreams.p<? super T> downstream;
        volatile boolean gate;
        final AtomicReference<org.reactivestreams.q> upstream = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();
        final a<T>.C0462a other = new C0462a();
        final io.reactivex.rxjava3.internal.util.c error = new io.reactivex.rxjava3.internal.util.c();

        /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.a4$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class C0462a extends AtomicReference<org.reactivestreams.q> implements io.reactivex.rxjava3.core.t<Object> {
            private static final long serialVersionUID = -5592042965931999169L;

            C0462a() {
            }

            @Override // org.reactivestreams.p
            public void onComplete() {
                a.this.gate = true;
            }

            @Override // org.reactivestreams.p
            public void onError(Throwable th) {
                io.reactivex.rxjava3.internal.subscriptions.j.cancel(a.this.upstream);
                a aVar = a.this;
                io.reactivex.rxjava3.internal.util.l.d(aVar.downstream, th, aVar, aVar.error);
            }

            @Override // org.reactivestreams.p
            public void onNext(Object obj) {
                a.this.gate = true;
                get().cancel();
            }

            @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
            public void onSubscribe(org.reactivestreams.q qVar) {
                io.reactivex.rxjava3.internal.subscriptions.j.setOnce(this, qVar, Long.MAX_VALUE);
            }
        }

        a(org.reactivestreams.p<? super T> pVar) {
            this.downstream = pVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.upstream);
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.other);
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.other);
            io.reactivex.rxjava3.internal.util.l.b(this.downstream, this, this.error);
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this.other);
            io.reactivex.rxjava3.internal.util.l.d(this.downstream, th, this, this.error);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (!tryOnNext(t5)) {
                this.upstream.get().request(1L);
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            io.reactivex.rxjava3.internal.subscriptions.j.deferredSetOnce(this.upstream, this.requested, qVar);
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            io.reactivex.rxjava3.internal.subscriptions.j.deferredRequest(this.upstream, this.requested, j5);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.c
        public boolean tryOnNext(T t5) {
            if (this.gate) {
                io.reactivex.rxjava3.internal.util.l.f(this.downstream, t5, this, this.error);
                return true;
            }
            return false;
        }
    }

    public a4(io.reactivex.rxjava3.core.o<T> oVar, org.reactivestreams.o<U> oVar2) {
        super(oVar);
        this.f16608c = oVar2;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        a aVar = new a(pVar);
        pVar.onSubscribe(aVar);
        this.f16608c.subscribe(aVar.other);
        this.f16598b.N6(aVar);
    }
}
