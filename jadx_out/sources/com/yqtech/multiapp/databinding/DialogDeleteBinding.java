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
import com.google.android.material.button.MaterialButton;
import com.yqtech.multiapp.R;

/* loaded from: classes3.dex */
public final class DialogDeleteBinding implements ViewBinding {

    @NonNull
    public final MaterialButton btnCancel;

    @NonNull
    public final MaterialButton btnConfirm;

    @NonNull
    public final TextView deleteMsg;

    @NonNull
    public final ImageView ivClose;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView tvTitle;

    private DialogDeleteBinding(@NonNull ConstraintLayout constraintLayout, @NonNull MaterialButton materialButton, @NonNull MaterialButton materialButton2, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2) {
        this.rootView = constraintLayout;
        this.btnCancel = materialButton;
        this.btnConfirm = materialButton2;
        this.deleteMsg = textView;
        this.ivClose = imageView;
        this.tvTitle = textView2;
    }

    @NonNull
    public static DialogDeleteBinding bind(@NonNull View view) {
        int i5 = R.id.btn_cancel;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btn_cancel);
        if (materialButton != null) {
            i5 = R.id.btn_confirm;
            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btn_confirm);
            if (materialButton2 != null) {
                i5 = R.id.delete_msg;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.delete_msg);
                if (textView != null) {
                    i5 = R.id.iv_close;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_close);
                    if (imageView != null) {
                        i5 = R.id.tv_title;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                        if (textView2 != null) {
                            return new DialogDeleteBinding((ConstraintLayout) view, materialButton, materialButton2, textView, imageView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i5)));
    }

    @NonNull
    public static DialogDeleteBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogDeleteBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_delete, viewGroup, false);
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
