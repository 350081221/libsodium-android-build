package androidx.navigation;

import androidx.annotation.IdRes;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;

@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\n\u001a\u0017\u0010\b\u001a\u00020\u0007*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0086\u0002\u001a\u0015\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\u0002\u001a\u0015\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0086\n\u001a\u0015\u0010\r\u001a\u00020\n*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0086\n¨\u0006\u000e"}, d2 = {"Landroidx/navigation/NavGraph;", "", "id", "Landroidx/navigation/NavDestination;", "get", "", "route", "", "contains", "node", "Lkotlin/r2;", "plusAssign", "other", "minusAssign", "navigation-common_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class NavGraphKt {
    public static final boolean contains(@l NavGraph navGraph, @IdRes int i5) {
        l0.p(navGraph, "<this>");
        return navGraph.findNode(i5) != null;
    }

    @l
    public static final NavDestination get(@l NavGraph navGraph, @IdRes int i5) {
        l0.p(navGraph, "<this>");
        NavDestination findNode = navGraph.findNode(i5);
        if (findNode != null) {
            return findNode;
        }
        throw new IllegalArgumentException("No destination for " + i5 + " was found in " + navGraph);
    }

    public static final void minusAssign(@l NavGraph navGraph, @l NavDestination node) {
        l0.p(navGraph, "<this>");
        l0.p(node, "node");
        navGraph.remove(node);
    }

    public static final void plusAssign(@l NavGraph navGraph, @l NavDestination node) {
        l0.p(navGraph, "<this>");
        l0.p(node, "node");
        navGraph.addDestination(node);
    }

    public static final boolean contains(@l NavGraph navGraph, @l String route) {
        l0.p(navGraph, "<this>");
        l0.p(route, "route");
        return navGraph.findNode(route) != null;
    }

    @l
    public static final NavDestination get(@l NavGraph navGraph, @l String route) {
        l0.p(navGraph, "<this>");
        l0.p(route, "route");
        NavDestination findNode = navGraph.findNode(route);
        if (findNode != null) {
            return findNode;
        }
        throw new IllegalArgumentException("No destination for " + route + " was found in " + navGraph);
    }

    public static final void plusAssign(@l NavGraph navGraph, @l NavGraph other) {
        l0.p(navGraph, "<this>");
        l0.p(other, "other");
        navGraph.addAll(other);
    }
}
