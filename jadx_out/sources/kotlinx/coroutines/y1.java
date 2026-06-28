package kotlinx.coroutines;

import com.bytedance.android.live.base.api.push.ILivePush;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.umeng.analytics.pro.bi;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.c1;

@kotlin.i0(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010%\u001a\u00020 ¢\u0006\u0004\b&\u0010'J.\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b*\u00020\u00032\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u001c\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u001e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0016J$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u0017\u001a\u00020\u000fH\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0016R\u001a\u0010%\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"Lkotlinx/coroutines/y1;", "Lkotlinx/coroutines/x1;", "Lkotlinx/coroutines/c1;", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "", "timeMillis", "Ljava/util/concurrent/ScheduledFuture;", "E0", "Ljava/util/concurrent/RejectedExecutionException;", "exception", "Lkotlin/r2;", "D0", "dispatch", "Lkotlinx/coroutines/p;", "continuation", bi.aA, "Lkotlinx/coroutines/n1;", "I", ILivePush.ClickType.CLOSE, "", "toString", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "Ljava/util/concurrent/Executor;", "b", "Ljava/util/concurrent/Executor;", "C0", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class y1 extends x1 implements c1 {

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final Executor f20694b;

    public y1(@p4.l Executor executor) {
        this.f20694b = executor;
        kotlinx.coroutines.internal.d.c(C0());
    }

    private final void D0(kotlin.coroutines.g gVar, RejectedExecutionException rejectedExecutionException) {
        p2.f(gVar, w1.a("The task was rejected", rejectedExecutionException));
    }

    private final ScheduledFuture<?> E0(ScheduledExecutorService scheduledExecutorService, Runnable runnable, kotlin.coroutines.g gVar, long j5) {
        try {
            return scheduledExecutorService.schedule(runnable, j5, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e5) {
            D0(gVar, e5);
            return null;
        }
    }

    @Override // kotlinx.coroutines.x1
    @p4.l
    public Executor C0() {
        return this.f20694b;
    }

    @Override // kotlinx.coroutines.c1
    @p4.l
    public n1 I(long j5, @p4.l Runnable runnable, @p4.l kotlin.coroutines.g gVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor C0 = C0();
        ScheduledFuture<?> scheduledFuture = null;
        if (C0 instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) C0;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            scheduledFuture = E0(scheduledExecutorService, runnable, gVar, j5);
        }
        if (scheduledFuture != null) {
            return new m1(scheduledFuture);
        }
        return y0.f20685g.I(j5, runnable, gVar);
    }

    @Override // kotlinx.coroutines.x1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor C0 = C0();
        ExecutorService executorService = C0 instanceof ExecutorService ? (ExecutorService) C0 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // kotlinx.coroutines.n0
    public void dispatch(@p4.l kotlin.coroutines.g gVar, @p4.l Runnable runnable) {
        Runnable runnable2;
        try {
            Executor C0 = C0();
            b b5 = c.b();
            if (b5 == null || (runnable2 = b5.i(runnable)) == null) {
                runnable2 = runnable;
            }
            C0.execute(runnable2);
        } catch (RejectedExecutionException e5) {
            b b6 = c.b();
            if (b6 != null) {
                b6.f();
            }
            D0(gVar, e5);
            k1.c().dispatch(gVar, runnable);
        }
    }

    public boolean equals(@p4.m Object obj) {
        return (obj instanceof y1) && ((y1) obj).C0() == C0();
    }

    public int hashCode() {
        return System.identityHashCode(C0());
    }

    @Override // kotlinx.coroutines.c1
    public void p(long j5, @p4.l p<? super kotlin.r2> pVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor C0 = C0();
        ScheduledFuture<?> scheduledFuture = null;
        if (C0 instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) C0;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            scheduledFuture = E0(scheduledExecutorService, new g3(this, pVar), pVar.getContext(), j5);
        }
        if (scheduledFuture != null) {
            p2.w(pVar, scheduledFuture);
        } else {
            y0.f20685g.p(j5, pVar);
        }
    }

    @Override // kotlinx.coroutines.c1
    @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @p4.m
    public Object p0(long j5, @p4.l kotlin.coroutines.d<? super kotlin.r2> dVar) {
        return c1.a.a(this, j5, dVar);
    }

    @Override // kotlinx.coroutines.n0
    @p4.l
    public String toString() {
        return C0().toString();
    }
}
