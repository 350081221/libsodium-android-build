package kotlinx.coroutines.channels;

import com.umeng.analytics.pro.bi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.e1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import kotlinx.coroutines.u0;

@kotlin.i0(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0002<=B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b:\u0010;J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016J\u001b\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\t\u001a\u00028\u0000H\u0016ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0012\u001a\u00020\u00062\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\u0011H\u0014J\u0012\u0010\u0001\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\u0019\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0019\u001a\u00020\u0018H\u0016R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010#\u001a\u00060 j\u0002`!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\"R\"\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010(R<\u0010.\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110*j\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0011`+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00101\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0017\u00106\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b4\u00105\u001a\u0004\b2\u00103R\u0019\u00109\u001a\u0004\u0018\u00018\u00008F¢\u0006\f\u0012\u0004\b8\u00105\u001a\u0004\b7\u00103\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006>"}, d2 = {"Lkotlinx/coroutines/channels/e;", "E", "Lkotlinx/coroutines/channels/j;", "Lkotlinx/coroutines/channels/d;", "Lkotlinx/coroutines/channels/g0;", bi.aE, "Lkotlin/r2;", "O1", "n", "element", "F", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/p;", bi.aA, "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/m;", "select", "", "f1", "", "cause", "", "P", "(Ljava/lang/Throwable;)Z", "", "toString", "", "m", "I", "J1", "()I", "capacity", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "", "o", "Ljava/util/List;", "subscribers", "Ljava/lang/Object;", "lastConflatedElement", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "q", "Ljava/util/HashMap;", "onSendInternalResult", "G", "()Z", "isClosedForSend", "K1", "()Ljava/lang/Object;", "getValue$annotations", "()V", t0.b.f22420d, "M1", "getValueOrNull$annotations", "valueOrNull", "<init>", "(I)V", bi.ay, "b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nBroadcastChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl\n+ 2 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,414:1\n15#2:415\n15#2:416\n15#2:420\n15#2:423\n15#2:429\n15#2:430\n15#2:436\n15#2:439\n15#2:440\n15#2:441\n766#3:417\n857#3,2:418\n1855#3,2:421\n1747#3,3:424\n1855#3,2:427\n1855#3,2:431\n766#3:433\n857#3,2:434\n1855#3,2:437\n*S KotlinDebug\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl\n*L\n166#1:415\n188#1:416\n213#1:420\n237#1:423\n279#1:429\n331#1:430\n343#1:436\n355#1:439\n382#1:440\n394#1:441\n189#1:417\n189#1:418,2\n226#1:421,2\n242#1:424,3\n251#1:427,2\n333#1:431,2\n338#1:433\n338#1:434,2\n346#1:437,2\n*E\n"})
/* loaded from: classes4.dex */
public final class e<E> extends j<E> implements kotlinx.coroutines.channels.d<E> {

    /* renamed from: m, reason: collision with root package name */
    private final int f19870m;

    /* renamed from: n, reason: collision with root package name */
    @p4.l
    private final ReentrantLock f19871n;

    /* renamed from: o, reason: collision with root package name */
    @p4.l
    private List<? extends j<E>> f19872o;

    /* renamed from: p, reason: collision with root package name */
    @p4.m
    private Object f19873p;

    /* renamed from: q, reason: collision with root package name */
    @p4.l
    private final HashMap<kotlinx.coroutines.selects.m<?>, Object> f19874q;

    @kotlin.i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/channels/e$a;", "Lkotlinx/coroutines/channels/j;", "", "cause", "", "G1", "<init>", "(Lkotlinx/coroutines/channels/e;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nBroadcastChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl$SubscriberBuffered\n+ 2 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n*L\n1#1,414:1\n15#2:415\n*S KotlinDebug\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl$SubscriberBuffered\n*L\n362#1:415\n*E\n"})
    /* loaded from: classes4.dex */
    private final class a extends j<E> {
        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            super(e.this.J1(), null, 2, 0 == true ? 1 : 0);
        }

        @Override // kotlinx.coroutines.channels.j
        /* renamed from: G1, reason: merged with bridge method [inline-methods] */
        public boolean P(@p4.m Throwable th) {
            ReentrantLock reentrantLock = ((e) e.this).f19871n;
            e<E> eVar = e.this;
            reentrantLock.lock();
            try {
                eVar.O1(this);
                return super.P(th);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/channels/e$b;", "Lkotlinx/coroutines/channels/z;", "", "cause", "", "L1", "<init>", "(Lkotlinx/coroutines/channels/e;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    private final class b extends z<E> {
        public b() {
            super(1, i.DROP_OLDEST, null, 4, null);
        }

        @Override // kotlinx.coroutines.channels.j
        /* renamed from: L1, reason: merged with bridge method [inline-methods] */
        public boolean P(@p4.m Throwable th) {
            e.this.O1(this);
            return super.P(th);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2", f = "BroadcastChannel.kt", i = {}, l = {291}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"E", "Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nBroadcastChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl$registerSelectForSend$2\n+ 2 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,414:1\n15#2:415\n1#3:416\n*S KotlinDebug\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl$registerSelectForSend$2\n*L\n304#1:415\n*E\n"})
    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ Object $element;
        final /* synthetic */ kotlinx.coroutines.selects.m<?> $select;
        int label;
        final /* synthetic */ e<E> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(e<E> eVar, Object obj, kotlinx.coroutines.selects.m<?> mVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.this$0 = eVar;
            this.$element = obj;
            this.$select = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new c(this.this$0, this.$element, this.$select, dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            Object z4;
            l5 = kotlin.coroutines.intrinsics.d.l();
            int i5 = this.label;
            boolean z5 = true;
            try {
                if (i5 != 0) {
                    if (i5 == 1) {
                        e1.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    e1.n(obj);
                    e<E> eVar = this.this$0;
                    Object obj2 = this.$element;
                    this.label = 1;
                    if (eVar.F(obj2, this) == l5) {
                        return l5;
                    }
                }
            } catch (Throwable th) {
                if (this.this$0.G() && ((th instanceof x) || this.this$0.m0() == th)) {
                    z5 = false;
                } else {
                    throw th;
                }
            }
            ReentrantLock reentrantLock = ((e) this.this$0).f19871n;
            e<E> eVar2 = this.this$0;
            kotlinx.coroutines.selects.m<?> mVar = this.$select;
            reentrantLock.lock();
            try {
                HashMap hashMap = ((e) eVar2).f19874q;
                if (z5) {
                    z4 = r2.f19517a;
                } else {
                    z4 = k.z();
                }
                hashMap.put(mVar, z4);
                l0.n(mVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
                r2 r2Var = r2.f19517a;
                if (((kotlinx.coroutines.selects.l) mVar).I(eVar2, r2Var) != kotlinx.coroutines.selects.r.REREGISTER) {
                    ((e) eVar2).f19874q.remove(mVar);
                }
                return r2Var;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.BroadcastChannelImpl", f = "BroadcastChannel.kt", i = {0, 0}, l = {230}, m = "send", n = {"this", "element"}, s = {"L$0", "L$1"})
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ e<E> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(e<E> eVar, kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
            this.this$0 = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.F(null, this);
        }
    }

    public e(int i5) {
        super(0, null);
        List<? extends j<E>> E;
        this.f19870m = i5;
        if (i5 >= 1 || i5 == -1) {
            this.f19871n = new ReentrantLock();
            E = kotlin.collections.w.E();
            this.f19872o = E;
            this.f19873p = f.b();
            this.f19874q = new HashMap<>();
            return;
        }
        throw new IllegalArgumentException(("BroadcastChannel capacity must be positive or Channel.CONFLATED, but " + i5 + " was specified").toString());
    }

    public static /* synthetic */ void L1() {
    }

    public static /* synthetic */ void N1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void O1(g0<? extends E> g0Var) {
        boolean z4;
        ReentrantLock reentrantLock = this.f19871n;
        reentrantLock.lock();
        try {
            List<? extends j<E>> list = this.f19872o;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((j) obj) != g0Var) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    arrayList.add(obj);
                }
            }
            this.f19872o = arrayList;
            r2 r2Var = r2.f19517a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.j, kotlinx.coroutines.channels.h0
    public boolean E(@p4.m Throwable th) {
        ReentrantLock reentrantLock = this.f19871n;
        reentrantLock.lock();
        try {
            Iterator<T> it = this.f19872o.iterator();
            while (it.hasNext()) {
                ((j) it.next()).E(th);
            }
            List<? extends j<E>> list = this.f19872o;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((j) obj).o0()) {
                    arrayList.add(obj);
                }
            }
            this.f19872o = arrayList;
            return super.E(th);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007a -> B:10:0x007d). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.channels.j, kotlinx.coroutines.channels.h0
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object F(E r7, @p4.l kotlin.coroutines.d<? super kotlin.r2> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.e.d
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.e$d r0 = (kotlinx.coroutines.channels.e.d) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.e$d r0 = new kotlinx.coroutines.channels.e$d
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r7 = r0.L$2
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r2 = r0.L$1
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.e) r4
            kotlin.e1.n(r8)
            goto L7d
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            kotlin.e1.n(r8)
            java.util.concurrent.locks.ReentrantLock r8 = r6.f19871n
            r8.lock()
            boolean r2 = r6.G()     // Catch: java.lang.Throwable -> L9b
            if (r2 != 0) goto L96
            int r2 = r6.f19870m     // Catch: java.lang.Throwable -> L9b
            r4 = -1
            if (r2 != r4) goto L50
            r6.f19873p = r7     // Catch: java.lang.Throwable -> L9b
        L50:
            java.util.List<? extends kotlinx.coroutines.channels.j<E>> r2 = r6.f19872o     // Catch: java.lang.Throwable -> L9b
            r8.unlock()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r8 = r2.iterator()
            r4 = r6
            r5 = r8
            r8 = r7
            r7 = r5
        L5f:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L93
            java.lang.Object r2 = r7.next()
            kotlinx.coroutines.channels.j r2 = (kotlinx.coroutines.channels.j) r2
            r0.L$0 = r4
            r0.L$1 = r8
            r0.L$2 = r7
            r0.label = r3
            java.lang.Object r2 = r2.l1(r8, r0)
            if (r2 != r1) goto L7a
            return r1
        L7a:
            r5 = r2
            r2 = r8
            r8 = r5
        L7d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L91
            boolean r8 = r4.G()
            if (r8 != 0) goto L8c
            goto L91
        L8c:
            java.lang.Throwable r7 = r4.m0()
            throw r7
        L91:
            r8 = r2
            goto L5f
        L93:
            kotlin.r2 r7 = kotlin.r2.f19517a
            return r7
        L96:
            java.lang.Throwable r7 = r6.m0()     // Catch: java.lang.Throwable -> L9b
            throw r7     // Catch: java.lang.Throwable -> L9b
        L9b:
            r7 = move-exception
            r8.unlock()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.e.F(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.channels.j, kotlinx.coroutines.channels.h0
    public boolean G() {
        ReentrantLock reentrantLock = this.f19871n;
        reentrantLock.lock();
        try {
            return super.G();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int J1() {
        return this.f19870m;
    }

    public final E K1() {
        ReentrantLock reentrantLock = this.f19871n;
        reentrantLock.lock();
        try {
            if (G()) {
                Throwable e02 = e0();
                if (e02 == null) {
                    throw new IllegalStateException("This broadcast channel is closed");
                }
                throw e02;
            }
            if (this.f19873p != f.b()) {
                return (E) this.f19873p;
            }
            throw new IllegalStateException("No value".toString());
        } finally {
            reentrantLock.unlock();
        }
    }

    @p4.m
    public final E M1() {
        ReentrantLock reentrantLock = this.f19871n;
        reentrantLock.lock();
        try {
            E e5 = null;
            if (!f() && this.f19873p != f.b()) {
                e5 = (E) this.f19873p;
            }
            return e5;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.j
    public boolean P(@p4.m Throwable th) {
        ReentrantLock reentrantLock = this.f19871n;
        reentrantLock.lock();
        try {
            Iterator<T> it = this.f19872o.iterator();
            while (it.hasNext()) {
                ((j) it.next()).P(th);
            }
            this.f19873p = f.b();
            return super.P(th);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.j
    protected void f1(@p4.l kotlinx.coroutines.selects.m<?> mVar, @p4.m Object obj) {
        ReentrantLock reentrantLock = this.f19871n;
        reentrantLock.lock();
        try {
            Object remove = this.f19874q.remove(mVar);
            if (remove != null) {
                mVar.e(remove);
                return;
            }
            r2 r2Var = r2.f19517a;
            reentrantLock.unlock();
            kotlinx.coroutines.i.e(t0.a(mVar.getContext()), null, u0.UNDISPATCHED, new c(this, obj, mVar, null), 1, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.d
    @p4.l
    public g0<E> n() {
        j aVar;
        List<? extends j<E>> B4;
        ReentrantLock reentrantLock = this.f19871n;
        reentrantLock.lock();
        try {
            if (this.f19870m == -1) {
                aVar = new b();
            } else {
                aVar = new a();
            }
            if (G() && this.f19873p == f.b()) {
                aVar.E(e0());
                return aVar;
            }
            if (this.f19873p != f.b()) {
                aVar.p(K1());
            }
            B4 = kotlin.collections.e0.B4(this.f19872o, aVar);
            this.f19872o = B4;
            return aVar;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.j, kotlinx.coroutines.channels.h0
    @p4.l
    public Object p(E e5) {
        ReentrantLock reentrantLock = this.f19871n;
        reentrantLock.lock();
        try {
            if (G()) {
                return super.p(e5);
            }
            List<? extends j<E>> list = this.f19872o;
            boolean z4 = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((j) it.next()).s1()) {
                        z4 = true;
                        break;
                    }
                }
            }
            if (z4) {
                return p.f19939b.b();
            }
            if (this.f19870m == -1) {
                this.f19873p = e5;
            }
            Iterator<T> it2 = this.f19872o.iterator();
            while (it2.hasNext()) {
                ((j) it2.next()).p(e5);
            }
            return p.f19939b.c(r2.f19517a);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.j
    @p4.l
    public String toString() {
        String str;
        String j32;
        StringBuilder sb = new StringBuilder();
        if (this.f19873p != f.b()) {
            str = "CONFLATED_ELEMENT=" + this.f19873p + "; ";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append("BROADCAST=<");
        sb.append(super.toString());
        sb.append(">; SUBSCRIBERS=");
        j32 = kotlin.collections.e0.j3(this.f19872o, a1.i.f136b, "<", ">", 0, null, null, 56, null);
        sb.append(j32);
        return sb.toString();
    }
}
