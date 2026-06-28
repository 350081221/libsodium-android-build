package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.q0;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class i0<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final long f16781c;

    /* renamed from: d, reason: collision with root package name */
    final TimeUnit f16782d;

    /* renamed from: e, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f16783e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f16784f;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {

        /* renamed from: a, reason: collision with root package name */
        final org.reactivestreams.p<? super T> f16785a;

        /* renamed from: b, reason: collision with root package name */
        final long f16786b;

        /* renamed from: c, reason: collision with root package name */
        final TimeUnit f16787c;

        /* renamed from: d, reason: collision with root package name */
        final q0.c f16788d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f16789e;

        /* renamed from: f, reason: collision with root package name */
        org.reactivestreams.q f16790f;

        /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.i0$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class RunnableC0469a implements Runnable {
            RunnableC0469a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.f16785a.onComplete();
                } finally {
                    a.this.f16788d.dispose();
                }
            }
        }

        /* loaded from: classes3.dex */
        final class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            private final Throwable f16792a;

            b(Throwable th) {
                this.f16792a = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.f16785a.onError(this.f16792a);
                } finally {
                    a.this.f16788d.dispose();
                }
            }
        }

        /* loaded from: classes3.dex */
        final class c implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            private final T f16794a;

            c(T t5) {
                this.f16794a = t5;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f16785a.onNext(this.f16794a);
            }
        }

        a(org.reactivestreams.p<? super T> pVar, long j5, TimeUnit timeUnit, q0.c cVar, boolean z4) {
            this.f16785a = pVar;
            this.f16786b = j5;
            this.f16787c = timeUnit;
            this.f16788d = cVar;
            this.f16789e = z4;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.f16790f.cancel();
            this.f16788d.dispose();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.f16788d.c(new RunnableC0469a(), this.f16786b, this.f16787c);
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.f16788d.c(new b(th), this.f16789e ? this.f16786b : 0L, this.f16787c);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            this.f16788d.c(new c(t5), this.f16786b, this.f16787c);
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f16790f, qVar)) {
                this.f16790f = qVar;
                this.f16785a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            this.f16790f.request(j5);
        }
    }

    public i0(io.reactivex.rxjava3.core.o<T> oVar, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, boolean z4) {
        super(oVar);
        this.f16781c = j5;
        this.f16782d = timeUnit;
        this.f16783e = q0Var;
        this.f16784f = z4;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        org.reactivestreams.p<? super T> eVar;
        if (this.f16784f) {
            eVar = pVar;
        } else {
            eVar = new io.reactivex.rxjava3.subscribers.e(pVar);
        }
        this.f16598b.N6(new a(eVar, this.f16781c, this.f16782d, this.f16783e.c(), this.f16784f));
    }
}
