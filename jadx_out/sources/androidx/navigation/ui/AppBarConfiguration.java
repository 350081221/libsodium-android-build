package androidx.navigation.ui;

import android.annotation.SuppressLint;
import android.view.Menu;
import androidx.customview.widget.Openable;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k;
import p4.l;
import p4.m;

@i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B)\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8G¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, d2 = {"Landroidx/navigation/ui/AppBarConfiguration;", "", "topLevelDestinations", "", "", "openableLayout", "Landroidx/customview/widget/Openable;", "fallbackOnNavigateUpListener", "Landroidx/navigation/ui/AppBarConfiguration$OnNavigateUpListener;", "(Ljava/util/Set;Landroidx/customview/widget/Openable;Landroidx/navigation/ui/AppBarConfiguration$OnNavigateUpListener;)V", "drawerLayout", "Landroidx/drawerlayout/widget/DrawerLayout;", "getDrawerLayout", "()Landroidx/drawerlayout/widget/DrawerLayout;", "getFallbackOnNavigateUpListener", "()Landroidx/navigation/ui/AppBarConfiguration$OnNavigateUpListener;", "getOpenableLayout", "()Landroidx/customview/widget/Openable;", "getTopLevelDestinations", "()Ljava/util/Set;", "isTopLevelDestination", "", "destination", "Landroidx/navigation/NavDestination;", "Builder", "OnNavigateUpListener", "navigation-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAppBarConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBarConfiguration.kt\nandroidx/navigation/ui/AppBarConfiguration\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,307:1\n1229#2,2:308\n*S KotlinDebug\n*F\n+ 1 AppBarConfiguration.kt\nandroidx/navigation/ui/AppBarConfiguration\n*L\n100#1:308,2\n*E\n"})
/* loaded from: classes2.dex */
public final class AppBarConfiguration {

    @m
    private final OnNavigateUpListener fallbackOnNavigateUpListener;

    @m
    private final Openable openableLayout;

    @l
    private final Set<Integer> topLevelDestinations;

    @i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/navigation/ui/AppBarConfiguration$OnNavigateUpListener;", "", "onNavigateUp", "", "navigation-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public interface OnNavigateUpListener {
        boolean onNavigateUp();
    }

    private AppBarConfiguration(Set<Integer> set, Openable openable, OnNavigateUpListener onNavigateUpListener) {
        this.topLevelDestinations = set;
        this.openableLayout = openable;
        this.fallbackOnNavigateUpListener = onNavigateUpListener;
    }

    public /* synthetic */ AppBarConfiguration(Set set, Openable openable, OnNavigateUpListener onNavigateUpListener, w wVar) {
        this(set, openable, onNavigateUpListener);
    }

    @k(message = "Use {@link #getOpenableLayout()}.")
    @m
    public final DrawerLayout getDrawerLayout() {
        Openable openable = this.openableLayout;
        if (openable instanceof DrawerLayout) {
            return (DrawerLayout) openable;
        }
        return null;
    }

    @m
    public final OnNavigateUpListener getFallbackOnNavigateUpListener() {
        return this.fallbackOnNavigateUpListener;
    }

    @m
    public final Openable getOpenableLayout() {
        return this.openableLayout;
    }

    @l
    public final Set<Integer> getTopLevelDestinations() {
        return this.topLevelDestinations;
    }

    public final boolean isTopLevelDestination(@l NavDestination destination) {
        boolean z4;
        l0.p(destination, "destination");
        Iterator<NavDestination> it = NavDestination.Companion.getHierarchy(destination).iterator();
        do {
            z4 = false;
            if (!it.hasNext()) {
                return false;
            }
            NavDestination next = it.next();
            if (this.topLevelDestinations.contains(Integer.valueOf(next.getId())) && (!(next instanceof NavGraph) || destination.getId() == NavGraph.Companion.findStartDestination((NavGraph) next).getId())) {
                z4 = true;
            }
        } while (!z4);
        return true;
    }

    @i0(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u0013\b\u0016\u0012\n\u0010\b\u001a\u00020\t\"\u00020\n¢\u0006\u0002\u0010\u000bB\u0015\b\u0016\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0002\u0010\rJ\b\u0010\u0014\u001a\u00020\u0015H\u0007J\u0012\u0010\u0016\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007J\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u001a\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Landroidx/navigation/ui/AppBarConfiguration$Builder;", "", "navGraph", "Landroidx/navigation/NavGraph;", "(Landroidx/navigation/NavGraph;)V", "topLevelMenu", "Landroid/view/Menu;", "(Landroid/view/Menu;)V", "topLevelDestinationIds", "", "", "([I)V", "", "(Ljava/util/Set;)V", "fallbackOnNavigateUpListener", "Landroidx/navigation/ui/AppBarConfiguration$OnNavigateUpListener;", "openableLayout", "Landroidx/customview/widget/Openable;", "topLevelDestinations", "", "build", "Landroidx/navigation/ui/AppBarConfiguration;", "setDrawerLayout", "drawerLayout", "Landroidx/drawerlayout/widget/DrawerLayout;", "setFallbackOnNavigateUpListener", "setOpenableLayout", "navigation-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Builder {

        @m
        private OnNavigateUpListener fallbackOnNavigateUpListener;

        @m
        private Openable openableLayout;

        @l
        private final Set<Integer> topLevelDestinations;

        public Builder(@l NavGraph navGraph) {
            l0.p(navGraph, "navGraph");
            HashSet hashSet = new HashSet();
            this.topLevelDestinations = hashSet;
            hashSet.add(Integer.valueOf(NavGraph.Companion.findStartDestination(navGraph).getId()));
        }

        @l
        @SuppressLint({"SyntheticAccessor"})
        public final AppBarConfiguration build() {
            return new AppBarConfiguration(this.topLevelDestinations, this.openableLayout, this.fallbackOnNavigateUpListener, null);
        }

        @l
        @k(message = "Use {@link #setOpenableLayout(Openable)}.")
        public final Builder setDrawerLayout(@m DrawerLayout drawerLayout) {
            this.openableLayout = drawerLayout;
            return this;
        }

        @l
        public final Builder setFallbackOnNavigateUpListener(@m OnNavigateUpListener onNavigateUpListener) {
            this.fallbackOnNavigateUpListener = onNavigateUpListener;
            return this;
        }

        @l
        public final Builder setOpenableLayout(@m Openable openable) {
            this.openableLayout = openable;
            return this;
        }

        public Builder(@l Menu topLevelMenu) {
            l0.p(topLevelMenu, "topLevelMenu");
            this.topLevelDestinations = new HashSet();
            int size = topLevelMenu.size();
            for (int i5 = 0; i5 < size; i5++) {
                this.topLevelDestinations.add(Integer.valueOf(topLevelMenu.getItem(i5).getItemId()));
            }
        }

        public Builder(@l int... topLevelDestinationIds) {
            l0.p(topLevelDestinationIds, "topLevelDestinationIds");
            this.topLevelDestinations = new HashSet();
            for (int i5 : topLevelDestinationIds) {
                this.topLevelDestinations.add(Integer.valueOf(i5));
            }
        }

        public Builder(@l Set<Integer> topLevelDestinationIds) {
            l0.p(topLevelDestinationIds, "topLevelDestinationIds");
            HashSet hashSet = new HashSet();
            this.topLevelDestinations = hashSet;
            hashSet.addAll(topLevelDestinationIds);
        }
    }
}
