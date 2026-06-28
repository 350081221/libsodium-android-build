package androidx.navigation;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.navigation.Navigator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.v;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.flow.t0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0016J*\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\f0\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/navigation/NavGraphNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavGraph;", "Landroidx/navigation/NavBackStackEntry;", "entry", "Landroidx/navigation/NavOptions;", "navOptions", "Landroidx/navigation/Navigator$Extras;", "navigatorExtras", "Lkotlin/r2;", "navigate", "createDestination", "", "entries", "Landroidx/navigation/NavigatorProvider;", "navigatorProvider", "Landroidx/navigation/NavigatorProvider;", "Lkotlinx/coroutines/flow/t0;", "getBackStack", "()Lkotlinx/coroutines/flow/t0;", "backStack", "<init>", "(Landroidx/navigation/NavigatorProvider;)V", "navigation-common_release"}, k = 1, mv = {1, 8, 0})
@Navigator.Name(NotificationCompat.CATEGORY_NAVIGATION)
/* loaded from: classes2.dex */
public class NavGraphNavigator extends Navigator<NavGraph> {

    @l
    private final NavigatorProvider navigatorProvider;

    public NavGraphNavigator(@l NavigatorProvider navigatorProvider) {
        l0.p(navigatorProvider, "navigatorProvider");
        this.navigatorProvider = navigatorProvider;
    }

    @l
    public final t0<List<NavBackStackEntry>> getBackStack() {
        return getState().getBackStack();
    }

    @Override // androidx.navigation.Navigator
    public void navigate(@l List<NavBackStackEntry> entries, @m NavOptions navOptions, @m Navigator.Extras extras) {
        l0.p(entries, "entries");
        Iterator<NavBackStackEntry> it = entries.iterator();
        while (it.hasNext()) {
            navigate(it.next(), navOptions, extras);
        }
    }

    @Override // androidx.navigation.Navigator
    @l
    public NavGraph createDestination() {
        return new NavGraph(this);
    }

    private final void navigate(NavBackStackEntry navBackStackEntry, NavOptions navOptions, Navigator.Extras extras) {
        NavDestination findNode;
        List<NavBackStackEntry> k5;
        NavDestination destination = navBackStackEntry.getDestination();
        l0.n(destination, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        NavGraph navGraph = (NavGraph) destination;
        Bundle arguments = navBackStackEntry.getArguments();
        int startDestinationId = navGraph.getStartDestinationId();
        String startDestinationRoute = navGraph.getStartDestinationRoute();
        if (!((startDestinationId == 0 && startDestinationRoute == null) ? false : true)) {
            throw new IllegalStateException(("no start destination defined via app:startDestination for " + navGraph.getDisplayName()).toString());
        }
        if (startDestinationRoute != null) {
            findNode = navGraph.findNode(startDestinationRoute, false);
        } else {
            findNode = navGraph.findNode(startDestinationId, false);
        }
        if (findNode != null) {
            Navigator navigator = this.navigatorProvider.getNavigator(findNode.getNavigatorName());
            k5 = v.k(getState().createBackStackEntry(findNode, findNode.addInDefaultArgs(arguments)));
            navigator.navigate(k5, navOptions, extras);
        } else {
            throw new IllegalArgumentException("navigation destination " + navGraph.getStartDestDisplayName() + " is not a direct child of this NavGraph");
        }
    }
}
