package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;
import kotlin.i0;
import kotlin.jvm.internal.r1;

@i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u0018\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/flow/internal/a;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "fillInStackTrace", "Lkotlinx/coroutines/flow/j;", "owner", "Lkotlinx/coroutines/flow/j;", "<init>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nFlowExceptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExceptions.kt\nkotlinx/coroutines/flow/internal/AbortFlowException\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,30:1\n26#2:31\n*S KotlinDebug\n*F\n+ 1 FlowExceptions.kt\nkotlinx/coroutines/flow/internal/AbortFlowException\n*L\n17#1:31\n*E\n"})
/* loaded from: classes4.dex */
public final class a extends CancellationException {

    @p4.l
    @u3.e
    public final transient kotlinx.coroutines.flow.j<?> owner;

    public a(@p4.l kotlinx.coroutines.flow.j<?> jVar) {
        super("Flow was aborted, no more elements needed");
        this.owner = jVar;
    }

    @Override // java.lang.Throwable
    @p4.l
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
