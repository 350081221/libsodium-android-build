package org.jdeferred.impl;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes4.dex */
public class g<V> implements Callable<V> {

    /* renamed from: a, reason: collision with root package name */
    private final Future<V> f21587a;

    public g(Future<V> future) {
        this.f21587a = future;
    }

    @Override // java.util.concurrent.Callable
    public V call() throws Exception {
        try {
            return this.f21587a.get();
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
