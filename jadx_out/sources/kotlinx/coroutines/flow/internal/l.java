package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;
import kotlin.i0;
import kotlin.jvm.internal.r1;

@i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/flow/internal/l;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "fillInStackTrace", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nFlowExceptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExceptions.kt\nkotlinx/coroutines/flow/internal/ChildCancelledException\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,30:1\n26#2:31\n*S KotlinDebug\n*F\n+ 1 FlowExceptions.kt\nkotlinx/coroutines/flow/internal/ChildCancelledException\n*L\n26#1:31\n*E\n"})
/* loaded from: classes4.dex */
public final class l extends CancellationException {
    public l() {
        super("Child of the scoped flow was cancelled");
    }

    @Override // java.lang.Throwable
    @p4.l
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
