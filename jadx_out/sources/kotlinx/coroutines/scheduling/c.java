package kotlinx.coroutines.scheduling;

import com.bytedance.android.live.base.api.push.ILivePush;
import java.util.concurrent.Executor;
import kotlin.i0;
import kotlin.ranges.u;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.g2;
import kotlinx.coroutines.internal.w0;
import kotlinx.coroutines.internal.y0;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.x1;

@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u001c\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u000e\u001a\u00060\u0003j\u0002`\rH\u0016J\u001c\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u000e\u001a\u00060\u0003j\u0002`\rH\u0017J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u0014\u0010\u0016\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/scheduling/c;", "Lkotlinx/coroutines/x1;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "command", "Lkotlin/r2;", "execute", "", "parallelism", "Lkotlinx/coroutines/n0;", "limitedParallelism", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "Lkotlinx/coroutines/Runnable;", "block", "dispatch", "dispatchYield", ILivePush.ClickType.CLOSE, "", "toString", "c", "Lkotlinx/coroutines/n0;", "default", "C0", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class c extends x1 implements Executor {

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    public static final c f20511b = new c();

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private static final n0 f20512c;

    static {
        int u4;
        int e5;
        p pVar = p.f20545a;
        u4 = u.u(64, w0.a());
        e5 = y0.e(l1.f20427a, u4, 0, 0, 12, null);
        f20512c = pVar.limitedParallelism(e5);
    }

    private c() {
    }

    @Override // kotlinx.coroutines.x1
    @p4.l
    public Executor C0() {
        return this;
    }

    @Override // kotlinx.coroutines.x1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // kotlinx.coroutines.n0
    public void dispatch(@p4.l kotlin.coroutines.g gVar, @p4.l Runnable runnable) {
        f20512c.dispatch(gVar, runnable);
    }

    @Override // kotlinx.coroutines.n0
    @g2
    public void dispatchYield(@p4.l kotlin.coroutines.g gVar, @p4.l Runnable runnable) {
        f20512c.dispatchYield(gVar, runnable);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@p4.l Runnable runnable) {
        dispatch(kotlin.coroutines.i.INSTANCE, runnable);
    }

    @Override // kotlinx.coroutines.n0
    @p4.l
    @a2
    public n0 limitedParallelism(int i5) {
        return p.f20545a.limitedParallelism(i5);
    }

    @Override // kotlinx.coroutines.n0
    @p4.l
    public String toString() {
        return "Dispatchers.IO";
    }
}
