package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TimePickerKt$ClockText$4 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $autoSwitchToMinute;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ TimePickerState $state;
    final /* synthetic */ int $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$ClockText$4(Modifier modifier, TimePickerState timePickerState, int i5, boolean z4, int i6) {
        super(2);
        this.$modifier = modifier;
        this.$state = timePickerState;
        this.$value = i5;
        this.$autoSwitchToMinute = z4;
        this.$$changed = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        TimePickerKt.ClockText(this.$modifier, this.$state, this.$value, this.$autoSwitchToMinute, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
