package com.yqtech.multiapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.yqtech.multiapp.R;

/* loaded from: classes3.dex */
public final class ActivityLocationSettingsBinding implements ViewBinding {

    @NonNull
    public final ListView appdataList;

    @NonNull
    private final LinearLayout rootView;

    private ActivityLocationSettingsBinding(@NonNull LinearLayout linearLayout, @NonNull ListView listView) {
        this.rootView = linearLayout;
        this.appdataList = listView;
    }

    @NonNull
    public static ActivityLocationSettingsBinding bind(@NonNull View view) {
        ListView listView = (ListView) ViewBindings.findChildViewById(view, R.id.appdata_list);
        if (listView != null) {
            return new ActivityLocationSettingsBinding((LinearLayout) view, listView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.appdata_list)));
    }

    @NonNull
    public static ActivityLocationSettingsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityLocationSettingsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_location_settings, viewGroup, false);
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
