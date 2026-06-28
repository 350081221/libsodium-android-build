package androidx.activity.compose;

import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.r2;

@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ReportDrawnComposition$observeReporter$1 extends n0 implements v3.a<r2> {
    final /* synthetic */ v3.a<Boolean> $predicate;
    final /* synthetic */ k1.a $reporterPassed;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportDrawnComposition$observeReporter$1(k1.a aVar, v3.a<Boolean> aVar2) {
        super(0);
        this.$reporterPassed = aVar;
        this.$predicate = aVar2;
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ r2 invoke() {
        invoke2();
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$reporterPassed.element = this.$predicate.invoke().booleanValue();
    }
}
