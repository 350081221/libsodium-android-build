package io.reactivex.rxjava3.internal.operators.completable;

/* loaded from: classes3.dex */
public final class w extends io.reactivex.rxjava3.core.c {

    /* renamed from: a, reason: collision with root package name */
    final m3.s<?> f16591a;

    public w(m3.s<?> sVar) {
        this.f16591a = sVar;
    }

    @Override // io.reactivex.rxjava3.core.c
    protected void Y0(io.reactivex.rxjava3.core.f fVar) {
        io.reactivex.rxjava3.disposables.e j5 = io.reactivex.rxjava3.disposables.e.j();
        fVar.onSubscribe(j5);
        try {
            this.f16591a.get();
            if (!j5.isDisposed()) {
                fVar.onComplete();
            }
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            if (!j5.isDisposed()) {
                fVar.onError(th);
            } else {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }
    }
}
