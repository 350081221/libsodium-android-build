package io.reactivex.rxjava3.disposables;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class j implements e {

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference<e> f16243a;

    public j() {
        this.f16243a = new AtomicReference<>();
    }

    @l3.g
    public e a() {
        e eVar = this.f16243a.get();
        if (eVar == io.reactivex.rxjava3.internal.disposables.c.DISPOSED) {
            return e.h();
        }
        return eVar;
    }

    public boolean b(@l3.g e eVar) {
        return io.reactivex.rxjava3.internal.disposables.c.replace(this.f16243a, eVar);
    }

    public boolean c(@l3.g e eVar) {
        return io.reactivex.rxjava3.internal.disposables.c.set(this.f16243a, eVar);
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public void dispose() {
        io.reactivex.rxjava3.internal.disposables.c.dispose(this.f16243a);
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public boolean isDisposed() {
        return io.reactivex.rxjava3.internal.disposables.c.isDisposed(this.f16243a.get());
    }

    public j(@l3.g e eVar) {
        this.f16243a = new AtomicReference<>(eVar);
    }
}
