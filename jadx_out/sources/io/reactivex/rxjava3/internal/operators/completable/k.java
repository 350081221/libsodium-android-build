package io.reactivex.rxjava3.internal.operators.completable;

/* loaded from: classes3.dex */
public final class k extends io.reactivex.rxjava3.core.c {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.i f16523a;

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.q0 f16524b;

    /* loaded from: classes3.dex */
    static final class a implements io.reactivex.rxjava3.core.f, io.reactivex.rxjava3.disposables.e, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.f f16525a;

        /* renamed from: b, reason: collision with root package name */
        final io.reactivex.rxjava3.core.q0 f16526b;

        /* renamed from: c, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f16527c;

        /* renamed from: d, reason: collision with root package name */
        volatile boolean f16528d;

        a(io.reactivex.rxjava3.core.f fVar, io.reactivex.rxjava3.core.q0 q0Var) {
            this.f16525a = fVar;
            this.f16526b = q0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f16528d = true;
            this.f16526b.e(this);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f16528d;
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onComplete() {
            if (this.f16528d) {
                return;
            }
            this.f16525a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            if (this.f16528d) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f16525a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f16527c, eVar)) {
                this.f16527c = eVar;
                this.f16525a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f16527c.dispose();
            this.f16527c = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
        }
    }

    public k(io.reactivex.rxjava3.core.i iVar, io.reactivex.rxjava3.core.q0 q0Var) {
        this.f16523a = iVar;
        this.f16524b = q0Var;
    }

    @Override // io.reactivex.rxjava3.core.c
    protected void Y0(io.reactivex.rxjava3.core.f fVar) {
        this.f16523a.a(new a(fVar, this.f16524b));
    }
}
