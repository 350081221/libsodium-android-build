package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.u0;

/* loaded from: classes3.dex */
public final class d0<T> implements u0<T> {

    /* renamed from: a, reason: collision with root package name */
    final u0<? super T> f16419a;

    /* renamed from: b, reason: collision with root package name */
    boolean f16420b;

    public d0(u0<? super T> u0Var) {
        this.f16419a = u0Var;
    }

    @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
    public void onError(@l3.f Throwable th) {
        if (this.f16420b) {
            io.reactivex.rxjava3.plugins.a.Y(th);
            return;
        }
        try {
            this.f16419a.onError(th);
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.b.b(th2);
            io.reactivex.rxjava3.plugins.a.Y(new io.reactivex.rxjava3.exceptions.a(th, th2));
        }
    }

    @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
    public void onSubscribe(@l3.f io.reactivex.rxjava3.disposables.e eVar) {
        try {
            this.f16419a.onSubscribe(eVar);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            this.f16420b = true;
            eVar.dispose();
            io.reactivex.rxjava3.plugins.a.Y(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.u0
    public void onSuccess(@l3.f T t5) {
        if (!this.f16420b) {
            try {
                this.f16419a.onSuccess(t5);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }
    }
}
