package com.yqtech.multiapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.yqtech.multiapp.R;

/* loaded from: classes3.dex */
public final class ActivityCloneAppBinding implements ViewBinding {

    @NonNull
    public final TabLayout cloneAppTabLayout;

    @NonNull
    public final Toolbar cloneAppToolBar;

    @NonNull
    public final ViewPager cloneAppViewPager;

    @NonNull
    private final LinearLayout rootView;

    private ActivityCloneAppBinding(@NonNull LinearLayout linearLayout, @NonNull TabLayout tabLayout, @NonNull Toolbar toolbar, @NonNull ViewPager viewPager) {
        this.rootView = linearLayout;
        this.cloneAppTabLayout = tabLayout;
        this.cloneAppToolBar = toolbar;
        this.cloneAppViewPager = viewPager;
    }

    @NonNull
    public static ActivityCloneAppBinding bind(@NonNull View view) {
        int i5 = R.id.clone_app_tab_layout;
        TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, R.id.clone_app_tab_layout);
        if (tabLayout != null) {
            i5 = R.id.clone_app_tool_bar;
            Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.clone_app_tool_bar);
            if (toolbar != null) {
                i5 = R.id.clone_app_view_pager;
                ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.clone_app_view_pager);
                if (viewPager != null) {
                    return new ActivityCloneAppBinding((LinearLayout) view, tabLayout, toolbar, viewPager);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i5)));
    }

    @NonNull
    public static ActivityCloneAppBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityCloneAppBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_clone_app, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
