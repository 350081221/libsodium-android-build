package io.reactivex.rxjava3.internal.operators.completable;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class p extends io.reactivex.rxjava3.core.c {

    /* renamed from: a, reason: collision with root package name */
    final m3.s<? extends Throwable> f16566a;

    public p(m3.s<? extends Throwable> sVar) {
        this.f16566a = sVar;
    }

    @Override // io.reactivex.rxjava3.core.c
    protected void Y0(io.reactivex.rxjava3.core.f fVar) {
        try {
            Throwable th = this.f16566a.get();
            Objects.requireNonNull(th, "The error returned is null");
            th = th;
        } catch (Throwable th2) {
            th = th2;
            io.reactivex.rxjava3.exceptions.b.b(th);
        }
        io.reactivex.rxjava3.internal.disposables.d.error(th, fVar);
    }
}
