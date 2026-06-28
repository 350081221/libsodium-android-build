package io.reactivex.rxjava3.internal.subscribers;

/* loaded from: classes3.dex */
public final class d<T> extends c<T> {
    @Override // org.reactivestreams.p
    public void onError(Throwable th) {
        if (this.f18641a == null) {
            this.f18642b = th;
        } else {
            io.reactivex.rxjava3.plugins.a.Y(th);
        }
        countDown();
    }

    @Override // org.reactivestreams.p
    public void onNext(T t5) {
        if (this.f18641a == null) {
            this.f18641a = t5;
            this.f18643c.cancel();
            countDown();
        }
    }
}
