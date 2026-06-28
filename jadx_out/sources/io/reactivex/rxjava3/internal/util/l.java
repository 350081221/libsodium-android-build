package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.core.p0;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class l {
    private l() {
        throw new IllegalStateException("No instances!");
    }

    public static void a(p0<?> p0Var, AtomicInteger atomicInteger, c cVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            cVar.tryTerminateConsumer(p0Var);
        }
    }

    public static void b(org.reactivestreams.p<?> pVar, AtomicInteger atomicInteger, c cVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            cVar.tryTerminateConsumer(pVar);
        }
    }

    public static void c(p0<?> p0Var, Throwable th, AtomicInteger atomicInteger, c cVar) {
        if (cVar.tryAddThrowableOrReport(th) && atomicInteger.getAndIncrement() == 0) {
            cVar.tryTerminateConsumer(p0Var);
        }
    }

    public static void d(org.reactivestreams.p<?> pVar, Throwable th, AtomicInteger atomicInteger, c cVar) {
        if (cVar.tryAddThrowableOrReport(th) && atomicInteger.getAndIncrement() == 0) {
            cVar.tryTerminateConsumer(pVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void e(p0<? super T> p0Var, T t5, AtomicInteger atomicInteger, c cVar) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            p0Var.onNext(t5);
            if (atomicInteger.decrementAndGet() != 0) {
                cVar.tryTerminateConsumer(p0Var);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> boolean f(org.reactivestreams.p<? super T> pVar, T t5, AtomicInteger atomicInteger, c cVar) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            pVar.onNext(t5);
            if (atomicInteger.decrementAndGet() == 0) {
                return true;
            }
            cVar.tryTerminateConsumer(pVar);
        }
        return false;
    }
}
