package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.Recreator;
import java.util.Iterator;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 /2\u00020\u0001:\u00030/1B\t\b\u0000¢\u0006\u0004\b-\u0010.J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u000f\u001a\u00020\b2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\fH\u0007J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0018\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0004H\u0007R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R$\u0010$\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u001e8G@BX\u0086\u000e¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\"\u0010)\u001a\u00020\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010 \u001a\u0004\b*\u0010%\"\u0004\b+\u0010,¨\u00062"}, d2 = {"Landroidx/savedstate/SavedStateRegistry;", "", "", DatabaseFileArchive.COLUMN_KEY, "Landroid/os/Bundle;", "consumeRestoredStateForKey", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "provider", "Lkotlin/r2;", "registerSavedStateProvider", "getSavedStateProvider", "unregisterSavedStateProvider", "Ljava/lang/Class;", "Landroidx/savedstate/SavedStateRegistry$AutoRecreated;", "clazz", "runOnNextRecreation", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "performAttach$savedstate_release", "(Landroidx/lifecycle/Lifecycle;)V", "performAttach", "savedState", "performRestore$savedstate_release", "(Landroid/os/Bundle;)V", "performRestore", "outBundle", "performSave", "Landroidx/arch/core/internal/SafeIterableMap;", "components", "Landroidx/arch/core/internal/SafeIterableMap;", "", "attached", "Z", "restoredState", "Landroid/os/Bundle;", "<set-?>", "isRestored", "()Z", "Landroidx/savedstate/Recreator$SavedStateProvider;", "recreatorProvider", "Landroidx/savedstate/Recreator$SavedStateProvider;", "isAllowingSavingState", "isAllowingSavingState$savedstate_release", "setAllowingSavingState$savedstate_release", "(Z)V", "<init>", "()V", "Companion", "AutoRecreated", "SavedStateProvider", "savedstate_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"RestrictedApi"})
@r1({"SMAP\nSavedStateRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateRegistry.kt\nandroidx/savedstate/SavedStateRegistry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,272:1\n1#2:273\n*E\n"})
/* loaded from: classes2.dex */
public final class SavedStateRegistry {

    @l
    private static final Companion Companion = new Companion(null);

    @l
    @Deprecated
    private static final String SAVED_COMPONENTS_KEY = "androidx.lifecycle.BundlableSavedStateRegistry.key";
    private boolean attached;

    @l
    private final SafeIterableMap<String, SavedStateProvider> components = new SafeIterableMap<>();
    private boolean isAllowingSavingState = true;
    private boolean isRestored;

    @m
    private Recreator.SavedStateProvider recreatorProvider;

    @m
    private Bundle restoredState;

    @i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/savedstate/SavedStateRegistry$AutoRecreated;", "", "Landroidx/savedstate/SavedStateRegistryOwner;", "owner", "Lkotlin/r2;", "onRecreated", "savedstate_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public interface AutoRecreated {
        void onRecreated(@l SavedStateRegistryOwner savedStateRegistryOwner);
    }

    @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/savedstate/SavedStateRegistry$Companion;", "", "()V", "SAVED_COMPONENTS_KEY", "", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    @i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "", "saveState", "Landroid/os/Bundle;", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public interface SavedStateProvider {
        @l
        Bundle saveState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void performAttach$lambda$4(SavedStateRegistry this$0, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        l0.p(this$0, "this$0");
        l0.p(lifecycleOwner, "<anonymous parameter 0>");
        l0.p(event, "event");
        if (event == Lifecycle.Event.ON_START) {
            this$0.isAllowingSavingState = true;
        } else if (event == Lifecycle.Event.ON_STOP) {
            this$0.isAllowingSavingState = false;
        }
    }

    @MainThread
    @m
    public final Bundle consumeRestoredStateForKey(@l String key) {
        Bundle bundle;
        l0.p(key, "key");
        if (this.isRestored) {
            Bundle bundle2 = this.restoredState;
            if (bundle2 == null) {
                return null;
            }
            if (bundle2 != null) {
                bundle = bundle2.getBundle(key);
            } else {
                bundle = null;
            }
            Bundle bundle3 = this.restoredState;
            if (bundle3 != null) {
                bundle3.remove(key);
            }
            Bundle bundle4 = this.restoredState;
            boolean z4 = false;
            if (bundle4 != null && !bundle4.isEmpty()) {
                z4 = true;
            }
            if (!z4) {
                this.restoredState = null;
            }
            return bundle;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    @m
    public final SavedStateProvider getSavedStateProvider(@l String key) {
        l0.p(key, "key");
        Iterator<Map.Entry<String, SavedStateProvider>> it = this.components.iterator();
        while (it.hasNext()) {
            Map.Entry<String, SavedStateProvider> components = it.next();
            l0.o(components, "components");
            String key2 = components.getKey();
            SavedStateProvider value = components.getValue();
            if (l0.g(key2, key)) {
                return value;
            }
        }
        return null;
    }

    public final boolean isAllowingSavingState$savedstate_release() {
        return this.isAllowingSavingState;
    }

    @MainThread
    public final boolean isRestored() {
        return this.isRestored;
    }

    @MainThread
    public final void performAttach$savedstate_release(@l Lifecycle lifecycle) {
        l0.p(lifecycle, "lifecycle");
        if (!this.attached) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: androidx.savedstate.a
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    SavedStateRegistry.performAttach$lambda$4(SavedStateRegistry.this, lifecycleOwner, event);
                }
            });
            this.attached = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
    }

    @MainThread
    public final void performRestore$savedstate_release(@m Bundle bundle) {
        Bundle bundle2;
        if (this.attached) {
            if (!this.isRestored) {
                if (bundle != null) {
                    bundle2 = bundle.getBundle(SAVED_COMPONENTS_KEY);
                } else {
                    bundle2 = null;
                }
                this.restoredState = bundle2;
                this.isRestored = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
    }

    @MainThread
    public final void performSave(@l Bundle outBundle) {
        l0.p(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.restoredState;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        SafeIterableMap<String, SavedStateProvider>.IteratorWithAdditions iteratorWithAdditions = this.components.iteratorWithAdditions();
        l0.o(iteratorWithAdditions, "this.components.iteratorWithAdditions()");
        while (iteratorWithAdditions.hasNext()) {
            Map.Entry next = iteratorWithAdditions.next();
            bundle.putBundle((String) next.getKey(), ((SavedStateProvider) next.getValue()).saveState());
        }
        if (!bundle.isEmpty()) {
            outBundle.putBundle(SAVED_COMPONENTS_KEY, bundle);
        }
    }

    @MainThread
    public final void registerSavedStateProvider(@l String key, @l SavedStateProvider provider) {
        boolean z4;
        l0.p(key, "key");
        l0.p(provider, "provider");
        if (this.components.putIfAbsent(key, provider) == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
        } else {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    @MainThread
    public final void runOnNextRecreation(@l Class<? extends AutoRecreated> clazz) {
        l0.p(clazz, "clazz");
        if (this.isAllowingSavingState) {
            Recreator.SavedStateProvider savedStateProvider = this.recreatorProvider;
            if (savedStateProvider == null) {
                savedStateProvider = new Recreator.SavedStateProvider(this);
            }
            this.recreatorProvider = savedStateProvider;
            try {
                clazz.getDeclaredConstructor(new Class[0]);
                Recreator.SavedStateProvider savedStateProvider2 = this.recreatorProvider;
                if (savedStateProvider2 != null) {
                    String name = clazz.getName();
                    l0.o(name, "clazz.name");
                    savedStateProvider2.add(name);
                    return;
                }
                return;
            } catch (NoSuchMethodException e5) {
                throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e5);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
    }

    public final void setAllowingSavingState$savedstate_release(boolean z4) {
        this.isAllowingSavingState = z4;
    }

    @MainThread
    public final void unregisterSavedStateProvider(@l String key) {
        l0.p(key, "key");
        this.components.remove(key);
    }
}
