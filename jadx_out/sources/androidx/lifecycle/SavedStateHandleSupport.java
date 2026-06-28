package androidx.lifecycle;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;

@i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0004\u001a\u00020\u0003\"\f\b\u0000\u0010\u0002*\u00020\u0000*\u00020\u0001*\u00028\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a*\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002\u001a\f\u0010\r\u001a\u00020\f*\u00020\u000eH\u0007\"\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010\"\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\"\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014\"\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014\"\u0018\u0010\u001a\u001a\u00020\u0017*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u0018\u0010\u001e\u001a\u00020\u001b*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/savedstate/SavedStateRegistryOwner;", "Landroidx/lifecycle/ViewModelStoreOwner;", "T", "Lkotlin/r2;", "enableSavedStateHandles", "(Landroidx/savedstate/SavedStateRegistryOwner;)V", "savedStateRegistryOwner", "viewModelStoreOwner", "", DatabaseFileArchive.COLUMN_KEY, "Landroid/os/Bundle;", "defaultArgs", "Landroidx/lifecycle/SavedStateHandle;", "createSavedStateHandle", "Landroidx/lifecycle/viewmodel/CreationExtras;", "VIEWMODEL_KEY", "Ljava/lang/String;", "SAVED_STATE_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "SAVED_STATE_REGISTRY_OWNER_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "VIEW_MODEL_STORE_OWNER_KEY", "DEFAULT_ARGS_KEY", "Landroidx/lifecycle/SavedStateHandlesVM;", "getSavedStateHandlesVM", "(Landroidx/lifecycle/ViewModelStoreOwner;)Landroidx/lifecycle/SavedStateHandlesVM;", "savedStateHandlesVM", "Landroidx/lifecycle/SavedStateHandlesProvider;", "getSavedStateHandlesProvider", "(Landroidx/savedstate/SavedStateRegistryOwner;)Landroidx/lifecycle/SavedStateHandlesProvider;", "savedStateHandlesProvider", "lifecycle-viewmodel-savedstate_release"}, k = 2, mv = {1, 8, 0})
@u3.h(name = "SavedStateHandleSupport")
@r1({"SMAP\nSavedStateHandleSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandleSupport\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,226:1\n1#2:227\n*E\n"})
/* loaded from: classes2.dex */
public final class SavedStateHandleSupport {

    @l
    private static final String SAVED_STATE_KEY = "androidx.lifecycle.internal.SavedStateHandlesProvider";

    @l
    private static final String VIEWMODEL_KEY = "androidx.lifecycle.internal.SavedStateHandlesVM";

    @l
    @u3.e
    public static final CreationExtras.Key<SavedStateRegistryOwner> SAVED_STATE_REGISTRY_OWNER_KEY = new CreationExtras.Key<SavedStateRegistryOwner>() { // from class: androidx.lifecycle.SavedStateHandleSupport$SAVED_STATE_REGISTRY_OWNER_KEY$1
    };

    @l
    @u3.e
    public static final CreationExtras.Key<ViewModelStoreOwner> VIEW_MODEL_STORE_OWNER_KEY = new CreationExtras.Key<ViewModelStoreOwner>() { // from class: androidx.lifecycle.SavedStateHandleSupport$VIEW_MODEL_STORE_OWNER_KEY$1
    };

    @l
    @u3.e
    public static final CreationExtras.Key<Bundle> DEFAULT_ARGS_KEY = new CreationExtras.Key<Bundle>() { // from class: androidx.lifecycle.SavedStateHandleSupport$DEFAULT_ARGS_KEY$1
    };

    private static final SavedStateHandle createSavedStateHandle(SavedStateRegistryOwner savedStateRegistryOwner, ViewModelStoreOwner viewModelStoreOwner, String str, Bundle bundle) {
        SavedStateHandlesProvider savedStateHandlesProvider = getSavedStateHandlesProvider(savedStateRegistryOwner);
        SavedStateHandlesVM savedStateHandlesVM = getSavedStateHandlesVM(viewModelStoreOwner);
        SavedStateHandle savedStateHandle = savedStateHandlesVM.getHandles().get(str);
        if (savedStateHandle != null) {
            return savedStateHandle;
        }
        SavedStateHandle createHandle = SavedStateHandle.Companion.createHandle(savedStateHandlesProvider.consumeRestoredStateForKey(str), bundle);
        savedStateHandlesVM.getHandles().put(str, createHandle);
        return createHandle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @MainThread
    public static final <T extends SavedStateRegistryOwner & ViewModelStoreOwner> void enableSavedStateHandles(@l T t5) {
        boolean z4;
        l0.p(t5, "<this>");
        Lifecycle.State currentState = t5.getLifecycle().getCurrentState();
        if (currentState != Lifecycle.State.INITIALIZED && currentState != Lifecycle.State.CREATED) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4) {
            if (t5.getSavedStateRegistry().getSavedStateProvider(SAVED_STATE_KEY) == null) {
                SavedStateHandlesProvider savedStateHandlesProvider = new SavedStateHandlesProvider(t5.getSavedStateRegistry(), t5);
                t5.getSavedStateRegistry().registerSavedStateProvider(SAVED_STATE_KEY, savedStateHandlesProvider);
                t5.getLifecycle().addObserver(new SavedStateHandleAttacher(savedStateHandlesProvider));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @l
    public static final SavedStateHandlesProvider getSavedStateHandlesProvider(@l SavedStateRegistryOwner savedStateRegistryOwner) {
        SavedStateHandlesProvider savedStateHandlesProvider;
        l0.p(savedStateRegistryOwner, "<this>");
        SavedStateRegistry.SavedStateProvider savedStateProvider = savedStateRegistryOwner.getSavedStateRegistry().getSavedStateProvider(SAVED_STATE_KEY);
        if (savedStateProvider instanceof SavedStateHandlesProvider) {
            savedStateHandlesProvider = (SavedStateHandlesProvider) savedStateProvider;
        } else {
            savedStateHandlesProvider = null;
        }
        if (savedStateHandlesProvider != null) {
            return savedStateHandlesProvider;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    @l
    public static final SavedStateHandlesVM getSavedStateHandlesVM(@l ViewModelStoreOwner viewModelStoreOwner) {
        l0.p(viewModelStoreOwner, "<this>");
        return (SavedStateHandlesVM) new ViewModelProvider(viewModelStoreOwner, new ViewModelProvider.Factory() { // from class: androidx.lifecycle.SavedStateHandleSupport$savedStateHandlesVM$1
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            @l
            public <T extends ViewModel> T create(@l Class<T> modelClass, @l CreationExtras extras) {
                l0.p(modelClass, "modelClass");
                l0.p(extras, "extras");
                return new SavedStateHandlesVM();
            }
        }).get(VIEWMODEL_KEY, SavedStateHandlesVM.class);
    }

    @l
    @MainThread
    public static final SavedStateHandle createSavedStateHandle(@l CreationExtras creationExtras) {
        l0.p(creationExtras, "<this>");
        SavedStateRegistryOwner savedStateRegistryOwner = (SavedStateRegistryOwner) creationExtras.get(SAVED_STATE_REGISTRY_OWNER_KEY);
        if (savedStateRegistryOwner != null) {
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) creationExtras.get(VIEW_MODEL_STORE_OWNER_KEY);
            if (viewModelStoreOwner != null) {
                Bundle bundle = (Bundle) creationExtras.get(DEFAULT_ARGS_KEY);
                String str = (String) creationExtras.get(ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY);
                if (str != null) {
                    return createSavedStateHandle(savedStateRegistryOwner, viewModelStoreOwner, str, bundle);
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }
}
