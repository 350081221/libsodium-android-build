package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.core.a0;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public abstract class i<T> implements a0<T>, io.reactivex.rxjava3.disposables.e {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<io.reactivex.rxjava3.disposables.e> f18721a = new AtomicReference<>();

    /* renamed from: b, reason: collision with root package name */
    private final io.reactivex.rxjava3.internal.disposables.e f18722b = new io.reactivex.rxjava3.internal.disposables.e();

    public final void a(@l3.f io.reactivex.rxjava3.disposables.e eVar) {
        Objects.requireNonNull(eVar, "resource is null");
        this.f18722b.b(eVar);
    }

    protected void b() {
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public final void dispose() {
        if (io.reactivex.rxjava3.internal.disposables.c.dispose(this.f18721a)) {
            this.f18722b.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public final boolean isDisposed() {
        return io.reactivex.rxjava3.internal.disposables.c.isDisposed(this.f18721a.get());
    }

    @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
    public final void onSubscribe(@l3.f io.reactivex.rxjava3.disposables.e eVar) {
        if (io.reactivex.rxjava3.internal.util.i.c(this.f18721a, eVar, getClass())) {
            b();
        }
    }
}
