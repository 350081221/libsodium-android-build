package kotlinx.coroutines;

@kotlin.i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/p1;", "Lkotlinx/coroutines/s2;", "", "cause", "Lkotlin/r2;", "x", "Lkotlinx/coroutines/n1;", "e", "Lkotlinx/coroutines/n1;", "handle", "<init>", "(Lkotlinx/coroutines/n1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class p1 extends s2 {

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private final n1 f20436e;

    public p1(@p4.l n1 n1Var) {
        this.f20436e = n1Var;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ kotlin.r2 invoke(Throwable th) {
        x(th);
        return kotlin.r2.f19517a;
    }

    @Override // kotlinx.coroutines.f0
    public void x(@p4.m Throwable th) {
        this.f20436e.dispose();
    }
}
