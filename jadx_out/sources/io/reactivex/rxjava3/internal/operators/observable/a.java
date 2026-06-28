package io.reactivex.rxjava3.internal.operators.observable;

/* loaded from: classes3.dex */
abstract class a<T, U> extends io.reactivex.rxjava3.core.i0<U> implements io.reactivex.rxjava3.internal.fuseable.i<T> {

    /* renamed from: a, reason: collision with root package name */
    protected final io.reactivex.rxjava3.core.n0<T> f17528a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(io.reactivex.rxjava3.core.n0<T> n0Var) {
        this.f17528a = n0Var;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.i
    public final io.reactivex.rxjava3.core.n0<T> source() {
        return this.f17528a;
    }
}
