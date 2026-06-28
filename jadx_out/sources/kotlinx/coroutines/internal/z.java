package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.bi;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.g2;

@kotlin.i0(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001:\u00012B\u0007¢\u0006\u0004\b0\u00101J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0019\u0010\u0006\u001a\u00060\u0000j\u0002`\u00042\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u0004H\u0082\u0010J\u0014\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0000j\u0002`\u0004H\u0002J\u001b\u0010\f\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0082\u0010J%\u0010\u0012\u001a\u00020\u00112\n\u0010\r\u001a\u00060\u0000j\u0002`\u00042\u000e\b\u0004\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0081\bJ\u0012\u0010\u0013\u001a\u00020\u000f2\n\u0010\r\u001a\u00060\u0000j\u0002`\u0004J\u0012\u0010\u0014\u001a\u00020\b2\n\u0010\r\u001a\u00060\u0000j\u0002`\u0004J%\u0010\u0015\u001a\u00020\u000f2\n\u0010\r\u001a\u00060\u0000j\u0002`\u00042\u000e\b\u0004\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0086\bJ \u0010\u0016\u001a\u00020\u000f2\n\u0010\r\u001a\u00060\u0000j\u0002`\u00042\n\u0010\u0007\u001a\u00060\u0000j\u0002`\u0004H\u0001J(\u0010\u0019\u001a\u00020\u00182\n\u0010\r\u001a\u00060\u0000j\u0002`\u00042\n\u0010\u0007\u001a\u00060\u0000j\u0002`\u00042\u0006\u0010\u0017\u001a\u00020\u0011H\u0001J\b\u0010\u001a\u001a\u00020\u000fH\u0016J\u0010\u0010\u001b\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0004H\u0001J\u0010\u0010\u001c\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0004H\u0014J'\u0010\u001e\u001a\u00020\b2\n\u0010\u001d\u001a\u00060\u0000j\u0002`\u00042\n\u0010\u0007\u001a\u00060\u0000j\u0002`\u0004H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010!\u001a\u00020 H\u0016R\u0014\u0010$\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010\u0007\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0015\u0010)\u001a\u00060\u0000j\u0002`\u00048F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0015\u0010+\u001a\u00060\u0000j\u0002`\u00048F¢\u0006\u0006\u001a\u0004\b*\u0010(R\u0011\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00010,8\u0002X\u0082\u0004R\u0011\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00000,8\u0002X\u0082\u0004R\u0013\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020,8\u0002X\u0082\u0004¨\u00063"}, d2 = {"Lkotlinx/coroutines/internal/z;", "", "Lkotlinx/coroutines/internal/n0;", bi.aK, "Lkotlinx/coroutines/internal/Node;", "current", "j", "next", "Lkotlin/r2;", "k", "Lkotlinx/coroutines/internal/l0;", "op", "i", "node", "Lkotlin/Function0;", "", "condition", "Lkotlinx/coroutines/internal/z$a;", "q", bi.aJ, "d", "f", socket.g.f22386a, "condAdd", "", "v", bi.aE, bi.aL, "r", "prev", "w", "(Lkotlinx/coroutines/internal/z;Lkotlinx/coroutines/internal/z;)V", "", "toString", "o", "()Z", "isRemoved", "l", "()Ljava/lang/Object;", "m", "()Lkotlinx/coroutines/internal/z;", "nextNode", "n", "prevNode", "Lkotlinx/atomicfu/AtomicRef;", "_next", "_prev", "_removedRef", "<init>", "()V", bi.ay, "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@g2
@r1({"SMAP\nLockFreeLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,367:1\n73#1,3:369\n1#2:368\n*S KotlinDebug\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode\n*L\n134#1:369,3\n*E\n"})
/* loaded from: classes4.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private static final AtomicReferenceFieldUpdater f20405a = AtomicReferenceFieldUpdater.newUpdater(z.class, Object.class, "_next");

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private static final AtomicReferenceFieldUpdater f20406b = AtomicReferenceFieldUpdater.newUpdater(z.class, Object.class, "_prev");

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private static final AtomicReferenceFieldUpdater f20407c = AtomicReferenceFieldUpdater.newUpdater(z.class, Object.class, "_removedRef");

    @u3.w
    @p4.m
    private volatile Object _next = this;

    @u3.w
    @p4.m
    private volatile Object _prev = this;

    @u3.w
    @p4.m
    private volatile Object _removedRef;

    @kotlin.i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0013\u0012\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016R\u0018\u0010\u000b\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001e\u0010\r\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/internal/z$a;", "Lkotlinx/coroutines/internal/b;", "Lkotlinx/coroutines/internal/z;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "failure", "Lkotlin/r2;", "f", "b", "Lkotlinx/coroutines/internal/z;", "newNode", "c", "oldNext", "<init>", "(Lkotlinx/coroutines/internal/z;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @kotlin.a1
    /* loaded from: classes4.dex */
    public static abstract class a extends kotlinx.coroutines.internal.b<z> {

        /* renamed from: b, reason: collision with root package name */
        @p4.l
        @u3.e
        public final z f20408b;

        /* renamed from: c, reason: collision with root package name */
        @p4.m
        @u3.e
        public z f20409c;

        public a(@p4.l z zVar) {
            this.f20408b = zVar;
        }

        @Override // kotlinx.coroutines.internal.b
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void c(@p4.l z zVar, @p4.m Object obj) {
            boolean z4;
            z zVar2;
            if (obj == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                zVar2 = this.f20408b;
            } else {
                zVar2 = this.f20409c;
            }
            if (zVar2 != null && androidx.concurrent.futures.a.a(z.f20405a, zVar, this, zVar2) && z4) {
                z zVar3 = this.f20408b;
                z zVar4 = this.f20409c;
                kotlin.jvm.internal.l0.m(zVar4);
                zVar3.k(zVar4);
            }
        }
    }

    @kotlin.i0(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/internal/z$b", "Lkotlinx/coroutines/internal/z$a;", "Lkotlinx/coroutines/internal/z;", "Lkotlinx/coroutines/internal/Node;", "affected", "", socket.g.f22386a, "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nLockFreeLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode$makeCondAddOp$1\n*L\n1#1,367:1\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class b extends a {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ v3.a<Boolean> f20410d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(z zVar, v3.a<Boolean> aVar) {
            super(zVar);
            this.f20410d = aVar;
        }

        @Override // kotlinx.coroutines.internal.b
        @p4.m
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Object e(@p4.l z zVar) {
            if (this.f20410d.invoke().booleanValue()) {
                return null;
            }
            return y.a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        if (androidx.concurrent.futures.a.a(r4, r3, r2, ((kotlinx.coroutines.internal.n0) r5).f20375a) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlinx.coroutines.internal.z i(kotlinx.coroutines.internal.l0 r9) {
        /*
            r8 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.z.f20406b
            java.lang.Object r0 = r0.get(r8)
            kotlinx.coroutines.internal.z r0 = (kotlinx.coroutines.internal.z) r0
            r1 = 0
            r2 = r0
        La:
            r3 = r1
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.internal.z.f20405a
            java.lang.Object r5 = r4.get(r2)
            if (r5 != r8) goto L20
            if (r0 != r2) goto L16
            return r2
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.z.f20406b
            boolean r0 = androidx.concurrent.futures.a.a(r1, r8, r0, r2)
            if (r0 != 0) goto L1f
            goto L0
        L1f:
            return r2
        L20:
            boolean r6 = r8.o()
            if (r6 == 0) goto L27
            return r1
        L27:
            if (r5 != r9) goto L2a
            return r2
        L2a:
            boolean r6 = r5 instanceof kotlinx.coroutines.internal.l0
            if (r6 == 0) goto L34
            kotlinx.coroutines.internal.l0 r5 = (kotlinx.coroutines.internal.l0) r5
            r5.b(r2)
            goto L0
        L34:
            boolean r6 = r5 instanceof kotlinx.coroutines.internal.n0
            if (r6 == 0) goto L50
            if (r3 == 0) goto L47
            kotlinx.coroutines.internal.n0 r5 = (kotlinx.coroutines.internal.n0) r5
            kotlinx.coroutines.internal.z r5 = r5.f20375a
            boolean r2 = androidx.concurrent.futures.a.a(r4, r3, r2, r5)
            if (r2 != 0) goto L45
            goto L0
        L45:
            r2 = r3
            goto La
        L47:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.internal.z.f20406b
            java.lang.Object r2 = r4.get(r2)
            kotlinx.coroutines.internal.z r2 = (kotlinx.coroutines.internal.z) r2
            goto Lb
        L50:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.l0.n(r5, r3)
            r3 = r5
            kotlinx.coroutines.internal.z r3 = (kotlinx.coroutines.internal.z) r3
            r7 = r3
            r3 = r2
            r2 = r7
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.z.i(kotlinx.coroutines.internal.l0):kotlinx.coroutines.internal.z");
    }

    private final z j(z zVar) {
        while (zVar.o()) {
            zVar = (z) f20406b.get(zVar);
        }
        return zVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(z zVar) {
        z zVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20406b;
        do {
            zVar2 = (z) atomicReferenceFieldUpdater.get(zVar);
            if (l() != zVar) {
                return;
            }
        } while (!androidx.concurrent.futures.a.a(f20406b, zVar, zVar2, this));
        if (o()) {
            zVar.i(null);
        }
    }

    private final void p(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, v3.l<Object, r2> lVar, Object obj) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final n0 u() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20407c;
        n0 n0Var = (n0) atomicReferenceFieldUpdater.get(this);
        if (n0Var != null) {
            return n0Var;
        }
        n0 n0Var2 = new n0(this);
        atomicReferenceFieldUpdater.lazySet(this, n0Var2);
        return n0Var2;
    }

    public final void d(@p4.l z zVar) {
        do {
        } while (!n().g(zVar, this));
    }

    public final boolean f(@p4.l z zVar, @p4.l v3.a<Boolean> aVar) {
        int v4;
        b bVar = new b(zVar, aVar);
        do {
            v4 = n().v(zVar, this, bVar);
            if (v4 == 1) {
                return true;
            }
        } while (v4 != 2);
        return false;
    }

    @kotlin.a1
    public final boolean g(@p4.l z zVar, @p4.l z zVar2) {
        f20406b.lazySet(zVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20405a;
        atomicReferenceFieldUpdater.lazySet(zVar, zVar2);
        if (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, zVar2, zVar)) {
            return false;
        }
        zVar.k(zVar2);
        return true;
    }

    public final boolean h(@p4.l z zVar) {
        f20406b.lazySet(zVar, this);
        f20405a.lazySet(zVar, this);
        while (l() == this) {
            if (androidx.concurrent.futures.a.a(f20405a, this, this, zVar)) {
                zVar.k(this);
                return true;
            }
        }
        return false;
    }

    @p4.l
    public final Object l() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20405a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof l0)) {
                return obj;
            }
            ((l0) obj).b(this);
        }
    }

    @p4.l
    public final z m() {
        return y.f(l());
    }

    @p4.l
    public final z n() {
        z i5 = i(null);
        return i5 == null ? j((z) f20406b.get(this)) : i5;
    }

    public boolean o() {
        return l() instanceof n0;
    }

    @p4.l
    @kotlin.a1
    public final a q(@p4.l z zVar, @p4.l v3.a<Boolean> aVar) {
        return new b(zVar, aVar);
    }

    @p4.m
    protected z r() {
        Object l5 = l();
        n0 n0Var = l5 instanceof n0 ? (n0) l5 : null;
        if (n0Var != null) {
            return n0Var.f20375a;
        }
        return null;
    }

    public boolean s() {
        return t() == null;
    }

    @kotlin.a1
    @p4.m
    public final z t() {
        Object l5;
        z zVar;
        do {
            l5 = l();
            if (l5 instanceof n0) {
                return ((n0) l5).f20375a;
            }
            if (l5 == this) {
                return (z) l5;
            }
            kotlin.jvm.internal.l0.n(l5, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            zVar = (z) l5;
        } while (!androidx.concurrent.futures.a.a(f20405a, this, l5, zVar.u()));
        zVar.i(null);
        return null;
    }

    @p4.l
    public String toString() {
        return new kotlin.jvm.internal.e1(this) { // from class: kotlinx.coroutines.internal.z.c
            @Override // kotlin.jvm.internal.e1, kotlin.reflect.p
            @p4.m
            public Object get() {
                return kotlinx.coroutines.x0.a(this.receiver);
            }
        } + '@' + kotlinx.coroutines.x0.b(this);
    }

    @kotlin.a1
    public final int v(@p4.l z zVar, @p4.l z zVar2, @p4.l a aVar) {
        f20406b.lazySet(zVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20405a;
        atomicReferenceFieldUpdater.lazySet(zVar, zVar2);
        aVar.f20409c = zVar2;
        if (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, zVar2, aVar)) {
            return 0;
        }
        if (aVar.b(this) == null) {
            return 1;
        }
        return 2;
    }

    public final void w(@p4.l z zVar, @p4.l z zVar2) {
    }
}
