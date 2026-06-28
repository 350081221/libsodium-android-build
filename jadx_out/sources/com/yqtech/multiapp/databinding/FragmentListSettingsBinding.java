package com.yqtech.multiapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.yqtech.multiapp.R;

/* loaded from: classes3.dex */
public final class FragmentListSettingsBinding implements ViewBinding {

    @NonNull
    public final ListView listview;

    @NonNull
    private final FrameLayout rootView;

    private FragmentListSettingsBinding(@NonNull FrameLayout frameLayout, @NonNull ListView listView) {
        this.rootView = frameLayout;
        this.listview = listView;
    }

    @NonNull
    public static FragmentListSettingsBinding bind(@NonNull View view) {
        ListView listView = (ListView) ViewBindings.findChildViewById(view, R.id.listview);
        if (listView != null) {
            return new FragmentListSettingsBinding((FrameLayout) view, listView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.listview)));
    }

    @NonNull
    public static FragmentListSettingsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentListSettingsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_list_settings, viewGroup, false);
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
