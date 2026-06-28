package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChipKt$FilterChip$2 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ BorderStroke $border;
    final /* synthetic */ SelectableChipColors $colors;
    final /* synthetic */ SelectableChipElevation $elevation;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ v3.p<Composer, Integer, r2> $label;
    final /* synthetic */ v3.p<Composer, Integer, r2> $leadingIcon;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ v3.a<r2> $onClick;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ v3.p<Composer, Integer, r2> $trailingIcon;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChipKt$FilterChip$2(boolean z4, v3.a<r2> aVar, v3.p<? super Composer, ? super Integer, r2> pVar, Modifier modifier, boolean z5, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i5, int i6, int i7) {
        super(2);
        this.$selected = z4;
        this.$onClick = aVar;
        this.$label = pVar;
        this.$modifier = modifier;
        this.$enabled = z5;
        this.$leadingIcon = pVar2;
        this.$trailingIcon = pVar3;
        this.$shape = shape;
        this.$colors = selectableChipColors;
        this.$elevation = selectableChipElevation;
        this.$border = borderStroke;
        this.$interactionSource = mutableInteractionSource;
        this.$$changed = i5;
        this.$$changed1 = i6;
        this.$$default = i7;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        ChipKt.FilterChip(this.$selected, this.$onClick, this.$label, this.$modifier, this.$enabled, this.$leadingIcon, this.$trailingIcon, this.$shape, this.$colors, this.$elevation, this.$border, this.$interactionSource, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
