package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IconButtonKt$FilledIconToggleButton$4 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $checked;
    final /* synthetic */ IconToggleButtonColors $colors;
    final /* synthetic */ v3.p<Composer, Integer, r2> $content;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ v3.l<Boolean, r2> $onCheckedChange;
    final /* synthetic */ Shape $shape;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IconButtonKt$FilledIconToggleButton$4(boolean z4, v3.l<? super Boolean, r2> lVar, Modifier modifier, boolean z5, Shape shape, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, v3.p<? super Composer, ? super Integer, r2> pVar, int i5, int i6) {
        super(2);
        this.$checked = z4;
        this.$onCheckedChange = lVar;
        this.$modifier = modifier;
        this.$enabled = z5;
        this.$shape = shape;
        this.$colors = iconToggleButtonColors;
        this.$interactionSource = mutableInteractionSource;
        this.$content = pVar;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        IconButtonKt.FilledIconToggleButton(this.$checked, this.$onCheckedChange, this.$modifier, this.$enabled, this.$shape, this.$colors, this.$interactionSource, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
