package com.yqtech.multiapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.yqtech.multiapp.R;

/* loaded from: classes3.dex */
public final class DialogSetNoteBinding implements ViewBinding {

    @NonNull
    public final MaterialButton btnCancel;

    @NonNull
    public final MaterialButton btnConfirm;

    @NonNull
    public final EditText etNote;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView tvTitle;

    private DialogSetNoteBinding(@NonNull ConstraintLayout constraintLayout, @NonNull MaterialButton materialButton, @NonNull MaterialButton materialButton2, @NonNull EditText editText, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.btnCancel = materialButton;
        this.btnConfirm = materialButton2;
        this.etNote = editText;
        this.tvTitle = textView;
    }

    @NonNull
    public static DialogSetNoteBinding bind(@NonNull View view) {
        int i5 = R.id.btn_cancel;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btn_cancel);
        if (materialButton != null) {
            i5 = R.id.btn_confirm;
            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btn_confirm);
            if (materialButton2 != null) {
                i5 = R.id.et_note;
                EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.et_note);
                if (editText != null) {
                    i5 = R.id.tv_title;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                    if (textView != null) {
                        return new DialogSetNoteBinding((ConstraintLayout) view, materialButton, materialButton2, editText, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i5)));
    }

    @NonNull
    public static DialogSetNoteBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogSetNoteBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_set_note, viewGroup, false);
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
