package kotlinx.coroutines.flow.internal;

import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.channels.h0;
import kotlinx.coroutines.g2;

@i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/flow/internal/y;", "T", "Lkotlinx/coroutines/flow/j;", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/h0;", bi.ay, "Lkotlinx/coroutines/channels/h0;", "channel", "<init>", "(Lkotlinx/coroutines/channels/h0;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@g2
/* loaded from: classes4.dex */
public final class y<T> implements kotlinx.coroutines.flow.j<T> {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final h0<T> f20148a;

    /* JADX WARN: Multi-variable type inference failed */
    public y(@p4.l h0<? super T> h0Var) {
        this.f20148a = h0Var;
    }

    @Override // kotlinx.coroutines.flow.j
    @p4.m
    public Object emit(T t5, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object F = this.f20148a.F(t5, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return F == l5 ? F : r2.f19517a;
    }
}
