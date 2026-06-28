package androidx.navigation.compose;

import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Landroidx/navigation/compose/BackStackEntryIdViewModel;", "Landroidx/lifecycle/ViewModel;", "Lkotlin/r2;", "onCleared", "", "IdKey", "Ljava/lang/String;", "Ljava/util/UUID;", "id", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "Ljava/lang/ref/WeakReference;", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "saveableStateHolderRef", "Ljava/lang/ref/WeakReference;", "getSaveableStateHolderRef", "()Ljava/lang/ref/WeakReference;", "setSaveableStateHolderRef", "(Ljava/lang/ref/WeakReference;)V", "Landroidx/lifecycle/SavedStateHandle;", "handle", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "navigation-compose_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nNavBackStackEntryProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavBackStackEntryProvider.kt\nandroidx/navigation/compose/BackStackEntryIdViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
/* loaded from: classes2.dex */
public final class BackStackEntryIdViewModel extends ViewModel {

    @l
    private final String IdKey = "SaveableStateHolder_BackStackEntryKey";

    @l
    private final UUID id;
    public WeakReference<SaveableStateHolder> saveableStateHolderRef;

    public BackStackEntryIdViewModel(@l SavedStateHandle savedStateHandle) {
        UUID uuid = (UUID) savedStateHandle.get("SaveableStateHolder_BackStackEntryKey");
        if (uuid == null) {
            uuid = UUID.randomUUID();
            savedStateHandle.set("SaveableStateHolder_BackStackEntryKey", uuid);
        }
        this.id = uuid;
    }

    @l
    public final UUID getId() {
        return this.id;
    }

    @l
    public final WeakReference<SaveableStateHolder> getSaveableStateHolderRef() {
        WeakReference<SaveableStateHolder> weakReference = this.saveableStateHolderRef;
        if (weakReference != null) {
            return weakReference;
        }
        l0.S("saveableStateHolderRef");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        SaveableStateHolder saveableStateHolder = getSaveableStateHolderRef().get();
        if (saveableStateHolder != null) {
            saveableStateHolder.removeState(this.id);
        }
        getSaveableStateHolderRef().clear();
    }

    public final void setSaveableStateHolderRef(@l WeakReference<SaveableStateHolder> weakReference) {
        this.saveableStateHolderRef = weakReference;
    }
}
