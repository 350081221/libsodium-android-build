package io.reactivex.rxjava3.internal.observers;

/* loaded from: classes3.dex */
public final class b0 implements io.reactivex.rxjava3.core.f {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.f f16415a;

    /* renamed from: b, reason: collision with root package name */
    boolean f16416b;

    public b0(io.reactivex.rxjava3.core.f fVar) {
        this.f16415a = fVar;
    }

    @Override // io.reactivex.rxjava3.core.f
    public void onComplete() {
        if (!this.f16416b) {
            try {
                this.f16415a.onComplete();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.f
    public void onError(@l3.f Throwable th) {
        if (this.f16416b) {
            io.reactivex.rxjava3.plugins.a.Y(th);
            return;
        }
        try {
            this.f16415a.onError(th);
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.b.b(th2);
            io.reactivex.rxjava3.plugins.a.Y(new io.reactivex.rxjava3.exceptions.a(th, th2));
        }
    }

    @Override // io.reactivex.rxjava3.core.f
    public void onSubscribe(@l3.f io.reactivex.rxjava3.disposables.e eVar) {
        try {
            this.f16415a.onSubscribe(eVar);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            this.f16416b = true;
            eVar.dispose();
            io.reactivex.rxjava3.plugins.a.Y(th);
        }
    }
}
