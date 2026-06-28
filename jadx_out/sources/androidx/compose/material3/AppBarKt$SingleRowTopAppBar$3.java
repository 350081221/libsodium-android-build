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
public final class AppBarKt$SingleRowTopAppBar$3 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ v3.q<RowScope, Composer, Integer, r2> $actions;
    final /* synthetic */ boolean $centeredTitle;
    final /* synthetic */ TopAppBarColors $colors;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ v3.p<Composer, Integer, r2> $navigationIcon;
    final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
    final /* synthetic */ v3.p<Composer, Integer, r2> $title;
    final /* synthetic */ TextStyle $titleTextStyle;
    final /* synthetic */ WindowInsets $windowInsets;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AppBarKt$SingleRowTopAppBar$3(Modifier modifier, v3.p<? super Composer, ? super Integer, r2> pVar, TextStyle textStyle, boolean z4, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.q<? super RowScope, ? super Composer, ? super Integer, r2> qVar, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i5, int i6) {
        super(2);
        this.$modifier = modifier;
        this.$title = pVar;
        this.$titleTextStyle = textStyle;
        this.$centeredTitle = z4;
        this.$navigationIcon = pVar2;
        this.$actions = qVar;
        this.$windowInsets = windowInsets;
        this.$colors = topAppBarColors;
        this.$scrollBehavior = topAppBarScrollBehavior;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        AppBarKt.SingleRowTopAppBar(this.$modifier, this.$title, this.$titleTextStyle, this.$centeredTitle, this.$navigationIcon, this.$actions, this.$windowInsets, this.$colors, this.$scrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
