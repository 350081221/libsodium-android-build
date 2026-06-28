package io.reactivex.rxjava3.internal.jdk8;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class i<T> extends l<T> {

    /* renamed from: c, reason: collision with root package name */
    final boolean f16355c;

    /* renamed from: d, reason: collision with root package name */
    final T f16356d;

    public i(boolean z4, T t5) {
        this.f16355c = z4;
        this.f16356d = t5;
    }

    @Override // io.reactivex.rxjava3.internal.jdk8.l
    protected void a(org.reactivestreams.q qVar) {
        qVar.request(Long.MAX_VALUE);
    }

    @Override // org.reactivestreams.p
    public void onComplete() {
        if (!isDone()) {
            T t5 = this.f16364b;
            c();
            if (t5 != null) {
                complete(t5);
            } else if (this.f16355c) {
                complete(this.f16356d);
            } else {
                completeExceptionally(new NoSuchElementException());
            }
        }
    }

    @Override // org.reactivestreams.p
    public void onNext(T t5) {
        this.f16364b = t5;
    }
}
