package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DateRangePickerKt$DateRangePicker$6 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ DatePickerColors $colors;
    final /* synthetic */ DatePickerFormatter $dateFormatter;
    final /* synthetic */ v3.p<Composer, Integer, r2> $headline;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ boolean $showModeToggle;
    final /* synthetic */ DateRangePickerState $state;
    final /* synthetic */ v3.p<Composer, Integer, r2> $title;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DateRangePickerKt$DateRangePicker$6(DateRangePickerState dateRangePickerState, Modifier modifier, DatePickerFormatter datePickerFormatter, v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2, boolean z4, DatePickerColors datePickerColors, int i5, int i6) {
        super(2);
        this.$state = dateRangePickerState;
        this.$modifier = modifier;
        this.$dateFormatter = datePickerFormatter;
        this.$title = pVar;
        this.$headline = pVar2;
        this.$showModeToggle = z4;
        this.$colors = datePickerColors;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        DateRangePickerKt.DateRangePicker(this.$state, this.$modifier, this.$dateFormatter, this.$title, this.$headline, this.$showModeToggle, this.$colors, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
