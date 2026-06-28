package com.huawei.hmf.tasks;

import android.app.Activity;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public abstract class Task<TResult> {
    public Task<TResult> a(Activity activity, f fVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    public Task<TResult> b(f fVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    public Task<TResult> c(Executor executor, f fVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    public Task<TResult> d(Activity activity, g<TResult> gVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public Task<TResult> e(g<TResult> gVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public Task<TResult> f(Executor executor, g<TResult> gVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract Task<TResult> g(Activity activity, h hVar);

    public abstract Task<TResult> h(h hVar);

    public abstract Task<TResult> i(Executor executor, h hVar);

    public abstract Task<TResult> j(Activity activity, i<TResult> iVar);

    public abstract Task<TResult> k(i<TResult> iVar);

    public abstract Task<TResult> l(Executor executor, i<TResult> iVar);

    public <TContinuationResult> Task<TContinuationResult> m(d<TResult, TContinuationResult> dVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> Task<TContinuationResult> n(Executor executor, d<TResult, TContinuationResult> dVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> Task<TContinuationResult> o(d<TResult, Task<TContinuationResult>> dVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public <TContinuationResult> Task<TContinuationResult> p(Executor executor, d<TResult, Task<TContinuationResult>> dVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception q();

    public abstract TResult r();

    public abstract <E extends Throwable> TResult s(Class<E> cls) throws Throwable;

    public abstract boolean t();

    public abstract boolean u();

    public abstract boolean v();

    public <TContinuationResult> Task<TContinuationResult> w(j<TResult, TContinuationResult> jVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public <TContinuationResult> Task<TContinuationResult> x(Executor executor, j<TResult, TContinuationResult> jVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
