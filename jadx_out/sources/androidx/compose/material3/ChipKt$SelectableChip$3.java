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
public final class ChipKt$SelectableChip$3 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ v3.p<Composer, Integer, r2> $avatar;
    final /* synthetic */ BorderStroke $border;
    final /* synthetic */ SelectableChipColors $colors;
    final /* synthetic */ SelectableChipElevation $elevation;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ v3.p<Composer, Integer, r2> $label;
    final /* synthetic */ TextStyle $labelTextStyle;
    final /* synthetic */ v3.p<Composer, Integer, r2> $leadingIcon;
    final /* synthetic */ float $minHeight;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ v3.a<r2> $onClick;
    final /* synthetic */ PaddingValues $paddingValues;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ v3.p<Composer, Integer, r2> $trailingIcon;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChipKt$SelectableChip$3(boolean z4, Modifier modifier, v3.a<r2> aVar, boolean z5, v3.p<? super Composer, ? super Integer, r2> pVar, TextStyle textStyle, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, v3.p<? super Composer, ? super Integer, r2> pVar4, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, float f5, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i5, int i6) {
        super(2);
        this.$selected = z4;
        this.$modifier = modifier;
        this.$onClick = aVar;
        this.$enabled = z5;
        this.$label = pVar;
        this.$labelTextStyle = textStyle;
        this.$leadingIcon = pVar2;
        this.$avatar = pVar3;
        this.$trailingIcon = pVar4;
        this.$shape = shape;
        this.$colors = selectableChipColors;
        this.$elevation = selectableChipElevation;
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
        ChipKt.m1670SelectableChipu0RnIRE(this.$selected, this.$modifier, this.$onClick, this.$enabled, this.$label, this.$labelTextStyle, this.$leadingIcon, this.$avatar, this.$trailingIcon, this.$shape, this.$colors, this.$elevation, this.$border, this.$minHeight, this.$paddingValues, this.$interactionSource, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1));
    }
}
