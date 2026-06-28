package org.reactivestreams;

/* loaded from: classes4.dex */
public interface p<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t5);

    void onSubscribe(q qVar);
}
