package kotlinx.coroutines.flow.internal;

import kotlin.i0;
import kotlin.r2;

@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016J!\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/flow/internal/i;", "T", "Lkotlinx/coroutines/flow/internal/h;", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "", "capacity", "Lkotlinx/coroutines/channels/i;", "onBufferOverflow", "Lkotlinx/coroutines/flow/internal/e;", "i", "Lkotlinx/coroutines/flow/i;", "j", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "r", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "flow", "<init>", "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class i<T> extends h<T, T> {
    public /* synthetic */ i(kotlinx.coroutines.flow.i iVar, kotlin.coroutines.g gVar, int i5, kotlinx.coroutines.channels.i iVar2, int i6, kotlin.jvm.internal.w wVar) {
        this(iVar, (i6 & 2) != 0 ? kotlin.coroutines.i.INSTANCE : gVar, (i6 & 4) != 0 ? -3 : i5, (i6 & 8) != 0 ? kotlinx.coroutines.channels.i.SUSPEND : iVar2);
    }

    @Override // kotlinx.coroutines.flow.internal.e
    @p4.l
    protected e<T> i(@p4.l kotlin.coroutines.g gVar, int i5, @p4.l kotlinx.coroutines.channels.i iVar) {
        return new i(this.f20119d, gVar, i5, iVar);
    }

    @Override // kotlinx.coroutines.flow.internal.e
    @p4.l
    public kotlinx.coroutines.flow.i<T> j() {
        return (kotlinx.coroutines.flow.i<T>) this.f20119d;
    }

    @Override // kotlinx.coroutines.flow.internal.h
    @p4.m
    protected Object r(@p4.l kotlinx.coroutines.flow.j<? super T> jVar, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object collect = this.f20119d.collect(jVar, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return collect == l5 ? collect : r2.f19517a;
    }

    public i(@p4.l kotlinx.coroutines.flow.i<? extends T> iVar, @p4.l kotlin.coroutines.g gVar, int i5, @p4.l kotlinx.coroutines.channels.i iVar2) {
        super(iVar, gVar, i5, iVar2);
    }
}
