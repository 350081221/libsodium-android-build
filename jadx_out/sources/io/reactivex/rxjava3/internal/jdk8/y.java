package io.reactivex.rxjava3.internal.jdk8;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class y<T> extends z<T> {

    /* renamed from: c, reason: collision with root package name */
    final boolean f16404c;

    /* renamed from: d, reason: collision with root package name */
    final T f16405d;

    public y(boolean z4, T t5) {
        this.f16404c = z4;
        this.f16405d = t5;
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onComplete() {
        if (!isDone()) {
            T t5 = this.f16407b;
            a();
            if (t5 != null) {
                complete(t5);
            } else if (this.f16404c) {
                complete(this.f16405d);
            } else {
                completeExceptionally(new NoSuchElementException());
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onNext(T t5) {
        if (this.f16407b != null) {
            this.f16407b = null;
            completeExceptionally(new IllegalArgumentException("Sequence contains more than one element!"));
        } else {
            this.f16407b = t5;
        }
    }
}
