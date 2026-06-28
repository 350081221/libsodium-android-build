package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SliderKt$Track$2 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ SliderColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ float $positionFractionEnd;
    final /* synthetic */ float $positionFractionStart;
    final /* synthetic */ float $thumbPx;
    final /* synthetic */ List<Float> $tickFractions;
    final /* synthetic */ float $trackStrokeWidth;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$Track$2(Modifier modifier, SliderColors sliderColors, boolean z4, float f5, float f6, List<Float> list, float f7, float f8, int i5) {
        super(2);
        this.$modifier = modifier;
        this.$colors = sliderColors;
        this.$enabled = z4;
        this.$positionFractionStart = f5;
        this.$positionFractionEnd = f6;
        this.$tickFractions = list;
        this.$thumbPx = f7;
        this.$trackStrokeWidth = f8;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        SliderKt.Track(this.$modifier, this.$colors, this.$enabled, this.$positionFractionStart, this.$positionFractionEnd, this.$tickFractions, this.$thumbPx, this.$trackStrokeWidth, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
