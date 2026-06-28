package io.reactivex.rxjava3.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class x3<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final long f17180c;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q {

        /* renamed from: a, reason: collision with root package name */
        final org.reactivestreams.p<? super T> f17181a;

        /* renamed from: b, reason: collision with root package name */
        long f17182b;

        /* renamed from: c, reason: collision with root package name */
        org.reactivestreams.q f17183c;

        a(org.reactivestreams.p<? super T> pVar, long j5) {
            this.f17181a = pVar;
            this.f17182b = j5;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.f17183c.cancel();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.f17181a.onComplete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.f17181a.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            long j5 = this.f17182b;
            if (j5 != 0) {
                this.f17182b = j5 - 1;
            } else {
                this.f17181a.onNext(t5);
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f17183c, qVar)) {
                long j5 = this.f17182b;
                this.f17183c = qVar;
                this.f17181a.onSubscribe(this);
                qVar.request(j5);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            this.f17183c.request(j5);
        }
    }

    public x3(io.reactivex.rxjava3.core.o<T> oVar, long j5) {
        super(oVar);
        this.f17180c = j5;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        this.f16598b.N6(new a(pVar, this.f17180c));
    }
}
