package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.core.a0;
import io.reactivex.rxjava3.core.p0;
import io.reactivex.rxjava3.core.u0;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class c extends AtomicReference<Throwable> {
    private static final long serialVersionUID = 3949248817947090603L;

    public boolean isTerminated() {
        return get() == k.f18688a;
    }

    public Throwable terminate() {
        return k.f(this);
    }

    public boolean tryAddThrowable(Throwable th) {
        return k.a(this, th);
    }

    public boolean tryAddThrowableOrReport(Throwable th) {
        if (tryAddThrowable(th)) {
            return true;
        }
        io.reactivex.rxjava3.plugins.a.Y(th);
        return false;
    }

    public void tryTerminateAndReport() {
        Throwable terminate = terminate();
        if (terminate != null && terminate != k.f18688a) {
            io.reactivex.rxjava3.plugins.a.Y(terminate);
        }
    }

    public void tryTerminateConsumer(org.reactivestreams.p<?> pVar) {
        Throwable terminate = terminate();
        if (terminate == null) {
            pVar.onComplete();
        } else if (terminate != k.f18688a) {
            pVar.onError(terminate);
        }
    }

    public void tryTerminateConsumer(p0<?> p0Var) {
        Throwable terminate = terminate();
        if (terminate == null) {
            p0Var.onComplete();
        } else if (terminate != k.f18688a) {
            p0Var.onError(terminate);
        }
    }

    public void tryTerminateConsumer(a0<?> a0Var) {
        Throwable terminate = terminate();
        if (terminate == null) {
            a0Var.onComplete();
        } else if (terminate != k.f18688a) {
            a0Var.onError(terminate);
        }
    }

    public void tryTerminateConsumer(u0<?> u0Var) {
        Throwable terminate = terminate();
        if (terminate == null || terminate == k.f18688a) {
            return;
        }
        u0Var.onError(terminate);
    }

    public void tryTerminateConsumer(io.reactivex.rxjava3.core.f fVar) {
        Throwable terminate = terminate();
        if (terminate == null) {
            fVar.onComplete();
        } else if (terminate != k.f18688a) {
            fVar.onError(terminate);
        }
    }

    public void tryTerminateConsumer(io.reactivex.rxjava3.core.k<?> kVar) {
        Throwable terminate = terminate();
        if (terminate == null) {
            kVar.onComplete();
        } else if (terminate != k.f18688a) {
            kVar.onError(terminate);
        }
    }
}
