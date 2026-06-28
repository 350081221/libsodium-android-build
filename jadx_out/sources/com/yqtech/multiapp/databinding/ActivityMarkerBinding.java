package com.yqtech.multiapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.yqtech.multiapp.R;
import com.yuanqi.group.widgets.fittext.FitTextView;

/* loaded from: classes3.dex */
public final class ActivityMarkerBinding implements ViewBinding {

    @NonNull
    public final FitTextView address;

    @NonNull
    private final CoordinatorLayout rootView;

    private ActivityMarkerBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FitTextView fitTextView) {
        this.rootView = coordinatorLayout;
        this.address = fitTextView;
    }

    @NonNull
    public static ActivityMarkerBinding bind(@NonNull View view) {
        FitTextView fitTextView = (FitTextView) ViewBindings.findChildViewById(view, R.id.address);
        if (fitTextView != null) {
            return new ActivityMarkerBinding((CoordinatorLayout) view, fitTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.address)));
    }

    @NonNull
    public static ActivityMarkerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityMarkerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_marker, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}
