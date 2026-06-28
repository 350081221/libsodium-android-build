package com.yqtech.multiapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.yqtech.multiapp.R;

/* loaded from: classes3.dex */
public final class MenuHomeLongPressBinding implements ViewBinding {

    @NonNull
    public final LinearLayout menuCreateShort;

    @NonNull
    public final LinearLayout menuDelete;

    @NonNull
    public final LinearLayout menuManager;

    @NonNull
    public final LinearLayout menuNote;

    @NonNull
    public final LinearLayout menuQickClone;

    @NonNull
    public final LinearLayout menuSetPwd;

    @NonNull
    public final LinearLayout menuSort;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView setPwdText;

    private MenuHomeLongPressBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull LinearLayout linearLayout6, @NonNull LinearLayout linearLayout7, @NonNull LinearLayout linearLayout8, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.menuCreateShort = linearLayout2;
        this.menuDelete = linearLayout3;
        this.menuManager = linearLayout4;
        this.menuNote = linearLayout5;
        this.menuQickClone = linearLayout6;
        this.menuSetPwd = linearLayout7;
        this.menuSort = linearLayout8;
        this.setPwdText = textView;
    }

    @NonNull
    public static MenuHomeLongPressBinding bind(@NonNull View view) {
        int i5 = R.id.menu_create_short;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.menu_create_short);
        if (linearLayout != null) {
            i5 = R.id.menu_delete;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.menu_delete);
            if (linearLayout2 != null) {
                i5 = R.id.menu_manager;
                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.menu_manager);
                if (linearLayout3 != null) {
                    i5 = R.id.menu_note;
                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.menu_note);
                    if (linearLayout4 != null) {
                        i5 = R.id.menu_qick_clone;
                        LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.menu_qick_clone);
                        if (linearLayout5 != null) {
                            i5 = R.id.menu_set_pwd;
                            LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.menu_set_pwd);
                            if (linearLayout6 != null) {
                                i5 = R.id.menu_sort;
                                LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.menu_sort);
                                if (linearLayout7 != null) {
                                    i5 = R.id.set_pwd_text;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.set_pwd_text);
                                    if (textView != null) {
                                        return new MenuHomeLongPressBinding((LinearLayout) view, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, textView);
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
    public static MenuHomeLongPressBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static MenuHomeLongPressBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.menu_home_long_press, viewGroup, false);
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
