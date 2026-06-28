package androidx.navigation.fragment;

import android.util.Log;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavigatorState;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/LifecycleEventObserver;", "entry", "Landroidx/navigation/NavBackStackEntry;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FragmentNavigator$fragmentViewObserver$1 extends n0 implements l<NavBackStackEntry, LifecycleEventObserver> {
    final /* synthetic */ FragmentNavigator this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentNavigator$fragmentViewObserver$1(FragmentNavigator fragmentNavigator) {
        super(1);
        this.this$0 = fragmentNavigator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(FragmentNavigator this$0, NavBackStackEntry entry, LifecycleOwner owner, Lifecycle.Event event) {
        NavigatorState state;
        NavigatorState state2;
        NavigatorState state3;
        l0.p(this$0, "this$0");
        l0.p(entry, "$entry");
        l0.p(owner, "owner");
        l0.p(event, "event");
        if (event == Lifecycle.Event.ON_RESUME) {
            state2 = this$0.getState();
            if (state2.getBackStack().getValue().contains(entry)) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentNavigator", "Marking transition complete for entry " + entry + " due to fragment " + owner + " view lifecycle reaching RESUMED");
                }
                state3 = this$0.getState();
                state3.markTransitionComplete(entry);
            }
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentNavigator", "Marking transition complete for entry " + entry + " due to fragment " + owner + " view lifecycle reaching DESTROYED");
            }
            state = this$0.getState();
            state.markTransitionComplete(entry);
        }
    }

    @Override // v3.l
    @p4.l
    public final LifecycleEventObserver invoke(@p4.l final NavBackStackEntry entry) {
        l0.p(entry, "entry");
        final FragmentNavigator fragmentNavigator = this.this$0;
        return new LifecycleEventObserver() { // from class: androidx.navigation.fragment.d
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                FragmentNavigator$fragmentViewObserver$1.invoke$lambda$0(FragmentNavigator.this, entry, lifecycleOwner, event);
            }
        };
    }
}
