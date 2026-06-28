package kotlinx.coroutines.channels;

import com.umeng.analytics.pro.bi;
import kotlin.r2;
import kotlinx.coroutines.c3;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t2;
import kotlinx.coroutines.u0;

@kotlin.i0(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u009e\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062-\b\u0002\u0010\u000f\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\bj\u0004\u0018\u0001`\u000e2-\u0010\u0015\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0010¢\u0006\u0002\b\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"E", "Lkotlinx/coroutines/s0;", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "", "capacity", "Lkotlinx/coroutines/u0;", "start", "Lkotlin/Function1;", "", "Lkotlin/v0;", "name", "cause", "Lkotlin/r2;", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/c;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "Lkotlinx/coroutines/channels/h0;", bi.ay, "(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;ILkotlinx/coroutines/u0;Lv3/l;Lv3/p;)Lkotlinx/coroutines/channels/h0;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class b {
    @p4.l
    @c3
    public static final <E> h0<E> a(@p4.l s0 s0Var, @p4.l kotlin.coroutines.g gVar, int i5, @p4.l u0 u0Var, @p4.m v3.l<? super Throwable, r2> lVar, @p4.l v3.p<? super c<E>, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar) {
        a aVar;
        kotlin.coroutines.g e5 = m0.e(s0Var, gVar);
        l d5 = o.d(i5, null, null, 6, null);
        if (u0Var.isLazy()) {
            aVar = new a0(e5, d5, pVar);
        } else {
            aVar = new a(e5, d5, true);
        }
        if (lVar != null) {
            ((t2) aVar).t0(lVar);
        }
        ((kotlinx.coroutines.a) aVar).w1(u0Var, aVar, pVar);
        return (h0<E>) aVar;
    }

    public static /* synthetic */ h0 b(s0 s0Var, kotlin.coroutines.g gVar, int i5, u0 u0Var, v3.l lVar, v3.p pVar, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            gVar = kotlin.coroutines.i.INSTANCE;
        }
        kotlin.coroutines.g gVar2 = gVar;
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        int i7 = i5;
        if ((i6 & 4) != 0) {
            u0Var = u0.DEFAULT;
        }
        u0 u0Var2 = u0Var;
        if ((i6 & 8) != 0) {
            lVar = null;
        }
        return a(s0Var, gVar2, i7, u0Var2, lVar, pVar);
    }
}
