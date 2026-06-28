package io.reactivex.rxjava3.internal.operators.completable;

/* loaded from: classes3.dex */
public final class s<T> extends io.reactivex.rxjava3.core.c {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<T> f16574a;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.p0<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.f f16575a;

        a(io.reactivex.rxjava3.core.f fVar) {
            this.f16575a = fVar;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.f16575a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.f16575a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            this.f16575a.onSubscribe(eVar);
        }
    }

    public s(io.reactivex.rxjava3.core.n0<T> n0Var) {
        this.f16574a = n0Var;
    }

    @Override // io.reactivex.rxjava3.core.c
    protected void Y0(io.reactivex.rxjava3.core.f fVar) {
        this.f16574a.subscribe(new a(fVar));
    }
}
