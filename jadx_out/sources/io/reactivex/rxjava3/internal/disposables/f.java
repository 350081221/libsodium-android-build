package io.reactivex.rxjava3.internal.disposables;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class f extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.disposables.e {
    private static final long serialVersionUID = -754898800686245608L;

    public f() {
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public void dispose() {
        c.dispose(this);
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public boolean isDisposed() {
        return c.isDisposed(get());
    }

    public boolean replace(io.reactivex.rxjava3.disposables.e eVar) {
        return c.replace(this, eVar);
    }

    public boolean update(io.reactivex.rxjava3.disposables.e eVar) {
        return c.set(this, eVar);
    }

    public f(io.reactivex.rxjava3.disposables.e eVar) {
        lazySet(eVar);
    }
}
