package com.yqtech.multiapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.yqtech.multiapp.R;

/* loaded from: classes3.dex */
public final class MenuHomeBinding implements ViewBinding {

    @NonNull
    public final ImageView imageView2;

    @NonNull
    public final ImageView imageView3;

    @NonNull
    public final ImageView imageView4;

    @NonNull
    public final ImageView imageView5;

    @NonNull
    public final ImageView imageView6;

    @NonNull
    public final ImageView imageView7;

    @NonNull
    public final ImageView imageView8;

    @NonNull
    public final LinearLayout menuAboutus;

    @NonNull
    public final ConstraintLayout menuAccount;

    @NonNull
    public final ImageView menuAccountIcon;

    @NonNull
    public final TextView menuAccountText;

    @NonNull
    public final ConstraintLayout menuClear;

    @NonNull
    public final ConstraintLayout menuDataManagement;

    @NonNull
    public final ConstraintLayout menuGive;

    @NonNull
    public final ConstraintLayout menuHelp;

    @NonNull
    public final ConstraintLayout menuProcessLimits;

    @NonNull
    public final ConstraintLayout menuSetPermiss;

    @NonNull
    public final ConstraintLayout menuShare;

    @NonNull
    public final ImageView redPoint;

    @NonNull
    public final ImageView redPointHelp;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvDataManagement;

    @NonNull
    public final TextView tvHelp;

    private MenuHomeBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull ImageView imageView6, @NonNull ImageView imageView7, @NonNull LinearLayout linearLayout2, @NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView8, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull ConstraintLayout constraintLayout4, @NonNull ConstraintLayout constraintLayout5, @NonNull ConstraintLayout constraintLayout6, @NonNull ConstraintLayout constraintLayout7, @NonNull ConstraintLayout constraintLayout8, @NonNull ImageView imageView9, @NonNull ImageView imageView10, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = linearLayout;
        this.imageView2 = imageView;
        this.imageView3 = imageView2;
        this.imageView4 = imageView3;
        this.imageView5 = imageView4;
        this.imageView6 = imageView5;
        this.imageView7 = imageView6;
        this.imageView8 = imageView7;
        this.menuAboutus = linearLayout2;
        this.menuAccount = constraintLayout;
        this.menuAccountIcon = imageView8;
        this.menuAccountText = textView;
        this.menuClear = constraintLayout2;
        this.menuDataManagement = constraintLayout3;
        this.menuGive = constraintLayout4;
        this.menuHelp = constraintLayout5;
        this.menuProcessLimits = constraintLayout6;
        this.menuSetPermiss = constraintLayout7;
        this.menuShare = constraintLayout8;
        this.redPoint = imageView9;
        this.redPointHelp = imageView10;
        this.tvDataManagement = textView2;
        this.tvHelp = textView3;
    }

    @NonNull
    public static MenuHomeBinding bind(@NonNull View view) {
        int i5 = R.id.imageView2;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView2);
        if (imageView != null) {
            i5 = R.id.imageView3;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView3);
            if (imageView2 != null) {
                i5 = R.id.imageView4;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView4);
                if (imageView3 != null) {
                    i5 = R.id.imageView5;
                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView5);
                    if (imageView4 != null) {
                        i5 = R.id.imageView6;
                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView6);
                        if (imageView5 != null) {
                            i5 = R.id.imageView7;
                            ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView7);
                            if (imageView6 != null) {
                                i5 = R.id.imageView8;
                                ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView8);
                                if (imageView7 != null) {
                                    i5 = R.id.menu_aboutus;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.menu_aboutus);
                                    if (linearLayout != null) {
                                        i5 = R.id.menu_account;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.menu_account);
                                        if (constraintLayout != null) {
                                            i5 = R.id.menu_account_icon;
                                            ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(view, R.id.menu_account_icon);
                                            if (imageView8 != null) {
                                                i5 = R.id.menu_account_text;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.menu_account_text);
                                                if (textView != null) {
                                                    i5 = R.id.menu_clear;
                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.menu_clear);
                                                    if (constraintLayout2 != null) {
                                                        i5 = R.id.menu_data_management;
                                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.menu_data_management);
                                                        if (constraintLayout3 != null) {
                                                            i5 = R.id.menu_give;
                                                            ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.menu_give);
                                                            if (constraintLayout4 != null) {
                                                                i5 = R.id.menu_help;
                                                                ConstraintLayout constraintLayout5 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.menu_help);
                                                                if (constraintLayout5 != null) {
                                                                    i5 = R.id.menu_process_limits;
                                                                    ConstraintLayout constraintLayout6 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.menu_process_limits);
                                                                    if (constraintLayout6 != null) {
                                                                        i5 = R.id.menu_set_permiss;
                                                                        ConstraintLayout constraintLayout7 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.menu_set_permiss);
                                                                        if (constraintLayout7 != null) {
                                                                            i5 = R.id.menu_share;
                                                                            ConstraintLayout constraintLayout8 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.menu_share);
                                                                            if (constraintLayout8 != null) {
                                                                                i5 = R.id.red_point;
                                                                                ImageView imageView9 = (ImageView) ViewBindings.findChildViewById(view, R.id.red_point);
                                                                                if (imageView9 != null) {
                                                                                    i5 = R.id.red_point_help;
                                                                                    ImageView imageView10 = (ImageView) ViewBindings.findChildViewById(view, R.id.red_point_help);
                                                                                    if (imageView10 != null) {
                                                                                        i5 = R.id.tv_data_management;
                                                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_data_management);
                                                                                        if (textView2 != null) {
                                                                                            i5 = R.id.tv_help;
                                                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_help);
                                                                                            if (textView3 != null) {
                                                                                                return new MenuHomeBinding((LinearLayout) view, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, linearLayout, constraintLayout, imageView8, textView, constraintLayout2, constraintLayout3, constraintLayout4, constraintLayout5, constraintLayout6, constraintLayout7, constraintLayout8, imageView9, imageView10, textView2, textView3);
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
    public static MenuHomeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static MenuHomeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.menu_home, viewGroup, false);
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
