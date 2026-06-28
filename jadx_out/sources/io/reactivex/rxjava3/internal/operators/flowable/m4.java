package io.reactivex.rxjava3.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class m4<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final m3.r<? super T> f16882c;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {

        /* renamed from: a, reason: collision with root package name */
        final org.reactivestreams.p<? super T> f16883a;

        /* renamed from: b, reason: collision with root package name */
        final m3.r<? super T> f16884b;

        /* renamed from: c, reason: collision with root package name */
        org.reactivestreams.q f16885c;

        /* renamed from: d, reason: collision with root package name */
        boolean f16886d;

        a(org.reactivestreams.p<? super T> pVar, m3.r<? super T> rVar) {
            this.f16883a = pVar;
            this.f16884b = rVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.f16885c.cancel();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.f16886d) {
                return;
            }
            this.f16886d = true;
            this.f16883a.onComplete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.f16886d) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f16886d = true;
                this.f16883a.onError(th);
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (this.f16886d) {
                return;
            }
            try {
                if (!this.f16884b.test(t5)) {
                    this.f16886d = true;
                    this.f16885c.cancel();
                    this.f16883a.onComplete();
                    return;
                }
                this.f16883a.onNext(t5);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f16885c.cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f16885c, qVar)) {
                this.f16885c = qVar;
                this.f16883a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            this.f16885c.request(j5);
        }
    }

    public m4(io.reactivex.rxjava3.core.o<T> oVar, m3.r<? super T> rVar) {
        super(oVar);
        this.f16882c = rVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        this.f16598b.N6(new a(pVar, this.f16882c));
    }
}
