package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.bi;
import kotlinx.coroutines.flow.internal.r;
import kotlinx.coroutines.l2;

@kotlin.i0(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a0\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\n\u001a\u00020\t\u001a\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"T", "Lkotlinx/coroutines/flow/i;", "", "capacity", "Lkotlinx/coroutines/channels/i;", "onBufferOverflow", "b", bi.ay, socket.g.f22386a, "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, bi.aJ, "e", "Lkotlin/r2;", "f", "(Lkotlin/coroutines/g;)V", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes4.dex */
public final /* synthetic */ class p {
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.4.0, binary compatibility with earlier versions")
    public static final /* synthetic */ i a(i iVar, int i5) {
        i d5;
        d5 = d(iVar, i5, null, 2, null);
        return d5;
    }

    @p4.l
    public static final <T> i<T> b(@p4.l i<? extends T> iVar, int i5, @p4.l kotlinx.coroutines.channels.i iVar2) {
        boolean z4;
        int i6;
        kotlinx.coroutines.channels.i iVar3;
        boolean z5 = true;
        if (i5 < 0 && i5 != -2 && i5 != -1) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4) {
            if (i5 == -1 && iVar2 != kotlinx.coroutines.channels.i.SUSPEND) {
                z5 = false;
            }
            if (z5) {
                if (i5 == -1) {
                    iVar3 = kotlinx.coroutines.channels.i.DROP_OLDEST;
                    i6 = 0;
                } else {
                    i6 = i5;
                    iVar3 = iVar2;
                }
                if (iVar instanceof kotlinx.coroutines.flow.internal.r) {
                    return r.a.a((kotlinx.coroutines.flow.internal.r) iVar, null, i6, iVar3, 1, null);
                }
                return new kotlinx.coroutines.flow.internal.i(iVar, null, i6, iVar3, 2, null);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i5).toString());
    }

    public static /* synthetic */ i c(i iVar, int i5, int i6, Object obj) {
        i a5;
        if ((i6 & 1) != 0) {
            i5 = -2;
        }
        a5 = a(iVar, i5);
        return a5;
    }

    public static /* synthetic */ i d(i iVar, int i5, kotlinx.coroutines.channels.i iVar2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = -2;
        }
        if ((i6 & 2) != 0) {
            iVar2 = kotlinx.coroutines.channels.i.SUSPEND;
        }
        return k.o(iVar, i5, iVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @p4.l
    public static final <T> i<T> e(@p4.l i<? extends T> iVar) {
        if (!(iVar instanceof c)) {
            return new d(iVar);
        }
        return iVar;
    }

    private static final void f(kotlin.coroutines.g gVar) {
        boolean z4;
        if (gVar.get(l2.U) == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + gVar).toString());
    }

    @p4.l
    public static final <T> i<T> g(@p4.l i<? extends T> iVar) {
        i<T> d5;
        d5 = d(iVar, -1, null, 2, null);
        return d5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @p4.l
    public static final <T> i<T> h(@p4.l i<? extends T> iVar, @p4.l kotlin.coroutines.g gVar) {
        f(gVar);
        if (!kotlin.jvm.internal.l0.g(gVar, kotlin.coroutines.i.INSTANCE)) {
            if (iVar instanceof kotlinx.coroutines.flow.internal.r) {
                return r.a.a((kotlinx.coroutines.flow.internal.r) iVar, gVar, 0, null, 6, null);
            }
            return new kotlinx.coroutines.flow.internal.i(iVar, gVar, 0, null, 12, null);
        }
        return iVar;
    }
}
