package io.reactivex.rxjava3.internal.observers;

/* loaded from: classes3.dex */
public final class c0<T> implements io.reactivex.rxjava3.core.a0<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.a0<? super T> f16417a;

    /* renamed from: b, reason: collision with root package name */
    boolean f16418b;

    public c0(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        this.f16417a = a0Var;
    }

    @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.f
    public void onComplete() {
        if (!this.f16418b) {
            try {
                this.f16417a.onComplete();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
    public void onError(@l3.f Throwable th) {
        if (this.f16418b) {
            io.reactivex.rxjava3.plugins.a.Y(th);
            return;
        }
        try {
            this.f16417a.onError(th);
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.b.b(th2);
            io.reactivex.rxjava3.plugins.a.Y(new io.reactivex.rxjava3.exceptions.a(th, th2));
        }
    }

    @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
    public void onSubscribe(@l3.f io.reactivex.rxjava3.disposables.e eVar) {
        try {
            this.f16417a.onSubscribe(eVar);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            this.f16418b = true;
            eVar.dispose();
            io.reactivex.rxjava3.plugins.a.Y(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
    public void onSuccess(@l3.f T t5) {
        if (!this.f16418b) {
            try {
                this.f16417a.onSuccess(t5);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }
    }
}
