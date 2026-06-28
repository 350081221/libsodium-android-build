package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.bi;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012-\u0010\u000e\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b¢\u0006\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R>\u0010\u000e\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b¢\u0006\u0002\b\u000b8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/flow/h0;", "T", "Lkotlinx/coroutines/flow/a;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "e", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", bi.ay, "Lv3/p;", "block", "<init>", "(Lv3/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class h0<T> extends a<T> {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final v3.p<j<? super T>, kotlin.coroutines.d<? super r2>, Object> f20101a;

    /* JADX WARN: Multi-variable type inference failed */
    public h0(@p4.l v3.p<? super j<? super T>, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar) {
        this.f20101a = pVar;
    }

    @Override // kotlinx.coroutines.flow.a
    @p4.m
    public Object e(@p4.l j<? super T> jVar, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object invoke = this.f20101a.invoke(jVar, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return invoke == l5 ? invoke : r2.f19517a;
    }
}
