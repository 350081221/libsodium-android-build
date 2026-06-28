package androidx.compose.ui.platform;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Lkotlin/Function0;", "Lkotlin/r2;", "installForLifecycle", "ui_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ViewCompositionStrategy_androidKt {
    public static final /* synthetic */ v3.a access$installForLifecycle(AbstractComposeView abstractComposeView, Lifecycle lifecycle) {
        return installForLifecycle(abstractComposeView, lifecycle);
    }

    public static final v3.a<r2> installForLifecycle(final AbstractComposeView abstractComposeView, Lifecycle lifecycle) {
        boolean z4;
        if (lifecycle.getCurrentState().compareTo(Lifecycle.State.DESTROYED) > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.compose.ui.platform.f2
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    ViewCompositionStrategy_androidKt.installForLifecycle$lambda$1(AbstractComposeView.this, lifecycleOwner, event);
                }
            };
            lifecycle.addObserver(lifecycleEventObserver);
            return new ViewCompositionStrategy_androidKt$installForLifecycle$2(lifecycle, lifecycleEventObserver);
        }
        throw new IllegalStateException(("Cannot configure " + abstractComposeView + " to disposeComposition at Lifecycle ON_DESTROY: " + lifecycle + "is already destroyed").toString());
    }

    public static final void installForLifecycle$lambda$1(AbstractComposeView abstractComposeView, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            abstractComposeView.disposeComposition();
        }
    }
}
