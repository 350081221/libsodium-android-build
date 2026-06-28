package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class k4<T, U> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final org.reactivestreams.o<? extends U> f16849c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {
        private static final long serialVersionUID = -4945480365982832967L;
        final org.reactivestreams.p<? super T> downstream;
        final AtomicLong requested = new AtomicLong();
        final AtomicReference<org.reactivestreams.q> upstream = new AtomicReference<>();
        final a<T>.C0473a other = new C0473a();
        final io.reactivex.rxjava3.internal.util.c error = new io.reactivex.rxjava3.internal.util.c();

        /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.k4$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class C0473a extends AtomicReference<org.reactivestreams.q> implements io.reactivex.rxjava3.core.t<Object> {
            private static final long serialVersionUID = -3592821756711087922L;

            C0473a() {
            }

            @Override // org.reactivestreams.p
            public void onComplete() {
                io.reactivex.rxjava3.internal.subscriptions.j.cancel(a.this.upstream);
                a aVar = a.this;
                io.reactivex.rxjava3.internal.util.l.b(aVar.downstream, aVar, aVar.error);
            }

            @Override // org.reactivestreams.p
            public void onError(Throwable th) {
                io.reactivex.rxjava3.internal.subscriptions.j.cancel(a.this.upstream);
                a aVar = a.this;
                io.reactivex.rxjava3.internal.util.l.d(aVar.downstream, th, aVar, aVar.error);
            }

            @Override // org.reactivestreams.p
            public void onNext(Object obj) {
                io.reactivex.rxjava3.internal.subscriptions.j.cancel(this);
                onComplete();
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
            io.reactivex.rxjava3.internal.util.l.f(this.downstream, t5, this, this.error);
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            io.reactivex.rxjava3.internal.subscriptions.j.deferredSetOnce(this.upstream, this.requested, qVar);
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            io.reactivex.rxjava3.internal.subscriptions.j.deferredRequest(this.upstream, this.requested, j5);
        }
    }

    public k4(io.reactivex.rxjava3.core.o<T> oVar, org.reactivestreams.o<? extends U> oVar2) {
        super(oVar);
        this.f16849c = oVar2;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        a aVar = new a(pVar);
        pVar.onSubscribe(aVar);
        this.f16849c.subscribe(aVar.other);
        this.f16598b.N6(aVar);
    }
}
