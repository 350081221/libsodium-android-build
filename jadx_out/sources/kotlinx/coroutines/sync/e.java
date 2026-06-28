package kotlinx.coroutines.sync;

import com.umeng.analytics.pro.bi;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.h;
import kotlin.i0;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.q;
import kotlinx.coroutines.s;
import kotlinx.coroutines.z3;
import p4.l;
import p4.m;
import u3.w;
import v3.p;

@i0(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\"\u001a\u00020\u000f\u0012\u0006\u00101\u001a\u00020\u000f¢\u0006\u0004\b2\u00103J\u0013\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004Jd\u0010\r\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u00028\u00002!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\n0\u00072!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00020\u0007H\u0083\b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\nH\u0002J\f\u0010\u0016\u001a\u00020\n*\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\nH\u0016J\u0013\u0010\u0018\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0004J\u0016\u0010\u001a\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0005J\u001e\u0010\u001e\u001a\u00020\u00022\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0015H\u0004J\b\u0010\u001f\u001a\u00020\u0002H\u0016R\u0014\u0010\"\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010$R\u0014\u0010'\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010&R\u000b\u0010)\u001a\u00020(8\u0002X\u0082\u0004R\u000b\u0010+\u001a\u00020*8\u0002X\u0082\u0004R\u000b\u0010,\u001a\u00020*8\u0002X\u0082\u0004R\u0011\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-8\u0002X\u0082\u0004R\u0011\u00100\u001a\b\u0012\u0004\u0012\u00020.0-8\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"}, d2 = {"Lkotlinx/coroutines/sync/e;", "Lkotlinx/coroutines/sync/d;", "Lkotlin/r2;", "o", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "W", "waiter", "Lkotlin/Function1;", "Lkotlin/v0;", "name", "", "suspend", "onAcquired", "l", "(Ljava/lang/Object;Lv3/l;Lv3/l;)V", "", "r", "q", "Lkotlinx/coroutines/z3;", bi.aA, bi.aK, "", bi.aL, "b", "e", "Lkotlinx/coroutines/p;", "m", "Lkotlinx/coroutines/selects/m;", "select", "ignoredParam", bi.aE, "release", bi.ay, "I", "permits", "", "Lv3/l;", "onCancellationRelease", "()I", "availablePermits", "Lkotlinx/atomicfu/AtomicInt;", "_availablePermits", "Lkotlinx/atomicfu/AtomicLong;", "deqIdx", "enqIdx", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/sync/g;", "head", "tail", "acquiredPermits", "<init>", "(II)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSemaphore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 5 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n1#1,397:1\n205#1,10:411\n205#1,10:421\n1#2:398\n332#3,12:399\n72#4,3:431\n46#4,8:434\n72#4,3:445\n46#4,8:448\n375#5:442\n375#5:443\n367#5:444\n378#5:456\n367#5:457\n375#5:458\n*S KotlinDebug\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreImpl\n*L\n197#1:411,10\n221#1:421,10\n187#1:399,12\n289#1:431,3\n289#1:434,8\n322#1:445,3\n322#1:448,8\n293#1:442\n299#1:443\n313#1:444\n328#1:456\n334#1:457\n337#1:458\n*E\n"})
/* loaded from: classes4.dex */
public class e implements d {

    /* renamed from: c, reason: collision with root package name */
    @l
    private static final AtomicReferenceFieldUpdater f20617c = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "head");

    /* renamed from: d, reason: collision with root package name */
    @l
    private static final AtomicLongFieldUpdater f20618d = AtomicLongFieldUpdater.newUpdater(e.class, "deqIdx");

    /* renamed from: e, reason: collision with root package name */
    @l
    private static final AtomicReferenceFieldUpdater f20619e = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "tail");

    /* renamed from: f, reason: collision with root package name */
    @l
    private static final AtomicLongFieldUpdater f20620f = AtomicLongFieldUpdater.newUpdater(e.class, "enqIdx");

    /* renamed from: g, reason: collision with root package name */
    @l
    private static final AtomicIntegerFieldUpdater f20621g = AtomicIntegerFieldUpdater.newUpdater(e.class, "_availablePermits");

    @w
    private volatile int _availablePermits;

    /* renamed from: a, reason: collision with root package name */
    private final int f20622a;

    /* renamed from: b, reason: collision with root package name */
    @l
    private final v3.l<Throwable, r2> f20623b;

    @w
    private volatile long deqIdx;

    @w
    private volatile long enqIdx;

    @w
    @m
    private volatile Object head;

    @w
    @m
    private volatile Object tail;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class a extends h0 implements p<Long, g, g> {
        public static final a INSTANCE = new a();

        a() {
            super(2, f.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ g invoke(Long l5, g gVar) {
            return invoke(l5.longValue(), gVar);
        }

        @l
        public final g invoke(long j5, @m g gVar) {
            g j6;
            j6 = f.j(j5, gVar);
            return j6;
        }
    }

    @i0(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "Lkotlin/r2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    static final class b extends n0 implements v3.l<Throwable, r2> {
        b() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Throwable th) {
            invoke2(th);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@l Throwable th) {
            e.this.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class c extends h0 implements p<Long, g, g> {
        public static final c INSTANCE = new c();

        c() {
            super(2, f.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ g invoke(Long l5, g gVar) {
            return invoke(l5.longValue(), gVar);
        }

        @l
        public final g invoke(long j5, @m g gVar) {
            g j6;
            j6 = f.j(j5, gVar);
            return j6;
        }
    }

    public e(int i5, int i6) {
        boolean z4;
        this.f20622a = i5;
        if (i5 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (i6 >= 0 && i6 <= i5) {
                g gVar = new g(0L, null, 2);
                this.head = gVar;
                this.tail = gVar;
                this._availablePermits = i5 - i6;
                this.f20623b = new b();
                return;
            }
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i5).toString());
        }
        throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i5).toString());
    }

    private final <W> void l(W w4, v3.l<? super W, Boolean> lVar, v3.l<? super W, r2> lVar2) {
        while (r() <= 0) {
            if (lVar.invoke(w4).booleanValue()) {
                return;
            }
        }
        lVar2.invoke(w4);
    }

    static /* synthetic */ Object n(e eVar, kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        if (eVar.r() > 0) {
            return r2.f19517a;
        }
        Object o5 = eVar.o(dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (o5 == l5) {
            return o5;
        }
        return r2.f19517a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object o(kotlin.coroutines.d<? super r2> dVar) {
        kotlin.coroutines.d e5;
        Object l5;
        Object l6;
        e5 = kotlin.coroutines.intrinsics.c.e(dVar);
        q b5 = s.b(e5);
        try {
            if (!p(b5)) {
                m(b5);
            }
            Object E = b5.E();
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (E == l5) {
                h.c(dVar);
            }
            l6 = kotlin.coroutines.intrinsics.d.l();
            if (E == l6) {
                return E;
            }
            return r2.f19517a;
        } catch (Throwable th) {
            b5.R();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0037, code lost:
    
        r10 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(kotlinx.coroutines.z3 r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.sync.e.f20619e
            java.lang.Object r3 = r2.get(r0)
            kotlinx.coroutines.sync.g r3 = (kotlinx.coroutines.sync.g) r3
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = kotlinx.coroutines.sync.e.f20620f
            long r4 = r4.getAndIncrement(r0)
            kotlinx.coroutines.sync.e$a r6 = kotlinx.coroutines.sync.e.a.INSTANCE
            int r7 = kotlinx.coroutines.sync.f.h()
            long r7 = (long) r7
            long r7 = r4 / r7
        L1b:
            java.lang.Object r9 = kotlinx.coroutines.internal.e.g(r3, r7, r6)
            boolean r10 = kotlinx.coroutines.internal.r0.h(r9)
            if (r10 != 0) goto L5e
            kotlinx.coroutines.internal.q0 r10 = kotlinx.coroutines.internal.r0.f(r9)
        L29:
            java.lang.Object r13 = r2.get(r0)
            kotlinx.coroutines.internal.q0 r13 = (kotlinx.coroutines.internal.q0) r13
            long r14 = r13.f20383c
            long r11 = r10.f20383c
            int r11 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r11 < 0) goto L39
        L37:
            r10 = 1
            goto L51
        L39:
            boolean r11 = r10.s()
            if (r11 != 0) goto L41
            r10 = 0
            goto L51
        L41:
            boolean r11 = androidx.concurrent.futures.a.a(r2, r0, r13, r10)
            if (r11 == 0) goto L54
            boolean r10 = r13.o()
            if (r10 == 0) goto L37
            r13.l()
            goto L37
        L51:
            if (r10 == 0) goto L1b
            goto L5e
        L54:
            boolean r11 = r10.o()
            if (r11 == 0) goto L29
            r10.l()
            goto L29
        L5e:
            kotlinx.coroutines.internal.q0 r2 = kotlinx.coroutines.internal.r0.f(r9)
            kotlinx.coroutines.sync.g r2 = (kotlinx.coroutines.sync.g) r2
            int r3 = kotlinx.coroutines.sync.f.h()
            long r6 = (long) r3
            long r4 = r4 % r6
            int r3 = (int) r4
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r2.v()
            r5 = 0
            boolean r4 = kotlinx.coroutines.channels.q.a(r4, r3, r5, r1)
            if (r4 == 0) goto L7b
            r1.b(r2, r3)
            r1 = 1
            return r1
        L7b:
            kotlinx.coroutines.internal.t0 r4 = kotlinx.coroutines.sync.f.g()
            kotlinx.coroutines.internal.t0 r5 = kotlinx.coroutines.sync.f.i()
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r2.v()
            boolean r2 = kotlinx.coroutines.channels.q.a(r2, r3, r4, r5)
            if (r2 == 0) goto Lc9
            boolean r2 = r1 instanceof kotlinx.coroutines.p
            if (r2 == 0) goto La1
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>"
            kotlin.jvm.internal.l0.n(r1, r2)
            kotlinx.coroutines.p r1 = (kotlinx.coroutines.p) r1
            kotlin.r2 r2 = kotlin.r2.f19517a
            v3.l<java.lang.Throwable, kotlin.r2> r3 = r0.f20623b
            r1.C(r2, r3)
        L9f:
            r1 = 1
            goto Lad
        La1:
            boolean r2 = r1 instanceof kotlinx.coroutines.selects.m
            if (r2 == 0) goto Lae
            kotlinx.coroutines.selects.m r1 = (kotlinx.coroutines.selects.m) r1
            kotlin.r2 r2 = kotlin.r2.f19517a
            r1.e(r2)
            goto L9f
        Lad:
            return r1
        Lae:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "unexpected: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        Lc9:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.e.p(kotlinx.coroutines.z3):boolean");
    }

    private final void q() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i5;
        int i6;
        do {
            atomicIntegerFieldUpdater = f20621g;
            i5 = atomicIntegerFieldUpdater.get(this);
            i6 = this.f20622a;
            if (i5 <= i6) {
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i5, i6));
    }

    private final int r() {
        int andDecrement;
        do {
            andDecrement = f20621g.getAndDecrement(this);
        } while (andDecrement > this.f20622a);
        return andDecrement;
    }

    private final boolean t(Object obj) {
        if (obj instanceof kotlinx.coroutines.p) {
            l0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            kotlinx.coroutines.p pVar = (kotlinx.coroutines.p) obj;
            Object u4 = pVar.u(r2.f19517a, null, this.f20623b);
            if (u4 != null) {
                pVar.K(u4);
                return true;
            }
            return false;
        }
        if (obj instanceof kotlinx.coroutines.selects.m) {
            return ((kotlinx.coroutines.selects.m) obj).i(this, r2.f19517a);
        }
        throw new IllegalStateException(("unexpected: " + obj).toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        r9 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean u() {
        /*
            r15 = this;
            r0 = r15
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.sync.e.f20617c
            java.lang.Object r2 = r1.get(r15)
            kotlinx.coroutines.sync.g r2 = (kotlinx.coroutines.sync.g) r2
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = kotlinx.coroutines.sync.e.f20618d
            long r3 = r3.getAndIncrement(r15)
            int r5 = kotlinx.coroutines.sync.f.h()
            long r5 = (long) r5
            long r5 = r3 / r5
            kotlinx.coroutines.sync.e$c r7 = kotlinx.coroutines.sync.e.c.INSTANCE
        L18:
            java.lang.Object r8 = kotlinx.coroutines.internal.e.g(r2, r5, r7)
            boolean r9 = kotlinx.coroutines.internal.r0.h(r8)
            if (r9 != 0) goto L5b
            kotlinx.coroutines.internal.q0 r9 = kotlinx.coroutines.internal.r0.f(r8)
        L26:
            java.lang.Object r12 = r1.get(r15)
            kotlinx.coroutines.internal.q0 r12 = (kotlinx.coroutines.internal.q0) r12
            long r13 = r12.f20383c
            long r10 = r9.f20383c
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r10 < 0) goto L36
        L34:
            r9 = 1
            goto L4e
        L36:
            boolean r10 = r9.s()
            if (r10 != 0) goto L3e
            r9 = 0
            goto L4e
        L3e:
            boolean r10 = androidx.concurrent.futures.a.a(r1, r15, r12, r9)
            if (r10 == 0) goto L51
            boolean r9 = r12.o()
            if (r9 == 0) goto L34
            r12.l()
            goto L34
        L4e:
            if (r9 == 0) goto L18
            goto L5b
        L51:
            boolean r10 = r9.o()
            if (r10 == 0) goto L26
            r9.l()
            goto L26
        L5b:
            kotlinx.coroutines.internal.q0 r1 = kotlinx.coroutines.internal.r0.f(r8)
            kotlinx.coroutines.sync.g r1 = (kotlinx.coroutines.sync.g) r1
            r1.b()
            long r7 = r1.f20383c
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 <= 0) goto L6c
            r2 = 0
            return r2
        L6c:
            int r2 = kotlinx.coroutines.sync.f.h()
            long r5 = (long) r2
            long r3 = r3 % r5
            int r2 = (int) r3
            kotlinx.coroutines.internal.t0 r3 = kotlinx.coroutines.sync.f.g()
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r1.v()
            java.lang.Object r3 = r4.getAndSet(r2, r3)
            if (r3 != 0) goto Laf
            int r3 = kotlinx.coroutines.sync.f.f()
            r10 = 0
        L86:
            if (r10 >= r3) goto L9c
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r1.v()
            java.lang.Object r4 = r4.get(r2)
            kotlinx.coroutines.internal.t0 r5 = kotlinx.coroutines.sync.f.i()
            if (r4 != r5) goto L98
            r4 = 1
            return r4
        L98:
            r4 = 1
            int r10 = r10 + 1
            goto L86
        L9c:
            r4 = 1
            kotlinx.coroutines.internal.t0 r3 = kotlinx.coroutines.sync.f.g()
            kotlinx.coroutines.internal.t0 r5 = kotlinx.coroutines.sync.f.d()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r1.v()
            boolean r1 = kotlinx.coroutines.channels.q.a(r1, r2, r3, r5)
            r1 = r1 ^ r4
            return r1
        Laf:
            kotlinx.coroutines.internal.t0 r1 = kotlinx.coroutines.sync.f.e()
            if (r3 != r1) goto Lb7
            r1 = 0
            return r1
        Lb7:
            boolean r1 = r15.t(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.e.u():boolean");
    }

    @Override // kotlinx.coroutines.sync.d
    public int a() {
        return Math.max(f20621g.get(this), 0);
    }

    @Override // kotlinx.coroutines.sync.d
    public boolean b() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f20621g;
            int i5 = atomicIntegerFieldUpdater.get(this);
            if (i5 > this.f20622a) {
                q();
            } else {
                if (i5 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i5, i5 - 1)) {
                    return true;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.sync.d
    @m
    public Object e(@l kotlin.coroutines.d<? super r2> dVar) {
        return n(this, dVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void m(@l kotlinx.coroutines.p<? super r2> pVar) {
        while (r() <= 0) {
            l0.n(pVar, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (p((z3) pVar)) {
                return;
            }
        }
        pVar.C(r2.f19517a, this.f20623b);
    }

    @Override // kotlinx.coroutines.sync.d
    public void release() {
        do {
            int andIncrement = f20621g.getAndIncrement(this);
            if (andIncrement < this.f20622a) {
                if (andIncrement >= 0) {
                    return;
                }
            } else {
                q();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f20622a).toString());
            }
        } while (!u());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void s(@l kotlinx.coroutines.selects.m<?> mVar, @m Object obj) {
        while (r() <= 0) {
            l0.n(mVar, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (p((z3) mVar)) {
                return;
            }
        }
        mVar.e(r2.f19517a);
    }
}
