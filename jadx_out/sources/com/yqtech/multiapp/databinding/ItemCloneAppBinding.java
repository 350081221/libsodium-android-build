package com.yqtech.multiapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.yqtech.multiapp.R;
import com.yuanqi.group.widgets.LabelView;
import com.yuanqi.group.widgets.MarqueeTextView;

/* loaded from: classes3.dex */
public final class ItemCloneAppBinding implements ViewBinding {

    @NonNull
    public final ImageView itemAppChecked;

    @NonNull
    public final LabelView itemAppCloneCount;

    @NonNull
    public final ImageView itemAppIcon;

    @NonNull
    public final MarqueeTextView itemAppName;

    @NonNull
    private final FrameLayout rootView;

    private ItemCloneAppBinding(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull LabelView labelView, @NonNull ImageView imageView2, @NonNull MarqueeTextView marqueeTextView) {
        this.rootView = frameLayout;
        this.itemAppChecked = imageView;
        this.itemAppCloneCount = labelView;
        this.itemAppIcon = imageView2;
        this.itemAppName = marqueeTextView;
    }

    @NonNull
    public static ItemCloneAppBinding bind(@NonNull View view) {
        int i5 = R.id.item_app_checked;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.item_app_checked);
        if (imageView != null) {
            i5 = R.id.item_app_clone_count;
            LabelView labelView = (LabelView) ViewBindings.findChildViewById(view, R.id.item_app_clone_count);
            if (labelView != null) {
                i5 = R.id.item_app_icon;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.item_app_icon);
                if (imageView2 != null) {
                    i5 = R.id.item_app_name;
                    MarqueeTextView marqueeTextView = (MarqueeTextView) ViewBindings.findChildViewById(view, R.id.item_app_name);
                    if (marqueeTextView != null) {
                        return new ItemCloneAppBinding((FrameLayout) view, imageView, labelView, imageView2, marqueeTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i5)));
    }

    @NonNull
    public static ItemCloneAppBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemCloneAppBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_clone_app, viewGroup, false);
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
