package io.reactivex.rxjava3.internal.operators.completable;

/* loaded from: classes3.dex */
public final class q extends io.reactivex.rxjava3.core.c {

    /* renamed from: a, reason: collision with root package name */
    final m3.a f16570a;

    public q(m3.a aVar) {
        this.f16570a = aVar;
    }

    @Override // io.reactivex.rxjava3.core.c
    protected void Y0(io.reactivex.rxjava3.core.f fVar) {
        io.reactivex.rxjava3.disposables.e j5 = io.reactivex.rxjava3.disposables.e.j();
        fVar.onSubscribe(j5);
        if (!j5.isDisposed()) {
            try {
                this.f16570a.run();
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
}
