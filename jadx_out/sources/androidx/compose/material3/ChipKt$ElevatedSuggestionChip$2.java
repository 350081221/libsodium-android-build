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
public final class ChipKt$ElevatedSuggestionChip$2 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ BorderStroke $border;
    final /* synthetic */ ChipColors $colors;
    final /* synthetic */ ChipElevation $elevation;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ v3.p<Composer, Integer, r2> $icon;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ v3.p<Composer, Integer, r2> $label;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ v3.a<r2> $onClick;
    final /* synthetic */ Shape $shape;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChipKt$ElevatedSuggestionChip$2(v3.a<r2> aVar, v3.p<? super Composer, ? super Integer, r2> pVar, Modifier modifier, boolean z4, v3.p<? super Composer, ? super Integer, r2> pVar2, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i5, int i6) {
        super(2);
        this.$onClick = aVar;
        this.$label = pVar;
        this.$modifier = modifier;
        this.$enabled = z4;
        this.$icon = pVar2;
        this.$shape = shape;
        this.$colors = chipColors;
        this.$elevation = chipElevation;
        this.$border = borderStroke;
        this.$interactionSource = mutableInteractionSource;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        ChipKt.ElevatedSuggestionChip(this.$onClick, this.$label, this.$modifier, this.$enabled, this.$icon, this.$shape, this.$colors, this.$elevation, this.$border, this.$interactionSource, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
