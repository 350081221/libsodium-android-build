package io.reactivex.rxjava3.disposables;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
abstract class h<T> extends AtomicReference<T> implements e {
    private static final long serialVersionUID = 6537757548749041217L;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(T t5) {
        super(t5);
        Objects.requireNonNull(t5, "value is null");
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public final void dispose() {
        T andSet;
        if (get() != null && (andSet = getAndSet(null)) != null) {
            onDisposed(andSet);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public final boolean isDisposed() {
        return get() == null;
    }

    protected abstract void onDisposed(@l3.f T t5);
}
