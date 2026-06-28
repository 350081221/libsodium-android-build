package androidx.navigation.compose;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import java.util.Iterator;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import v3.l;

@i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nNavHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHost.kt\nandroidx/navigation/compose/NavHostKt$NavHost$16$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,368:1\n63#2,5:369\n*S KotlinDebug\n*F\n+ 1 NavHost.kt\nandroidx/navigation/compose/NavHostKt$NavHost$16$1\n*L\n322#1:369,5\n*E\n"})
/* loaded from: classes2.dex */
final class NavHostKt$NavHost$16$1 extends n0 implements l<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ ComposeNavigator $composeNavigator;
    final /* synthetic */ State<List<NavBackStackEntry>> $visibleEntries$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavHostKt$NavHost$16$1(State<? extends List<NavBackStackEntry>> state, ComposeNavigator composeNavigator) {
        super(1);
        this.$visibleEntries$delegate = state;
        this.$composeNavigator = composeNavigator;
    }

    @Override // v3.l
    @p4.l
    public final DisposableEffectResult invoke(@p4.l DisposableEffectScope disposableEffectScope) {
        final State<List<NavBackStackEntry>> state = this.$visibleEntries$delegate;
        final ComposeNavigator composeNavigator = this.$composeNavigator;
        return new DisposableEffectResult() { // from class: androidx.navigation.compose.NavHostKt$NavHost$16$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                Iterator it = NavHostKt.access$NavHost$lambda$6(State.this).iterator();
                while (it.hasNext()) {
                    composeNavigator.onTransitionComplete((NavBackStackEntry) it.next());
                }
            }
        };
    }
}
