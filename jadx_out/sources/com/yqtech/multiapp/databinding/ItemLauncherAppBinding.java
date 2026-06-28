package com.yqtech.multiapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.yqtech.multiapp.R;

/* loaded from: classes3.dex */
public final class ItemLauncherAppBinding implements ViewBinding {

    @NonNull
    public final ImageView itemAppIcon;

    @NonNull
    public final TextView itemAppName;

    @NonNull
    public final ImageView itemAppSetting;

    @NonNull
    public final ImageView itemCheckbox;

    @NonNull
    public final ImageView itemLock;

    @NonNull
    public final TextView itemNoteName;

    @NonNull
    public final LinearLayout linear;

    @NonNull
    private final FrameLayout rootView;

    private ItemLauncherAppBinding(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull TextView textView2, @NonNull LinearLayout linearLayout) {
        this.rootView = frameLayout;
        this.itemAppIcon = imageView;
        this.itemAppName = textView;
        this.itemAppSetting = imageView2;
        this.itemCheckbox = imageView3;
        this.itemLock = imageView4;
        this.itemNoteName = textView2;
        this.linear = linearLayout;
    }

    @NonNull
    public static ItemLauncherAppBinding bind(@NonNull View view) {
        int i5 = R.id.item_app_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.item_app_icon);
        if (imageView != null) {
            i5 = R.id.item_app_name;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.item_app_name);
            if (textView != null) {
                i5 = R.id.item_app_setting;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.item_app_setting);
                if (imageView2 != null) {
                    i5 = R.id.item_checkbox;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.item_checkbox);
                    if (imageView3 != null) {
                        i5 = R.id.item_lock;
                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.item_lock);
                        if (imageView4 != null) {
                            i5 = R.id.item_note_name;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.item_note_name);
                            if (textView2 != null) {
                                i5 = R.id.linear;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linear);
                                if (linearLayout != null) {
                                    return new ItemLauncherAppBinding((FrameLayout) view, imageView, textView, imageView2, imageView3, imageView4, textView2, linearLayout);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i5)));
    }

    @NonNull
    public static ItemLauncherAppBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemLauncherAppBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_launcher_app, viewGroup, false);
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
