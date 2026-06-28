package androidx.compose.material3;

import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "monthInMillis", "Lkotlin/r2;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class DatePickerKt$DatePicker$5$2$1 extends kotlin.jvm.internal.n0 implements v3.l<Long, r2> {
    final /* synthetic */ DatePickerState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$DatePicker$5$2$1(DatePickerState datePickerState) {
        super(1);
        this.$state = datePickerState;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Long l5) {
        invoke(l5.longValue());
        return r2.f19517a;
    }

    public final void invoke(long j5) {
        this.$state.setDisplayedMonthMillis(j5);
    }
}
