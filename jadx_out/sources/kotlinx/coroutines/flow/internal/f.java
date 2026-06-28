package kotlinx.coroutines.flow.internal;

import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.u1;
import kotlinx.coroutines.internal.z0;

@i0(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000\u001a&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a]\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u00012\b\b\u0002\u0010\f\u001a\u00020\u000b2\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\rH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"T", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/internal/e;", "b", "Lkotlinx/coroutines/flow/j;", "Lkotlin/coroutines/g;", "emitContext", "e", "V", "newContext", t0.b.f22420d, "", "countOrElement", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "block", "c", "(Lkotlin/coroutines/g;Ljava/lang/Object;Ljava/lang/Object;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nChannelFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelFlow.kt\nkotlinx/coroutines/flow/internal/ChannelFlowKt\n+ 2 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,245:1\n95#2,5:246\n*S KotlinDebug\n*F\n+ 1 ChannelFlow.kt\nkotlinx/coroutines/flow/internal/ChannelFlowKt\n*L\n226#1:246,5\n*E\n"})
/* loaded from: classes4.dex */
public final class f {
    public static final /* synthetic */ kotlinx.coroutines.flow.j a(kotlinx.coroutines.flow.j jVar, kotlin.coroutines.g gVar) {
        return e(jVar, gVar);
    }

    @p4.l
    public static final <T> e<T> b(@p4.l kotlinx.coroutines.flow.i<? extends T> iVar) {
        e<T> eVar = iVar instanceof e ? (e) iVar : null;
        return eVar == null ? new i(iVar, null, 0, null, 14, null) : eVar;
    }

    @p4.m
    public static final <T, V> Object c(@p4.l kotlin.coroutines.g gVar, V v4, @p4.l Object obj, @p4.l v3.p<? super V, ? super kotlin.coroutines.d<? super T>, ? extends Object> pVar, @p4.l kotlin.coroutines.d<? super T> dVar) {
        Object l5;
        Object c5 = z0.c(gVar, obj);
        try {
            Object invoke = ((v3.p) u1.q(pVar, 2)).invoke(v4, new z(dVar, gVar));
            z0.a(gVar, c5);
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (invoke == l5) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return invoke;
        } catch (Throwable th) {
            z0.a(gVar, c5);
            throw th;
        }
    }

    public static /* synthetic */ Object d(kotlin.coroutines.g gVar, Object obj, Object obj2, v3.p pVar, kotlin.coroutines.d dVar, int i5, Object obj3) {
        if ((i5 & 4) != 0) {
            obj2 = z0.b(gVar);
        }
        return c(gVar, obj, obj2, pVar, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> kotlinx.coroutines.flow.j<T> e(kotlinx.coroutines.flow.j<? super T> jVar, kotlin.coroutines.g gVar) {
        boolean z4;
        if (jVar instanceof y) {
            z4 = true;
        } else {
            z4 = jVar instanceof t;
        }
        if (!z4) {
            return new b0(jVar, gVar);
        }
        return jVar;
    }
}
