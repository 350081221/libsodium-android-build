package com.yuanqi.master.addapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
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
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavGraphBuilderKt;
import androidx.navigation.compose.NavHostControllerKt;
import androidx.navigation.compose.NavHostKt;
import com.yuanqi.master.addapp.home.SearchScreenKt;
import com.yuanqi.master.addapp.home.n;
import com.yuanqi.master.tools.q0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.l;
import v3.p;
import v3.r;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0019\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"AddAppComposeNavigation", "", "startDestination", "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g {

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/navigation/NavGraphBuilder;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends n0 implements l<NavGraphBuilder, r2> {
        final /* synthetic */ NavHostController $navController;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedContentScope;", "it", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.yuanqi.master.addapp.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0269a extends n0 implements r<AnimatedContentScope, NavBackStackEntry, Composer, Integer, r2> {
            final /* synthetic */ NavHostController $navController;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0269a(NavHostController navHostController) {
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
                    ComposerKt.traceEventStart(1788603633, i5, -1, "com.yuanqi.master.addapp.AddAppComposeNavigation.<anonymous>.<anonymous> (Navigation.kt:72)");
                }
                com.yuanqi.master.addapp.h.a(this.$navController, null, composer, 8, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\n"}, d2 = {"<anonymous>", "", "controller", "Landroidx/navigation/NavController;", "destination", "Landroidx/navigation/NavDestination;", "arguments", "Landroid/os/Bundle;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class b implements NavController.OnDestinationChangedListener {

            /* renamed from: a, reason: collision with root package name */
            public static final b f14463a = new b();

            b() {
            }

            @Override // androidx.navigation.NavController.OnDestinationChangedListener
            public final void onDestinationChanged(@p4.l NavController controller, @p4.l NavDestination destination, @m Bundle bundle) {
                l0.p(controller, "controller");
                l0.p(destination, "destination");
                q0 a5 = q0.f15237a.a();
                String valueOf = String.valueOf(destination.getRoute());
                AddAppActivity a6 = AddAppActivity.f14427e.a();
                l0.m(a6);
                String localClassName = a6.getLocalClassName();
                l0.o(localClassName, "getLocalClassName(...)");
                a5.r(valueOf, localClassName);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedContentScope;", "it", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class c extends n0 implements r<AnimatedContentScope, NavBackStackEntry, Composer, Integer, r2> {
            final /* synthetic */ NavHostController $navController;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(NavHostController navHostController) {
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
                    ComposerKt.traceEventStart(1603049199, i5, -1, "com.yuanqi.master.addapp.AddAppComposeNavigation.<anonymous>.<anonymous> (Navigation.kt:41)");
                }
                com.yuanqi.master.main.d.b(this.$navController, null, composer, 8, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedContentScope;", "it", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class d extends n0 implements r<AnimatedContentScope, NavBackStackEntry, Composer, Integer, r2> {
            final /* synthetic */ NavHostController $navController;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(NavHostController navHostController) {
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
                    ComposerKt.traceEventStart(2124762648, i5, -1, "com.yuanqi.master.addapp.AddAppComposeNavigation.<anonymous>.<anonymous> (Navigation.kt:44)");
                }
                n.b(null, this.$navController, composer, 64, 1);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedContentScope;", "it", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class e extends n0 implements r<AnimatedContentScope, NavBackStackEntry, Composer, Integer, r2> {
            final /* synthetic */ NavHostController $navController;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(NavHostController navHostController) {
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
                    ComposerKt.traceEventStart(1463173175, i5, -1, "com.yuanqi.master.addapp.AddAppComposeNavigation.<anonymous>.<anonymous> (Navigation.kt:48)");
                }
                com.yuanqi.master.addapp.sort.a.a(this.$navController, null, composer, 8, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedContentScope;", "it", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class f extends n0 implements r<AnimatedContentScope, NavBackStackEntry, Composer, Integer, r2> {
            final /* synthetic */ NavHostController $navController;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(NavHostController navHostController) {
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
                    ComposerKt.traceEventStart(801583702, i5, -1, "com.yuanqi.master.addapp.AddAppComposeNavigation.<anonymous>.<anonymous> (Navigation.kt:52)");
                }
                com.yuanqi.master.addapp.home.b.a(this.$navController, null, composer, 8, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedContentScope;", "it", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.yuanqi.master.addapp.g$a$g, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0270g extends n0 implements r<AnimatedContentScope, NavBackStackEntry, Composer, Integer, r2> {
            final /* synthetic */ NavHostController $navController;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0270g(NavHostController navHostController) {
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
                    ComposerKt.traceEventStart(139994229, i5, -1, "com.yuanqi.master.addapp.AddAppComposeNavigation.<anonymous>.<anonymous> (Navigation.kt:56)");
                }
                SearchScreenKt.b(null, this.$navController, composer, 64, 1);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedContentScope;", "it", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class h extends n0 implements r<AnimatedContentScope, NavBackStackEntry, Composer, Integer, r2> {
            final /* synthetic */ NavHostController $navController;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(NavHostController navHostController) {
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
                    ComposerKt.traceEventStart(-521595244, i5, -1, "com.yuanqi.master.addapp.AddAppComposeNavigation.<anonymous>.<anonymous> (Navigation.kt:60)");
                }
                com.yuanqi.master.addapp.home.i.a(this.$navController, null, composer, 8, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedContentScope;", "it", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class i extends n0 implements r<AnimatedContentScope, NavBackStackEntry, Composer, Integer, r2> {
            final /* synthetic */ NavHostController $navController;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            i(NavHostController navHostController) {
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
                    ComposerKt.traceEventStart(-1183184717, i5, -1, "com.yuanqi.master.addapp.AddAppComposeNavigation.<anonymous>.<anonymous> (Navigation.kt:64)");
                }
                com.yuanqi.master.addapp.home.l.a(this.$navController, null, composer, 8, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedContentScope;", "it", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class j extends n0 implements r<AnimatedContentScope, NavBackStackEntry, Composer, Integer, r2> {
            final /* synthetic */ NavHostController $navController;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(NavHostController navHostController) {
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
                    ComposerKt.traceEventStart(-1844774190, i5, -1, "com.yuanqi.master.addapp.AddAppComposeNavigation.<anonymous>.<anonymous> (Navigation.kt:68)");
                }
                com.yuanqi.master.addapp.home.a.a(this.$navController, null, composer, 8, 2);
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
            this.$navController.addOnDestinationChangedListener(b.f14463a);
            NavGraphBuilderKt.composable$default(NavHost, com.yuanqi.master.config.c.f14529f, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1603049199, true, new c(this.$navController)), 126, null);
            NavGraphBuilderKt.composable$default(NavHost, com.yuanqi.master.config.c.f14525d, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(2124762648, true, new d(this.$navController)), 126, null);
            NavGraphBuilderKt.composable$default(NavHost, com.yuanqi.master.config.c.f14527e, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1463173175, true, new e(this.$navController)), 126, null);
            NavGraphBuilderKt.composable$default(NavHost, com.yuanqi.master.config.c.f14533h, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(801583702, true, new f(this.$navController)), 126, null);
            NavGraphBuilderKt.composable$default(NavHost, com.yuanqi.master.config.c.f14535i, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(139994229, true, new C0270g(this.$navController)), 126, null);
            NavGraphBuilderKt.composable$default(NavHost, com.yuanqi.master.config.c.f14539k, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-521595244, true, new h(this.$navController)), 126, null);
            NavGraphBuilderKt.composable$default(NavHost, com.yuanqi.master.config.c.f14541l, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1183184717, true, new i(this.$navController)), 126, null);
            NavGraphBuilderKt.composable$default(NavHost, com.yuanqi.master.config.c.f14537j, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1844774190, true, new j(this.$navController)), 126, null);
            NavGraphBuilderKt.composable$default(NavHost, com.yuanqi.master.config.c.f14543m, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1788603633, true, new C0269a(this.$navController)), 126, null);
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
            g.a(this.$startDestination, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @SuppressLint({"RestrictedApi"})
    public static final void a(@m String str, @m Composer composer, int i5, int i6) {
        String str2;
        int i7;
        int i8;
        String str3;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1519374703);
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
            if (i9 != 0) {
                str3 = com.yuanqi.master.config.c.f14525d;
            } else {
                str3 = str2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1519374703, i5, -1, "com.yuanqi.master.addapp.AddAppComposeNavigation (Navigation.kt:29)");
            }
            NavHostController rememberNavController = NavHostControllerKt.rememberNavController(new Navigator[0], startRestartGroup, 8);
            l0.m(str3);
            composer2 = startRestartGroup;
            NavHostKt.NavHost(rememberNavController, str3, null, null, null, null, null, null, null, new a(rememberNavController), startRestartGroup, 8, TypedValues.PositionType.TYPE_CURVE_FIT);
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
