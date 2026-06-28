package kotlinx.coroutines.channels;

import kotlin.r2;
import kotlinx.coroutines.channels.h0;
import kotlinx.coroutines.p0;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014R\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/channels/d0;", "E", "Lkotlinx/coroutines/channels/m;", "Lkotlinx/coroutines/channels/e0;", "Lkotlin/r2;", t0.b.f22420d, "y1", "(Lkotlin/r2;)V", "", "cause", "", "handled", "u1", "isActive", "()Z", "Lkotlin/coroutines/g;", "parentContext", "Lkotlinx/coroutines/channels/l;", "channel", "<init>", "(Lkotlin/coroutines/g;Lkotlinx/coroutines/channels/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class d0<E> extends m<E> implements e0<E> {
    public d0(@p4.l kotlin.coroutines.g gVar, @p4.l l<E> lVar) {
        super(gVar, lVar, true, true);
    }

    @Override // kotlinx.coroutines.channels.e0
    public /* bridge */ /* synthetic */ h0 getChannel() {
        return getChannel();
    }

    @Override // kotlinx.coroutines.a, kotlinx.coroutines.t2, kotlinx.coroutines.l2
    public boolean isActive() {
        return super.isActive();
    }

    @Override // kotlinx.coroutines.a
    protected void u1(@p4.l Throwable th, boolean z4) {
        if (!x1().E(th) && !z4) {
            p0.b(getContext(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.a
    /* renamed from: y1, reason: merged with bridge method [inline-methods] */
    public void v1(@p4.l r2 r2Var) {
        h0.a.a(x1(), null, 1, null);
    }
}
