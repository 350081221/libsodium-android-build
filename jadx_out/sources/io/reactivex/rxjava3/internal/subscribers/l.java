package io.reactivex.rxjava3.internal.subscribers;

/* loaded from: classes3.dex */
public interface l<T> {
    void drain();

    void innerComplete(k<T> kVar);

    void innerError(k<T> kVar, Throwable th);

    void innerNext(k<T> kVar, T t5);
}
