package io.reactivex.rxjava3.internal.operators.completable;

/* loaded from: classes3.dex */
public final class i0 extends io.reactivex.rxjava3.core.c {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.i f16511a;

    /* renamed from: b, reason: collision with root package name */
    final m3.r<? super Throwable> f16512b;

    /* loaded from: classes3.dex */
    final class a implements io.reactivex.rxjava3.core.f {

        /* renamed from: a, reason: collision with root package name */
        private final io.reactivex.rxjava3.core.f f16513a;

        a(io.reactivex.rxjava3.core.f fVar) {
            this.f16513a = fVar;
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onComplete() {
            this.f16513a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            try {
                if (i0.this.f16512b.test(th)) {
                    this.f16513a.onComplete();
                } else {
                    this.f16513a.onError(th);
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.b.b(th2);
                this.f16513a.onError(new io.reactivex.rxjava3.exceptions.a(th, th2));
            }
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            this.f16513a.onSubscribe(eVar);
        }
    }

    public i0(io.reactivex.rxjava3.core.i iVar, m3.r<? super Throwable> rVar) {
        this.f16511a = iVar;
        this.f16512b = rVar;
    }

    @Override // io.reactivex.rxjava3.core.c
    protected void Y0(io.reactivex.rxjava3.core.f fVar) {
        this.f16511a.a(new a(fVar));
    }
}
