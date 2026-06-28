package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.bi;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016J)\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/flow/l0;", "Lkotlinx/coroutines/flow/internal/d;", "Lkotlinx/coroutines/flow/j0;", "flow", "", "c", "", "Lkotlin/coroutines/d;", "Lkotlin/r2;", "d", "(Lkotlinx/coroutines/flow/j0;)[Lkotlin/coroutines/d;", "", bi.ay, "J", "index", "b", "Lkotlin/coroutines/d;", "cont", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowSlot\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,731:1\n1#2:732\n*E\n"})
/* loaded from: classes4.dex */
public final class l0 extends kotlinx.coroutines.flow.internal.d<j0<?>> {

    /* renamed from: a, reason: collision with root package name */
    @u3.e
    public long f20178a = -1;

    /* renamed from: b, reason: collision with root package name */
    @p4.m
    @u3.e
    public kotlin.coroutines.d<? super r2> f20179b;

    @Override // kotlinx.coroutines.flow.internal.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(@p4.l j0<?> j0Var) {
        if (this.f20178a >= 0) {
            return false;
        }
        this.f20178a = j0Var.b0();
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @p4.l
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public kotlin.coroutines.d<r2>[] b(@p4.l j0<?> j0Var) {
        long j5 = this.f20178a;
        this.f20178a = -1L;
        this.f20179b = null;
        return j0Var.a0(j5);
    }
}
