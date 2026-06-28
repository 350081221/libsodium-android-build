package io.reactivex.rxjava3.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class h1<T> extends io.reactivex.rxjava3.core.o<T> implements m3.s<T> {

    /* renamed from: b, reason: collision with root package name */
    final m3.a f16776b;

    public h1(m3.a aVar) {
        this.f16776b = aVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        io.reactivex.rxjava3.internal.fuseable.b bVar = new io.reactivex.rxjava3.internal.fuseable.b();
        pVar.onSubscribe(bVar);
        if (!bVar.isDisposed()) {
            try {
                this.f16776b.run();
                if (!bVar.isDisposed()) {
                    pVar.onComplete();
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                if (!bVar.isDisposed()) {
                    pVar.onError(th);
                } else {
                    io.reactivex.rxjava3.plugins.a.Y(th);
                }
            }
        }
    }

    @Override // m3.s
    public T get() throws Throwable {
        this.f16776b.run();
        return null;
    }
}
