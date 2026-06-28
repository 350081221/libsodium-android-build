package kotlinx.coroutines;

import com.umeng.analytics.pro.bi;

@kotlin.i0(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\u00030\u0001H\u0080Hø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006\u001a\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0000\u001a\u0018\u0010\u000e\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\r\u001a\u00020\fH\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"T", "Lkotlin/Function1;", "Lkotlinx/coroutines/p;", "Lkotlin/r2;", "block", "c", "(Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/q;", "e", "Lkotlin/coroutines/d;", "delegate", "b", "Lkotlinx/coroutines/n1;", "handle", bi.ay, "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nCancellableContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n*L\n1#1,386:1\n1#2:387\n19#3:388\n*S KotlinDebug\n*F\n+ 1 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n380#1:388\n*E\n"})
/* loaded from: classes4.dex */
public final class s {
    @g2
    public static final void a(@p4.l p<?> pVar, @p4.l n1 n1Var) {
        pVar.g(new o1(n1Var));
    }

    @p4.l
    public static final <T> q<T> b(@p4.l kotlin.coroutines.d<? super T> dVar) {
        if (!(dVar instanceof kotlinx.coroutines.internal.l)) {
            return new q<>(dVar, 1);
        }
        q<T> p5 = ((kotlinx.coroutines.internal.l) dVar).p();
        if (p5 != null) {
            if (!p5.S()) {
                p5 = null;
            }
            if (p5 != null) {
                return p5;
            }
        }
        return new q<>(dVar, 2);
    }

    @p4.m
    public static final <T> Object c(@p4.l v3.l<? super p<? super T>, kotlin.r2> lVar, @p4.l kotlin.coroutines.d<? super T> dVar) {
        kotlin.coroutines.d e5;
        Object l5;
        e5 = kotlin.coroutines.intrinsics.c.e(dVar);
        q qVar = new q(e5, 1);
        qVar.B();
        lVar.invoke(qVar);
        Object E = qVar.E();
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (E == l5) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return E;
    }

    private static final <T> Object d(v3.l<? super p<? super T>, kotlin.r2> lVar, kotlin.coroutines.d<? super T> dVar) {
        kotlin.coroutines.d e5;
        Object l5;
        kotlin.jvm.internal.i0.e(0);
        e5 = kotlin.coroutines.intrinsics.c.e(dVar);
        q qVar = new q(e5, 1);
        qVar.B();
        lVar.invoke(qVar);
        Object E = qVar.E();
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (E == l5) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        kotlin.jvm.internal.i0.e(1);
        return E;
    }

    @p4.m
    public static final <T> Object e(@p4.l v3.l<? super q<? super T>, kotlin.r2> lVar, @p4.l kotlin.coroutines.d<? super T> dVar) {
        kotlin.coroutines.d e5;
        Object l5;
        e5 = kotlin.coroutines.intrinsics.c.e(dVar);
        q b5 = b(e5);
        try {
            lVar.invoke(b5);
            Object E = b5.E();
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (E == l5) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return E;
        } catch (Throwable th) {
            b5.R();
            throw th;
        }
    }

    private static final <T> Object f(v3.l<? super q<? super T>, kotlin.r2> lVar, kotlin.coroutines.d<? super T> dVar) {
        kotlin.coroutines.d e5;
        Object l5;
        kotlin.jvm.internal.i0.e(0);
        e5 = kotlin.coroutines.intrinsics.c.e(dVar);
        q b5 = b(e5);
        try {
            lVar.invoke(b5);
            Object E = b5.E();
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (E == l5) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            kotlin.jvm.internal.i0.e(1);
            return E;
        } catch (Throwable th) {
            b5.R();
            throw th;
        }
    }
}
