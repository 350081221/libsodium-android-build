package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.bi;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.d1;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.p3;
import kotlinx.coroutines.x3;

@kotlin.i0(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001d\u0012\u0006\u00103\u001a\u000200\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\bI\u0010JJ\u0010\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007H\u0016J\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000eJ\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010J\u000e\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0012J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0010¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001b\u001a\u00020\u000b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJH\u0010!\u001a\u00020\u000b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192%\b\b\u0010 \u001a\u001f\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001dH\u0086\bø\u0001\u0000¢\u0006\u0004\b!\u0010\"J!\u0010$\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0014\u001a\u00020\u0012H\u0010¢\u0006\u0004\b$\u0010%J\u0013\u0010'\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010\u0016H\u0086\bJ!\u0010(\u001a\u00020\u000b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0086\bø\u0001\u0000¢\u0006\u0004\b(\u0010\u001cJ\u001f\u0010,\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00028\u0000H\u0000¢\u0006\u0004\b,\u0010-J\b\u0010/\u001a\u00020.H\u0016R\u0014\u00103\u001a\u0002008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001e\u00109\u001a\u0004\u0018\u00010\u00168\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b$\u00106\u0012\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\u00168\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b:\u00106R\u001a\u0010>\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010*\u001a\u00020)8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b?\u0010@R\u001c\u0010C\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0013\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160G8\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006K"}, d2 = {"Lkotlinx/coroutines/internal/l;", "T", "Lkotlinx/coroutines/h1;", "Lkotlin/coroutines/jvm/internal/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/coroutines/d;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "", bi.aL, "Lkotlin/r2;", "o", "x", "Lkotlinx/coroutines/q;", bi.aA, "Lkotlinx/coroutines/p;", "continuation", "", "E", "cause", "w", "", "n", "()Ljava/lang/Object;", "Lkotlin/d1;", "result", "resumeWith", "(Ljava/lang/Object;)V", "Lkotlin/Function1;", "Lkotlin/v0;", "name", "onCancellation", "y", "(Ljava/lang/Object;Lv3/l;)V", "takenState", "f", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "state", "A", "D", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, t0.b.f22420d, "q", "(Lkotlin/coroutines/g;Ljava/lang/Object;)V", "", "toString", "Lkotlinx/coroutines/n0;", "d", "Lkotlinx/coroutines/n0;", "dispatcher", "e", "Lkotlin/coroutines/d;", "Ljava/lang/Object;", "get_state$kotlinx_coroutines_core$annotations", "()V", "_state", socket.g.f22386a, "countOrElement", "r", "()Lkotlinx/coroutines/q;", "reusableCancellableContinuation", "getContext", "()Lkotlin/coroutines/g;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", bi.aJ, "()Lkotlin/coroutines/d;", "delegate", "Lkotlinx/atomicfu/AtomicRef;", "_reusableCancellableContinuation", "<init>", "(Lkotlinx/coroutines/n0;Lkotlin/coroutines/d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nDispatchedContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuationKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,315:1\n241#1,8:379\n253#1:387\n254#1,2:398\n256#1:402\n1#2:316\n1#2:322\n1#2:363\n295#3,5:317\n300#3,12:323\n312#3:357\n295#3,5:358\n300#3,12:364\n312#3:417\n198#4,3:335\n201#4,14:343\n198#4,3:376\n201#4,14:403\n95#5,5:338\n107#5,10:388\n118#5,2:400\n107#5,13:418\n*S KotlinDebug\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n*L\n222#1:379,8\n223#1:387\n223#1:398,2\n223#1:402\n200#1:322\n221#1:363\n200#1:317,5\n200#1:323,12\n200#1:357\n221#1:358,5\n221#1:364,12\n221#1:417\n200#1:335,3\n200#1:343,14\n221#1:376,3\n221#1:403,14\n201#1:338,5\n223#1:388,10\n223#1:400,2\n253#1:418,13\n*E\n"})
/* loaded from: classes4.dex */
public final class l<T> extends kotlinx.coroutines.h1<T> implements kotlin.coroutines.jvm.internal.e, kotlin.coroutines.d<T> {

    /* renamed from: h, reason: collision with root package name */
    @p4.l
    private static final AtomicReferenceFieldUpdater f20368h = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_reusableCancellableContinuation");

    @u3.w
    @p4.m
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    @u3.e
    public final kotlinx.coroutines.n0 f20369d;

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    @u3.e
    public final kotlin.coroutines.d<T> f20370e;

    /* renamed from: f, reason: collision with root package name */
    @p4.m
    @u3.e
    public Object f20371f;

    /* renamed from: g, reason: collision with root package name */
    @p4.l
    @u3.e
    public final Object f20372g;

    /* JADX WARN: Multi-variable type inference failed */
    public l(@p4.l kotlinx.coroutines.n0 n0Var, @p4.l kotlin.coroutines.d<? super T> dVar) {
        super(-1);
        this.f20369d = n0Var;
        this.f20370e = dVar;
        this.f20371f = m.a();
        this.f20372g = z0.b(getContext());
    }

    private final kotlinx.coroutines.q<?> r() {
        Object obj = f20368h.get(this);
        if (obj instanceof kotlinx.coroutines.q) {
            return (kotlinx.coroutines.q) obj;
        }
        return null;
    }

    public static /* synthetic */ void s() {
    }

    private final void v(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, v3.l<Object, r2> lVar, Object obj) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    public final boolean A(@p4.m Object obj) {
        l2 l2Var = (l2) getContext().get(l2.U);
        if (l2Var != null && !l2Var.isActive()) {
            CancellationException y4 = l2Var.y();
            f(obj, y4);
            d1.a aVar = kotlin.d1.Companion;
            resumeWith(kotlin.d1.m6444constructorimpl(kotlin.e1.a(y4)));
            return true;
        }
        return false;
    }

    public final void D(@p4.l Object obj) {
        x3<?> x3Var;
        kotlin.coroutines.d<T> dVar = this.f20370e;
        Object obj2 = this.f20372g;
        kotlin.coroutines.g context = dVar.getContext();
        Object c5 = z0.c(context, obj2);
        if (c5 != z0.f20411a) {
            x3Var = kotlinx.coroutines.m0.g(dVar, context, c5);
        } else {
            x3Var = null;
        }
        try {
            this.f20370e.resumeWith(obj);
            r2 r2Var = r2.f19517a;
        } finally {
            kotlin.jvm.internal.i0.d(1);
            if (x3Var == null || x3Var.x1()) {
                z0.a(context, c5);
            }
            kotlin.jvm.internal.i0.c(1);
        }
    }

    @p4.m
    public final Throwable E(@p4.l kotlinx.coroutines.p<?> pVar) {
        t0 t0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20368h;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            t0Var = m.f20374b;
            if (obj != t0Var) {
                if (obj instanceof Throwable) {
                    if (androidx.concurrent.futures.a.a(f20368h, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.a.a(f20368h, this, t0Var, pVar));
        return null;
    }

    @Override // kotlinx.coroutines.h1
    public void f(@p4.m Object obj, @p4.l Throwable th) {
        if (obj instanceof kotlinx.coroutines.e0) {
            ((kotlinx.coroutines.e0) obj).f20022b.invoke(th);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.e
    @p4.m
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        kotlin.coroutines.d<T> dVar = this.f20370e;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.d
    @p4.l
    public kotlin.coroutines.g getContext() {
        return this.f20370e.getContext();
    }

    @Override // kotlin.coroutines.jvm.internal.e
    @p4.m
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.h1
    @p4.l
    public kotlin.coroutines.d<T> h() {
        return this;
    }

    @Override // kotlinx.coroutines.h1
    @p4.m
    public Object n() {
        Object obj = this.f20371f;
        this.f20371f = m.a();
        return obj;
    }

    public final void o() {
        do {
        } while (f20368h.get(this) == m.f20374b);
    }

    @p4.m
    public final kotlinx.coroutines.q<T> p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20368h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f20368h.set(this, m.f20374b);
                return null;
            }
            if (obj instanceof kotlinx.coroutines.q) {
                if (androidx.concurrent.futures.a.a(f20368h, this, obj, m.f20374b)) {
                    return (kotlinx.coroutines.q) obj;
                }
            } else if (obj != m.f20374b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void q(@p4.l kotlin.coroutines.g gVar, T t5) {
        this.f20371f = t5;
        this.f20294c = 1;
        this.f20369d.dispatchYield(gVar, this);
    }

    @Override // kotlin.coroutines.d
    public void resumeWith(@p4.l Object obj) {
        kotlin.coroutines.g context = this.f20370e.getContext();
        Object d5 = kotlinx.coroutines.j0.d(obj, null, 1, null);
        if (this.f20369d.isDispatchNeeded(context)) {
            this.f20371f = d5;
            this.f20294c = 0;
            this.f20369d.dispatch(context, this);
            return;
        }
        kotlinx.coroutines.r1 b5 = p3.f20437a.b();
        if (b5.K0()) {
            this.f20371f = d5;
            this.f20294c = 0;
            b5.F0(this);
            return;
        }
        b5.H0(true);
        try {
            kotlin.coroutines.g context2 = getContext();
            Object c5 = z0.c(context2, this.f20372g);
            try {
                this.f20370e.resumeWith(obj);
                r2 r2Var = r2.f19517a;
                do {
                } while (b5.N0());
            } finally {
                z0.a(context2, c5);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final boolean t() {
        if (f20368h.get(this) != null) {
            return true;
        }
        return false;
    }

    @p4.l
    public String toString() {
        return "DispatchedContinuation[" + this.f20369d + ", " + kotlinx.coroutines.x0.c(this.f20370e) + ']';
    }

    public final boolean w(@p4.l Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20368h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            t0 t0Var = m.f20374b;
            if (kotlin.jvm.internal.l0.g(obj, t0Var)) {
                if (androidx.concurrent.futures.a.a(f20368h, this, t0Var, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (androidx.concurrent.futures.a.a(f20368h, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void x() {
        o();
        kotlinx.coroutines.q<?> r5 = r();
        if (r5 != null) {
            r5.w();
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void y(@p4.l Object obj, @p4.m v3.l<? super Throwable, r2> lVar) {
        boolean z4;
        x3<?> x3Var;
        Object c5 = kotlinx.coroutines.j0.c(obj, lVar);
        if (this.f20369d.isDispatchNeeded(getContext())) {
            this.f20371f = c5;
            this.f20294c = 1;
            this.f20369d.dispatch(getContext(), this);
            return;
        }
        kotlinx.coroutines.r1 b5 = p3.f20437a.b();
        if (b5.K0()) {
            this.f20371f = c5;
            this.f20294c = 1;
            b5.F0(this);
            return;
        }
        b5.H0(true);
        try {
            l2 l2Var = (l2) getContext().get(l2.U);
            if (l2Var != null && !l2Var.isActive()) {
                CancellationException y4 = l2Var.y();
                f(c5, y4);
                d1.a aVar = kotlin.d1.Companion;
                resumeWith(kotlin.d1.m6444constructorimpl(kotlin.e1.a(y4)));
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                kotlin.coroutines.d<T> dVar = this.f20370e;
                Object obj2 = this.f20372g;
                kotlin.coroutines.g context = dVar.getContext();
                Object c6 = z0.c(context, obj2);
                if (c6 != z0.f20411a) {
                    x3Var = kotlinx.coroutines.m0.g(dVar, context, c6);
                } else {
                    x3Var = null;
                }
                try {
                    this.f20370e.resumeWith(obj);
                    r2 r2Var = r2.f19517a;
                    kotlin.jvm.internal.i0.d(1);
                    if (x3Var == null || x3Var.x1()) {
                        z0.a(context, c6);
                    }
                    kotlin.jvm.internal.i0.c(1);
                } catch (Throwable th) {
                    kotlin.jvm.internal.i0.d(1);
                    if (x3Var == null || x3Var.x1()) {
                        z0.a(context, c6);
                    }
                    kotlin.jvm.internal.i0.c(1);
                    throw th;
                }
            }
            do {
            } while (b5.N0());
            kotlin.jvm.internal.i0.d(1);
        } catch (Throwable th2) {
            try {
                m(th2, null);
                kotlin.jvm.internal.i0.d(1);
            } catch (Throwable th3) {
                kotlin.jvm.internal.i0.d(1);
                b5.C0(true);
                kotlin.jvm.internal.i0.c(1);
                throw th3;
            }
        }
        b5.C0(true);
        kotlin.jvm.internal.i0.c(1);
    }
}
