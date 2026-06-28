package org.jdeferred.impl;

import org.jdeferred.i;
import org.jdeferred.j;
import org.jdeferred.k;
import org.jdeferred.l;
import org.jdeferred.m;
import org.jdeferred.n;
import org.jdeferred.o;
import org.jdeferred.p;

/* loaded from: classes4.dex */
public class e<D, F, P> implements p<D, F, P> {

    /* renamed from: a, reason: collision with root package name */
    private final p<D, F, P> f21576a;

    /* renamed from: b, reason: collision with root package name */
    protected final org.jdeferred.b<D, F, P> f21577b;

    public e(org.jdeferred.b<D, F, P> bVar) {
        this.f21577b = bVar;
        this.f21576a = bVar.c();
    }

    @Override // org.jdeferred.p
    public p<D, F, P> a(org.jdeferred.g<D> gVar) {
        return this.f21576a.a(gVar);
    }

    @Override // org.jdeferred.p
    public <D_OUT, F_OUT, P_OUT> p<D_OUT, F_OUT, P_OUT> b(org.jdeferred.h<D, D_OUT> hVar) {
        return this.f21576a.b(hVar);
    }

    @Override // org.jdeferred.p
    public p<D, F, P> d(org.jdeferred.g<D> gVar) {
        return this.f21576a.d(gVar);
    }

    @Override // org.jdeferred.p
    public p<D, F, P> e(org.jdeferred.g<D> gVar, j<F> jVar) {
        return this.f21576a.e(gVar, jVar);
    }

    @Override // org.jdeferred.p
    public <D_OUT, F_OUT, P_OUT> p<D_OUT, F_OUT, P_OUT> f(org.jdeferred.h<D, D_OUT> hVar, k<F, F_OUT> kVar) {
        return this.f21576a.f(hVar, kVar);
    }

    @Override // org.jdeferred.p
    public p<D, F, P> i(m<P> mVar) {
        return this.f21576a.i(mVar);
    }

    @Override // org.jdeferred.p
    public void j(long j5) throws InterruptedException {
        this.f21576a.j(j5);
    }

    @Override // org.jdeferred.p
    public <D_OUT, F_OUT, P_OUT> p<D_OUT, F_OUT, P_OUT> k(i<D, D_OUT, F_OUT, P_OUT> iVar, l<F, D_OUT, F_OUT, P_OUT> lVar, o<P, D_OUT, F_OUT, P_OUT> oVar) {
        return this.f21576a.k(iVar, lVar, oVar);
    }

    @Override // org.jdeferred.p
    public <D_OUT, F_OUT, P_OUT> p<D_OUT, F_OUT, P_OUT> l(i<D, D_OUT, F_OUT, P_OUT> iVar, l<F, D_OUT, F_OUT, P_OUT> lVar) {
        return this.f21576a.l(iVar, lVar);
    }

    @Override // org.jdeferred.p
    public <D_OUT, F_OUT, P_OUT> p<D_OUT, F_OUT, P_OUT> m(i<D, D_OUT, F_OUT, P_OUT> iVar) {
        return this.f21576a.m(iVar);
    }

    @Override // org.jdeferred.p
    public p.a n() {
        return this.f21576a.n();
    }

    @Override // org.jdeferred.p
    public p<D, F, P> o(org.jdeferred.a<D, F> aVar) {
        return this.f21576a.o(aVar);
    }

    @Override // org.jdeferred.p
    public p<D, F, P> p(j<F> jVar) {
        return this.f21576a.p(jVar);
    }

    @Override // org.jdeferred.p
    public boolean r() {
        return this.f21576a.r();
    }

    @Override // org.jdeferred.p
    public void s() throws InterruptedException {
        this.f21576a.s();
    }

    @Override // org.jdeferred.p
    public boolean t() {
        return this.f21576a.t();
    }

    @Override // org.jdeferred.p
    public <D_OUT, F_OUT, P_OUT> p<D_OUT, F_OUT, P_OUT> u(org.jdeferred.h<D, D_OUT> hVar, k<F, F_OUT> kVar, n<P, P_OUT> nVar) {
        return this.f21576a.u(hVar, kVar, nVar);
    }

    @Override // org.jdeferred.p
    public p<D, F, P> v(org.jdeferred.g<D> gVar, j<F> jVar, m<P> mVar) {
        return this.f21576a.v(gVar, jVar, mVar);
    }

    @Override // org.jdeferred.p
    public boolean w() {
        return this.f21576a.w();
    }
}
