package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.r2;
import kotlinx.coroutines.flow.t0;
import p4.l;
import p4.m;
import v3.q;
import v3.r;

@StabilityInferred(parameters = 0)
@Navigator.Name(ComposeNavigator.NAME)
@i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\n\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002!\"B\u0007¢\u0006\u0004\b\u001f\u0010 J*\u0010\u000b\u001a\u00020\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0004R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00190\u00188@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00188F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001b¨\u0006#"}, d2 = {"Landroidx/navigation/compose/ComposeNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/compose/ComposeNavigator$Destination;", "", "Landroidx/navigation/NavBackStackEntry;", "entries", "Landroidx/navigation/NavOptions;", "navOptions", "Landroidx/navigation/Navigator$Extras;", "navigatorExtras", "Lkotlin/r2;", "navigate", "createDestination", "popUpTo", "", "savedState", "popBackStack", "entry", "onTransitionComplete", "Landroidx/compose/runtime/MutableState;", "isPop", "Landroidx/compose/runtime/MutableState;", "isPop$navigation_compose_release", "()Landroidx/compose/runtime/MutableState;", "Lkotlinx/coroutines/flow/t0;", "", "getTransitionsInProgress$navigation_compose_release", "()Lkotlinx/coroutines/flow/t0;", "transitionsInProgress", "getBackStack", "backStack", "<init>", "()V", "Companion", "Destination", "navigation-compose_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nComposeNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeNavigator.kt\nandroidx/navigation/compose/ComposeNavigator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,121:1\n1855#2,2:122\n*S KotlinDebug\n*F\n+ 1 ComposeNavigator.kt\nandroidx/navigation/compose/ComposeNavigator\n*L\n56#1:122,2\n*E\n"})
/* loaded from: classes2.dex */
public final class ComposeNavigator extends Navigator<Destination> {
    public static final int $stable = 0;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    public static final String NAME = "composable";

    @l
    private final MutableState<Boolean> isPop;

    @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/navigation/compose/ComposeNavigator$Companion;", "", "()V", "NAME", "", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    public ComposeNavigator() {
        MutableState<Boolean> mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.isPop = mutableStateOf$default;
    }

    @l
    public final t0<List<NavBackStackEntry>> getBackStack() {
        return getState().getBackStack();
    }

    @l
    public final t0<Set<NavBackStackEntry>> getTransitionsInProgress$navigation_compose_release() {
        return getState().getTransitionsInProgress();
    }

    @l
    public final MutableState<Boolean> isPop$navigation_compose_release() {
        return this.isPop;
    }

    @Override // androidx.navigation.Navigator
    public void navigate(@l List<NavBackStackEntry> list, @m NavOptions navOptions, @m Navigator.Extras extras) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            getState().pushWithTransition((NavBackStackEntry) it.next());
        }
        this.isPop.setValue(Boolean.FALSE);
    }

    public final void onTransitionComplete(@l NavBackStackEntry navBackStackEntry) {
        getState().markTransitionComplete(navBackStackEntry);
    }

    @Override // androidx.navigation.Navigator
    public void popBackStack(@l NavBackStackEntry navBackStackEntry, boolean z4) {
        getState().popWithTransition(navBackStackEntry, z4);
        this.isPop.setValue(Boolean.TRUE);
    }

    @StabilityInferred(parameters = 0)
    @NavDestination.ClassType(Composable.class)
    @i0(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B8\u0012\u0006\u0010!\u001a\u00020 \u0012'\u0010\t\u001a#\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u00060\u0002¢\u0006\u0002\b\u0007¢\u0006\u0002\b\b¢\u0006\u0004\b\"\u0010#B/\b\u0017\u0012\u0006\u0010!\u001a\u00020 \u0012\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u00050\r¢\u0006\u0002\b\u0007¢\u0006\u0004\b\"\u0010$R;\u0010\t\u001a#\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u00060\u0002¢\u0006\u0002\b\u0007¢\u0006\u0002\b\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fRB\u0010\u0010\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\r¢\u0006\u0002\b\u0005¢\u0006\u0002\b\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015RB\u0010\u0017\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\r¢\u0006\u0002\b\u0005¢\u0006\u0002\b\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015RB\u0010\u001a\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\r¢\u0006\u0002\b\u0005¢\u0006\u0002\b\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013\"\u0004\b\u001c\u0010\u0015RB\u0010\u001d\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\r¢\u0006\u0002\b\u0005¢\u0006\u0002\b\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015¨\u0006%"}, d2 = {"Landroidx/navigation/compose/ComposeNavigator$Destination;", "Landroidx/navigation/NavDestination;", "Lkotlin/Function2;", "Landroidx/compose/animation/AnimatedContentScope;", "Landroidx/navigation/NavBackStackEntry;", "Lu3/n;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "Lkotlin/u;", "content", "Lv3/r;", "getContent$navigation_compose_release", "()Lv3/r;", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/compose/animation/EnterTransition;", "enterTransition", "Lv3/l;", "getEnterTransition$navigation_compose_release", "()Lv3/l;", "setEnterTransition$navigation_compose_release", "(Lv3/l;)V", "Landroidx/compose/animation/ExitTransition;", "exitTransition", "getExitTransition$navigation_compose_release", "setExitTransition$navigation_compose_release", "popEnterTransition", "getPopEnterTransition$navigation_compose_release", "setPopEnterTransition$navigation_compose_release", "popExitTransition", "getPopExitTransition$navigation_compose_release", "setPopExitTransition$navigation_compose_release", "Landroidx/navigation/compose/ComposeNavigator;", "navigator", "<init>", "(Landroidx/navigation/compose/ComposeNavigator;Lv3/r;)V", "(Landroidx/navigation/compose/ComposeNavigator;Lv3/q;)V", "navigation-compose_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Destination extends NavDestination {
        public static final int $stable = 8;

        @l
        private final r<AnimatedContentScope, NavBackStackEntry, Composer, Integer, r2> content;

        @m
        private v3.l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> enterTransition;

        @m
        private v3.l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> exitTransition;

        @m
        private v3.l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> popEnterTransition;

        @m
        private v3.l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> popExitTransition;

        @i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\u000b\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/animation/AnimatedContentScope;", "Landroidx/navigation/NavBackStackEntry;", "Lu3/n;", "entry", "Lkotlin/r2;", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.navigation.compose.ComposeNavigator$Destination$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass1 extends n0 implements r<AnimatedContentScope, NavBackStackEntry, Composer, Integer, r2> {
            final /* synthetic */ q<NavBackStackEntry, Composer, Integer, r2> $content;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(q<? super NavBackStackEntry, ? super Composer, ? super Integer, r2> qVar) {
                super(4);
                this.$content = qVar;
            }

            @Override // v3.r
            public /* bridge */ /* synthetic */ r2 invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
                invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
                return r2.f19517a;
            }

            @Composable
            public final void invoke(@l AnimatedContentScope animatedContentScope, @l NavBackStackEntry navBackStackEntry, @m Composer composer, int i5) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1587956030, i5, -1, "androidx.navigation.compose.ComposeNavigator.Destination.<init>.<anonymous> (ComposeNavigator.kt:101)");
                }
                this.$content.invoke(navBackStackEntry, composer, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Destination(@l ComposeNavigator composeNavigator, @l r<? super AnimatedContentScope, NavBackStackEntry, ? super Composer, ? super Integer, r2> rVar) {
            super(composeNavigator);
            this.content = rVar;
        }

        @l
        public final r<AnimatedContentScope, NavBackStackEntry, Composer, Integer, r2> getContent$navigation_compose_release() {
            return this.content;
        }

        @m
        public final v3.l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> getEnterTransition$navigation_compose_release() {
            return this.enterTransition;
        }

        @m
        public final v3.l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> getExitTransition$navigation_compose_release() {
            return this.exitTransition;
        }

        @m
        public final v3.l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> getPopEnterTransition$navigation_compose_release() {
            return this.popEnterTransition;
        }

        @m
        public final v3.l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> getPopExitTransition$navigation_compose_release() {
            return this.popExitTransition;
        }

        public final void setEnterTransition$navigation_compose_release(@m v3.l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> lVar) {
            this.enterTransition = lVar;
        }

        public final void setExitTransition$navigation_compose_release(@m v3.l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> lVar) {
            this.exitTransition = lVar;
        }

        public final void setPopEnterTransition$navigation_compose_release(@m v3.l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> lVar) {
            this.popEnterTransition = lVar;
        }

        public final void setPopExitTransition$navigation_compose_release(@m v3.l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> lVar) {
            this.popExitTransition = lVar;
        }

        @k(level = kotlin.m.HIDDEN, message = "Deprecated in favor of Destination that supports AnimatedContent")
        public /* synthetic */ Destination(ComposeNavigator composeNavigator, q qVar) {
            this(composeNavigator, (r<? super AnimatedContentScope, NavBackStackEntry, ? super Composer, ? super Integer, r2>) ComposableLambdaKt.composableLambdaInstance(1587956030, true, new AnonymousClass1(qVar)));
        }
    }

    @Override // androidx.navigation.Navigator
    @l
    public Destination createDestination() {
        return new Destination(this, ComposableSingletons$ComposeNavigatorKt.INSTANCE.m6416getLambda1$navigation_compose_release());
    }
}
