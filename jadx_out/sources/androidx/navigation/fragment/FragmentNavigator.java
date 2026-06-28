package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentOnAttachListener;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorProvider;
import androidx.navigation.NavigatorState;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.a1;
import kotlin.collections.b0;
import kotlin.collections.e0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.q1;
import kotlin.r2;
import kotlin.sequences.u;
import kotlin.u0;
import kotlinx.coroutines.flow.t0;
import p4.l;
import p4.m;

@Navigator.Name("fragment")
@i0(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u0000 H2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004IHJKB\u001f\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\bF\u0010GJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J$\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\u001a\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J$\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0012H\u0002J\u0010\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J'\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0012H\u0016J\b\u0010\u001f\u001a\u00020\u0002H\u0016J*\u0010'\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00102\b\u0010&\u001a\u0004\u0018\u00010%H\u0017J*\u0010\r\u001a\u00020\u00072\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030(2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010+\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0003H\u0016J\n\u0010,\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010-\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020%H\u0016R\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010.R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u0010038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R,\u00108\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001207068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R \u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020<0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR \u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030(0B8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006L"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/fragment/FragmentNavigator$Destination;", "Landroidx/navigation/NavBackStackEntry;", "entry", "Landroidx/fragment/app/Fragment;", "fragment", "Lkotlin/r2;", "attachObservers", "Landroidx/navigation/NavOptions;", "navOptions", "Landroidx/navigation/Navigator$Extras;", "navigatorExtras", "navigate", "Landroidx/fragment/app/FragmentTransaction;", "createFragmentTransaction", "", "id", "", "isPop", "deduplicate", "addPendingOps", "Landroidx/navigation/NavigatorState;", "state", "onAttach", "attachClearViewModel$navigation_fragment_release", "(Landroidx/fragment/app/Fragment;Landroidx/navigation/NavBackStackEntry;Landroidx/navigation/NavigatorState;)V", "attachClearViewModel", "popUpTo", "savedState", "popBackStack", "createDestination", "Landroid/content/Context;", com.umeng.analytics.pro.d.X, "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "className", "Landroid/os/Bundle;", "args", "instantiateFragment", "", "entries", "backStackEntry", "onLaunchSingleTop", "onSaveState", "onRestoreState", "Landroid/content/Context;", "Landroidx/fragment/app/FragmentManager;", "", "containerId", "I", "", "savedIds", "Ljava/util/Set;", "", "Lkotlin/u0;", "pendingOps", "Ljava/util/List;", "getPendingOps$navigation_fragment_release", "()Ljava/util/List;", "Landroidx/lifecycle/LifecycleEventObserver;", "fragmentObserver", "Landroidx/lifecycle/LifecycleEventObserver;", "Lkotlin/Function1;", "fragmentViewObserver", "Lv3/l;", "Lkotlinx/coroutines/flow/t0;", "getBackStack$navigation_fragment_release", "()Lkotlinx/coroutines/flow/t0;", "backStack", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;I)V", "Companion", "ClearEntryStateViewModel", "Destination", "Extras", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nFragmentNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator\n+ 2 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,719:1\n31#2:720\n63#2,2:721\n766#3:723\n857#3,2:724\n1855#3,2:726\n518#3,7:728\n533#3,6:735\n*S KotlinDebug\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator\n*L\n253#1:720\n253#1:721,2\n333#1:723\n333#1:724,2\n340#1:726,2\n90#1:728,7\n141#1:735,6\n*E\n"})
/* loaded from: classes2.dex */
public class FragmentNavigator extends Navigator<Destination> {

    @l
    private static final Companion Companion = new Companion(null);

    @l
    private static final String KEY_SAVED_IDS = "androidx-nav-fragment:navigator:savedIds";

    @l
    private static final String TAG = "FragmentNavigator";
    private final int containerId;

    @l
    private final Context context;

    @l
    private final FragmentManager fragmentManager;

    @l
    private final LifecycleEventObserver fragmentObserver;

    @l
    private final v3.l<NavBackStackEntry, LifecycleEventObserver> fragmentViewObserver;

    @l
    private final List<u0<String, Boolean>> pendingOps;

    @l
    private final Set<String> savedIds;

    @i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0014R.\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator$ClearEntryStateViewModel;", "Landroidx/lifecycle/ViewModel;", "Lkotlin/r2;", "onCleared", "Ljava/lang/ref/WeakReference;", "Lkotlin/Function0;", "completeTransition", "Ljava/lang/ref/WeakReference;", "getCompleteTransition", "()Ljava/lang/ref/WeakReference;", "setCompleteTransition", "(Ljava/lang/ref/WeakReference;)V", "<init>", "()V", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class ClearEntryStateViewModel extends ViewModel {
        public WeakReference<v3.a<r2>> completeTransition;

        @l
        public final WeakReference<v3.a<r2>> getCompleteTransition() {
            WeakReference<v3.a<r2>> weakReference = this.completeTransition;
            if (weakReference != null) {
                return weakReference;
            }
            l0.S("completeTransition");
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.ViewModel
        public void onCleared() {
            super.onCleared();
            v3.a<r2> aVar = getCompleteTransition().get();
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public final void setCompleteTransition(@l WeakReference<v3.a<r2>> weakReference) {
            l0.p(weakReference, "<set-?>");
            this.completeTransition = weakReference;
        }
    }

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator$Companion;", "", "()V", "KEY_SAVED_IDS", "", "TAG", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    @NavDestination.ClassType(Fragment.class)
    @i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0016¢\u0006\u0004\b\u0018\u0010\u0019B\u0011\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0018\u0010\u001cJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\b\u0010\u000b\u001a\u00020\bH\u0016J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator$Destination;", "Landroidx/navigation/NavDestination;", "Landroid/content/Context;", com.umeng.analytics.pro.d.X, "Landroid/util/AttributeSet;", "attrs", "Lkotlin/r2;", "onInflate", "", "className", "setClassName", "toString", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "_className", "Ljava/lang/String;", "getClassName", "()Ljava/lang/String;", "Landroidx/navigation/Navigator;", "fragmentNavigator", "<init>", "(Landroidx/navigation/Navigator;)V", "Landroidx/navigation/NavigatorProvider;", "navigatorProvider", "(Landroidx/navigation/NavigatorProvider;)V", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nFragmentNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator$Destination\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,719:1\n232#2,3:720\n1#3:723\n*S KotlinDebug\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator$Destination\n*L\n575#1:720,3\n*E\n"})
    /* loaded from: classes2.dex */
    public static class Destination extends NavDestination {

        @m
        private String _className;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Destination(@l Navigator<? extends Destination> fragmentNavigator) {
            super(fragmentNavigator);
            l0.p(fragmentNavigator, "fragmentNavigator");
        }

        @Override // androidx.navigation.NavDestination
        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof Destination)) {
                return false;
            }
            if (super.equals(obj) && l0.g(this._className, ((Destination) obj)._className)) {
                return true;
            }
            return false;
        }

        @l
        public final String getClassName() {
            String str = this._className;
            if (str != null) {
                l0.n(str, "null cannot be cast to non-null type kotlin.String");
                return str;
            }
            throw new IllegalStateException("Fragment class was not set".toString());
        }

        @Override // androidx.navigation.NavDestination
        public int hashCode() {
            int i5;
            int hashCode = super.hashCode() * 31;
            String str = this._className;
            if (str != null) {
                i5 = str.hashCode();
            } else {
                i5 = 0;
            }
            return hashCode + i5;
        }

        @Override // androidx.navigation.NavDestination
        @CallSuper
        public void onInflate(@l Context context, @l AttributeSet attrs) {
            l0.p(context, "context");
            l0.p(attrs, "attrs");
            super.onInflate(context, attrs);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, R.styleable.FragmentNavigator);
            l0.o(obtainAttributes, "context.resources.obtain…leable.FragmentNavigator)");
            String string = obtainAttributes.getString(R.styleable.FragmentNavigator_android_name);
            if (string != null) {
                setClassName(string);
            }
            r2 r2Var = r2.f19517a;
            obtainAttributes.recycle();
        }

        @l
        public final Destination setClassName(@l String className) {
            l0.p(className, "className");
            this._className = className;
            return this;
        }

        @Override // androidx.navigation.NavDestination
        @l
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(" class=");
            String str = this._className;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            String sb2 = sb.toString();
            l0.o(sb2, "sb.toString()");
            return sb2;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Destination(@l NavigatorProvider navigatorProvider) {
            this((Navigator<? extends Destination>) navigatorProvider.getNavigator(FragmentNavigator.class));
            l0.p(navigatorProvider, "navigatorProvider");
        }
    }

    @i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\fB\u001b\b\u0000\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006R*\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\bj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator$Extras;", "Landroidx/navigation/Navigator$Extras;", "sharedElements", "", "Landroid/view/View;", "", "(Ljava/util/Map;)V", "_sharedElements", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "getSharedElements", "()Ljava/util/Map;", "Builder", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Extras implements Navigator.Extras {

        @l
        private final LinkedHashMap<View, String> _sharedElements;

        @i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0006J\u001a\u0010\u000b\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\rJ\u0006\u0010\u000e\u001a\u00020\u000fR*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator$Extras$Builder;", "", "()V", "_sharedElements", "Ljava/util/LinkedHashMap;", "Landroid/view/View;", "", "Lkotlin/collections/LinkedHashMap;", "addSharedElement", "sharedElement", "name", "addSharedElements", "sharedElements", "", "build", "Landroidx/navigation/fragment/FragmentNavigator$Extras;", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class Builder {

            @l
            private final LinkedHashMap<View, String> _sharedElements = new LinkedHashMap<>();

            @l
            public final Builder addSharedElement(@l View sharedElement, @l String name) {
                l0.p(sharedElement, "sharedElement");
                l0.p(name, "name");
                this._sharedElements.put(sharedElement, name);
                return this;
            }

            @l
            public final Builder addSharedElements(@l Map<View, String> sharedElements) {
                l0.p(sharedElements, "sharedElements");
                for (Map.Entry<View, String> entry : sharedElements.entrySet()) {
                    addSharedElement(entry.getKey(), entry.getValue());
                }
                return this;
            }

            @l
            public final Extras build() {
                return new Extras(this._sharedElements);
            }
        }

        public Extras(@l Map<View, String> sharedElements) {
            l0.p(sharedElements, "sharedElements");
            LinkedHashMap<View, String> linkedHashMap = new LinkedHashMap<>();
            this._sharedElements = linkedHashMap;
            linkedHashMap.putAll(sharedElements);
        }

        @l
        public final Map<View, String> getSharedElements() {
            Map<View, String> D0;
            D0 = a1.D0(this._sharedElements);
            return D0;
        }
    }

    public FragmentNavigator(@l Context context, @l FragmentManager fragmentManager, int i5) {
        l0.p(context, "context");
        l0.p(fragmentManager, "fragmentManager");
        this.context = context;
        this.fragmentManager = fragmentManager;
        this.containerId = i5;
        this.savedIds = new LinkedHashSet();
        this.pendingOps = new ArrayList();
        this.fragmentObserver = new LifecycleEventObserver() { // from class: androidx.navigation.fragment.b
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                FragmentNavigator.fragmentObserver$lambda$1(FragmentNavigator.this, lifecycleOwner, event);
            }
        };
        this.fragmentViewObserver = new FragmentNavigator$fragmentViewObserver$1(this);
    }

    private final void addPendingOps(String str, boolean z4, boolean z5) {
        if (z5) {
            b0.I0(this.pendingOps, new FragmentNavigator$addPendingOps$1(str));
        }
        this.pendingOps.add(q1.a(str, Boolean.valueOf(z4)));
    }

    static /* synthetic */ void addPendingOps$default(FragmentNavigator fragmentNavigator, String str, boolean z4, boolean z5, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPendingOps");
        }
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        if ((i5 & 4) != 0) {
            z5 = true;
        }
        fragmentNavigator.addPendingOps(str, z4, z5);
    }

    private final void attachObservers(NavBackStackEntry navBackStackEntry, Fragment fragment) {
        fragment.getViewLifecycleOwnerLiveData().observe(fragment, new FragmentNavigator$sam$androidx_lifecycle_Observer$0(new FragmentNavigator$attachObservers$1(this, fragment, navBackStackEntry)));
        fragment.getLifecycle().addObserver(this.fragmentObserver);
    }

    private final FragmentTransaction createFragmentTransaction(NavBackStackEntry navBackStackEntry, NavOptions navOptions) {
        int i5;
        int i6;
        int i7;
        int i8;
        NavDestination destination = navBackStackEntry.getDestination();
        l0.n(destination, "null cannot be cast to non-null type androidx.navigation.fragment.FragmentNavigator.Destination");
        Bundle arguments = navBackStackEntry.getArguments();
        String className = ((Destination) destination).getClassName();
        int i9 = 0;
        if (className.charAt(0) == '.') {
            className = this.context.getPackageName() + className;
        }
        Fragment instantiate = this.fragmentManager.getFragmentFactory().instantiate(this.context.getClassLoader(), className);
        l0.o(instantiate, "fragmentManager.fragment…t.classLoader, className)");
        instantiate.setArguments(arguments);
        FragmentTransaction beginTransaction = this.fragmentManager.beginTransaction();
        l0.o(beginTransaction, "fragmentManager.beginTransaction()");
        if (navOptions != null) {
            i5 = navOptions.getEnterAnim();
        } else {
            i5 = -1;
        }
        if (navOptions != null) {
            i6 = navOptions.getExitAnim();
        } else {
            i6 = -1;
        }
        if (navOptions != null) {
            i7 = navOptions.getPopEnterAnim();
        } else {
            i7 = -1;
        }
        if (navOptions != null) {
            i8 = navOptions.getPopExitAnim();
        } else {
            i8 = -1;
        }
        if (i5 != -1 || i6 != -1 || i7 != -1 || i8 != -1) {
            if (i5 == -1) {
                i5 = 0;
            }
            if (i6 == -1) {
                i6 = 0;
            }
            if (i7 == -1) {
                i7 = 0;
            }
            if (i8 != -1) {
                i9 = i8;
            }
            beginTransaction.setCustomAnimations(i5, i6, i7, i9);
        }
        beginTransaction.replace(this.containerId, instantiate, navBackStackEntry.getId());
        beginTransaction.setPrimaryNavigationFragment(instantiate);
        beginTransaction.setReorderingAllowed(true);
        return beginTransaction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fragmentObserver$lambda$1(FragmentNavigator this$0, LifecycleOwner source, Lifecycle.Event event) {
        l0.p(this$0, "this$0");
        l0.p(source, "source");
        l0.p(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            Fragment fragment = (Fragment) source;
            Object obj = null;
            for (Object obj2 : this$0.getState().getTransitionsInProgress().getValue()) {
                if (l0.g(((NavBackStackEntry) obj2).getId(), fragment.getTag())) {
                    obj = obj2;
                }
            }
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
            if (navBackStackEntry != null) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(TAG, "Marking transition complete for entry " + navBackStackEntry + " due to fragment " + source + " lifecycle reaching DESTROYED");
                }
                this$0.getState().markTransitionComplete(navBackStackEntry);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttach$lambda$3(NavigatorState state, FragmentNavigator this$0, FragmentManager fragmentManager, Fragment fragment) {
        NavBackStackEntry navBackStackEntry;
        l0.p(state, "$state");
        l0.p(this$0, "this$0");
        l0.p(fragmentManager, "<anonymous parameter 0>");
        l0.p(fragment, "fragment");
        List<NavBackStackEntry> value = state.getBackStack().getValue();
        ListIterator<NavBackStackEntry> listIterator = value.listIterator(value.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                navBackStackEntry = listIterator.previous();
                if (l0.g(navBackStackEntry.getId(), fragment.getTag())) {
                    break;
                }
            } else {
                navBackStackEntry = null;
                break;
            }
        }
        NavBackStackEntry navBackStackEntry2 = navBackStackEntry;
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(TAG, "Attaching fragment " + fragment + " associated with entry " + navBackStackEntry2 + " to FragmentManager " + this$0.fragmentManager);
        }
        if (navBackStackEntry2 != null) {
            this$0.attachObservers(navBackStackEntry2, fragment);
            this$0.attachClearViewModel$navigation_fragment_release(fragment, navBackStackEntry2, state);
        }
    }

    public final void attachClearViewModel$navigation_fragment_release(@l Fragment fragment, @l NavBackStackEntry entry, @l NavigatorState state) {
        l0.p(fragment, "fragment");
        l0.p(entry, "entry");
        l0.p(state, "state");
        ViewModelStore viewModelStore = fragment.getViewModelStore();
        l0.o(viewModelStore, "fragment.viewModelStore");
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(l1.d(ClearEntryStateViewModel.class), FragmentNavigator$attachClearViewModel$viewModel$1$1.INSTANCE);
        ((ClearEntryStateViewModel) new ViewModelProvider(viewModelStore, initializerViewModelFactoryBuilder.build(), CreationExtras.Empty.INSTANCE).get(ClearEntryStateViewModel.class)).setCompleteTransition(new WeakReference<>(new FragmentNavigator$attachClearViewModel$1(entry, state, fragment)));
    }

    @l
    public final t0<List<NavBackStackEntry>> getBackStack$navigation_fragment_release() {
        return getState().getBackStack();
    }

    @l
    public final List<u0<String, Boolean>> getPendingOps$navigation_fragment_release() {
        return this.pendingOps;
    }

    @l
    @k(message = "Set a custom {@link androidx.fragment.app.FragmentFactory} via\n      {@link FragmentManager#setFragmentFactory(FragmentFactory)} to control\n      instantiation of Fragments.")
    public Fragment instantiateFragment(@l Context context, @l FragmentManager fragmentManager, @l String className, @m Bundle bundle) {
        l0.p(context, "context");
        l0.p(fragmentManager, "fragmentManager");
        l0.p(className, "className");
        Fragment instantiate = fragmentManager.getFragmentFactory().instantiate(context.getClassLoader(), className);
        l0.o(instantiate, "fragmentManager.fragment…t.classLoader, className)");
        return instantiate;
    }

    @Override // androidx.navigation.Navigator
    public void navigate(@l List<NavBackStackEntry> entries, @m NavOptions navOptions, @m Navigator.Extras extras) {
        l0.p(entries, "entries");
        if (this.fragmentManager.isStateSaved()) {
            Log.i(TAG, "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator<NavBackStackEntry> it = entries.iterator();
        while (it.hasNext()) {
            navigate(it.next(), navOptions, extras);
        }
    }

    @Override // androidx.navigation.Navigator
    public void onAttach(@l final NavigatorState state) {
        l0.p(state, "state");
        super.onAttach(state);
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(TAG, "onAttach");
        }
        this.fragmentManager.addFragmentOnAttachListener(new FragmentOnAttachListener() { // from class: androidx.navigation.fragment.c
            @Override // androidx.fragment.app.FragmentOnAttachListener
            public final void onAttachFragment(FragmentManager fragmentManager, Fragment fragment) {
                FragmentNavigator.onAttach$lambda$3(NavigatorState.this, this, fragmentManager, fragment);
            }
        });
        this.fragmentManager.addOnBackStackChangedListener(new FragmentManager.OnBackStackChangedListener() { // from class: androidx.navigation.fragment.FragmentNavigator$onAttach$2
            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            public void onBackStackChangeCommitted(@l Fragment fragment, boolean z4) {
                List A4;
                Object obj;
                Object obj2;
                boolean z5;
                l0.p(fragment, "fragment");
                A4 = e0.A4(NavigatorState.this.getBackStack().getValue(), NavigatorState.this.getTransitionsInProgress().getValue());
                ListIterator listIterator = A4.listIterator(A4.size());
                while (true) {
                    obj = null;
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (l0.g(((NavBackStackEntry) obj2).getId(), fragment.getTag())) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj2;
                boolean z6 = true;
                if (z4 && this.getPendingOps$navigation_fragment_release().isEmpty() && fragment.isRemoving()) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                Iterator<T> it = this.getPendingOps$navigation_fragment_release().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (l0.g(((u0) next).getFirst(), fragment.getTag())) {
                        obj = next;
                        break;
                    }
                }
                u0 u0Var = (u0) obj;
                if (u0Var != null) {
                    this.getPendingOps$navigation_fragment_release().remove(u0Var);
                }
                if (!z5 && FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment + " associated with entry " + navBackStackEntry);
                }
                if (u0Var == null || !((Boolean) u0Var.getSecond()).booleanValue()) {
                    z6 = false;
                }
                if (!z4 && !z6 && navBackStackEntry == null) {
                    throw new IllegalArgumentException(("The fragment " + fragment + " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager.").toString());
                }
                if (navBackStackEntry != null) {
                    this.attachClearViewModel$navigation_fragment_release(fragment, navBackStackEntry, NavigatorState.this);
                    if (z5) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment + " popping associated entry " + navBackStackEntry + " via system back");
                        }
                        NavigatorState.this.popWithTransition(navBackStackEntry, false);
                    }
                }
            }

            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            public void onBackStackChangeStarted(@l Fragment fragment, boolean z4) {
                NavBackStackEntry navBackStackEntry;
                l0.p(fragment, "fragment");
                if (z4) {
                    List<NavBackStackEntry> value = NavigatorState.this.getBackStack().getValue();
                    ListIterator<NavBackStackEntry> listIterator = value.listIterator(value.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            navBackStackEntry = listIterator.previous();
                            if (l0.g(navBackStackEntry.getId(), fragment.getTag())) {
                                break;
                            }
                        } else {
                            navBackStackEntry = null;
                            break;
                        }
                    }
                    NavBackStackEntry navBackStackEntry2 = navBackStackEntry;
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentNavigator", "OnBackStackChangedStarted for fragment " + fragment + " associated with entry " + navBackStackEntry2);
                    }
                    if (navBackStackEntry2 != null) {
                        NavigatorState.this.prepareForTransition(navBackStackEntry2);
                    }
                }
            }

            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            public void onBackStackChanged() {
            }
        });
    }

    @Override // androidx.navigation.Navigator
    public void onLaunchSingleTop(@l NavBackStackEntry backStackEntry) {
        int G;
        Object T2;
        l0.p(backStackEntry, "backStackEntry");
        if (this.fragmentManager.isStateSaved()) {
            Log.i(TAG, "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        FragmentTransaction createFragmentTransaction = createFragmentTransaction(backStackEntry, null);
        List<NavBackStackEntry> value = getState().getBackStack().getValue();
        if (value.size() > 1) {
            G = kotlin.collections.w.G(value);
            T2 = e0.T2(value, G - 1);
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) T2;
            if (navBackStackEntry != null) {
                addPendingOps$default(this, navBackStackEntry.getId(), false, false, 6, null);
            }
            addPendingOps$default(this, backStackEntry.getId(), true, false, 4, null);
            this.fragmentManager.popBackStack(backStackEntry.getId(), 1);
            addPendingOps$default(this, backStackEntry.getId(), false, false, 2, null);
            createFragmentTransaction.addToBackStack(backStackEntry.getId());
        }
        createFragmentTransaction.commit();
        getState().onLaunchSingleTop(backStackEntry);
    }

    @Override // androidx.navigation.Navigator
    public void onRestoreState(@l Bundle savedState) {
        l0.p(savedState, "savedState");
        ArrayList<String> stringArrayList = savedState.getStringArrayList(KEY_SAVED_IDS);
        if (stringArrayList != null) {
            this.savedIds.clear();
            b0.n0(this.savedIds, stringArrayList);
        }
    }

    @Override // androidx.navigation.Navigator
    @m
    public Bundle onSaveState() {
        if (this.savedIds.isEmpty()) {
            return null;
        }
        return BundleKt.bundleOf(q1.a(KEY_SAVED_IDS, new ArrayList(this.savedIds)));
    }

    @Override // androidx.navigation.Navigator
    public void popBackStack(@l NavBackStackEntry popUpTo, boolean z4) {
        Object y22;
        Object T2;
        kotlin.sequences.m x12;
        kotlin.sequences.m k12;
        boolean f02;
        boolean z5;
        List<NavBackStackEntry> U4;
        l0.p(popUpTo, "popUpTo");
        if (this.fragmentManager.isStateSaved()) {
            Log.i(TAG, "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List<NavBackStackEntry> value = getState().getBackStack().getValue();
        int indexOf = value.indexOf(popUpTo);
        List<NavBackStackEntry> subList = value.subList(indexOf, value.size());
        y22 = e0.y2(value);
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) y22;
        if (z4) {
            U4 = e0.U4(subList);
            for (NavBackStackEntry navBackStackEntry2 : U4) {
                if (l0.g(navBackStackEntry2, navBackStackEntry)) {
                    Log.i(TAG, "FragmentManager cannot save the state of the initial destination " + navBackStackEntry2);
                } else {
                    this.fragmentManager.saveBackStack(navBackStackEntry2.getId());
                    this.savedIds.add(navBackStackEntry2.getId());
                }
            }
        } else {
            this.fragmentManager.popBackStack(popUpTo.getId(), 1);
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(TAG, "Calling popWithTransition via popBackStack() on entry " + popUpTo + " with savedState " + z4);
        }
        T2 = e0.T2(value, indexOf - 1);
        NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) T2;
        if (navBackStackEntry3 != null) {
            addPendingOps$default(this, navBackStackEntry3.getId(), false, false, 6, null);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : subList) {
            NavBackStackEntry navBackStackEntry4 = (NavBackStackEntry) obj;
            x12 = e0.x1(this.pendingOps);
            k12 = u.k1(x12, FragmentNavigator$popBackStack$1$1.INSTANCE);
            f02 = u.f0(k12, navBackStackEntry4.getId());
            if (!f02 && l0.g(navBackStackEntry4.getId(), navBackStackEntry.getId())) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (z5) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            addPendingOps$default(this, ((NavBackStackEntry) it.next()).getId(), true, false, 4, null);
        }
        getState().popWithTransition(popUpTo, z4);
    }

    @Override // androidx.navigation.Navigator
    @l
    public Destination createDestination() {
        return new Destination(this);
    }

    private final void navigate(NavBackStackEntry navBackStackEntry, NavOptions navOptions, Navigator.Extras extras) {
        Object s32;
        boolean isEmpty = getState().getBackStack().getValue().isEmpty();
        if (navOptions != null && !isEmpty && navOptions.shouldRestoreState() && this.savedIds.remove(navBackStackEntry.getId())) {
            this.fragmentManager.restoreBackStack(navBackStackEntry.getId());
            getState().pushWithTransition(navBackStackEntry);
            return;
        }
        FragmentTransaction createFragmentTransaction = createFragmentTransaction(navBackStackEntry, navOptions);
        if (!isEmpty) {
            s32 = e0.s3(getState().getBackStack().getValue());
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) s32;
            if (navBackStackEntry2 != null) {
                addPendingOps$default(this, navBackStackEntry2.getId(), false, false, 6, null);
            }
            addPendingOps$default(this, navBackStackEntry.getId(), false, false, 6, null);
            createFragmentTransaction.addToBackStack(navBackStackEntry.getId());
        }
        if (extras instanceof Extras) {
            for (Map.Entry<View, String> entry : ((Extras) extras).getSharedElements().entrySet()) {
                createFragmentTransaction.addSharedElement(entry.getKey(), entry.getValue());
            }
        }
        createFragmentTransaction.commit();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(TAG, "Calling pushWithTransition via navigate() on entry " + navBackStackEntry);
        }
        getState().pushWithTransition(navBackStackEntry);
    }
}
