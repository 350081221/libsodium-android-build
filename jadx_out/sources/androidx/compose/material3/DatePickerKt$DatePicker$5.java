package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$DatePicker$5\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,2268:1\n1116#2,6:2269\n1116#2,6:2275\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$DatePicker$5\n*L\n200#1:2269,6\n201#1:2275,6\n*E\n"})
/* loaded from: classes.dex */
public final class DatePickerKt$DatePicker$5 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ CalendarModel $calendarModel;
    final /* synthetic */ DatePickerColors $colors;
    final /* synthetic */ DatePickerFormatter $dateFormatter;
    final /* synthetic */ DatePickerState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$DatePicker$5(DatePickerState datePickerState, CalendarModel calendarModel, DatePickerFormatter datePickerFormatter, DatePickerColors datePickerColors) {
        super(2);
        this.$state = datePickerState;
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
            ComposerKt.traceEventStart(-1840727866, i5, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:195)");
        }
        Long selectedDateMillis = this.$state.getSelectedDateMillis();
        long displayedMonthMillis = this.$state.getDisplayedMonthMillis();
        int mo1817getDisplayModejFl4v0 = this.$state.mo1817getDisplayModejFl4v0();
        composer.startReplaceableGroup(-1036919665);
        boolean changed = composer.changed(this.$state);
        DatePickerState datePickerState = this.$state;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DatePickerKt$DatePicker$5$1$1(datePickerState);
            composer.updateRememberedValue(rememberedValue);
        }
        v3.l lVar = (v3.l) rememberedValue;
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-1036919567);
        boolean changed2 = composer.changed(this.$state);
        DatePickerState datePickerState2 = this.$state;
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new DatePickerKt$DatePicker$5$2$1(datePickerState2);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        DatePickerKt.m1811SwitchableDateEntryContentd7iavvg(selectedDateMillis, displayedMonthMillis, mo1817getDisplayModejFl4v0, lVar, (v3.l) rememberedValue2, this.$calendarModel, this.$state.getYearRange(), this.$dateFormatter, this.$state.getSelectableDates(), this.$colors, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
