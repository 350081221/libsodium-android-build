package io.reactivex.rxjava3.internal.observers;

/* loaded from: classes3.dex */
public final class h<T> extends e<T> {
    @Override // io.reactivex.rxjava3.core.p0
    public void onError(Throwable th) {
        this.f16421a = null;
        this.f16422b = th;
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onNext(T t5) {
        this.f16421a = t5;
    }
}
