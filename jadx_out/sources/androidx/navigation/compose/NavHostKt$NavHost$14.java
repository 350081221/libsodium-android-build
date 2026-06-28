package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.compose.ComposeNavigator;
import java.util.List;
import java.util.ListIterator;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;
import v3.r;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/AnimatedContentScope;", "Landroidx/navigation/NavBackStackEntry;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nNavHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHost.kt\nandroidx/navigation/compose/NavHostKt$NavHost$14\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,368:1\n533#2,6:369\n*S KotlinDebug\n*F\n+ 1 NavHost.kt\nandroidx/navigation/compose/NavHostKt$NavHost$14\n*L\n302#1:369,6\n*E\n"})
/* loaded from: classes2.dex */
public final class NavHostKt$NavHost$14 extends n0 implements r<AnimatedContentScope, NavBackStackEntry, Composer, Integer, r2> {
    final /* synthetic */ SaveableStateHolder $saveableStateHolder;
    final /* synthetic */ State<List<NavBackStackEntry>> $visibleEntries$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.navigation.compose.NavHostKt$NavHost$14$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ NavBackStackEntry $currentEntry;
        final /* synthetic */ AnimatedContentScope $this_AnimatedContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NavBackStackEntry navBackStackEntry, AnimatedContentScope animatedContentScope) {
            super(2);
            this.$currentEntry = navBackStackEntry;
            this.$this_AnimatedContent = animatedContentScope;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@m Composer composer, int i5) {
            if ((i5 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1425390790, i5, -1, "androidx.navigation.compose.NavHost.<anonymous>.<anonymous> (NavHost.kt:306)");
            }
            NavDestination destination = this.$currentEntry.getDestination();
            l0.n(destination, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
            ((ComposeNavigator.Destination) destination).getContent$navigation_compose_release().invoke(this.$this_AnimatedContent, this.$currentEntry, composer, 72);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavHostKt$NavHost$14(SaveableStateHolder saveableStateHolder, State<? extends List<NavBackStackEntry>> state) {
        super(4);
        this.$saveableStateHolder = saveableStateHolder;
        this.$visibleEntries$delegate = state;
    }

    @Override // v3.r
    public /* bridge */ /* synthetic */ r2 invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
        invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@l AnimatedContentScope animatedContentScope, @l NavBackStackEntry navBackStackEntry, @m Composer composer, int i5) {
        List NavHost$lambda$6;
        Object obj;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1440061047, i5, -1, "androidx.navigation.compose.NavHost.<anonymous> (NavHost.kt:301)");
        }
        NavHost$lambda$6 = NavHostKt.NavHost$lambda$6(this.$visibleEntries$delegate);
        ListIterator listIterator = NavHost$lambda$6.listIterator(NavHost$lambda$6.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            } else {
                obj = listIterator.previous();
                if (l0.g(navBackStackEntry, (NavBackStackEntry) obj)) {
                    break;
                }
            }
        }
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj;
        if (navBackStackEntry2 != null) {
            NavBackStackEntryProviderKt.LocalOwnersProvider(navBackStackEntry2, this.$saveableStateHolder, ComposableLambdaKt.composableLambda(composer, -1425390790, true, new AnonymousClass1(navBackStackEntry2, animatedContentScope)), composer, 456);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
