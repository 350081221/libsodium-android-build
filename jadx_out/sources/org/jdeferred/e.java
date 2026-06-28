package org.jdeferred;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* loaded from: classes4.dex */
public interface e {

    /* loaded from: classes4.dex */
    public enum a {
        DEFAULT,
        AUTO,
        MANAUL
    }

    p<org.jdeferred.multiple.c, org.jdeferred.multiple.e, org.jdeferred.multiple.b> a(Runnable... runnableArr);

    <D, F, P> p<D, F, P> b(p<D, F, P> pVar);

    p<org.jdeferred.multiple.c, org.jdeferred.multiple.e, org.jdeferred.multiple.b> c(p... pVarArr);

    p<org.jdeferred.multiple.c, org.jdeferred.multiple.e, org.jdeferred.multiple.b> d(f<?>... fVarArr);

    <D> p<D, Throwable, Void> e(Future<D> future);

    p<org.jdeferred.multiple.c, org.jdeferred.multiple.e, org.jdeferred.multiple.b> f(c<?, ?>... cVarArr);

    p<Void, Throwable, Void> g(Runnable runnable);

    <D> p<D, Throwable, Void> h(Callable<D> callable);

    p<org.jdeferred.multiple.c, org.jdeferred.multiple.e, org.jdeferred.multiple.b> i(d<?, ?>... dVarArr);

    <D, P> p<D, Throwable, P> j(d<D, P> dVar);

    <P> p<Void, Throwable, P> k(f<P> fVar);

    p<org.jdeferred.multiple.c, org.jdeferred.multiple.e, org.jdeferred.multiple.b> l(Callable<?>... callableArr);

    p<org.jdeferred.multiple.c, org.jdeferred.multiple.e, org.jdeferred.multiple.b> m(Future<?>... futureArr);

    <D, P> p<D, Throwable, P> n(c<D, P> cVar);
}
