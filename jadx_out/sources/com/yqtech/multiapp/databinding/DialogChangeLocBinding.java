package com.yqtech.multiapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.yqtech.multiapp.R;

/* loaded from: classes3.dex */
public final class DialogChangeLocBinding implements ViewBinding {

    @NonNull
    public final TextView btnCancel;

    @NonNull
    public final TextView btnOk;

    @NonNull
    public final AppCompatEditText edtLat;

    @NonNull
    public final AppCompatEditText edtLon;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvTitle;

    private DialogChangeLocBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull AppCompatEditText appCompatEditText, @NonNull AppCompatEditText appCompatEditText2, @NonNull TextView textView3) {
        this.rootView = linearLayout;
        this.btnCancel = textView;
        this.btnOk = textView2;
        this.edtLat = appCompatEditText;
        this.edtLon = appCompatEditText2;
        this.tvTitle = textView3;
    }

    @NonNull
    public static DialogChangeLocBinding bind(@NonNull View view) {
        int i5 = R.id.btn_cancel;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.btn_cancel);
        if (textView != null) {
            i5 = R.id.btn_ok;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.btn_ok);
            if (textView2 != null) {
                i5 = R.id.edt_lat;
                AppCompatEditText appCompatEditText = (AppCompatEditText) ViewBindings.findChildViewById(view, R.id.edt_lat);
                if (appCompatEditText != null) {
                    i5 = R.id.edt_lon;
                    AppCompatEditText appCompatEditText2 = (AppCompatEditText) ViewBindings.findChildViewById(view, R.id.edt_lon);
                    if (appCompatEditText2 != null) {
                        i5 = R.id.tv_title;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                        if (textView3 != null) {
                            return new DialogChangeLocBinding((LinearLayout) view, textView, textView2, appCompatEditText, appCompatEditText2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i5)));
    }

    @NonNull
    public static DialogChangeLocBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogChangeLocBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_change_loc, viewGroup, false);
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
