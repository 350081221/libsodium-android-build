package androidx.navigation.fragment;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavigatorState;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nFragmentNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator$attachClearViewModel$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,719:1\n1855#2,2:720\n*S KotlinDebug\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator$attachClearViewModel$1\n*L\n259#1:720,2\n*E\n"})
/* loaded from: classes2.dex */
final class FragmentNavigator$attachClearViewModel$1 extends n0 implements v3.a<r2> {
    final /* synthetic */ NavBackStackEntry $entry;
    final /* synthetic */ Fragment $fragment;
    final /* synthetic */ NavigatorState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentNavigator$attachClearViewModel$1(NavBackStackEntry navBackStackEntry, NavigatorState navigatorState, Fragment fragment) {
        super(0);
        this.$entry = navBackStackEntry;
        this.$state = navigatorState;
        this.$fragment = fragment;
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ r2 invoke() {
        invoke2();
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        NavigatorState navigatorState = this.$state;
        Fragment fragment = this.$fragment;
        for (NavBackStackEntry navBackStackEntry : navigatorState.getTransitionsInProgress().getValue()) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentNavigator", "Marking transition complete for entry " + navBackStackEntry + " due to fragment " + fragment + " viewmodel being cleared");
            }
            navigatorState.markTransitionComplete(navBackStackEntry);
        }
    }
}
