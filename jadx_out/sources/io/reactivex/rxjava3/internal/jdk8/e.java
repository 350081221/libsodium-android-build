package io.reactivex.rxjava3.internal.jdk8;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class e<T> extends l<T> {

    /* renamed from: c, reason: collision with root package name */
    final boolean f16336c;

    /* renamed from: d, reason: collision with root package name */
    final T f16337d;

    public e(boolean z4, T t5) {
        this.f16336c = z4;
        this.f16337d = t5;
    }

    @Override // io.reactivex.rxjava3.internal.jdk8.l
    protected void a(org.reactivestreams.q qVar) {
        qVar.request(1L);
    }

    @Override // org.reactivestreams.p
    public void onComplete() {
        if (!isDone()) {
            c();
            if (this.f16336c) {
                complete(this.f16337d);
            } else {
                completeExceptionally(new NoSuchElementException());
            }
        }
    }

    @Override // org.reactivestreams.p
    public void onNext(T t5) {
        complete(t5);
    }
}
