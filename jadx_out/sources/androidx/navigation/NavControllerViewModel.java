package androidx.navigation;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;
import u3.m;

@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0001\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\u0007\u001a\u00020\u0005H\u0014J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Landroidx/navigation/NavControllerViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/navigation/NavViewModelStoreProvider;", "", "backStackEntryId", "Lkotlin/r2;", "clear", "onCleared", "Landroidx/lifecycle/ViewModelStore;", "getViewModelStore", "toString", "", "viewModelStores", "Ljava/util/Map;", "<init>", "()V", "Companion", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class NavControllerViewModel extends ViewModel implements NavViewModelStoreProvider {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final ViewModelProvider.Factory FACTORY = new ViewModelProvider.Factory() { // from class: androidx.navigation.NavControllerViewModel$Companion$FACTORY$1
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        @l
        public <T extends ViewModel> T create(@l Class<T> modelClass) {
            l0.p(modelClass, "modelClass");
            return new NavControllerViewModel();
        }
    };

    @l
    private final Map<String, ViewModelStore> viewModelStores = new LinkedHashMap();

    @i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/navigation/NavControllerViewModel$Companion;", "", "()V", "FACTORY", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getInstance", "Landroidx/navigation/NavControllerViewModel;", "viewModelStore", "Landroidx/lifecycle/ViewModelStore;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nNavControllerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavControllerViewModel.kt\nandroidx/navigation/NavControllerViewModel$Companion\n+ 2 ViewModelProvider.kt\nandroidx/lifecycle/ViewModelProviderGetKt\n*L\n1#1,82:1\n374#2:83\n*S KotlinDebug\n*F\n+ 1 NavControllerViewModel.kt\nandroidx/navigation/NavControllerViewModel$Companion\n*L\n78#1:83\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        @m
        public final NavControllerViewModel getInstance(@l ViewModelStore viewModelStore) {
            l0.p(viewModelStore, "viewModelStore");
            return (NavControllerViewModel) new ViewModelProvider(viewModelStore, NavControllerViewModel.FACTORY, null, 4, null).get(NavControllerViewModel.class);
        }
    }

    @l
    @m
    public static final NavControllerViewModel getInstance(@l ViewModelStore viewModelStore) {
        return Companion.getInstance(viewModelStore);
    }

    public final void clear(@l String backStackEntryId) {
        l0.p(backStackEntryId, "backStackEntryId");
        ViewModelStore remove = this.viewModelStores.remove(backStackEntryId);
        if (remove != null) {
            remove.clear();
        }
    }

    @Override // androidx.navigation.NavViewModelStoreProvider
    @l
    public ViewModelStore getViewModelStore(@l String backStackEntryId) {
        l0.p(backStackEntryId, "backStackEntryId");
        ViewModelStore viewModelStore = this.viewModelStores.get(backStackEntryId);
        if (viewModelStore == null) {
            ViewModelStore viewModelStore2 = new ViewModelStore();
            this.viewModelStores.put(backStackEntryId, viewModelStore2);
            return viewModelStore2;
        }
        return viewModelStore;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        Iterator<ViewModelStore> it = this.viewModelStores.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.viewModelStores.clear();
    }

    @l
    public String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator<String> it = this.viewModelStores.keySet().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        String sb2 = sb.toString();
        l0.o(sb2, "sb.toString()");
        return sb2;
    }
}
