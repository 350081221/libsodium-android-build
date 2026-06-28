package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ListItemKt$ListItem$3 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ ListItemColors $colors;
    final /* synthetic */ v3.p<Composer, Integer, r2> $headlineContent;
    final /* synthetic */ v3.p<Composer, Integer, r2> $leadingContent;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ v3.p<Composer, Integer, r2> $overlineContent;
    final /* synthetic */ float $shadowElevation;
    final /* synthetic */ v3.p<Composer, Integer, r2> $supportingContent;
    final /* synthetic */ float $tonalElevation;
    final /* synthetic */ v3.p<Composer, Integer, r2> $trailingContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ListItemKt$ListItem$3(v3.p<? super Composer, ? super Integer, r2> pVar, Modifier modifier, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, v3.p<? super Composer, ? super Integer, r2> pVar4, v3.p<? super Composer, ? super Integer, r2> pVar5, ListItemColors listItemColors, float f5, float f6, int i5, int i6) {
        super(2);
        this.$headlineContent = pVar;
        this.$modifier = modifier;
        this.$overlineContent = pVar2;
        this.$supportingContent = pVar3;
        this.$leadingContent = pVar4;
        this.$trailingContent = pVar5;
        this.$colors = listItemColors;
        this.$tonalElevation = f5;
        this.$shadowElevation = f6;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        ListItemKt.m1966ListItemHXNGIdc(this.$headlineContent, this.$modifier, this.$overlineContent, this.$supportingContent, this.$leadingContent, this.$trailingContent, this.$colors, this.$tonalElevation, this.$shadowElevation, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
