package kotlinx.coroutines;

import com.umeng.analytics.pro.bi;

@kotlin.i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/o1;", "Lkotlinx/coroutines/n;", "", "cause", "Lkotlin/r2;", "j", "", "toString", "Lkotlinx/coroutines/n1;", bi.ay, "Lkotlinx/coroutines/n1;", "handle", "<init>", "(Lkotlinx/coroutines/n1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
final class o1 extends n {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final n1 f20433a;

    public o1(@p4.l n1 n1Var) {
        this.f20433a = n1Var;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ kotlin.r2 invoke(Throwable th) {
        j(th);
        return kotlin.r2.f19517a;
    }

    @Override // kotlinx.coroutines.o
    public void j(@p4.m Throwable th) {
        this.f20433a.dispose();
    }

    @p4.l
    public String toString() {
        return "DisposeOnCancel[" + this.f20433a + ']';
    }
}
