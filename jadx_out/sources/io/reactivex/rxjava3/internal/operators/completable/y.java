package io.reactivex.rxjava3.internal.operators.completable;

/* loaded from: classes3.dex */
public final class y extends io.reactivex.rxjava3.core.c {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.i f16593a;

    /* loaded from: classes3.dex */
    static final class a implements io.reactivex.rxjava3.core.f, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.f f16594a;

        /* renamed from: b, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f16595b;

        a(io.reactivex.rxjava3.core.f fVar) {
            this.f16594a = fVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f16595b.dispose();
            this.f16595b = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f16595b.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onComplete() {
            this.f16594a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.f16594a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f16595b, eVar)) {
                this.f16595b = eVar;
                this.f16594a.onSubscribe(this);
            }
        }
    }

    public y(io.reactivex.rxjava3.core.i iVar) {
        this.f16593a = iVar;
    }

    @Override // io.reactivex.rxjava3.core.c
    protected void Y0(io.reactivex.rxjava3.core.f fVar) {
        this.f16593a.a(new a(fVar));
    }
}
