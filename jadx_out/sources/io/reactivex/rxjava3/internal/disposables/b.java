package io.reactivex.rxjava3.internal.disposables;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class b extends AtomicReference<m3.f> implements io.reactivex.rxjava3.disposables.e {
    private static final long serialVersionUID = 5718521705281392066L;

    public b(m3.f fVar) {
        super(fVar);
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public void dispose() {
        m3.f andSet;
        if (get() != null && (andSet = getAndSet(null)) != null) {
            try {
                andSet.cancel();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public boolean isDisposed() {
        return get() == null;
    }
}
