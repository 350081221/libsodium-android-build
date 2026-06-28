package com.yqtech.multiapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.yqtech.multiapp.R;

/* loaded from: classes3.dex */
public final class ContentToolbarBinding implements ViewBinding {

    @NonNull
    private final AppBarLayout rootView;

    @NonNull
    public final Toolbar topToolbar;

    private ContentToolbarBinding(@NonNull AppBarLayout appBarLayout, @NonNull Toolbar toolbar) {
        this.rootView = appBarLayout;
        this.topToolbar = toolbar;
    }

    @NonNull
    public static ContentToolbarBinding bind(@NonNull View view) {
        Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.top_toolbar);
        if (toolbar != null) {
            return new ContentToolbarBinding((AppBarLayout) view, toolbar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.top_toolbar)));
    }

    @NonNull
    public static ContentToolbarBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ContentToolbarBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.content_toolbar, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public AppBarLayout getRoot() {
        return this.rootView;
    }
}
