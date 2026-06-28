package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.p0;
import kotlinx.coroutines.w1;
import kotlinx.coroutines.x0;

@kotlin.i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0014¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/channels/a;", "E", "Lkotlinx/coroutines/channels/m;", "Lkotlinx/coroutines/channels/c;", "", "cause", "Lkotlin/r2;", "a1", "exception", "", "F0", "Lkotlin/coroutines/g;", "parentContext", "Lkotlinx/coroutines/channels/l;", "channel", "active", "<init>", "(Lkotlin/coroutines/g;Lkotlinx/coroutines/channels/l;Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
class a<E> extends m<E> implements c<E> {
    public a(@p4.l kotlin.coroutines.g gVar, @p4.l l<E> lVar, boolean z4) {
        super(gVar, lVar, false, z4);
        H0((l2) gVar.get(l2.U));
    }

    @Override // kotlinx.coroutines.t2
    protected boolean F0(@p4.l Throwable th) {
        p0.b(getContext(), th);
        return true;
    }

    @Override // kotlinx.coroutines.t2
    protected void a1(@p4.m Throwable th) {
        l<E> x12 = x1();
        CancellationException cancellationException = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException = (CancellationException) th;
            }
            if (cancellationException == null) {
                cancellationException = w1.a(x0.a(this) + " was cancelled", th);
            }
        }
        x12.cancel(cancellationException);
    }
}
