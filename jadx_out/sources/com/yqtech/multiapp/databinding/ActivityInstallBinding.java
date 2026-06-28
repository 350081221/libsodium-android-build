package com.yqtech.multiapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.yqtech.multiapp.R;

/* loaded from: classes3.dex */
public final class ActivityInstallBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    private ActivityInstallBinding(@NonNull LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    @NonNull
    public static ActivityInstallBinding bind(@NonNull View view) {
        if (view != null) {
            return new ActivityInstallBinding((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static ActivityInstallBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityInstallBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_install, viewGroup, false);
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
