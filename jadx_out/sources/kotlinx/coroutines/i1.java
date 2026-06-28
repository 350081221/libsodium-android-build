package kotlinx.coroutines;

import com.umeng.analytics.pro.bi;
import kotlin.d1;

@kotlin.i0(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0011\u001a \u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a.\u0010\n\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0000\u001a\u0010\u0010\u000b\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0001H\u0002\u001a'\u0010\u0010\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eH\u0080\b\u001a\u0019\u0010\u0013\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0080\b\"\u0014\u0010\u0015\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014\"\u001a\u0010\u0019\u001a\u00020\u00028\u0000X\u0081T¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001b\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014\"\u0014\u0010\u001d\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014\"\u0014\u0010\u001e\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0014\"\u0018\u0010 \u001a\u00020\b*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001f\"\u0018\u0010!\u001a\u00020\b*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001f¨\u0006\""}, d2 = {"T", "Lkotlinx/coroutines/h1;", "", "mode", "Lkotlin/r2;", bi.ay, "Lkotlin/coroutines/d;", "delegate", "", "undispatched", "e", "f", "Lkotlinx/coroutines/r1;", "eventLoop", "Lkotlin/Function0;", "block", bi.aJ, "", "exception", socket.g.f22386a, "I", "MODE_ATOMIC", "b", "getMODE_CANCELLABLE$annotations", "()V", "MODE_CANCELLABLE", "c", "MODE_CANCELLABLE_REUSABLE", "d", "MODE_UNDISPATCHED", "MODE_UNINITIALIZED", "(I)Z", "isCancellableMode", "isReusableMode", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nDispatchedTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n+ 4 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,220:1\n198#1,17:238\n1#2:221\n253#3:222\n254#3,2:233\n256#3:237\n107#4,10:223\n118#4,2:235\n61#5,2:255\n*S KotlinDebug\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n*L\n188#1:238,17\n176#1:222\n176#1:233,2\n176#1:237\n176#1:223,10\n176#1:235,2\n218#1:255,2\n*E\n"})
/* loaded from: classes4.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f20300a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f20301b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f20302c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f20303d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f20304e = -1;

    public static final <T> void a(@p4.l h1<? super T> h1Var, int i5) {
        boolean z4;
        kotlin.coroutines.d<? super T> h5 = h1Var.h();
        if (i5 == 4) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4 && (h5 instanceof kotlinx.coroutines.internal.l) && c(i5) == c(h1Var.f20294c)) {
            n0 n0Var = ((kotlinx.coroutines.internal.l) h5).f20369d;
            kotlin.coroutines.g context = h5.getContext();
            if (n0Var.isDispatchNeeded(context)) {
                n0Var.dispatch(context, h1Var);
                return;
            } else {
                f(h1Var);
                return;
            }
        }
        e(h1Var, h5, z4);
    }

    @kotlin.a1
    public static /* synthetic */ void b() {
    }

    public static final boolean c(int i5) {
        return i5 == 1 || i5 == 2;
    }

    public static final boolean d(int i5) {
        return i5 == 2;
    }

    public static final <T> void e(@p4.l h1<? super T> h1Var, @p4.l kotlin.coroutines.d<? super T> dVar, boolean z4) {
        Object l5;
        x3<?> x3Var;
        boolean x12;
        Object n5 = h1Var.n();
        Throwable j5 = h1Var.j(n5);
        if (j5 != null) {
            d1.a aVar = kotlin.d1.Companion;
            l5 = kotlin.e1.a(j5);
        } else {
            d1.a aVar2 = kotlin.d1.Companion;
            l5 = h1Var.l(n5);
        }
        Object m6444constructorimpl = kotlin.d1.m6444constructorimpl(l5);
        if (z4) {
            kotlin.jvm.internal.l0.n(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            kotlinx.coroutines.internal.l lVar = (kotlinx.coroutines.internal.l) dVar;
            kotlin.coroutines.d<T> dVar2 = lVar.f20370e;
            Object obj = lVar.f20372g;
            kotlin.coroutines.g context = dVar2.getContext();
            Object c5 = kotlinx.coroutines.internal.z0.c(context, obj);
            if (c5 != kotlinx.coroutines.internal.z0.f20411a) {
                x3Var = m0.g(dVar2, context, c5);
            } else {
                x3Var = null;
            }
            try {
                lVar.f20370e.resumeWith(m6444constructorimpl);
                kotlin.r2 r2Var = kotlin.r2.f19517a;
                if (x3Var != null) {
                    if (!x12) {
                        return;
                    }
                }
                return;
            } finally {
                if (x3Var == null || x3Var.x1()) {
                    kotlinx.coroutines.internal.z0.a(context, c5);
                }
            }
        }
        dVar.resumeWith(m6444constructorimpl);
    }

    private static final void f(h1<?> h1Var) {
        r1 b5 = p3.f20437a.b();
        if (b5.K0()) {
            b5.F0(h1Var);
            return;
        }
        b5.H0(true);
        try {
            e(h1Var, h1Var.h(), true);
            do {
            } while (b5.N0());
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final void g(@p4.l kotlin.coroutines.d<?> dVar, @p4.l Throwable th) {
        d1.a aVar = kotlin.d1.Companion;
        dVar.resumeWith(kotlin.d1.m6444constructorimpl(kotlin.e1.a(th)));
    }

    public static final void h(@p4.l h1<?> h1Var, @p4.l r1 r1Var, @p4.l v3.a<kotlin.r2> aVar) {
        r1Var.H0(true);
        try {
            aVar.invoke();
            do {
            } while (r1Var.N0());
            kotlin.jvm.internal.i0.d(1);
        } catch (Throwable th) {
            try {
                h1Var.m(th, null);
                kotlin.jvm.internal.i0.d(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.i0.d(1);
                r1Var.C0(true);
                kotlin.jvm.internal.i0.c(1);
                throw th2;
            }
        }
        r1Var.C0(true);
        kotlin.jvm.internal.i0.c(1);
    }
}
