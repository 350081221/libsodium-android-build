package com.yqtech.multiapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.yqtech.multiapp.R;

/* loaded from: classes3.dex */
public final class ActivityWebBinding implements ViewBinding {

    @NonNull
    public final ConstraintLayout main;

    @NonNull
    public final LinearProgressIndicator progressBar;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final MaterialToolbar toolbar;

    @NonNull
    public final WebView webView;

    private ActivityWebBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull LinearProgressIndicator linearProgressIndicator, @NonNull MaterialToolbar materialToolbar, @NonNull WebView webView) {
        this.rootView = constraintLayout;
        this.main = constraintLayout2;
        this.progressBar = linearProgressIndicator;
        this.toolbar = materialToolbar;
        this.webView = webView;
    }

    @NonNull
    public static ActivityWebBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i5 = R.id.progress_bar;
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) ViewBindings.findChildViewById(view, R.id.progress_bar);
        if (linearProgressIndicator != null) {
            i5 = R.id.toolbar;
            MaterialToolbar materialToolbar = (MaterialToolbar) ViewBindings.findChildViewById(view, R.id.toolbar);
            if (materialToolbar != null) {
                i5 = R.id.web_view;
                WebView webView = (WebView) ViewBindings.findChildViewById(view, R.id.web_view);
                if (webView != null) {
                    return new ActivityWebBinding(constraintLayout, constraintLayout, linearProgressIndicator, materialToolbar, webView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i5)));
    }

    @NonNull
    public static ActivityWebBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityWebBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_web, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
