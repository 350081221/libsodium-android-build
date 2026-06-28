package com.yuanqi.master.manager;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavGraphBuilderKt;
import androidx.navigation.compose.NavHostControllerKt;
import androidx.navigation.compose.NavHostKt;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.l;
import v3.p;
import v3.r;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0019\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"ManagerComposeNavigation", "", "startDestination", "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d {

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/navigation/NavGraphBuilder;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends n0 implements l<NavGraphBuilder, r2> {
        final /* synthetic */ NavHostController $navController;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedContentScope;", "it", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.yuanqi.master.manager.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0361a extends n0 implements r<AnimatedContentScope, NavBackStackEntry, Composer, Integer, r2> {
            final /* synthetic */ NavHostController $navController;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0361a(NavHostController navHostController) {
                super(4);
                this.$navController = navHostController;
            }

            @Override // v3.r
            public /* bridge */ /* synthetic */ r2 invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
                invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
                return r2.f19517a;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@p4.l AnimatedContentScope composable, @p4.l NavBackStackEntry it, @m Composer composer, int i5) {
                l0.p(composable, "$this$composable");
                l0.p(it, "it");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(713280654, i5, -1, "com.yuanqi.master.manager.ManagerComposeNavigation.<anonymous>.<anonymous> (ManagerComposeNavigation.kt:14)");
                }
                e.a(this.$navController, null, composer, 8, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedContentScope;", "it", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class b extends n0 implements r<AnimatedContentScope, NavBackStackEntry, Composer, Integer, r2> {
            final /* synthetic */ NavHostController $navController;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(NavHostController navHostController) {
                super(4);
                this.$navController = navHostController;
            }

            @Override // v3.r
            public /* bridge */ /* synthetic */ r2 invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
                invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
                return r2.f19517a;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@p4.l AnimatedContentScope composable, @p4.l NavBackStackEntry it, @m Composer composer, int i5) {
                l0.p(composable, "$this$composable");
                l0.p(it, "it");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1921192375, i5, -1, "com.yuanqi.master.manager.ManagerComposeNavigation.<anonymous>.<anonymous> (ManagerComposeNavigation.kt:17)");
                }
                com.yuanqi.master.manager.a.a(this.$navController, null, composer, 8, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(NavHostController navHostController) {
            super(1);
            this.$navController = navHostController;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(NavGraphBuilder navGraphBuilder) {
            invoke2(navGraphBuilder);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l NavGraphBuilder NavHost) {
            l0.p(NavHost, "$this$NavHost");
            NavGraphBuilderKt.composable$default(NavHost, i.f14757b, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(713280654, true, new C0361a(this.$navController)), 126, null);
            NavGraphBuilderKt.composable$default(NavHost, i.f14758c, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1921192375, true, new b(this.$navController)), 126, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ String $startDestination;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, int i5, int i6) {
            super(2);
            this.$startDestination = str;
            this.$$changed = i5;
            this.$$default = i6;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@m Composer composer, int i5) {
            d.a(this.$startDestination, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(@m String str, @m Composer composer, int i5, int i6) {
        String str2;
        int i7;
        int i8;
        String str3;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-2015895504);
        int i9 = i6 & 1;
        if (i9 != 0) {
            i7 = i5 | 6;
            str2 = str;
        } else if ((i5 & 14) == 0) {
            str2 = str;
            if (startRestartGroup.changed(str2)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i7 = i8 | i5;
        } else {
            str2 = str;
            i7 = i5;
        }
        if ((i7 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            String str4 = i.f14757b;
            if (i9 != 0) {
                str3 = i.f14757b;
            } else {
                str3 = str2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2015895504, i5, -1, "com.yuanqi.master.manager.ManagerComposeNavigation (ManagerComposeNavigation.kt:8)");
            }
            NavHostController rememberNavController = NavHostControllerKt.rememberNavController(new Navigator[0], startRestartGroup, 8);
            if (str3 != null) {
                str4 = str3;
            }
            composer2 = startRestartGroup;
            NavHostKt.NavHost(rememberNavController, str4, null, null, null, null, null, null, null, new a(rememberNavController), startRestartGroup, 8, TypedValues.PositionType.TYPE_CURVE_FIT);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            str2 = str3;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new b(str2, i5, i6));
        }
    }
}
