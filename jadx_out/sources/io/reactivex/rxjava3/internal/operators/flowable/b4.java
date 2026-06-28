package io.reactivex.rxjava3.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class b4<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final m3.r<? super T> f16626c;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {

        /* renamed from: a, reason: collision with root package name */
        final org.reactivestreams.p<? super T> f16627a;

        /* renamed from: b, reason: collision with root package name */
        final m3.r<? super T> f16628b;

        /* renamed from: c, reason: collision with root package name */
        org.reactivestreams.q f16629c;

        /* renamed from: d, reason: collision with root package name */
        boolean f16630d;

        a(org.reactivestreams.p<? super T> pVar, m3.r<? super T> rVar) {
            this.f16627a = pVar;
            this.f16628b = rVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.f16629c.cancel();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.f16627a.onComplete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.f16627a.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.f16630d) {
                this.f16627a.onNext(t5);
                return;
            }
            try {
                if (this.f16628b.test(t5)) {
                    this.f16629c.request(1L);
                } else {
                    this.f16630d = true;
                    this.f16627a.onNext(t5);
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f16629c.cancel();
                this.f16627a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f16629c, qVar)) {
                this.f16629c = qVar;
                this.f16627a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            this.f16629c.request(j5);
        }
    }

    public b4(io.reactivex.rxjava3.core.o<T> oVar, m3.r<? super T> rVar) {
        super(oVar);
        this.f16626c = rVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        this.f16598b.N6(new a(pVar, this.f16626c));
    }
}
