package kotlinx.coroutines.scheduling;

import com.umeng.analytics.pro.bi;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;
import u3.w;

@i0(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b.\u0010/J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\b\u001a\u0004\u0018\u00010\u00022\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u001a\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002J$\u0010\u0011\u001a\u00020\u00102\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000eH\u0002J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0002J\u000e\u0010\u0017\u001a\u00020\u0016*\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\tJ\"\u0010\u001b\u001a\u00020\u00102\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000eJ\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002J\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u0012R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010!R\u0014\u0010%\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$R\u000b\u0010)\u001a\u00020(8\u0002X\u0082\u0004R\u000b\u0010*\u001a\u00020(8\u0002X\u0082\u0004R\u0013\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020+8\u0002X\u0082\u0004R\u000b\u0010-\u001a\u00020(8\u0002X\u0082\u0004¨\u00060"}, d2 = {"Lkotlinx/coroutines/scheduling/q;", "", "Lkotlinx/coroutines/scheduling/k;", "task", "c", "", "Lkotlinx/coroutines/scheduling/StealingMode;", "stealingMode", "n", "", "onlyBlocking", "m", "index", "o", "Lkotlin/jvm/internal/k1$h;", "stolenTaskRef", "", "q", "Lkotlinx/coroutines/scheduling/f;", "queue", "l", "j", "Lkotlin/r2;", "d", bi.aJ, "fair", bi.ay, bi.aA, "i", "k", "globalQueue", socket.g.f22386a, "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "buffer", "e", "()I", "bufferSize", "f", "size", "Lkotlinx/atomicfu/AtomicInt;", "blockingTasksInBuffer", "consumerIndex", "Lkotlinx/atomicfu/AtomicRef;", "lastScheduledTask", "producerIndex", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nWorkQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueue\n+ 2 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueueKt\n*L\n1#1,255:1\n90#2:256\n90#2:257\n90#2:258\n90#2:261\n90#2:262\n1#3:259\n25#4:260\n*S KotlinDebug\n*F\n+ 1 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueue\n*L\n95#1:256\n162#1:257\n185#1:258\n205#1:261\n249#1:262\n205#1:260\n*E\n"})
/* loaded from: classes4.dex */
public final class q {

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private static final AtomicReferenceFieldUpdater f20546b = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "lastScheduledTask");

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private static final AtomicIntegerFieldUpdater f20547c = AtomicIntegerFieldUpdater.newUpdater(q.class, "producerIndex");

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    private static final AtomicIntegerFieldUpdater f20548d = AtomicIntegerFieldUpdater.newUpdater(q.class, "consumerIndex");

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private static final AtomicIntegerFieldUpdater f20549e = AtomicIntegerFieldUpdater.newUpdater(q.class, "blockingTasksInBuffer");

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final AtomicReferenceArray<k> f20550a = new AtomicReferenceArray<>(128);

    @w
    private volatile int blockingTasksInBuffer;

    @w
    private volatile int consumerIndex;

    @w
    @p4.m
    private volatile Object lastScheduledTask;

    @w
    private volatile int producerIndex;

    public static /* synthetic */ k b(q qVar, k kVar, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        return qVar.a(kVar, z4);
    }

    private final k c(k kVar) {
        if (e() == 127) {
            return kVar;
        }
        boolean z4 = true;
        if (kVar.f20532b.i0() != 1) {
            z4 = false;
        }
        if (z4) {
            f20549e.incrementAndGet(this);
        }
        int i5 = f20547c.get(this) & 127;
        while (this.f20550a.get(i5) != null) {
            Thread.yield();
        }
        this.f20550a.lazySet(i5, kVar);
        f20547c.incrementAndGet(this);
        return null;
    }

    private final void d(k kVar) {
        if (kVar != null) {
            boolean z4 = true;
            if (kVar.f20532b.i0() != 1) {
                z4 = false;
            }
            if (z4) {
                f20549e.decrementAndGet(this);
            }
        }
    }

    private final int e() {
        return f20547c.get(this) - f20548d.get(this);
    }

    private final k j() {
        k andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f20548d;
            int i5 = atomicIntegerFieldUpdater.get(this);
            if (i5 - f20547c.get(this) == 0) {
                return null;
            }
            int i6 = i5 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i5, i5 + 1) && (andSet = this.f20550a.getAndSet(i6, null)) != null) {
                d(andSet);
                return andSet;
            }
        }
    }

    private final boolean l(f fVar) {
        k j5 = j();
        if (j5 == null) {
            return false;
        }
        fVar.a(j5);
        return true;
    }

    private final k m(boolean z4) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        k kVar;
        do {
            atomicReferenceFieldUpdater = f20546b;
            kVar = (k) atomicReferenceFieldUpdater.get(this);
            if (kVar != null) {
                boolean z5 = true;
                if (kVar.f20532b.i0() != 1) {
                    z5 = false;
                }
                if (z5 == z4) {
                }
            }
            int i5 = f20548d.get(this);
            int i6 = f20547c.get(this);
            while (i5 != i6) {
                if (z4 && f20549e.get(this) == 0) {
                    return null;
                }
                i6--;
                k o5 = o(i6, z4);
                if (o5 != null) {
                    return o5;
                }
            }
            return null;
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, kVar, null));
        return kVar;
    }

    private final k n(int i5) {
        int i6 = f20548d.get(this);
        int i7 = f20547c.get(this);
        boolean z4 = true;
        if (i5 != 1) {
            z4 = false;
        }
        while (i6 != i7) {
            if (z4 && f20549e.get(this) == 0) {
                return null;
            }
            int i8 = i6 + 1;
            k o5 = o(i6, z4);
            if (o5 == null) {
                i6 = i8;
            } else {
                return o5;
            }
        }
        return null;
    }

    private final k o(int i5, boolean z4) {
        int i6 = i5 & 127;
        k kVar = this.f20550a.get(i6);
        if (kVar != null) {
            boolean z5 = true;
            if (kVar.f20532b.i0() != 1) {
                z5 = false;
            }
            if (z5 == z4 && kotlinx.coroutines.channels.q.a(this.f20550a, i6, kVar, null)) {
                if (z4) {
                    f20549e.decrementAndGet(this);
                }
                return kVar;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, kotlinx.coroutines.scheduling.k, java.lang.Object] */
    private final long q(int i5, k1.h<k> hVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ?? r12;
        boolean z4;
        do {
            atomicReferenceFieldUpdater = f20546b;
            r12 = (k) atomicReferenceFieldUpdater.get(this);
            if (r12 == 0) {
                return -2L;
            }
            int i6 = 1;
            if (r12.f20532b.i0() == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                i6 = 2;
            }
            if ((i6 & i5) == 0) {
                return -2L;
            }
            long a5 = o.f20540f.a() - r12.f20531a;
            long j5 = o.f20536b;
            if (a5 < j5) {
                return j5 - a5;
            }
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, r12, null));
        hVar.element = r12;
        return -1L;
    }

    @p4.m
    public final k a(@p4.l k kVar, boolean z4) {
        if (z4) {
            return c(kVar);
        }
        k kVar2 = (k) f20546b.getAndSet(this, kVar);
        if (kVar2 == null) {
            return null;
        }
        return c(kVar2);
    }

    public final int f() {
        return f20546b.get(this) != null ? e() + 1 : e();
    }

    public final void g(@p4.l f fVar) {
        k kVar = (k) f20546b.getAndSet(this, null);
        if (kVar != null) {
            fVar.a(kVar);
        }
        do {
        } while (l(fVar));
    }

    @p4.m
    public final k h() {
        k kVar = (k) f20546b.getAndSet(this, null);
        return kVar == null ? j() : kVar;
    }

    @p4.m
    public final k i() {
        return m(true);
    }

    @p4.m
    public final k k() {
        return m(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long p(int i5, @p4.l k1.h<k> hVar) {
        T t5;
        if (i5 == 3) {
            t5 = j();
        } else {
            t5 = n(i5);
        }
        if (t5 != 0) {
            hVar.element = t5;
            return -1L;
        }
        return q(i5, hVar);
    }
}
