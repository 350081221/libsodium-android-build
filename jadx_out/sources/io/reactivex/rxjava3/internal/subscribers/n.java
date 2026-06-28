package io.reactivex.rxjava3.internal.subscribers;

/* loaded from: classes3.dex */
public abstract class n<T, U, V> extends r implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.internal.util.u<U, V> {
    protected volatile boolean A0;
    protected Throwable B0;

    /* renamed from: x0, reason: collision with root package name */
    protected final org.reactivestreams.p<? super V> f18648x0;

    /* renamed from: y0, reason: collision with root package name */
    protected final io.reactivex.rxjava3.internal.fuseable.p<U> f18649y0;

    /* renamed from: z0, reason: collision with root package name */
    protected volatile boolean f18650z0;

    public n(org.reactivestreams.p<? super V> pVar, io.reactivex.rxjava3.internal.fuseable.p<U> pVar2) {
        this.f18648x0 = pVar;
        this.f18649y0 = pVar2;
    }

    @Override // io.reactivex.rxjava3.internal.util.u
    public final int a(int i5) {
        return this.f18681p.addAndGet(i5);
    }

    @Override // io.reactivex.rxjava3.internal.util.u
    public final boolean b() {
        return this.f18681p.getAndIncrement() == 0;
    }

    @Override // io.reactivex.rxjava3.internal.util.u
    public final boolean c() {
        return this.A0;
    }

    @Override // io.reactivex.rxjava3.internal.util.u
    public final boolean d() {
        return this.f18650z0;
    }

    @Override // io.reactivex.rxjava3.internal.util.u
    public final Throwable e() {
        return this.B0;
    }

    public boolean g(org.reactivestreams.p<? super V> pVar, U u4) {
        return false;
    }

    @Override // io.reactivex.rxjava3.internal.util.u
    public final long o(long j5) {
        return this.F.addAndGet(-j5);
    }

    public final boolean q() {
        return this.f18681p.get() == 0 && this.f18681p.compareAndSet(0, 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void r(U u4, boolean z4, io.reactivex.rxjava3.disposables.e eVar) {
        org.reactivestreams.p<? super V> pVar = this.f18648x0;
        io.reactivex.rxjava3.internal.fuseable.p<U> pVar2 = this.f18649y0;
        if (q()) {
            long j5 = this.F.get();
            if (j5 != 0) {
                if (g(pVar, u4) && j5 != Long.MAX_VALUE) {
                    o(1L);
                }
                if (a(-1) == 0) {
                    return;
                }
            } else {
                eVar.dispose();
                pVar.onError(new io.reactivex.rxjava3.exceptions.c("Could not emit buffer due to lack of requests"));
                return;
            }
        } else {
            pVar2.offer(u4);
            if (!b()) {
                return;
            }
        }
        io.reactivex.rxjava3.internal.util.v.e(pVar2, pVar, z4, eVar, this);
    }

    @Override // io.reactivex.rxjava3.internal.util.u
    public final long requested() {
        return this.F.get();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void s(U u4, boolean z4, io.reactivex.rxjava3.disposables.e eVar) {
        org.reactivestreams.p<? super V> pVar = this.f18648x0;
        io.reactivex.rxjava3.internal.fuseable.p<U> pVar2 = this.f18649y0;
        if (q()) {
            long j5 = this.F.get();
            if (j5 != 0) {
                if (pVar2.isEmpty()) {
                    if (g(pVar, u4) && j5 != Long.MAX_VALUE) {
                        o(1L);
                    }
                    if (a(-1) == 0) {
                        return;
                    }
                } else {
                    pVar2.offer(u4);
                }
            } else {
                this.f18650z0 = true;
                eVar.dispose();
                pVar.onError(new io.reactivex.rxjava3.exceptions.c("Could not emit buffer due to lack of requests"));
                return;
            }
        } else {
            pVar2.offer(u4);
            if (!b()) {
                return;
            }
        }
        io.reactivex.rxjava3.internal.util.v.e(pVar2, pVar, z4, eVar, this);
    }

    public final void t(long j5) {
        if (io.reactivex.rxjava3.internal.subscriptions.j.validate(j5)) {
            io.reactivex.rxjava3.internal.util.d.a(this.F, j5);
        }
    }
}
