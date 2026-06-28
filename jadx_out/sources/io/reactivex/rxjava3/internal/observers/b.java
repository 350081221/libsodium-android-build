package io.reactivex.rxjava3.internal.observers;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public abstract class b<T> extends AtomicInteger implements io.reactivex.rxjava3.internal.fuseable.l<T> {
    private static final long serialVersionUID = -1001730202384742097L;

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    public final boolean offer(T t5) {
        throw new UnsupportedOperationException("Should not be called");
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    public final boolean offer(T t5, T t6) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
