package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import kotlin.ranges.f;
import p4.m;
import v3.a;
import v3.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SliderKt$Slider$4 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ SliderColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ l<Float, r2> $onValueChange;
    final /* synthetic */ a<r2> $onValueChangeFinished;
    final /* synthetic */ int $steps;
    final /* synthetic */ float $value;
    final /* synthetic */ f<Float> $valueRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$Slider$4(float f5, l<? super Float, r2> lVar, Modifier modifier, boolean z4, f<Float> fVar, int i5, a<r2> aVar, MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, int i6, int i7) {
        super(2);
        this.$value = f5;
        this.$onValueChange = lVar;
        this.$modifier = modifier;
        this.$enabled = z4;
        this.$valueRange = fVar;
        this.$steps = i5;
        this.$onValueChangeFinished = aVar;
        this.$interactionSource = mutableInteractionSource;
        this.$colors = sliderColors;
        this.$$changed = i6;
        this.$$default = i7;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        SliderKt.Slider(this.$value, this.$onValueChange, this.$modifier, this.$enabled, this.$valueRange, this.$steps, this.$onValueChangeFinished, this.$interactionSource, this.$colors, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
