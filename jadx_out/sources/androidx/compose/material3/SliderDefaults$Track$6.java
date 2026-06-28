package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SliderDefaults$Track$6 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ SliderColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ RangeSliderState $rangeSliderState;
    final /* synthetic */ SliderDefaults $tmp1_rcvr;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderDefaults$Track$6(SliderDefaults sliderDefaults, RangeSliderState rangeSliderState, Modifier modifier, SliderColors sliderColors, boolean z4, int i5, int i6) {
        super(2);
        this.$tmp1_rcvr = sliderDefaults;
        this.$rangeSliderState = rangeSliderState;
        this.$modifier = modifier;
        this.$colors = sliderColors;
        this.$enabled = z4;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        this.$tmp1_rcvr.Track(this.$rangeSliderState, this.$modifier, this.$colors, this.$enabled, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
