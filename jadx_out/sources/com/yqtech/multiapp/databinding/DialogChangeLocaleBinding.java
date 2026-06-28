package com.yqtech.multiapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.yqtech.multiapp.R;

/* loaded from: classes3.dex */
public final class DialogChangeLocaleBinding implements ViewBinding {

    @NonNull
    public final RecyclerView recylerChangeLocale;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView titleChangeLocale;

    private DialogChangeLocaleBinding(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.recylerChangeLocale = recyclerView;
        this.titleChangeLocale = textView;
    }

    @NonNull
    public static DialogChangeLocaleBinding bind(@NonNull View view) {
        int i5 = R.id.recyler_change_locale;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.recyler_change_locale);
        if (recyclerView != null) {
            i5 = R.id.title_change_locale;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.title_change_locale);
            if (textView != null) {
                return new DialogChangeLocaleBinding((LinearLayout) view, recyclerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i5)));
    }

    @NonNull
    public static DialogChangeLocaleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogChangeLocaleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_change_locale, viewGroup, false);
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
