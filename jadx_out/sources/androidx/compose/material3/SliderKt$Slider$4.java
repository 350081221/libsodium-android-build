package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SliderKt$Slider$4 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ SliderColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ v3.l<Float, r2> $onValueChange;
    final /* synthetic */ v3.a<r2> $onValueChangeFinished;
    final /* synthetic */ int $steps;
    final /* synthetic */ float $value;
    final /* synthetic */ kotlin.ranges.f<Float> $valueRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$Slider$4(float f5, v3.l<? super Float, r2> lVar, Modifier modifier, boolean z4, kotlin.ranges.f<Float> fVar, int i5, v3.a<r2> aVar, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, int i6, int i7) {
        super(2);
        this.$value = f5;
        this.$onValueChange = lVar;
        this.$modifier = modifier;
        this.$enabled = z4;
        this.$valueRange = fVar;
        this.$steps = i5;
        this.$onValueChangeFinished = aVar;
        this.$colors = sliderColors;
        this.$interactionSource = mutableInteractionSource;
        this.$$changed = i6;
        this.$$default = i7;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        SliderKt.Slider(this.$value, this.$onValueChange, this.$modifier, this.$enabled, this.$valueRange, this.$steps, this.$onValueChangeFinished, this.$colors, this.$interactionSource, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
