package androidx.navigation.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.CallSuper;
import androidx.annotation.NavigationRes;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.NavHost;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigation;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorProvider;
import androidx.navigation.fragment.FragmentNavigator;
import kotlin.d0;
import kotlin.f0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.r2;
import p4.l;
import p4.m;
import u3.i;

@i0(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0016\u0018\u0000 42\u00020\u00012\u00020\u0002:\u00014B\u0007¢\u0006\u0004\b2\u00103J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0017J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0017J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0015J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0015J\u0010\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010H\u0015J&\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00172\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\"\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0017J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0007H\u0017J\b\u0010 \u001a\u00020\u0005H\u0016R\u001b\u0010\u000b\u001a\u00020\n8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0018\u0010%\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00065"}, d2 = {"Landroidx/navigation/fragment/NavHostFragment;", "Landroidx/fragment/app/Fragment;", "Landroidx/navigation/NavHost;", "Landroid/content/Context;", com.umeng.analytics.pro.d.X, "Lkotlin/r2;", "onAttach", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroidx/navigation/NavHostController;", "navHostController", "onCreateNavHostController", "Landroidx/navigation/NavController;", "navController", "onCreateNavController", "Landroidx/navigation/Navigator;", "Landroidx/navigation/fragment/FragmentNavigator$Destination;", "createFragmentNavigator", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "Landroid/util/AttributeSet;", "attrs", "onInflate", "outState", "onSaveInstanceState", "onDestroyView", "navHostController$delegate", "Lkotlin/d0;", "getNavHostController$navigation_fragment_release", "()Landroidx/navigation/NavHostController;", "viewParent", "Landroid/view/View;", "", "graphId", "I", "", "defaultNavHost", "Z", "getContainerId", "()I", "containerId", "getNavController", "()Landroidx/navigation/NavController;", "<init>", "()V", "Companion", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nNavHostFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHostFragment.kt\nandroidx/navigation/fragment/NavHostFragment\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,407:1\n181#2,2:408\n1#3:410\n232#4,3:411\n232#4,3:414\n*S KotlinDebug\n*F\n+ 1 NavHostFragment.kt\nandroidx/navigation/fragment/NavHostFragment\n*L\n210#1:408,2\n283#1:411,3\n291#1:414,3\n*E\n"})
/* loaded from: classes2.dex */
public class NavHostFragment extends Fragment implements NavHost {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final String KEY_DEFAULT_NAV_HOST = "android-support-nav:fragment:defaultHost";

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String KEY_GRAPH_ID = "android-support-nav:fragment:graphId";

    @l
    private static final String KEY_NAV_CONTROLLER_STATE = "android-support-nav:fragment:navControllerState";

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String KEY_START_DESTINATION_ARGS = "android-support-nav:fragment:startDestinationArgs";
    private boolean defaultNavHost;
    private int graphId;

    @l
    private final d0 navHostController$delegate;

    @m
    private View viewParent;

    @i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/navigation/fragment/NavHostFragment$Companion;", "", "()V", "KEY_DEFAULT_NAV_HOST", "", "KEY_GRAPH_ID", "KEY_NAV_CONTROLLER_STATE", "KEY_START_DESTINATION_ARGS", "create", "Landroidx/navigation/fragment/NavHostFragment;", "graphResId", "", "startDestinationArgs", "Landroid/os/Bundle;", "findNavController", "Landroidx/navigation/NavController;", "fragment", "Landroidx/fragment/app/Fragment;", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        public static /* synthetic */ NavHostFragment create$default(Companion companion, int i5, Bundle bundle, int i6, Object obj) {
            if ((i6 & 2) != 0) {
                bundle = null;
            }
            return companion.create(i5, bundle);
        }

        @l
        @i
        @u3.m
        public final NavHostFragment create(@NavigationRes int i5) {
            return create$default(this, i5, null, 2, null);
        }

        @l
        @i
        @u3.m
        public final NavHostFragment create(@NavigationRes int i5, @m Bundle bundle) {
            Bundle bundle2;
            if (i5 != 0) {
                bundle2 = new Bundle();
                bundle2.putInt(NavHostFragment.KEY_GRAPH_ID, i5);
            } else {
                bundle2 = null;
            }
            if (bundle != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                bundle2.putBundle(NavHostFragment.KEY_START_DESTINATION_ARGS, bundle);
            }
            NavHostFragment navHostFragment = new NavHostFragment();
            if (bundle2 != null) {
                navHostFragment.setArguments(bundle2);
            }
            return navHostFragment;
        }

        @l
        @u3.m
        public final NavController findNavController(@l Fragment fragment) {
            DialogFragment dialogFragment;
            Dialog dialog;
            Window window;
            l0.p(fragment, "fragment");
            for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getParentFragment()) {
                if (fragment2 instanceof NavHostFragment) {
                    return ((NavHostFragment) fragment2).getNavHostController$navigation_fragment_release();
                }
                Fragment primaryNavigationFragment = fragment2.getParentFragmentManager().getPrimaryNavigationFragment();
                if (primaryNavigationFragment instanceof NavHostFragment) {
                    return ((NavHostFragment) primaryNavigationFragment).getNavHostController$navigation_fragment_release();
                }
            }
            View view = fragment.getView();
            if (view != null) {
                return Navigation.findNavController(view);
            }
            View view2 = null;
            if (fragment instanceof DialogFragment) {
                dialogFragment = (DialogFragment) fragment;
            } else {
                dialogFragment = null;
            }
            if (dialogFragment != null && (dialog = dialogFragment.getDialog()) != null && (window = dialog.getWindow()) != null) {
                view2 = window.getDecorView();
            }
            if (view2 != null) {
                return Navigation.findNavController(view2);
            }
            throw new IllegalStateException("Fragment " + fragment + " does not have a NavController set");
        }
    }

    public NavHostFragment() {
        d0 c5;
        c5 = f0.c(new NavHostFragment$navHostController$2(this));
        this.navHostController$delegate = c5;
    }

    @l
    @i
    @u3.m
    public static final NavHostFragment create(@NavigationRes int i5) {
        return Companion.create(i5);
    }

    @l
    @i
    @u3.m
    public static final NavHostFragment create(@NavigationRes int i5, @m Bundle bundle) {
        return Companion.create(i5, bundle);
    }

    @l
    @u3.m
    public static final NavController findNavController(@l Fragment fragment) {
        return Companion.findNavController(fragment);
    }

    private final int getContainerId() {
        int id = getId();
        if (id == 0 || id == -1) {
            return R.id.nav_host_fragment_container;
        }
        return id;
    }

    @l
    @k(message = "Use {@link #onCreateNavController(NavController)}")
    protected Navigator<? extends FragmentNavigator.Destination> createFragmentNavigator() {
        Context requireContext = requireContext();
        l0.o(requireContext, "requireContext()");
        FragmentManager childFragmentManager = getChildFragmentManager();
        l0.o(childFragmentManager, "childFragmentManager");
        return new FragmentNavigator(requireContext, childFragmentManager, getContainerId());
    }

    @Override // androidx.navigation.NavHost
    @l
    public final NavController getNavController() {
        return getNavHostController$navigation_fragment_release();
    }

    @l
    public final NavHostController getNavHostController$navigation_fragment_release() {
        return (NavHostController) this.navHostController$delegate.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public void onAttach(@l Context context) {
        l0.p(context, "context");
        super.onAttach(context);
        if (this.defaultNavHost) {
            getParentFragmentManager().beginTransaction().setPrimaryNavigationFragment(this).commit();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public void onCreate(@m Bundle bundle) {
        getNavHostController$navigation_fragment_release();
        if (bundle != null && bundle.getBoolean(KEY_DEFAULT_NAV_HOST, false)) {
            this.defaultNavHost = true;
            getParentFragmentManager().beginTransaction().setPrimaryNavigationFragment(this).commit();
        }
        super.onCreate(bundle);
    }

    @k(message = "Override {@link #onCreateNavHostController(NavHostController)} to gain\n      access to the full {@link NavHostController} that is created by this NavHostFragment.")
    @CallSuper
    protected void onCreateNavController(@l NavController navController) {
        l0.p(navController, "navController");
        NavigatorProvider navigatorProvider = navController.getNavigatorProvider();
        Context requireContext = requireContext();
        l0.o(requireContext, "requireContext()");
        FragmentManager childFragmentManager = getChildFragmentManager();
        l0.o(childFragmentManager, "childFragmentManager");
        navigatorProvider.addNavigator(new DialogFragmentNavigator(requireContext, childFragmentManager));
        navController.getNavigatorProvider().addNavigator(createFragmentNavigator());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @CallSuper
    public void onCreateNavHostController(@l NavHostController navHostController) {
        l0.p(navHostController, "navHostController");
        onCreateNavController(navHostController);
    }

    @Override // androidx.fragment.app.Fragment
    @m
    public View onCreateView(@l LayoutInflater inflater, @m ViewGroup viewGroup, @m Bundle bundle) {
        l0.p(inflater, "inflater");
        Context context = inflater.getContext();
        l0.o(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(getContainerId());
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        View view = this.viewParent;
        if (view != null && Navigation.findNavController(view) == getNavHostController$navigation_fragment_release()) {
            Navigation.setViewNavController(view, null);
        }
        this.viewParent = null;
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public void onInflate(@l Context context, @l AttributeSet attrs, @m Bundle bundle) {
        l0.p(context, "context");
        l0.p(attrs, "attrs");
        super.onInflate(context, attrs, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, androidx.navigation.R.styleable.NavHost);
        l0.o(obtainStyledAttributes, "context.obtainStyledAttr…yleable.NavHost\n        )");
        int resourceId = obtainStyledAttributes.getResourceId(androidx.navigation.R.styleable.NavHost_navGraph, 0);
        if (resourceId != 0) {
            this.graphId = resourceId;
        }
        r2 r2Var = r2.f19517a;
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attrs, R.styleable.NavHostFragment);
        l0.o(obtainStyledAttributes2, "context.obtainStyledAttr…tyleable.NavHostFragment)");
        if (obtainStyledAttributes2.getBoolean(R.styleable.NavHostFragment_defaultNavHost, false)) {
            this.defaultNavHost = true;
        }
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public void onSaveInstanceState(@l Bundle outState) {
        l0.p(outState, "outState");
        super.onSaveInstanceState(outState);
        if (this.defaultNavHost) {
            outState.putBoolean(KEY_DEFAULT_NAV_HOST, true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@l View view, @m Bundle bundle) {
        l0.p(view, "view");
        super.onViewCreated(view, bundle);
        if (view instanceof ViewGroup) {
            Navigation.setViewNavController(view, getNavHostController$navigation_fragment_release());
            if (view.getParent() != null) {
                Object parent = view.getParent();
                l0.n(parent, "null cannot be cast to non-null type android.view.View");
                View view2 = (View) parent;
                this.viewParent = view2;
                l0.m(view2);
                if (view2.getId() == getId()) {
                    View view3 = this.viewParent;
                    l0.m(view3);
                    Navigation.setViewNavController(view3, getNavHostController$navigation_fragment_release());
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
    }
}
