package com.yqtech.multiapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.MaterialToolbar;
import com.yqtech.multiapp.R;

/* loaded from: classes3.dex */
public final class ActivityTextBinding implements ViewBinding {

    @NonNull
    public final ConstraintLayout main;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final MaterialToolbar toolbar;

    @NonNull
    public final TextView tvContent;

    private ActivityTextBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull MaterialToolbar materialToolbar, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.main = constraintLayout2;
        this.toolbar = materialToolbar;
        this.tvContent = textView;
    }

    @NonNull
    public static ActivityTextBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i5 = R.id.toolbar;
        MaterialToolbar materialToolbar = (MaterialToolbar) ViewBindings.findChildViewById(view, R.id.toolbar);
        if (materialToolbar != null) {
            i5 = R.id.tv_content;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_content);
            if (textView != null) {
                return new ActivityTextBinding(constraintLayout, constraintLayout, materialToolbar, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i5)));
    }

    @NonNull
    public static ActivityTextBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityTextBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_text, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
