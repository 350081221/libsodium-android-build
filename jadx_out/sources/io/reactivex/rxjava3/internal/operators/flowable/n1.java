package io.reactivex.rxjava3.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class n1<T> extends io.reactivex.rxjava3.core.o<T> {

    /* renamed from: b, reason: collision with root package name */
    private final io.reactivex.rxjava3.core.n0<T> f16900b;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.p0<T>, org.reactivestreams.q {

        /* renamed from: a, reason: collision with root package name */
        final org.reactivestreams.p<? super T> f16901a;

        /* renamed from: b, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f16902b;

        a(org.reactivestreams.p<? super T> pVar) {
            this.f16901a = pVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.f16902b.dispose();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.f16901a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.f16901a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            this.f16901a.onNext(t5);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            this.f16902b = eVar;
            this.f16901a.onSubscribe(this);
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
        }
    }

    public n1(io.reactivex.rxjava3.core.n0<T> n0Var) {
        this.f16900b = n0Var;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        this.f16900b.subscribe(new a(pVar));
    }
}
