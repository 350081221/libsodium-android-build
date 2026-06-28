package androidx.compose.material3;

import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "startDateMillis", "Lkotlin/r2;", "invoke", "(Ljava/lang/Long;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class DateRangeInputKt$DateRangeInputContent$2$1$1 extends kotlin.jvm.internal.n0 implements v3.l<Long, r2> {
    final /* synthetic */ v3.p<Long, Long, r2> $onDatesSelectionChange;
    final /* synthetic */ Long $selectedEndDateMillis;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DateRangeInputKt$DateRangeInputContent$2$1$1(v3.p<? super Long, ? super Long, r2> pVar, Long l5) {
        super(1);
        this.$onDatesSelectionChange = pVar;
        this.$selectedEndDateMillis = l5;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Long l5) {
        invoke2(l5);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.m Long l5) {
        this.$onDatesSelectionChange.invoke(l5, this.$selectedEndDateMillis);
    }
}
