package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DatePickerKt$SwitchableDateEntryContent$4 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ CalendarModel $calendarModel;
    final /* synthetic */ DatePickerColors $colors;
    final /* synthetic */ DatePickerFormatter $dateFormatter;
    final /* synthetic */ int $displayMode;
    final /* synthetic */ long $displayedMonthMillis;
    final /* synthetic */ v3.l<Long, r2> $onDateSelectionChange;
    final /* synthetic */ v3.l<Long, r2> $onDisplayedMonthChange;
    final /* synthetic */ SelectableDates $selectableDates;
    final /* synthetic */ Long $selectedDateMillis;
    final /* synthetic */ kotlin.ranges.l $yearRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DatePickerKt$SwitchableDateEntryContent$4(Long l5, long j5, int i5, v3.l<? super Long, r2> lVar, v3.l<? super Long, r2> lVar2, CalendarModel calendarModel, kotlin.ranges.l lVar3, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, int i6) {
        super(2);
        this.$selectedDateMillis = l5;
        this.$displayedMonthMillis = j5;
        this.$displayMode = i5;
        this.$onDateSelectionChange = lVar;
        this.$onDisplayedMonthChange = lVar2;
        this.$calendarModel = calendarModel;
        this.$yearRange = lVar3;
        this.$dateFormatter = datePickerFormatter;
        this.$selectableDates = selectableDates;
        this.$colors = datePickerColors;
        this.$$changed = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        DatePickerKt.m1811SwitchableDateEntryContentd7iavvg(this.$selectedDateMillis, this.$displayedMonthMillis, this.$displayMode, this.$onDateSelectionChange, this.$onDisplayedMonthChange, this.$calendarModel, this.$yearRange, this.$dateFormatter, this.$selectableDates, this.$colors, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
