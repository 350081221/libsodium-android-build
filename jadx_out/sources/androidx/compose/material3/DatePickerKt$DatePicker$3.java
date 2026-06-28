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
public final class DatePickerKt$DatePicker$3 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ DatePickerFormatter $dateFormatter;
    final /* synthetic */ DatePickerState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$DatePicker$3(DatePickerState datePickerState, DatePickerFormatter datePickerFormatter) {
        super(2);
        this.$state = datePickerState;
        this.$dateFormatter = datePickerFormatter;
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
            ComposerKt.traceEventStart(-1780043561, i5, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:162)");
        }
        DatePickerDefaults datePickerDefaults = DatePickerDefaults.INSTANCE;
        Long selectedDateMillis = this.$state.getSelectedDateMillis();
        int mo1817getDisplayModejFl4v0 = this.$state.mo1817getDisplayModejFl4v0();
        DatePickerFormatter datePickerFormatter = this.$dateFormatter;
        Modifier.Companion companion = Modifier.Companion;
        paddingValues = DatePickerKt.DatePickerHeadlinePadding;
        datePickerDefaults.m1801DatePickerHeadline3kbWawI(selectedDateMillis, mo1817getDisplayModejFl4v0, datePickerFormatter, PaddingKt.padding(companion, paddingValues), composer, 27648, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
