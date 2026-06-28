package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class p4<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, io.reactivex.rxjava3.schedulers.d<T>> {

    /* renamed from: c, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f16951c;

    /* renamed from: d, reason: collision with root package name */
    final TimeUnit f16952d;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {

        /* renamed from: a, reason: collision with root package name */
        final org.reactivestreams.p<? super io.reactivex.rxjava3.schedulers.d<T>> f16953a;

        /* renamed from: b, reason: collision with root package name */
        final TimeUnit f16954b;

        /* renamed from: c, reason: collision with root package name */
        final io.reactivex.rxjava3.core.q0 f16955c;

        /* renamed from: d, reason: collision with root package name */
        org.reactivestreams.q f16956d;

        /* renamed from: e, reason: collision with root package name */
        long f16957e;

        a(org.reactivestreams.p<? super io.reactivex.rxjava3.schedulers.d<T>> pVar, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var) {
            this.f16953a = pVar;
            this.f16955c = q0Var;
            this.f16954b = timeUnit;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.f16956d.cancel();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.f16953a.onComplete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.f16953a.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            long d5 = this.f16955c.d(this.f16954b);
            long j5 = this.f16957e;
            this.f16957e = d5;
            this.f16953a.onNext(new io.reactivex.rxjava3.schedulers.d(t5, d5 - j5, this.f16954b));
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f16956d, qVar)) {
                this.f16957e = this.f16955c.d(this.f16954b);
                this.f16956d = qVar;
                this.f16953a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            this.f16956d.request(j5);
        }
    }

    public p4(io.reactivex.rxjava3.core.o<T> oVar, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var) {
        super(oVar);
        this.f16951c = q0Var;
        this.f16952d = timeUnit;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super io.reactivex.rxjava3.schedulers.d<T>> pVar) {
        this.f16598b.N6(new a(pVar, this.f16952d, this.f16951c));
    }
}
