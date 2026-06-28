package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.core.p0;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    static final long f18702a = Long.MIN_VALUE;

    /* renamed from: b, reason: collision with root package name */
    static final long f18703b = Long.MAX_VALUE;

    private v() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> boolean a(boolean z4, boolean z5, p0<?> p0Var, boolean z6, io.reactivex.rxjava3.internal.fuseable.q<?> qVar, io.reactivex.rxjava3.disposables.e eVar, r<T, U> rVar) {
        if (rVar.d()) {
            qVar.clear();
            eVar.dispose();
            return true;
        }
        if (z4) {
            if (z6) {
                if (z5) {
                    if (eVar != null) {
                        eVar.dispose();
                    }
                    Throwable e5 = rVar.e();
                    if (e5 != null) {
                        p0Var.onError(e5);
                    } else {
                        p0Var.onComplete();
                    }
                    return true;
                }
                return false;
            }
            Throwable e6 = rVar.e();
            if (e6 != null) {
                qVar.clear();
                if (eVar != null) {
                    eVar.dispose();
                }
                p0Var.onError(e6);
                return true;
            }
            if (z5) {
                if (eVar != null) {
                    eVar.dispose();
                }
                p0Var.onComplete();
                return true;
            }
            return false;
        }
        return false;
    }

    public static <T, U> boolean b(boolean z4, boolean z5, org.reactivestreams.p<?> pVar, boolean z6, io.reactivex.rxjava3.internal.fuseable.q<?> qVar, u<T, U> uVar) {
        if (uVar.d()) {
            qVar.clear();
            return true;
        }
        if (z4) {
            if (z6) {
                if (z5) {
                    Throwable e5 = uVar.e();
                    if (e5 != null) {
                        pVar.onError(e5);
                    } else {
                        pVar.onComplete();
                    }
                    return true;
                }
                return false;
            }
            Throwable e6 = uVar.e();
            if (e6 != null) {
                qVar.clear();
                pVar.onError(e6);
                return true;
            }
            if (z5) {
                pVar.onComplete();
                return true;
            }
            return false;
        }
        return false;
    }

    public static <T> io.reactivex.rxjava3.internal.fuseable.q<T> c(int i5) {
        if (i5 < 0) {
            return new io.reactivex.rxjava3.internal.queue.c(-i5);
        }
        return new io.reactivex.rxjava3.internal.queue.b(i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        r1 = r15.a(-r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (r1 != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T, U> void d(io.reactivex.rxjava3.internal.fuseable.p<T> r11, io.reactivex.rxjava3.core.p0<? super U> r12, boolean r13, io.reactivex.rxjava3.disposables.e r14, io.reactivex.rxjava3.internal.util.r<T, U> r15) {
        /*
            r0 = 1
            r1 = r0
        L2:
            boolean r2 = r15.c()
            boolean r3 = r11.isEmpty()
            r4 = r12
            r5 = r13
            r6 = r11
            r7 = r14
            r8 = r15
            boolean r2 = a(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L16
            return
        L16:
            boolean r3 = r15.c()
            java.lang.Object r2 = r11.poll()
            if (r2 != 0) goto L22
            r10 = r0
            goto L24
        L22:
            r4 = 0
            r10 = r4
        L24:
            r4 = r10
            r5 = r12
            r6 = r13
            r7 = r11
            r8 = r14
            r9 = r15
            boolean r3 = a(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L31
            return
        L31:
            if (r10 == 0) goto L3b
            int r1 = -r1
            int r1 = r15.a(r1)
            if (r1 != 0) goto L2
            return
        L3b:
            r15.g(r12, r2)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.util.v.d(io.reactivex.rxjava3.internal.fuseable.p, io.reactivex.rxjava3.core.p0, boolean, io.reactivex.rxjava3.disposables.e, io.reactivex.rxjava3.internal.util.r):void");
    }

    public static <T, U> void e(io.reactivex.rxjava3.internal.fuseable.p<T> pVar, org.reactivestreams.p<? super U> pVar2, boolean z4, io.reactivex.rxjava3.disposables.e eVar, u<T, U> uVar) {
        boolean z5;
        int i5 = 1;
        while (true) {
            boolean c5 = uVar.c();
            T poll = pVar.poll();
            if (poll == null) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (b(c5, z5, pVar2, z4, pVar, uVar)) {
                if (eVar != null) {
                    eVar.dispose();
                    return;
                }
                return;
            } else if (z5) {
                i5 = uVar.a(-i5);
                if (i5 == 0) {
                    return;
                }
            } else {
                long requested = uVar.requested();
                if (requested != 0) {
                    if (uVar.g(pVar2, poll) && requested != Long.MAX_VALUE) {
                        uVar.o(1L);
                    }
                } else {
                    pVar.clear();
                    if (eVar != null) {
                        eVar.dispose();
                    }
                    pVar2.onError(new io.reactivex.rxjava3.exceptions.c("Could not emit value due to lack of requests."));
                    return;
                }
            }
        }
    }

    static boolean f(m3.e eVar) {
        try {
            return eVar.getAsBoolean();
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            return true;
        }
    }

    public static <T> void g(org.reactivestreams.p<? super T> pVar, Queue<T> queue, AtomicLong atomicLong, m3.e eVar) {
        long j5;
        long j6;
        if (queue.isEmpty()) {
            pVar.onComplete();
            return;
        }
        if (h(atomicLong.get(), pVar, queue, atomicLong, eVar)) {
            return;
        }
        do {
            j5 = atomicLong.get();
            if ((j5 & Long.MIN_VALUE) != 0) {
                return;
            } else {
                j6 = j5 | Long.MIN_VALUE;
            }
        } while (!atomicLong.compareAndSet(j5, j6));
        if (j5 != 0) {
            h(j6, pVar, queue, atomicLong, eVar);
        }
    }

    static <T> boolean h(long j5, org.reactivestreams.p<? super T> pVar, Queue<T> queue, AtomicLong atomicLong, m3.e eVar) {
        long j6 = j5 & Long.MIN_VALUE;
        while (true) {
            if (j6 != j5) {
                if (f(eVar)) {
                    return true;
                }
                T poll = queue.poll();
                if (poll == null) {
                    pVar.onComplete();
                    return true;
                }
                pVar.onNext(poll);
                j6++;
            } else {
                if (f(eVar)) {
                    return true;
                }
                if (queue.isEmpty()) {
                    pVar.onComplete();
                    return true;
                }
                j5 = atomicLong.get();
                if (j5 == j6) {
                    long addAndGet = atomicLong.addAndGet(-(j6 & Long.MAX_VALUE));
                    if ((Long.MAX_VALUE & addAndGet) == 0) {
                        return false;
                    }
                    j5 = addAndGet;
                    j6 = addAndGet & Long.MIN_VALUE;
                } else {
                    continue;
                }
            }
        }
    }

    public static <T> boolean i(long j5, org.reactivestreams.p<? super T> pVar, Queue<T> queue, AtomicLong atomicLong, m3.e eVar) {
        long j6;
        do {
            j6 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j6, d.c(Long.MAX_VALUE & j6, j5) | (j6 & Long.MIN_VALUE)));
        if (j6 == Long.MIN_VALUE) {
            h(j5 | Long.MIN_VALUE, pVar, queue, atomicLong, eVar);
            return true;
        }
        return false;
    }

    public static void j(org.reactivestreams.q qVar, int i5) {
        qVar.request(i5 < 0 ? Long.MAX_VALUE : i5);
    }
}
