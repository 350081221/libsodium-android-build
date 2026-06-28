package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SliderKt$RangeSliderImpl$3 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $endInteractionSource;
    final /* synthetic */ v3.q<RangeSliderState, Composer, Integer, r2> $endThumb;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ MutableInteractionSource $startInteractionSource;
    final /* synthetic */ v3.q<RangeSliderState, Composer, Integer, r2> $startThumb;
    final /* synthetic */ RangeSliderState $state;
    final /* synthetic */ v3.q<RangeSliderState, Composer, Integer, r2> $track;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$RangeSliderImpl$3(Modifier modifier, RangeSliderState rangeSliderState, boolean z4, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, v3.q<? super RangeSliderState, ? super Composer, ? super Integer, r2> qVar, v3.q<? super RangeSliderState, ? super Composer, ? super Integer, r2> qVar2, v3.q<? super RangeSliderState, ? super Composer, ? super Integer, r2> qVar3, int i5) {
        super(2);
        this.$modifier = modifier;
        this.$state = rangeSliderState;
        this.$enabled = z4;
        this.$startInteractionSource = mutableInteractionSource;
        this.$endInteractionSource = mutableInteractionSource2;
        this.$startThumb = qVar;
        this.$endThumb = qVar2;
        this.$track = qVar3;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        SliderKt.RangeSliderImpl(this.$modifier, this.$state, this.$enabled, this.$startInteractionSource, this.$endInteractionSource, this.$startThumb, this.$endThumb, this.$track, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
