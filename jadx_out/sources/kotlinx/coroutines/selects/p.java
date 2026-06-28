package kotlinx.coroutines.selects;

import kotlin.a1;
import kotlin.d1;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.n0;

@i0(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\u001a:\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001f\b\u0004\u0010\u0005\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0081Hø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a:\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001f\b\u0004\u0010\u0005\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0081Hø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a'\u0010\f\u001a\u00020\u0003\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0018\u0010\u0010\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"R", "Lkotlin/Function1;", "Lkotlinx/coroutines/selects/c;", "Lkotlin/r2;", "Lkotlin/u;", "builder", "e", "(Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", socket.g.f22386a, "T", "Lkotlinx/coroutines/p;", "result", "c", "(Lkotlinx/coroutines/p;Ljava/lang/Object;)V", "", "exception", "d", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class p {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void c(kotlinx.coroutines.p<? super T> pVar, T t5) {
        n0 n0Var = (n0) pVar.getContext().get(n0.Key);
        if (n0Var != null) {
            pVar.z(n0Var, t5);
        } else {
            d1.a aVar = d1.Companion;
            pVar.resumeWith(d1.m6444constructorimpl(t5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(kotlinx.coroutines.p<?> pVar, Throwable th) {
        n0 n0Var = (n0) pVar.getContext().get(n0.Key);
        if (n0Var != null) {
            pVar.k(n0Var, th);
        } else {
            d1.a aVar = d1.Companion;
            pVar.resumeWith(d1.m6444constructorimpl(e1.a(th)));
        }
    }

    @a1
    @p4.m
    public static final <R> Object e(@p4.l v3.l<? super c<? super R>, r2> lVar, @p4.l kotlin.coroutines.d<? super R> dVar) {
        Object l5;
        d dVar2 = new d(dVar);
        try {
            lVar.invoke(dVar2);
        } catch (Throwable th) {
            dVar2.O(th);
        }
        Object N = dVar2.N();
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (N == l5) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return N;
    }

    @a1
    private static final <R> Object f(v3.l<? super c<? super R>, r2> lVar, kotlin.coroutines.d<? super R> dVar) {
        Object l5;
        kotlin.jvm.internal.i0.e(0);
        d dVar2 = new d(dVar);
        try {
            lVar.invoke(dVar2);
        } catch (Throwable th) {
            dVar2.O(th);
        }
        Object N = dVar2.N();
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (N == l5) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        kotlin.jvm.internal.i0.e(1);
        return N;
    }

    @a1
    @p4.m
    public static final <R> Object g(@p4.l v3.l<? super c<? super R>, r2> lVar, @p4.l kotlin.coroutines.d<? super R> dVar) {
        Object l5;
        s sVar = new s(dVar);
        try {
            lVar.invoke(sVar);
        } catch (Throwable th) {
            sVar.P(th);
        }
        Object Q = sVar.Q();
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (Q == l5) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return Q;
    }

    @a1
    private static final <R> Object h(v3.l<? super c<? super R>, r2> lVar, kotlin.coroutines.d<? super R> dVar) {
        Object l5;
        kotlin.jvm.internal.i0.e(0);
        s sVar = new s(dVar);
        try {
            lVar.invoke(sVar);
        } catch (Throwable th) {
            sVar.P(th);
        }
        Object Q = sVar.Q();
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (Q == l5) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        kotlin.jvm.internal.i0.e(1);
        return Q;
    }
}
