package io.reactivex.rxjava3.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class x0<T> extends io.reactivex.rxjava3.core.o<T> {

    /* renamed from: b, reason: collision with root package name */
    final m3.s<? extends Throwable> f17134b;

    public x0(m3.s<? extends Throwable> sVar) {
        this.f17134b = sVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    public void O6(org.reactivestreams.p<? super T> pVar) {
        try {
            th = (Throwable) io.reactivex.rxjava3.internal.util.k.d(this.f17134b.get(), "Callable returned a null Throwable.");
        } catch (Throwable th) {
            th = th;
            io.reactivex.rxjava3.exceptions.b.b(th);
        }
        io.reactivex.rxjava3.internal.subscriptions.g.error(th, pVar);
    }
}
