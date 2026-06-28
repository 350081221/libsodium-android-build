package io.reactivex.rxjava3.internal.observers;

/* loaded from: classes3.dex */
public interface u<T> {
    void drain();

    void innerComplete(t<T> tVar);

    void innerError(t<T> tVar, Throwable th);

    void innerNext(t<T> tVar, T t5);
}
