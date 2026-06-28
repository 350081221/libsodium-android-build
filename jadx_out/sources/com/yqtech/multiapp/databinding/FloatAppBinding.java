package com.yqtech.multiapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import com.yqtech.multiapp.R;

/* loaded from: classes3.dex */
public final class FloatAppBinding implements ViewBinding {

    @NonNull
    public final ShapeableImageView ivPreview;

    @NonNull
    private final ConstraintLayout rootView;

    private FloatAppBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ShapeableImageView shapeableImageView) {
        this.rootView = constraintLayout;
        this.ivPreview = shapeableImageView;
    }

    @NonNull
    public static FloatAppBinding bind(@NonNull View view) {
        ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, R.id.iv_preview);
        if (shapeableImageView != null) {
            return new FloatAppBinding((ConstraintLayout) view, shapeableImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.iv_preview)));
    }

    @NonNull
    public static FloatAppBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FloatAppBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.float_app, viewGroup, false);
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
