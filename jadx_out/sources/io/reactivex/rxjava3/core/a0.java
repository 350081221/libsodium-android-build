package io.reactivex.rxjava3.core;

/* loaded from: classes3.dex */
public interface a0<T> {
    void onComplete();

    void onError(@l3.f Throwable th);

    void onSubscribe(@l3.f io.reactivex.rxjava3.disposables.e eVar);

    void onSuccess(@l3.f T t5);
}
