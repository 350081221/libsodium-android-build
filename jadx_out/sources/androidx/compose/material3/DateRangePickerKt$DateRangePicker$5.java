package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt$DateRangePicker$5\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1099:1\n1116#2,6:1100\n1116#2,6:1106\n*S KotlinDebug\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt$DateRangePicker$5\n*L\n136#1:1100,6\n147#1:1106,6\n*E\n"})
/* loaded from: classes.dex */
public final class DateRangePickerKt$DateRangePicker$5 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ CalendarModel $calendarModel;
    final /* synthetic */ DatePickerColors $colors;
    final /* synthetic */ DatePickerFormatter $dateFormatter;
    final /* synthetic */ DateRangePickerState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateRangePickerKt$DateRangePicker$5(DateRangePickerState dateRangePickerState, CalendarModel calendarModel, DatePickerFormatter datePickerFormatter, DatePickerColors datePickerColors) {
        super(2);
        this.$state = dateRangePickerState;
        this.$calendarModel = calendarModel;
        this.$dateFormatter = datePickerFormatter;
        this.$colors = datePickerColors;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@p4.m Composer composer, int i5) {
        if ((i5 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-57534331, i5, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:130)");
        }
        Long selectedStartDateMillis = this.$state.getSelectedStartDateMillis();
        Long selectedEndDateMillis = this.$state.getSelectedEndDateMillis();
        long displayedMonthMillis = this.$state.getDisplayedMonthMillis();
        int mo1831getDisplayModejFl4v0 = this.$state.mo1831getDisplayModejFl4v0();
        composer.startReplaceableGroup(-1467496213);
        boolean changed = composer.changed(this.$state);
        DateRangePickerState dateRangePickerState = this.$state;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DateRangePickerKt$DateRangePicker$5$1$1(dateRangePickerState);
            composer.updateRememberedValue(rememberedValue);
        }
        v3.p pVar = (v3.p) rememberedValue;
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-1467495707);
        boolean changed2 = composer.changed(this.$state);
        DateRangePickerState dateRangePickerState2 = this.$state;
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new DateRangePickerKt$DateRangePicker$5$2$1(dateRangePickerState2);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        DateRangePickerKt.m1825SwitchableDateEntryContentRN2D1Q(selectedStartDateMillis, selectedEndDateMillis, displayedMonthMillis, mo1831getDisplayModejFl4v0, pVar, (v3.l) rememberedValue2, this.$calendarModel, this.$state.getYearRange(), this.$dateFormatter, this.$state.getSelectableDates(), this.$colors, composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
