package io.reactivex.rxjava3.internal.operators.completable;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class h extends io.reactivex.rxjava3.core.c {

    /* renamed from: a, reason: collision with root package name */
    final m3.s<? extends io.reactivex.rxjava3.core.i> f16503a;

    public h(m3.s<? extends io.reactivex.rxjava3.core.i> sVar) {
        this.f16503a = sVar;
    }

    @Override // io.reactivex.rxjava3.core.c
    protected void Y0(io.reactivex.rxjava3.core.f fVar) {
        try {
            io.reactivex.rxjava3.core.i iVar = this.f16503a.get();
            Objects.requireNonNull(iVar, "The completableSupplier returned a null CompletableSource");
            iVar.a(fVar);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.internal.disposables.d.error(th, fVar);
        }
    }
}
