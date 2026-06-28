package org.jdeferred;

import org.jdeferred.e;

/* loaded from: classes4.dex */
public abstract class f<P> implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final b<Void, Throwable, P> f21560a;

    /* renamed from: b, reason: collision with root package name */
    private final e.a f21561b;

    public f() {
        this.f21560a = new org.jdeferred.impl.d();
        this.f21561b = e.a.DEFAULT;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b<Void, Throwable, P> a() {
        return this.f21560a;
    }

    public e.a b() {
        return this.f21561b;
    }

    protected void c(P p5) {
        this.f21560a.q(p5);
    }

    public f(e.a aVar) {
        this.f21560a = new org.jdeferred.impl.d();
        this.f21561b = aVar;
    }
}
