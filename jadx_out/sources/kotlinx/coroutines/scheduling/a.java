package kotlinx.coroutines.scheduling;

import com.bytedance.android.live.base.api.push.ILivePush;
import com.umeng.analytics.pro.bi;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.ranges.u;
import kotlinx.coroutines.internal.o0;
import kotlinx.coroutines.internal.t0;
import kotlinx.coroutines.x0;
import u3.w;

@i0(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u00035$\u000fB+\u0012\u0006\u00107\u001a\u00020\n\u0012\u0006\u00108\u001a\u00020\n\u0012\b\b\u0002\u00109\u001a\u00020\f\u0012\b\b\u0002\u0010;\u001a\u000202¢\u0006\u0004\bQ\u0010RJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\b\u001a\b\u0018\u00010\u0007R\u00020\u0000H\u0002J\u0014\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0007R\u00020\u0000H\u0002J\u0011\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0082\bJ\u0011\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0082\bJ\t\u0010\u0010\u001a\u00020\nH\u0082\bJ\t\u0010\u0011\u001a\u00020\nH\u0082\bJ\t\u0010\u0012\u001a\u00020\fH\u0082\bJ\t\u0010\u0014\u001a\u00020\u0013H\u0082\bJ\t\u0010\u0015\u001a\u00020\u0005H\u0082\bJ\t\u0010\u0016\u001a\u00020\fH\u0082\bJ\u0018\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J\u0012\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u001b\u001a\u00020\u0005H\u0002J\b\u0010\u001c\u001a\u00020\nH\u0002J$\u0010\u001e\u001a\u0004\u0018\u00010\u0003*\b\u0018\u00010\u0007R\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0005H\u0002J\u000e\u0010\u001f\u001a\b\u0018\u00010\u0007R\u00020\u0000H\u0002J\"\u0010\"\u001a\u00020\u00132\n\u0010\t\u001a\u00060\u0007R\u00020\u00002\u0006\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\nJ\u0012\u0010#\u001a\u00020\u00052\n\u0010\t\u001a\u00060\u0007R\u00020\u0000J\u0011\u0010$\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0086\bJ\u0014\u0010(\u001a\u00020\u00132\n\u0010'\u001a\u00060%j\u0002`&H\u0016J\b\u0010)\u001a\u00020\u0013H\u0016J\u000e\u0010+\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\fJ&\u0010/\u001a\u00020\u00132\n\u0010,\u001a\u00060%j\u0002`&2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u0010\u001d\u001a\u00020\u0005J\u001a\u00100\u001a\u00020\u00032\n\u0010,\u001a\u00060%j\u0002`&2\u0006\u0010.\u001a\u00020-J\u0006\u00101\u001a\u00020\u0013J\b\u00103\u001a\u000202H\u0016J\u000e\u00104\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0003R\u0014\u00107\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u00106R\u0014\u00109\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0012R\u0014\u0010;\u001a\u0002028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010:R\u0014\u0010?\u001a\u00020<8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010A\u001a\u00020<8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u0010>R\u001e\u0010E\u001a\f\u0012\b\u0012\u00060\u0007R\u00020\u00000B8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0015\u0010G\u001a\u00020\n8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u0010FR\u0015\u0010I\u001a\u00020\n8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010FR\u0011\u0010J\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u000b\u0010M\u001a\u00020L8\u0002X\u0082\u0004R\u000b\u0010O\u001a\u00020N8\u0002X\u0082\u0004R\u000b\u0010P\u001a\u00020N8\u0002X\u0082\u0004¨\u0006S"}, d2 = {"Lkotlinx/coroutines/scheduling/a;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "Lkotlinx/coroutines/scheduling/k;", "task", "", "b", "Lkotlinx/coroutines/scheduling/a$c;", "a0", "worker", "", "P", "", "state", "m", "d", "M", "q", "J", "Lkotlin/r2;", bi.aA, "D0", "i0", "stateSnapshot", "skipUnpark", "t0", "E0", "G0", bi.aJ, "tailDispatch", "C0", "o", "oldIndex", "newIndex", "f0", "b0", "c", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "command", "execute", ILivePush.ClickType.CLOSE, m0.a.Z, "r0", "block", "Lkotlinx/coroutines/scheduling/l;", "taskContext", "y", "j", "A0", "", "toString", "p0", bi.ay, "I", "corePoolSize", "maxPoolSize", "idleWorkerKeepAliveNs", "Ljava/lang/String;", "schedulerName", "Lkotlinx/coroutines/scheduling/f;", "e", "Lkotlinx/coroutines/scheduling/f;", "globalCpuQueue", "f", "globalBlockingQueue", "Lkotlinx/coroutines/internal/o0;", socket.g.f22386a, "Lkotlinx/coroutines/internal/o0;", "workers", "()I", "createdWorkers", "H", "availableCpuPermits", "isTerminated", "()Z", "Lkotlinx/atomicfu/AtomicBoolean;", "_isTerminated", "Lkotlinx/atomicfu/AtomicLong;", "controlState", "parkedWorkersStack", "<init>", "(IIJLjava/lang/String;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nCoroutineScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n+ 2 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 5 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 6 Tasks.kt\nkotlinx/coroutines/scheduling/Task\n+ 7 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n*L\n1#1,1033:1\n285#1:1036\n283#1:1037\n283#1:1038\n285#1:1039\n280#1:1045\n281#1,5:1046\n291#1:1052\n283#1:1053\n284#1:1054\n283#1:1060\n284#1:1061\n280#1:1062\n288#1:1063\n283#1:1064\n283#1:1067\n284#1:1068\n285#1:1069\n90#2:1034\n90#2:1051\n1#3:1035\n28#4,4:1040\n28#4,4:1055\n20#5:1044\n20#5:1059\n87#6:1065\n610#7:1066\n*S KotlinDebug\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n*L\n281#1:1036\n288#1:1037\n289#1:1038\n298#1:1039\n347#1:1045\n375#1:1046,5\n398#1:1052\n445#1:1053\n446#1:1054\n482#1:1060\n483#1:1061\n489#1:1062\n498#1:1063\n498#1:1064\n576#1:1067\n577#1:1068\n578#1:1069\n119#1:1034\n395#1:1051\n347#1:1040,4\n478#1:1055,4\n347#1:1044\n478#1:1059\n515#1:1065\n522#1:1066\n*E\n"})
/* loaded from: classes4.dex */
public final class a implements Executor, Closeable {

    /* renamed from: h, reason: collision with root package name */
    @p4.l
    public static final C0612a f20476h = new C0612a(null);

    /* renamed from: i, reason: collision with root package name */
    @p4.l
    private static final AtomicLongFieldUpdater f20477i = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");

    /* renamed from: j, reason: collision with root package name */
    @p4.l
    private static final AtomicLongFieldUpdater f20478j = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");

    /* renamed from: k, reason: collision with root package name */
    @p4.l
    private static final AtomicIntegerFieldUpdater f20479k = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");

    /* renamed from: l, reason: collision with root package name */
    @p4.l
    @u3.e
    public static final t0 f20480l = new t0("NOT_IN_STACK");

    /* renamed from: m, reason: collision with root package name */
    private static final int f20481m = -1;

    /* renamed from: n, reason: collision with root package name */
    private static final int f20482n = 0;

    /* renamed from: o, reason: collision with root package name */
    private static final int f20483o = 1;

    /* renamed from: p, reason: collision with root package name */
    private static final int f20484p = 21;

    /* renamed from: q, reason: collision with root package name */
    private static final long f20485q = 2097151;

    /* renamed from: r, reason: collision with root package name */
    private static final long f20486r = 4398044413952L;

    /* renamed from: s, reason: collision with root package name */
    private static final int f20487s = 42;

    /* renamed from: t, reason: collision with root package name */
    private static final long f20488t = 9223367638808264704L;

    /* renamed from: u, reason: collision with root package name */
    public static final int f20489u = 1;

    /* renamed from: v, reason: collision with root package name */
    public static final int f20490v = 2097150;

    /* renamed from: w, reason: collision with root package name */
    private static final long f20491w = 2097151;

    /* renamed from: x, reason: collision with root package name */
    private static final long f20492x = -2097152;

    /* renamed from: y, reason: collision with root package name */
    private static final long f20493y = 2097152;

    @w
    private volatile int _isTerminated;

    /* renamed from: a, reason: collision with root package name */
    @u3.e
    public final int f20494a;

    /* renamed from: b, reason: collision with root package name */
    @u3.e
    public final int f20495b;

    /* renamed from: c, reason: collision with root package name */
    @u3.e
    public final long f20496c;

    @w
    private volatile long controlState;

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    @u3.e
    public final String f20497d;

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    @u3.e
    public final f f20498e;

    /* renamed from: f, reason: collision with root package name */
    @p4.l
    @u3.e
    public final f f20499f;

    /* renamed from: g, reason: collision with root package name */
    @p4.l
    @u3.e
    public final o0<c> f20500g;

    @w
    private volatile long parkedWorkersStack;

    @i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/scheduling/a$a;", "", "", "BLOCKING_MASK", "J", "", "BLOCKING_SHIFT", "I", "CLAIMED", "CPU_PERMITS_MASK", "CPU_PERMITS_SHIFT", "CREATED_MASK", "MAX_SUPPORTED_POOL_SIZE", "MIN_SUPPORTED_POOL_SIZE", "Lkotlinx/coroutines/internal/t0;", "NOT_IN_STACK", "Lkotlinx/coroutines/internal/t0;", "PARKED", "PARKED_INDEX_MASK", "PARKED_VERSION_INC", "PARKED_VERSION_MASK", "TERMINATED", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    /* renamed from: kotlinx.coroutines.scheduling.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0612a {
        private C0612a() {
        }

        public /* synthetic */ C0612a(kotlin.jvm.internal.w wVar) {
            this();
        }
    }

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20501a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f20501a = iArr;
        }
    }

    @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/scheduling/a$d;", "", "<init>", "(Ljava/lang/String;I)V", "CPU_ACQUIRED", "BLOCKING", "PARKING", "DORMANT", "TERMINATED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public a(int i5, int i6, long j5, @p4.l String str) {
        this.f20494a = i5;
        this.f20495b = i6;
        this.f20496c = j5;
        this.f20497d = str;
        if (!(i5 >= 1)) {
            throw new IllegalArgumentException(("Core pool size " + i5 + " should be at least 1").toString());
        }
        if (!(i6 >= i5)) {
            throw new IllegalArgumentException(("Max pool size " + i6 + " should be greater than or equals to core pool size " + i5).toString());
        }
        if (!(i6 <= 2097150)) {
            throw new IllegalArgumentException(("Max pool size " + i6 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j5 > 0) {
            this.f20498e = new f();
            this.f20499f = new f();
            this.f20500g = new o0<>((i5 + 1) * 2);
            this.controlState = i5 << 42;
            this._isTerminated = 0;
            return;
        }
        throw new IllegalArgumentException(("Idle worker keep alive time " + j5 + " must be positive").toString());
    }

    public static /* synthetic */ void A(a aVar, Runnable runnable, l lVar, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            lVar = o.f20543i;
        }
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        aVar.y(runnable, lVar, z4);
    }

    private final k C0(c cVar, k kVar, boolean z4) {
        if (cVar == null) {
            return kVar;
        }
        if (cVar.f20505c == d.TERMINATED) {
            return kVar;
        }
        if (kVar.f20532b.i0() == 0 && cVar.f20505c == d.BLOCKING) {
            return kVar;
        }
        cVar.f20509g = true;
        return cVar.f20503a.a(kVar, z4);
    }

    private final boolean D0() {
        long j5;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f20478j;
        do {
            j5 = atomicLongFieldUpdater.get(this);
            if (((int) ((f20488t & j5) >> 42)) == 0) {
                return false;
            }
        } while (!f20478j.compareAndSet(this, j5, j5 - 4398046511104L));
        return true;
    }

    private final boolean E0(long j5) {
        int u4;
        u4 = u.u(((int) (2097151 & j5)) - ((int) ((j5 & f20486r) >> 21)), 0);
        if (u4 < this.f20494a) {
            int h5 = h();
            if (h5 == 1 && this.f20494a > 1) {
                h();
            }
            if (h5 > 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean F0(a aVar, long j5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            j5 = f20478j.get(aVar);
        }
        return aVar.E0(j5);
    }

    private final boolean G0() {
        c a02;
        do {
            a02 = a0();
            if (a02 == null) {
                return false;
            }
        } while (!c.m().compareAndSet(a02, -1, 0));
        LockSupport.unpark(a02);
        return true;
    }

    private final int H() {
        return (int) ((f20478j.get(this) & f20488t) >> 42);
    }

    private final int I() {
        return (int) (f20478j.get(this) & 2097151);
    }

    private final long J() {
        return f20478j.addAndGet(this, 2097152L);
    }

    private final int M() {
        return (int) (f20478j.incrementAndGet(this) & 2097151);
    }

    private final void O(AtomicLongFieldUpdater atomicLongFieldUpdater, v3.l<? super Long, r2> lVar, Object obj) {
        while (true) {
            lVar.invoke(Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    private final int P(c cVar) {
        Object j5 = cVar.j();
        while (j5 != f20480l) {
            if (j5 == null) {
                return 0;
            }
            c cVar2 = (c) j5;
            int i5 = cVar2.i();
            if (i5 != 0) {
                return i5;
            }
            j5 = cVar2.j();
        }
        return -1;
    }

    private final c a0() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f20477i;
        while (true) {
            long j5 = atomicLongFieldUpdater.get(this);
            c b5 = this.f20500g.b((int) (2097151 & j5));
            if (b5 == null) {
                return null;
            }
            long j6 = (2097152 + j5) & f20492x;
            int P = P(b5);
            if (P >= 0 && f20477i.compareAndSet(this, j5, P | j6)) {
                b5.w(f20480l);
                return b5;
            }
        }
    }

    private final boolean b(k kVar) {
        boolean z4 = true;
        if (kVar.f20532b.i0() != 1) {
            z4 = false;
        }
        if (z4) {
            return this.f20499f.a(kVar);
        }
        return this.f20498e.a(kVar);
    }

    private final int d(long j5) {
        return (int) ((j5 & f20486r) >> 21);
    }

    private final int h() {
        int u4;
        boolean z4;
        synchronized (this.f20500g) {
            if (isTerminated()) {
                return -1;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = f20478j;
            long j5 = atomicLongFieldUpdater.get(this);
            int i5 = (int) (j5 & 2097151);
            boolean z5 = false;
            u4 = u.u(i5 - ((int) ((j5 & f20486r) >> 21)), 0);
            if (u4 >= this.f20494a) {
                return 0;
            }
            if (i5 >= this.f20495b) {
                return 0;
            }
            int i6 = ((int) (f20478j.get(this) & 2097151)) + 1;
            if (i6 > 0 && this.f20500g.b(i6) == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                c cVar = new c(this, i6);
                this.f20500g.c(i6, cVar);
                if (i6 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    z5 = true;
                }
                if (z5) {
                    int i7 = u4 + 1;
                    cVar.start();
                    return i7;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    private final long i0() {
        return f20478j.addAndGet(this, 4398046511104L);
    }

    private final int m(long j5) {
        return (int) (j5 & 2097151);
    }

    private final c o() {
        c cVar;
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof c) {
            cVar = (c) currentThread;
        } else {
            cVar = null;
        }
        if (cVar == null || !l0.g(a.this, this)) {
            return null;
        }
        return cVar;
    }

    private final void p() {
        f20478j.addAndGet(this, f20492x);
    }

    private final int q() {
        return (int) (f20478j.getAndDecrement(this) & 2097151);
    }

    private final void t0(long j5, boolean z4) {
        if (z4 || G0() || E0(j5)) {
            return;
        }
        G0();
    }

    public final void A0() {
        if (G0() || F0(this, 0L, 1, null)) {
            return;
        }
        G0();
    }

    public final boolean b0(@p4.l c cVar) {
        long j5;
        long j6;
        int i5;
        if (cVar.j() != f20480l) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f20477i;
        do {
            j5 = atomicLongFieldUpdater.get(this);
            j6 = (2097152 + j5) & f20492x;
            i5 = cVar.i();
            cVar.w(this.f20500g.b((int) (2097151 & j5)));
        } while (!f20477i.compareAndSet(this, j5, j6 | i5));
        return true;
    }

    public final int c(long j5) {
        return (int) ((j5 & f20488t) >> 42);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        r0(10000L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@p4.l Runnable runnable) {
        A(this, runnable, null, false, 6, null);
    }

    public final void f0(@p4.l c cVar, int i5, int i6) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f20477i;
        while (true) {
            long j5 = atomicLongFieldUpdater.get(this);
            int i7 = (int) (2097151 & j5);
            long j6 = (2097152 + j5) & f20492x;
            if (i7 == i5) {
                if (i6 == 0) {
                    i7 = P(cVar);
                } else {
                    i7 = i6;
                }
            }
            if (i7 >= 0 && f20477i.compareAndSet(this, j5, j6 | i7)) {
                return;
            }
        }
    }

    public final boolean isTerminated() {
        if (f20479k.get(this) != 0) {
            return true;
        }
        return false;
    }

    @p4.l
    public final k j(@p4.l Runnable runnable, @p4.l l lVar) {
        long a5 = o.f20540f.a();
        if (runnable instanceof k) {
            k kVar = (k) runnable;
            kVar.f20531a = a5;
            kVar.f20532b = lVar;
            return kVar;
        }
        return new n(runnable, a5, lVar);
    }

    public final void p0(@p4.l k kVar) {
        try {
            kVar.run();
        } catch (Throwable th) {
            try {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                kotlinx.coroutines.b b5 = kotlinx.coroutines.c.b();
                if (b5 == null) {
                }
            } finally {
                kotlinx.coroutines.b b6 = kotlinx.coroutines.c.b();
                if (b6 != null) {
                    b6.f();
                }
            }
        }
    }

    public final void r0(long j5) {
        int i5;
        k h5;
        if (!f20479k.compareAndSet(this, 0, 1)) {
            return;
        }
        c o5 = o();
        synchronized (this.f20500g) {
            i5 = (int) (f20478j.get(this) & 2097151);
        }
        if (1 <= i5) {
            int i6 = 1;
            while (true) {
                c b5 = this.f20500g.b(i6);
                l0.m(b5);
                c cVar = b5;
                if (cVar != o5) {
                    while (cVar.isAlive()) {
                        LockSupport.unpark(cVar);
                        cVar.join(j5);
                    }
                    cVar.f20503a.g(this.f20499f);
                }
                if (i6 == i5) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        this.f20499f.b();
        this.f20498e.b();
        while (true) {
            if (o5 != null) {
                h5 = o5.h(true);
                if (h5 != null) {
                    continue;
                    p0(h5);
                }
            }
            h5 = this.f20498e.h();
            if (h5 == null && (h5 = this.f20499f.h()) == null) {
                break;
            }
            p0(h5);
        }
        if (o5 != null) {
            o5.z(d.TERMINATED);
        }
        f20477i.set(this, 0L);
        f20478j.set(this, 0L);
    }

    @p4.l
    public String toString() {
        ArrayList arrayList = new ArrayList();
        int a5 = this.f20500g.a();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 1; i10 < a5; i10++) {
            c b5 = this.f20500g.b(i10);
            if (b5 != null) {
                int f5 = b5.f20503a.f();
                int i11 = b.f20501a[b5.f20505c.ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                if (i11 == 5) {
                                    i9++;
                                }
                            } else {
                                i8++;
                                if (f5 > 0) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(f5);
                                    sb.append('d');
                                    arrayList.add(sb.toString());
                                }
                            }
                        } else {
                            i5++;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(f5);
                            sb2.append('c');
                            arrayList.add(sb2.toString());
                        }
                    } else {
                        i6++;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(f5);
                        sb3.append('b');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    i7++;
                }
            }
        }
        long j5 = f20478j.get(this);
        return this.f20497d + '@' + x0.b(this) + "[Pool Size {core = " + this.f20494a + ", max = " + this.f20495b + "}, Worker States {CPU = " + i5 + ", blocking = " + i6 + ", parked = " + i7 + ", dormant = " + i8 + ", terminated = " + i9 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f20498e.c() + ", global blocking queue size = " + this.f20499f.c() + ", Control State {created workers= " + ((int) (2097151 & j5)) + ", blocking tasks = " + ((int) ((f20486r & j5) >> 21)) + ", CPUs acquired = " + (this.f20494a - ((int) ((f20488t & j5) >> 42))) + "}]";
    }

    public final void y(@p4.l Runnable runnable, @p4.l l lVar, boolean z4) {
        boolean z5;
        long j5;
        kotlinx.coroutines.b b5 = kotlinx.coroutines.c.b();
        if (b5 != null) {
            b5.e();
        }
        k j6 = j(runnable, lVar);
        boolean z6 = false;
        if (j6.f20532b.i0() == 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            j5 = f20478j.addAndGet(this, 2097152L);
        } else {
            j5 = 0;
        }
        c o5 = o();
        k C0 = C0(o5, j6, z4);
        if (C0 != null && !b(C0)) {
            throw new RejectedExecutionException(this.f20497d + " was terminated");
        }
        if (z4 && o5 != null) {
            z6 = true;
        }
        if (z5) {
            t0(j5, z6);
        } else {
            if (z6) {
                return;
            }
            A0();
        }
    }

    @i0(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0004\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bH\u0010IB\u0011\b\u0016\u0012\u0006\u0010&\u001a\u00020\u000b¢\u0006\u0004\bH\u0010JJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0002J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000bH\u0002J\n\u0010\u0013\u001a\u0004\u0018\u00010\bH\u0002J\n\u0010\u0014\u001a\u0004\u0018\u00010\bH\u0002J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0015\u001a\u00020\u0002H\u0002J\n\u0010\u0017\u001a\u0004\u0018\u00010\bH\u0002J\u0016\u0010\u001a\u001a\u0004\u0018\u00010\b2\n\u0010\u0019\u001a\u00060\u000bj\u0002`\u0018H\u0002J\u000e\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bJ\b\u0010\u001e\u001a\u00020\u0004H\u0016J\u0006\u0010 \u001a\u00020\u001fJ\u0006\u0010!\u001a\u00020\u0002J\u000e\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000bJ\u0010\u0010%\u001a\u0004\u0018\u00010\b2\u0006\u0010$\u001a\u00020\u0002R*\u0010'\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0014\u00100\u001a\u00020-8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001c\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00102R\u0016\u00105\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\r\u00104R\u0016\u00107\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u00106R$\u00109\u001a\u0004\u0018\u0001088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00106R\u0016\u0010@\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010(R\u0016\u0010$\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010AR\u0012\u0010E\u001a\u00020B8Æ\u0002¢\u0006\u0006\u001a\u0004\bC\u0010DR\b\u0010G\u001a\u00020F8\u0006¨\u0006K"}, d2 = {"Lkotlinx/coroutines/scheduling/a$c;", "Ljava/lang/Thread;", "", "x", "Lkotlin/r2;", bi.aK, "y", "o", "Lkotlinx/coroutines/scheduling/k;", "task", "d", "", "taskMode", "c", "b", "r", "B", "mode", "n", "f", socket.g.f22386a, "scanLocalQueue", "e", bi.aE, "Lkotlinx/coroutines/scheduling/StealingMode;", "stealingMode", "A", "Lkotlinx/coroutines/scheduling/a$d;", "newState", bi.aG, "run", "", bi.aL, bi.aA, "upperBound", "q", "mayHaveLocalTasks", bi.aJ, "index", "indexInArray", "I", "i", "()I", "v", "(I)V", "Lkotlinx/coroutines/scheduling/q;", bi.ay, "Lkotlinx/coroutines/scheduling/q;", "localQueue", "Lkotlin/jvm/internal/k1$h;", "Lkotlin/jvm/internal/k1$h;", "stolenTask", "Lkotlinx/coroutines/scheduling/a$d;", "state", "J", "terminationDeadline", "", "nextParkedWorker", "Ljava/lang/Object;", "j", "()Ljava/lang/Object;", "w", "(Ljava/lang/Object;)V", "minDelayUntilStealableTaskNs", "rngState", "Z", "Lkotlinx/coroutines/scheduling/a;", "k", "()Lkotlinx/coroutines/scheduling/a;", "scheduler", "Lkotlinx/atomicfu/AtomicInt;", "workerCtl", "<init>", "(Lkotlinx/coroutines/scheduling/a;)V", "(Lkotlinx/coroutines/scheduling/a;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nCoroutineScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n+ 2 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Tasks.kt\nkotlinx/coroutines/scheduling/Task\n+ 5 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 6 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,1033:1\n298#2:1034\n285#2:1035\n299#2,4:1036\n304#2:1040\n294#2,2:1041\n294#2,2:1045\n280#2:1052\n289#2:1053\n283#2:1054\n280#2:1055\n1#3:1043\n87#4:1044\n28#5,4:1047\n20#6:1051\n*S KotlinDebug\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n*L\n665#1:1034\n665#1:1035\n665#1:1036,4\n679#1:1040\n753#1:1041,2\n807#1:1045,2\n855#1:1052\n881#1:1053\n881#1:1054\n963#1:1055\n790#1:1044\n851#1:1047,4\n851#1:1051\n*E\n"})
    /* loaded from: classes4.dex */
    public final class c extends Thread {

        /* renamed from: i, reason: collision with root package name */
        @p4.l
        private static final AtomicIntegerFieldUpdater f20502i = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");

        /* renamed from: a, reason: collision with root package name */
        @p4.l
        @u3.e
        public final q f20503a;

        /* renamed from: b, reason: collision with root package name */
        @p4.l
        private final k1.h<k> f20504b;

        /* renamed from: c, reason: collision with root package name */
        @p4.l
        @u3.e
        public d f20505c;

        /* renamed from: d, reason: collision with root package name */
        private long f20506d;

        /* renamed from: e, reason: collision with root package name */
        private long f20507e;

        /* renamed from: f, reason: collision with root package name */
        private int f20508f;

        /* renamed from: g, reason: collision with root package name */
        @u3.e
        public boolean f20509g;
        private volatile int indexInArray;

        @p4.m
        private volatile Object nextParkedWorker;

        @w
        private volatile int workerCtl;

        private c() {
            setDaemon(true);
            this.f20503a = new q();
            this.f20504b = new k1.h<>();
            this.f20505c = d.DORMANT;
            this.nextParkedWorker = a.f20480l;
            this.f20508f = kotlin.random.f.Default.nextInt();
        }

        private final k A(int i5) {
            int i6 = (int) (a.f20478j.get(a.this) & 2097151);
            if (i6 < 2) {
                return null;
            }
            int q5 = q(i6);
            a aVar = a.this;
            long j5 = Long.MAX_VALUE;
            for (int i7 = 0; i7 < i6; i7++) {
                q5++;
                if (q5 > i6) {
                    q5 = 1;
                }
                c b5 = aVar.f20500g.b(q5);
                if (b5 != null && b5 != this) {
                    long p5 = b5.f20503a.p(i5, this.f20504b);
                    if (p5 == -1) {
                        k1.h<k> hVar = this.f20504b;
                        k kVar = hVar.element;
                        hVar.element = null;
                        return kVar;
                    }
                    if (p5 > 0) {
                        j5 = Math.min(j5, p5);
                    }
                }
            }
            if (j5 == Long.MAX_VALUE) {
                j5 = 0;
            }
            this.f20507e = j5;
            return null;
        }

        private final void B() {
            a aVar = a.this;
            synchronized (aVar.f20500g) {
                if (aVar.isTerminated()) {
                    return;
                }
                if (((int) (a.f20478j.get(aVar) & 2097151)) <= aVar.f20494a) {
                    return;
                }
                if (!f20502i.compareAndSet(this, -1, 1)) {
                    return;
                }
                int i5 = this.indexInArray;
                v(0);
                aVar.f0(this, i5, 0);
                int andDecrement = (int) (a.f20478j.getAndDecrement(aVar) & 2097151);
                if (andDecrement != i5) {
                    c b5 = aVar.f20500g.b(andDecrement);
                    l0.m(b5);
                    c cVar = b5;
                    aVar.f20500g.c(i5, cVar);
                    cVar.v(i5);
                    aVar.f0(cVar, andDecrement, i5);
                }
                aVar.f20500g.c(andDecrement, null);
                r2 r2Var = r2.f19517a;
                this.f20505c = d.TERMINATED;
            }
        }

        private final void b(int i5) {
            if (i5 == 0) {
                return;
            }
            a.f20478j.addAndGet(a.this, a.f20492x);
            if (this.f20505c != d.TERMINATED) {
                this.f20505c = d.DORMANT;
            }
        }

        private final void c(int i5) {
            if (i5 != 0 && z(d.BLOCKING)) {
                a.this.A0();
            }
        }

        private final void d(k kVar) {
            int i02 = kVar.f20532b.i0();
            n(i02);
            c(i02);
            a.this.p0(kVar);
            b(i02);
        }

        private final k e(boolean z4) {
            boolean z5;
            k s5;
            k s6;
            if (z4) {
                if (q(a.this.f20494a * 2) == 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5 && (s6 = s()) != null) {
                    return s6;
                }
                k h5 = this.f20503a.h();
                if (h5 != null) {
                    return h5;
                }
                if (!z5 && (s5 = s()) != null) {
                    return s5;
                }
            } else {
                k s7 = s();
                if (s7 != null) {
                    return s7;
                }
            }
            return A(3);
        }

        private final k f() {
            k i5 = this.f20503a.i();
            if (i5 == null) {
                k h5 = a.this.f20499f.h();
                if (h5 == null) {
                    return A(1);
                }
                return h5;
            }
            return i5;
        }

        private final k g() {
            k k5 = this.f20503a.k();
            if (k5 == null) {
                k h5 = a.this.f20499f.h();
                if (h5 == null) {
                    return A(2);
                }
                return h5;
            }
            return k5;
        }

        @p4.l
        public static final AtomicIntegerFieldUpdater m() {
            return f20502i;
        }

        private final void n(int i5) {
            this.f20506d = 0L;
            if (this.f20505c == d.PARKING) {
                this.f20505c = d.BLOCKING;
            }
        }

        private final boolean o() {
            return this.nextParkedWorker != a.f20480l;
        }

        private final void r() {
            if (this.f20506d == 0) {
                this.f20506d = System.nanoTime() + a.this.f20496c;
            }
            LockSupport.parkNanos(a.this.f20496c);
            if (System.nanoTime() - this.f20506d >= 0) {
                this.f20506d = 0L;
                B();
            }
        }

        private final k s() {
            if (q(2) == 0) {
                k h5 = a.this.f20498e.h();
                if (h5 != null) {
                    return h5;
                }
                return a.this.f20499f.h();
            }
            k h6 = a.this.f20499f.h();
            if (h6 != null) {
                return h6;
            }
            return a.this.f20498e.h();
        }

        private final void u() {
            loop0: while (true) {
                boolean z4 = false;
                while (!a.this.isTerminated() && this.f20505c != d.TERMINATED) {
                    k h5 = h(this.f20509g);
                    if (h5 != null) {
                        this.f20507e = 0L;
                        d(h5);
                    } else {
                        this.f20509g = false;
                        if (this.f20507e != 0) {
                            if (!z4) {
                                z4 = true;
                            } else {
                                z(d.PARKING);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f20507e);
                                this.f20507e = 0L;
                            }
                        } else {
                            y();
                        }
                    }
                }
            }
            z(d.TERMINATED);
        }

        private final boolean x() {
            boolean z4;
            if (this.f20505c == d.CPU_ACQUIRED) {
                return true;
            }
            a aVar = a.this;
            AtomicLongFieldUpdater atomicLongFieldUpdater = a.f20478j;
            while (true) {
                long j5 = atomicLongFieldUpdater.get(aVar);
                if (((int) ((a.f20488t & j5) >> 42)) == 0) {
                    z4 = false;
                    break;
                }
                if (a.f20478j.compareAndSet(aVar, j5, j5 - 4398046511104L)) {
                    z4 = true;
                    break;
                }
            }
            if (!z4) {
                return false;
            }
            this.f20505c = d.CPU_ACQUIRED;
            return true;
        }

        private final void y() {
            if (!o()) {
                a.this.b0(this);
                return;
            }
            f20502i.set(this, -1);
            while (o() && f20502i.get(this) == -1 && !a.this.isTerminated() && this.f20505c != d.TERMINATED) {
                z(d.PARKING);
                Thread.interrupted();
                r();
            }
        }

        @p4.m
        public final k h(boolean z4) {
            if (x()) {
                return e(z4);
            }
            return f();
        }

        public final int i() {
            return this.indexInArray;
        }

        @p4.m
        public final Object j() {
            return this.nextParkedWorker;
        }

        @p4.l
        public final a k() {
            return a.this;
        }

        public final int l() {
            return this.workerCtl;
        }

        public final boolean p() {
            return this.f20505c == d.BLOCKING;
        }

        public final int q(int i5) {
            int i6 = this.f20508f;
            int i7 = i6 ^ (i6 << 13);
            int i8 = i7 ^ (i7 >> 17);
            int i9 = i8 ^ (i8 << 5);
            this.f20508f = i9;
            int i10 = i5 - 1;
            if ((i10 & i5) == 0) {
                return i9 & i10;
            }
            return (i9 & Integer.MAX_VALUE) % i5;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            u();
        }

        public final long t() {
            boolean z4;
            k f5;
            if (this.f20505c == d.CPU_ACQUIRED) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                f5 = g();
            } else {
                f5 = f();
            }
            if (f5 == null) {
                long j5 = this.f20507e;
                if (j5 == 0) {
                    return -1L;
                }
                return j5;
            }
            a.this.p0(f5);
            if (!z4) {
                a.f20478j.addAndGet(a.this, a.f20492x);
            }
            return 0L;
        }

        public final void v(int i5) {
            String valueOf;
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.f20497d);
            sb.append("-worker-");
            if (i5 == 0) {
                valueOf = "TERMINATED";
            } else {
                valueOf = String.valueOf(i5);
            }
            sb.append(valueOf);
            setName(sb.toString());
            this.indexInArray = i5;
        }

        public final void w(@p4.m Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean z(@p4.l d dVar) {
            boolean z4;
            d dVar2 = this.f20505c;
            if (dVar2 == d.CPU_ACQUIRED) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                a.f20478j.addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f20505c = dVar;
            }
            return z4;
        }

        public c(a aVar, int i5) {
            this();
            v(i5);
        }
    }

    public /* synthetic */ a(int i5, int i6, long j5, String str, int i7, kotlin.jvm.internal.w wVar) {
        this(i5, i6, (i7 & 4) != 0 ? o.f20539e : j5, (i7 & 8) != 0 ? o.f20535a : str);
    }
}
