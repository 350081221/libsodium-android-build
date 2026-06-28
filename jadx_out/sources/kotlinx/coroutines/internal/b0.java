package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.bi;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u0007*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002\u0013\u0010B\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0011¢\u0006\u0004\b.\u0010/J3\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00062\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0002J\b\u0010\r\u001a\u00020\fH\u0002J \u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u00062\u0006\u0010\u000e\u001a\u00020\fH\u0002J \u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u00062\u0006\u0010\u000e\u001a\u00020\fH\u0002J\u0006\u0010\u0012\u001a\u00020\u0011J\u0015\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J&\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u001a\"\u0004\b\u0001\u0010\u00172\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018J\u0006\u0010\u001c\u001a\u00020\u0011R\u0014\u0010\u001e\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR\u0014\u0010 \u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001fR\u0014\u0010!\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u0011\u0010$\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010'\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b%\u0010&R%\u0010)\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00060(8\u0002X\u0082\u0004R\u000b\u0010+\u001a\u00020*8\u0002X\u0082\u0004R\u0013\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010,8\u0002X\u0082\u0004¨\u00060"}, d2 = {"Lkotlinx/coroutines/internal/b0;", "", "E", "", "index", "element", "Lkotlinx/coroutines/internal/Core;", "e", "(ILjava/lang/Object;)Lkotlinx/coroutines/internal/b0;", "oldHead", "newHead", "o", "", "l", "state", "c", "b", "", "d", bi.ay, "(Ljava/lang/Object;)I", "n", "m", "R", "Lkotlin/Function1;", "transform", "", "k", socket.g.f22386a, "I", "capacity", "Z", "singleConsumer", "mask", bi.aJ, "()Z", "isEmpty", "f", "()I", "size", "Lkotlinx/atomicfu/AtomicRef;", "_next", "Lkotlinx/atomicfu/AtomicLong;", "_state", "Lkotlinx/atomicfu/AtomicArray;", "array", "<init>", "(IZ)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLockFreeTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore\n+ 2 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,308:1\n299#2,3:309\n299#2,3:312\n299#2,3:315\n299#2,3:318\n299#2,3:321\n299#2,3:325\n299#2,3:328\n1#3:324\n*S KotlinDebug\n*F\n+ 1 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore\n*L\n91#1:309,3\n92#1:312,3\n107#1:315,3\n167#1:318,3\n200#1:321,3\n231#1:325,3\n247#1:328,3\n*E\n"})
/* loaded from: classes4.dex */
public final class b0<E> {

    /* renamed from: h, reason: collision with root package name */
    public static final int f20315h = 8;

    /* renamed from: i, reason: collision with root package name */
    public static final int f20316i = 30;

    /* renamed from: j, reason: collision with root package name */
    public static final int f20317j = 1073741823;

    /* renamed from: k, reason: collision with root package name */
    public static final int f20318k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final long f20319l = 1073741823;

    /* renamed from: m, reason: collision with root package name */
    public static final int f20320m = 30;

    /* renamed from: n, reason: collision with root package name */
    public static final long f20321n = 1152921503533105152L;

    /* renamed from: o, reason: collision with root package name */
    public static final int f20322o = 60;

    /* renamed from: p, reason: collision with root package name */
    public static final long f20323p = 1152921504606846976L;

    /* renamed from: q, reason: collision with root package name */
    public static final int f20324q = 61;

    /* renamed from: r, reason: collision with root package name */
    public static final long f20325r = 2305843009213693952L;

    /* renamed from: s, reason: collision with root package name */
    public static final int f20326s = 1024;

    /* renamed from: u, reason: collision with root package name */
    public static final int f20328u = 0;

    /* renamed from: v, reason: collision with root package name */
    public static final int f20329v = 1;

    /* renamed from: w, reason: collision with root package name */
    public static final int f20330w = 2;

    @u3.w
    @p4.m
    private volatile Object _next;

    @u3.w
    private volatile long _state;

    /* renamed from: a, reason: collision with root package name */
    private final int f20331a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f20332b;

    /* renamed from: c, reason: collision with root package name */
    private final int f20333c;

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    private final AtomicReferenceArray f20334d;

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    public static final a f20312e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @p4.l
    private static final AtomicReferenceFieldUpdater f20313f = AtomicReferenceFieldUpdater.newUpdater(b0.class, Object.class, "_next");

    /* renamed from: g, reason: collision with root package name */
    @p4.l
    private static final AtomicLongFieldUpdater f20314g = AtomicLongFieldUpdater.newUpdater(b0.class, "_state");

    /* renamed from: t, reason: collision with root package name */
    @p4.l
    @u3.e
    public static final t0 f20327t = new t0("REMOVE_FROZEN");

    @kotlin.i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010)J\u0015\u0010\u0004\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0004J\u0012\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0012\u0010\t\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005JR\u0010\u0011\u001a\u00028\u0001\"\u0004\b\u0001\u0010\n*\u00020\u000226\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00028\u00010\u000bH\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012J\n\u0010\u0013\u001a\u00020\u0005*\u00020\u0002R\u0014\u0010\u0014\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015R\u0014\u0010\u001e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0015R\u0014\u0010 \u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0015R\u0014\u0010!\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0015R\u0014\u0010\"\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0015R\u0014\u0010$\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u001aR\u0014\u0010'\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0015¨\u0006*"}, d2 = {"Lkotlinx/coroutines/internal/b0$a;", "", "", "other", "e", "", "newHead", "b", "newTail", "c", "T", "Lkotlin/Function2;", "Lkotlin/v0;", "name", "head", "tail", "block", "d", "(JLv3/p;)Ljava/lang/Object;", bi.ay, "ADD_CLOSED", "I", "ADD_FROZEN", "ADD_SUCCESS", "CAPACITY_BITS", "CLOSED_MASK", "J", "CLOSED_SHIFT", "FROZEN_MASK", "FROZEN_SHIFT", "HEAD_MASK", "HEAD_SHIFT", "INITIAL_CAPACITY", "MAX_CAPACITY_MASK", "MIN_ADD_SPIN_CAPACITY", "Lkotlinx/coroutines/internal/t0;", "REMOVE_FROZEN", "Lkotlinx/coroutines/internal/t0;", "TAIL_MASK", "TAIL_SHIFT", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.w wVar) {
            this();
        }

        public final int a(long j5) {
            return (j5 & b0.f20325r) != 0 ? 2 : 1;
        }

        public final long b(long j5, int i5) {
            return e(j5, b0.f20319l) | (i5 << 0);
        }

        public final long c(long j5, int i5) {
            return e(j5, b0.f20321n) | (i5 << 30);
        }

        public final <T> T d(long j5, @p4.l v3.p<? super Integer, ? super Integer, ? extends T> pVar) {
            return pVar.invoke(Integer.valueOf((int) ((b0.f20319l & j5) >> 0)), Integer.valueOf((int) ((j5 & b0.f20321n) >> 30)));
        }

        public final long e(long j5, long j6) {
            return j5 & (~j6);
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/internal/b0$b;", "", "", bi.ay, "I", "index", "<init>", "(I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @u3.e
        public final int f20335a;

        public b(int i5) {
            this.f20335a = i5;
        }
    }

    public b0(int i5, boolean z4) {
        boolean z5;
        this.f20331a = i5;
        this.f20332b = z4;
        int i6 = i5 - 1;
        this.f20333c = i6;
        this.f20334d = new AtomicReferenceArray(i5);
        if (i6 <= 1073741823) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            if ((i5 & i6) == 0) {
                return;
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final b0<E> b(long j5) {
        b0<E> b0Var = new b0<>(this.f20331a * 2, this.f20332b);
        int i5 = (int) ((f20319l & j5) >> 0);
        int i6 = (int) ((f20321n & j5) >> 30);
        while (true) {
            int i7 = this.f20333c;
            if ((i5 & i7) != (i6 & i7)) {
                Object obj = this.f20334d.get(i7 & i5);
                if (obj == null) {
                    obj = new b(i5);
                }
                b0Var.f20334d.set(b0Var.f20333c & i5, obj);
                i5++;
            } else {
                f20314g.set(b0Var, f20312e.e(j5, f20323p));
                return b0Var;
            }
        }
    }

    private final b0<E> c(long j5) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20313f;
        while (true) {
            b0<E> b0Var = (b0) atomicReferenceFieldUpdater.get(this);
            if (b0Var != null) {
                return b0Var;
            }
            androidx.concurrent.futures.a.a(f20313f, this, null, b(j5));
        }
    }

    private final b0<E> e(int i5, E e5) {
        Object obj = this.f20334d.get(this.f20333c & i5);
        if ((obj instanceof b) && ((b) obj).f20335a == i5) {
            this.f20334d.set(i5 & this.f20333c, e5);
            return this;
        }
        return null;
    }

    private final void i(AtomicLongFieldUpdater atomicLongFieldUpdater, v3.l<? super Long, r2> lVar, Object obj) {
        while (true) {
            lVar.invoke(Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    private final void j(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, v3.l<Object, r2> lVar, Object obj) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final long l() {
        long j5;
        long j6;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f20314g;
        do {
            j5 = atomicLongFieldUpdater.get(this);
            if ((j5 & f20323p) != 0) {
                return j5;
            }
            j6 = j5 | f20323p;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j5, j6));
        return j6;
    }

    private final b0<E> o(int i5, int i6) {
        long j5;
        int i7;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f20314g;
        do {
            j5 = atomicLongFieldUpdater.get(this);
            i7 = (int) ((f20319l & j5) >> 0);
            if ((f20323p & j5) != 0) {
                return m();
            }
        } while (!f20314g.compareAndSet(this, j5, f20312e.b(j5, i6)));
        this.f20334d.set(this.f20333c & i7, null);
        return null;
    }

    private final void p(AtomicLongFieldUpdater atomicLongFieldUpdater, v3.l<? super Long, Long> lVar, Object obj) {
        long j5;
        do {
            j5 = atomicLongFieldUpdater.get(obj);
        } while (!atomicLongFieldUpdater.compareAndSet(obj, j5, lVar.invoke(Long.valueOf(j5)).longValue()));
    }

    private final long q(AtomicLongFieldUpdater atomicLongFieldUpdater, v3.l<? super Long, Long> lVar, Object obj) {
        long j5;
        Long invoke;
        do {
            j5 = atomicLongFieldUpdater.get(obj);
            invoke = lVar.invoke(Long.valueOf(j5));
        } while (!atomicLongFieldUpdater.compareAndSet(obj, j5, invoke.longValue()));
        return invoke.longValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0050, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(@p4.l E r14) {
        /*
            r13 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.internal.b0.f20314g
        L2:
            long r3 = r0.get(r13)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L16
            kotlinx.coroutines.internal.b0$a r14 = kotlinx.coroutines.internal.b0.f20312e
            int r14 = r14.a(r3)
            return r14
        L16:
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r3
            r9 = 0
            long r1 = r1 >> r9
            int r1 = (int) r1
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r2 = 30
            long r5 = r5 >> r2
            int r10 = (int) r5
            int r11 = r13.f20333c
            int r2 = r10 + 2
            r2 = r2 & r11
            r5 = r1 & r11
            r6 = 1
            if (r2 != r5) goto L32
            return r6
        L32:
            boolean r2 = r13.f20332b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r2 != 0) goto L51
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r13.f20334d
            r12 = r10 & r11
            java.lang.Object r2 = r2.get(r12)
            if (r2 == 0) goto L51
            int r2 = r13.f20331a
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L50
            int r10 = r10 - r1
            r1 = r10 & r5
            int r2 = r2 >> 1
            if (r1 <= r2) goto L2
        L50:
            return r6
        L51:
            int r1 = r10 + 1
            r1 = r1 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.internal.b0.f20314g
            kotlinx.coroutines.internal.b0$a r5 = kotlinx.coroutines.internal.b0.f20312e
            long r5 = r5.c(r3, r1)
            r1 = r2
            r2 = r13
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L2
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r13.f20334d
            r1 = r10 & r11
            r0.set(r1, r14)
            r0 = r13
        L6c:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.internal.b0.f20314g
            long r1 = r1.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L83
            kotlinx.coroutines.internal.b0 r0 = r0.m()
            kotlinx.coroutines.internal.b0 r0 = r0.e(r10, r14)
            if (r0 != 0) goto L6c
        L83:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.b0.a(java.lang.Object):int");
    }

    public final boolean d() {
        long j5;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f20314g;
        do {
            j5 = atomicLongFieldUpdater.get(this);
            if ((j5 & f20325r) != 0) {
                return true;
            }
            if ((f20323p & j5) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j5, j5 | f20325r));
        return true;
    }

    public final int f() {
        long j5 = f20314g.get(this);
        return (((int) ((j5 & f20321n) >> 30)) - ((int) ((f20319l & j5) >> 0))) & f20317j;
    }

    public final boolean g() {
        if ((f20314g.get(this) & f20325r) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        long j5 = f20314g.get(this);
        return ((int) ((f20319l & j5) >> 0)) == ((int) ((j5 & f20321n) >> 30));
    }

    @p4.l
    public final <R> List<R> k(@p4.l v3.l<? super E, ? extends R> lVar) {
        ArrayList arrayList = new ArrayList(this.f20331a);
        long j5 = f20314g.get(this);
        int i5 = (int) ((f20319l & j5) >> 0);
        int i6 = (int) ((j5 & f20321n) >> 30);
        while (true) {
            int i7 = this.f20333c;
            if ((i5 & i7) != (i6 & i7)) {
                a1.a aVar = (Object) this.f20334d.get(i7 & i5);
                if (aVar != null && !(aVar instanceof b)) {
                    arrayList.add(lVar.invoke(aVar));
                }
                i5++;
            } else {
                return arrayList;
            }
        }
    }

    @p4.l
    public final b0<E> m() {
        return c(l());
    }

    @p4.m
    public final Object n() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f20314g;
        while (true) {
            long j5 = atomicLongFieldUpdater.get(this);
            if ((f20323p & j5) != 0) {
                return f20327t;
            }
            int i5 = (int) ((f20319l & j5) >> 0);
            int i6 = (int) ((f20321n & j5) >> 30);
            int i7 = this.f20333c;
            if ((i6 & i7) == (i5 & i7)) {
                return null;
            }
            Object obj = this.f20334d.get(i7 & i5);
            if (obj == null) {
                if (this.f20332b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i8 = (i5 + 1) & f20317j;
                if (f20314g.compareAndSet(this, j5, f20312e.b(j5, i8))) {
                    this.f20334d.set(this.f20333c & i5, null);
                    return obj;
                }
                if (this.f20332b) {
                    b0<E> b0Var = this;
                    do {
                        b0Var = b0Var.o(i5, i8);
                    } while (b0Var != null);
                    return obj;
                }
            }
        }
    }
}
