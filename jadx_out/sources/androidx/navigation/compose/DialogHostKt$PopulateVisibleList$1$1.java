package androidx.navigation.compose;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavBackStackEntry;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import v3.l;

@i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nDialogHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogHost.kt\nandroidx/navigation/compose/DialogHostKt$PopulateVisibleList$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,137:1\n63#2,5:138\n*S KotlinDebug\n*F\n+ 1 DialogHost.kt\nandroidx/navigation/compose/DialogHostKt$PopulateVisibleList$1$1\n*L\n110#1:138,5\n*E\n"})
/* loaded from: classes2.dex */
final class DialogHostKt$PopulateVisibleList$1$1 extends n0 implements l<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ NavBackStackEntry $entry;
    final /* synthetic */ boolean $isInspecting;
    final /* synthetic */ List<NavBackStackEntry> $this_PopulateVisibleList;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogHostKt$PopulateVisibleList$1$1(NavBackStackEntry navBackStackEntry, boolean z4, List<NavBackStackEntry> list) {
        super(1);
        this.$entry = navBackStackEntry;
        this.$isInspecting = z4;
        this.$this_PopulateVisibleList = list;
    }

    @Override // v3.l
    @p4.l
    public final DisposableEffectResult invoke(@p4.l DisposableEffectScope disposableEffectScope) {
        final boolean z4 = this.$isInspecting;
        final List<NavBackStackEntry> list = this.$this_PopulateVisibleList;
        final NavBackStackEntry navBackStackEntry = this.$entry;
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.navigation.compose.DialogHostKt$PopulateVisibleList$1$1$observer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(@p4.l LifecycleOwner lifecycleOwner, @p4.l Lifecycle.Event event) {
                if (z4 && !list.contains(navBackStackEntry)) {
                    list.add(navBackStackEntry);
                }
                if (event == Lifecycle.Event.ON_START && !list.contains(navBackStackEntry)) {
                    list.add(navBackStackEntry);
                }
                if (event == Lifecycle.Event.ON_STOP) {
                    list.remove(navBackStackEntry);
                }
            }
        };
        this.$entry.getLifecycle().addObserver(lifecycleEventObserver);
        final NavBackStackEntry navBackStackEntry2 = this.$entry;
        return new DisposableEffectResult() { // from class: androidx.navigation.compose.DialogHostKt$PopulateVisibleList$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                NavBackStackEntry.this.getLifecycle().removeObserver(lifecycleEventObserver);
            }
        };
    }
}
