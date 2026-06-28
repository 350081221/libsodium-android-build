package org.jdeferred.impl;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jdeferred.i;
import org.jdeferred.j;
import org.jdeferred.k;
import org.jdeferred.l;
import org.jdeferred.m;
import org.jdeferred.n;
import org.jdeferred.o;
import org.jdeferred.p;

/* loaded from: classes4.dex */
public abstract class b<D, F, P> implements p<D, F, P> {

    /* renamed from: a, reason: collision with root package name */
    protected final org.slf4j.a f21565a = org.slf4j.b.f(b.class);

    /* renamed from: b, reason: collision with root package name */
    protected volatile p.a f21566b = p.a.PENDING;

    /* renamed from: c, reason: collision with root package name */
    protected final List<org.jdeferred.g<D>> f21567c = new CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    protected final List<j<F>> f21568d = new CopyOnWriteArrayList();

    /* renamed from: e, reason: collision with root package name */
    protected final List<m<P>> f21569e = new CopyOnWriteArrayList();

    /* renamed from: f, reason: collision with root package name */
    protected final List<org.jdeferred.a<D, F>> f21570f = new CopyOnWriteArrayList();

    /* renamed from: g, reason: collision with root package name */
    protected D f21571g;

    /* renamed from: h, reason: collision with root package name */
    protected F f21572h;

    /* JADX INFO: Access modifiers changed from: protected */
    public void A(org.jdeferred.g<D> gVar, D d5) {
        gVar.a(d5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void B(F f5) {
        Iterator<j<F>> it = this.f21568d.iterator();
        while (it.hasNext()) {
            try {
                C(it.next(), f5);
            } catch (Exception e5) {
                this.f21565a.error("an uncaught exception occured in a FailCallback", (Throwable) e5);
            }
        }
        this.f21568d.clear();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void C(j<F> jVar, F f5) {
        jVar.onFail(f5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void D(P p5) {
        Iterator<m<P>> it = this.f21569e.iterator();
        while (it.hasNext()) {
            try {
                E(it.next(), p5);
            } catch (Exception e5) {
                this.f21565a.error("an uncaught exception occured in a ProgressCallback", (Throwable) e5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void E(m<P> mVar, P p5) {
        mVar.a(p5);
    }

    @Override // org.jdeferred.p
    public p<D, F, P> a(org.jdeferred.g<D> gVar) {
        return d(gVar);
    }

    @Override // org.jdeferred.p
    public <D_OUT, F_OUT, P_OUT> p<D_OUT, F_OUT, P_OUT> b(org.jdeferred.h<D, D_OUT> hVar) {
        return new f(this, hVar, null, null);
    }

    @Override // org.jdeferred.p
    public p<D, F, P> d(org.jdeferred.g<D> gVar) {
        synchronized (this) {
            if (t()) {
                A(gVar, this.f21571g);
            } else {
                this.f21567c.add(gVar);
            }
        }
        return this;
    }

    @Override // org.jdeferred.p
    public p<D, F, P> e(org.jdeferred.g<D> gVar, j<F> jVar) {
        d(gVar);
        p(jVar);
        return this;
    }

    @Override // org.jdeferred.p
    public <D_OUT, F_OUT, P_OUT> p<D_OUT, F_OUT, P_OUT> f(org.jdeferred.h<D, D_OUT> hVar, k<F, F_OUT> kVar) {
        return new f(this, hVar, kVar, null);
    }

    @Override // org.jdeferred.p
    public p<D, F, P> i(m<P> mVar) {
        this.f21569e.add(mVar);
        return this;
    }

    @Override // org.jdeferred.p
    public void j(long j5) throws InterruptedException {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            while (w()) {
                if (j5 <= 0) {
                    try {
                        wait();
                    } catch (InterruptedException e5) {
                        Thread.currentThread().interrupt();
                        throw e5;
                    }
                } else {
                    wait(j5 - (System.currentTimeMillis() - currentTimeMillis));
                }
                if (j5 > 0 && System.currentTimeMillis() - currentTimeMillis >= j5) {
                    return;
                }
            }
        }
    }

    @Override // org.jdeferred.p
    public <D_OUT, F_OUT, P_OUT> p<D_OUT, F_OUT, P_OUT> k(i<D, D_OUT, F_OUT, P_OUT> iVar, l<F, D_OUT, F_OUT, P_OUT> lVar, o<P, D_OUT, F_OUT, P_OUT> oVar) {
        return new h(this, iVar, lVar, oVar);
    }

    @Override // org.jdeferred.p
    public <D_OUT, F_OUT, P_OUT> p<D_OUT, F_OUT, P_OUT> l(i<D, D_OUT, F_OUT, P_OUT> iVar, l<F, D_OUT, F_OUT, P_OUT> lVar) {
        return new h(this, iVar, lVar, null);
    }

    @Override // org.jdeferred.p
    public <D_OUT, F_OUT, P_OUT> p<D_OUT, F_OUT, P_OUT> m(i<D, D_OUT, F_OUT, P_OUT> iVar) {
        return new h(this, iVar, null, null);
    }

    @Override // org.jdeferred.p
    public p.a n() {
        return this.f21566b;
    }

    @Override // org.jdeferred.p
    public p<D, F, P> o(org.jdeferred.a<D, F> aVar) {
        synchronized (this) {
            if (w()) {
                this.f21570f.add(aVar);
            } else {
                x(aVar, this.f21566b, this.f21571g, this.f21572h);
            }
        }
        return this;
    }

    @Override // org.jdeferred.p
    public p<D, F, P> p(j<F> jVar) {
        synchronized (this) {
            if (r()) {
                C(jVar, this.f21572h);
            } else {
                this.f21568d.add(jVar);
            }
        }
        return this;
    }

    @Override // org.jdeferred.p
    public boolean r() {
        return this.f21566b == p.a.REJECTED;
    }

    @Override // org.jdeferred.p
    public void s() throws InterruptedException {
        j(-1L);
    }

    @Override // org.jdeferred.p
    public boolean t() {
        return this.f21566b == p.a.RESOLVED;
    }

    @Override // org.jdeferred.p
    public <D_OUT, F_OUT, P_OUT> p<D_OUT, F_OUT, P_OUT> u(org.jdeferred.h<D, D_OUT> hVar, k<F, F_OUT> kVar, n<P, P_OUT> nVar) {
        return new f(this, hVar, kVar, nVar);
    }

    @Override // org.jdeferred.p
    public p<D, F, P> v(org.jdeferred.g<D> gVar, j<F> jVar, m<P> mVar) {
        d(gVar);
        p(jVar);
        i(mVar);
        return this;
    }

    @Override // org.jdeferred.p
    public boolean w() {
        return this.f21566b == p.a.PENDING;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void x(org.jdeferred.a<D, F> aVar, p.a aVar2, D d5, F f5) {
        aVar.a(aVar2, d5, f5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void y(p.a aVar, D d5, F f5) {
        Iterator<org.jdeferred.a<D, F>> it = this.f21570f.iterator();
        while (it.hasNext()) {
            try {
                x(it.next(), aVar, d5, f5);
            } catch (Exception e5) {
                this.f21565a.error("an uncaught exception occured in a AlwaysCallback", (Throwable) e5);
            }
        }
        this.f21570f.clear();
        synchronized (this) {
            notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void z(D d5) {
        Iterator<org.jdeferred.g<D>> it = this.f21567c.iterator();
        while (it.hasNext()) {
            try {
                A(it.next(), d5);
            } catch (Exception e5) {
                this.f21565a.error("an uncaught exception occured in a DoneCallback", (Throwable) e5);
            }
        }
        this.f21567c.clear();
    }
}
