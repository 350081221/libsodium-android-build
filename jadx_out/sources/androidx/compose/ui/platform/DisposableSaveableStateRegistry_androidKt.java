package androidx.compose.ui.platform;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.compose.ui.R;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@kotlin.i0(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0000\u001a\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002\u001a \u0010\u0011\u001a\u00020\u0012*\u0016\u0012\u0004\u0012\u00020\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00140\u0013H\u0002\u001a\"\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0014\u0018\u00010\u0013*\u00020\u0012H\u0002\"\u001e\u0010\u0000\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004¨\u0006\u0016"}, d2 = {"AcceptableClasses", "", "Ljava/lang/Class;", "", "[Ljava/lang/Class;", "DisposableSaveableStateRegistry", "Landroidx/compose/ui/platform/DisposableSaveableStateRegistry;", "view", "Landroid/view/View;", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "id", "", "savedStateRegistryOwner", "canBeSavedToBundle", "", t0.b.f22420d, "toBundle", "Landroid/os/Bundle;", "", "", "toMap", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nDisposableSaveableStateRegistry.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DisposableSaveableStateRegistry.android.kt\nandroidx/compose/ui/platform/DisposableSaveableStateRegistry_androidKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,190:1\n1855#2,2:191\n215#3,2:193\n*S KotlinDebug\n*F\n+ 1 DisposableSaveableStateRegistry.android.kt\nandroidx/compose/ui/platform/DisposableSaveableStateRegistry_androidKt\n*L\n172#1:191,2\n181#1:193,2\n*E\n"})
/* loaded from: classes.dex */
public final class DisposableSaveableStateRegistry_androidKt {

    @p4.l
    private static final Class<? extends Object>[] AcceptableClasses = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    @p4.l
    public static final DisposableSaveableStateRegistry DisposableSaveableStateRegistry(@p4.l View view, @p4.l SavedStateRegistryOwner savedStateRegistryOwner) {
        Object parent = view.getParent();
        kotlin.jvm.internal.l0.n(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) parent;
        Object tag = view2.getTag(R.id.compose_view_saveable_id_tag);
        String str = tag instanceof String ? (String) tag : null;
        if (str == null) {
            str = String.valueOf(view2.getId());
        }
        return DisposableSaveableStateRegistry(str, savedStateRegistryOwner);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle DisposableSaveableStateRegistry$lambda$0(SaveableStateRegistry saveableStateRegistry) {
        return toBundle(saveableStateRegistry.performSave());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean canBeSavedToBundle(Object obj) {
        if (obj instanceof SnapshotMutableState) {
            SnapshotMutableState snapshotMutableState = (SnapshotMutableState) obj;
            if (snapshotMutableState.getPolicy() != SnapshotStateKt.neverEqualPolicy() && snapshotMutableState.getPolicy() != SnapshotStateKt.structuralEqualityPolicy() && snapshotMutableState.getPolicy() != SnapshotStateKt.referentialEqualityPolicy()) {
                return false;
            }
            T value = snapshotMutableState.getValue();
            if (value == 0) {
                return true;
            }
            return canBeSavedToBundle(value);
        }
        if ((obj instanceof kotlin.v) && (obj instanceof Serializable)) {
            return false;
        }
        for (Class<? extends Object> cls : AcceptableClasses) {
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    private static final Bundle toBundle(Map<String, ? extends List<? extends Object>> map) {
        ArrayList<? extends Parcelable> arrayList;
        Bundle bundle = new Bundle();
        for (Map.Entry<String, ? extends List<? extends Object>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<? extends Object> value = entry.getValue();
            if (value instanceof ArrayList) {
                arrayList = (ArrayList) value;
            } else {
                arrayList = new ArrayList<>(value);
            }
            bundle.putParcelableArrayList(key, arrayList);
        }
        return bundle;
    }

    private static final Map<String, List<Object>> toMap(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
            kotlin.jvm.internal.l0.n(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
            linkedHashMap.put(str, parcelableArrayList);
        }
        return linkedHashMap;
    }

    @p4.l
    public static final DisposableSaveableStateRegistry DisposableSaveableStateRegistry(@p4.l String str, @p4.l SavedStateRegistryOwner savedStateRegistryOwner) {
        boolean z4;
        String str2 = SaveableStateRegistry.class.getSimpleName() + ':' + str;
        SavedStateRegistry savedStateRegistry = savedStateRegistryOwner.getSavedStateRegistry();
        Bundle consumeRestoredStateForKey = savedStateRegistry.consumeRestoredStateForKey(str2);
        final SaveableStateRegistry SaveableStateRegistry = SaveableStateRegistryKt.SaveableStateRegistry(consumeRestoredStateForKey != null ? toMap(consumeRestoredStateForKey) : null, DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1.INSTANCE);
        try {
            savedStateRegistry.registerSavedStateProvider(str2, new SavedStateRegistry.SavedStateProvider() { // from class: androidx.compose.ui.platform.z
                @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
                public final Bundle saveState() {
                    Bundle DisposableSaveableStateRegistry$lambda$0;
                    DisposableSaveableStateRegistry$lambda$0 = DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry$lambda$0(SaveableStateRegistry.this);
                    return DisposableSaveableStateRegistry$lambda$0;
                }
            });
            z4 = true;
        } catch (IllegalArgumentException unused) {
            z4 = false;
        }
        return new DisposableSaveableStateRegistry(SaveableStateRegistry, new DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1(z4, savedStateRegistry, str2));
    }
}
