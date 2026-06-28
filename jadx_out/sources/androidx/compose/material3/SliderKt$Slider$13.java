package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SliderKt$Slider$13 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ SliderColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ SliderState $state;
    final /* synthetic */ v3.q<SliderState, Composer, Integer, r2> $thumb;
    final /* synthetic */ v3.q<SliderState, Composer, Integer, r2> $track;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$Slider$13(SliderState sliderState, Modifier modifier, boolean z4, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, v3.q<? super SliderState, ? super Composer, ? super Integer, r2> qVar, v3.q<? super SliderState, ? super Composer, ? super Integer, r2> qVar2, int i5, int i6) {
        super(2);
        this.$state = sliderState;
        this.$modifier = modifier;
        this.$enabled = z4;
        this.$colors = sliderColors;
        this.$interactionSource = mutableInteractionSource;
        this.$thumb = qVar;
        this.$track = qVar2;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        SliderKt.Slider(this.$state, this.$modifier, this.$enabled, this.$colors, this.$interactionSource, this.$thumb, this.$track, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
