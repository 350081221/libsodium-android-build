package androidx.navigation.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.window.DialogProperties;
import androidx.compose.ui.window.SecureFlagPolicy;
import androidx.navigation.FloatingWindow;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.e0;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlinx.coroutines.flow.t0;
import p4.l;
import p4.m;
import v3.q;

@StabilityInferred(parameters = 0)
@Navigator.Name(DialogNavigator.NAME)
@i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0007\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002!\"B\u0007¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000f\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0010\u001a\u00020\u0002H\u0016J\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0017\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0016\u0010\u0007R \u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t0\u00188@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001c0\u00188@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001a¨\u0006#"}, d2 = {"Landroidx/navigation/compose/DialogNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/compose/DialogNavigator$Destination;", "Landroidx/navigation/NavBackStackEntry;", "backStackEntry", "Lkotlin/r2;", "dismiss$navigation_compose_release", "(Landroidx/navigation/NavBackStackEntry;)V", "dismiss", "", "entries", "Landroidx/navigation/NavOptions;", "navOptions", "Landroidx/navigation/Navigator$Extras;", "navigatorExtras", "navigate", "createDestination", "popUpTo", "", "savedState", "popBackStack", "entry", "onTransitionComplete$navigation_compose_release", "onTransitionComplete", "Lkotlinx/coroutines/flow/t0;", "getBackStack$navigation_compose_release", "()Lkotlinx/coroutines/flow/t0;", "backStack", "", "getTransitionInProgress$navigation_compose_release", "transitionInProgress", "<init>", "()V", "Companion", "Destination", "navigation-compose_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nDialogNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogNavigator.kt\nandroidx/navigation/compose/DialogNavigator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,97:1\n1855#2,2:98\n1864#2,3:100\n*S KotlinDebug\n*F\n+ 1 DialogNavigator.kt\nandroidx/navigation/compose/DialogNavigator\n*L\n59#1:98,2\n74#1:100,3\n*E\n"})
/* loaded from: classes2.dex */
public final class DialogNavigator extends Navigator<Destination> {
    public static final int $stable = 0;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    public static final String NAME = "dialog";

    @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/navigation/compose/DialogNavigator$Companion;", "", "()V", "NAME", "", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    public final void dismiss$navigation_compose_release(@l NavBackStackEntry navBackStackEntry) {
        popBackStack(navBackStackEntry, false);
    }

    @l
    public final t0<List<NavBackStackEntry>> getBackStack$navigation_compose_release() {
        return getState().getBackStack();
    }

    @l
    public final t0<Set<NavBackStackEntry>> getTransitionInProgress$navigation_compose_release() {
        return getState().getTransitionsInProgress();
    }

    @Override // androidx.navigation.Navigator
    public void navigate(@l List<NavBackStackEntry> list, @m NavOptions navOptions, @m Navigator.Extras extras) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            getState().push((NavBackStackEntry) it.next());
        }
    }

    public final void onTransitionComplete$navigation_compose_release(@l NavBackStackEntry navBackStackEntry) {
        getState().markTransitionComplete(navBackStackEntry);
    }

    @Override // androidx.navigation.Navigator
    public void popBackStack(@l NavBackStackEntry navBackStackEntry, boolean z4) {
        int Z2;
        getState().popWithTransition(navBackStackEntry, z4);
        Z2 = e0.Z2(getState().getTransitionsInProgress().getValue(), navBackStackEntry);
        int i5 = 0;
        for (Object obj : getState().getTransitionsInProgress().getValue()) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                kotlin.collections.w.W();
            }
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj;
            if (i5 > Z2) {
                onTransitionComplete$navigation_compose_release(navBackStackEntry2);
            }
            i5 = i6;
        }
    }

    @StabilityInferred(parameters = 0)
    @NavDestination.ClassType(Composable.class)
    @i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B2\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R+\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Landroidx/navigation/compose/DialogNavigator$Destination;", "Landroidx/navigation/NavDestination;", "Landroidx/navigation/FloatingWindow;", "Landroidx/compose/ui/window/DialogProperties;", "dialogProperties", "Landroidx/compose/ui/window/DialogProperties;", "getDialogProperties$navigation_compose_release", "()Landroidx/compose/ui/window/DialogProperties;", "Lkotlin/Function1;", "Landroidx/navigation/NavBackStackEntry;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "content", "Lv3/q;", "getContent$navigation_compose_release", "()Lv3/q;", "Landroidx/navigation/compose/DialogNavigator;", "navigator", "<init>", "(Landroidx/navigation/compose/DialogNavigator;Landroidx/compose/ui/window/DialogProperties;Lv3/q;)V", "navigation-compose_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Destination extends NavDestination implements FloatingWindow {
        public static final int $stable = 0;

        @l
        private final q<NavBackStackEntry, Composer, Integer, r2> content;

        @l
        private final DialogProperties dialogProperties;

        public /* synthetic */ Destination(DialogNavigator dialogNavigator, DialogProperties dialogProperties, q qVar, int i5, w wVar) {
            this(dialogNavigator, (i5 & 2) != 0 ? new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (w) null) : dialogProperties, qVar);
        }

        @l
        public final q<NavBackStackEntry, Composer, Integer, r2> getContent$navigation_compose_release() {
            return this.content;
        }

        @l
        public final DialogProperties getDialogProperties$navigation_compose_release() {
            return this.dialogProperties;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Destination(@l DialogNavigator dialogNavigator, @l DialogProperties dialogProperties, @l q<? super NavBackStackEntry, ? super Composer, ? super Integer, r2> qVar) {
            super(dialogNavigator);
            this.dialogProperties = dialogProperties;
            this.content = qVar;
        }
    }

    @Override // androidx.navigation.Navigator
    @l
    public Destination createDestination() {
        return new Destination(this, null, ComposableSingletons$DialogNavigatorKt.INSTANCE.m6417getLambda1$navigation_compose_release(), 2, null);
    }
}
