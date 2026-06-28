package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppBarKt$TopAppBarLayout$3 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ long $actionIconContentColor;
    final /* synthetic */ v3.p<Composer, Integer, r2> $actions;
    final /* synthetic */ float $heightPx;
    final /* synthetic */ boolean $hideTitleSemantics;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ v3.p<Composer, Integer, r2> $navigationIcon;
    final /* synthetic */ long $navigationIconContentColor;
    final /* synthetic */ v3.p<Composer, Integer, r2> $title;
    final /* synthetic */ float $titleAlpha;
    final /* synthetic */ int $titleBottomPadding;
    final /* synthetic */ long $titleContentColor;
    final /* synthetic */ Arrangement.Horizontal $titleHorizontalArrangement;
    final /* synthetic */ TextStyle $titleTextStyle;
    final /* synthetic */ Arrangement.Vertical $titleVerticalArrangement;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AppBarKt$TopAppBarLayout$3(Modifier modifier, float f5, long j5, long j6, long j7, v3.p<? super Composer, ? super Integer, r2> pVar, TextStyle textStyle, float f6, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, int i5, boolean z4, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, int i6, int i7) {
        super(2);
        this.$modifier = modifier;
        this.$heightPx = f5;
        this.$navigationIconContentColor = j5;
        this.$titleContentColor = j6;
        this.$actionIconContentColor = j7;
        this.$title = pVar;
        this.$titleTextStyle = textStyle;
        this.$titleAlpha = f6;
        this.$titleVerticalArrangement = vertical;
        this.$titleHorizontalArrangement = horizontal;
        this.$titleBottomPadding = i5;
        this.$hideTitleSemantics = z4;
        this.$navigationIcon = pVar2;
        this.$actions = pVar3;
        this.$$changed = i6;
        this.$$changed1 = i7;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        AppBarKt.m1559TopAppBarLayoutkXwM9vE(this.$modifier, this.$heightPx, this.$navigationIconContentColor, this.$titleContentColor, this.$actionIconContentColor, this.$title, this.$titleTextStyle, this.$titleAlpha, this.$titleVerticalArrangement, this.$titleHorizontalArrangement, this.$titleBottomPadding, this.$hideTitleSemantics, this.$navigationIcon, this.$actions, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1));
    }
}
