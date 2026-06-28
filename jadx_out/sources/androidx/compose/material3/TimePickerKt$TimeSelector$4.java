package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TimePickerKt$TimeSelector$4 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ TimePickerColors $colors;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ int $selection;
    final /* synthetic */ TimePickerState $state;
    final /* synthetic */ int $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimeSelector$4(Modifier modifier, int i5, TimePickerState timePickerState, int i6, TimePickerColors timePickerColors, int i7) {
        super(2);
        this.$modifier = modifier;
        this.$value = i5;
        this.$state = timePickerState;
        this.$selection = i6;
        this.$colors = timePickerColors;
        this.$$changed = i7;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        TimePickerKt.m2481TimeSelectoruXwN82Y(this.$modifier, this.$value, this.$state, this.$selection, this.$colors, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
