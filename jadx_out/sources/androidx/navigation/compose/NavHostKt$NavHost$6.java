package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavGraphBuilder;
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
public final class NavHostKt$NavHost$6 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ l<NavGraphBuilder, r2> $builder;
    final /* synthetic */ Alignment $contentAlignment;
    final /* synthetic */ l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> $enterTransition;
    final /* synthetic */ l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> $exitTransition;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ NavHostController $navController;
    final /* synthetic */ l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> $popEnterTransition;
    final /* synthetic */ l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> $popExitTransition;
    final /* synthetic */ String $route;
    final /* synthetic */ String $startDestination;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavHostKt$NavHost$6(NavHostController navHostController, String str, Modifier modifier, Alignment alignment, String str2, l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> lVar, l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> lVar2, l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> lVar3, l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> lVar4, l<? super NavGraphBuilder, r2> lVar5, int i5, int i6) {
        super(2);
        this.$navController = navHostController;
        this.$startDestination = str;
        this.$modifier = modifier;
        this.$contentAlignment = alignment;
        this.$route = str2;
        this.$enterTransition = lVar;
        this.$exitTransition = lVar2;
        this.$popEnterTransition = lVar3;
        this.$popExitTransition = lVar4;
        this.$builder = lVar5;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        NavHostKt.NavHost(this.$navController, this.$startDestination, this.$modifier, this.$contentAlignment, this.$route, this.$enterTransition, this.$exitTransition, this.$popEnterTransition, this.$popExitTransition, this.$builder, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
