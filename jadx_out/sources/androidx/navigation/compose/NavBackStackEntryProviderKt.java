package androidx.navigation.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import java.lang.ref.WeakReference;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a.\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a&\u0010\t\u001a\u00020\u0004*\u00020\u00012\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/navigation/NavBackStackEntry;", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "saveableStateHolder", "Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "content", "LocalOwnersProvider", "(Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/saveable/SaveableStateHolder;Lv3/p;Landroidx/compose/runtime/Composer;I)V", "SaveableStateProvider", "(Landroidx/compose/runtime/saveable/SaveableStateHolder;Lv3/p;Landroidx/compose/runtime/Composer;I)V", "navigation-compose_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nNavBackStackEntryProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavBackStackEntryProvider.kt\nandroidx/navigation/compose/NavBackStackEntryProviderKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n*L\n1#1,87:1\n81#2,11:88\n*S KotlinDebug\n*F\n+ 1 NavBackStackEntryProvider.kt\nandroidx/navigation/compose/NavBackStackEntryProviderKt\n*L\n58#1:88,11\n*E\n"})
/* loaded from: classes2.dex */
public final class NavBackStackEntryProviderKt {
    @Composable
    public static final void LocalOwnersProvider(@l NavBackStackEntry navBackStackEntry, @l SaveableStateHolder saveableStateHolder, @l p<? super Composer, ? super Integer, r2> pVar, @m Composer composer, int i5) {
        Composer startRestartGroup = composer.startRestartGroup(-1579360880);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1579360880, i5, -1, "androidx.navigation.compose.LocalOwnersProvider (NavBackStackEntryProvider.kt:45)");
        }
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{LocalViewModelStoreOwner.INSTANCE.provides(navBackStackEntry), AndroidCompositionLocals_androidKt.getLocalLifecycleOwner().provides(navBackStackEntry), AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner().provides(navBackStackEntry)}, ComposableLambdaKt.composableLambda(startRestartGroup, -52928304, true, new NavBackStackEntryProviderKt$LocalOwnersProvider$1(saveableStateHolder, pVar, i5)), startRestartGroup, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new NavBackStackEntryProviderKt$LocalOwnersProvider$2(navBackStackEntry, saveableStateHolder, pVar, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void SaveableStateProvider(SaveableStateHolder saveableStateHolder, p<? super Composer, ? super Integer, r2> pVar, Composer composer, int i5) {
        CreationExtras creationExtras;
        Composer startRestartGroup = composer.startRestartGroup(1211832233);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1211832233, i5, -1, "androidx.navigation.compose.SaveableStateProvider (NavBackStackEntryProvider.kt:56)");
        }
        startRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, 6);
        if (current != null) {
            if (current instanceof HasDefaultViewModelProviderFactory) {
                creationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                creationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel(BackStackEntryIdViewModel.class, current, null, null, creationExtras, startRestartGroup, 36936, 0);
            startRestartGroup.endReplaceableGroup();
            BackStackEntryIdViewModel backStackEntryIdViewModel = (BackStackEntryIdViewModel) viewModel;
            backStackEntryIdViewModel.setSaveableStateHolderRef(new WeakReference<>(saveableStateHolder));
            saveableStateHolder.SaveableStateProvider(backStackEntryIdViewModel.getId(), pVar, startRestartGroup, (i5 & 112) | 520);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new NavBackStackEntryProviderKt$SaveableStateProvider$1(saveableStateHolder, pVar, i5));
                return;
            }
            return;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
    }
}
