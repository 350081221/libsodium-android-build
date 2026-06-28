package io.reactivex.rxjava3.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class l4<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final m3.r<? super T> f16857c;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {

        /* renamed from: a, reason: collision with root package name */
        final org.reactivestreams.p<? super T> f16858a;

        /* renamed from: b, reason: collision with root package name */
        final m3.r<? super T> f16859b;

        /* renamed from: c, reason: collision with root package name */
        org.reactivestreams.q f16860c;

        /* renamed from: d, reason: collision with root package name */
        boolean f16861d;

        a(org.reactivestreams.p<? super T> pVar, m3.r<? super T> rVar) {
            this.f16858a = pVar;
            this.f16859b = rVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.f16860c.cancel();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (!this.f16861d) {
                this.f16861d = true;
                this.f16858a.onComplete();
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (!this.f16861d) {
                this.f16861d = true;
                this.f16858a.onError(th);
            } else {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (!this.f16861d) {
                this.f16858a.onNext(t5);
                try {
                    if (this.f16859b.test(t5)) {
                        this.f16861d = true;
                        this.f16860c.cancel();
                        this.f16858a.onComplete();
                    }
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    this.f16860c.cancel();
                    onError(th);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f16860c, qVar)) {
                this.f16860c = qVar;
                this.f16858a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            this.f16860c.request(j5);
        }
    }

    public l4(io.reactivex.rxjava3.core.o<T> oVar, m3.r<? super T> rVar) {
        super(oVar);
        this.f16857c = rVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        this.f16598b.N6(new a(pVar, this.f16857c));
    }
}
