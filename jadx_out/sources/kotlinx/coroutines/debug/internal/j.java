package kotlinx.coroutines.debug.internal;

import java.io.Serializable;
import java.lang.Thread;
import java.util.List;
import kotlin.a1;
import kotlin.i0;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;

@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000bR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0013\u0010\u000bR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006$"}, d2 = {"Lkotlinx/coroutines/debug/internal/j;", "Ljava/io/Serializable;", "", "coroutineId", "Ljava/lang/Long;", "getCoroutineId", "()Ljava/lang/Long;", "", "dispatcher", "Ljava/lang/String;", "getDispatcher", "()Ljava/lang/String;", "name", "getName", "state", "getState", "lastObservedThreadState", "getLastObservedThreadState", "lastObservedThreadName", "getLastObservedThreadName", "", "Ljava/lang/StackTraceElement;", "lastObservedStackTrace", "Ljava/util/List;", "getLastObservedStackTrace", "()Ljava/util/List;", "sequenceNumber", "J", "getSequenceNumber", "()J", "Lkotlinx/coroutines/debug/internal/e;", "source", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "<init>", "(Lkotlinx/coroutines/debug/internal/e;Lkotlin/coroutines/g;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@a1
/* loaded from: classes4.dex */
public final class j implements Serializable {

    @p4.m
    private final Long coroutineId;

    @p4.m
    private final String dispatcher;

    @p4.l
    private final List<StackTraceElement> lastObservedStackTrace;

    @p4.m
    private final String lastObservedThreadName;

    @p4.m
    private final String lastObservedThreadState;

    @p4.m
    private final String name;
    private final long sequenceNumber;

    @p4.l
    private final String state;

    public j(@p4.l e eVar, @p4.l kotlin.coroutines.g gVar) {
        Long l5;
        String str;
        String str2;
        String str3;
        Thread.State state;
        q0 q0Var = (q0) gVar.get(q0.f20444b);
        if (q0Var != null) {
            l5 = Long.valueOf(q0Var.F0());
        } else {
            l5 = null;
        }
        this.coroutineId = l5;
        kotlin.coroutines.e eVar2 = (kotlin.coroutines.e) gVar.get(kotlin.coroutines.e.S);
        if (eVar2 != null) {
            str = eVar2.toString();
        } else {
            str = null;
        }
        this.dispatcher = str;
        r0 r0Var = (r0) gVar.get(r0.f20457b);
        if (r0Var != null) {
            str2 = r0Var.F0();
        } else {
            str2 = null;
        }
        this.name = str2;
        this.state = eVar.g();
        Thread thread = eVar.lastObservedThread;
        if (thread != null && (state = thread.getState()) != null) {
            str3 = state.toString();
        } else {
            str3 = null;
        }
        this.lastObservedThreadState = str3;
        Thread thread2 = eVar.lastObservedThread;
        this.lastObservedThreadName = thread2 != null ? thread2.getName() : null;
        this.lastObservedStackTrace = eVar.h();
        this.sequenceNumber = eVar.f19988b;
    }

    @p4.m
    public final Long getCoroutineId() {
        return this.coroutineId;
    }

    @p4.m
    public final String getDispatcher() {
        return this.dispatcher;
    }

    @p4.l
    public final List<StackTraceElement> getLastObservedStackTrace() {
        return this.lastObservedStackTrace;
    }

    @p4.m
    public final String getLastObservedThreadName() {
        return this.lastObservedThreadName;
    }

    @p4.m
    public final String getLastObservedThreadState() {
        return this.lastObservedThreadState;
    }

    @p4.m
    public final String getName() {
        return this.name;
    }

    public final long getSequenceNumber() {
        return this.sequenceNumber;
    }

    @p4.l
    public final String getState() {
        return this.state;
    }
}
