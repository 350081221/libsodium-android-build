package com.yqtech.multiapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.yqtech.multiapp.R;
import org.osmdroid.views.MapView;

/* loaded from: classes3.dex */
public final class ActivityMapBinding implements ViewBinding {

    @NonNull
    public final MaterialButton btnMock;

    @NonNull
    public final AppCompatEditText etLat;

    @NonNull
    public final AppCompatEditText etLng;

    @NonNull
    public final AppCompatEditText etSearch;

    @NonNull
    public final ImageView imageView;

    @NonNull
    public final ImageView ivChangeSearch;

    @NonNull
    public final ImageView ivClear;

    @NonNull
    public final ImageView ivCloseVirtualLocation;

    @NonNull
    public final ImageView ivLatClear;

    @NonNull
    public final ImageView ivLngClear;

    @NonNull
    public final ImageView ivMyLocation;

    @NonNull
    public final ImageView ivSearch;

    @NonNull
    public final ImageView ivSearchLatlng;

    @NonNull
    public final ConstraintLayout layBottom;

    @NonNull
    public final LinearLayout layFunction;

    @NonNull
    public final ConstraintLayout laySearch;

    @NonNull
    public final LinearLayout laySearchCity;

    @NonNull
    public final LinearLayout laySearchLatlon;

    @NonNull
    public final ConstraintLayout main;

    @NonNull
    public final MapView map;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final RecyclerView rvResult;

    @NonNull
    public final MaterialToolbar toolbar;

    @NonNull
    public final TextView tvCloseVirtualLocation;

    @NonNull
    public final TextView tvHistory;

    @NonNull
    public final TextView tvLatitudeLongitude;

    private ActivityMapBinding(@NonNull ConstraintLayout constraintLayout, @NonNull MaterialButton materialButton, @NonNull AppCompatEditText appCompatEditText, @NonNull AppCompatEditText appCompatEditText2, @NonNull AppCompatEditText appCompatEditText3, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull ImageView imageView6, @NonNull ImageView imageView7, @NonNull ImageView imageView8, @NonNull ImageView imageView9, @NonNull ConstraintLayout constraintLayout2, @NonNull LinearLayout linearLayout, @NonNull ConstraintLayout constraintLayout3, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull ConstraintLayout constraintLayout4, @NonNull MapView mapView, @NonNull RecyclerView recyclerView, @NonNull MaterialToolbar materialToolbar, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = constraintLayout;
        this.btnMock = materialButton;
        this.etLat = appCompatEditText;
        this.etLng = appCompatEditText2;
        this.etSearch = appCompatEditText3;
        this.imageView = imageView;
        this.ivChangeSearch = imageView2;
        this.ivClear = imageView3;
        this.ivCloseVirtualLocation = imageView4;
        this.ivLatClear = imageView5;
        this.ivLngClear = imageView6;
        this.ivMyLocation = imageView7;
        this.ivSearch = imageView8;
        this.ivSearchLatlng = imageView9;
        this.layBottom = constraintLayout2;
        this.layFunction = linearLayout;
        this.laySearch = constraintLayout3;
        this.laySearchCity = linearLayout2;
        this.laySearchLatlon = linearLayout3;
        this.main = constraintLayout4;
        this.map = mapView;
        this.rvResult = recyclerView;
        this.toolbar = materialToolbar;
        this.tvCloseVirtualLocation = textView;
        this.tvHistory = textView2;
        this.tvLatitudeLongitude = textView3;
    }

    @NonNull
    public static ActivityMapBinding bind(@NonNull View view) {
        int i5 = R.id.btn_mock;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btn_mock);
        if (materialButton != null) {
            i5 = R.id.et_lat;
            AppCompatEditText appCompatEditText = (AppCompatEditText) ViewBindings.findChildViewById(view, R.id.et_lat);
            if (appCompatEditText != null) {
                i5 = R.id.et_lng;
                AppCompatEditText appCompatEditText2 = (AppCompatEditText) ViewBindings.findChildViewById(view, R.id.et_lng);
                if (appCompatEditText2 != null) {
                    i5 = R.id.et_search;
                    AppCompatEditText appCompatEditText3 = (AppCompatEditText) ViewBindings.findChildViewById(view, R.id.et_search);
                    if (appCompatEditText3 != null) {
                        i5 = R.id.imageView;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView);
                        if (imageView != null) {
                            i5 = R.id.iv_change_search;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_change_search);
                            if (imageView2 != null) {
                                i5 = R.id.iv_clear;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_clear);
                                if (imageView3 != null) {
                                    i5 = R.id.iv_close_virtual_location;
                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_close_virtual_location);
                                    if (imageView4 != null) {
                                        i5 = R.id.iv_lat_clear;
                                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_lat_clear);
                                        if (imageView5 != null) {
                                            i5 = R.id.iv_lng_clear;
                                            ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_lng_clear);
                                            if (imageView6 != null) {
                                                i5 = R.id.iv_my_location;
                                                ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_my_location);
                                                if (imageView7 != null) {
                                                    i5 = R.id.iv_search;
                                                    ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_search);
                                                    if (imageView8 != null) {
                                                        i5 = R.id.iv_search_latlng;
                                                        ImageView imageView9 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_search_latlng);
                                                        if (imageView9 != null) {
                                                            i5 = R.id.lay_bottom;
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.lay_bottom);
                                                            if (constraintLayout != null) {
                                                                i5 = R.id.lay_function;
                                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.lay_function);
                                                                if (linearLayout != null) {
                                                                    i5 = R.id.lay_search;
                                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.lay_search);
                                                                    if (constraintLayout2 != null) {
                                                                        i5 = R.id.lay_search_city;
                                                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.lay_search_city);
                                                                        if (linearLayout2 != null) {
                                                                            i5 = R.id.lay_search_latlon;
                                                                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.lay_search_latlon);
                                                                            if (linearLayout3 != null) {
                                                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) view;
                                                                                i5 = R.id.map;
                                                                                MapView mapView = (MapView) ViewBindings.findChildViewById(view, R.id.map);
                                                                                if (mapView != null) {
                                                                                    i5 = R.id.rv_result;
                                                                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_result);
                                                                                    if (recyclerView != null) {
                                                                                        i5 = R.id.toolbar;
                                                                                        MaterialToolbar materialToolbar = (MaterialToolbar) ViewBindings.findChildViewById(view, R.id.toolbar);
                                                                                        if (materialToolbar != null) {
                                                                                            i5 = R.id.tv_close_virtual_location;
                                                                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_close_virtual_location);
                                                                                            if (textView != null) {
                                                                                                i5 = R.id.tv_history;
                                                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_history);
                                                                                                if (textView2 != null) {
                                                                                                    i5 = R.id.tv_latitude_longitude;
                                                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_latitude_longitude);
                                                                                                    if (textView3 != null) {
                                                                                                        return new ActivityMapBinding(constraintLayout3, materialButton, appCompatEditText, appCompatEditText2, appCompatEditText3, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, constraintLayout, linearLayout, constraintLayout2, linearLayout2, linearLayout3, constraintLayout3, mapView, recyclerView, materialToolbar, textView, textView2, textView3);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i5)));
    }

    @NonNull
    public static ActivityMapBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityMapBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_map, viewGroup, false);
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
