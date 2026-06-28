package com.yqtech.multiapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.yqtech.multiapp.R;

/* loaded from: classes3.dex */
public final class DialogBaseTipBinding implements ViewBinding {

    @NonNull
    public final MaterialButton btnConfirm;

    @NonNull
    public final MaterialButton btnRefuse;

    @NonNull
    public final ImageView ivClose;

    @NonNull
    public final ImageView ivWarn;

    @NonNull
    public final LinearLayout layTitle;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView tvContent;

    @NonNull
    public final TextView tvContentOther;

    @NonNull
    public final TextView tvTitle;

    private DialogBaseTipBinding(@NonNull ConstraintLayout constraintLayout, @NonNull MaterialButton materialButton, @NonNull MaterialButton materialButton2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = constraintLayout;
        this.btnConfirm = materialButton;
        this.btnRefuse = materialButton2;
        this.ivClose = imageView;
        this.ivWarn = imageView2;
        this.layTitle = linearLayout;
        this.tvContent = textView;
        this.tvContentOther = textView2;
        this.tvTitle = textView3;
    }

    @NonNull
    public static DialogBaseTipBinding bind(@NonNull View view) {
        int i5 = R.id.btn_confirm;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btn_confirm);
        if (materialButton != null) {
            i5 = R.id.btn_refuse;
            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btn_refuse);
            if (materialButton2 != null) {
                i5 = R.id.iv_close;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_close);
                if (imageView != null) {
                    i5 = R.id.iv_warn;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_warn);
                    if (imageView2 != null) {
                        i5 = R.id.lay_title;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.lay_title);
                        if (linearLayout != null) {
                            i5 = R.id.tv_content;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_content);
                            if (textView != null) {
                                i5 = R.id.tv_content_other;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_content_other);
                                if (textView2 != null) {
                                    i5 = R.id.tv_title;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                                    if (textView3 != null) {
                                        return new DialogBaseTipBinding((ConstraintLayout) view, materialButton, materialButton2, imageView, imageView2, linearLayout, textView, textView2, textView3);
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
    public static DialogBaseTipBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogBaseTipBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_base_tip, viewGroup, false);
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
