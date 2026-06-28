package io.reactivex.rxjava3.internal.jdk8;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class s<T> extends z<T> {

    /* renamed from: c, reason: collision with root package name */
    final boolean f16387c;

    /* renamed from: d, reason: collision with root package name */
    final T f16388d;

    public s(boolean z4, T t5) {
        this.f16387c = z4;
        this.f16388d = t5;
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onComplete() {
        if (!isDone()) {
            a();
            if (this.f16387c) {
                complete(this.f16388d);
            } else {
                completeExceptionally(new NoSuchElementException());
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onNext(T t5) {
        complete(t5);
    }
}
