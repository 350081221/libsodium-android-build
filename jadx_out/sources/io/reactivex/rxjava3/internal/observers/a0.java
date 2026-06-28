package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.u0;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class a0<T> implements u0<T> {

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference<io.reactivex.rxjava3.disposables.e> f16413a;

    /* renamed from: b, reason: collision with root package name */
    final u0<? super T> f16414b;

    public a0(AtomicReference<io.reactivex.rxjava3.disposables.e> atomicReference, u0<? super T> u0Var) {
        this.f16413a = atomicReference;
        this.f16414b = u0Var;
    }

    @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
    public void onError(Throwable th) {
        this.f16414b.onError(th);
    }

    @Override // io.reactivex.rxjava3.core.u0, io.reactivex.rxjava3.core.f
    public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
        io.reactivex.rxjava3.internal.disposables.c.replace(this.f16413a, eVar);
    }

    @Override // io.reactivex.rxjava3.core.u0
    public void onSuccess(T t5) {
        this.f16414b.onSuccess(t5);
    }
}
