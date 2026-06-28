package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt$DateRangePicker$4\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1099:1\n1116#2,6:1100\n*S KotlinDebug\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt$DateRangePicker$4\n*L\n118#1:1100,6\n*E\n"})
/* loaded from: classes.dex */
final class DateRangePickerKt$DateRangePicker$4 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ DateRangePickerState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateRangePickerKt$DateRangePicker$4(DateRangePickerState dateRangePickerState) {
        super(2);
        this.$state = dateRangePickerState;
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
            ComposerKt.traceEventStart(-1490010652, i5, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:114)");
        }
        Modifier padding = PaddingKt.padding(Modifier.Companion, DatePickerKt.getDatePickerModeTogglePadding());
        int mo1831getDisplayModejFl4v0 = this.$state.mo1831getDisplayModejFl4v0();
        composer.startReplaceableGroup(-1467496949);
        boolean changed = composer.changed(this.$state);
        DateRangePickerState dateRangePickerState = this.$state;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DateRangePickerKt$DateRangePicker$4$1$1(dateRangePickerState);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DatePickerKt.m1810DisplayModeToggleButtontER2X8s(padding, mo1831getDisplayModejFl4v0, (v3.l) rememberedValue, composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
