package io.reactivex.rxjava3.core;

/* loaded from: classes3.dex */
public interface z<T> {
    boolean isDisposed();

    void onComplete();

    void onError(@l3.f Throwable th);

    void onSuccess(@l3.f T t5);

    void setCancellable(@l3.g m3.f fVar);

    void setDisposable(@l3.g io.reactivex.rxjava3.disposables.e eVar);

    boolean tryOnError(@l3.f Throwable th);
}
