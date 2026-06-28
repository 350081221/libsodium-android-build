package androidx.savedstate;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.lifecycle.Lifecycle;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import u3.m;

@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0011\b\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/savedstate/SavedStateRegistryController;", "", "Lkotlin/r2;", "performAttach", "Landroid/os/Bundle;", "savedState", "performRestore", "outBundle", "performSave", "Landroidx/savedstate/SavedStateRegistryOwner;", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistry", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;", "", "attached", "Z", "<init>", "(Landroidx/savedstate/SavedStateRegistryOwner;)V", "Companion", "savedstate_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SavedStateRegistryController {

    @l
    public static final Companion Companion = new Companion(null);
    private boolean attached;

    @l
    private final SavedStateRegistryOwner owner;

    @l
    private final SavedStateRegistry savedStateRegistry;

    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/savedstate/SavedStateRegistryController$Companion;", "", "()V", "create", "Landroidx/savedstate/SavedStateRegistryController;", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        @m
        public final SavedStateRegistryController create(@l SavedStateRegistryOwner owner) {
            l0.p(owner, "owner");
            return new SavedStateRegistryController(owner, null);
        }
    }

    private SavedStateRegistryController(SavedStateRegistryOwner savedStateRegistryOwner) {
        this.owner = savedStateRegistryOwner;
        this.savedStateRegistry = new SavedStateRegistry();
    }

    public /* synthetic */ SavedStateRegistryController(SavedStateRegistryOwner savedStateRegistryOwner, w wVar) {
        this(savedStateRegistryOwner);
    }

    @l
    @m
    public static final SavedStateRegistryController create(@l SavedStateRegistryOwner savedStateRegistryOwner) {
        return Companion.create(savedStateRegistryOwner);
    }

    @l
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.savedStateRegistry;
    }

    @MainThread
    public final void performAttach() {
        boolean z4;
        Lifecycle lifecycle = this.owner.getLifecycle();
        if (lifecycle.getCurrentState() == Lifecycle.State.INITIALIZED) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            lifecycle.addObserver(new Recreator(this.owner));
            this.savedStateRegistry.performAttach$savedstate_release(lifecycle);
            this.attached = true;
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    @MainThread
    public final void performRestore(@p4.m Bundle bundle) {
        if (!this.attached) {
            performAttach();
        }
        Lifecycle lifecycle = this.owner.getLifecycle();
        if (!lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            this.savedStateRegistry.performRestore$savedstate_release(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.getCurrentState()).toString());
    }

    @MainThread
    public final void performSave(@l Bundle outBundle) {
        l0.p(outBundle, "outBundle");
        this.savedStateRegistry.performSave(outBundle);
    }
}
