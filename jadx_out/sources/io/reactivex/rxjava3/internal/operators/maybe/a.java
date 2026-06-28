package io.reactivex.rxjava3.internal.operators.maybe;

/* loaded from: classes3.dex */
abstract class a<T, R> extends io.reactivex.rxjava3.core.x<R> implements io.reactivex.rxjava3.internal.fuseable.h<T> {

    /* renamed from: a, reason: collision with root package name */
    protected final io.reactivex.rxjava3.core.d0<T> f17232a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(io.reactivex.rxjava3.core.d0<T> d0Var) {
        this.f17232a = d0Var;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.h
    public final io.reactivex.rxjava3.core.d0<T> source() {
        return this.f17232a;
    }
}
