package androidx.compose.material3;

import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "startDateMillis", "endDateMillis", "Lkotlin/r2;", "invoke", "(Ljava/lang/Long;Ljava/lang/Long;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class DateRangePickerKt$DateRangePicker$5$1$1 extends kotlin.jvm.internal.n0 implements v3.p<Long, Long, r2> {
    final /* synthetic */ DateRangePickerState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateRangePickerKt$DateRangePicker$5$1$1(DateRangePickerState dateRangePickerState) {
        super(2);
        this.$state = dateRangePickerState;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Long l5, Long l6) {
        invoke2(l5, l6);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.m Long l5, @p4.m Long l6) {
        try {
            this.$state.setSelection(l5, l6);
        } catch (IllegalArgumentException unused) {
        }
    }
}
