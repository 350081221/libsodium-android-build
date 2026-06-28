package io.reactivex.rxjava3.core;

/* loaded from: classes3.dex */
public interface p0<T> {
    void onComplete();

    void onError(@l3.f Throwable th);

    void onNext(@l3.f T t5);

    void onSubscribe(@l3.f io.reactivex.rxjava3.disposables.e eVar);
}
