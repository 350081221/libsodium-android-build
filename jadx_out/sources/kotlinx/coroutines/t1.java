package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.s1;

@kotlin.i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0004J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u0014\u0010\f\u001a\u00020\t8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/t1;", "Lkotlinx/coroutines/r1;", "Lkotlin/r2;", "R0", "", "now", "Lkotlinx/coroutines/s1$c;", "delayedTask", "Q0", "Ljava/lang/Thread;", "P0", "()Ljava/lang/Thread;", "thread", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public abstract class t1 extends r1 {
    @p4.l
    protected abstract Thread P0();

    /* JADX INFO: Access modifiers changed from: protected */
    public void Q0(long j5, @p4.l s1.c cVar) {
        y0.f20685g.a1(j5, cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void R0() {
        kotlin.r2 r2Var;
        Thread P0 = P0();
        if (Thread.currentThread() != P0) {
            b b5 = c.b();
            if (b5 != null) {
                b5.g(P0);
                r2Var = kotlin.r2.f19517a;
            } else {
                r2Var = null;
            }
            if (r2Var == null) {
                LockSupport.unpark(P0);
            }
        }
    }
}
