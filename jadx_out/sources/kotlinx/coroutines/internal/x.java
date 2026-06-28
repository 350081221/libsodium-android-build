package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.bi;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\fJ-\u0010\u0007\u001a\u00020\u0005\"\u000e\b\u0000\u0010\u0003\u0018\u0001*\u00060\u0001j\u0002`\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\bJ\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\n\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002H\u0014J\u000f\u0010\u000b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/internal/x;", "Lkotlinx/coroutines/internal/z;", "Lkotlinx/coroutines/internal/Node;", "T", "Lkotlin/Function1;", "Lkotlin/r2;", "block", "x", "", bi.aG, "r", "A", "()V", "", "y", "()Z", "isEmpty", "o", "isRemoved", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public class x extends z {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlinx.coroutines.internal.z] */
    public final void A() {
        Object l5 = l();
        kotlin.jvm.internal.l0.n(l5, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        x xVar = this;
        x xVar2 = (z) l5;
        while (!kotlin.jvm.internal.l0.g(xVar2, this)) {
            z m5 = xVar2.m();
            xVar2.w(xVar, m5);
            xVar = xVar2;
            xVar2 = m5;
        }
        Object l6 = l();
        kotlin.jvm.internal.l0.n(l6, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        w(xVar, (z) l6);
    }

    @Override // kotlinx.coroutines.internal.z
    public boolean o() {
        return false;
    }

    @Override // kotlinx.coroutines.internal.z
    @p4.m
    protected z r() {
        return null;
    }

    @Override // kotlinx.coroutines.internal.z
    public /* bridge */ /* synthetic */ boolean s() {
        return ((Boolean) z()).booleanValue();
    }

    public final /* synthetic */ <T extends z> void x(v3.l<? super T, r2> lVar) {
        Object l5 = l();
        kotlin.jvm.internal.l0.n(l5, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        for (z zVar = (z) l5; !kotlin.jvm.internal.l0.g(zVar, this); zVar = zVar.m()) {
            kotlin.jvm.internal.l0.y(3, "T");
            if (zVar instanceof z) {
                lVar.invoke(zVar);
            }
        }
    }

    public final boolean y() {
        return l() == this;
    }

    @p4.l
    public final Void z() {
        throw new IllegalStateException("head cannot be removed".toString());
    }
}
