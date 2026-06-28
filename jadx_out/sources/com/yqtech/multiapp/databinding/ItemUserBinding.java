package com.yqtech.multiapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.yqtech.multiapp.R;

/* loaded from: classes3.dex */
public final class ItemUserBinding implements ViewBinding {

    @NonNull
    public final ImageView ivIcon;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvTitle;

    private ItemUserBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.ivIcon = imageView;
        this.tvTitle = textView;
    }

    @NonNull
    public static ItemUserBinding bind(@NonNull View view) {
        int i5 = R.id.iv_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_icon);
        if (imageView != null) {
            i5 = R.id.tv_title;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
            if (textView != null) {
                return new ItemUserBinding((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i5)));
    }

    @NonNull
    public static ItemUserBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemUserBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_user, viewGroup, false);
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
