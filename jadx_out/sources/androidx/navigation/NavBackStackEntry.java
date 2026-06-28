package androidx.navigation;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.umeng.analytics.pro.d;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import kotlin.d0;
import kotlin.f0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 a2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003abcBS\b\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\"\u001a\u00020!\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010'\u001a\u00020\u0013\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b]\u0010^B\u001d\b\u0017\u0012\u0006\u0010_\u001a\u00020\u0000\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b]\u0010`J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J\b\u0010\t\u001a\u00020\u0007H\u0007J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u0004\u0018\u00010$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0017\u0010'\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0016\u0010+\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010 R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001b\u00109\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001b\u0010>\u001a\u00020:8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b;\u00106\u001a\u0004\b<\u0010=R*\u0010@\u001a\u00020!2\u0006\u0010?\u001a\u00020!8G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010#\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001a\u0010F\u001a\u00020E8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0013\u0010L\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010T\u001a\u00020Q8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0014\u0010X\u001a\u00020U8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0014\u0010\\\u001a\u00020Y8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[¨\u0006d"}, d2 = {"Landroidx/navigation/NavBackStackEntry;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/ViewModelStoreOwner;", "Landroidx/lifecycle/HasDefaultViewModelProviderFactory;", "Landroidx/savedstate/SavedStateRegistryOwner;", "Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "Lkotlin/r2;", "handleLifecycleEvent", "updateState", "Landroid/os/Bundle;", "outBundle", "saveState", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "", "toString", "Landroid/content/Context;", d.X, "Landroid/content/Context;", "Landroidx/navigation/NavDestination;", "destination", "Landroidx/navigation/NavDestination;", "getDestination", "()Landroidx/navigation/NavDestination;", "setDestination", "(Landroidx/navigation/NavDestination;)V", "immutableArgs", "Landroid/os/Bundle;", "Landroidx/lifecycle/Lifecycle$State;", "hostLifecycleState", "Landroidx/lifecycle/Lifecycle$State;", "Landroidx/navigation/NavViewModelStoreProvider;", "viewModelStoreProvider", "Landroidx/navigation/NavViewModelStoreProvider;", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "savedState", "Landroidx/lifecycle/LifecycleRegistry;", "_lifecycle", "Landroidx/lifecycle/LifecycleRegistry;", "Landroidx/savedstate/SavedStateRegistryController;", "savedStateRegistryController", "Landroidx/savedstate/SavedStateRegistryController;", "savedStateRegistryAttached", "Z", "Landroidx/lifecycle/SavedStateViewModelFactory;", "defaultFactory$delegate", "Lkotlin/d0;", "getDefaultFactory", "()Landroidx/lifecycle/SavedStateViewModelFactory;", "defaultFactory", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle$delegate", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "maxState", "maxLifecycle", "getMaxLifecycle", "()Landroidx/lifecycle/Lifecycle$State;", "setMaxLifecycle", "(Landroidx/lifecycle/Lifecycle$State;)V", "Landroidx/lifecycle/ViewModelProvider$Factory;", "defaultViewModelProviderFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getDefaultViewModelProviderFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "getArguments", "()Landroid/os/Bundle;", "arguments", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/lifecycle/ViewModelStore;", "getViewModelStore", "()Landroidx/lifecycle/ViewModelStore;", "viewModelStore", "Landroidx/lifecycle/viewmodel/CreationExtras;", "getDefaultViewModelCreationExtras", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "defaultViewModelCreationExtras", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistry", "<init>", "(Landroid/content/Context;Landroidx/navigation/NavDestination;Landroid/os/Bundle;Landroidx/lifecycle/Lifecycle$State;Landroidx/navigation/NavViewModelStoreProvider;Ljava/lang/String;Landroid/os/Bundle;)V", "entry", "(Landroidx/navigation/NavBackStackEntry;Landroid/os/Bundle;)V", "Companion", "NavResultSavedStateFactory", "SavedStateViewModel", "navigation-common_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nNavBackStackEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavBackStackEntry.kt\nandroidx/navigation/NavBackStackEntry\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,294:1\n1726#2,3:295\n1855#2,2:298\n*S KotlinDebug\n*F\n+ 1 NavBackStackEntry.kt\nandroidx/navigation/NavBackStackEntry\n*L\n251#1:295,3\n259#1:298,2\n*E\n"})
/* loaded from: classes2.dex */
public final class NavBackStackEntry implements LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private LifecycleRegistry _lifecycle;

    @m
    private final Context context;

    @l
    private final d0 defaultFactory$delegate;

    @l
    private final ViewModelProvider.Factory defaultViewModelProviderFactory;

    @l
    private NavDestination destination;

    @l
    private Lifecycle.State hostLifecycleState;

    @l
    private final String id;

    @m
    private final Bundle immutableArgs;

    @l
    private Lifecycle.State maxLifecycle;

    @m
    private final Bundle savedState;

    @l
    private final d0 savedStateHandle$delegate;
    private boolean savedStateRegistryAttached;

    @l
    private final SavedStateRegistryController savedStateRegistryController;

    @m
    private final NavViewModelStoreProvider viewModelStoreProvider;

    @i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JR\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0007¨\u0006\u0012"}, d2 = {"Landroidx/navigation/NavBackStackEntry$Companion;", "", "()V", "create", "Landroidx/navigation/NavBackStackEntry;", d.X, "Landroid/content/Context;", "destination", "Landroidx/navigation/NavDestination;", "arguments", "Landroid/os/Bundle;", "hostLifecycleState", "Landroidx/lifecycle/Lifecycle$State;", "viewModelStoreProvider", "Landroidx/navigation/NavViewModelStoreProvider;", "id", "", "savedState", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        public static /* synthetic */ NavBackStackEntry create$default(Companion companion, Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, NavViewModelStoreProvider navViewModelStoreProvider, String str, Bundle bundle2, int i5, Object obj) {
            Bundle bundle3;
            Lifecycle.State state2;
            NavViewModelStoreProvider navViewModelStoreProvider2;
            String str2;
            Bundle bundle4;
            if ((i5 & 4) != 0) {
                bundle3 = null;
            } else {
                bundle3 = bundle;
            }
            if ((i5 & 8) != 0) {
                state2 = Lifecycle.State.CREATED;
            } else {
                state2 = state;
            }
            if ((i5 & 16) != 0) {
                navViewModelStoreProvider2 = null;
            } else {
                navViewModelStoreProvider2 = navViewModelStoreProvider;
            }
            if ((i5 & 32) != 0) {
                String uuid = UUID.randomUUID().toString();
                l0.o(uuid, "randomUUID().toString()");
                str2 = uuid;
            } else {
                str2 = str;
            }
            if ((i5 & 64) != 0) {
                bundle4 = null;
            } else {
                bundle4 = bundle2;
            }
            return companion.create(context, navDestination, bundle3, state2, navViewModelStoreProvider2, str2, bundle4);
        }

        @l
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final NavBackStackEntry create(@m Context context, @l NavDestination destination, @m Bundle bundle, @l Lifecycle.State hostLifecycleState, @m NavViewModelStoreProvider navViewModelStoreProvider, @l String id, @m Bundle bundle2) {
            l0.p(destination, "destination");
            l0.p(hostLifecycleState, "hostLifecycleState");
            l0.p(id, "id");
            return new NavBackStackEntry(context, destination, bundle, hostLifecycleState, navViewModelStoreProvider, id, bundle2, null);
        }
    }

    @i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J5\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00060\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/navigation/NavBackStackEntry$NavResultSavedStateFactory;", "Landroidx/lifecycle/AbstractSavedStateViewModelFactory;", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "(Landroidx/savedstate/SavedStateRegistryOwner;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", DatabaseFileArchive.COLUMN_KEY, "", "modelClass", "Ljava/lang/Class;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/SavedStateHandle;)Landroidx/lifecycle/ViewModel;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class NavResultSavedStateFactory extends AbstractSavedStateViewModelFactory {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavResultSavedStateFactory(@l SavedStateRegistryOwner owner) {
            super(owner, null);
            l0.p(owner, "owner");
        }

        @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
        @l
        protected <T extends ViewModel> T create(@l String key, @l Class<T> modelClass, @l SavedStateHandle handle) {
            l0.p(key, "key");
            l0.p(modelClass, "modelClass");
            l0.p(handle, "handle");
            return new SavedStateViewModel(handle);
        }
    }

    @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/navigation/NavBackStackEntry$SavedStateViewModel;", "Landroidx/lifecycle/ViewModel;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "getHandle", "()Landroidx/lifecycle/SavedStateHandle;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class SavedStateViewModel extends ViewModel {

        @l
        private final SavedStateHandle handle;

        public SavedStateViewModel(@l SavedStateHandle handle) {
            l0.p(handle, "handle");
            this.handle = handle;
        }

        @l
        public final SavedStateHandle getHandle() {
            return this.handle;
        }
    }

    private NavBackStackEntry(Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, NavViewModelStoreProvider navViewModelStoreProvider, String str, Bundle bundle2) {
        d0 c5;
        d0 c6;
        this.context = context;
        this.destination = navDestination;
        this.immutableArgs = bundle;
        this.hostLifecycleState = state;
        this.viewModelStoreProvider = navViewModelStoreProvider;
        this.id = str;
        this.savedState = bundle2;
        this._lifecycle = new LifecycleRegistry(this);
        this.savedStateRegistryController = SavedStateRegistryController.Companion.create(this);
        c5 = f0.c(new NavBackStackEntry$defaultFactory$2(this));
        this.defaultFactory$delegate = c5;
        c6 = f0.c(new NavBackStackEntry$savedStateHandle$2(this));
        this.savedStateHandle$delegate = c6;
        this.maxLifecycle = Lifecycle.State.INITIALIZED;
        this.defaultViewModelProviderFactory = getDefaultFactory();
    }

    public /* synthetic */ NavBackStackEntry(Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, NavViewModelStoreProvider navViewModelStoreProvider, String str, Bundle bundle2, w wVar) {
        this(context, navDestination, bundle, state, navViewModelStoreProvider, str, bundle2);
    }

    private final SavedStateViewModelFactory getDefaultFactory() {
        return (SavedStateViewModelFactory) this.defaultFactory$delegate.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@p4.m java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L90
            boolean r1 = r7 instanceof androidx.navigation.NavBackStackEntry
            if (r1 != 0) goto L9
            goto L90
        L9:
            java.lang.String r1 = r6.id
            androidx.navigation.NavBackStackEntry r7 = (androidx.navigation.NavBackStackEntry) r7
            java.lang.String r2 = r7.id
            boolean r1 = kotlin.jvm.internal.l0.g(r1, r2)
            if (r1 == 0) goto L90
            androidx.navigation.NavDestination r1 = r6.destination
            androidx.navigation.NavDestination r2 = r7.destination
            boolean r1 = kotlin.jvm.internal.l0.g(r1, r2)
            if (r1 == 0) goto L90
            androidx.lifecycle.Lifecycle r1 = r6.getLifecycle()
            androidx.lifecycle.Lifecycle r2 = r7.getLifecycle()
            boolean r1 = kotlin.jvm.internal.l0.g(r1, r2)
            if (r1 == 0) goto L90
            androidx.savedstate.SavedStateRegistry r1 = r6.getSavedStateRegistry()
            androidx.savedstate.SavedStateRegistry r2 = r7.getSavedStateRegistry()
            boolean r1 = kotlin.jvm.internal.l0.g(r1, r2)
            if (r1 == 0) goto L90
            android.os.Bundle r1 = r6.immutableArgs
            android.os.Bundle r2 = r7.immutableArgs
            boolean r1 = kotlin.jvm.internal.l0.g(r1, r2)
            r2 = 1
            if (r1 != 0) goto L8f
            android.os.Bundle r1 = r6.immutableArgs
            if (r1 == 0) goto L8c
            java.util.Set r1 = r1.keySet()
            if (r1 == 0) goto L8c
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r3 = r1 instanceof java.util.Collection
            if (r3 == 0) goto L61
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L61
        L5f:
            r7 = r2
            goto L88
        L61:
            java.util.Iterator r1 = r1.iterator()
        L65:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L5f
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            android.os.Bundle r4 = r6.immutableArgs
            java.lang.Object r4 = r4.get(r3)
            android.os.Bundle r5 = r7.immutableArgs
            if (r5 == 0) goto L80
            java.lang.Object r3 = r5.get(r3)
            goto L81
        L80:
            r3 = 0
        L81:
            boolean r3 = kotlin.jvm.internal.l0.g(r4, r3)
            if (r3 != 0) goto L65
            r7 = r0
        L88:
            if (r7 != r2) goto L8c
            r7 = r2
            goto L8d
        L8c:
            r7 = r0
        L8d:
            if (r7 == 0) goto L90
        L8f:
            r0 = r2
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavBackStackEntry.equals(java.lang.Object):boolean");
    }

    @m
    public final Bundle getArguments() {
        if (this.immutableArgs == null) {
            return null;
        }
        return new Bundle(this.immutableArgs);
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @l
    public CreationExtras getDefaultViewModelCreationExtras() {
        Object obj;
        Application application = null;
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(null, 1, null);
        Context context = this.context;
        if (context != null) {
            obj = context.getApplicationContext();
        } else {
            obj = null;
        }
        if (obj instanceof Application) {
            application = (Application) obj;
        }
        if (application != null) {
            mutableCreationExtras.set(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY, application);
        }
        mutableCreationExtras.set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this);
        mutableCreationExtras.set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            mutableCreationExtras.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, arguments);
        }
        return mutableCreationExtras;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @l
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return this.defaultViewModelProviderFactory;
    }

    @l
    public final NavDestination getDestination() {
        return this.destination;
    }

    @l
    public final String getId() {
        return this.id;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @l
    public Lifecycle getLifecycle() {
        return this._lifecycle;
    }

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Lifecycle.State getMaxLifecycle() {
        return this.maxLifecycle;
    }

    @l
    public final SavedStateHandle getSavedStateHandle() {
        return (SavedStateHandle) this.savedStateHandle$delegate.getValue();
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    @l
    public SavedStateRegistry getSavedStateRegistry() {
        return this.savedStateRegistryController.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    @l
    public ViewModelStore getViewModelStore() {
        boolean z4;
        if (this.savedStateRegistryAttached) {
            if (getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                NavViewModelStoreProvider navViewModelStoreProvider = this.viewModelStoreProvider;
                if (navViewModelStoreProvider != null) {
                    return navViewModelStoreProvider.getViewModelStore(this.id);
                }
                throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.".toString());
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.".toString());
        }
        throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void handleLifecycleEvent(@l Lifecycle.Event event) {
        l0.p(event, "event");
        this.hostLifecycleState = event.getTargetState();
        updateState();
    }

    public int hashCode() {
        Set<String> keySet;
        int i5;
        int hashCode = (this.id.hashCode() * 31) + this.destination.hashCode();
        Bundle bundle = this.immutableArgs;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i6 = hashCode * 31;
                Object obj = this.immutableArgs.get((String) it.next());
                if (obj != null) {
                    i5 = obj.hashCode();
                } else {
                    i5 = 0;
                }
                hashCode = i6 + i5;
            }
        }
        return (((hashCode * 31) + getLifecycle().hashCode()) * 31) + getSavedStateRegistry().hashCode();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void saveState(@l Bundle outBundle) {
        l0.p(outBundle, "outBundle");
        this.savedStateRegistryController.performSave(outBundle);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setDestination(@l NavDestination navDestination) {
        l0.p(navDestination, "<set-?>");
        this.destination = navDestination;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setMaxLifecycle(@l Lifecycle.State maxState) {
        l0.p(maxState, "maxState");
        this.maxLifecycle = maxState;
        updateState();
    }

    @l
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NavBackStackEntry.class.getSimpleName());
        sb.append('(' + this.id + ')');
        sb.append(" destination=");
        sb.append(this.destination);
        String sb2 = sb.toString();
        l0.o(sb2, "sb.toString()");
        return sb2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void updateState() {
        if (!this.savedStateRegistryAttached) {
            this.savedStateRegistryController.performAttach();
            this.savedStateRegistryAttached = true;
            if (this.viewModelStoreProvider != null) {
                SavedStateHandleSupport.enableSavedStateHandles(this);
            }
            this.savedStateRegistryController.performRestore(this.savedState);
        }
        if (this.hostLifecycleState.ordinal() < this.maxLifecycle.ordinal()) {
            this._lifecycle.setCurrentState(this.hostLifecycleState);
        } else {
            this._lifecycle.setCurrentState(this.maxLifecycle);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    /* synthetic */ NavBackStackEntry(android.content.Context r11, androidx.navigation.NavDestination r12, android.os.Bundle r13, androidx.lifecycle.Lifecycle.State r14, androidx.navigation.NavViewModelStoreProvider r15, java.lang.String r16, android.os.Bundle r17, int r18, kotlin.jvm.internal.w r19) {
        /*
            r10 = this;
            r0 = r18 & 4
            r1 = 0
            if (r0 == 0) goto L7
            r5 = r1
            goto L8
        L7:
            r5 = r13
        L8:
            r0 = r18 & 8
            if (r0 == 0) goto L10
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.CREATED
            r6 = r0
            goto L11
        L10:
            r6 = r14
        L11:
            r0 = r18 & 16
            if (r0 == 0) goto L17
            r7 = r1
            goto L18
        L17:
            r7 = r15
        L18:
            r0 = r18 & 32
            if (r0 == 0) goto L2b
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "randomUUID().toString()"
            kotlin.jvm.internal.l0.o(r0, r2)
            r8 = r0
            goto L2d
        L2b:
            r8 = r16
        L2d:
            r0 = r18 & 64
            if (r0 == 0) goto L33
            r9 = r1
            goto L35
        L33:
            r9 = r17
        L35:
            r2 = r10
            r3 = r11
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavBackStackEntry.<init>(android.content.Context, androidx.navigation.NavDestination, android.os.Bundle, androidx.lifecycle.Lifecycle$State, androidx.navigation.NavViewModelStoreProvider, java.lang.String, android.os.Bundle, int, kotlin.jvm.internal.w):void");
    }

    public /* synthetic */ NavBackStackEntry(NavBackStackEntry navBackStackEntry, Bundle bundle, int i5, w wVar) {
        this(navBackStackEntry, (i5 & 2) != 0 ? navBackStackEntry.getArguments() : bundle);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavBackStackEntry(@l NavBackStackEntry entry, @m Bundle bundle) {
        this(entry.context, entry.destination, bundle, entry.hostLifecycleState, entry.viewModelStoreProvider, entry.id, entry.savedState);
        l0.p(entry, "entry");
        this.hostLifecycleState = entry.hostLifecycleState;
        setMaxLifecycle(entry.maxLifecycle);
    }
}
