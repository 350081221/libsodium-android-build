package kotlinx.coroutines;

@kotlin.i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/w;", "Lkotlinx/coroutines/n2;", "Lkotlinx/coroutines/v;", "", "cause", "Lkotlin/r2;", "x", "", "e", "Lkotlinx/coroutines/x;", "Lkotlinx/coroutines/x;", "childJob", "Lkotlinx/coroutines/l2;", "getParent", "()Lkotlinx/coroutines/l2;", "parent", "<init>", "(Lkotlinx/coroutines/x;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class w extends n2 implements v {

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    @u3.e
    public final x f20671e;

    public w(@p4.l x xVar) {
        this.f20671e = xVar;
    }

    @Override // kotlinx.coroutines.v
    public boolean e(@p4.l Throwable th) {
        return y().h0(th);
    }

    @Override // kotlinx.coroutines.v
    @p4.l
    public l2 getParent() {
        return y();
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ kotlin.r2 invoke(Throwable th) {
        x(th);
        return kotlin.r2.f19517a;
    }

    @Override // kotlinx.coroutines.f0
    public void x(@p4.m Throwable th) {
        this.f20671e.A(y());
    }
}
