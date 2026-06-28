package com.yqtech.multiapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.yqtech.multiapp.R;

/* loaded from: classes3.dex */
public final class DialogClearCacheBinding implements ViewBinding {

    @NonNull
    public final LottieAnimationView animationView;

    @NonNull
    public final TextView clearSuccess;

    @NonNull
    private final LinearLayout rootView;

    private DialogClearCacheBinding(@NonNull LinearLayout linearLayout, @NonNull LottieAnimationView lottieAnimationView, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.animationView = lottieAnimationView;
        this.clearSuccess = textView;
    }

    @NonNull
    public static DialogClearCacheBinding bind(@NonNull View view) {
        int i5 = R.id.animation_view;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, R.id.animation_view);
        if (lottieAnimationView != null) {
            i5 = R.id.clear_success;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.clear_success);
            if (textView != null) {
                return new DialogClearCacheBinding((LinearLayout) view, lottieAnimationView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i5)));
    }

    @NonNull
    public static DialogClearCacheBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogClearCacheBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_clear_cache, viewGroup, false);
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
