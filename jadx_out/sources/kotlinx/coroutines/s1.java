package kotlinx.coroutines;

import com.umeng.analytics.pro.bi;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.c1;

@kotlin.i0(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b \u0018\u00002\u00020\u00012\u00020\u0002:\u0004678#B\u0007¢\u0006\u0004\b4\u00105J\u0014\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0002J\u0010\u0010\b\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000bH\u0002J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000bH\u0002J\b\u0010\u0012\u001a\u00020\tH\u0002J\b\u0010\u0013\u001a\u00020\tH\u0016J\u001e\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0015H\u0016J\u001c\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\r2\n\u0010\u0018\u001a\u00060\u0003j\u0002`\u0004H\u0004J\b\u0010\u001b\u001a\u00020\rH\u0016J\u001a\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001c2\n\u0010\u0018\u001a\u00060\u0003j\u0002`\u0004J\u0014\u0010\u001f\u001a\u00020\t2\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016J\u0016\u0010 \u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000bJ\b\u0010!\u001a\u00020\tH\u0004R$\u0010'\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00068B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b(\u0010$R\u0014\u0010,\u001a\u00020\r8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0013\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0-8\u0002X\u0082\u0004R\u000b\u00101\u001a\u0002008\u0002X\u0082\u0004R\u0013\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001020-8\u0002X\u0082\u0004¨\u00069"}, d2 = {"Lkotlinx/coroutines/s1;", "Lkotlinx/coroutines/t1;", "Lkotlinx/coroutines/c1;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "task", "", "W0", "U0", "Lkotlin/r2;", "T0", "Lkotlinx/coroutines/s1$c;", "e1", "", "now", "delayedTask", "", "b1", "Y0", "shutdown", "timeMillis", "Lkotlinx/coroutines/p;", "continuation", bi.aA, "block", "Lkotlinx/coroutines/n1;", "c1", "M0", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "dispatch", "V0", "a1", "Z0", t0.b.f22420d, "d", "()Z", "d1", "(Z)V", "isCompleted", "J0", "isEmpty", "G0", "()J", "nextTime", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/s1$d;", "_delayed", "Lkotlinx/atomicfu/AtomicBoolean;", "_isCompleted", "", "_queue", "<init>", "()V", bi.ay, "b", "c", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase\n+ 2 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n+ 3 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 4 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 5 EventLoop.kt\nkotlinx/coroutines/EventLoopKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,543:1\n60#2:544\n61#2,7:550\n28#3,4:545\n20#4:549\n56#5:557\n1#6:558\n*S KotlinDebug\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase\n*L\n269#1:544\n269#1:550,7\n269#1:545,4\n269#1:549\n280#1:557\n*E\n"})
/* loaded from: classes4.dex */
public abstract class s1 extends t1 implements c1 {

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    private static final AtomicReferenceFieldUpdater f20462d = AtomicReferenceFieldUpdater.newUpdater(s1.class, Object.class, "_queue");

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private static final AtomicReferenceFieldUpdater f20463e = AtomicReferenceFieldUpdater.newUpdater(s1.class, Object.class, "_delayed");

    /* renamed from: f, reason: collision with root package name */
    @p4.l
    private static final AtomicIntegerFieldUpdater f20464f = AtomicIntegerFieldUpdater.newUpdater(s1.class, "_isCompleted");

    @u3.w
    @p4.m
    private volatile Object _delayed;

    @u3.w
    private volatile int _isCompleted = 0;

    @u3.w
    @p4.m
    private volatile Object _queue;

    /* JADX INFO: Access modifiers changed from: private */
    @kotlin.i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/s1$a;", "Lkotlinx/coroutines/s1$c;", "Lkotlin/r2;", "run", "", "toString", "Lkotlinx/coroutines/p;", "c", "Lkotlinx/coroutines/p;", "cont", "", "nanoTime", "<init>", "(Lkotlinx/coroutines/s1;JLkotlinx/coroutines/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedResumeTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,543:1\n1#2:544\n*E\n"})
    /* loaded from: classes4.dex */
    public final class a extends c {

        /* renamed from: c, reason: collision with root package name */
        @p4.l
        private final p<kotlin.r2> f20465c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(long j5, @p4.l p<? super kotlin.r2> pVar) {
            super(j5);
            this.f20465c = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f20465c.z(s1.this, kotlin.r2.f19517a);
        }

        @Override // kotlinx.coroutines.s1.c
        @p4.l
        public String toString() {
            return super.toString() + this.f20465c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @kotlin.i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\n\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0018\u0010\n\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/s1$b;", "Lkotlinx/coroutines/s1$c;", "Lkotlin/r2;", "run", "", "toString", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "c", "Ljava/lang/Runnable;", "block", "", "nanoTime", "<init>", "(JLjava/lang/Runnable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class b extends c {

        /* renamed from: c, reason: collision with root package name */
        @p4.l
        private final Runnable f20467c;

        public b(long j5, @p4.l Runnable runnable) {
            super(j5);
            this.f20467c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f20467c.run();
        }

        @Override // kotlinx.coroutines.s1.c
        @p4.l
        public String toString() {
            return super.toString() + this.f20467c;
        }
    }

    @kotlin.i0(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u00052\u00060\u0006j\u0002`\u0007B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b+\u0010,J\u0011\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0000H\u0096\u0002J\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bJ\u001e\u0010\u0013\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0015\u001a\u00020\u0014J\b\u0010\u0017\u001a\u00020\u0016H\u0016R\u0016\u0010\u001a\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010#\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R0\u0010*\u001a\b\u0012\u0002\b\u0003\u0018\u00010$2\f\u0010%\u001a\b\u0012\u0002\b\u0003\u0018\u00010$8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lkotlinx/coroutines/s1$c;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lkotlinx/coroutines/n1;", "Lkotlinx/coroutines/internal/e1;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "other", "", bi.aJ, "", "now", "", "j", "Lkotlinx/coroutines/s1$d;", "delayed", "Lkotlinx/coroutines/s1;", "eventLoop", "i", "Lkotlin/r2;", "dispose", "", "toString", bi.ay, "J", "nanoTime", "_heap", "Ljava/lang/Object;", "b", "I", "getIndex", "()I", "setIndex", "(I)V", "index", "Lkotlinx/coroutines/internal/d1;", t0.b.f22420d, "f", "()Lkotlinx/coroutines/internal/d1;", "c", "(Lkotlinx/coroutines/internal/d1;)V", "heap", "<init>", "(J)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedTask\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n*L\n1#1,543:1\n28#2,4:544\n28#2,4:550\n28#2,4:562\n20#3:548\n20#3:554\n20#3:566\n72#4:549\n73#4,7:555\n*S KotlinDebug\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedTask\n*L\n437#1:544,4\n439#1:550,4\n479#1:562,4\n437#1:548\n439#1:554\n479#1:566\n439#1:549\n439#1:555,7\n*E\n"})
    /* loaded from: classes4.dex */
    public static abstract class c implements Runnable, Comparable<c>, n1, kotlinx.coroutines.internal.e1 {

        @p4.m
        private volatile Object _heap;

        /* renamed from: a, reason: collision with root package name */
        @u3.e
        public long f20468a;

        /* renamed from: b, reason: collision with root package name */
        private int f20469b = -1;

        public c(long j5) {
            this.f20468a = j5;
        }

        @Override // kotlinx.coroutines.internal.e1
        public void c(@p4.m kotlinx.coroutines.internal.d1<?> d1Var) {
            kotlinx.coroutines.internal.t0 t0Var;
            boolean z4;
            Object obj = this._heap;
            t0Var = v1.f20662a;
            if (obj != t0Var) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                this._heap = d1Var;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        @Override // kotlinx.coroutines.n1
        public final void dispose() {
            kotlinx.coroutines.internal.t0 t0Var;
            d dVar;
            kotlinx.coroutines.internal.t0 t0Var2;
            synchronized (this) {
                Object obj = this._heap;
                t0Var = v1.f20662a;
                if (obj == t0Var) {
                    return;
                }
                if (obj instanceof d) {
                    dVar = (d) obj;
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    dVar.k(this);
                }
                t0Var2 = v1.f20662a;
                this._heap = t0Var2;
                kotlin.r2 r2Var = kotlin.r2.f19517a;
            }
        }

        @Override // kotlinx.coroutines.internal.e1
        @p4.m
        public kotlinx.coroutines.internal.d1<?> f() {
            Object obj = this._heap;
            if (obj instanceof kotlinx.coroutines.internal.d1) {
                return (kotlinx.coroutines.internal.d1) obj;
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.e1
        public int getIndex() {
            return this.f20469b;
        }

        @Override // java.lang.Comparable
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public int compareTo(@p4.l c cVar) {
            long j5 = this.f20468a - cVar.f20468a;
            if (j5 > 0) {
                return 1;
            }
            return j5 < 0 ? -1 : 0;
        }

        public final int i(long j5, @p4.l d dVar, @p4.l s1 s1Var) {
            kotlinx.coroutines.internal.t0 t0Var;
            synchronized (this) {
                Object obj = this._heap;
                t0Var = v1.f20662a;
                if (obj == t0Var) {
                    return 2;
                }
                synchronized (dVar) {
                    c f5 = dVar.f();
                    if (s1Var.d()) {
                        return 1;
                    }
                    if (f5 == null) {
                        dVar.f20470c = j5;
                    } else {
                        long j6 = f5.f20468a;
                        if (j6 - j5 < 0) {
                            j5 = j6;
                        }
                        if (j5 - dVar.f20470c > 0) {
                            dVar.f20470c = j5;
                        }
                    }
                    long j7 = this.f20468a;
                    long j8 = dVar.f20470c;
                    if (j7 - j8 < 0) {
                        this.f20468a = j8;
                    }
                    dVar.a(this);
                    return 0;
                }
            }
        }

        public final boolean j(long j5) {
            return j5 - this.f20468a >= 0;
        }

        @Override // kotlinx.coroutines.internal.e1
        public void setIndex(int i5) {
            this.f20469b = i5;
        }

        @p4.l
        public String toString() {
            return "Delayed[nanos=" + this.f20468a + ']';
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/s1$d;", "Lkotlinx/coroutines/internal/d1;", "Lkotlinx/coroutines/s1$c;", "", "c", "J", "timeNow", "<init>", "(J)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class d extends kotlinx.coroutines.internal.d1<c> {

        /* renamed from: c, reason: collision with root package name */
        @u3.e
        public long f20470c;

        public d(long j5) {
            this.f20470c = j5;
        }
    }

    private final void T0() {
        kotlinx.coroutines.internal.t0 t0Var;
        kotlinx.coroutines.internal.t0 t0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20462d;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f20462d;
                t0Var = v1.f20669h;
                if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater2, this, null, t0Var)) {
                    return;
                }
            } else {
                if (obj instanceof kotlinx.coroutines.internal.b0) {
                    ((kotlinx.coroutines.internal.b0) obj).d();
                    return;
                }
                t0Var2 = v1.f20669h;
                if (obj == t0Var2) {
                    return;
                }
                kotlinx.coroutines.internal.b0 b0Var = new kotlinx.coroutines.internal.b0(8, true);
                kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                b0Var.a((Runnable) obj);
                if (androidx.concurrent.futures.a.a(f20462d, this, obj, b0Var)) {
                    return;
                }
            }
        }
    }

    private final Runnable U0() {
        kotlinx.coroutines.internal.t0 t0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20462d;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof kotlinx.coroutines.internal.b0) {
                kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                kotlinx.coroutines.internal.b0 b0Var = (kotlinx.coroutines.internal.b0) obj;
                Object n5 = b0Var.n();
                if (n5 != kotlinx.coroutines.internal.b0.f20327t) {
                    return (Runnable) n5;
                }
                androidx.concurrent.futures.a.a(f20462d, this, obj, b0Var.m());
            } else {
                t0Var = v1.f20669h;
                if (obj == t0Var) {
                    return null;
                }
                if (androidx.concurrent.futures.a.a(f20462d, this, obj, null)) {
                    kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            }
        }
    }

    private final boolean W0(Runnable runnable) {
        kotlinx.coroutines.internal.t0 t0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20462d;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (d()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.a.a(f20462d, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof kotlinx.coroutines.internal.b0) {
                kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                kotlinx.coroutines.internal.b0 b0Var = (kotlinx.coroutines.internal.b0) obj;
                int a5 = b0Var.a(runnable);
                if (a5 == 0) {
                    return true;
                }
                if (a5 != 1) {
                    if (a5 == 2) {
                        return false;
                    }
                } else {
                    androidx.concurrent.futures.a.a(f20462d, this, obj, b0Var.m());
                }
            } else {
                t0Var = v1.f20669h;
                if (obj == t0Var) {
                    return false;
                }
                kotlinx.coroutines.internal.b0 b0Var2 = new kotlinx.coroutines.internal.b0(8, true);
                kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                b0Var2.a((Runnable) obj);
                b0Var2.a(runnable);
                if (androidx.concurrent.futures.a.a(f20462d, this, obj, b0Var2)) {
                    return true;
                }
            }
        }
    }

    private final void X0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, v3.l<Object, kotlin.r2> lVar, Object obj) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final void Y0() {
        long nanoTime;
        c n5;
        kotlinx.coroutines.b b5 = kotlinx.coroutines.c.b();
        if (b5 != null) {
            nanoTime = b5.b();
        } else {
            nanoTime = System.nanoTime();
        }
        while (true) {
            d dVar = (d) f20463e.get(this);
            if (dVar != null && (n5 = dVar.n()) != null) {
                Q0(nanoTime, n5);
            } else {
                return;
            }
        }
    }

    private final int b1(long j5, c cVar) {
        if (d()) {
            return 1;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20463e;
        d dVar = (d) atomicReferenceFieldUpdater.get(this);
        if (dVar == null) {
            androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, null, new d(j5));
            Object obj = atomicReferenceFieldUpdater.get(this);
            kotlin.jvm.internal.l0.m(obj);
            dVar = (d) obj;
        }
        return cVar.i(j5, dVar, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d() {
        if (f20464f.get(this) != 0) {
            return true;
        }
        return false;
    }

    private final void d1(boolean z4) {
        f20464f.set(this, z4 ? 1 : 0);
    }

    private final boolean e1(c cVar) {
        d dVar = (d) f20463e.get(this);
        return (dVar != null ? dVar.i() : null) == cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.r1
    public long G0() {
        c i5;
        long nanoTime;
        long v4;
        kotlinx.coroutines.internal.t0 t0Var;
        if (super.G0() == 0) {
            return 0L;
        }
        Object obj = f20462d.get(this);
        if (obj != null) {
            if (obj instanceof kotlinx.coroutines.internal.b0) {
                if (!((kotlinx.coroutines.internal.b0) obj).h()) {
                    return 0L;
                }
            } else {
                t0Var = v1.f20669h;
                if (obj != t0Var) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            }
        }
        d dVar = (d) f20463e.get(this);
        if (dVar == null || (i5 = dVar.i()) == null) {
            return Long.MAX_VALUE;
        }
        long j5 = i5.f20468a;
        kotlinx.coroutines.b b5 = kotlinx.coroutines.c.b();
        if (b5 != null) {
            nanoTime = b5.b();
        } else {
            nanoTime = System.nanoTime();
        }
        v4 = kotlin.ranges.u.v(j5 - nanoTime, 0L);
        return v4;
    }

    @Override // kotlinx.coroutines.c1
    @p4.l
    public n1 I(long j5, @p4.l Runnable runnable, @p4.l kotlin.coroutines.g gVar) {
        return c1.a.b(this, j5, runnable, gVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.r1
    public boolean J0() {
        kotlinx.coroutines.internal.t0 t0Var;
        if (!L0()) {
            return false;
        }
        d dVar = (d) f20463e.get(this);
        if (dVar != null && !dVar.h()) {
            return false;
        }
        Object obj = f20462d.get(this);
        if (obj != null) {
            if (obj instanceof kotlinx.coroutines.internal.b0) {
                return ((kotlinx.coroutines.internal.b0) obj).h();
            }
            t0Var = v1.f20669h;
            if (obj != t0Var) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlinx.coroutines.r1
    public long M0() {
        long nanoTime;
        c cVar;
        boolean z4;
        if (N0()) {
            return 0L;
        }
        d dVar = (d) f20463e.get(this);
        if (dVar != null && !dVar.h()) {
            kotlinx.coroutines.b b5 = kotlinx.coroutines.c.b();
            if (b5 != null) {
                nanoTime = b5.b();
            } else {
                nanoTime = System.nanoTime();
            }
            do {
                synchronized (dVar) {
                    c f5 = dVar.f();
                    cVar = null;
                    if (f5 != null) {
                        c cVar2 = f5;
                        if (cVar2.j(nanoTime)) {
                            z4 = W0(cVar2);
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            cVar = dVar.l(0);
                        }
                    }
                }
            } while (cVar != null);
        }
        Runnable U0 = U0();
        if (U0 != null) {
            U0.run();
            return 0L;
        }
        return G0();
    }

    public void V0(@p4.l Runnable runnable) {
        if (W0(runnable)) {
            R0();
        } else {
            y0.f20685g.V0(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void Z0() {
        f20462d.set(this, null);
        f20463e.set(this, null);
    }

    public final void a1(long j5, @p4.l c cVar) {
        int b12 = b1(j5, cVar);
        if (b12 != 0) {
            if (b12 != 1) {
                if (b12 != 2) {
                    throw new IllegalStateException("unexpected result".toString());
                }
                return;
            } else {
                Q0(j5, cVar);
                return;
            }
        }
        if (e1(cVar)) {
            R0();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @p4.l
    public final n1 c1(long j5, @p4.l Runnable runnable) {
        long nanoTime;
        long d5 = v1.d(j5);
        if (d5 < kotlin.time.g.f19821c) {
            kotlinx.coroutines.b b5 = kotlinx.coroutines.c.b();
            if (b5 != null) {
                nanoTime = b5.b();
            } else {
                nanoTime = System.nanoTime();
            }
            b bVar = new b(d5 + nanoTime, runnable);
            a1(nanoTime, bVar);
            return bVar;
        }
        return a3.f19846a;
    }

    @Override // kotlinx.coroutines.n0
    public final void dispatch(@p4.l kotlin.coroutines.g gVar, @p4.l Runnable runnable) {
        V0(runnable);
    }

    @Override // kotlinx.coroutines.c1
    public void p(long j5, @p4.l p<? super kotlin.r2> pVar) {
        long nanoTime;
        long d5 = v1.d(j5);
        if (d5 < kotlin.time.g.f19821c) {
            kotlinx.coroutines.b b5 = kotlinx.coroutines.c.b();
            if (b5 != null) {
                nanoTime = b5.b();
            } else {
                nanoTime = System.nanoTime();
            }
            a aVar = new a(d5 + nanoTime, pVar);
            a1(nanoTime, aVar);
            s.a(pVar, aVar);
        }
    }

    @Override // kotlinx.coroutines.c1
    @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @p4.m
    public Object p0(long j5, @p4.l kotlin.coroutines.d<? super kotlin.r2> dVar) {
        return c1.a.a(this, j5, dVar);
    }

    @Override // kotlinx.coroutines.r1
    public void shutdown() {
        p3.f20437a.c();
        d1(true);
        T0();
        do {
        } while (M0() <= 0);
        Y0();
    }
}
