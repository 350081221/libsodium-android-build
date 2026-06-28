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
public final class ItemAddressBinding implements ViewBinding {

    @NonNull
    public final LinearLayout layAddress;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvAddress;

    @NonNull
    public final TextView tvLat;

    @NonNull
    public final TextView tvLng;

    private ItemAddressBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = linearLayout;
        this.layAddress = linearLayout2;
        this.tvAddress = textView;
        this.tvLat = textView2;
        this.tvLng = textView3;
    }

    @NonNull
    public static ItemAddressBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i5 = R.id.tv_address;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_address);
        if (textView != null) {
            i5 = R.id.tv_lat;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_lat);
            if (textView2 != null) {
                i5 = R.id.tv_lng;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_lng);
                if (textView3 != null) {
                    return new ItemAddressBinding(linearLayout, linearLayout, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i5)));
    }

    @NonNull
    public static ItemAddressBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemAddressBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_address, viewGroup, false);
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
