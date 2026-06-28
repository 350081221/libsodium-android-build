package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Objects;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes3.dex */
public final class l {
    private l() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> void a(io.reactivex.rxjava3.core.n0<? extends T> n0Var) {
        io.reactivex.rxjava3.internal.util.f fVar = new io.reactivex.rxjava3.internal.util.f();
        io.reactivex.rxjava3.internal.observers.v vVar = new io.reactivex.rxjava3.internal.observers.v(io.reactivex.rxjava3.internal.functions.a.h(), fVar, fVar, io.reactivex.rxjava3.internal.functions.a.h());
        n0Var.subscribe(vVar);
        io.reactivex.rxjava3.internal.util.e.a(fVar, vVar);
        Throwable th = fVar.f18686a;
        if (th == null) {
        } else {
            throw io.reactivex.rxjava3.internal.util.k.i(th);
        }
    }

    public static <T> void b(io.reactivex.rxjava3.core.n0<? extends T> n0Var, io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        io.reactivex.rxjava3.internal.observers.j jVar = new io.reactivex.rxjava3.internal.observers.j(linkedBlockingQueue);
        p0Var.onSubscribe(jVar);
        n0Var.subscribe(jVar);
        while (!jVar.isDisposed()) {
            Object poll = linkedBlockingQueue.poll();
            if (poll == null) {
                try {
                    poll = linkedBlockingQueue.take();
                } catch (InterruptedException e5) {
                    jVar.dispose();
                    p0Var.onError(e5);
                    return;
                }
            }
            if (jVar.isDisposed() || poll == io.reactivex.rxjava3.internal.observers.j.TERMINATED || io.reactivex.rxjava3.internal.util.q.acceptFull(poll, p0Var)) {
                return;
            }
        }
    }

    public static <T> void c(io.reactivex.rxjava3.core.n0<? extends T> n0Var, m3.g<? super T> gVar, m3.g<? super Throwable> gVar2, m3.a aVar) {
        Objects.requireNonNull(gVar, "onNext is null");
        Objects.requireNonNull(gVar2, "onError is null");
        Objects.requireNonNull(aVar, "onComplete is null");
        b(n0Var, new io.reactivex.rxjava3.internal.observers.v(gVar, gVar2, aVar, io.reactivex.rxjava3.internal.functions.a.h()));
    }
}
