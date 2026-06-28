package org.jdeferred.impl;

import org.jdeferred.j;
import org.jdeferred.k;
import org.jdeferred.m;
import org.jdeferred.n;
import org.jdeferred.p;

/* loaded from: classes4.dex */
public class f<D, F, P, D_OUT, F_OUT, P_OUT> extends org.jdeferred.impl.d<D_OUT, F_OUT, P_OUT> implements p<D_OUT, F_OUT, P_OUT> {

    /* renamed from: l, reason: collision with root package name */
    protected static final d f21578l = new d();

    /* renamed from: m, reason: collision with root package name */
    protected static final e f21579m = new e();

    /* renamed from: n, reason: collision with root package name */
    protected static final C0645f f21580n = new C0645f();

    /* renamed from: i, reason: collision with root package name */
    private final org.jdeferred.h<D, D_OUT> f21581i;

    /* renamed from: j, reason: collision with root package name */
    private final k<F, F_OUT> f21582j;

    /* renamed from: k, reason: collision with root package name */
    private final n<P, P_OUT> f21583k;

    /* loaded from: classes4.dex */
    class a implements m<P> {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.jdeferred.m
        public void a(P p5) {
            f fVar = f.this;
            fVar.q(fVar.f21583k.a(p5));
        }
    }

    /* loaded from: classes4.dex */
    class b implements j<F> {
        b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.jdeferred.j
        public void onFail(F f5) {
            f fVar = f.this;
            fVar.h(fVar.f21582j.a(f5));
        }
    }

    /* loaded from: classes4.dex */
    class c implements org.jdeferred.g<D> {
        c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.jdeferred.g
        public void a(D d5) {
            f fVar = f.this;
            fVar.g(fVar.f21581i.a(d5));
        }
    }

    /* loaded from: classes4.dex */
    public static final class d<D> implements org.jdeferred.h<D, D> {
        @Override // org.jdeferred.h
        public D a(D d5) {
            return d5;
        }
    }

    /* loaded from: classes4.dex */
    public static final class e<F> implements k<F, F> {
        @Override // org.jdeferred.k
        public F a(F f5) {
            return f5;
        }
    }

    /* renamed from: org.jdeferred.impl.f$f, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0645f<P> implements n<P, P> {
        @Override // org.jdeferred.n
        public P a(P p5) {
            return p5;
        }
    }

    public f(p<D, F, P> pVar, org.jdeferred.h<D, D_OUT> hVar, k<F, F_OUT> kVar, n<P, P_OUT> nVar) {
        this.f21581i = hVar == null ? f21578l : hVar;
        this.f21582j = kVar == null ? f21579m : kVar;
        this.f21583k = nVar == null ? f21580n : nVar;
        pVar.d(new c()).p(new b()).i(new a());
    }
}
