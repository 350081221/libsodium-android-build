package io.reactivex.rxjava3.internal.operators.completable;

/* loaded from: classes3.dex */
public final class z extends io.reactivex.rxjava3.core.c {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.i f16596a;

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.h f16597b;

    public z(io.reactivex.rxjava3.core.i iVar, io.reactivex.rxjava3.core.h hVar) {
        this.f16596a = iVar;
        this.f16597b = hVar;
    }

    @Override // io.reactivex.rxjava3.core.c
    protected void Y0(io.reactivex.rxjava3.core.f fVar) {
        try {
            this.f16596a.a(this.f16597b.a(fVar));
        } catch (NullPointerException e5) {
            throw e5;
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.plugins.a.Y(th);
        }
    }
}
