package kotlinx.coroutines;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@kotlin.i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\n\u0010\b\u001a\u00020\u0004*\u00020\u0005*\u0010\b\u0007\u0010\n\"\u00020\u00012\u00020\u0001B\u0002\b\t¨\u0006\u000b"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "Lkotlinx/coroutines/x1;", "d", "(Ljava/util/concurrent/ExecutorService;)Lkotlinx/coroutines/x1;", "Ljava/util/concurrent/Executor;", "Lkotlinx/coroutines/n0;", "c", "(Ljava/util/concurrent/Executor;)Lkotlinx/coroutines/n0;", "b", "Lkotlinx/coroutines/a2;", "CloseableCoroutineDispatcher", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class z1 {
    @a2
    public static /* synthetic */ void a() {
    }

    @p4.l
    public static final Executor b(@p4.l n0 n0Var) {
        Executor C0;
        x1 x1Var = n0Var instanceof x1 ? (x1) n0Var : null;
        return (x1Var == null || (C0 = x1Var.C0()) == null) ? new j1(n0Var) : C0;
    }

    @p4.l
    @u3.h(name = TypedValues.TransitionType.S_FROM)
    public static final n0 c(@p4.l Executor executor) {
        n0 n0Var;
        j1 j1Var = executor instanceof j1 ? (j1) executor : null;
        return (j1Var == null || (n0Var = j1Var.f20415a) == null) ? new y1(executor) : n0Var;
    }

    @p4.l
    @u3.h(name = TypedValues.TransitionType.S_FROM)
    public static final x1 d(@p4.l ExecutorService executorService) {
        return new y1(executorService);
    }
}
