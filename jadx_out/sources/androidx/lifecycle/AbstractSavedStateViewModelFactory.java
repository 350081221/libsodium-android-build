package androidx.lifecycle;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#B\t\b\u0016¢\u0006\u0004\b\u001e\u0010\u001fB\u001b\b\u0016\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001e\u0010\"J/\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\t\u0010\rJ'\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016¢\u0006\u0004\b\t\u0010\u000eJ7\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0010\u001a\u00020\u000fH$¢\u0006\u0004\b\t\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0003H\u0017R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006$"}, d2 = {"Landroidx/lifecycle/AbstractSavedStateViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$OnRequeryFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Landroidx/lifecycle/ViewModel;", "T", "", DatabaseFileArchive.COLUMN_KEY, "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/SavedStateHandle;", "handle", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/SavedStateHandle;)Landroidx/lifecycle/ViewModel;", "viewModel", "Lkotlin/r2;", "onRequery", "Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistry", "Landroidx/savedstate/SavedStateRegistry;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "Landroid/os/Bundle;", "defaultArgs", "Landroid/os/Bundle;", "<init>", "()V", "Landroidx/savedstate/SavedStateRegistryOwner;", "owner", "(Landroidx/savedstate/SavedStateRegistryOwner;Landroid/os/Bundle;)V", "Companion", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public abstract class AbstractSavedStateViewModelFactory extends ViewModelProvider.OnRequeryFactory implements ViewModelProvider.Factory {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    public static final String TAG_SAVED_STATE_HANDLE_CONTROLLER = "androidx.lifecycle.savedstate.vm.tag";

    @m
    private Bundle defaultArgs;

    @m
    private Lifecycle lifecycle;

    @m
    private SavedStateRegistry savedStateRegistry;

    @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/AbstractSavedStateViewModelFactory$Companion;", "", "()V", "TAG_SAVED_STATE_HANDLE_CONTROLLER", "", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    public AbstractSavedStateViewModelFactory() {
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @l
    public <T extends ViewModel> T create(@l Class<T> modelClass, @l CreationExtras extras) {
        l0.p(modelClass, "modelClass");
        l0.p(extras, "extras");
        String str = (String) extras.get(ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY);
        if (str != null) {
            if (this.savedStateRegistry != null) {
                return (T) create(str, modelClass);
            }
            return (T) create(str, modelClass, SavedStateHandleSupport.createSavedStateHandle(extras));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @l
    protected abstract <T extends ViewModel> T create(@l String str, @l Class<T> cls, @l SavedStateHandle savedStateHandle);

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onRequery(@l ViewModel viewModel) {
        l0.p(viewModel, "viewModel");
        SavedStateRegistry savedStateRegistry = this.savedStateRegistry;
        if (savedStateRegistry != null) {
            l0.m(savedStateRegistry);
            Lifecycle lifecycle = this.lifecycle;
            l0.m(lifecycle);
            LegacySavedStateHandleController.attachHandleIfNeeded(viewModel, savedStateRegistry, lifecycle);
        }
    }

    public AbstractSavedStateViewModelFactory(@l SavedStateRegistryOwner owner, @m Bundle bundle) {
        l0.p(owner, "owner");
        this.savedStateRegistry = owner.getSavedStateRegistry();
        this.lifecycle = owner.getLifecycle();
        this.defaultArgs = bundle;
    }

    private final <T extends ViewModel> T create(String str, Class<T> cls) {
        SavedStateRegistry savedStateRegistry = this.savedStateRegistry;
        l0.m(savedStateRegistry);
        Lifecycle lifecycle = this.lifecycle;
        l0.m(lifecycle);
        SavedStateHandleController create = LegacySavedStateHandleController.create(savedStateRegistry, lifecycle, str, this.defaultArgs);
        T t5 = (T) create(str, cls, create.getHandle());
        t5.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", create);
        return t5;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @l
    public <T extends ViewModel> T create(@l Class<T> modelClass) {
        l0.p(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            if (this.lifecycle != null) {
                return (T) create(canonicalName, modelClass);
            }
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
