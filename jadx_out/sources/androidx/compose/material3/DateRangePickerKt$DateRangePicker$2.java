package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DateRangePickerKt$DateRangePicker$2 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ DateRangePickerState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateRangePickerKt$DateRangePicker$2(DateRangePickerState dateRangePickerState) {
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
        PaddingValues paddingValues;
        if ((i5 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-162164694, i5, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
        }
        DateRangePickerDefaults dateRangePickerDefaults = DateRangePickerDefaults.INSTANCE;
        int mo1831getDisplayModejFl4v0 = this.$state.mo1831getDisplayModejFl4v0();
        Modifier.Companion companion = Modifier.Companion;
        paddingValues = DateRangePickerKt.DateRangePickerTitlePadding;
        dateRangePickerDefaults.m1822DateRangePickerTitlehOD91z4(mo1831getDisplayModejFl4v0, PaddingKt.padding(companion, paddingValues), composer, 432, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
