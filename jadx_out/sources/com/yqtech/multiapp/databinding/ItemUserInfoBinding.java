package com.yqtech.multiapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.yqtech.multiapp.R;

/* loaded from: classes3.dex */
public final class ItemUserInfoBinding implements ViewBinding {

    @NonNull
    private final TextView rootView;

    @NonNull
    public final TextView tvUserName;

    private ItemUserInfoBinding(@NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = textView;
        this.tvUserName = textView2;
    }

    @NonNull
    public static ItemUserInfoBinding bind(@NonNull View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new ItemUserInfoBinding(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static ItemUserInfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemUserInfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_user_info, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public TextView getRoot() {
        return this.rootView;
    }
}
