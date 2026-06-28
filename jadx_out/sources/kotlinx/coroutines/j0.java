package kotlinx.coroutines;

import com.umeng.analytics.pro.bi;
import kotlin.d1;

@kotlin.i0(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\n\u001a\u0004\u0018\u00010\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012%\b\u0002\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a0\u0010\u000e\u001a\u0004\u0018\u00010\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a6\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"T", "Lkotlin/d1;", "Lkotlin/Function1;", "", "Lkotlin/v0;", "name", "cause", "Lkotlin/r2;", "onCancellation", "", "c", "(Ljava/lang/Object;Lv3/l;)Ljava/lang/Object;", "Lkotlinx/coroutines/p;", "caller", "b", "(Ljava/lang/Object;Lkotlinx/coroutines/p;)Ljava/lang/Object;", "state", "Lkotlin/coroutines/d;", "uCont", bi.ay, "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nCompletionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompletionState.kt\nkotlinx/coroutines/CompletionStateKt\n+ 2 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,67:1\n61#2,2:68\n61#2,2:70\n*S KotlinDebug\n*F\n+ 1 CompletionState.kt\nkotlinx/coroutines/CompletionStateKt\n*L\n21#1:68,2\n27#1:70,2\n*E\n"})
/* loaded from: classes4.dex */
public final class j0 {
    @p4.l
    public static final <T> Object a(@p4.m Object obj, @p4.l kotlin.coroutines.d<? super T> dVar) {
        if (obj instanceof d0) {
            d1.a aVar = kotlin.d1.Companion;
            return kotlin.d1.m6444constructorimpl(kotlin.e1.a(((d0) obj).f19951a));
        }
        d1.a aVar2 = kotlin.d1.Companion;
        return kotlin.d1.m6444constructorimpl(obj);
    }

    @p4.m
    public static final <T> Object b(@p4.l Object obj, @p4.l p<?> pVar) {
        Throwable m6447exceptionOrNullimpl = kotlin.d1.m6447exceptionOrNullimpl(obj);
        if (m6447exceptionOrNullimpl != null) {
            return new d0(m6447exceptionOrNullimpl, false, 2, null);
        }
        return obj;
    }

    @p4.m
    public static final <T> Object c(@p4.l Object obj, @p4.m v3.l<? super Throwable, kotlin.r2> lVar) {
        Throwable m6447exceptionOrNullimpl = kotlin.d1.m6447exceptionOrNullimpl(obj);
        if (m6447exceptionOrNullimpl == null) {
            if (lVar != null) {
                return new e0(obj, lVar);
            }
            return obj;
        }
        return new d0(m6447exceptionOrNullimpl, false, 2, null);
    }

    public static /* synthetic */ Object d(Object obj, v3.l lVar, int i5, Object obj2) {
        if ((i5 & 1) != 0) {
            lVar = null;
        }
        return c(obj, lVar);
    }
}
