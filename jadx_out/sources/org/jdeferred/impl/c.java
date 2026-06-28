package org.jdeferred.impl;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class c extends a {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f21573d = true;

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f21574b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f21575c;

    public c() {
        this.f21575c = true;
        this.f21574b = Executors.newCachedThreadPool();
    }

    @Override // org.jdeferred.impl.a
    public boolean p() {
        return this.f21575c;
    }

    @Override // org.jdeferred.impl.a
    protected void q(Runnable runnable) {
        this.f21574b.submit(runnable);
    }

    @Override // org.jdeferred.impl.a
    protected void r(Callable callable) {
        this.f21574b.submit(callable);
    }

    public boolean s(long j5, TimeUnit timeUnit) throws InterruptedException {
        return this.f21574b.awaitTermination(j5, timeUnit);
    }

    public ExecutorService t() {
        return this.f21574b;
    }

    public boolean u() {
        return this.f21574b.isShutdown();
    }

    public boolean v() {
        return this.f21574b.isTerminated();
    }

    public void w(boolean z4) {
        this.f21575c = z4;
    }

    public void x() {
        this.f21574b.shutdown();
    }

    public List<Runnable> y() {
        return this.f21574b.shutdownNow();
    }

    public c(ExecutorService executorService) {
        this.f21575c = true;
        this.f21574b = executorService;
    }
}
