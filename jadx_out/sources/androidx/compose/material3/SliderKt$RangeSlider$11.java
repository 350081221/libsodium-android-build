package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SliderKt$RangeSlider$11 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ SliderColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $endInteractionSource;
    final /* synthetic */ v3.q<RangeSliderState, Composer, Integer, r2> $endThumb;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ v3.l<kotlin.ranges.f<Float>, r2> $onValueChange;
    final /* synthetic */ v3.a<r2> $onValueChangeFinished;
    final /* synthetic */ MutableInteractionSource $startInteractionSource;
    final /* synthetic */ v3.q<RangeSliderState, Composer, Integer, r2> $startThumb;
    final /* synthetic */ int $steps;
    final /* synthetic */ v3.q<RangeSliderState, Composer, Integer, r2> $track;
    final /* synthetic */ kotlin.ranges.f<Float> $value;
    final /* synthetic */ kotlin.ranges.f<Float> $valueRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$RangeSlider$11(kotlin.ranges.f<Float> fVar, v3.l<? super kotlin.ranges.f<Float>, r2> lVar, Modifier modifier, boolean z4, kotlin.ranges.f<Float> fVar2, v3.a<r2> aVar, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, v3.q<? super RangeSliderState, ? super Composer, ? super Integer, r2> qVar, v3.q<? super RangeSliderState, ? super Composer, ? super Integer, r2> qVar2, v3.q<? super RangeSliderState, ? super Composer, ? super Integer, r2> qVar3, int i5, int i6, int i7, int i8) {
        super(2);
        this.$value = fVar;
        this.$onValueChange = lVar;
        this.$modifier = modifier;
        this.$enabled = z4;
        this.$valueRange = fVar2;
        this.$onValueChangeFinished = aVar;
        this.$colors = sliderColors;
        this.$startInteractionSource = mutableInteractionSource;
        this.$endInteractionSource = mutableInteractionSource2;
        this.$startThumb = qVar;
        this.$endThumb = qVar2;
        this.$track = qVar3;
        this.$steps = i5;
        this.$$changed = i6;
        this.$$changed1 = i7;
        this.$$default = i8;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        SliderKt.RangeSlider(this.$value, this.$onValueChange, this.$modifier, this.$enabled, this.$valueRange, this.$onValueChangeFinished, this.$colors, this.$startInteractionSource, this.$endInteractionSource, this.$startThumb, this.$endThumb, this.$track, this.$steps, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
