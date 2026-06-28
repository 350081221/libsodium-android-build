package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.core.a0;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public abstract class d<T> implements a0<T>, io.reactivex.rxjava3.disposables.e {

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference<io.reactivex.rxjava3.disposables.e> f18716a = new AtomicReference<>();

    protected void a() {
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public final void dispose() {
        io.reactivex.rxjava3.internal.disposables.c.dispose(this.f18716a);
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public final boolean isDisposed() {
        return this.f18716a.get() == io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
    }

    @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
    public final void onSubscribe(@l3.f io.reactivex.rxjava3.disposables.e eVar) {
        if (io.reactivex.rxjava3.internal.util.i.c(this.f18716a, eVar, getClass())) {
            a();
        }
    }
}
