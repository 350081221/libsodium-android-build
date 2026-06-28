package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DatePickerKt$Month$2 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ DatePickerColors $colors;
    final /* synthetic */ DatePickerFormatter $dateFormatter;
    final /* synthetic */ Long $endDateMillis;
    final /* synthetic */ CalendarMonth $month;
    final /* synthetic */ v3.l<Long, r2> $onDateSelectionChange;
    final /* synthetic */ SelectedRangeInfo $rangeSelectionInfo;
    final /* synthetic */ SelectableDates $selectableDates;
    final /* synthetic */ Long $startDateMillis;
    final /* synthetic */ long $todayMillis;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DatePickerKt$Month$2(CalendarMonth calendarMonth, v3.l<? super Long, r2> lVar, long j5, Long l5, Long l6, SelectedRangeInfo selectedRangeInfo, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, int i5) {
        super(2);
        this.$month = calendarMonth;
        this.$onDateSelectionChange = lVar;
        this.$todayMillis = j5;
        this.$startDateMillis = l5;
        this.$endDateMillis = l6;
        this.$rangeSelectionInfo = selectedRangeInfo;
        this.$dateFormatter = datePickerFormatter;
        this.$selectableDates = selectableDates;
        this.$colors = datePickerColors;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        DatePickerKt.Month(this.$month, this.$onDateSelectionChange, this.$todayMillis, this.$startDateMillis, this.$endDateMillis, this.$rangeSelectionInfo, this.$dateFormatter, this.$selectableDates, this.$colors, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
