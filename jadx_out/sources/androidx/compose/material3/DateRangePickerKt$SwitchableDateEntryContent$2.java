package androidx.compose.material3;

import androidx.compose.material3.DisplayMode;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material3/DisplayMode;", "mode", "Lkotlin/r2;", "invoke-QujVXRc", "(ILandroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DateRangePickerKt$SwitchableDateEntryContent$2 extends kotlin.jvm.internal.n0 implements v3.q<DisplayMode, Composer, Integer, r2> {
    final /* synthetic */ CalendarModel $calendarModel;
    final /* synthetic */ DatePickerColors $colors;
    final /* synthetic */ DatePickerFormatter $dateFormatter;
    final /* synthetic */ long $displayedMonthMillis;
    final /* synthetic */ v3.p<Long, Long, r2> $onDatesSelectionChange;
    final /* synthetic */ v3.l<Long, r2> $onDisplayedMonthChange;
    final /* synthetic */ SelectableDates $selectableDates;
    final /* synthetic */ Long $selectedEndDateMillis;
    final /* synthetic */ Long $selectedStartDateMillis;
    final /* synthetic */ kotlin.ranges.l $yearRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DateRangePickerKt$SwitchableDateEntryContent$2(Long l5, Long l6, long j5, v3.p<? super Long, ? super Long, r2> pVar, v3.l<? super Long, r2> lVar, CalendarModel calendarModel, kotlin.ranges.l lVar2, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors) {
        super(3);
        this.$selectedStartDateMillis = l5;
        this.$selectedEndDateMillis = l6;
        this.$displayedMonthMillis = j5;
        this.$onDatesSelectionChange = pVar;
        this.$onDisplayedMonthChange = lVar;
        this.$calendarModel = calendarModel;
        this.$yearRange = lVar2;
        this.$dateFormatter = datePickerFormatter;
        this.$selectableDates = selectableDates;
        this.$colors = datePickerColors;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ r2 invoke(DisplayMode displayMode, Composer composer, Integer num) {
        m1830invokeQujVXRc(displayMode.m1847unboximpl(), composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: invoke-QujVXRc, reason: not valid java name */
    public final void m1830invokeQujVXRc(int i5, @p4.m Composer composer, int i6) {
        int i7;
        int i8;
        if ((i6 & 6) == 0) {
            if (composer.changed(i5)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i7 = i6 | i8;
        } else {
            i7 = i6;
        }
        if ((i7 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1026642619, i7, -1, "androidx.compose.material3.SwitchableDateEntryContent.<anonymous> (DateRangePicker.kt:690)");
        }
        DisplayMode.Companion companion = DisplayMode.Companion;
        if (DisplayMode.m1844equalsimpl0(i5, companion.m1849getPickerjFl4v0())) {
            composer.startReplaceableGroup(-1168744807);
            DateRangePickerKt.DateRangePickerContent(this.$selectedStartDateMillis, this.$selectedEndDateMillis, this.$displayedMonthMillis, this.$onDatesSelectionChange, this.$onDisplayedMonthChange, this.$calendarModel, this.$yearRange, this.$dateFormatter, this.$selectableDates, this.$colors, composer, 0);
            composer.endReplaceableGroup();
        } else if (DisplayMode.m1844equalsimpl0(i5, companion.m1848getInputjFl4v0())) {
            composer.startReplaceableGroup(-1168744198);
            DateRangeInputKt.DateRangeInputContent(this.$selectedStartDateMillis, this.$selectedEndDateMillis, this.$onDatesSelectionChange, this.$calendarModel, this.$yearRange, this.$dateFormatter, this.$selectableDates, this.$colors, composer, 0);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1168743741);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
