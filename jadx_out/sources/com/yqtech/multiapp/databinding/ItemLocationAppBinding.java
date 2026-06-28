package com.yqtech.multiapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.yqtech.multiapp.R;

/* loaded from: classes3.dex */
public final class ItemLocationAppBinding implements ViewBinding {

    @NonNull
    public final ImageView itemAppIcon;

    @NonNull
    public final TextView itemAppName;

    @NonNull
    public final TextView itemLocation;

    @NonNull
    private final RelativeLayout rootView;

    private ItemLocationAppBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = relativeLayout;
        this.itemAppIcon = imageView;
        this.itemAppName = textView;
        this.itemLocation = textView2;
    }

    @NonNull
    public static ItemLocationAppBinding bind(@NonNull View view) {
        int i5 = R.id.item_app_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.item_app_icon);
        if (imageView != null) {
            i5 = R.id.item_app_name;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.item_app_name);
            if (textView != null) {
                i5 = R.id.item_location;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.item_location);
                if (textView2 != null) {
                    return new ItemLocationAppBinding((RelativeLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i5)));
    }

    @NonNull
    public static ItemLocationAppBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemLocationAppBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_location_app, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
