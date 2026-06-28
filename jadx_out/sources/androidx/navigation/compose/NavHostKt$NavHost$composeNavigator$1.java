package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavGraph;
import androidx.navigation.NavHostController;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavHostKt$NavHost$composeNavigator$1 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Alignment $contentAlignment;
    final /* synthetic */ l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> $enterTransition;
    final /* synthetic */ l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> $exitTransition;
    final /* synthetic */ NavGraph $graph;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ NavHostController $navController;
    final /* synthetic */ l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> $popEnterTransition;
    final /* synthetic */ l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> $popExitTransition;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavHostKt$NavHost$composeNavigator$1(NavHostController navHostController, NavGraph navGraph, Modifier modifier, Alignment alignment, l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> lVar, l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> lVar2, l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> lVar3, l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> lVar4, int i5, int i6) {
        super(2);
        this.$navController = navHostController;
        this.$graph = navGraph;
        this.$modifier = modifier;
        this.$contentAlignment = alignment;
        this.$enterTransition = lVar;
        this.$exitTransition = lVar2;
        this.$popEnterTransition = lVar3;
        this.$popExitTransition = lVar4;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        NavHostKt.NavHost(this.$navController, this.$graph, this.$modifier, this.$contentAlignment, this.$enterTransition, this.$exitTransition, this.$popEnterTransition, this.$popExitTransition, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
