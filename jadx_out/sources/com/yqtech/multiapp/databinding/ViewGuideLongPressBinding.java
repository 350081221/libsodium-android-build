package com.yqtech.multiapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.yqtech.multiapp.R;

/* loaded from: classes3.dex */
public final class ViewGuideLongPressBinding implements ViewBinding {

    @NonNull
    public final ImageView iv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView textView;

    private ViewGuideLongPressBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.iv = imageView;
        this.textView = textView;
    }

    @NonNull
    public static ViewGuideLongPressBinding bind(@NonNull View view) {
        int i5 = R.id.iv;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv);
        if (imageView != null) {
            i5 = R.id.textView;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textView);
            if (textView != null) {
                return new ViewGuideLongPressBinding((ConstraintLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i5)));
    }

    @NonNull
    public static ViewGuideLongPressBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewGuideLongPressBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.view_guide_long_press, viewGroup, false);
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
