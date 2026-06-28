package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.core.app.NotificationCompat;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavGraph;
import androidx.navigation.NavGraphNavigator;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorProvider;
import kotlin.i0;
import p4.m;
import v3.l;

@i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0007B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Landroidx/navigation/compose/ComposeNavGraphNavigator;", "Landroidx/navigation/NavGraphNavigator;", "navigatorProvider", "Landroidx/navigation/NavigatorProvider;", "(Landroidx/navigation/NavigatorProvider;)V", "createDestination", "Landroidx/navigation/NavGraph;", "ComposeNavGraph", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Navigator.Name(NotificationCompat.CATEGORY_NAVIGATION)
/* loaded from: classes2.dex */
public final class ComposeNavGraphNavigator extends NavGraphNavigator {

    @i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bRB\u0010\b\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0002¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rRB\u0010\u000f\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u0002¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rRB\u0010\u0012\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0002¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b\u0014\u0010\rRB\u0010\u0015\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u0002¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\t\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006\u001c"}, d2 = {"Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;", "Landroidx/navigation/NavGraph;", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/navigation/NavBackStackEntry;", "Landroidx/compose/animation/EnterTransition;", "Lu3/n;", "Lkotlin/u;", "enterTransition", "Lv3/l;", "getEnterTransition$navigation_compose_release", "()Lv3/l;", "setEnterTransition$navigation_compose_release", "(Lv3/l;)V", "Landroidx/compose/animation/ExitTransition;", "exitTransition", "getExitTransition$navigation_compose_release", "setExitTransition$navigation_compose_release", "popEnterTransition", "getPopEnterTransition$navigation_compose_release", "setPopEnterTransition$navigation_compose_release", "popExitTransition", "getPopExitTransition$navigation_compose_release", "setPopExitTransition$navigation_compose_release", "Landroidx/navigation/Navigator;", "navGraphNavigator", "<init>", "(Landroidx/navigation/Navigator;)V", "navigation-compose_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class ComposeNavGraph extends NavGraph {

        @m
        private l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> enterTransition;

        @m
        private l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> exitTransition;

        @m
        private l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> popEnterTransition;

        @m
        private l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> popExitTransition;

        public ComposeNavGraph(@p4.l Navigator<? extends NavGraph> navigator) {
            super(navigator);
        }

        @m
        public final l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> getEnterTransition$navigation_compose_release() {
            return this.enterTransition;
        }

        @m
        public final l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> getExitTransition$navigation_compose_release() {
            return this.exitTransition;
        }

        @m
        public final l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> getPopEnterTransition$navigation_compose_release() {
            return this.popEnterTransition;
        }

        @m
        public final l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> getPopExitTransition$navigation_compose_release() {
            return this.popExitTransition;
        }

        public final void setEnterTransition$navigation_compose_release(@m l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> lVar) {
            this.enterTransition = lVar;
        }

        public final void setExitTransition$navigation_compose_release(@m l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> lVar) {
            this.exitTransition = lVar;
        }

        public final void setPopEnterTransition$navigation_compose_release(@m l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> lVar) {
            this.popEnterTransition = lVar;
        }

        public final void setPopExitTransition$navigation_compose_release(@m l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> lVar) {
            this.popExitTransition = lVar;
        }
    }

    public ComposeNavGraphNavigator(@p4.l NavigatorProvider navigatorProvider) {
        super(navigatorProvider);
    }

    @Override // androidx.navigation.NavGraphNavigator, androidx.navigation.Navigator
    @p4.l
    public NavGraph createDestination() {
        return new ComposeNavGraph(this);
    }
}
