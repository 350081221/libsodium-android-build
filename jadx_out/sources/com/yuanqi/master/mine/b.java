package com.yuanqi.master.mine;

import android.annotation.SuppressLint;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
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
import com.yuanqi.master.mine.account.h;
import com.yuanqi.master.mine.account.i;
import com.yuanqi.master.mine.account.j;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.l;
import v3.p;
import v3.r;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0019\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"MineComposeNavigation", "", "startDestination", "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/animation/EnterTransition;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/navigation/NavBackStackEntry;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends n0 implements l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> {
        public static final a INSTANCE = new a();

        a() {
            super(1);
        }

        @Override // v3.l
        @p4.l
        public final EnterTransition invoke(@p4.l AnimatedContentTransitionScope<NavBackStackEntry> NavHost) {
            l0.p(NavHost, "$this$NavHost");
            return EnterExitTransitionKt.fadeIn(AnimationSpecKt.tween$default(TypedValues.TransitionType.TYPE_DURATION, 0, null, 6, null), 0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/animation/ExitTransition;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/navigation/NavBackStackEntry;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.yuanqi.master.mine.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0413b extends n0 implements l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> {
        public static final C0413b INSTANCE = new C0413b();

        C0413b() {
            super(1);
        }

        @Override // v3.l
        @p4.l
        public final ExitTransition invoke(@p4.l AnimatedContentTransitionScope<NavBackStackEntry> NavHost) {
            l0.p(NavHost, "$this$NavHost");
            return EnterExitTransitionKt.fadeOut(AnimationSpecKt.tween$default(TypedValues.TransitionType.TYPE_DURATION, 0, null, 6, null), 0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/navigation/NavGraphBuilder;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c extends n0 implements l<NavGraphBuilder, r2> {
        final /* synthetic */ NavHostController $navController;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedContentScope;", "it", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends n0 implements r<AnimatedContentScope, NavBackStackEntry, Composer, Integer, r2> {
            final /* synthetic */ NavHostController $navController;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(NavHostController navHostController) {
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
                    ComposerKt.traceEventStart(-449467618, i5, -1, "com.yuanqi.master.mine.MineComposeNavigation.<anonymous>.<anonymous> (MineComposeNavigation.kt:33)");
                }
                i.a(this.$navController, null, composer, 8, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedContentScope;", "it", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.yuanqi.master.mine.b$c$b, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0414b extends n0 implements r<AnimatedContentScope, NavBackStackEntry, Composer, Integer, r2> {
            final /* synthetic */ NavHostController $navController;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0414b(NavHostController navHostController) {
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
                    ComposerKt.traceEventStart(-1254013995, i5, -1, "com.yuanqi.master.mine.MineComposeNavigation.<anonymous>.<anonymous> (MineComposeNavigation.kt:36)");
                }
                com.yuanqi.master.mine.account.b.a(this.$navController, null, composer, 8, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedContentScope;", "it", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.yuanqi.master.mine.b$c$c, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0415c extends n0 implements r<AnimatedContentScope, NavBackStackEntry, Composer, Integer, r2> {
            final /* synthetic */ NavHostController $navController;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0415c(NavHostController navHostController) {
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
                    ComposerKt.traceEventStart(-1956609834, i5, -1, "com.yuanqi.master.mine.MineComposeNavigation.<anonymous>.<anonymous> (MineComposeNavigation.kt:39)");
                }
                com.yuanqi.master.mine.account.g.f(this.$navController, null, composer, 8, 2);
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
                    ComposerKt.traceEventStart(1635761623, i5, -1, "com.yuanqi.master.mine.MineComposeNavigation.<anonymous>.<anonymous> (MineComposeNavigation.kt:42)");
                }
                j.a(this.$navController, null, composer, 8, 2);
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
                    ComposerKt.traceEventStart(933165784, i5, -1, "com.yuanqi.master.mine.MineComposeNavigation.<anonymous>.<anonymous> (MineComposeNavigation.kt:45)");
                }
                h.a(this.$navController, null, composer, 8, 2);
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
                    ComposerKt.traceEventStart(230569945, i5, -1, "com.yuanqi.master.mine.MineComposeNavigation.<anonymous>.<anonymous> (MineComposeNavigation.kt:48)");
                }
                com.yuanqi.master.mine.vip.a.a(this.$navController, null, composer, 8, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedContentScope;", "it", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class g extends n0 implements r<AnimatedContentScope, NavBackStackEntry, Composer, Integer, r2> {
            final /* synthetic */ NavHostController $navController;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(NavHostController navHostController) {
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
                    ComposerKt.traceEventStart(-472025894, i5, -1, "com.yuanqi.master.mine.MineComposeNavigation.<anonymous>.<anonymous> (MineComposeNavigation.kt:51)");
                }
                com.yuanqi.master.mine.vip.b.a(this.$navController, composer, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(NavHostController navHostController) {
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
            NavGraphBuilderKt.composable$default(NavHost, com.yuanqi.master.mine.c.f14820b, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-449467618, true, new a(this.$navController)), 126, null);
            NavGraphBuilderKt.composable$default(NavHost, com.yuanqi.master.mine.c.f14821c, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1254013995, true, new C0414b(this.$navController)), 126, null);
            NavGraphBuilderKt.composable$default(NavHost, com.yuanqi.master.mine.c.f14822d, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1956609834, true, new C0415c(this.$navController)), 126, null);
            NavGraphBuilderKt.composable$default(NavHost, com.yuanqi.master.mine.c.f14823e, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1635761623, true, new d(this.$navController)), 126, null);
            NavGraphBuilderKt.composable$default(NavHost, com.yuanqi.master.mine.c.f14824f, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(933165784, true, new e(this.$navController)), 126, null);
            NavGraphBuilderKt.composable$default(NavHost, com.yuanqi.master.mine.c.f14825g, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(230569945, true, new f(this.$navController)), 126, null);
            NavGraphBuilderKt.composable$default(NavHost, com.yuanqi.master.mine.c.f14826h, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-472025894, true, new g(this.$navController)), 126, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ String $startDestination;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, int i5, int i6) {
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
            b.a(this.$startDestination, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
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
        Composer startRestartGroup = composer.startRestartGroup(1474861372);
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
                str3 = com.yuanqi.master.mine.c.f14820b;
            } else {
                str3 = str2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1474861372, i5, -1, "com.yuanqi.master.mine.MineComposeNavigation (MineComposeNavigation.kt:20)");
            }
            NavHostController rememberNavController = NavHostControllerKt.rememberNavController(new Navigator[0], startRestartGroup, 8);
            l0.m(str3);
            composer2 = startRestartGroup;
            NavHostKt.NavHost(rememberNavController, str3, null, null, null, a.INSTANCE, C0413b.INSTANCE, null, null, new c(rememberNavController), startRestartGroup, 1769480, 412);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            str2 = str3;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new d(str2, i5, i6));
        }
    }
}
