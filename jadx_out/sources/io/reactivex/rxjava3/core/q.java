package io.reactivex.rxjava3.core;

/* loaded from: classes3.dex */
public interface q<T> extends k<T> {
    boolean isCancelled();

    long requested();

    @l3.f
    q<T> serialize();

    void setCancellable(@l3.g m3.f fVar);

    void setDisposable(@l3.g io.reactivex.rxjava3.disposables.e eVar);

    boolean tryOnError(@l3.f Throwable th);
}
