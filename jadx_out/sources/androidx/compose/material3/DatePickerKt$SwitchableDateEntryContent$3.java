package androidx.compose.material3;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.material3.DisplayMode;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.r2;
import v3.r;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/AnimatedContentScope;", "Landroidx/compose/material3/DisplayMode;", "mode", "Lkotlin/r2;", "invoke-fYndouo", "(Landroidx/compose/animation/AnimatedContentScope;ILandroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DatePickerKt$SwitchableDateEntryContent$3 extends kotlin.jvm.internal.n0 implements r<AnimatedContentScope, DisplayMode, Composer, Integer, r2> {
    final /* synthetic */ CalendarModel $calendarModel;
    final /* synthetic */ DatePickerColors $colors;
    final /* synthetic */ DatePickerFormatter $dateFormatter;
    final /* synthetic */ long $displayedMonthMillis;
    final /* synthetic */ v3.l<Long, r2> $onDateSelectionChange;
    final /* synthetic */ v3.l<Long, r2> $onDisplayedMonthChange;
    final /* synthetic */ SelectableDates $selectableDates;
    final /* synthetic */ Long $selectedDateMillis;
    final /* synthetic */ kotlin.ranges.l $yearRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DatePickerKt$SwitchableDateEntryContent$3(Long l5, long j5, v3.l<? super Long, r2> lVar, v3.l<? super Long, r2> lVar2, CalendarModel calendarModel, kotlin.ranges.l lVar3, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors) {
        super(4);
        this.$selectedDateMillis = l5;
        this.$displayedMonthMillis = j5;
        this.$onDateSelectionChange = lVar;
        this.$onDisplayedMonthChange = lVar2;
        this.$calendarModel = calendarModel;
        this.$yearRange = lVar3;
        this.$dateFormatter = datePickerFormatter;
        this.$selectableDates = selectableDates;
        this.$colors = datePickerColors;
    }

    @Override // v3.r
    public /* bridge */ /* synthetic */ r2 invoke(AnimatedContentScope animatedContentScope, DisplayMode displayMode, Composer composer, Integer num) {
        m1816invokefYndouo(animatedContentScope, displayMode.m1847unboximpl(), composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: invoke-fYndouo, reason: not valid java name */
    public final void m1816invokefYndouo(@p4.l AnimatedContentScope animatedContentScope, int i5, @p4.m Composer composer, int i6) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-459778869, i6, -1, "androidx.compose.material3.SwitchableDateEntryContent.<anonymous> (DatePicker.kt:1439)");
        }
        DisplayMode.Companion companion = DisplayMode.Companion;
        if (DisplayMode.m1844equalsimpl0(i5, companion.m1849getPickerjFl4v0())) {
            composer.startReplaceableGroup(-1168710170);
            DatePickerKt.DatePickerContent(this.$selectedDateMillis, this.$displayedMonthMillis, this.$onDateSelectionChange, this.$onDisplayedMonthChange, this.$calendarModel, this.$yearRange, this.$dateFormatter, this.$selectableDates, this.$colors, composer, 0);
            composer.endReplaceableGroup();
        } else if (DisplayMode.m1844equalsimpl0(i5, companion.m1848getInputjFl4v0())) {
            composer.startReplaceableGroup(-1168709641);
            DateInputKt.DateInputContent(this.$selectedDateMillis, this.$onDateSelectionChange, this.$calendarModel, this.$yearRange, this.$dateFormatter, this.$selectableDates, this.$colors, composer, 0);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1168709264);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
