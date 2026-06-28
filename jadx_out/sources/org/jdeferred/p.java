package org.jdeferred;

/* loaded from: classes4.dex */
public interface p<D, F, P> {

    /* loaded from: classes4.dex */
    public enum a {
        PENDING,
        REJECTED,
        RESOLVED
    }

    p<D, F, P> a(g<D> gVar);

    <D_OUT, F_OUT, P_OUT> p<D_OUT, F_OUT, P_OUT> b(h<D, D_OUT> hVar);

    p<D, F, P> d(g<D> gVar);

    p<D, F, P> e(g<D> gVar, j<F> jVar);

    <D_OUT, F_OUT, P_OUT> p<D_OUT, F_OUT, P_OUT> f(h<D, D_OUT> hVar, k<F, F_OUT> kVar);

    p<D, F, P> i(m<P> mVar);

    void j(long j5) throws InterruptedException;

    <D_OUT, F_OUT, P_OUT> p<D_OUT, F_OUT, P_OUT> k(i<D, D_OUT, F_OUT, P_OUT> iVar, l<F, D_OUT, F_OUT, P_OUT> lVar, o<P, D_OUT, F_OUT, P_OUT> oVar);

    <D_OUT, F_OUT, P_OUT> p<D_OUT, F_OUT, P_OUT> l(i<D, D_OUT, F_OUT, P_OUT> iVar, l<F, D_OUT, F_OUT, P_OUT> lVar);

    <D_OUT, F_OUT, P_OUT> p<D_OUT, F_OUT, P_OUT> m(i<D, D_OUT, F_OUT, P_OUT> iVar);

    a n();

    p<D, F, P> o(org.jdeferred.a<D, F> aVar);

    p<D, F, P> p(j<F> jVar);

    boolean r();

    void s() throws InterruptedException;

    boolean t();

    <D_OUT, F_OUT, P_OUT> p<D_OUT, F_OUT, P_OUT> u(h<D, D_OUT> hVar, k<F, F_OUT> kVar, n<P, P_OUT> nVar);

    p<D, F, P> v(g<D> gVar, j<F> jVar, m<P> mVar);

    boolean w();
}
