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
import com.google.android.material.imageview.ShapeableImageView;
import com.yqtech.multiapp.R;

/* loaded from: classes3.dex */
public final class ItemLauncherAppPreviewBinding implements ViewBinding {

    @NonNull
    public final ImageView itemAppIcon;

    @NonNull
    public final TextView itemAppName;

    @NonNull
    public final ImageView itemCheckbox;

    @NonNull
    public final ImageView itemLock;

    @NonNull
    public final TextView itemNoteName;

    @NonNull
    public final ShapeableImageView ivPreview;

    @NonNull
    public final LinearLayout layMask;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final TextView tvManager;

    @NonNull
    public final TextView tvOpen;

    private ItemLauncherAppPreviewBinding(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull TextView textView2, @NonNull ShapeableImageView shapeableImageView, @NonNull LinearLayout linearLayout, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.rootView = frameLayout;
        this.itemAppIcon = imageView;
        this.itemAppName = textView;
        this.itemCheckbox = imageView2;
        this.itemLock = imageView3;
        this.itemNoteName = textView2;
        this.ivPreview = shapeableImageView;
        this.layMask = linearLayout;
        this.tvManager = textView3;
        this.tvOpen = textView4;
    }

    @NonNull
    public static ItemLauncherAppPreviewBinding bind(@NonNull View view) {
        int i5 = R.id.item_app_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.item_app_icon);
        if (imageView != null) {
            i5 = R.id.item_app_name;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.item_app_name);
            if (textView != null) {
                i5 = R.id.item_checkbox;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.item_checkbox);
                if (imageView2 != null) {
                    i5 = R.id.item_lock;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.item_lock);
                    if (imageView3 != null) {
                        i5 = R.id.item_note_name;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.item_note_name);
                        if (textView2 != null) {
                            i5 = R.id.iv_preview;
                            ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, R.id.iv_preview);
                            if (shapeableImageView != null) {
                                i5 = R.id.lay_mask;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.lay_mask);
                                if (linearLayout != null) {
                                    i5 = R.id.tv_manager;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_manager);
                                    if (textView3 != null) {
                                        i5 = R.id.tv_open;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_open);
                                        if (textView4 != null) {
                                            return new ItemLauncherAppPreviewBinding((FrameLayout) view, imageView, textView, imageView2, imageView3, textView2, shapeableImageView, linearLayout, textView3, textView4);
                                        }
                                    }
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
    public static ItemLauncherAppPreviewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemLauncherAppPreviewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_launcher_app_preview, viewGroup, false);
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
