package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.Objects;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes3.dex */
public final class l {
    private l() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> void a(org.reactivestreams.o<? extends T> oVar) {
        io.reactivex.rxjava3.internal.util.f fVar = new io.reactivex.rxjava3.internal.util.f();
        io.reactivex.rxjava3.internal.subscribers.m mVar = new io.reactivex.rxjava3.internal.subscribers.m(io.reactivex.rxjava3.internal.functions.a.h(), fVar, fVar, io.reactivex.rxjava3.internal.functions.a.f16259k);
        oVar.subscribe(mVar);
        io.reactivex.rxjava3.internal.util.e.a(fVar, mVar);
        Throwable th = fVar.f18686a;
        if (th == null) {
        } else {
            throw io.reactivex.rxjava3.internal.util.k.i(th);
        }
    }

    public static <T> void b(org.reactivestreams.o<? extends T> oVar, m3.g<? super T> gVar, m3.g<? super Throwable> gVar2, m3.a aVar) {
        Objects.requireNonNull(gVar, "onNext is null");
        Objects.requireNonNull(gVar2, "onError is null");
        Objects.requireNonNull(aVar, "onComplete is null");
        d(oVar, new io.reactivex.rxjava3.internal.subscribers.m(gVar, gVar2, aVar, io.reactivex.rxjava3.internal.functions.a.f16259k));
    }

    public static <T> void c(org.reactivestreams.o<? extends T> oVar, m3.g<? super T> gVar, m3.g<? super Throwable> gVar2, m3.a aVar, int i5) {
        Objects.requireNonNull(gVar, "onNext is null");
        Objects.requireNonNull(gVar2, "onError is null");
        Objects.requireNonNull(aVar, "onComplete is null");
        io.reactivex.rxjava3.internal.functions.b.b(i5, "number > 0 required");
        d(oVar, new io.reactivex.rxjava3.internal.subscribers.g(gVar, gVar2, aVar, io.reactivex.rxjava3.internal.functions.a.d(i5), i5));
    }

    public static <T> void d(org.reactivestreams.o<? extends T> oVar, org.reactivestreams.p<? super T> pVar) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        io.reactivex.rxjava3.internal.subscribers.f fVar = new io.reactivex.rxjava3.internal.subscribers.f(linkedBlockingQueue);
        oVar.subscribe(fVar);
        while (!fVar.isCancelled()) {
            try {
                Object poll = linkedBlockingQueue.poll();
                if (poll == null) {
                    if (!fVar.isCancelled()) {
                        io.reactivex.rxjava3.internal.util.e.b();
                        poll = linkedBlockingQueue.take();
                    } else {
                        return;
                    }
                }
                if (fVar.isCancelled() || poll == io.reactivex.rxjava3.internal.subscribers.f.TERMINATED || io.reactivex.rxjava3.internal.util.q.acceptFull(poll, pVar)) {
                    return;
                }
            } catch (InterruptedException e5) {
                fVar.cancel();
                pVar.onError(e5);
                return;
            }
        }
    }
}
