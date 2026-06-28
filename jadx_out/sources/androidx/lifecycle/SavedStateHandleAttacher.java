package androidx.lifecycle;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Landroidx/lifecycle/SavedStateHandleAttacher;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "Lkotlin/r2;", "onStateChanged", "Landroidx/lifecycle/SavedStateHandlesProvider;", "provider", "Landroidx/lifecycle/SavedStateHandlesProvider;", "<init>", "(Landroidx/lifecycle/SavedStateHandlesProvider;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SavedStateHandleAttacher implements LifecycleEventObserver {

    @l
    private final SavedStateHandlesProvider provider;

    public SavedStateHandleAttacher(@l SavedStateHandlesProvider provider) {
        l0.p(provider, "provider");
        this.provider = provider;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@l LifecycleOwner source, @l Lifecycle.Event event) {
        boolean z4;
        l0.p(source, "source");
        l0.p(event, "event");
        if (event == Lifecycle.Event.ON_CREATE) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            source.getLifecycle().removeObserver(this);
            this.provider.performRestore();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
