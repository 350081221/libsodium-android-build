package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChipKt$Chip$3 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ BorderStroke $border;
    final /* synthetic */ ChipColors $colors;
    final /* synthetic */ ChipElevation $elevation;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ v3.p<Composer, Integer, r2> $label;
    final /* synthetic */ long $labelColor;
    final /* synthetic */ TextStyle $labelTextStyle;
    final /* synthetic */ v3.p<Composer, Integer, r2> $leadingIcon;
    final /* synthetic */ float $minHeight;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ v3.a<r2> $onClick;
    final /* synthetic */ PaddingValues $paddingValues;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ v3.p<Composer, Integer, r2> $trailingIcon;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChipKt$Chip$3(Modifier modifier, v3.a<r2> aVar, boolean z4, v3.p<? super Composer, ? super Integer, r2> pVar, TextStyle textStyle, long j5, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, float f5, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i5, int i6) {
        super(2);
        this.$modifier = modifier;
        this.$onClick = aVar;
        this.$enabled = z4;
        this.$label = pVar;
        this.$labelTextStyle = textStyle;
        this.$labelColor = j5;
        this.$leadingIcon = pVar2;
        this.$trailingIcon = pVar3;
        this.$shape = shape;
        this.$colors = chipColors;
        this.$elevation = chipElevation;
        this.$border = borderStroke;
        this.$minHeight = f5;
        this.$paddingValues = paddingValues;
        this.$interactionSource = mutableInteractionSource;
        this.$$changed = i5;
        this.$$changed1 = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        ChipKt.m1668ChipnkUnTEs(this.$modifier, this.$onClick, this.$enabled, this.$label, this.$labelTextStyle, this.$labelColor, this.$leadingIcon, this.$trailingIcon, this.$shape, this.$colors, this.$elevation, this.$border, this.$minHeight, this.$paddingValues, this.$interactionSource, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1));
    }
}
