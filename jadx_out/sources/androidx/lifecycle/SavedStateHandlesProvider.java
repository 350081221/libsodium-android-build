package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import java.util.Map;
import kotlin.d0;
import kotlin.f0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Landroidx/lifecycle/SavedStateHandlesProvider;", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "Landroid/os/Bundle;", "saveState", "Lkotlin/r2;", "performRestore", "", DatabaseFileArchive.COLUMN_KEY, "consumeRestoredStateForKey", "Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistry", "Landroidx/savedstate/SavedStateRegistry;", "", "restored", "Z", "restoredState", "Landroid/os/Bundle;", "Landroidx/lifecycle/SavedStateHandlesVM;", "viewModel$delegate", "Lkotlin/d0;", "getViewModel", "()Landroidx/lifecycle/SavedStateHandlesVM;", "viewModel", "Landroidx/lifecycle/ViewModelStoreOwner;", "viewModelStoreOwner", "<init>", "(Landroidx/savedstate/SavedStateRegistry;Landroidx/lifecycle/ViewModelStoreOwner;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSavedStateHandleSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandlesProvider\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,226:1\n215#2,2:227\n1#3:229\n*S KotlinDebug\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandlesProvider\n*L\n147#1:227,2\n*E\n"})
/* loaded from: classes2.dex */
public final class SavedStateHandlesProvider implements SavedStateRegistry.SavedStateProvider {
    private boolean restored;

    @m
    private Bundle restoredState;

    @l
    private final SavedStateRegistry savedStateRegistry;

    @l
    private final d0 viewModel$delegate;

    public SavedStateHandlesProvider(@l SavedStateRegistry savedStateRegistry, @l ViewModelStoreOwner viewModelStoreOwner) {
        d0 c5;
        l0.p(savedStateRegistry, "savedStateRegistry");
        l0.p(viewModelStoreOwner, "viewModelStoreOwner");
        this.savedStateRegistry = savedStateRegistry;
        c5 = f0.c(new SavedStateHandlesProvider$viewModel$2(viewModelStoreOwner));
        this.viewModel$delegate = c5;
    }

    private final SavedStateHandlesVM getViewModel() {
        return (SavedStateHandlesVM) this.viewModel$delegate.getValue();
    }

    @m
    public final Bundle consumeRestoredStateForKey(@l String key) {
        Bundle bundle;
        l0.p(key, "key");
        performRestore();
        Bundle bundle2 = this.restoredState;
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
        if (bundle4 != null && bundle4.isEmpty()) {
            z4 = true;
        }
        if (z4) {
            this.restoredState = null;
        }
        return bundle;
    }

    public final void performRestore() {
        if (!this.restored) {
            Bundle consumeRestoredStateForKey = this.savedStateRegistry.consumeRestoredStateForKey("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle bundle = new Bundle();
            Bundle bundle2 = this.restoredState;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            if (consumeRestoredStateForKey != null) {
                bundle.putAll(consumeRestoredStateForKey);
            }
            this.restoredState = bundle;
            this.restored = true;
            getViewModel();
        }
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    @l
    public Bundle saveState() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.restoredState;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry<String, SavedStateHandle> entry : getViewModel().getHandles().entrySet()) {
            String key = entry.getKey();
            Bundle saveState = entry.getValue().savedStateProvider().saveState();
            if (!l0.g(saveState, Bundle.EMPTY)) {
                bundle.putBundle(key, saveState);
            }
        }
        this.restored = false;
        return bundle;
    }
}
