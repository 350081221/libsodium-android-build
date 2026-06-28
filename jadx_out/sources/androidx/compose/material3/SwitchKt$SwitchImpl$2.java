package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Shape;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwitchKt$SwitchImpl$2 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ boolean $checked;
    final /* synthetic */ SwitchColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ float $maxBound;
    final /* synthetic */ float $minBound;
    final /* synthetic */ BoxScope $this_SwitchImpl;
    final /* synthetic */ v3.p<Composer, Integer, r2> $thumbContent;
    final /* synthetic */ Shape $thumbShape;
    final /* synthetic */ State<Float> $thumbValue;
    final /* synthetic */ float $uncheckedThumbDiameter;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwitchKt$SwitchImpl$2(BoxScope boxScope, boolean z4, boolean z5, SwitchColors switchColors, State<Float> state, v3.p<? super Composer, ? super Integer, r2> pVar, InteractionSource interactionSource, Shape shape, float f5, float f6, float f7, int i5, int i6) {
        super(2);
        this.$this_SwitchImpl = boxScope;
        this.$checked = z4;
        this.$enabled = z5;
        this.$colors = switchColors;
        this.$thumbValue = state;
        this.$thumbContent = pVar;
        this.$interactionSource = interactionSource;
        this.$thumbShape = shape;
        this.$uncheckedThumbDiameter = f5;
        this.$minBound = f6;
        this.$maxBound = f7;
        this.$$changed = i5;
        this.$$changed1 = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        SwitchKt.m2337SwitchImpl0DmnUew(this.$this_SwitchImpl, this.$checked, this.$enabled, this.$colors, this.$thumbValue, this.$thumbContent, this.$interactionSource, this.$thumbShape, this.$uncheckedThumbDiameter, this.$minBound, this.$maxBound, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1));
    }
}
