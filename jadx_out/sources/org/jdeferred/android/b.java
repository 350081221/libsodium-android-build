package org.jdeferred.android;

import android.annotation.SuppressLint;
import java.util.concurrent.ExecutorService;
import org.jdeferred.e;
import org.jdeferred.p;

/* loaded from: classes4.dex */
public class b extends org.jdeferred.impl.c {

    /* renamed from: e, reason: collision with root package name */
    private static Void[] f21535e = new Void[0];

    public b() {
    }

    public p<org.jdeferred.multiple.c, org.jdeferred.multiple.e, org.jdeferred.multiple.b> A(e eVar, p... pVarArr) {
        return new c(super.c(pVarArr), eVar).c();
    }

    public p<org.jdeferred.multiple.c, org.jdeferred.multiple.e, org.jdeferred.multiple.b> B(e eVar, i<Void, ?, ?>... iVarArr) {
        o(iVarArr);
        p[] pVarArr = new p[iVarArr.length];
        for (int i5 = 0; i5 < iVarArr.length; i5++) {
            pVarArr[i5] = C(iVarArr[i5]);
        }
        return A(eVar, pVarArr);
    }

    @SuppressLint({"NewApi"})
    public <Progress, Result> p<Result, Throwable, Progress> C(i<Void, Progress, Result> iVar) {
        if (iVar.b() == e.a.AUTO || (iVar.b() == e.a.DEFAULT && p())) {
            iVar.executeOnExecutor(t(), f21535e);
        }
        return iVar.d();
    }

    public p<org.jdeferred.multiple.c, org.jdeferred.multiple.e, org.jdeferred.multiple.b> D(i<Void, ?, ?>... iVarArr) {
        o(iVarArr);
        p[] pVarArr = new p[iVarArr.length];
        for (int i5 = 0; i5 < iVarArr.length; i5++) {
            pVarArr[i5] = C(iVarArr[i5]);
        }
        return c(pVarArr);
    }

    @Override // org.jdeferred.impl.a, org.jdeferred.e
    public <D, F, P> p<D, F, P> b(p<D, F, P> pVar) {
        if (pVar instanceof c) {
            return pVar;
        }
        return new c(pVar).c();
    }

    @Override // org.jdeferred.impl.a, org.jdeferred.e
    public p<org.jdeferred.multiple.c, org.jdeferred.multiple.e, org.jdeferred.multiple.b> c(p... pVarArr) {
        return new c(super.c(pVarArr)).c();
    }

    @Override // org.jdeferred.impl.a, org.jdeferred.e
    public <D, P> p<D, Throwable, P> j(org.jdeferred.d<D, P> dVar) {
        return (p<D, Throwable, P>) new c(super.j(dVar)).c();
    }

    public <D, F, P> p<D, F, P> z(p<D, F, P> pVar, e eVar) {
        if (pVar instanceof c) {
            return pVar;
        }
        return new c(pVar, eVar).c();
    }

    public b(ExecutorService executorService) {
        super(executorService);
    }
}
