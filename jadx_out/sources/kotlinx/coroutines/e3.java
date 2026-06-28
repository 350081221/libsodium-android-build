package kotlinx.coroutines;

import kotlin.d1;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/e3;", "T", "Lkotlinx/coroutines/s2;", "", "cause", "Lkotlin/r2;", "x", "Lkotlinx/coroutines/q;", "e", "Lkotlinx/coroutines/q;", "continuation", "<init>", "(Lkotlinx/coroutines/q;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/ResumeAwaitOnCompletion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1451:1\n1#2:1452\n*E\n"})
/* loaded from: classes4.dex */
public final class e3<T> extends s2 {

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private final q<T> f20023e;

    /* JADX WARN: Multi-variable type inference failed */
    public e3(@p4.l q<? super T> qVar) {
        this.f20023e = qVar;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ kotlin.r2 invoke(Throwable th) {
        x(th);
        return kotlin.r2.f19517a;
    }

    @Override // kotlinx.coroutines.f0
    public void x(@p4.m Throwable th) {
        Object E0 = y().E0();
        if (E0 instanceof d0) {
            q<T> qVar = this.f20023e;
            d1.a aVar = kotlin.d1.Companion;
            qVar.resumeWith(kotlin.d1.m6444constructorimpl(kotlin.e1.a(((d0) E0).f19951a)));
        } else {
            q<T> qVar2 = this.f20023e;
            d1.a aVar2 = kotlin.d1.Companion;
            qVar2.resumeWith(kotlin.d1.m6444constructorimpl(u2.h(E0)));
        }
    }
}
