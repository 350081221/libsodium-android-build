package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.p0;

/* loaded from: classes3.dex */
public abstract class w<T, U, V> extends y implements p0<T>, io.reactivex.rxjava3.internal.util.r<U, V> {
    protected final p0<? super V> F;
    protected final io.reactivex.rxjava3.internal.fuseable.p<U> G;
    protected volatile boolean H;
    protected volatile boolean I;
    protected Throwable J;

    public w(p0<? super V> p0Var, io.reactivex.rxjava3.internal.fuseable.p<U> pVar) {
        this.F = p0Var;
        this.G = pVar;
    }

    @Override // io.reactivex.rxjava3.internal.util.r
    public final int a(int i5) {
        return this.f16467p.addAndGet(i5);
    }

    @Override // io.reactivex.rxjava3.internal.util.r
    public final boolean b() {
        return this.f16467p.getAndIncrement() == 0;
    }

    @Override // io.reactivex.rxjava3.internal.util.r
    public final boolean c() {
        return this.I;
    }

    @Override // io.reactivex.rxjava3.internal.util.r
    public final boolean d() {
        return this.H;
    }

    @Override // io.reactivex.rxjava3.internal.util.r
    public final Throwable e() {
        return this.J;
    }

    @Override // io.reactivex.rxjava3.internal.util.r
    public void g(p0<? super V> p0Var, U u4) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void o(U u4, boolean z4, io.reactivex.rxjava3.disposables.e eVar) {
        p0<? super V> p0Var = this.F;
        io.reactivex.rxjava3.internal.fuseable.p<U> pVar = this.G;
        if (this.f16467p.get() == 0 && this.f16467p.compareAndSet(0, 1)) {
            g(p0Var, u4);
            if (a(-1) == 0) {
                return;
            }
        } else {
            pVar.offer(u4);
            if (!b()) {
                return;
            }
        }
        io.reactivex.rxjava3.internal.util.v.d(pVar, p0Var, z4, eVar, this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void q(U u4, boolean z4, io.reactivex.rxjava3.disposables.e eVar) {
        p0<? super V> p0Var = this.F;
        io.reactivex.rxjava3.internal.fuseable.p<U> pVar = this.G;
        if (this.f16467p.get() == 0 && this.f16467p.compareAndSet(0, 1)) {
            if (pVar.isEmpty()) {
                g(p0Var, u4);
                if (a(-1) == 0) {
                    return;
                }
            } else {
                pVar.offer(u4);
            }
        } else {
            pVar.offer(u4);
            if (!b()) {
                return;
            }
        }
        io.reactivex.rxjava3.internal.util.v.d(pVar, p0Var, z4, eVar, this);
    }
}
