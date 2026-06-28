package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavigationBarKt$NavigationBarItem$4 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $alwaysShowLabel;
    final /* synthetic */ NavigationBarItemColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ v3.p<Composer, Integer, r2> $icon;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ v3.p<Composer, Integer, r2> $label;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ v3.a<r2> $onClick;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ RowScope $this_NavigationBarItem;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavigationBarKt$NavigationBarItem$4(RowScope rowScope, boolean z4, v3.a<r2> aVar, v3.p<? super Composer, ? super Integer, r2> pVar, Modifier modifier, boolean z5, v3.p<? super Composer, ? super Integer, r2> pVar2, boolean z6, NavigationBarItemColors navigationBarItemColors, MutableInteractionSource mutableInteractionSource, int i5, int i6) {
        super(2);
        this.$this_NavigationBarItem = rowScope;
        this.$selected = z4;
        this.$onClick = aVar;
        this.$icon = pVar;
        this.$modifier = modifier;
        this.$enabled = z5;
        this.$label = pVar2;
        this.$alwaysShowLabel = z6;
        this.$colors = navigationBarItemColors;
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
        NavigationBarKt.NavigationBarItem(this.$this_NavigationBarItem, this.$selected, this.$onClick, this.$icon, this.$modifier, this.$enabled, this.$label, this.$alwaysShowLabel, this.$colors, this.$interactionSource, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
