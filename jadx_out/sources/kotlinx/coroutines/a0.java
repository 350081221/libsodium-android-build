package kotlinx.coroutines;

import com.umeng.analytics.pro.bi;

@kotlin.i0(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a.\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u001a!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"T", "Lkotlinx/coroutines/y;", "Lkotlin/d1;", "result", "", "d", "(Lkotlinx/coroutines/y;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/l2;", "parent", "b", t0.b.f22420d, bi.ay, "(Ljava/lang/Object;)Lkotlinx/coroutines/y;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nCompletableDeferred.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompletableDeferred.kt\nkotlinx/coroutines/CompletableDeferredKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1#2:95\n*E\n"})
/* loaded from: classes4.dex */
public final class a0 {
    @p4.l
    public static final <T> y<T> a(T t5) {
        z zVar = new z(null);
        zVar.M(t5);
        return zVar;
    }

    @p4.l
    public static final <T> y<T> b(@p4.m l2 l2Var) {
        return new z(l2Var);
    }

    public static /* synthetic */ y c(l2 l2Var, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            l2Var = null;
        }
        return b(l2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean d(@p4.l y<T> yVar, @p4.l Object obj) {
        Throwable m6447exceptionOrNullimpl = kotlin.d1.m6447exceptionOrNullimpl(obj);
        return m6447exceptionOrNullimpl == null ? yVar.M(obj) : yVar.c(m6447exceptionOrNullimpl);
    }
}
