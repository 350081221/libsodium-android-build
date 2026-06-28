package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DatePickerKt$YearPicker$2 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ CalendarModel $calendarModel;
    final /* synthetic */ DatePickerColors $colors;
    final /* synthetic */ long $displayedMonthMillis;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ v3.l<Integer, r2> $onYearSelected;
    final /* synthetic */ SelectableDates $selectableDates;
    final /* synthetic */ kotlin.ranges.l $yearRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DatePickerKt$YearPicker$2(Modifier modifier, long j5, v3.l<? super Integer, r2> lVar, SelectableDates selectableDates, CalendarModel calendarModel, kotlin.ranges.l lVar2, DatePickerColors datePickerColors, int i5) {
        super(2);
        this.$modifier = modifier;
        this.$displayedMonthMillis = j5;
        this.$onYearSelected = lVar;
        this.$selectableDates = selectableDates;
        this.$calendarModel = calendarModel;
        this.$yearRange = lVar2;
        this.$colors = datePickerColors;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        DatePickerKt.YearPicker(this.$modifier, this.$displayedMonthMillis, this.$onYearSelected, this.$selectableDates, this.$calendarModel, this.$yearRange, this.$colors, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
