package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SliderKt$RangeSlider$9 extends kotlin.jvm.internal.n0 implements v3.q<RangeSliderState, Composer, Integer, r2> {
    final /* synthetic */ SliderColors $colors;
    final /* synthetic */ boolean $enabled;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSlider$9(SliderColors sliderColors, boolean z4) {
        super(3);
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
        if ((i5 & 6) == 0) {
            i5 |= composer.changed(rangeSliderState) ? 4 : 2;
        }
        if ((i5 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-429193201, i5, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:535)");
        }
        SliderDefaults.INSTANCE.Track(rangeSliderState, (Modifier) null, this.$colors, this.$enabled, composer, (i5 & 14) | 24576, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
