package kotlinx.coroutines;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@kotlin.i0(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u001a\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¨\u0006\u0007"}, d2 = {"", "name", "Lkotlinx/coroutines/x1;", "d", "", "nThreads", "b", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nThreadPoolDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadPoolDispatcher.kt\nkotlinx/coroutines/ThreadPoolDispatcherKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n1#2:73\n*E\n"})
/* loaded from: classes4.dex */
public final class r3 {
    @p4.l
    @f1
    public static final x1 b(final int i5, @p4.l final String str) {
        boolean z4 = true;
        if (i5 < 1) {
            z4 = false;
        }
        if (z4) {
            final AtomicInteger atomicInteger = new AtomicInteger();
            return z1.d(Executors.newScheduledThreadPool(i5, new ThreadFactory() { // from class: kotlinx.coroutines.q3
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread c5;
                    c5 = r3.c(i5, str, atomicInteger, runnable);
                    return c5;
                }
            }));
        }
        throw new IllegalArgumentException(("Expected at least one thread, but " + i5 + " specified").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread c(int i5, String str, AtomicInteger atomicInteger, Runnable runnable) {
        if (i5 != 1) {
            str = str + '-' + atomicInteger.incrementAndGet();
        }
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(true);
        return thread;
    }

    @p4.l
    @f1
    public static final x1 d(@p4.l String str) {
        return b(1, str);
    }
}
