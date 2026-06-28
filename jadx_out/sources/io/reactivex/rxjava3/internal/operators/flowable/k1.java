package io.reactivex.rxjava3.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class k1<T> extends io.reactivex.rxjava3.core.o<T> implements io.reactivex.rxjava3.internal.fuseable.g {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.i f16843b;

    /* loaded from: classes3.dex */
    public static final class a<T> extends io.reactivex.rxjava3.internal.fuseable.a<T> implements io.reactivex.rxjava3.core.f {

        /* renamed from: a, reason: collision with root package name */
        final org.reactivestreams.p<? super T> f16844a;

        /* renamed from: b, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f16845b;

        public a(org.reactivestreams.p<? super T> pVar) {
            this.f16844a = pVar;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.a, org.reactivestreams.q
        public void cancel() {
            this.f16845b.dispose();
            this.f16845b = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onComplete() {
            this.f16845b = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            this.f16844a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.f16845b = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            this.f16844a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f16845b, eVar)) {
                this.f16845b = eVar;
                this.f16844a.onSubscribe(this);
            }
        }
    }

    public k1(io.reactivex.rxjava3.core.i iVar) {
        this.f16843b = iVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        this.f16843b.a(new a(pVar));
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.g
    public io.reactivex.rxjava3.core.i source() {
        return this.f16843b;
    }
}
