package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.compose.ui.window.SecureFlagPolicy;
import androidx.core.app.NotificationCompat;
import androidx.navigation.NamedNavArgument;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavGraph;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.compose.ComposeNavGraphNavigator;
import androidx.navigation.compose.ComposeNavigator;
import androidx.navigation.compose.DialogNavigator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import kotlin.m;
import kotlin.r2;
import p4.l;
import v3.q;
import v3.r;

@i0(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aT\u0010\r\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u0085\u0002\u0010\r\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032(\b\u0002\u0010\u0013\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\b¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122(\b\u0002\u0010\u0015\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\b¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122(\b\u0002\u0010\u0016\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\b¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122(\b\u0002\u0010\u0017\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\b¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122\"\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0018¢\u0006\u0002\b\u000b¢\u0006\u0002\b\u0012¢\u0006\u0004\b\r\u0010\u001a\u001aU\u0010\u001d\u001a\u00020\n*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u0012H\u0007\u001aç\u0001\u0010\u001d\u001a\u00020\n*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032#\b\u0002\u0010\u0013\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\b¢\u0006\u0002\b\u00122#\b\u0002\u0010\u0015\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\b¢\u0006\u0002\b\u00122#\b\u0002\u0010\u0016\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\b¢\u0006\u0002\b\u00122#\b\u0002\u0010\u0017\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\b¢\u0006\u0002\b\u00122\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u0012\u001a\\\u0010 \u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Landroidx/navigation/NavGraphBuilder;", "", "route", "", "Landroidx/navigation/NamedNavArgument;", "arguments", "Landroidx/navigation/NavDeepLink;", "deepLinks", "Lkotlin/Function1;", "Landroidx/navigation/NavBackStackEntry;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "content", ComposeNavigator.NAME, "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lv3/q;)V", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/compose/animation/EnterTransition;", "Lu3/n;", "Lkotlin/u;", "enterTransition", "Landroidx/compose/animation/ExitTransition;", "exitTransition", "popEnterTransition", "popExitTransition", "Lkotlin/Function2;", "Landroidx/compose/animation/AnimatedContentScope;", "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lv3/l;Lv3/l;Lv3/l;Lv3/l;Lv3/r;)V", "startDestination", "builder", NotificationCompat.CATEGORY_NAVIGATION, "Landroidx/compose/ui/window/DialogProperties;", "dialogProperties", DialogNavigator.NAME, "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/window/DialogProperties;Lv3/q;)V", "navigation-compose_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nNavGraphBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraphBuilder.kt\nandroidx/navigation/compose/NavGraphBuilderKt\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,236:1\n161#2:237\n161#2:242\n161#2:255\n1855#3,2:238\n1855#3,2:240\n1855#3,2:243\n1855#3,2:245\n1855#3,2:247\n1855#3,2:249\n1855#3,2:251\n1855#3,2:253\n1855#3,2:256\n1855#3,2:258\n*S KotlinDebug\n*F\n+ 1 NavGraphBuilder.kt\nandroidx/navigation/compose/NavGraphBuilderKt\n*L\n51#1:237\n96#1:242\n222#1:255\n56#1:238,2\n59#1:240,2\n100#1:243,2\n103#1:245,2\n138#1:247,2\n141#1:249,2\n183#1:251,2\n186#1:253,2\n227#1:256,2\n230#1:258,2\n*E\n"})
/* loaded from: classes2.dex */
public final class NavGraphBuilderKt {
    @k(level = m.HIDDEN, message = "Deprecated in favor of composable builder that supports AnimatedContent")
    public static final /* synthetic */ void composable(NavGraphBuilder navGraphBuilder, String str, List list, List list2, q qVar) {
        ComposeNavigator.Destination destination = new ComposeNavigator.Destination((ComposeNavigator) navGraphBuilder.getProvider().getNavigator(ComposeNavigator.class), (r<? super AnimatedContentScope, NavBackStackEntry, ? super Composer, ? super Integer, r2>) ComposableLambdaKt.composableLambdaInstance(484185514, true, new NavGraphBuilderKt$composable$1(qVar)));
        destination.setRoute(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NamedNavArgument namedNavArgument = (NamedNavArgument) it.next();
            destination.addArgument(namedNavArgument.component1(), namedNavArgument.component2());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            destination.addDeepLink((NavDeepLink) it2.next());
        }
        navGraphBuilder.addDestination(destination);
    }

    public static /* synthetic */ void composable$default(NavGraphBuilder navGraphBuilder, String str, List list, List list2, q qVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            list = w.E();
        }
        if ((i5 & 4) != 0) {
            list2 = w.E();
        }
        composable(navGraphBuilder, str, list, list2, qVar);
    }

    public static final void dialog(@l NavGraphBuilder navGraphBuilder, @l String str, @l List<NamedNavArgument> list, @l List<NavDeepLink> list2, @l DialogProperties dialogProperties, @l q<? super NavBackStackEntry, ? super Composer, ? super Integer, r2> qVar) {
        DialogNavigator.Destination destination = new DialogNavigator.Destination((DialogNavigator) navGraphBuilder.getProvider().getNavigator(DialogNavigator.class), dialogProperties, qVar);
        destination.setRoute(str);
        for (NamedNavArgument namedNavArgument : list) {
            destination.addArgument(namedNavArgument.component1(), namedNavArgument.component2());
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            destination.addDeepLink((NavDeepLink) it.next());
        }
        navGraphBuilder.addDestination(destination);
    }

    public static /* synthetic */ void dialog$default(NavGraphBuilder navGraphBuilder, String str, List list, List list2, DialogProperties dialogProperties, q qVar, int i5, Object obj) {
        List list3;
        List list4;
        DialogProperties dialogProperties2;
        List E;
        List E2;
        if ((i5 & 2) != 0) {
            E2 = w.E();
            list3 = E2;
        } else {
            list3 = list;
        }
        if ((i5 & 4) != 0) {
            E = w.E();
            list4 = E;
        } else {
            list4 = list2;
        }
        if ((i5 & 8) != 0) {
            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (kotlin.jvm.internal.w) null);
        } else {
            dialogProperties2 = dialogProperties;
        }
        dialog(navGraphBuilder, str, list3, list4, dialogProperties2, qVar);
    }

    @k(level = m.HIDDEN, message = "Deprecated in favor of navigation builder that supports AnimatedContent")
    public static final /* synthetic */ void navigation(NavGraphBuilder navGraphBuilder, String str, String str2, List list, List list2, v3.l lVar) {
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.getProvider(), str, str2);
        lVar.invoke(navGraphBuilder2);
        NavGraph build = navGraphBuilder2.build();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NamedNavArgument namedNavArgument = (NamedNavArgument) it.next();
            build.addArgument(namedNavArgument.component1(), namedNavArgument.component2());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            build.addDeepLink((NavDeepLink) it2.next());
        }
        navGraphBuilder.addDestination(build);
    }

    public static /* synthetic */ void navigation$default(NavGraphBuilder navGraphBuilder, String str, String str2, List list, List list2, v3.l lVar, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            list = w.E();
        }
        List list3 = list;
        if ((i5 & 8) != 0) {
            list2 = w.E();
        }
        navigation(navGraphBuilder, str, str2, list3, list2, lVar);
    }

    public static /* synthetic */ void composable$default(NavGraphBuilder navGraphBuilder, String str, List list, List list2, v3.l lVar, v3.l lVar2, v3.l lVar3, v3.l lVar4, r rVar, int i5, Object obj) {
        List list3;
        List list4;
        List E;
        List E2;
        if ((i5 & 2) != 0) {
            E2 = w.E();
            list3 = E2;
        } else {
            list3 = list;
        }
        if ((i5 & 4) != 0) {
            E = w.E();
            list4 = E;
        } else {
            list4 = list2;
        }
        v3.l lVar5 = (i5 & 8) != 0 ? null : lVar;
        v3.l lVar6 = (i5 & 16) != 0 ? null : lVar2;
        composable(navGraphBuilder, str, list3, list4, lVar5, lVar6, (i5 & 32) != 0 ? lVar5 : lVar3, (i5 & 64) != 0 ? lVar6 : lVar4, rVar);
    }

    public static /* synthetic */ void navigation$default(NavGraphBuilder navGraphBuilder, String str, String str2, List list, List list2, v3.l lVar, v3.l lVar2, v3.l lVar3, v3.l lVar4, v3.l lVar5, int i5, Object obj) {
        List list3;
        List list4;
        List E;
        List E2;
        if ((i5 & 4) != 0) {
            E2 = w.E();
            list3 = E2;
        } else {
            list3 = list;
        }
        if ((i5 & 8) != 0) {
            E = w.E();
            list4 = E;
        } else {
            list4 = list2;
        }
        v3.l lVar6 = (i5 & 16) != 0 ? null : lVar;
        v3.l lVar7 = (i5 & 32) != 0 ? null : lVar2;
        navigation(navGraphBuilder, str, str2, list3, list4, lVar6, lVar7, (i5 & 64) != 0 ? lVar6 : lVar3, (i5 & 128) != 0 ? lVar7 : lVar4, lVar5);
    }

    public static final void navigation(@l NavGraphBuilder navGraphBuilder, @l String str, @l String str2, @l List<NamedNavArgument> list, @l List<NavDeepLink> list2, @p4.m v3.l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> lVar, @p4.m v3.l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> lVar2, @p4.m v3.l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> lVar3, @p4.m v3.l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> lVar4, @l v3.l<? super NavGraphBuilder, r2> lVar5) {
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.getProvider(), str, str2);
        lVar5.invoke(navGraphBuilder2);
        NavGraph build = navGraphBuilder2.build();
        for (NamedNavArgument namedNavArgument : list) {
            build.addArgument(namedNavArgument.component1(), namedNavArgument.component2());
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            build.addDeepLink((NavDeepLink) it.next());
        }
        if (build instanceof ComposeNavGraphNavigator.ComposeNavGraph) {
            ComposeNavGraphNavigator.ComposeNavGraph composeNavGraph = (ComposeNavGraphNavigator.ComposeNavGraph) build;
            composeNavGraph.setEnterTransition$navigation_compose_release(lVar);
            composeNavGraph.setExitTransition$navigation_compose_release(lVar2);
            composeNavGraph.setPopEnterTransition$navigation_compose_release(lVar3);
            composeNavGraph.setPopExitTransition$navigation_compose_release(lVar4);
        }
        navGraphBuilder.addDestination(build);
    }

    public static final void composable(@l NavGraphBuilder navGraphBuilder, @l String str, @l List<NamedNavArgument> list, @l List<NavDeepLink> list2, @p4.m v3.l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> lVar, @p4.m v3.l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> lVar2, @p4.m v3.l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> lVar3, @p4.m v3.l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> lVar4, @l r<? super AnimatedContentScope, ? super NavBackStackEntry, ? super Composer, ? super Integer, r2> rVar) {
        ComposeNavigator.Destination destination = new ComposeNavigator.Destination((ComposeNavigator) navGraphBuilder.getProvider().getNavigator(ComposeNavigator.class), (r<? super AnimatedContentScope, NavBackStackEntry, ? super Composer, ? super Integer, r2>) rVar);
        destination.setRoute(str);
        for (NamedNavArgument namedNavArgument : list) {
            destination.addArgument(namedNavArgument.component1(), namedNavArgument.component2());
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            destination.addDeepLink((NavDeepLink) it.next());
        }
        destination.setEnterTransition$navigation_compose_release(lVar);
        destination.setExitTransition$navigation_compose_release(lVar2);
        destination.setPopEnterTransition$navigation_compose_release(lVar3);
        destination.setPopExitTransition$navigation_compose_release(lVar4);
        navGraphBuilder.addDestination(destination);
    }
}
