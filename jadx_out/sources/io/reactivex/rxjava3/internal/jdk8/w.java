package io.reactivex.rxjava3.internal.jdk8;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class w<T> extends z<T> {

    /* renamed from: c, reason: collision with root package name */
    final boolean f16399c;

    /* renamed from: d, reason: collision with root package name */
    final T f16400d;

    public w(boolean z4, T t5) {
        this.f16399c = z4;
        this.f16400d = t5;
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onComplete() {
        if (!isDone()) {
            T t5 = this.f16407b;
            a();
            if (t5 != null) {
                complete(t5);
            } else if (this.f16399c) {
                complete(this.f16400d);
            } else {
                completeExceptionally(new NoSuchElementException());
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onNext(T t5) {
        this.f16407b = t5;
    }
}
