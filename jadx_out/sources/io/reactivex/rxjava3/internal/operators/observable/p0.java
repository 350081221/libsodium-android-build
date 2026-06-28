package io.reactivex.rxjava3.internal.operators.observable;

/* loaded from: classes3.dex */
public final class p0<T> extends a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    private final m3.g<? super io.reactivex.rxjava3.disposables.e> f17948b;

    /* renamed from: c, reason: collision with root package name */
    private final m3.a f17949c;

    public p0(io.reactivex.rxjava3.core.i0<T> i0Var, m3.g<? super io.reactivex.rxjava3.disposables.e> gVar, m3.a aVar) {
        super(i0Var);
        this.f17948b = gVar;
        this.f17949c = aVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        this.f17528a.subscribe(new io.reactivex.rxjava3.internal.observers.o(p0Var, this.f17948b, this.f17949c));
    }
}
