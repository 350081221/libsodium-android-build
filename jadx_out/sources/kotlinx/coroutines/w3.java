package kotlinx.coroutines;

@kotlin.i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/w3;", "Lkotlinx/coroutines/n0;", "", "parallelism", "limitedParallelism", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "", "isDispatchNeeded", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/r2;", "dispatch", "", "toString", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class w3 extends n0 {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    public static final w3 f20682a = new w3();

    private w3() {
    }

    @Override // kotlinx.coroutines.n0
    public void dispatch(@p4.l kotlin.coroutines.g gVar, @p4.l Runnable runnable) {
        a4 a4Var = (a4) gVar.get(a4.f19847b);
        if (a4Var != null) {
            a4Var.f19848a = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // kotlinx.coroutines.n0
    public boolean isDispatchNeeded(@p4.l kotlin.coroutines.g gVar) {
        return false;
    }

    @Override // kotlinx.coroutines.n0
    @p4.l
    @a2
    public n0 limitedParallelism(int i5) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // kotlinx.coroutines.n0
    @p4.l
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
