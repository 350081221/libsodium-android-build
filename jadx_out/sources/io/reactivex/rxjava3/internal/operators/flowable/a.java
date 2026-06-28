package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Objects;

/* loaded from: classes3.dex */
abstract class a<T, R> extends io.reactivex.rxjava3.core.o<R> implements io.reactivex.rxjava3.internal.fuseable.j<T> {

    /* renamed from: b, reason: collision with root package name */
    protected final io.reactivex.rxjava3.core.o<T> f16598b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(io.reactivex.rxjava3.core.o<T> oVar) {
        Objects.requireNonNull(oVar, "source is null");
        this.f16598b = oVar;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.j
    public final org.reactivestreams.o<T> source() {
        return this.f16598b;
    }
}
