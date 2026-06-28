package com.yqtech.multiapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.yqtech.multiapp.R;
import com.yuanqi.group.widgets.EatBeansView;

/* loaded from: classes3.dex */
public final class ActivityLoadingBinding implements ViewBinding {

    @NonNull
    public final ImageView appIcon;

    @NonNull
    public final TextView appName;

    @NonNull
    public final EatBeansView loadingAnim;

    @NonNull
    private final FrameLayout rootView;

    private ActivityLoadingBinding(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull EatBeansView eatBeansView) {
        this.rootView = frameLayout;
        this.appIcon = imageView;
        this.appName = textView;
        this.loadingAnim = eatBeansView;
    }

    @NonNull
    public static ActivityLoadingBinding bind(@NonNull View view) {
        int i5 = R.id.app_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.app_icon);
        if (imageView != null) {
            i5 = R.id.app_name;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.app_name);
            if (textView != null) {
                i5 = R.id.loading_anim;
                EatBeansView eatBeansView = (EatBeansView) ViewBindings.findChildViewById(view, R.id.loading_anim);
                if (eatBeansView != null) {
                    return new ActivityLoadingBinding((FrameLayout) view, imageView, textView, eatBeansView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i5)));
    }

    @NonNull
    public static ActivityLoadingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityLoadingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_loading, viewGroup, false);
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
