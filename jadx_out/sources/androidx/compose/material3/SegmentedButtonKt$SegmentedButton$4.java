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
public final class SegmentedButtonKt$SegmentedButton$4 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ BorderStroke $border;
    final /* synthetic */ boolean $checked;
    final /* synthetic */ SegmentedButtonColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ v3.p<Composer, Integer, r2> $icon;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ v3.p<Composer, Integer, r2> $label;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ v3.l<Boolean, r2> $onCheckedChange;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ MultiChoiceSegmentedButtonRowScope $this_SegmentedButton;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SegmentedButtonKt$SegmentedButton$4(MultiChoiceSegmentedButtonRowScope multiChoiceSegmentedButtonRowScope, boolean z4, v3.l<? super Boolean, r2> lVar, Shape shape, Modifier modifier, boolean z5, SegmentedButtonColors segmentedButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2, int i5, int i6, int i7) {
        super(2);
        this.$this_SegmentedButton = multiChoiceSegmentedButtonRowScope;
        this.$checked = z4;
        this.$onCheckedChange = lVar;
        this.$shape = shape;
        this.$modifier = modifier;
        this.$enabled = z5;
        this.$colors = segmentedButtonColors;
        this.$border = borderStroke;
        this.$interactionSource = mutableInteractionSource;
        this.$icon = pVar;
        this.$label = pVar2;
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
        SegmentedButtonKt.SegmentedButton(this.$this_SegmentedButton, this.$checked, this.$onCheckedChange, this.$shape, this.$modifier, this.$enabled, this.$colors, this.$border, this.$interactionSource, this.$icon, this.$label, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
