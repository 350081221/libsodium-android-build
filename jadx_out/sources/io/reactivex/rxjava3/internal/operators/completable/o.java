package io.reactivex.rxjava3.internal.operators.completable;

/* loaded from: classes3.dex */
public final class o extends io.reactivex.rxjava3.core.c {

    /* renamed from: a, reason: collision with root package name */
    final Throwable f16552a;

    public o(Throwable th) {
        this.f16552a = th;
    }

    @Override // io.reactivex.rxjava3.core.c
    protected void Y0(io.reactivex.rxjava3.core.f fVar) {
        io.reactivex.rxjava3.internal.disposables.d.error(this.f16552a, fVar);
    }
}
