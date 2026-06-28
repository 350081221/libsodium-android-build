package kotlinx.coroutines;

import com.umeng.analytics.pro.bi;
import kotlinx.coroutines.scheduling.a;

@kotlin.i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\b\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u0019\u0010\u0007\u001a\u00020\u00052\u000e\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0080\b\u001a\b\u0010\b\u001a\u00020\u0002H\u0001\u001a\f\u0010\u000b\u001a\u00020\n*\u00020\tH\u0001¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/r1;", bi.ay, "", "d", "Lkotlin/Function0;", "Lkotlin/r2;", "block", "c", "e", "Ljava/lang/Thread;", "", "b", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class u1 {
    @p4.l
    public static final r1 a() {
        return new h(Thread.currentThread());
    }

    @f1
    @g2
    @kotlin.a1
    public static final boolean b(@p4.l Thread thread) {
        if (!(thread instanceof a.c)) {
            return false;
        }
        return ((a.c) thread).p();
    }

    public static final void c(@p4.l v3.a<kotlin.r2> aVar) {
        aVar.invoke();
    }

    @g2
    public static final long d() {
        r1 a5 = p3.f20437a.a();
        if (a5 != null) {
            return a5.M0();
        }
        return Long.MAX_VALUE;
    }

    @f1
    @g2
    @kotlin.a1
    public static final long e() {
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof a.c) {
            return ((a.c) currentThread).t();
        }
        throw new IllegalStateException("Expected CoroutineScheduler.Worker, but got " + currentThread);
    }
}
