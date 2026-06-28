package io.reactivex.rxjava3.internal.fuseable;

/* loaded from: classes3.dex */
public abstract class a<T> implements n<T>, l<T> {
    @Override // org.reactivestreams.q
    public void cancel() {
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    public final void clear() {
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public void dispose() {
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public boolean isDisposed() {
        return false;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    public final boolean isEmpty() {
        return true;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    public final boolean offer(@l3.f T t5) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    public final T poll() throws Throwable {
        return null;
    }

    @Override // org.reactivestreams.q
    public final void request(long j5) {
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.m
    public final int requestFusion(int i5) {
        return i5 & 2;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    public final boolean offer(@l3.f T t5, @l3.f T t6) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
