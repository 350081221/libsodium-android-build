package io.reactivex.rxjava3.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class t2<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final m3.r<? super Throwable> f17062c;

    /* loaded from: classes3.dex */
    public static final class a<T> implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {

        /* renamed from: a, reason: collision with root package name */
        final org.reactivestreams.p<? super T> f17063a;

        /* renamed from: b, reason: collision with root package name */
        final m3.r<? super Throwable> f17064b;

        /* renamed from: c, reason: collision with root package name */
        org.reactivestreams.q f17065c;

        public a(org.reactivestreams.p<? super T> pVar, m3.r<? super Throwable> rVar) {
            this.f17063a = pVar;
            this.f17064b = rVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.f17065c.cancel();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.f17063a.onComplete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            try {
                if (this.f17064b.test(th)) {
                    this.f17063a.onComplete();
                } else {
                    this.f17063a.onError(th);
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.b.b(th2);
                this.f17063a.onError(new io.reactivex.rxjava3.exceptions.a(th, th2));
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            this.f17063a.onNext(t5);
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f17065c, qVar)) {
                this.f17065c = qVar;
                this.f17063a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            this.f17065c.request(j5);
        }
    }

    public t2(io.reactivex.rxjava3.core.o<T> oVar, m3.r<? super Throwable> rVar) {
        super(oVar);
        this.f17062c = rVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        this.f16598b.N6(new a(pVar, this.f17062c));
    }
}
