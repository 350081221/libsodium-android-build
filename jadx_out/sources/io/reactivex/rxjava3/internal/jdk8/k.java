package io.reactivex.rxjava3.internal.jdk8;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class k<T> extends l<T> {

    /* renamed from: c, reason: collision with root package name */
    final boolean f16361c;

    /* renamed from: d, reason: collision with root package name */
    final T f16362d;

    public k(boolean z4, T t5) {
        this.f16361c = z4;
        this.f16362d = t5;
    }

    @Override // io.reactivex.rxjava3.internal.jdk8.l
    protected void a(org.reactivestreams.q qVar) {
        qVar.request(2L);
    }

    @Override // org.reactivestreams.p
    public void onComplete() {
        if (!isDone()) {
            T t5 = this.f16364b;
            c();
            if (t5 != null) {
                complete(t5);
            } else if (this.f16361c) {
                complete(this.f16362d);
            } else {
                completeExceptionally(new NoSuchElementException());
            }
        }
    }

    @Override // org.reactivestreams.p
    public void onNext(T t5) {
        if (this.f16364b != null) {
            this.f16364b = null;
            completeExceptionally(new IllegalArgumentException("Sequence contains more than one element!"));
        } else {
            this.f16364b = t5;
        }
    }
}
