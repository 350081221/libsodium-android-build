package kotlinx.coroutines.channels;

import kotlin.r2;

@kotlin.i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BO\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012-\u0010\u0013\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000f¢\u0006\u0002\b\u0012ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0014R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/channels/b0;", "E", "Lkotlinx/coroutines/channels/g;", "Lkotlinx/coroutines/channels/g0;", "n", "Lkotlin/r2;", "c1", "Lkotlin/coroutines/d;", "e", "Lkotlin/coroutines/d;", "continuation", "Lkotlin/coroutines/g;", "parentContext", "Lkotlinx/coroutines/channels/d;", "channel", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/e0;", "", "Lkotlin/u;", "block", "<init>", "(Lkotlin/coroutines/g;Lkotlinx/coroutines/channels/d;Lv3/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
final class b0<E> extends g<E> {

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private final kotlin.coroutines.d<r2> f19869e;

    public b0(@p4.l kotlin.coroutines.g gVar, @p4.l d<E> dVar, @p4.l v3.p<? super e0<? super E>, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar) {
        super(gVar, dVar, false);
        kotlin.coroutines.d<r2> c5;
        c5 = kotlin.coroutines.intrinsics.c.c(pVar, this, this);
        this.f19869e = c5;
    }

    @Override // kotlinx.coroutines.t2
    protected void c1() {
        h4.a.c(this.f19869e, this);
    }

    @Override // kotlinx.coroutines.channels.g, kotlinx.coroutines.channels.d
    @p4.l
    public g0<E> n() {
        g0<E> n5 = x1().n();
        start();
        return n5;
    }
}
