package kotlinx.coroutines;

import kotlin.d1;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/f3;", "Lkotlinx/coroutines/s2;", "", "cause", "Lkotlin/r2;", "x", "Lkotlin/coroutines/d;", "e", "Lkotlin/coroutines/d;", "continuation", "<init>", "(Lkotlin/coroutines/d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class f3 extends s2 {

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private final kotlin.coroutines.d<kotlin.r2> f20025e;

    /* JADX WARN: Multi-variable type inference failed */
    public f3(@p4.l kotlin.coroutines.d<? super kotlin.r2> dVar) {
        this.f20025e = dVar;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ kotlin.r2 invoke(Throwable th) {
        x(th);
        return kotlin.r2.f19517a;
    }

    @Override // kotlinx.coroutines.f0
    public void x(@p4.m Throwable th) {
        kotlin.coroutines.d<kotlin.r2> dVar = this.f20025e;
        d1.a aVar = kotlin.d1.Companion;
        dVar.resumeWith(kotlin.d1.m6444constructorimpl(kotlin.r2.f19517a));
    }
}
