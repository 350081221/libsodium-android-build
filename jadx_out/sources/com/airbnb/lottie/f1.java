package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* loaded from: classes2.dex */
public class f1<T> {

    /* renamed from: e, reason: collision with root package name */
    public static Executor f1293e = Executors.newCachedThreadPool();

    /* renamed from: a, reason: collision with root package name */
    private final Set<z0<T>> f1294a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<z0<Throwable>> f1295b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f1296c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private volatile d1<T> f1297d;

    /* loaded from: classes2.dex */
    private class a extends FutureTask<d1<T>> {
        a(Callable<d1<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            if (isCancelled()) {
                return;
            }
            try {
                f1.this.l(get());
            } catch (InterruptedException | ExecutionException e5) {
                f1.this.l(new d1(e5));
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public f1(Callable<d1<T>> callable) {
        this(callable, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        d1<T> d1Var = this.f1297d;
        if (d1Var == null) {
            return;
        }
        if (d1Var.b() != null) {
            i(d1Var.b());
        } else {
            g(d1Var.a());
        }
    }

    private synchronized void g(Throwable th) {
        ArrayList arrayList = new ArrayList(this.f1295b);
        if (arrayList.isEmpty()) {
            com.airbnb.lottie.utils.f.f("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((z0) it.next()).onResult(th);
        }
    }

    private void h() {
        this.f1296c.post(new Runnable() { // from class: com.airbnb.lottie.e1
            @Override // java.lang.Runnable
            public final void run() {
                f1.this.f();
            }
        });
    }

    private synchronized void i(T t5) {
        Iterator it = new ArrayList(this.f1294a).iterator();
        while (it.hasNext()) {
            ((z0) it.next()).onResult(t5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(@Nullable d1<T> d1Var) {
        if (this.f1297d == null) {
            this.f1297d = d1Var;
            h();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public synchronized f1<T> c(z0<Throwable> z0Var) {
        d1<T> d1Var = this.f1297d;
        if (d1Var != null && d1Var.a() != null) {
            z0Var.onResult(d1Var.a());
        }
        this.f1295b.add(z0Var);
        return this;
    }

    public synchronized f1<T> d(z0<T> z0Var) {
        d1<T> d1Var = this.f1297d;
        if (d1Var != null && d1Var.b() != null) {
            z0Var.onResult(d1Var.b());
        }
        this.f1294a.add(z0Var);
        return this;
    }

    @Nullable
    public d1<T> e() {
        return this.f1297d;
    }

    public synchronized f1<T> j(z0<Throwable> z0Var) {
        this.f1295b.remove(z0Var);
        return this;
    }

    public synchronized f1<T> k(z0<T> z0Var) {
        this.f1294a.remove(z0Var);
        return this;
    }

    public f1(T t5) {
        this.f1294a = new LinkedHashSet(1);
        this.f1295b = new LinkedHashSet(1);
        this.f1296c = new Handler(Looper.getMainLooper());
        this.f1297d = null;
        l(new d1<>(t5));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public f1(Callable<d1<T>> callable, boolean z4) {
        this.f1294a = new LinkedHashSet(1);
        this.f1295b = new LinkedHashSet(1);
        this.f1296c = new Handler(Looper.getMainLooper());
        this.f1297d = null;
        if (z4) {
            try {
                l(callable.call());
                return;
            } catch (Throwable th) {
                l(new d1<>(th));
                return;
            }
        }
        f1293e.execute(new a(callable));
    }
}
