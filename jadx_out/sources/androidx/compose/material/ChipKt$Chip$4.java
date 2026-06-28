package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.a;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChipKt$Chip$4 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ BorderStroke $border;
    final /* synthetic */ ChipColors $colors;
    final /* synthetic */ q<RowScope, Composer, Integer, r2> $content;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ p<Composer, Integer, r2> $leadingIcon;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ a<r2> $onClick;
    final /* synthetic */ Shape $shape;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChipKt$Chip$4(a<r2> aVar, Modifier modifier, boolean z4, MutableInteractionSource mutableInteractionSource, Shape shape, BorderStroke borderStroke, ChipColors chipColors, p<? super Composer, ? super Integer, r2> pVar, q<? super RowScope, ? super Composer, ? super Integer, r2> qVar, int i5, int i6) {
        super(2);
        this.$onClick = aVar;
        this.$modifier = modifier;
        this.$enabled = z4;
        this.$interactionSource = mutableInteractionSource;
        this.$shape = shape;
        this.$border = borderStroke;
        this.$colors = chipColors;
        this.$leadingIcon = pVar;
        this.$content = qVar;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        ChipKt.Chip(this.$onClick, this.$modifier, this.$enabled, this.$interactionSource, this.$shape, this.$border, this.$colors, this.$leadingIcon, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
