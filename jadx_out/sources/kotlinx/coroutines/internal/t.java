package kotlinx.coroutines.internal;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.umeng.analytics.pro.bi;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.g2;
import kotlinx.coroutines.n1;

@kotlin.i0(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001fB\u0017\u0012\u0006\u0010!\u001a\u00020\u0001\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b.\u0010/J-\u0010\n\u001a\u00020\b2\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\u0016\u0010\t\u001a\u0012\u0012\b\u0012\u00060\u0007R\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0006H\u0082\bJ\b\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\r\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004H\u0002J\u001b\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0097Aø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u000e2\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0096\u0001J\u001f\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0017H\u0096\u0001J\u0010\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001aH\u0017J\u001c\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016J\u001c\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0017R\u0014\u0010!\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0016R\u001e\u0010&\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010+\u001a\u00060'j\u0002`(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u000b\u0010-\u001a\u00020,8\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u00060"}, d2 = {"Lkotlinx/coroutines/internal/t;", "Lkotlinx/coroutines/n0;", "Lkotlinx/coroutines/c1;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/t$a;", "Lkotlin/r2;", "startWorker", "E0", "", "G0", "F0", "", CrashHianalyticsData.TIME, "p0", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "timeMillis", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "Lkotlinx/coroutines/n1;", "I", "Lkotlinx/coroutines/p;", "continuation", bi.aA, "", "parallelism", "limitedParallelism", "dispatch", "dispatchYield", bi.ay, "Lkotlinx/coroutines/n0;", "dispatcher", "b", "Lkotlinx/coroutines/internal/a0;", "d", "Lkotlinx/coroutines/internal/a0;", "queue", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "e", "Ljava/lang/Object;", "workerAllocationLock", "Lkotlinx/atomicfu/AtomicInt;", "runningWorkers", "<init>", "(Lkotlinx/coroutines/n0;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLimitedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcher\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,134:1\n66#1,8:135\n66#1,8:143\n28#2,4:151\n28#2,4:156\n20#3:155\n20#3:160\n*S KotlinDebug\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcher\n*L\n48#1:135,8\n55#1:143,8\n79#1:151,4\n92#1:156,4\n79#1:155\n92#1:160\n*E\n"})
/* loaded from: classes4.dex */
public final class t extends kotlinx.coroutines.n0 implements kotlinx.coroutines.c1 {

    /* renamed from: f, reason: collision with root package name */
    @p4.l
    private static final AtomicIntegerFieldUpdater f20391f = AtomicIntegerFieldUpdater.newUpdater(t.class, "runningWorkers");

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final kotlinx.coroutines.n0 f20392a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20393b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ kotlinx.coroutines.c1 f20394c;

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    private final a0<Runnable> f20395d;

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private final Object f20396e;

    @u3.w
    private volatile int runningWorkers;

    @kotlin.i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0007\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u001a\u0010\u0007\u001a\u00060\u0001j\u0002`\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/internal/t$a;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lkotlin/r2;", "run", bi.ay, "Ljava/lang/Runnable;", "currentTask", "<init>", "(Lkotlinx/coroutines/internal/t;Ljava/lang/Runnable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    private final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        @p4.l
        private Runnable f20397a;

        public a(@p4.l Runnable runnable) {
            this.f20397a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i5 = 0;
            while (true) {
                try {
                    this.f20397a.run();
                } catch (Throwable th) {
                    kotlinx.coroutines.p0.b(kotlin.coroutines.i.INSTANCE, th);
                }
                Runnable F0 = t.this.F0();
                if (F0 == null) {
                    return;
                }
                this.f20397a = F0;
                i5++;
                if (i5 >= 16 && t.this.f20392a.isDispatchNeeded(t.this)) {
                    t.this.f20392a.dispatch(t.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t(@p4.l kotlinx.coroutines.n0 n0Var, int i5) {
        kotlinx.coroutines.c1 c1Var;
        this.f20392a = n0Var;
        this.f20393b = i5;
        if (n0Var instanceof kotlinx.coroutines.c1) {
            c1Var = (kotlinx.coroutines.c1) n0Var;
        } else {
            c1Var = null;
        }
        this.f20394c = c1Var == null ? kotlinx.coroutines.z0.a() : c1Var;
        this.f20395d = new a0<>(false);
        this.f20396e = new Object();
    }

    private final void E0(Runnable runnable, v3.l<? super a, r2> lVar) {
        Runnable F0;
        this.f20395d.a(runnable);
        if (f20391f.get(this) >= this.f20393b || !G0() || (F0 = F0()) == null) {
            return;
        }
        lVar.invoke(new a(F0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable F0() {
        while (true) {
            Runnable h5 = this.f20395d.h();
            if (h5 == null) {
                synchronized (this.f20396e) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f20391f;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    if (this.f20395d.c() == 0) {
                        return null;
                    }
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                }
            } else {
                return h5;
            }
        }
    }

    private final boolean G0() {
        synchronized (this.f20396e) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f20391f;
            if (atomicIntegerFieldUpdater.get(this) >= this.f20393b) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // kotlinx.coroutines.c1
    @p4.l
    public n1 I(long j5, @p4.l Runnable runnable, @p4.l kotlin.coroutines.g gVar) {
        return this.f20394c.I(j5, runnable, gVar);
    }

    @Override // kotlinx.coroutines.n0
    public void dispatch(@p4.l kotlin.coroutines.g gVar, @p4.l Runnable runnable) {
        Runnable F0;
        this.f20395d.a(runnable);
        if (f20391f.get(this) < this.f20393b && G0() && (F0 = F0()) != null) {
            this.f20392a.dispatch(this, new a(F0));
        }
    }

    @Override // kotlinx.coroutines.n0
    @g2
    public void dispatchYield(@p4.l kotlin.coroutines.g gVar, @p4.l Runnable runnable) {
        Runnable F0;
        this.f20395d.a(runnable);
        if (f20391f.get(this) < this.f20393b && G0() && (F0 = F0()) != null) {
            this.f20392a.dispatchYield(this, new a(F0));
        }
    }

    @Override // kotlinx.coroutines.n0
    @p4.l
    @a2
    public kotlinx.coroutines.n0 limitedParallelism(int i5) {
        u.a(i5);
        if (i5 >= this.f20393b) {
            return this;
        }
        return super.limitedParallelism(i5);
    }

    @Override // kotlinx.coroutines.c1
    public void p(long j5, @p4.l kotlinx.coroutines.p<? super r2> pVar) {
        this.f20394c.p(j5, pVar);
    }

    @Override // kotlinx.coroutines.c1
    @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @p4.m
    public Object p0(long j5, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        return this.f20394c.p0(j5, dVar);
    }
}
