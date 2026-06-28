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
import com.al.open.SplitEditTextView;
import com.google.android.material.button.MaterialButton;
import com.yqtech.multiapp.R;

/* loaded from: classes3.dex */
public final class DialogSetPwdBinding implements ViewBinding {

    @NonNull
    public final MaterialButton btnCancel;

    @NonNull
    public final MaterialButton btnConfirm;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final SplitEditTextView setPwdText;

    @NonNull
    public final TextView setPwdTip;

    @NonNull
    public final TextView titleSetPwd;

    private DialogSetPwdBinding(@NonNull ConstraintLayout constraintLayout, @NonNull MaterialButton materialButton, @NonNull MaterialButton materialButton2, @NonNull SplitEditTextView splitEditTextView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = constraintLayout;
        this.btnCancel = materialButton;
        this.btnConfirm = materialButton2;
        this.setPwdText = splitEditTextView;
        this.setPwdTip = textView;
        this.titleSetPwd = textView2;
    }

    @NonNull
    public static DialogSetPwdBinding bind(@NonNull View view) {
        int i5 = R.id.btn_cancel;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btn_cancel);
        if (materialButton != null) {
            i5 = R.id.btn_confirm;
            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btn_confirm);
            if (materialButton2 != null) {
                i5 = R.id.set_pwd_text;
                SplitEditTextView splitEditTextView = (SplitEditTextView) ViewBindings.findChildViewById(view, R.id.set_pwd_text);
                if (splitEditTextView != null) {
                    i5 = R.id.set_pwd_tip;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.set_pwd_tip);
                    if (textView != null) {
                        i5 = R.id.title_set_pwd;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.title_set_pwd);
                        if (textView2 != null) {
                            return new DialogSetPwdBinding((ConstraintLayout) view, materialButton, materialButton2, splitEditTextView, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i5)));
    }

    @NonNull
    public static DialogSetPwdBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogSetPwdBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_set_pwd, viewGroup, false);
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
