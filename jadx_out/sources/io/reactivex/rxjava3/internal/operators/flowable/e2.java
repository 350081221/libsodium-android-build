package io.reactivex.rxjava3.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class e2<R, T> extends a<T, R> {

    /* renamed from: c, reason: collision with root package name */
    final io.reactivex.rxjava3.core.s<? extends R, ? super T> f16716c;

    public e2(io.reactivex.rxjava3.core.o<T> oVar, io.reactivex.rxjava3.core.s<? extends R, ? super T> sVar) {
        super(oVar);
        this.f16716c = sVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    public void O6(org.reactivestreams.p<? super R> pVar) {
        try {
            org.reactivestreams.p<? super Object> a5 = this.f16716c.a(pVar);
            if (a5 != null) {
                this.f16598b.subscribe(a5);
                return;
            }
            throw new NullPointerException("Operator " + this.f16716c + " returned a null Subscriber");
        } catch (NullPointerException e5) {
            throw e5;
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.plugins.a.Y(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
