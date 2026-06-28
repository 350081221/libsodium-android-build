package com.yqtech.multiapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.yqtech.multiapp.R;
import com.yuanqi.group.widgets.DragSelectRecyclerView;

/* loaded from: classes3.dex */
public final class FragmentListAppBinding implements ViewBinding {

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final Button selectAppInstallBtn;

    @NonNull
    public final ProgressBar selectAppProgressBar;

    @NonNull
    public final DragSelectRecyclerView selectAppRecyclerView;

    private FragmentListAppBinding(@NonNull FrameLayout frameLayout, @NonNull Button button, @NonNull ProgressBar progressBar, @NonNull DragSelectRecyclerView dragSelectRecyclerView) {
        this.rootView = frameLayout;
        this.selectAppInstallBtn = button;
        this.selectAppProgressBar = progressBar;
        this.selectAppRecyclerView = dragSelectRecyclerView;
    }

    @NonNull
    public static FragmentListAppBinding bind(@NonNull View view) {
        int i5 = R.id.select_app_install_btn;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.select_app_install_btn);
        if (button != null) {
            i5 = R.id.select_app_progress_bar;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.select_app_progress_bar);
            if (progressBar != null) {
                i5 = R.id.select_app_recycler_view;
                DragSelectRecyclerView dragSelectRecyclerView = (DragSelectRecyclerView) ViewBindings.findChildViewById(view, R.id.select_app_recycler_view);
                if (dragSelectRecyclerView != null) {
                    return new FragmentListAppBinding((FrameLayout) view, button, progressBar, dragSelectRecyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i5)));
    }

    @NonNull
    public static FragmentListAppBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentListAppBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_list_app, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
