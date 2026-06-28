package kotlinx.coroutines.scheduling;

import com.bytedance.android.live.base.api.push.ILivePush;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.i0;
import kotlinx.coroutines.x1;
import u3.w;

@i0(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B)\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010#\u001a\u00020\u0019¢\u0006\u0004\b-\u0010.J\u001c\u0010\n\u001a\u00020\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0014\u0010\f\u001a\u00020\t2\n\u0010\u000b\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\r\u001a\u00020\tH\u0016J\u001c\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u001c\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\tH\u0016R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"R\u001e\u0010'\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u000b\u0010,\u001a\u00020+8\u0002X\u0082\u0004¨\u0006/"}, d2 = {"Lkotlinx/coroutines/scheduling/g;", "Lkotlinx/coroutines/x1;", "Lkotlinx/coroutines/scheduling/l;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "tailDispatch", "Lkotlin/r2;", "D0", "command", "execute", ILivePush.ClickType.CLOSE, "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "dispatch", "dispatchYield", "", "toString", "f0", "Lkotlinx/coroutines/scheduling/e;", "b", "Lkotlinx/coroutines/scheduling/e;", "dispatcher", "", "c", "I", "parallelism", "d", "Ljava/lang/String;", "name", "e", "i0", "()I", "taskMode", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "f", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "queue", "C0", "()Ljava/util/concurrent/Executor;", "executor", "Lkotlinx/atomicfu/AtomicInt;", "inFlightTasks", "<init>", "(Lkotlinx/coroutines/scheduling/e;ILjava/lang/String;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
final class g extends x1 implements l, Executor {

    /* renamed from: g, reason: collision with root package name */
    @p4.l
    private static final AtomicIntegerFieldUpdater f20519g = AtomicIntegerFieldUpdater.newUpdater(g.class, "inFlightTasks");

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final e f20520b;

    /* renamed from: c, reason: collision with root package name */
    private final int f20521c;

    /* renamed from: d, reason: collision with root package name */
    @p4.m
    private final String f20522d;

    /* renamed from: e, reason: collision with root package name */
    private final int f20523e;

    /* renamed from: f, reason: collision with root package name */
    @p4.l
    private final ConcurrentLinkedQueue<Runnable> f20524f = new ConcurrentLinkedQueue<>();

    @w
    private volatile int inFlightTasks;

    public g(@p4.l e eVar, int i5, @p4.m String str, int i6) {
        this.f20520b = eVar;
        this.f20521c = i5;
        this.f20522d = str;
        this.f20523e = i6;
    }

    private final void D0(Runnable runnable, boolean z4) {
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f20519g;
            if (atomicIntegerFieldUpdater.incrementAndGet(this) <= this.f20521c) {
                this.f20520b.G0(runnable, this, z4);
                return;
            }
            this.f20524f.add(runnable);
            if (atomicIntegerFieldUpdater.decrementAndGet(this) >= this.f20521c) {
                return;
            } else {
                runnable = this.f20524f.poll();
            }
        } while (runnable != null);
    }

    @Override // kotlinx.coroutines.x1
    @p4.l
    public Executor C0() {
        return this;
    }

    @Override // kotlinx.coroutines.x1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    @Override // kotlinx.coroutines.n0
    public void dispatch(@p4.l kotlin.coroutines.g gVar, @p4.l Runnable runnable) {
        D0(runnable, false);
    }

    @Override // kotlinx.coroutines.n0
    public void dispatchYield(@p4.l kotlin.coroutines.g gVar, @p4.l Runnable runnable) {
        D0(runnable, true);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@p4.l Runnable runnable) {
        D0(runnable, false);
    }

    @Override // kotlinx.coroutines.scheduling.l
    public void f0() {
        Runnable poll = this.f20524f.poll();
        if (poll != null) {
            this.f20520b.G0(poll, this, true);
            return;
        }
        f20519g.decrementAndGet(this);
        Runnable poll2 = this.f20524f.poll();
        if (poll2 == null) {
            return;
        }
        D0(poll2, true);
    }

    @Override // kotlinx.coroutines.scheduling.l
    public int i0() {
        return this.f20523e;
    }

    @Override // kotlinx.coroutines.n0
    @p4.l
    public String toString() {
        String str = this.f20522d;
        if (str != null) {
            return str;
        }
        return super.toString() + "[dispatcher = " + this.f20520b + ']';
    }
}
