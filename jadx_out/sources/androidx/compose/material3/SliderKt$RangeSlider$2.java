package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material3/RangeSliderState;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/material3/RangeSliderState;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SliderKt$RangeSlider$2 extends kotlin.jvm.internal.n0 implements v3.q<RangeSliderState, Composer, Integer, r2> {
    final /* synthetic */ SliderColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $endInteractionSource;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSlider$2(MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, boolean z4) {
        super(3);
        this.$endInteractionSource = mutableInteractionSource;
        this.$colors = sliderColors;
        this.$enabled = z4;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ r2 invoke(RangeSliderState rangeSliderState, Composer composer, Integer num) {
        invoke(rangeSliderState, composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@p4.l RangeSliderState rangeSliderState, @p4.m Composer composer, int i5) {
        if ((i5 & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1832060001, i5, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:438)");
        }
        SliderDefaults.INSTANCE.m2195Thumb9LiSoMs(this.$endInteractionSource, null, this.$colors, this.$enabled, 0L, composer, 196614, 18);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
