package com.yqtech.multiapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.yqtech.multiapp.R;

/* loaded from: classes3.dex */
public final class DialogUserListBinding implements ViewBinding {

    @NonNull
    public final ImageView ivClose;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final RecyclerView rvUser;

    @NonNull
    public final TextView tvTitle;

    private DialogUserListBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.ivClose = imageView;
        this.rvUser = recyclerView;
        this.tvTitle = textView;
    }

    @NonNull
    public static DialogUserListBinding bind(@NonNull View view) {
        int i5 = R.id.iv_close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_close);
        if (imageView != null) {
            i5 = R.id.rv_user;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_user);
            if (recyclerView != null) {
                i5 = R.id.tv_title;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                if (textView != null) {
                    return new DialogUserListBinding((ConstraintLayout) view, imageView, recyclerView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i5)));
    }

    @NonNull
    public static DialogUserListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogUserListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_user_list_, viewGroup, false);
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
