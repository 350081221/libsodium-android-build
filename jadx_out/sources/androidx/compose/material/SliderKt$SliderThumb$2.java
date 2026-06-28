package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SliderKt$SliderThumb$2 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ SliderColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ float $offset;
    final /* synthetic */ BoxScope $this_SliderThumb;
    final /* synthetic */ float $thumbSize;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$SliderThumb$2(BoxScope boxScope, Modifier modifier, float f5, MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, boolean z4, float f6, int i5) {
        super(2);
        this.$this_SliderThumb = boxScope;
        this.$modifier = modifier;
        this.$offset = f5;
        this.$interactionSource = mutableInteractionSource;
        this.$colors = sliderColors;
        this.$enabled = z4;
        this.$thumbSize = f6;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        SliderKt.m1430SliderThumbPcYyNuk(this.$this_SliderThumb, this.$modifier, this.$offset, this.$interactionSource, this.$colors, this.$enabled, this.$thumbSize, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
