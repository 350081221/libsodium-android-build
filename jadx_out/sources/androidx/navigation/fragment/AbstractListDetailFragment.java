package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.CallSuper;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.fragment.NavHostFragment;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b(\u0010)J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017J$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J$\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u001a\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u001a\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0016\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0006H\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0011\u0010$\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010'\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006+"}, d2 = {"Landroidx/navigation/fragment/AbstractListDetailFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/content/Context;", com.umeng.analytics.pro.d.X, "Landroid/util/AttributeSet;", "attrs", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/r2;", "onInflate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "onCreateListPaneView", "Landroidx/navigation/fragment/NavHostFragment;", "onCreateDetailPaneNavHostFragment", "view", "onViewCreated", "onListPaneViewCreated", "onViewStateRestored", "outState", "onSaveInstanceState", "Landroidx/activity/OnBackPressedCallback;", "onBackPressedCallback", "Landroidx/activity/OnBackPressedCallback;", "_detailPaneNavHostFragment", "Landroidx/navigation/fragment/NavHostFragment;", "", "graphId", "I", "Landroidx/slidingpanelayout/widget/SlidingPaneLayout;", "getSlidingPaneLayout", "()Landroidx/slidingpanelayout/widget/SlidingPaneLayout;", "slidingPaneLayout", "getDetailPaneNavHostFragment", "()Landroidx/navigation/fragment/NavHostFragment;", "detailPaneNavHostFragment", "<init>", "()V", "InnerOnBackPressedCallback", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nAbstractListDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractListDetailFragment.kt\nandroidx/navigation/fragment/AbstractListDetailFragment\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 FragmentManager.kt\nandroidx/fragment/app/FragmentManagerKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,257:1\n232#2,3:258\n28#3,12:261\n65#4,4:273\n37#4:277\n53#4:278\n71#4,2:279\n*S KotlinDebug\n*F\n+ 1 AbstractListDetailFragment.kt\nandroidx/navigation/fragment/AbstractListDetailFragment\n*L\n110#1:258,3\n172#1:261,12\n179#1:273,4\n179#1:277\n179#1:278\n179#1:279,2\n*E\n"})
/* loaded from: classes2.dex */
public abstract class AbstractListDetailFragment extends Fragment {

    @m
    private NavHostFragment _detailPaneNavHostFragment;
    private int graphId;

    @m
    private OnBackPressedCallback onBackPressedCallback;

    @i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/navigation/fragment/AbstractListDetailFragment$InnerOnBackPressedCallback;", "Landroidx/activity/OnBackPressedCallback;", "Landroidx/slidingpanelayout/widget/SlidingPaneLayout$PanelSlideListener;", "Lkotlin/r2;", "handleOnBackPressed", "Landroid/view/View;", "panel", "", "slideOffset", "onPanelSlide", "onPanelOpened", "onPanelClosed", "Landroidx/slidingpanelayout/widget/SlidingPaneLayout;", "slidingPaneLayout", "Landroidx/slidingpanelayout/widget/SlidingPaneLayout;", "<init>", "(Landroidx/slidingpanelayout/widget/SlidingPaneLayout;)V", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    private static final class InnerOnBackPressedCallback extends OnBackPressedCallback implements SlidingPaneLayout.PanelSlideListener {

        @l
        private final SlidingPaneLayout slidingPaneLayout;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InnerOnBackPressedCallback(@l SlidingPaneLayout slidingPaneLayout) {
            super(true);
            l0.p(slidingPaneLayout, "slidingPaneLayout");
            this.slidingPaneLayout = slidingPaneLayout;
            slidingPaneLayout.addPanelSlideListener(this);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            this.slidingPaneLayout.closePane();
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelClosed(@l View panel) {
            l0.p(panel, "panel");
            setEnabled(false);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelOpened(@l View panel) {
            l0.p(panel, "panel");
            setEnabled(true);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelSlide(@l View panel, float f5) {
            l0.p(panel, "panel");
        }
    }

    @l
    public final NavHostFragment getDetailPaneNavHostFragment() {
        NavHostFragment navHostFragment = this._detailPaneNavHostFragment;
        if (navHostFragment != null) {
            l0.n(navHostFragment, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
            return navHostFragment;
        }
        throw new IllegalStateException(("Fragment " + this + " was called before onCreateView().").toString());
    }

    @l
    public final SlidingPaneLayout getSlidingPaneLayout() {
        View requireView = requireView();
        l0.n(requireView, "null cannot be cast to non-null type androidx.slidingpanelayout.widget.SlidingPaneLayout");
        return (SlidingPaneLayout) requireView;
    }

    @l
    public NavHostFragment onCreateDetailPaneNavHostFragment() {
        int i5 = this.graphId;
        if (i5 != 0) {
            return NavHostFragment.Companion.create$default(NavHostFragment.Companion, i5, null, 2, null);
        }
        return new NavHostFragment();
    }

    @l
    public abstract View onCreateListPaneView(@l LayoutInflater layoutInflater, @m ViewGroup viewGroup, @m Bundle bundle);

    @Override // androidx.fragment.app.Fragment
    @l
    @CallSuper
    public final View onCreateView(@l LayoutInflater inflater, @m ViewGroup viewGroup, @m Bundle bundle) {
        NavHostFragment onCreateDetailPaneNavHostFragment;
        l0.p(inflater, "inflater");
        if (bundle != null) {
            this.graphId = bundle.getInt(NavHostFragment.KEY_GRAPH_ID);
        }
        final SlidingPaneLayout slidingPaneLayout = new SlidingPaneLayout(inflater.getContext());
        slidingPaneLayout.setId(R.id.sliding_pane_layout);
        View onCreateListPaneView = onCreateListPaneView(inflater, slidingPaneLayout, bundle);
        if (!l0.g(onCreateListPaneView, slidingPaneLayout) && !l0.g(onCreateListPaneView.getParent(), slidingPaneLayout)) {
            slidingPaneLayout.addView(onCreateListPaneView);
        }
        Context context = inflater.getContext();
        l0.o(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        int i5 = R.id.sliding_pane_detail_container;
        fragmentContainerView.setId(i5);
        SlidingPaneLayout.LayoutParams layoutParams = new SlidingPaneLayout.LayoutParams(inflater.getContext().getResources().getDimensionPixelSize(R.dimen.sliding_pane_detail_pane_width), -1);
        layoutParams.weight = 1.0f;
        slidingPaneLayout.addView(fragmentContainerView, layoutParams);
        Fragment findFragmentById = getChildFragmentManager().findFragmentById(i5);
        boolean z4 = true;
        if (findFragmentById != null) {
            onCreateDetailPaneNavHostFragment = (NavHostFragment) findFragmentById;
        } else {
            onCreateDetailPaneNavHostFragment = onCreateDetailPaneNavHostFragment();
            FragmentManager childFragmentManager = getChildFragmentManager();
            l0.o(childFragmentManager, "childFragmentManager");
            FragmentTransaction beginTransaction = childFragmentManager.beginTransaction();
            l0.o(beginTransaction, "beginTransaction()");
            beginTransaction.setReorderingAllowed(true);
            beginTransaction.add(i5, onCreateDetailPaneNavHostFragment);
            beginTransaction.commit();
        }
        this._detailPaneNavHostFragment = onCreateDetailPaneNavHostFragment;
        this.onBackPressedCallback = new InnerOnBackPressedCallback(slidingPaneLayout);
        if (ViewCompat.isLaidOut(slidingPaneLayout) && !slidingPaneLayout.isLayoutRequested()) {
            OnBackPressedCallback onBackPressedCallback = this.onBackPressedCallback;
            l0.m(onBackPressedCallback);
            if (!slidingPaneLayout.isSlideable() || !slidingPaneLayout.isOpen()) {
                z4 = false;
            }
            onBackPressedCallback.setEnabled(z4);
        } else {
            slidingPaneLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.navigation.fragment.AbstractListDetailFragment$onCreateView$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@l View view, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
                    boolean z5;
                    l0.q(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    OnBackPressedCallback onBackPressedCallback2 = AbstractListDetailFragment.this.onBackPressedCallback;
                    l0.m(onBackPressedCallback2);
                    if (slidingPaneLayout.isSlideable() && slidingPaneLayout.isOpen()) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    onBackPressedCallback2.setEnabled(z5);
                }
            });
        }
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        l0.o(viewLifecycleOwner, "viewLifecycleOwner");
        OnBackPressedCallback onBackPressedCallback2 = this.onBackPressedCallback;
        l0.m(onBackPressedCallback2);
        onBackPressedDispatcher.addCallback(viewLifecycleOwner, onBackPressedCallback2);
        return slidingPaneLayout;
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
    }

    public void onListPaneViewCreated(@l View view, @m Bundle bundle) {
        l0.p(view, "view");
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public void onSaveInstanceState(@l Bundle outState) {
        l0.p(outState, "outState");
        super.onSaveInstanceState(outState);
        int i5 = this.graphId;
        if (i5 != 0) {
            outState.putInt(NavHostFragment.KEY_GRAPH_ID, i5);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public final void onViewCreated(@l View view, @m Bundle bundle) {
        l0.p(view, "view");
        super.onViewCreated(view, bundle);
        View listPaneView = getSlidingPaneLayout().getChildAt(0);
        l0.o(listPaneView, "listPaneView");
        onListPaneViewCreated(listPaneView, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public void onViewStateRestored(@m Bundle bundle) {
        boolean z4;
        super.onViewStateRestored(bundle);
        OnBackPressedCallback onBackPressedCallback = this.onBackPressedCallback;
        l0.m(onBackPressedCallback);
        if (getSlidingPaneLayout().isSlideable() && getSlidingPaneLayout().isOpen()) {
            z4 = true;
        } else {
            z4 = false;
        }
        onBackPressedCallback.setEnabled(z4);
    }
}
