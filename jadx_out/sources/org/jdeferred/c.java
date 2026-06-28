package org.jdeferred;

import java.util.concurrent.Callable;
import org.jdeferred.e;

/* loaded from: classes4.dex */
public abstract class c<D, P> implements Callable<D> {

    /* renamed from: a, reason: collision with root package name */
    private final b<D, Throwable, P> f21556a;

    /* renamed from: b, reason: collision with root package name */
    private final e.a f21557b;

    public c() {
        this.f21556a = new org.jdeferred.impl.d();
        this.f21557b = e.a.DEFAULT;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b<D, Throwable, P> a() {
        return this.f21556a;
    }

    public e.a b() {
        return this.f21557b;
    }

    protected void c(P p5) {
        this.f21556a.q(p5);
    }

    public c(e.a aVar) {
        this.f21556a = new org.jdeferred.impl.d();
        this.f21557b = aVar;
    }
}
