package io.reactivex.rxjava3.internal.operators.completable;

/* loaded from: classes3.dex */
public final class j extends io.reactivex.rxjava3.core.c {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.i f16515a;

    /* loaded from: classes3.dex */
    static final class a implements io.reactivex.rxjava3.core.f, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        io.reactivex.rxjava3.core.f f16516a;

        /* renamed from: b, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f16517b;

        a(io.reactivex.rxjava3.core.f fVar) {
            this.f16516a = fVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f16516a = null;
            this.f16517b.dispose();
            this.f16517b = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f16517b.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onComplete() {
            this.f16517b = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            io.reactivex.rxjava3.core.f fVar = this.f16516a;
            if (fVar != null) {
                this.f16516a = null;
                fVar.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            this.f16517b = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            io.reactivex.rxjava3.core.f fVar = this.f16516a;
            if (fVar != null) {
                this.f16516a = null;
                fVar.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f16517b, eVar)) {
                this.f16517b = eVar;
                this.f16516a.onSubscribe(this);
            }
        }
    }

    public j(io.reactivex.rxjava3.core.i iVar) {
        this.f16515a = iVar;
    }

    @Override // io.reactivex.rxjava3.core.c
    protected void Y0(io.reactivex.rxjava3.core.f fVar) {
        this.f16515a.a(new a(fVar));
    }
}
