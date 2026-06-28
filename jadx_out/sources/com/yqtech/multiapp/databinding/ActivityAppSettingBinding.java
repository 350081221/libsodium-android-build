package com.yqtech.multiapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.yqtech.multiapp.R;

/* loaded from: classes3.dex */
public final class ActivityAppSettingBinding implements ViewBinding {

    @NonNull
    public final ImageView appIcon;

    @NonNull
    public final TextView appName;

    @NonNull
    public final Button btnCleanData;

    @NonNull
    private final LinearLayout rootView;

    private ActivityAppSettingBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull Button button) {
        this.rootView = linearLayout;
        this.appIcon = imageView;
        this.appName = textView;
        this.btnCleanData = button;
    }

    @NonNull
    public static ActivityAppSettingBinding bind(@NonNull View view) {
        int i5 = R.id.app_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.app_icon);
        if (imageView != null) {
            i5 = R.id.app_name;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.app_name);
            if (textView != null) {
                i5 = R.id.btn_clean_data;
                Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_clean_data);
                if (button != null) {
                    return new ActivityAppSettingBinding((LinearLayout) view, imageView, textView, button);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i5)));
    }

    @NonNull
    public static ActivityAppSettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityAppSettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_app_setting, viewGroup, false);
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
