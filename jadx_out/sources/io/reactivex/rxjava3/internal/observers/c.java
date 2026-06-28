package io.reactivex.rxjava3.internal.observers;

/* loaded from: classes3.dex */
public abstract class c<T> implements io.reactivex.rxjava3.internal.fuseable.l<T> {
    @Override // io.reactivex.rxjava3.internal.fuseable.q
    public final boolean offer(T t5) {
        throw new UnsupportedOperationException("Should not be called");
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    public final boolean offer(T t5, T t6) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
