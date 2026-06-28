package io.reactivex.rxjava3.observers;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public abstract class c implements io.reactivex.rxjava3.core.f, io.reactivex.rxjava3.disposables.e {

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference<io.reactivex.rxjava3.disposables.e> f18715a = new AtomicReference<>();

    protected void a() {
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public final void dispose() {
        io.reactivex.rxjava3.internal.disposables.c.dispose(this.f18715a);
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public final boolean isDisposed() {
        return this.f18715a.get() == io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
    }

    @Override // io.reactivex.rxjava3.core.f
    public final void onSubscribe(@l3.f io.reactivex.rxjava3.disposables.e eVar) {
        if (io.reactivex.rxjava3.internal.util.i.c(this.f18715a, eVar, getClass())) {
            a();
        }
    }
}
