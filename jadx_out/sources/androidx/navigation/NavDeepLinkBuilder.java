package androidx.navigation;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.IdRes;
import androidx.annotation.NavigationRes;
import androidx.core.app.TaskStackBuilder;
import androidx.navigation.Navigator;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.umeng.analytics.pro.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.k;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;
import u3.i;

@i0(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u000223B\u000f\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b-\u0010.B\u0011\b\u0010\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\b-\u00101J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0018\u0010\f\u001a\u00020\u00002\u0010\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\tJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rJ\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0001\u0010\u000f\u001a\u00020\u0002J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011J\u001e\u0010\u0015\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007J\u001c\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007J\u001e\u0010\u0018\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007J\u001c\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00162\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007J\u0010\u0010\u001a\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013J\u0006\u0010\u001c\u001a\u00020\u001bJ\u0006\u0010\u001e\u001a\u00020\u001dR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010%\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u00064"}, d2 = {"Landroidx/navigation/NavDeepLinkBuilder;", "", "", "destId", "Landroidx/navigation/NavDestination;", "findDestination", "Lkotlin/r2;", "verifyAllDestinations", "fillInIntent", "Ljava/lang/Class;", "Landroid/app/Activity;", "activityClass", "setComponentName", "Landroid/content/ComponentName;", "componentName", "navGraphId", "setGraph", "Landroidx/navigation/NavGraph;", "navGraph", "Landroid/os/Bundle;", "args", "setDestination", "", "destRoute", "addDestination", "route", "setArguments", "Landroidx/core/app/TaskStackBuilder;", "createTaskStackBuilder", "Landroid/app/PendingIntent;", "createPendingIntent", "Landroid/content/Context;", d.X, "Landroid/content/Context;", "Landroid/content/Intent;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/content/Intent;", "graph", "Landroidx/navigation/NavGraph;", "", "Landroidx/navigation/NavDeepLinkBuilder$DeepLinkDestination;", "destinations", "Ljava/util/List;", "globalArgs", "Landroid/os/Bundle;", "<init>", "(Landroid/content/Context;)V", "Landroidx/navigation/NavController;", "navController", "(Landroidx/navigation/NavController;)V", "DeepLinkDestination", "PermissiveNavigatorProvider", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class NavDeepLinkBuilder {

    @l
    private final Context context;

    @l
    private final List<DeepLinkDestination> destinations;

    @m
    private Bundle globalArgs;

    @m
    private NavGraph graph;

    @l
    private final Intent intent;

    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/navigation/NavDeepLinkBuilder$DeepLinkDestination;", "", "destinationId", "", "arguments", "Landroid/os/Bundle;", "(ILandroid/os/Bundle;)V", "getArguments", "()Landroid/os/Bundle;", "getDestinationId", "()I", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DeepLinkDestination {

        @m
        private final Bundle arguments;
        private final int destinationId;

        public DeepLinkDestination(int i5, @m Bundle bundle) {
            this.destinationId = i5;
            this.arguments = bundle;
        }

        @m
        public final Bundle getArguments() {
            return this.arguments;
        }

        public final int getDestinationId() {
            return this.destinationId;
        }
    }

    @i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J'\u0010\u0006\u001a\u0002H\u0007\"\u0010\b\u0000\u0010\u0007*\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\nR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Landroidx/navigation/NavDeepLinkBuilder$PermissiveNavigatorProvider;", "Landroidx/navigation/NavigatorProvider;", "()V", "mDestNavigator", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "getNavigator", "T", "name", "", "(Ljava/lang/String;)Landroidx/navigation/Navigator;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    private static final class PermissiveNavigatorProvider extends NavigatorProvider {

        @l
        private final Navigator<NavDestination> mDestNavigator = new Navigator<NavDestination>() { // from class: androidx.navigation.NavDeepLinkBuilder$PermissiveNavigatorProvider$mDestNavigator$1
            @Override // androidx.navigation.Navigator
            @l
            public NavDestination createDestination() {
                return new NavDestination("permissive");
            }

            @Override // androidx.navigation.Navigator
            @m
            public NavDestination navigate(@l NavDestination destination, @m Bundle bundle, @m NavOptions navOptions, @m Navigator.Extras extras) {
                l0.p(destination, "destination");
                throw new IllegalStateException("navigate is not supported");
            }

            @Override // androidx.navigation.Navigator
            public boolean popBackStack() {
                throw new IllegalStateException("popBackStack is not supported");
            }
        };

        public PermissiveNavigatorProvider() {
            addNavigator(new NavGraphNavigator(this));
        }

        @Override // androidx.navigation.NavigatorProvider
        @l
        public <T extends Navigator<? extends NavDestination>> T getNavigator(@l String name) {
            l0.p(name, "name");
            try {
                return (T) super.getNavigator(name);
            } catch (IllegalStateException unused) {
                Navigator<NavDestination> navigator = this.mDestNavigator;
                l0.n(navigator, "null cannot be cast to non-null type T of androidx.navigation.NavDeepLinkBuilder.PermissiveNavigatorProvider.getNavigator");
                return navigator;
            }
        }
    }

    public NavDeepLinkBuilder(@l Context context) {
        Intent launchIntentForPackage;
        l0.p(context, "context");
        this.context = context;
        if (context instanceof Activity) {
            launchIntentForPackage = new Intent(context, context.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.intent = launchIntentForPackage;
        this.destinations = new ArrayList();
    }

    public static /* synthetic */ NavDeepLinkBuilder addDestination$default(NavDeepLinkBuilder navDeepLinkBuilder, int i5, Bundle bundle, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            bundle = null;
        }
        return navDeepLinkBuilder.addDestination(i5, bundle);
    }

    private final void fillInIntent() {
        int[] R5;
        ArrayList arrayList = new ArrayList();
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
        NavDestination navDestination = null;
        for (DeepLinkDestination deepLinkDestination : this.destinations) {
            int destinationId = deepLinkDestination.getDestinationId();
            Bundle arguments = deepLinkDestination.getArguments();
            NavDestination findDestination = findDestination(destinationId);
            if (findDestination != null) {
                for (int i5 : findDestination.buildDeepLinkIds(navDestination)) {
                    arrayList.add(Integer.valueOf(i5));
                    arrayList2.add(arguments);
                }
                navDestination = findDestination;
            } else {
                throw new IllegalArgumentException("Navigation destination " + NavDestination.Companion.getDisplayName(this.context, destinationId) + " cannot be found in the navigation graph " + this.graph);
            }
        }
        R5 = e0.R5(arrayList);
        this.intent.putExtra(NavController.KEY_DEEP_LINK_IDS, R5);
        this.intent.putParcelableArrayListExtra(NavController.KEY_DEEP_LINK_ARGS, arrayList2);
    }

    private final NavDestination findDestination(@IdRes int i5) {
        k kVar = new k();
        NavGraph navGraph = this.graph;
        l0.m(navGraph);
        kVar.add(navGraph);
        while (!kVar.isEmpty()) {
            NavDestination navDestination = (NavDestination) kVar.removeFirst();
            if (navDestination.getId() == i5) {
                return navDestination;
            }
            if (navDestination instanceof NavGraph) {
                Iterator<NavDestination> it = ((NavGraph) navDestination).iterator();
                while (it.hasNext()) {
                    kVar.add(it.next());
                }
            }
        }
        return null;
    }

    public static /* synthetic */ NavDeepLinkBuilder setDestination$default(NavDeepLinkBuilder navDeepLinkBuilder, int i5, Bundle bundle, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            bundle = null;
        }
        return navDeepLinkBuilder.setDestination(i5, bundle);
    }

    private final void verifyAllDestinations() {
        Iterator<DeepLinkDestination> it = this.destinations.iterator();
        while (it.hasNext()) {
            int destinationId = it.next().getDestinationId();
            if (findDestination(destinationId) == null) {
                throw new IllegalArgumentException("Navigation destination " + NavDestination.Companion.getDisplayName(this.context, destinationId) + " cannot be found in the navigation graph " + this.graph);
            }
        }
    }

    @l
    @i
    public final NavDeepLinkBuilder addDestination(@IdRes int i5) {
        return addDestination$default(this, i5, (Bundle) null, 2, (Object) null);
    }

    @l
    @i
    public final NavDeepLinkBuilder addDestination(@IdRes int i5, @m Bundle bundle) {
        this.destinations.add(new DeepLinkDestination(i5, bundle));
        if (this.graph != null) {
            verifyAllDestinations();
        }
        return this;
    }

    @l
    @i
    public final NavDeepLinkBuilder addDestination(@l String route) {
        l0.p(route, "route");
        return addDestination$default(this, route, (Bundle) null, 2, (Object) null);
    }

    @l
    public final PendingIntent createPendingIntent() {
        int i5;
        int i6;
        int i7;
        Bundle bundle = this.globalArgs;
        if (bundle != null) {
            Iterator<String> it = bundle.keySet().iterator();
            i5 = 0;
            while (it.hasNext()) {
                Object obj = bundle.get(it.next());
                int i8 = i5 * 31;
                if (obj != null) {
                    i7 = obj.hashCode();
                } else {
                    i7 = 0;
                }
                i5 = i8 + i7;
            }
        } else {
            i5 = 0;
        }
        for (DeepLinkDestination deepLinkDestination : this.destinations) {
            i5 = (i5 * 31) + deepLinkDestination.getDestinationId();
            Bundle arguments = deepLinkDestination.getArguments();
            if (arguments != null) {
                Iterator<String> it2 = arguments.keySet().iterator();
                while (it2.hasNext()) {
                    Object obj2 = arguments.get(it2.next());
                    int i9 = i5 * 31;
                    if (obj2 != null) {
                        i6 = obj2.hashCode();
                    } else {
                        i6 = 0;
                    }
                    i5 = i9 + i6;
                }
            }
        }
        PendingIntent pendingIntent = createTaskStackBuilder().getPendingIntent(i5, 201326592);
        l0.m(pendingIntent);
        return pendingIntent;
    }

    @l
    public final TaskStackBuilder createTaskStackBuilder() {
        if (this.graph != null) {
            if (!this.destinations.isEmpty()) {
                fillInIntent();
                TaskStackBuilder addNextIntentWithParentStack = TaskStackBuilder.create(this.context).addNextIntentWithParentStack(new Intent(this.intent));
                l0.o(addNextIntentWithParentStack, "create(context)\n        …rentStack(Intent(intent))");
                int intentCount = addNextIntentWithParentStack.getIntentCount();
                for (int i5 = 0; i5 < intentCount; i5++) {
                    Intent editIntentAt = addNextIntentWithParentStack.editIntentAt(i5);
                    if (editIntentAt != null) {
                        editIntentAt.putExtra(NavController.KEY_DEEP_LINK_INTENT, this.intent);
                    }
                }
                return addNextIntentWithParentStack;
            }
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link".toString());
        }
        throw new IllegalStateException("You must call setGraph() before constructing the deep link".toString());
    }

    @l
    public final NavDeepLinkBuilder setArguments(@m Bundle bundle) {
        this.globalArgs = bundle;
        this.intent.putExtra(NavController.KEY_DEEP_LINK_EXTRAS, bundle);
        return this;
    }

    @l
    public final NavDeepLinkBuilder setComponentName(@l Class<? extends Activity> activityClass) {
        l0.p(activityClass, "activityClass");
        return setComponentName(new ComponentName(this.context, activityClass));
    }

    @l
    @i
    public final NavDeepLinkBuilder setDestination(@IdRes int i5) {
        return setDestination$default(this, i5, (Bundle) null, 2, (Object) null);
    }

    @l
    @i
    public final NavDeepLinkBuilder setDestination(@IdRes int i5, @m Bundle bundle) {
        this.destinations.clear();
        this.destinations.add(new DeepLinkDestination(i5, bundle));
        if (this.graph != null) {
            verifyAllDestinations();
        }
        return this;
    }

    @l
    @i
    public final NavDeepLinkBuilder setDestination(@l String destRoute) {
        l0.p(destRoute, "destRoute");
        return setDestination$default(this, destRoute, (Bundle) null, 2, (Object) null);
    }

    @l
    public final NavDeepLinkBuilder setGraph(@NavigationRes int i5) {
        return setGraph(new NavInflater(this.context, new PermissiveNavigatorProvider()).inflate(i5));
    }

    public static /* synthetic */ NavDeepLinkBuilder addDestination$default(NavDeepLinkBuilder navDeepLinkBuilder, String str, Bundle bundle, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            bundle = null;
        }
        return navDeepLinkBuilder.addDestination(str, bundle);
    }

    public static /* synthetic */ NavDeepLinkBuilder setDestination$default(NavDeepLinkBuilder navDeepLinkBuilder, String str, Bundle bundle, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            bundle = null;
        }
        return navDeepLinkBuilder.setDestination(str, bundle);
    }

    @l
    public final NavDeepLinkBuilder setComponentName(@l ComponentName componentName) {
        l0.p(componentName, "componentName");
        this.intent.setComponent(componentName);
        return this;
    }

    @l
    public final NavDeepLinkBuilder setGraph(@l NavGraph navGraph) {
        l0.p(navGraph, "navGraph");
        this.graph = navGraph;
        verifyAllDestinations();
        return this;
    }

    @l
    @i
    public final NavDeepLinkBuilder addDestination(@l String route, @m Bundle bundle) {
        l0.p(route, "route");
        this.destinations.add(new DeepLinkDestination(NavDestination.Companion.createRoute(route).hashCode(), bundle));
        if (this.graph != null) {
            verifyAllDestinations();
        }
        return this;
    }

    @l
    @i
    public final NavDeepLinkBuilder setDestination(@l String destRoute, @m Bundle bundle) {
        l0.p(destRoute, "destRoute");
        this.destinations.clear();
        this.destinations.add(new DeepLinkDestination(NavDestination.Companion.createRoute(destRoute).hashCode(), bundle));
        if (this.graph != null) {
            verifyAllDestinations();
        }
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavDeepLinkBuilder(@l NavController navController) {
        this(navController.getContext());
        l0.p(navController, "navController");
        this.graph = navController.getGraph();
    }
}
