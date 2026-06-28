package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.bi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.d1;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.n1;

@kotlin.i0(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010 \n\u0002\b\u000b\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006:\u0001HB\u001f\u0012\u0006\u0010K\u001a\u00020\u0016\u0012\u0006\u0010L\u001a\u00020\u0016\u0012\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bm\u0010nJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\b\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0012\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J9\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00142\u0010\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J(\u0010$\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000eH\u0002J\b\u0010%\u001a\u00020\fH\u0002J\u0012\u0010'\u001a\u0004\u0018\u00010\u00112\u0006\u0010&\u001a\u00020\u0003H\u0002J\u0010\u0010(\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u0003H\u0002J\u0012\u0010*\u001a\u0004\u0018\u00010\u00112\u0006\u0010)\u001a\u00020\u000eH\u0002J\u001b\u0010+\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b+\u0010,J3\u0010/\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010-0\u00142\u0014\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010-0\u0014H\u0002¢\u0006\u0004\b/\u00100J!\u00104\u001a\u0002032\f\u00102\u001a\b\u0012\u0004\u0012\u00028\u000001H\u0096@ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b6\u0010\nJ\u001b\u00107\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b7\u0010\u001cJ\u000f\u00108\u001a\u00020\u000eH\u0000¢\u0006\u0004\b8\u00109J%\u0010;\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010-0\u00142\u0006\u0010:\u001a\u00020\u000eH\u0000¢\u0006\u0004\b;\u0010<J\b\u0010=\u001a\u00020\u0003H\u0014J\u001f\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00142\u0006\u0010>\u001a\u00020\u0016H\u0014¢\u0006\u0004\b?\u0010@J\b\u0010A\u001a\u00020\fH\u0016J&\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000G2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020\u00162\u0006\u0010F\u001a\u00020EH\u0016R\u0014\u0010K\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010L\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010JR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR \u0010Q\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010S\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010\u001bR\u0016\u0010U\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010\u001bR\u0016\u0010W\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010JR\u0016\u0010Y\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010JR\u0014\u0010[\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bZ\u00109R\u0014\u0010^\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0014\u0010_\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010]R\u0014\u0010a\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b`\u00109R\u0014\u0010c\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bb\u00109R\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u001a\u0010l\u001a\u00028\u00008DX\u0084\u0004¢\u0006\f\u0012\u0004\bj\u0010k\u001a\u0004\bh\u0010i\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006o"}, d2 = {"Lkotlinx/coroutines/flow/j0;", "T", "Lkotlinx/coroutines/flow/internal/b;", "Lkotlinx/coroutines/flow/l0;", "Lkotlinx/coroutines/flow/d0;", "Lkotlinx/coroutines/flow/c;", "Lkotlinx/coroutines/flow/internal/r;", t0.b.f22420d, "", "V", "(Ljava/lang/Object;)Z", "W", "Lkotlin/r2;", "H", "", "newHead", "E", "", "item", "K", "", "curBuffer", "", "curSize", "newSize", "U", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "J", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/j0$a;", "emitter", "B", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", "Z", "C", "slot", "Y", "X", "index", "Q", "A", "(Lkotlinx/coroutines/flow/l0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/coroutines/d;", "resumesIn", "L", "([Lkotlin/coroutines/d;)[Lkotlin/coroutines/d;", "Lkotlinx/coroutines/flow/j;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b", "emit", "b0", "()J", "oldIndex", "a0", "(J)[Lkotlin/coroutines/d;", "F", "size", "G", "(I)[Lkotlinx/coroutines/flow/l0;", "f", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "capacity", "Lkotlinx/coroutines/channels/i;", "onBufferOverflow", "Lkotlinx/coroutines/flow/i;", bi.ay, "e", "I", "replay", "bufferCapacity", socket.g.f22386a, "Lkotlinx/coroutines/channels/i;", bi.aJ, "[Ljava/lang/Object;", "buffer", "i", "replayIndex", "j", "minCollectorIndex", "k", "bufferSize", "l", "queueSize", "N", "head", "S", "()I", "replaySize", "totalSize", "M", "bufferEndIndex", "R", "queueEndIndex", "", "d", "()Ljava/util/List;", "replayCache", "O", "()Ljava/lang/Object;", "getLastReplayedLocked$annotations", "()V", "lastReplayedLocked", "<init>", "(IILkotlinx/coroutines/channels/i;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowImpl\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,731:1\n28#2,4:732\n28#2,4:738\n28#2,4:760\n28#2,4:767\n28#2,4:779\n28#2,4:793\n28#2,4:807\n20#3:736\n20#3:742\n20#3:764\n20#3:771\n20#3:783\n20#3:797\n20#3:811\n329#4:737\n1#5:743\n94#6,2:744\n96#6,2:747\n98#6:750\n94#6,2:772\n96#6,2:775\n98#6:778\n94#6,2:800\n96#6,2:803\n98#6:806\n13579#7:746\n13580#7:749\n13579#7:774\n13580#7:777\n13579#7:802\n13580#7:805\n314#8,9:751\n323#8,2:765\n314#8,9:784\n323#8,2:798\n*S KotlinDebug\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowImpl\n*L\n351#1:732,4\n391#1:738,4\n485#1:760,4\n506#1:767,4\n626#1:779,4\n661#1:793,4\n689#1:807,4\n351#1:736\n391#1:742\n485#1:764\n506#1:771\n626#1:783\n661#1:797\n689#1:811\n373#1:737\n453#1:744,2\n453#1:747,2\n453#1:750\n529#1:772,2\n529#1:775,2\n529#1:778\n676#1:800,2\n676#1:803,2\n676#1:806\n453#1:746\n453#1:749\n529#1:774\n529#1:777\n676#1:802\n676#1:805\n483#1:751,9\n483#1:765,2\n660#1:784,9\n660#1:798,2\n*E\n"})
/* loaded from: classes4.dex */
public class j0<T> extends kotlinx.coroutines.flow.internal.b<l0> implements d0<T>, kotlinx.coroutines.flow.c<T>, kotlinx.coroutines.flow.internal.r<T> {

    /* renamed from: e, reason: collision with root package name */
    private final int f20151e;

    /* renamed from: f, reason: collision with root package name */
    private final int f20152f;

    /* renamed from: g, reason: collision with root package name */
    @p4.l
    private final kotlinx.coroutines.channels.i f20153g;

    /* renamed from: h, reason: collision with root package name */
    @p4.m
    private Object[] f20154h;

    /* renamed from: i, reason: collision with root package name */
    private long f20155i;

    /* renamed from: j, reason: collision with root package name */
    private long f20156j;

    /* renamed from: k, reason: collision with root package name */
    private int f20157k;

    /* renamed from: l, reason: collision with root package name */
    private int f20158l;

    /* JADX INFO: Access modifiers changed from: private */
    @kotlin.i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B3\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/flow/j0$a;", "Lkotlinx/coroutines/n1;", "Lkotlin/r2;", "dispose", "Lkotlinx/coroutines/flow/j0;", bi.ay, "Lkotlinx/coroutines/flow/j0;", "flow", "", "b", "J", "index", "", "c", "Ljava/lang/Object;", t0.b.f22420d, "Lkotlin/coroutines/d;", "d", "Lkotlin/coroutines/d;", "cont", "<init>", "(Lkotlinx/coroutines/flow/j0;JLjava/lang/Object;Lkotlin/coroutines/d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class a implements n1 {

        /* renamed from: a, reason: collision with root package name */
        @p4.l
        @u3.e
        public final j0<?> f20159a;

        /* renamed from: b, reason: collision with root package name */
        @u3.e
        public long f20160b;

        /* renamed from: c, reason: collision with root package name */
        @p4.m
        @u3.e
        public final Object f20161c;

        /* renamed from: d, reason: collision with root package name */
        @p4.l
        @u3.e
        public final kotlin.coroutines.d<r2> f20162d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@p4.l j0<?> j0Var, long j5, @p4.m Object obj, @p4.l kotlin.coroutines.d<? super r2> dVar) {
            this.f20159a = j0Var;
            this.f20160b = j5;
            this.f20161c = obj;
            this.f20162d = dVar;
        }

        @Override // kotlinx.coroutines.n1
        public void dispose() {
            this.f20159a.B(this);
        }
    }

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20163a;

        static {
            int[] iArr = new int[kotlinx.coroutines.channels.i.values().length];
            try {
                iArr[kotlinx.coroutines.channels.i.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kotlinx.coroutines.channels.i.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlinx.coroutines.channels.i.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f20163a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {372, 379, 382}, m = "collect$suspendImpl", n = {"$this", "collector", "slot", "$this", "collector", "slot", "collectorJob", "$this", "collector", "slot", "collectorJob"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class c<T> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ j0<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(j0<T> j0Var, kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
            this.this$0 = j0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return j0.D(this.this$0, null, this);
        }
    }

    public j0(int i5, int i6, @p4.l kotlinx.coroutines.channels.i iVar) {
        this.f20151e = i5;
        this.f20152f = i6;
        this.f20153g = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object A(l0 l0Var, kotlin.coroutines.d<? super r2> dVar) {
        kotlin.coroutines.d e5;
        r2 r2Var;
        Object l5;
        Object l6;
        e5 = kotlin.coroutines.intrinsics.c.e(dVar);
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(e5, 1);
        qVar.B();
        synchronized (this) {
            if (X(l0Var) < 0) {
                l0Var.f20179b = qVar;
            } else {
                d1.a aVar = d1.Companion;
                qVar.resumeWith(d1.m6444constructorimpl(r2.f19517a));
            }
            r2Var = r2.f19517a;
        }
        Object E = qVar.E();
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (E == l5) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        l6 = kotlin.coroutines.intrinsics.d.l();
        if (E == l6) {
            return E;
        }
        return r2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(a aVar) {
        Object f5;
        synchronized (this) {
            if (aVar.f20160b < N()) {
                return;
            }
            Object[] objArr = this.f20154h;
            kotlin.jvm.internal.l0.m(objArr);
            f5 = k0.f(objArr, aVar.f20160b);
            if (f5 != aVar) {
                return;
            }
            k0.g(objArr, aVar.f20160b, k0.f20165a);
            C();
            r2 r2Var = r2.f19517a;
        }
    }

    private final void C() {
        Object f5;
        if (this.f20152f == 0 && this.f20158l <= 1) {
            return;
        }
        Object[] objArr = this.f20154h;
        kotlin.jvm.internal.l0.m(objArr);
        while (this.f20158l > 0) {
            f5 = k0.f(objArr, (N() + T()) - 1);
            if (f5 == k0.f20165a) {
                this.f20158l--;
                k0.g(objArr, N() + T(), null);
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(3:(6:(1:(1:11)(2:41|42))(1:43)|12|13|14|15|(3:16|(3:28|29|(2:31|32)(1:33))(4:18|(1:20)|21|(2:23|24)(1:26))|27))(4:44|45|46|47)|37|38)(5:53|54|55|(2:57|(1:59))|61)|48|49|15|(3:16|(0)(0)|27)))|64|6|(0)(0)|48|49|15|(3:16|(0)(0)|27)) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d2, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d3, code lost:
    
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ <T> java.lang.Object D(kotlinx.coroutines.flow.j0<T> r8, kotlinx.coroutines.flow.j<? super T> r9, kotlin.coroutines.d<?> r10) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.j0.D(kotlinx.coroutines.flow.j0, kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
    }

    private final void E(long j5) {
        kotlinx.coroutines.flow.internal.d[] g5;
        if (kotlinx.coroutines.flow.internal.b.e(this) != 0 && (g5 = kotlinx.coroutines.flow.internal.b.g(this)) != null) {
            for (kotlinx.coroutines.flow.internal.d dVar : g5) {
                if (dVar != null) {
                    l0 l0Var = (l0) dVar;
                    long j6 = l0Var.f20178a;
                    if (j6 >= 0 && j6 < j5) {
                        l0Var.f20178a = j5;
                    }
                }
            }
        }
        this.f20156j = j5;
    }

    private final void H() {
        Object[] objArr = this.f20154h;
        kotlin.jvm.internal.l0.m(objArr);
        k0.g(objArr, N(), null);
        this.f20157k--;
        long N = N() + 1;
        if (this.f20155i < N) {
            this.f20155i = N;
        }
        if (this.f20156j < N) {
            E(N);
        }
    }

    static /* synthetic */ <T> Object I(j0<T> j0Var, T t5, kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        if (j0Var.b(t5)) {
            return r2.f19517a;
        }
        Object J = j0Var.J(t5, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (J == l5) {
            return J;
        }
        return r2.f19517a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object J(T t5, kotlin.coroutines.d<? super r2> dVar) {
        kotlin.coroutines.d e5;
        kotlin.coroutines.d<r2>[] dVarArr;
        a aVar;
        Object l5;
        Object l6;
        e5 = kotlin.coroutines.intrinsics.c.e(dVar);
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(e5, 1);
        qVar.B();
        kotlin.coroutines.d<r2>[] dVarArr2 = kotlinx.coroutines.flow.internal.c.f20109a;
        synchronized (this) {
            if (V(t5)) {
                d1.a aVar2 = d1.Companion;
                qVar.resumeWith(d1.m6444constructorimpl(r2.f19517a));
                dVarArr = L(dVarArr2);
                aVar = null;
            } else {
                a aVar3 = new a(this, T() + N(), t5, qVar);
                K(aVar3);
                this.f20158l++;
                if (this.f20152f == 0) {
                    dVarArr2 = L(dVarArr2);
                }
                dVarArr = dVarArr2;
                aVar = aVar3;
            }
        }
        if (aVar != null) {
            kotlinx.coroutines.s.a(qVar, aVar);
        }
        for (kotlin.coroutines.d<r2> dVar2 : dVarArr) {
            if (dVar2 != null) {
                d1.a aVar4 = d1.Companion;
                dVar2.resumeWith(d1.m6444constructorimpl(r2.f19517a));
            }
        }
        Object E = qVar.E();
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (E == l5) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        l6 = kotlin.coroutines.intrinsics.d.l();
        if (E == l6) {
            return E;
        }
        return r2.f19517a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(Object obj) {
        int T = T();
        Object[] objArr = this.f20154h;
        if (objArr == null) {
            objArr = U(null, 0, 2);
        } else if (T >= objArr.length) {
            objArr = U(objArr, T, objArr.length * 2);
        }
        k0.g(objArr, N() + T, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    public final kotlin.coroutines.d<r2>[] L(kotlin.coroutines.d<r2>[] dVarArr) {
        kotlinx.coroutines.flow.internal.d[] g5;
        l0 l0Var;
        kotlin.coroutines.d<? super r2> dVar;
        int length = dVarArr.length;
        if (kotlinx.coroutines.flow.internal.b.e(this) != 0 && (g5 = kotlinx.coroutines.flow.internal.b.g(this)) != null) {
            int length2 = g5.length;
            int i5 = 0;
            dVarArr = dVarArr;
            while (i5 < length2) {
                kotlinx.coroutines.flow.internal.d dVar2 = g5[i5];
                if (dVar2 != null && (dVar = (l0Var = (l0) dVar2).f20179b) != null && X(l0Var) >= 0) {
                    int length3 = dVarArr.length;
                    dVarArr = dVarArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(dVarArr, Math.max(2, dVarArr.length * 2));
                        kotlin.jvm.internal.l0.o(copyOf, "copyOf(this, newSize)");
                        dVarArr = copyOf;
                    }
                    dVarArr[length] = dVar;
                    l0Var.f20179b = null;
                    length++;
                }
                i5++;
                dVarArr = dVarArr;
            }
        }
        return dVarArr;
    }

    private final long M() {
        return N() + this.f20157k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long N() {
        return Math.min(this.f20156j, this.f20155i);
    }

    protected static /* synthetic */ void P() {
    }

    private final Object Q(long j5) {
        Object f5;
        Object[] objArr = this.f20154h;
        kotlin.jvm.internal.l0.m(objArr);
        f5 = k0.f(objArr, j5);
        if (f5 instanceof a) {
            return ((a) f5).f20161c;
        }
        return f5;
    }

    private final long R() {
        return N() + this.f20157k + this.f20158l;
    }

    private final int S() {
        return (int) ((N() + this.f20157k) - this.f20155i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int T() {
        return this.f20157k + this.f20158l;
    }

    private final Object[] U(Object[] objArr, int i5, int i6) {
        boolean z4;
        Object f5;
        if (i6 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            Object[] objArr2 = new Object[i6];
            this.f20154h = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long N = N();
            for (int i7 = 0; i7 < i5; i7++) {
                long j5 = i7 + N;
                f5 = k0.f(objArr, j5);
                k0.g(objArr2, j5, f5);
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean V(T t5) {
        if (m() == 0) {
            return W(t5);
        }
        if (this.f20157k >= this.f20152f && this.f20156j <= this.f20155i) {
            int i5 = b.f20163a[this.f20153g.ordinal()];
            if (i5 != 1) {
                if (i5 == 2) {
                    return true;
                }
            } else {
                return false;
            }
        }
        K(t5);
        int i6 = this.f20157k + 1;
        this.f20157k = i6;
        if (i6 > this.f20152f) {
            H();
        }
        if (S() > this.f20151e) {
            Z(this.f20155i + 1, this.f20156j, M(), R());
        }
        return true;
    }

    private final boolean W(T t5) {
        if (this.f20151e == 0) {
            return true;
        }
        K(t5);
        int i5 = this.f20157k + 1;
        this.f20157k = i5;
        if (i5 > this.f20151e) {
            H();
        }
        this.f20156j = N() + this.f20157k;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long X(l0 l0Var) {
        long j5 = l0Var.f20178a;
        if (j5 < M()) {
            return j5;
        }
        if (this.f20152f > 0 || j5 > N() || this.f20158l == 0) {
            return -1L;
        }
        return j5;
    }

    private final Object Y(l0 l0Var) {
        Object obj;
        kotlin.coroutines.d<r2>[] dVarArr = kotlinx.coroutines.flow.internal.c.f20109a;
        synchronized (this) {
            long X = X(l0Var);
            if (X < 0) {
                obj = k0.f20165a;
            } else {
                long j5 = l0Var.f20178a;
                Object Q = Q(X);
                l0Var.f20178a = X + 1;
                dVarArr = a0(j5);
                obj = Q;
            }
        }
        for (kotlin.coroutines.d<r2> dVar : dVarArr) {
            if (dVar != null) {
                d1.a aVar = d1.Companion;
                dVar.resumeWith(d1.m6444constructorimpl(r2.f19517a));
            }
        }
        return obj;
    }

    private final void Z(long j5, long j6, long j7, long j8) {
        long min = Math.min(j6, j5);
        for (long N = N(); N < min; N++) {
            Object[] objArr = this.f20154h;
            kotlin.jvm.internal.l0.m(objArr);
            k0.g(objArr, N, null);
        }
        this.f20155i = j5;
        this.f20156j = j6;
        this.f20157k = (int) (j7 - min);
        this.f20158l = (int) (j8 - j7);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.b
    @p4.l
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public l0 i() {
        return new l0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.b
    @p4.l
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public l0[] j(int i5) {
        return new l0[i5];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final T O() {
        Object f5;
        Object[] objArr = this.f20154h;
        kotlin.jvm.internal.l0.m(objArr);
        f5 = k0.f(objArr, (this.f20155i + S()) - 1);
        return (T) f5;
    }

    @Override // kotlinx.coroutines.flow.internal.r
    @p4.l
    public i<T> a(@p4.l kotlin.coroutines.g gVar, int i5, @p4.l kotlinx.coroutines.channels.i iVar) {
        return k0.e(this, gVar, i5, iVar);
    }

    @p4.l
    public final kotlin.coroutines.d<r2>[] a0(long j5) {
        int i5;
        long j6;
        long j7;
        long j8;
        boolean z4;
        Object f5;
        Object f6;
        long j9;
        kotlinx.coroutines.flow.internal.d[] g5;
        if (j5 > this.f20156j) {
            return kotlinx.coroutines.flow.internal.c.f20109a;
        }
        long N = N();
        long j10 = this.f20157k + N;
        if (this.f20152f == 0 && this.f20158l > 0) {
            j10++;
        }
        if (kotlinx.coroutines.flow.internal.b.e(this) != 0 && (g5 = kotlinx.coroutines.flow.internal.b.g(this)) != null) {
            for (kotlinx.coroutines.flow.internal.d dVar : g5) {
                if (dVar != null) {
                    long j11 = ((l0) dVar).f20178a;
                    if (j11 >= 0 && j11 < j10) {
                        j10 = j11;
                    }
                }
            }
        }
        if (j10 <= this.f20156j) {
            return kotlinx.coroutines.flow.internal.c.f20109a;
        }
        long M = M();
        if (m() > 0) {
            i5 = Math.min(this.f20158l, this.f20152f - ((int) (M - j10)));
        } else {
            i5 = this.f20158l;
        }
        kotlin.coroutines.d<r2>[] dVarArr = kotlinx.coroutines.flow.internal.c.f20109a;
        long j12 = this.f20158l + M;
        if (i5 > 0) {
            dVarArr = new kotlin.coroutines.d[i5];
            Object[] objArr = this.f20154h;
            kotlin.jvm.internal.l0.m(objArr);
            long j13 = M;
            int i6 = 0;
            while (true) {
                if (M < j12) {
                    f6 = k0.f(objArr, M);
                    j6 = j10;
                    kotlinx.coroutines.internal.t0 t0Var = k0.f20165a;
                    if (f6 != t0Var) {
                        kotlin.jvm.internal.l0.n(f6, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                        a aVar = (a) f6;
                        int i7 = i6 + 1;
                        j7 = j12;
                        dVarArr[i6] = aVar.f20162d;
                        k0.g(objArr, M, t0Var);
                        k0.g(objArr, j13, aVar.f20161c);
                        j9 = 1;
                        j13++;
                        if (i7 >= i5) {
                            break;
                        }
                        i6 = i7;
                    } else {
                        j7 = j12;
                        j9 = 1;
                    }
                    M += j9;
                    j10 = j6;
                    j12 = j7;
                } else {
                    j6 = j10;
                    j7 = j12;
                    break;
                }
            }
            M = j13;
        } else {
            j6 = j10;
            j7 = j12;
        }
        int i8 = (int) (M - N);
        if (m() == 0) {
            j8 = M;
        } else {
            j8 = j6;
        }
        long max = Math.max(this.f20155i, M - Math.min(this.f20151e, i8));
        if (this.f20152f == 0 && max < j7) {
            Object[] objArr2 = this.f20154h;
            kotlin.jvm.internal.l0.m(objArr2);
            f5 = k0.f(objArr2, max);
            if (kotlin.jvm.internal.l0.g(f5, k0.f20165a)) {
                M++;
                max++;
            }
        }
        Z(max, j8, M, j7);
        C();
        if (dVarArr.length == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return L(dVarArr);
        }
        return dVarArr;
    }

    @Override // kotlinx.coroutines.flow.d0
    public boolean b(T t5) {
        int i5;
        boolean z4;
        kotlin.coroutines.d<r2>[] dVarArr = kotlinx.coroutines.flow.internal.c.f20109a;
        synchronized (this) {
            if (V(t5)) {
                dVarArr = L(dVarArr);
                z4 = true;
            } else {
                z4 = false;
            }
        }
        for (kotlin.coroutines.d<r2> dVar : dVarArr) {
            if (dVar != null) {
                d1.a aVar = d1.Companion;
                dVar.resumeWith(d1.m6444constructorimpl(r2.f19517a));
            }
        }
        return z4;
    }

    public final long b0() {
        long j5 = this.f20155i;
        if (j5 < this.f20156j) {
            this.f20156j = j5;
        }
        return j5;
    }

    @Override // kotlinx.coroutines.flow.i0, kotlinx.coroutines.flow.i
    @p4.m
    public Object collect(@p4.l j<? super T> jVar, @p4.l kotlin.coroutines.d<?> dVar) {
        return D(this, jVar, dVar);
    }

    @Override // kotlinx.coroutines.flow.i0
    @p4.l
    public List<T> d() {
        Object f5;
        List<T> E;
        synchronized (this) {
            int S = S();
            if (S == 0) {
                E = kotlin.collections.w.E();
                return E;
            }
            ArrayList arrayList = new ArrayList(S);
            Object[] objArr = this.f20154h;
            kotlin.jvm.internal.l0.m(objArr);
            for (int i5 = 0; i5 < S; i5++) {
                f5 = k0.f(objArr, this.f20155i + i5);
                arrayList.add(f5);
            }
            return arrayList;
        }
    }

    @Override // kotlinx.coroutines.flow.d0, kotlinx.coroutines.flow.j
    @p4.m
    public Object emit(T t5, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        return I(this, t5, dVar);
    }

    @Override // kotlinx.coroutines.flow.d0
    public void f() {
        synchronized (this) {
            Z(M(), this.f20156j, M(), R());
            r2 r2Var = r2.f19517a;
        }
    }
}
