package androidx.navigation.fragment;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavBackStackEntry;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.u0;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/LifecycleOwner;", "kotlin.jvm.PlatformType", "owner", "Lkotlin/r2;", "invoke", "(Landroidx/lifecycle/LifecycleOwner;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nFragmentNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator$attachObservers$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,719:1\n1747#2,3:720\n*S KotlinDebug\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator$attachObservers$1\n*L\n233#1:720,3\n*E\n"})
/* loaded from: classes2.dex */
public final class FragmentNavigator$attachObservers$1 extends n0 implements l<LifecycleOwner, r2> {
    final /* synthetic */ NavBackStackEntry $entry;
    final /* synthetic */ Fragment $fragment;
    final /* synthetic */ FragmentNavigator this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentNavigator$attachObservers$1(FragmentNavigator fragmentNavigator, Fragment fragment, NavBackStackEntry navBackStackEntry) {
        super(1);
        this.this$0 = fragmentNavigator;
        this.$fragment = fragment;
        this.$entry = navBackStackEntry;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(LifecycleOwner lifecycleOwner) {
        invoke2(lifecycleOwner);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LifecycleOwner lifecycleOwner) {
        l lVar;
        List<u0<String, Boolean>> pendingOps$navigation_fragment_release = this.this$0.getPendingOps$navigation_fragment_release();
        Fragment fragment = this.$fragment;
        boolean z4 = false;
        if (!(pendingOps$navigation_fragment_release instanceof Collection) || !pendingOps$navigation_fragment_release.isEmpty()) {
            Iterator<T> it = pendingOps$navigation_fragment_release.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (l0.g(((u0) it.next()).getFirst(), fragment.getTag())) {
                    z4 = true;
                    break;
                }
            }
        }
        if (lifecycleOwner == null || z4) {
            return;
        }
        Lifecycle lifecycle = this.$fragment.getViewLifecycleOwner().getLifecycle();
        if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            lVar = this.this$0.fragmentViewObserver;
            lifecycle.addObserver((LifecycleObserver) lVar.invoke(this.$entry));
        }
    }
}
