package h4;

import com.umeng.analytics.pro.bi;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.h;
import kotlin.d1;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.u1;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.internal.p0;
import kotlinx.coroutines.internal.z0;
import kotlinx.coroutines.t3;
import kotlinx.coroutines.u2;
import p4.l;
import p4.m;
import socket.g;
import v3.p;

@i0(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a@\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a@\u0010\b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007\u001aT\u0010\f\u001a\u00020\u0005\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\u0000*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n2\u0006\u0010\u000b\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a9\u0010\u000f\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u001a\u0010\u000e\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0082\b\u001a[\u0010\u0012\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u000b\u001a\u00028\u00012'\u0010\u000e\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n¢\u0006\u0002\b\u0011H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a[\u0010\u0014\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u000b\u001a\u00028\u00012'\u0010\u000e\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n¢\u0006\u0002\b\u0011H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0013\u001a?\u0010\u001a\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00102\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00012\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0018H\u0082\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"T", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "", "completion", "Lkotlin/r2;", "c", "(Lv3/l;Lkotlin/coroutines/d;)V", bi.ay, "R", "Lkotlin/Function2;", "receiver", "b", "(Lv3/p;Ljava/lang/Object;Lkotlin/coroutines/d;)V", "block", "d", "Lkotlinx/coroutines/internal/p0;", "Lkotlin/u;", "e", "(Lkotlinx/coroutines/internal/p0;Ljava/lang/Object;Lv3/p;)Ljava/lang/Object;", "f", "", "", "shouldThrow", "Lkotlin/Function0;", "startBlock", g.f22386a, "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nUndispatched.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Undispatched.kt\nkotlinx/coroutines/intrinsics/UndispatchedKt\n+ 2 ProbesSupport.kt\nkotlinx/coroutines/internal/ProbesSupportKt\n+ 3 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 4 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,127:1\n55#1:128\n56#1,11:130\n55#1:141\n56#1,2:143\n58#1,9:150\n55#1:159\n56#1,2:161\n58#1,9:168\n97#1,4:178\n114#1,6:182\n120#1,5:190\n97#1,4:195\n114#1,6:199\n120#1,5:207\n11#2:129\n11#2:142\n11#2:160\n11#2:177\n95#3,5:145\n95#3,5:163\n61#4,2:188\n61#4,2:205\n61#4,2:212\n61#4,2:214\n*S KotlinDebug\n*F\n+ 1 Undispatched.kt\nkotlinx/coroutines/intrinsics/UndispatchedKt\n*L\n18#1:128\n18#1:130,11\n29#1:141\n29#1:143,2\n29#1:150,9\n42#1:159\n42#1:161,2\n42#1:168,9\n77#1:178,4\n77#1:182,6\n77#1:190,5\n88#1:195,4\n88#1:199,6\n88#1:207,5\n18#1:129\n29#1:142\n42#1:160\n55#1:177\n30#1:145,5\n43#1:163,5\n77#1:188,2\n88#1:205,2\n119#1:212,2\n120#1:214,2\n*E\n"})
/* loaded from: classes4.dex */
public final class b {
    public static final <T> void a(@l v3.l<? super d<? super T>, ? extends Object> lVar, @l d<? super T> dVar) {
        Object l5;
        d a5 = h.a(dVar);
        try {
            kotlin.coroutines.g context = dVar.getContext();
            Object c5 = z0.c(context, null);
            try {
                Object invoke = ((v3.l) u1.q(lVar, 1)).invoke(a5);
                l5 = kotlin.coroutines.intrinsics.d.l();
                if (invoke != l5) {
                    d1.a aVar = d1.Companion;
                    a5.resumeWith(d1.m6444constructorimpl(invoke));
                }
            } finally {
                z0.a(context, c5);
            }
        } catch (Throwable th) {
            d1.a aVar2 = d1.Companion;
            a5.resumeWith(d1.m6444constructorimpl(e1.a(th)));
        }
    }

    public static final <R, T> void b(@l p<? super R, ? super d<? super T>, ? extends Object> pVar, R r5, @l d<? super T> dVar) {
        Object l5;
        d a5 = h.a(dVar);
        try {
            kotlin.coroutines.g context = dVar.getContext();
            Object c5 = z0.c(context, null);
            try {
                Object invoke = ((p) u1.q(pVar, 2)).invoke(r5, a5);
                l5 = kotlin.coroutines.intrinsics.d.l();
                if (invoke != l5) {
                    d1.a aVar = d1.Companion;
                    a5.resumeWith(d1.m6444constructorimpl(invoke));
                }
            } finally {
                z0.a(context, c5);
            }
        } catch (Throwable th) {
            d1.a aVar2 = d1.Companion;
            a5.resumeWith(d1.m6444constructorimpl(e1.a(th)));
        }
    }

    public static final <T> void c(@l v3.l<? super d<? super T>, ? extends Object> lVar, @l d<? super T> dVar) {
        Object l5;
        d a5 = h.a(dVar);
        try {
            Object invoke = ((v3.l) u1.q(lVar, 1)).invoke(a5);
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (invoke != l5) {
                d1.a aVar = d1.Companion;
                a5.resumeWith(d1.m6444constructorimpl(invoke));
            }
        } catch (Throwable th) {
            d1.a aVar2 = d1.Companion;
            a5.resumeWith(d1.m6444constructorimpl(e1.a(th)));
        }
    }

    private static final <T> void d(d<? super T> dVar, v3.l<? super d<? super T>, ? extends Object> lVar) {
        Object l5;
        d a5 = h.a(dVar);
        try {
            Object invoke = lVar.invoke(a5);
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (invoke != l5) {
                d1.a aVar = d1.Companion;
                a5.resumeWith(d1.m6444constructorimpl(invoke));
            }
        } catch (Throwable th) {
            d1.a aVar2 = d1.Companion;
            a5.resumeWith(d1.m6444constructorimpl(e1.a(th)));
        }
    }

    @m
    public static final <T, R> Object e(@l p0<? super T> p0Var, R r5, @l p<? super R, ? super d<? super T>, ? extends Object> pVar) {
        Object d0Var;
        Object l5;
        Object l6;
        Object l7;
        try {
            d0Var = ((p) u1.q(pVar, 2)).invoke(r5, p0Var);
        } catch (Throwable th) {
            d0Var = new d0(th, false, 2, null);
        }
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (d0Var == l5) {
            l7 = kotlin.coroutines.intrinsics.d.l();
            return l7;
        }
        Object R0 = p0Var.R0(d0Var);
        if (R0 == u2.f20652b) {
            l6 = kotlin.coroutines.intrinsics.d.l();
            return l6;
        }
        if (!(R0 instanceof d0)) {
            return u2.h(R0);
        }
        throw ((d0) R0).f19951a;
    }

    @m
    public static final <T, R> Object f(@l p0<? super T> p0Var, R r5, @l p<? super R, ? super d<? super T>, ? extends Object> pVar) {
        Object d0Var;
        Object l5;
        Object l6;
        Object l7;
        boolean z4 = false;
        try {
            d0Var = ((p) u1.q(pVar, 2)).invoke(r5, p0Var);
        } catch (Throwable th) {
            d0Var = new d0(th, false, 2, null);
        }
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (d0Var == l5) {
            l7 = kotlin.coroutines.intrinsics.d.l();
            return l7;
        }
        Object R0 = p0Var.R0(d0Var);
        if (R0 == u2.f20652b) {
            l6 = kotlin.coroutines.intrinsics.d.l();
            return l6;
        }
        if (R0 instanceof d0) {
            Throwable th2 = ((d0) R0).f19951a;
            if (!(th2 instanceof t3) || ((t3) th2).coroutine != p0Var) {
                z4 = true;
            }
            if (!z4) {
                if (d0Var instanceof d0) {
                    throw ((d0) d0Var).f19951a;
                }
            } else {
                throw th2;
            }
        } else {
            d0Var = u2.h(R0);
        }
        return d0Var;
    }

    private static final <T> Object g(p0<? super T> p0Var, v3.l<? super Throwable, Boolean> lVar, v3.a<? extends Object> aVar) {
        Object d0Var;
        Object l5;
        Object l6;
        Object l7;
        try {
            d0Var = aVar.invoke();
        } catch (Throwable th) {
            d0Var = new d0(th, false, 2, null);
        }
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (d0Var == l5) {
            l7 = kotlin.coroutines.intrinsics.d.l();
            return l7;
        }
        Object R0 = p0Var.R0(d0Var);
        if (R0 == u2.f20652b) {
            l6 = kotlin.coroutines.intrinsics.d.l();
            return l6;
        }
        if (R0 instanceof d0) {
            d0 d0Var2 = (d0) R0;
            if (!lVar.invoke(d0Var2.f19951a).booleanValue()) {
                if (d0Var instanceof d0) {
                    throw ((d0) d0Var).f19951a;
                }
                return d0Var;
            }
            throw d0Var2.f19951a;
        }
        return u2.h(R0);
    }
}
