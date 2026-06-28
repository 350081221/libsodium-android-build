package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\u0002J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0007J\u0006\u0010\u000b\u001a\u00020\u0006R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/lifecycle/ViewModelStore;", "", "", DatabaseFileArchive.COLUMN_KEY, "Landroidx/lifecycle/ViewModel;", "viewModel", "Lkotlin/r2;", "put", "get", "", "keys", "clear", "", "map", "Ljava/util/Map;", "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public class ViewModelStore {

    @l
    private final Map<String, ViewModel> map = new LinkedHashMap();

    public final void clear() {
        Iterator<ViewModel> it = this.map.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.map.clear();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @m
    public final ViewModel get(@l String key) {
        l0.p(key, "key");
        return this.map.get(key);
    }

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Set<String> keys() {
        return new HashSet(this.map.keySet());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void put(@l String key, @l ViewModel viewModel) {
        l0.p(key, "key");
        l0.p(viewModel, "viewModel");
        ViewModel put = this.map.put(key, viewModel);
        if (put != null) {
            put.onCleared();
        }
    }
}
