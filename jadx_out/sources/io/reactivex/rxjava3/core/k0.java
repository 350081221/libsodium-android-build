package io.reactivex.rxjava3.core;

/* loaded from: classes3.dex */
public interface k0<T> extends k<T> {
    boolean isDisposed();

    @l3.f
    k0<T> serialize();

    void setCancellable(@l3.g m3.f fVar);

    void setDisposable(@l3.g io.reactivex.rxjava3.disposables.e eVar);

    boolean tryOnError(@l3.f Throwable th);
}
