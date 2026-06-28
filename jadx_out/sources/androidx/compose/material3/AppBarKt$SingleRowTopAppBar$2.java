package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.material3.tokens.TopAppBarSmallTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt$SingleRowTopAppBar$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,2283:1\n74#2:2284\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt$SingleRowTopAppBar$2\n*L\n1692#1:2284\n*E\n"})
/* loaded from: classes.dex */
public final class AppBarKt$SingleRowTopAppBar$2 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ v3.p<Composer, Integer, r2> $actionsRow;
    final /* synthetic */ boolean $centeredTitle;
    final /* synthetic */ TopAppBarColors $colors;
    final /* synthetic */ v3.p<Composer, Integer, r2> $navigationIcon;
    final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
    final /* synthetic */ v3.p<Composer, Integer, r2> $title;
    final /* synthetic */ TextStyle $titleTextStyle;
    final /* synthetic */ WindowInsets $windowInsets;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AppBarKt$SingleRowTopAppBar$2(WindowInsets windowInsets, TopAppBarColors topAppBarColors, v3.p<? super Composer, ? super Integer, r2> pVar, TextStyle textStyle, boolean z4, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, TopAppBarScrollBehavior topAppBarScrollBehavior) {
        super(2);
        this.$windowInsets = windowInsets;
        this.$colors = topAppBarColors;
        this.$title = pVar;
        this.$titleTextStyle = textStyle;
        this.$centeredTitle = z4;
        this.$navigationIcon = pVar2;
        this.$actionsRow = pVar3;
        this.$scrollBehavior = topAppBarScrollBehavior;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@p4.m Composer composer, int i5) {
        TopAppBarState state;
        if ((i5 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(376925230, i5, -1, "androidx.compose.material3.SingleRowTopAppBar.<anonymous> (AppBar.kt:1691)");
        }
        Object consume = composer.consume(CompositionLocalsKt.getLocalDensity());
        TopAppBarScrollBehavior topAppBarScrollBehavior = this.$scrollBehavior;
        float mo304toPx0680j_4 = ((Density) consume).mo304toPx0680j_4(TopAppBarSmallTokens.INSTANCE.m3189getContainerHeightD9Ej5fM()) + ((topAppBarScrollBehavior == null || (state = topAppBarScrollBehavior.getState()) == null) ? 0.0f : state.getHeightOffset());
        Modifier clipToBounds = ClipKt.clipToBounds(WindowInsetsPaddingKt.windowInsetsPadding(Modifier.Companion, this.$windowInsets));
        long m2604getNavigationIconContentColor0d7_KjU = this.$colors.m2604getNavigationIconContentColor0d7_KjU();
        long m2606getTitleContentColor0d7_KjU = this.$colors.m2606getTitleContentColor0d7_KjU();
        long m2602getActionIconContentColor0d7_KjU = this.$colors.m2602getActionIconContentColor0d7_KjU();
        v3.p<Composer, Integer, r2> pVar = this.$title;
        TextStyle textStyle = this.$titleTextStyle;
        Arrangement arrangement = Arrangement.INSTANCE;
        AppBarKt.m1559TopAppBarLayoutkXwM9vE(clipToBounds, mo304toPx0680j_4, m2604getNavigationIconContentColor0d7_KjU, m2606getTitleContentColor0d7_KjU, m2602getActionIconContentColor0d7_KjU, pVar, textStyle, 1.0f, arrangement.getCenter(), this.$centeredTitle ? arrangement.getCenter() : arrangement.getStart(), 0, false, this.$navigationIcon, this.$actionsRow, composer, 113246208, 3126);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
