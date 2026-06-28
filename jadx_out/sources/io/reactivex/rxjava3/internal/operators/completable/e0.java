package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.internal.operators.completable.d0;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class e0 extends io.reactivex.rxjava3.core.c {

    /* renamed from: a, reason: collision with root package name */
    final Iterable<? extends io.reactivex.rxjava3.core.i> f16498a;

    public e0(Iterable<? extends io.reactivex.rxjava3.core.i> iterable) {
        this.f16498a = iterable;
    }

    @Override // io.reactivex.rxjava3.core.c
    public void Y0(io.reactivex.rxjava3.core.f fVar) {
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        fVar.onSubscribe(cVar);
        try {
            Iterator<? extends io.reactivex.rxjava3.core.i> it = this.f16498a.iterator();
            Objects.requireNonNull(it, "The source iterator returned is null");
            Iterator<? extends io.reactivex.rxjava3.core.i> it2 = it;
            AtomicInteger atomicInteger = new AtomicInteger(1);
            io.reactivex.rxjava3.internal.util.c cVar2 = new io.reactivex.rxjava3.internal.util.c();
            cVar.b(new d0.b(cVar2));
            while (!cVar.isDisposed()) {
                try {
                    if (it2.hasNext()) {
                        if (cVar.isDisposed()) {
                            return;
                        }
                        try {
                            io.reactivex.rxjava3.core.i next = it2.next();
                            Objects.requireNonNull(next, "The iterator returned a null CompletableSource");
                            io.reactivex.rxjava3.core.i iVar = next;
                            if (cVar.isDisposed()) {
                                return;
                            }
                            atomicInteger.getAndIncrement();
                            iVar.a(new d0.a(fVar, cVar, cVar2, atomicInteger));
                        } catch (Throwable th) {
                            io.reactivex.rxjava3.exceptions.b.b(th);
                            cVar2.tryAddThrowableOrReport(th);
                        }
                    }
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.b.b(th2);
                    cVar2.tryAddThrowableOrReport(th2);
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    cVar2.tryTerminateConsumer(fVar);
                    return;
                }
                return;
            }
        } catch (Throwable th3) {
            io.reactivex.rxjava3.exceptions.b.b(th3);
            fVar.onError(th3);
        }
    }
}
