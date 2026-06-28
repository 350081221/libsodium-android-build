package androidx.navigation.compose;

import android.annotation.SuppressLint;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.ComposeNavGraphNavigator;
import androidx.navigation.compose.ComposeNavigator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.e0;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import kotlin.m;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\u001aN\u0010\f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001aÜ\u0001\u0010\f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u001f\b\u0002\u0010\u0013\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\b\n2\u001f\b\u0002\u0010\u0015\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\u0002\b\n2\u001f\b\u0002\u0010\u0016\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\b\n2\u001f\b\u0002\u0010\u0017\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\u0002\b\n2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\f\u0010\u0018\u001a)\u0010\f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u001b\u001a·\u0001\u0010\f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u001f\b\u0002\u0010\u0013\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\b\n2\u001f\b\u0002\u0010\u0015\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\u0002\b\n2\u001f\b\u0002\u0010\u0016\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\b\n2\u001f\b\u0002\u0010\u0017\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\f\u0010\u001c\u001a\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0012*\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002\u001a\u001c\u0010 \u001a\u0004\u0018\u00010\u0014*\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002\u001a\u001c\u0010!\u001a\u0004\u0018\u00010\u0012*\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002\u001a\u001c\u0010\"\u001a\u0004\u0018\u00010\u0014*\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¨\u0006'²\u0006\u0012\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110#8\nX\u008a\u0084\u0002²\u0006\u0012\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00110#8\nX\u008a\u0084\u0002²\u0006\u0012\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00110#8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/navigation/NavHostController;", "navController", "", "startDestination", "Landroidx/compose/ui/Modifier;", "modifier", "route", "Lkotlin/Function1;", "Landroidx/navigation/NavGraphBuilder;", "Lkotlin/r2;", "Lkotlin/u;", "builder", "NavHost", "(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lv3/l;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/Alignment;", "contentAlignment", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/navigation/NavBackStackEntry;", "Landroidx/compose/animation/EnterTransition;", "enterTransition", "Landroidx/compose/animation/ExitTransition;", "exitTransition", "popEnterTransition", "popExitTransition", "(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lv3/l;Lv3/l;Lv3/l;Lv3/l;Lv3/l;Landroidx/compose/runtime/Composer;II)V", "Landroidx/navigation/NavGraph;", "graph", "(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lv3/l;Lv3/l;Lv3/l;Lv3/l;Landroidx/compose/runtime/Composer;II)V", "Landroidx/navigation/NavDestination;", "scope", "createEnterTransition", "createExitTransition", "createPopEnterTransition", "createPopExitTransition", "", "currentBackStack", "allVisibleEntries", "visibleEntries", "navigation-compose_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nNavHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHost.kt\nandroidx/navigation/compose/NavHostKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 NavController.kt\nandroidx/navigation/NavControllerKt\n+ 5 NavGraphBuilder.kt\nandroidx/navigation/NavGraphBuilderKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,368:1\n67#2,3:369\n66#2:372\n67#2,3:382\n66#2:385\n25#2:397\n25#2:404\n67#2,3:411\n66#2:414\n67#2,3:421\n66#2:424\n50#2:431\n49#2:432\n1097#3,3:373\n1100#3,3:379\n1097#3,3:386\n1100#3,3:392\n1097#3,6:398\n1097#3,6:405\n1097#3,6:415\n1097#3,6:425\n1097#3,6:433\n2603#4:376\n2603#4:389\n57#5,2:377\n57#5,2:390\n76#6:395\n150#7:396\n150#7:439\n81#8:440\n81#8:441\n81#8:442\n*S KotlinDebug\n*F\n+ 1 NavHost.kt\nandroidx/navigation/compose/NavHostKt\n*L\n84#1:369,3\n84#1:372\n130#1:382,3\n130#1:385\n231#1:397\n241#1:404\n244#1:411,3\n244#1:414\n258#1:421,3\n258#1:424\n321#1:431\n321#1:432\n84#1:373,3\n84#1:379,3\n130#1:386,3\n130#1:392,3\n231#1:398,6\n241#1:405,6\n244#1:415,6\n258#1:425,6\n321#1:433,6\n85#1:376\n131#1:389\n85#1:377,2\n131#1:390,2\n198#1:395\n210#1:396\n330#1:439\n214#1:440\n228#1:441\n231#1:442\n*E\n"})
/* loaded from: classes2.dex */
public final class NavHostKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @k(level = m.HIDDEN, message = "Deprecated in favor of NavHost that supports AnimatedContent")
    public static final /* synthetic */ void NavHost(NavHostController navHostController, String str, Modifier modifier, String str2, l lVar, Composer composer, int i5, int i6) {
        Composer startRestartGroup = composer.startRestartGroup(141827520);
        Modifier modifier2 = (i6 & 4) != 0 ? Modifier.Companion : modifier;
        String str3 = (i6 & 8) != 0 ? null : str2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(141827520, i5, -1, "androidx.navigation.compose.NavHost (NavHost.kt:80)");
        }
        startRestartGroup.startReplaceableGroup(1618982084);
        boolean changed = startRestartGroup.changed(str3) | startRestartGroup.changed(str) | startRestartGroup.changed(lVar);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHostController.getNavigatorProvider(), str, str3);
            lVar.invoke(navGraphBuilder);
            rememberedValue = navGraphBuilder.build();
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        NavHost(navHostController, (NavGraph) rememberedValue, modifier2, null, null, null, null, null, startRestartGroup, (i5 & 896) | 72, 248);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new NavHostKt$NavHost$2(navHostController, str, modifier2, str3, lVar, i5, i6));
    }

    private static final List<NavBackStackEntry> NavHost$lambda$3(State<? extends List<NavBackStackEntry>> state) {
        return state.getValue();
    }

    public static final List<NavBackStackEntry> NavHost$lambda$4(State<? extends List<NavBackStackEntry>> state) {
        return state.getValue();
    }

    public static final List<NavBackStackEntry> NavHost$lambda$6(State<? extends List<NavBackStackEntry>> state) {
        return state.getValue();
    }

    public static final /* synthetic */ List access$NavHost$lambda$6(State state) {
        return NavHost$lambda$6(state);
    }

    public static final EnterTransition createEnterTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> enterTransition$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> enterTransition$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getEnterTransition$navigation_compose_release();
            if (enterTransition$navigation_compose_release2 == null) {
                return null;
            }
            return enterTransition$navigation_compose_release2.invoke(animatedContentTransitionScope);
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (enterTransition$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getEnterTransition$navigation_compose_release()) == null) {
            return null;
        }
        return enterTransition$navigation_compose_release.invoke(animatedContentTransitionScope);
    }

    public static final ExitTransition createExitTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> exitTransition$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> exitTransition$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getExitTransition$navigation_compose_release();
            if (exitTransition$navigation_compose_release2 == null) {
                return null;
            }
            return exitTransition$navigation_compose_release2.invoke(animatedContentTransitionScope);
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (exitTransition$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getExitTransition$navigation_compose_release()) == null) {
            return null;
        }
        return exitTransition$navigation_compose_release.invoke(animatedContentTransitionScope);
    }

    public static final EnterTransition createPopEnterTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> popEnterTransition$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> popEnterTransition$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getPopEnterTransition$navigation_compose_release();
            if (popEnterTransition$navigation_compose_release2 == null) {
                return null;
            }
            return popEnterTransition$navigation_compose_release2.invoke(animatedContentTransitionScope);
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (popEnterTransition$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getPopEnterTransition$navigation_compose_release()) == null) {
            return null;
        }
        return popEnterTransition$navigation_compose_release.invoke(animatedContentTransitionScope);
    }

    public static final ExitTransition createPopExitTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> popExitTransition$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> popExitTransition$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getPopExitTransition$navigation_compose_release();
            if (popExitTransition$navigation_compose_release2 == null) {
                return null;
            }
            return popExitTransition$navigation_compose_release2.invoke(animatedContentTransitionScope);
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (popExitTransition$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getPopExitTransition$navigation_compose_release()) == null) {
            return null;
        }
        return popExitTransition$navigation_compose_release.invoke(animatedContentTransitionScope);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void NavHost(@p4.l NavHostController navHostController, @p4.l String str, @p4.m Modifier modifier, @p4.m Alignment alignment, @p4.m String str2, @p4.m l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> lVar, @p4.m l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> lVar2, @p4.m l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> lVar3, @p4.m l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> lVar4, @p4.l l<? super NavGraphBuilder, r2> lVar5, @p4.m Composer composer, int i5, int i6) {
        l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> lVar6;
        int i7;
        l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> lVar7;
        Composer startRestartGroup = composer.startRestartGroup(410432995);
        Modifier modifier2 = (i6 & 4) != 0 ? Modifier.Companion : modifier;
        Alignment center = (i6 & 8) != 0 ? Alignment.Companion.getCenter() : alignment;
        String str3 = (i6 & 16) != 0 ? null : str2;
        l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> lVar8 = (i6 & 32) != 0 ? NavHostKt$NavHost$3.INSTANCE : lVar;
        l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> lVar9 = (i6 & 64) != 0 ? NavHostKt$NavHost$4.INSTANCE : lVar2;
        if ((i6 & 128) != 0) {
            i7 = i5 & (-29360129);
            lVar6 = lVar8;
        } else {
            lVar6 = lVar3;
            i7 = i5;
        }
        if ((i6 & 256) != 0) {
            i7 &= -234881025;
            lVar7 = lVar9;
        } else {
            lVar7 = lVar4;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(410432995, i7, -1, "androidx.navigation.compose.NavHost (NavHost.kt:126)");
        }
        startRestartGroup.startReplaceableGroup(1618982084);
        boolean changed = startRestartGroup.changed(str3) | startRestartGroup.changed(str) | startRestartGroup.changed(lVar5);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHostController.getNavigatorProvider(), str, str3);
            lVar5.invoke(navGraphBuilder);
            rememberedValue = navGraphBuilder.build();
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        int i8 = (i7 & 896) | 72 | (i7 & 7168);
        int i9 = i7 >> 3;
        NavHost(navHostController, (NavGraph) rememberedValue, modifier2, center, lVar8, lVar9, lVar6, lVar7, startRestartGroup, i8 | (57344 & i9) | (458752 & i9) | (3670016 & i9) | (i9 & 29360128), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new NavHostKt$NavHost$6(navHostController, str, modifier2, center, str3, lVar8, lVar9, lVar6, lVar7, lVar5, i5, i6));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @k(level = m.HIDDEN, message = "Deprecated in favor of NavHost that supports AnimatedContent")
    public static final /* synthetic */ void NavHost(NavHostController navHostController, NavGraph navGraph, Modifier modifier, Composer composer, int i5, int i6) {
        Composer startRestartGroup = composer.startRestartGroup(-957014592);
        Modifier modifier2 = (i6 & 4) != 0 ? Modifier.Companion : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-957014592, i5, -1, "androidx.navigation.compose.NavHost (NavHost.kt:163)");
        }
        NavHost(navHostController, navGraph, modifier2, null, null, null, null, null, startRestartGroup, (i5 & 896) | 72, 248);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new NavHostKt$NavHost$7(navHostController, navGraph, modifier2, i5, i6));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @SuppressLint({"StateFlowValueCalledInComposition"})
    public static final void NavHost(@p4.l NavHostController navHostController, @p4.l NavGraph navGraph, @p4.m Modifier modifier, @p4.m Alignment alignment, @p4.m l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> lVar, @p4.m l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> lVar2, @p4.m l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> lVar3, @p4.m l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> lVar4, @p4.m Composer composer, int i5, int i6) {
        l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> lVar5;
        int i7;
        l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> lVar6;
        Object s32;
        l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> lVar7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(-1818191915);
        Modifier modifier2 = (i6 & 4) != 0 ? Modifier.Companion : modifier;
        Alignment center = (i6 & 8) != 0 ? Alignment.Companion.getCenter() : alignment;
        l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> lVar8 = (i6 & 16) != 0 ? NavHostKt$NavHost$8.INSTANCE : lVar;
        l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> lVar9 = (i6 & 32) != 0 ? NavHostKt$NavHost$9.INSTANCE : lVar2;
        if ((i6 & 64) != 0) {
            i7 = i5 & (-3670017);
            lVar5 = lVar8;
        } else {
            lVar5 = lVar3;
            i7 = i5;
        }
        if ((i6 & 128) != 0) {
            i7 &= -29360129;
            lVar6 = lVar9;
        } else {
            lVar6 = lVar4;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1818191915, i7, -1, "androidx.navigation.compose.NavHost (NavHost.kt:195)");
        }
        LifecycleOwner lifecycleOwner = (LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, LocalViewModelStoreOwner.$stable);
        if (current != null) {
            navHostController.setViewModelStore(current.getViewModelStore());
            navHostController.setGraph(navGraph);
            Navigator navigator = navHostController.getNavigatorProvider().getNavigator(ComposeNavigator.NAME);
            ComposeNavigator composeNavigator = navigator instanceof ComposeNavigator ? (ComposeNavigator) navigator : null;
            if (composeNavigator == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new NavHostKt$NavHost$composeNavigator$1(navHostController, navGraph, modifier2, center, lVar8, lVar9, lVar5, lVar6, i5, i6));
                return;
            }
            BackHandlerKt.BackHandler(NavHost$lambda$3(SnapshotStateKt.collectAsState(composeNavigator.getBackStack(), null, startRestartGroup, 8, 1)).size() > 1, new NavHostKt$NavHost$10(navHostController), startRestartGroup, 0, 0);
            EffectsKt.DisposableEffect(lifecycleOwner, new NavHostKt$NavHost$11(navHostController, lifecycleOwner), startRestartGroup, 8);
            SaveableStateHolder rememberSaveableStateHolder = SaveableStateHolderKt.rememberSaveableStateHolder(startRestartGroup, 0);
            State collectAsState = SnapshotStateKt.collectAsState(navHostController.getVisibleEntries(), null, startRestartGroup, 8, 1);
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt.derivedStateOf(new NavHostKt$NavHost$visibleEntries$2$1(collectAsState));
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            State state = (State) rememberedValue;
            s32 = e0.s3(NavHost$lambda$6(state));
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) s32;
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new LinkedHashMap();
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            Map map = (Map) rememberedValue2;
            startRestartGroup.startReplaceableGroup(1822177954);
            if (navBackStackEntry != null) {
                startRestartGroup.startReplaceableGroup(1618982084);
                boolean changed = startRestartGroup.changed(composeNavigator) | startRestartGroup.changed(lVar5) | startRestartGroup.changed(lVar8);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed || rememberedValue3 == companion.getEmpty()) {
                    rememberedValue3 = new NavHostKt$NavHost$finalEnter$1$1(composeNavigator, lVar5, lVar8);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceableGroup();
                l lVar10 = (l) rememberedValue3;
                startRestartGroup.startReplaceableGroup(1618982084);
                boolean changed2 = startRestartGroup.changed(composeNavigator) | startRestartGroup.changed(lVar6) | startRestartGroup.changed(lVar9);
                Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue4 == companion.getEmpty()) {
                    rememberedValue4 = new NavHostKt$NavHost$finalExit$1$1(composeNavigator, lVar6, lVar9);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                startRestartGroup.endReplaceableGroup();
                lVar7 = lVar6;
                Transition updateTransition = TransitionKt.updateTransition(navBackStackEntry, "entry", startRestartGroup, 56, 0);
                NavHostKt$NavHost$12 navHostKt$NavHost$12 = new NavHostKt$NavHost$12(map, composeNavigator, lVar10, (l) rememberedValue4, state);
                NavHostKt$NavHost$13 navHostKt$NavHost$13 = NavHostKt$NavHost$13.INSTANCE;
                ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, -1440061047, true, new NavHostKt$NavHost$14(rememberSaveableStateHolder, state));
                int i9 = ((i7 >> 3) & 112) | 221184 | (i7 & 7168);
                ComposeNavigator composeNavigator2 = composeNavigator;
                i8 = 0;
                AnimatedContentKt.AnimatedContent(updateTransition, modifier2, navHostKt$NavHost$12, center, navHostKt$NavHost$13, composableLambda, startRestartGroup, i9, 0);
                EffectsKt.LaunchedEffect(updateTransition.getCurrentState(), updateTransition.getTargetState(), new NavHostKt$NavHost$15(updateTransition, map, state, composeNavigator2, null), startRestartGroup, 584);
                Boolean bool = Boolean.TRUE;
                startRestartGroup.startReplaceableGroup(511388516);
                boolean changed3 = startRestartGroup.changed(state) | startRestartGroup.changed(composeNavigator2);
                Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (changed3 || rememberedValue5 == companion.getEmpty()) {
                    rememberedValue5 = new NavHostKt$NavHost$16$1(state, composeNavigator2);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                startRestartGroup.endReplaceableGroup();
                EffectsKt.DisposableEffect(bool, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue5, startRestartGroup, 6);
            } else {
                lVar7 = lVar6;
                i8 = 0;
            }
            startRestartGroup.endReplaceableGroup();
            Navigator navigator2 = navHostController.getNavigatorProvider().getNavigator(DialogNavigator.NAME);
            DialogNavigator dialogNavigator = navigator2 instanceof DialogNavigator ? (DialogNavigator) navigator2 : null;
            if (dialogNavigator == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
                if (endRestartGroup2 == null) {
                    return;
                }
                endRestartGroup2.updateScope(new NavHostKt$NavHost$dialogNavigator$1(navHostController, navGraph, modifier2, center, lVar8, lVar9, lVar5, lVar7, i5, i6));
                return;
            }
            DialogHostKt.DialogHost(dialogNavigator, startRestartGroup, i8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup3 = startRestartGroup.endRestartGroup();
            if (endRestartGroup3 == null) {
                return;
            }
            endRestartGroup3.updateScope(new NavHostKt$NavHost$17(navHostController, navGraph, modifier2, center, lVar8, lVar9, lVar5, lVar7, i5, i6));
            return;
        }
        throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner".toString());
    }
}
