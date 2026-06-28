package kotlinx.coroutines;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/j3;", "Lkotlinx/coroutines/a;", "Lkotlin/r2;", "", "exception", "", "F0", "Lkotlin/coroutines/g;", "parentContext", "active", "<init>", "(Lkotlin/coroutines/g;Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public class j3 extends a<kotlin.r2> {
    public j3(@p4.l kotlin.coroutines.g gVar, boolean z4) {
        super(gVar, true, z4);
    }

    @Override // kotlinx.coroutines.t2
    protected boolean F0(@p4.l Throwable th) {
        p0.b(getContext(), th);
        return true;
    }
}
