package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TimePickerKt$PeriodToggleImpl$3 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ TimePickerColors $colors;
    final /* synthetic */ Shape $endShape;
    final /* synthetic */ MeasurePolicy $measurePolicy;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Shape $startShape;
    final /* synthetic */ TimePickerState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$PeriodToggleImpl$3(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, MeasurePolicy measurePolicy, Shape shape, Shape shape2, int i5) {
        super(2);
        this.$modifier = modifier;
        this.$state = timePickerState;
        this.$colors = timePickerColors;
        this.$measurePolicy = measurePolicy;
        this.$startShape = shape;
        this.$endShape = shape2;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        TimePickerKt.PeriodToggleImpl(this.$modifier, this.$state, this.$colors, this.$measurePolicy, this.$startShape, this.$endShape, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
