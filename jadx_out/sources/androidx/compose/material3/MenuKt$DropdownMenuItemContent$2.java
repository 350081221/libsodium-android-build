package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MenuKt$DropdownMenuItemContent$2 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ MenuItemColors $colors;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ v3.p<Composer, Integer, r2> $leadingIcon;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ v3.a<r2> $onClick;
    final /* synthetic */ v3.p<Composer, Integer, r2> $text;
    final /* synthetic */ v3.p<Composer, Integer, r2> $trailingIcon;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MenuKt$DropdownMenuItemContent$2(v3.p<? super Composer, ? super Integer, r2> pVar, v3.a<r2> aVar, Modifier modifier, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, boolean z4, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i5) {
        super(2);
        this.$text = pVar;
        this.$onClick = aVar;
        this.$modifier = modifier;
        this.$leadingIcon = pVar2;
        this.$trailingIcon = pVar3;
        this.$enabled = z4;
        this.$colors = menuItemColors;
        this.$contentPadding = paddingValues;
        this.$interactionSource = mutableInteractionSource;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        MenuKt.DropdownMenuItemContent(this.$text, this.$onClick, this.$modifier, this.$leadingIcon, this.$trailingIcon, this.$enabled, this.$colors, this.$contentPadding, this.$interactionSource, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
