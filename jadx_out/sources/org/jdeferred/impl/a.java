package org.jdeferred.impl;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.jdeferred.e;
import org.jdeferred.p;

/* loaded from: classes4.dex */
public abstract class a implements org.jdeferred.e {

    /* renamed from: a, reason: collision with root package name */
    protected final org.slf4j.a f21562a = org.slf4j.b.f(a.class);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [D] */
    /* renamed from: org.jdeferred.impl.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0644a<D> extends org.jdeferred.c<D, Void> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Future f21563c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0644a(e.a aVar, Future future) {
            super(aVar);
            this.f21563c = future;
        }

        @Override // java.util.concurrent.Callable
        public D call() throws Exception {
            try {
                return (D) this.f21563c.get();
            } catch (InterruptedException e5) {
                throw e5;
            } catch (ExecutionException e6) {
                if (e6.getCause() instanceof Exception) {
                    throw ((Exception) e6.getCause());
                }
                throw e6;
            }
        }
    }

    @Override // org.jdeferred.e
    public p<org.jdeferred.multiple.c, org.jdeferred.multiple.e, org.jdeferred.multiple.b> a(Runnable... runnableArr) {
        o(runnableArr);
        p[] pVarArr = new p[runnableArr.length];
        for (int i5 = 0; i5 < runnableArr.length; i5++) {
            Runnable runnable = runnableArr[i5];
            if (runnable instanceof org.jdeferred.f) {
                pVarArr[i5] = k((org.jdeferred.f) runnable);
            } else {
                pVarArr[i5] = g(runnable);
            }
        }
        return c(pVarArr);
    }

    @Override // org.jdeferred.e
    public <D, F, P> p<D, F, P> b(p<D, F, P> pVar) {
        return pVar;
    }

    @Override // org.jdeferred.e
    public p<org.jdeferred.multiple.c, org.jdeferred.multiple.e, org.jdeferred.multiple.b> c(p... pVarArr) {
        o(pVarArr);
        return new org.jdeferred.multiple.a(pVarArr).c();
    }

    @Override // org.jdeferred.e
    public p<org.jdeferred.multiple.c, org.jdeferred.multiple.e, org.jdeferred.multiple.b> d(org.jdeferred.f<?>... fVarArr) {
        o(fVarArr);
        p[] pVarArr = new p[fVarArr.length];
        for (int i5 = 0; i5 < fVarArr.length; i5++) {
            pVarArr[i5] = k(fVarArr[i5]);
        }
        return c(pVarArr);
    }

    @Override // org.jdeferred.e
    public <D> p<D, Throwable, Void> e(Future<D> future) {
        return n(new C0644a(e.a.AUTO, future));
    }

    @Override // org.jdeferred.e
    public p<org.jdeferred.multiple.c, org.jdeferred.multiple.e, org.jdeferred.multiple.b> f(org.jdeferred.c<?, ?>... cVarArr) {
        o(cVarArr);
        p[] pVarArr = new p[cVarArr.length];
        for (int i5 = 0; i5 < cVarArr.length; i5++) {
            pVarArr[i5] = n(cVarArr[i5]);
        }
        return c(pVarArr);
    }

    @Override // org.jdeferred.e
    public p<Void, Throwable, Void> g(Runnable runnable) {
        return j(new org.jdeferred.d(runnable));
    }

    @Override // org.jdeferred.e
    public <D> p<D, Throwable, Void> h(Callable<D> callable) {
        return j(new org.jdeferred.d(callable));
    }

    @Override // org.jdeferred.e
    public p<org.jdeferred.multiple.c, org.jdeferred.multiple.e, org.jdeferred.multiple.b> i(org.jdeferred.d<?, ?>... dVarArr) {
        o(dVarArr);
        p[] pVarArr = new p[dVarArr.length];
        for (int i5 = 0; i5 < dVarArr.length; i5++) {
            pVarArr[i5] = j(dVarArr[i5]);
        }
        return c(pVarArr);
    }

    @Override // org.jdeferred.e
    public <D, P> p<D, Throwable, P> j(org.jdeferred.d<D, P> dVar) {
        if (dVar.a() == e.a.AUTO || (dVar.a() == e.a.DEFAULT && p())) {
            q(dVar);
        }
        return dVar.b();
    }

    @Override // org.jdeferred.e
    public <P> p<Void, Throwable, P> k(org.jdeferred.f<P> fVar) {
        return j(new org.jdeferred.d((org.jdeferred.f) fVar));
    }

    @Override // org.jdeferred.e
    public p<org.jdeferred.multiple.c, org.jdeferred.multiple.e, org.jdeferred.multiple.b> l(Callable<?>... callableArr) {
        o(callableArr);
        p[] pVarArr = new p[callableArr.length];
        for (int i5 = 0; i5 < callableArr.length; i5++) {
            Callable<?> callable = callableArr[i5];
            if (callable instanceof org.jdeferred.c) {
                pVarArr[i5] = n((org.jdeferred.c) callable);
            } else {
                pVarArr[i5] = h(callable);
            }
        }
        return c(pVarArr);
    }

    @Override // org.jdeferred.e
    public p<org.jdeferred.multiple.c, org.jdeferred.multiple.e, org.jdeferred.multiple.b> m(Future<?>... futureArr) {
        o(futureArr);
        p[] pVarArr = new p[futureArr.length];
        for (int i5 = 0; i5 < futureArr.length; i5++) {
            pVarArr[i5] = e(futureArr[i5]);
        }
        return c(pVarArr);
    }

    @Override // org.jdeferred.e
    public <D, P> p<D, Throwable, P> n(org.jdeferred.c<D, P> cVar) {
        return j(new org.jdeferred.d<>((org.jdeferred.c) cVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void o(Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
        } else {
            throw new IllegalArgumentException("Arguments is null or its length is empty");
        }
    }

    public abstract boolean p();

    protected abstract void q(Runnable runnable);

    protected abstract void r(Callable callable);
}
