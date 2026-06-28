package androidx.compose.material3;

import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "dateInMillis", "Lkotlin/r2;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class DateRangePickerKt$VerticalMonthsList$1$onDateSelectionChange$1$1 extends kotlin.jvm.internal.n0 implements v3.l<Long, r2> {
    final /* synthetic */ v3.p<Long, Long, r2> $onDatesSelectionChange;
    final /* synthetic */ Long $selectedEndDateMillis;
    final /* synthetic */ Long $selectedStartDateMillis;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DateRangePickerKt$VerticalMonthsList$1$onDateSelectionChange$1$1(Long l5, Long l6, v3.p<? super Long, ? super Long, r2> pVar) {
        super(1);
        this.$selectedStartDateMillis = l5;
        this.$selectedEndDateMillis = l6;
        this.$onDatesSelectionChange = pVar;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Long l5) {
        invoke(l5.longValue());
        return r2.f19517a;
    }

    public final void invoke(long j5) {
        DateRangePickerKt.updateDateSelection(j5, this.$selectedStartDateMillis, this.$selectedEndDateMillis, this.$onDatesSelectionChange);
    }
}
