package androidx.compose.material3;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppBarKt$TwoRowsTopAppBar$4 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ v3.q<RowScope, Composer, Integer, r2> $actions;
    final /* synthetic */ TopAppBarColors $colors;
    final /* synthetic */ float $maxHeight;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ v3.p<Composer, Integer, r2> $navigationIcon;
    final /* synthetic */ float $pinnedHeight;
    final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
    final /* synthetic */ v3.p<Composer, Integer, r2> $smallTitle;
    final /* synthetic */ TextStyle $smallTitleTextStyle;
    final /* synthetic */ v3.p<Composer, Integer, r2> $title;
    final /* synthetic */ float $titleBottomPadding;
    final /* synthetic */ TextStyle $titleTextStyle;
    final /* synthetic */ WindowInsets $windowInsets;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AppBarKt$TwoRowsTopAppBar$4(Modifier modifier, v3.p<? super Composer, ? super Integer, r2> pVar, TextStyle textStyle, float f5, v3.p<? super Composer, ? super Integer, r2> pVar2, TextStyle textStyle2, v3.p<? super Composer, ? super Integer, r2> pVar3, v3.q<? super RowScope, ? super Composer, ? super Integer, r2> qVar, WindowInsets windowInsets, TopAppBarColors topAppBarColors, float f6, float f7, TopAppBarScrollBehavior topAppBarScrollBehavior, int i5, int i6, int i7) {
        super(2);
        this.$modifier = modifier;
        this.$title = pVar;
        this.$titleTextStyle = textStyle;
        this.$titleBottomPadding = f5;
        this.$smallTitle = pVar2;
        this.$smallTitleTextStyle = textStyle2;
        this.$navigationIcon = pVar3;
        this.$actions = qVar;
        this.$windowInsets = windowInsets;
        this.$colors = topAppBarColors;
        this.$maxHeight = f6;
        this.$pinnedHeight = f7;
        this.$scrollBehavior = topAppBarScrollBehavior;
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
        AppBarKt.m1560TwoRowsTopAppBartjU4iQQ(this.$modifier, this.$title, this.$titleTextStyle, this.$titleBottomPadding, this.$smallTitle, this.$smallTitleTextStyle, this.$navigationIcon, this.$actions, this.$windowInsets, this.$colors, this.$maxHeight, this.$pinnedHeight, this.$scrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
