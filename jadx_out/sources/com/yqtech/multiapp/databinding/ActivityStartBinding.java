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
import com.airbnb.lottie.LottieAnimationView;
import com.yqtech.multiapp.R;

/* loaded from: classes3.dex */
public final class ActivityStartBinding implements ViewBinding {

    @NonNull
    public final LottieAnimationView animationView;

    @NonNull
    public final LottieAnimationView animationView2;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView textView2;

    private ActivityStartBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LottieAnimationView lottieAnimationView, @NonNull LottieAnimationView lottieAnimationView2, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.animationView = lottieAnimationView;
        this.animationView2 = lottieAnimationView2;
        this.textView2 = textView;
    }

    @NonNull
    public static ActivityStartBinding bind(@NonNull View view) {
        int i5 = R.id.animation_view;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, R.id.animation_view);
        if (lottieAnimationView != null) {
            i5 = R.id.animation_view2;
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) ViewBindings.findChildViewById(view, R.id.animation_view2);
            if (lottieAnimationView2 != null) {
                i5 = R.id.textView2;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textView2);
                if (textView != null) {
                    return new ActivityStartBinding((ConstraintLayout) view, lottieAnimationView, lottieAnimationView2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i5)));
    }

    @NonNull
    public static ActivityStartBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityStartBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_start, viewGroup, false);
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
