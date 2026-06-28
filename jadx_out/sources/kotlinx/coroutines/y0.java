package kotlinx.coroutines;

import com.umeng.analytics.pro.bi;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.s1;

@kotlin.i0(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0017\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b@\u0010\u001bJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\u0014\u0010\f\u001a\u00020\u00042\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003H\u0016J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014J\b\u0010\u0012\u001a\u00020\u0004H\u0016J$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\r2\n\u0010\u0014\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J\u000f\u0010\u001a\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\rR\u0014\u0010!\u001a\u00020\u001e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#R\u001e\u0010'\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010\u001bR\u0014\u0010,\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010\u0018R\u0014\u0010.\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010\u0018R\u0014\u00100\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010\u0018R\u0014\u00102\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010\u0018R\u0014\u00104\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u0010\u0018R\u0016\u00105\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010\u0018R\u0014\u00108\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010:\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u00107R\u0014\u0010=\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b>\u00107¨\u0006A"}, d2 = {"Lkotlinx/coroutines/y0;", "Lkotlinx/coroutines/s1;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lkotlin/r2;", "n1", "Ljava/lang/Thread;", "g1", "", "m1", "f1", "task", "V0", "", "now", "Lkotlinx/coroutines/s1$c;", "delayedTask", "Q0", "shutdown", "timeMillis", "block", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "Lkotlinx/coroutines/n1;", "I", "run", "h1", "()V", m0.a.Z, "o1", "", bi.aJ, "Ljava/lang/String;", "THREAD_NAME", "i", "J", "DEFAULT_KEEP_ALIVE_MS", "j", "KEEP_ALIVE_NANOS", "_thread", "Ljava/lang/Thread;", "get_thread$annotations", "", "k", "FRESH", "l", "ACTIVE", "m", "SHUTDOWN_REQ", "n", "SHUTDOWN_ACK", "o", "SHUTDOWN", "debugStatus", "j1", "()Z", "isShutDown", "k1", "isShutdownRequested", "P0", "()Ljava/lang/Thread;", "thread", "l1", "isThreadPresent", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nDefaultExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultExecutor.kt\nkotlinx/coroutines/DefaultExecutor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n1#2:187\n*E\n"})
/* loaded from: classes4.dex */
public final class y0 extends s1 implements Runnable {

    @p4.m
    private static volatile Thread _thread = null;
    private static volatile int debugStatus = 0;

    /* renamed from: g, reason: collision with root package name */
    @p4.l
    public static final y0 f20685g;

    /* renamed from: h, reason: collision with root package name */
    @p4.l
    public static final String f20686h = "kotlinx.coroutines.DefaultExecutor";

    /* renamed from: i, reason: collision with root package name */
    private static final long f20687i = 1000;

    /* renamed from: j, reason: collision with root package name */
    private static final long f20688j;

    /* renamed from: k, reason: collision with root package name */
    private static final int f20689k = 0;

    /* renamed from: l, reason: collision with root package name */
    private static final int f20690l = 1;

    /* renamed from: m, reason: collision with root package name */
    private static final int f20691m = 2;

    /* renamed from: n, reason: collision with root package name */
    private static final int f20692n = 3;

    /* renamed from: o, reason: collision with root package name */
    private static final int f20693o = 4;

    static {
        Long l5;
        y0 y0Var = new y0();
        f20685g = y0Var;
        r1.I0(y0Var, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l5 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l5 = 1000L;
        }
        f20688j = timeUnit.toNanos(l5.longValue());
    }

    private y0() {
    }

    private final synchronized void f1() {
        if (!k1()) {
            return;
        }
        debugStatus = 3;
        Z0();
        kotlin.jvm.internal.l0.n(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
    }

    private final synchronized Thread g1() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, f20686h);
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private static /* synthetic */ void i1() {
    }

    private final boolean j1() {
        return debugStatus == 4;
    }

    private final boolean k1() {
        int i5 = debugStatus;
        return i5 == 2 || i5 == 3;
    }

    private final synchronized boolean m1() {
        if (k1()) {
            return false;
        }
        debugStatus = 1;
        kotlin.jvm.internal.l0.n(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    private final void n1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // kotlinx.coroutines.s1, kotlinx.coroutines.c1
    @p4.l
    public n1 I(long j5, @p4.l Runnable runnable, @p4.l kotlin.coroutines.g gVar) {
        return c1(j5, runnable);
    }

    @Override // kotlinx.coroutines.t1
    @p4.l
    protected Thread P0() {
        Thread thread = _thread;
        return thread == null ? g1() : thread;
    }

    @Override // kotlinx.coroutines.t1
    protected void Q0(long j5, @p4.l s1.c cVar) {
        n1();
    }

    @Override // kotlinx.coroutines.s1
    public void V0(@p4.l Runnable runnable) {
        if (j1()) {
            n1();
        }
        super.V0(runnable);
    }

    public final synchronized void h1() {
        debugStatus = 0;
        g1();
        while (debugStatus == 0) {
            kotlin.jvm.internal.l0.n(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        }
    }

    public final boolean l1() {
        return _thread != null;
    }

    public final synchronized void o1(long j5) {
        kotlin.r2 r2Var;
        long currentTimeMillis = System.currentTimeMillis() + j5;
        if (!k1()) {
            debugStatus = 2;
        }
        while (debugStatus != 3 && _thread != null) {
            Thread thread = _thread;
            if (thread != null) {
                b b5 = c.b();
                if (b5 != null) {
                    b5.g(thread);
                    r2Var = kotlin.r2.f19517a;
                } else {
                    r2Var = null;
                }
                if (r2Var == null) {
                    LockSupport.unpark(thread);
                }
            }
            if (currentTimeMillis - System.currentTimeMillis() <= 0) {
                break;
            }
            kotlin.jvm.internal.l0.n(this, "null cannot be cast to non-null type java.lang.Object");
            wait(j5);
        }
        debugStatus = 0;
    }

    @Override // java.lang.Runnable
    public void run() {
        kotlin.r2 r2Var;
        long nanoTime;
        boolean J0;
        p3.f20437a.d(this);
        b b5 = c.b();
        if (b5 != null) {
            b5.d();
        }
        try {
            if (!m1()) {
                if (!J0) {
                    return;
                } else {
                    return;
                }
            }
            long j5 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long M0 = M0();
                if (M0 == Long.MAX_VALUE) {
                    b b6 = c.b();
                    if (b6 != null) {
                        nanoTime = b6.b();
                    } else {
                        nanoTime = System.nanoTime();
                    }
                    if (j5 == Long.MAX_VALUE) {
                        j5 = f20688j + nanoTime;
                    }
                    long j6 = j5 - nanoTime;
                    if (j6 <= 0) {
                        _thread = null;
                        f1();
                        b b7 = c.b();
                        if (b7 != null) {
                            b7.h();
                        }
                        if (!J0()) {
                            P0();
                            return;
                        }
                        return;
                    }
                    M0 = kotlin.ranges.u.C(M0, j6);
                } else {
                    j5 = Long.MAX_VALUE;
                }
                if (M0 > 0) {
                    if (k1()) {
                        _thread = null;
                        f1();
                        b b8 = c.b();
                        if (b8 != null) {
                            b8.h();
                        }
                        if (!J0()) {
                            P0();
                            return;
                        }
                        return;
                    }
                    b b9 = c.b();
                    if (b9 != null) {
                        b9.c(this, M0);
                        r2Var = kotlin.r2.f19517a;
                    } else {
                        r2Var = null;
                    }
                    if (r2Var == null) {
                        LockSupport.parkNanos(this, M0);
                    }
                }
            }
        } finally {
            _thread = null;
            f1();
            b b10 = c.b();
            if (b10 != null) {
                b10.h();
            }
            if (!J0()) {
                P0();
            }
        }
    }

    @Override // kotlinx.coroutines.s1, kotlinx.coroutines.r1
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
