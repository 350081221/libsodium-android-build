package org.jdeferred.impl;

import org.jdeferred.i;
import org.jdeferred.j;
import org.jdeferred.l;
import org.jdeferred.m;
import org.jdeferred.o;
import org.jdeferred.p;

/* loaded from: classes4.dex */
public class h<D, F, P, D_OUT, F_OUT, P_OUT> extends org.jdeferred.impl.d<D_OUT, F_OUT, P_OUT> implements p<D_OUT, F_OUT, P_OUT> {

    /* loaded from: classes4.dex */
    class a implements m<P> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o f21588a;

        a(o oVar) {
            this.f21588a = oVar;
        }

        @Override // org.jdeferred.m
        public void a(P p5) {
            o oVar = this.f21588a;
            if (oVar != null) {
                h.this.F(oVar.a(p5));
            } else {
                h.this.q(p5);
            }
        }
    }

    /* loaded from: classes4.dex */
    class b implements j<F> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f21590a;

        b(l lVar) {
            this.f21590a = lVar;
        }

        @Override // org.jdeferred.j
        public void onFail(F f5) {
            l lVar = this.f21590a;
            if (lVar != null) {
                h.this.F(lVar.a(f5));
            } else {
                h.this.h(f5);
            }
        }
    }

    /* loaded from: classes4.dex */
    class c implements org.jdeferred.g<D> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f21592a;

        c(i iVar) {
            this.f21592a = iVar;
        }

        @Override // org.jdeferred.g
        public void a(D d5) {
            i iVar = this.f21592a;
            if (iVar != null) {
                h.this.F(iVar.a(d5));
            } else {
                h.this.g(d5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements m<P_OUT> {
        d() {
        }

        @Override // org.jdeferred.m
        public void a(P_OUT p_out) {
            h.this.q(p_out);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements j<F_OUT> {
        e() {
        }

        @Override // org.jdeferred.j
        public void onFail(F_OUT f_out) {
            h.this.h(f_out);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements org.jdeferred.g<D_OUT> {
        f() {
        }

        @Override // org.jdeferred.g
        public void a(D_OUT d_out) {
            h.this.g(d_out);
        }
    }

    public h(p<D, F, P> pVar, i<D, D_OUT, F_OUT, P_OUT> iVar, l<F, D_OUT, F_OUT, P_OUT> lVar, o<P, D_OUT, F_OUT, P_OUT> oVar) {
        pVar.d(new c(iVar)).p(new b(lVar)).i(new a(oVar));
    }

    protected p<D_OUT, F_OUT, P_OUT> F(p<D_OUT, F_OUT, P_OUT> pVar) {
        pVar.d(new f()).p(new e()).i(new d());
        return pVar;
    }
}
