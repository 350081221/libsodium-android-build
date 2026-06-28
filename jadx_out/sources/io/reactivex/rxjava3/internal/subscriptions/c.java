package io.reactivex.rxjava3.internal.subscriptions;

import io.reactivex.rxjava3.internal.fuseable.n;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public abstract class c<T> extends AtomicInteger implements n<T> {
    private static final long serialVersionUID = -6671519529404341862L;

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    public final boolean offer(T t5) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    public final boolean offer(T t5, T t6) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
