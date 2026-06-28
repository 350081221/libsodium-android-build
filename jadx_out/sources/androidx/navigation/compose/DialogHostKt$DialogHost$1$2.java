package androidx.navigation.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.compose.DialogNavigator;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.m;
import v3.l;
import v3.p;

@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class DialogHostKt$DialogHost$1$2 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ NavBackStackEntry $backStackEntry;
    final /* synthetic */ DialogNavigator.Destination $destination;
    final /* synthetic */ DialogNavigator $dialogNavigator;
    final /* synthetic */ SnapshotStateList<NavBackStackEntry> $dialogsToDispose;
    final /* synthetic */ SaveableStateHolder $saveableStateHolder;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nDialogHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogHost.kt\nandroidx/navigation/compose/DialogHostKt$DialogHost$1$2$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,137:1\n63#2,5:138\n*S KotlinDebug\n*F\n+ 1 DialogHost.kt\nandroidx/navigation/compose/DialogHostKt$DialogHost$1$2$1\n*L\n58#1:138,5\n*E\n"})
    /* renamed from: androidx.navigation.compose.DialogHostKt$DialogHost$1$2$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends n0 implements l<DisposableEffectScope, DisposableEffectResult> {
        final /* synthetic */ NavBackStackEntry $backStackEntry;
        final /* synthetic */ DialogNavigator $dialogNavigator;
        final /* synthetic */ SnapshotStateList<NavBackStackEntry> $dialogsToDispose;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SnapshotStateList<NavBackStackEntry> snapshotStateList, NavBackStackEntry navBackStackEntry, DialogNavigator dialogNavigator) {
            super(1);
            this.$dialogsToDispose = snapshotStateList;
            this.$backStackEntry = navBackStackEntry;
            this.$dialogNavigator = dialogNavigator;
        }

        @Override // v3.l
        @p4.l
        public final DisposableEffectResult invoke(@p4.l DisposableEffectScope disposableEffectScope) {
            this.$dialogsToDispose.add(this.$backStackEntry);
            final DialogNavigator dialogNavigator = this.$dialogNavigator;
            final NavBackStackEntry navBackStackEntry = this.$backStackEntry;
            final SnapshotStateList<NavBackStackEntry> snapshotStateList = this.$dialogsToDispose;
            return new DisposableEffectResult() { // from class: androidx.navigation.compose.DialogHostKt$DialogHost$1$2$1$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    DialogNavigator.this.onTransitionComplete$navigation_compose_release(navBackStackEntry);
                    snapshotStateList.remove(navBackStackEntry);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.navigation.compose.DialogHostKt$DialogHost$1$2$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass2 extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ NavBackStackEntry $backStackEntry;
        final /* synthetic */ DialogNavigator.Destination $destination;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(DialogNavigator.Destination destination, NavBackStackEntry navBackStackEntry) {
            super(2);
            this.$destination = destination;
            this.$backStackEntry = navBackStackEntry;
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
                ComposerKt.traceEventStart(-497631156, i5, -1, "androidx.navigation.compose.DialogHost.<anonymous>.<anonymous>.<anonymous> (DialogHost.kt:66)");
            }
            this.$destination.getContent$navigation_compose_release().invoke(this.$backStackEntry, composer, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogHostKt$DialogHost$1$2(NavBackStackEntry navBackStackEntry, SaveableStateHolder saveableStateHolder, SnapshotStateList<NavBackStackEntry> snapshotStateList, DialogNavigator dialogNavigator, DialogNavigator.Destination destination) {
        super(2);
        this.$backStackEntry = navBackStackEntry;
        this.$saveableStateHolder = saveableStateHolder;
        this.$dialogsToDispose = snapshotStateList;
        this.$dialogNavigator = dialogNavigator;
        this.$destination = destination;
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
            ComposerKt.traceEventStart(1129586364, i5, -1, "androidx.navigation.compose.DialogHost.<anonymous>.<anonymous> (DialogHost.kt:55)");
        }
        NavBackStackEntry navBackStackEntry = this.$backStackEntry;
        EffectsKt.DisposableEffect(navBackStackEntry, new AnonymousClass1(this.$dialogsToDispose, navBackStackEntry, this.$dialogNavigator), composer, 8);
        NavBackStackEntry navBackStackEntry2 = this.$backStackEntry;
        NavBackStackEntryProviderKt.LocalOwnersProvider(navBackStackEntry2, this.$saveableStateHolder, ComposableLambdaKt.composableLambda(composer, -497631156, true, new AnonymousClass2(this.$destination, navBackStackEntry2)), composer, 456);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
