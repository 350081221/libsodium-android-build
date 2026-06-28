package io.reactivex.rxjava3.internal.fuseable;

/* loaded from: classes3.dex */
public final class b<T> extends a<T> {

    /* renamed from: a, reason: collision with root package name */
    volatile boolean f16290a;

    @Override // io.reactivex.rxjava3.internal.fuseable.a, org.reactivestreams.q
    public void cancel() {
        this.f16290a = true;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.a, io.reactivex.rxjava3.disposables.e
    public void dispose() {
        this.f16290a = true;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.a, io.reactivex.rxjava3.disposables.e
    public boolean isDisposed() {
        return this.f16290a;
    }
}
