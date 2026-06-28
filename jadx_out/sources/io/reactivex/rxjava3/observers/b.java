package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.core.p0;

/* loaded from: classes3.dex */
public abstract class b<T> implements p0<T> {

    /* renamed from: a, reason: collision with root package name */
    private io.reactivex.rxjava3.disposables.e f18714a;

    protected final void a() {
        io.reactivex.rxjava3.disposables.e eVar = this.f18714a;
        this.f18714a = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
        eVar.dispose();
    }

    protected void b() {
    }

    @Override // io.reactivex.rxjava3.core.p0
    public final void onSubscribe(@l3.f io.reactivex.rxjava3.disposables.e eVar) {
        if (io.reactivex.rxjava3.internal.util.i.e(this.f18714a, eVar, getClass())) {
            this.f18714a = eVar;
            b();
        }
    }
}
