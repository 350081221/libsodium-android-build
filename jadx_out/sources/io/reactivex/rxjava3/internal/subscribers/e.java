package io.reactivex.rxjava3.internal.subscribers;

/* loaded from: classes3.dex */
public final class e<T> extends c<T> {
    @Override // org.reactivestreams.p
    public void onError(Throwable th) {
        this.f18641a = null;
        this.f18642b = th;
        countDown();
    }

    @Override // org.reactivestreams.p
    public void onNext(T t5) {
        this.f18641a = t5;
    }
}
