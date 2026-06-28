package org.jdeferred;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import org.jdeferred.e;

/* loaded from: classes4.dex */
public class d<D, P> extends FutureTask<D> {

    /* renamed from: a, reason: collision with root package name */
    protected final b<D, Throwable, P> f21558a;

    /* renamed from: b, reason: collision with root package name */
    protected final e.a f21559b;

    public d(Callable<D> callable) {
        super(callable);
        this.f21558a = new org.jdeferred.impl.d();
        this.f21559b = e.a.DEFAULT;
    }

    public e.a a() {
        return this.f21559b;
    }

    public p<D, Throwable, P> b() {
        return this.f21558a.c();
    }

    @Override // java.util.concurrent.FutureTask
    protected void done() {
        try {
            if (isCancelled()) {
                this.f21558a.h(new CancellationException());
            }
            this.f21558a.g(get());
        } catch (InterruptedException unused) {
        } catch (ExecutionException e5) {
            this.f21558a.h(e5.getCause());
        }
    }

    public d(Runnable runnable) {
        super(runnable, null);
        this.f21558a = new org.jdeferred.impl.d();
        this.f21559b = e.a.DEFAULT;
    }

    public d(c<D, P> cVar) {
        super(cVar);
        this.f21558a = cVar.a();
        this.f21559b = cVar.b();
    }

    public d(f<P> fVar) {
        super(fVar, null);
        this.f21558a = fVar.a();
        this.f21559b = fVar.b();
    }
}
