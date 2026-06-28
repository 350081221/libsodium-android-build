package kotlinx.coroutines.flow.internal;

import kotlin.i0;
import kotlinx.coroutines.internal.p0;

@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/flow/internal/o;", "T", "Lkotlinx/coroutines/internal/p0;", "", "cause", "", "h0", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "Lkotlin/coroutines/d;", "uCont", "<init>", "(Lkotlin/coroutines/g;Lkotlin/coroutines/d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
final class o<T> extends p0<T> {
    public o(@p4.l kotlin.coroutines.g gVar, @p4.l kotlin.coroutines.d<? super T> dVar) {
        super(gVar, dVar);
    }

    @Override // kotlinx.coroutines.t2
    public boolean h0(@p4.l Throwable th) {
        if (th instanceof l) {
            return true;
        }
        return c0(th);
    }
}
