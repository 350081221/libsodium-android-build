package io.reactivex.rxjava3.internal.operators.completable;

/* loaded from: classes3.dex */
public final class m extends io.reactivex.rxjava3.core.c {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.i f16543a;

    /* renamed from: b, reason: collision with root package name */
    final m3.g<? super Throwable> f16544b;

    /* loaded from: classes3.dex */
    final class a implements io.reactivex.rxjava3.core.f {

        /* renamed from: a, reason: collision with root package name */
        private final io.reactivex.rxjava3.core.f f16545a;

        a(io.reactivex.rxjava3.core.f fVar) {
            this.f16545a = fVar;
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onComplete() {
            try {
                m.this.f16544b.accept(null);
                this.f16545a.onComplete();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f16545a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            try {
                m.this.f16544b.accept(th);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.b.b(th2);
                th = new io.reactivex.rxjava3.exceptions.a(th, th2);
            }
            this.f16545a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            this.f16545a.onSubscribe(eVar);
        }
    }

    public m(io.reactivex.rxjava3.core.i iVar, m3.g<? super Throwable> gVar) {
        this.f16543a = iVar;
        this.f16544b = gVar;
    }

    @Override // io.reactivex.rxjava3.core.c
    protected void Y0(io.reactivex.rxjava3.core.f fVar) {
        this.f16543a.a(new a(fVar));
    }
}
