package com.yqtech.multiapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.yqtech.multiapp.R;

/* loaded from: classes3.dex */
public final class ActivityHomeBinding implements ViewBinding {

    @NonNull
    public final LottieAnimationView animationView;

    @NonNull
    public final ImageView homeAdd;

    @NonNull
    public final RecyclerView homeLauncher;

    @NonNull
    public final ImageView homeMenu;

    @NonNull
    public final ImageView homeMode;

    @NonNull
    public final LinearLayout homeMultiDelete;

    @NonNull
    public final ImageView homeMultiDeleteImg;

    @NonNull
    public final ImageView homeVip;

    @NonNull
    public final LinearLayout layBack;

    @NonNull
    public final TextView nodata;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final TextView selectNum;

    @NonNull
    public final TextView totalNum;

    @NonNull
    public final TextView tvContent;

    private ActivityHomeBinding(@NonNull FrameLayout frameLayout, @NonNull LottieAnimationView lottieAnimationView, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.rootView = frameLayout;
        this.animationView = lottieAnimationView;
        this.homeAdd = imageView;
        this.homeLauncher = recyclerView;
        this.homeMenu = imageView2;
        this.homeMode = imageView3;
        this.homeMultiDelete = linearLayout;
        this.homeMultiDeleteImg = imageView4;
        this.homeVip = imageView5;
        this.layBack = linearLayout2;
        this.nodata = textView;
        this.selectNum = textView2;
        this.totalNum = textView3;
        this.tvContent = textView4;
    }

    @NonNull
    public static ActivityHomeBinding bind(@NonNull View view) {
        int i5 = R.id.animation_view;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, R.id.animation_view);
        if (lottieAnimationView != null) {
            i5 = R.id.home_add;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.home_add);
            if (imageView != null) {
                i5 = R.id.home_launcher;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.home_launcher);
                if (recyclerView != null) {
                    i5 = R.id.home_menu;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.home_menu);
                    if (imageView2 != null) {
                        i5 = R.id.home_mode;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.home_mode);
                        if (imageView3 != null) {
                            i5 = R.id.home_multi_delete;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.home_multi_delete);
                            if (linearLayout != null) {
                                i5 = R.id.home_multi_delete_img;
                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.home_multi_delete_img);
                                if (imageView4 != null) {
                                    i5 = R.id.home_vip;
                                    ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.home_vip);
                                    if (imageView5 != null) {
                                        i5 = R.id.lay_back;
                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.lay_back);
                                        if (linearLayout2 != null) {
                                            i5 = R.id.nodata;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.nodata);
                                            if (textView != null) {
                                                i5 = R.id.select_num;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.select_num);
                                                if (textView2 != null) {
                                                    i5 = R.id.total_num;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.total_num);
                                                    if (textView3 != null) {
                                                        i5 = R.id.tv_content;
                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_content);
                                                        if (textView4 != null) {
                                                            return new ActivityHomeBinding((FrameLayout) view, lottieAnimationView, imageView, recyclerView, imageView2, imageView3, linearLayout, imageView4, imageView5, linearLayout2, textView, textView2, textView3, textView4);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i5)));
    }

    @NonNull
    public static ActivityHomeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityHomeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_home, viewGroup, false);
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
