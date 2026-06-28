package com.yqtech.multiapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.yqtech.multiapp.R;

/* loaded from: classes3.dex */
public final class ActivityMockDeviceBinding implements ViewBinding {

    @NonNull
    public final EditText edtAndroidId;

    @NonNull
    public final EditText edtBoard;

    @NonNull
    public final EditText edtBrand;

    @NonNull
    public final EditText edtDevice;

    @NonNull
    public final EditText edtDisplay;

    @NonNull
    public final EditText edtFingerprint;

    @NonNull
    public final EditText edtId;

    @NonNull
    public final EditText edtImei;

    @NonNull
    public final EditText edtImsi;

    @NonNull
    public final EditText edtMac;

    @NonNull
    public final EditText edtManufacturer;

    @NonNull
    public final EditText edtModel;

    @NonNull
    public final EditText edtName;

    @NonNull
    public final EditText edtSerial;

    @NonNull
    private final LinearLayout rootView;

    private ActivityMockDeviceBinding(@NonNull LinearLayout linearLayout, @NonNull EditText editText, @NonNull EditText editText2, @NonNull EditText editText3, @NonNull EditText editText4, @NonNull EditText editText5, @NonNull EditText editText6, @NonNull EditText editText7, @NonNull EditText editText8, @NonNull EditText editText9, @NonNull EditText editText10, @NonNull EditText editText11, @NonNull EditText editText12, @NonNull EditText editText13, @NonNull EditText editText14) {
        this.rootView = linearLayout;
        this.edtAndroidId = editText;
        this.edtBoard = editText2;
        this.edtBrand = editText3;
        this.edtDevice = editText4;
        this.edtDisplay = editText5;
        this.edtFingerprint = editText6;
        this.edtId = editText7;
        this.edtImei = editText8;
        this.edtImsi = editText9;
        this.edtMac = editText10;
        this.edtManufacturer = editText11;
        this.edtModel = editText12;
        this.edtName = editText13;
        this.edtSerial = editText14;
    }

    @NonNull
    public static ActivityMockDeviceBinding bind(@NonNull View view) {
        int i5 = R.id.edt_androidId;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.edt_androidId);
        if (editText != null) {
            i5 = R.id.edt_board;
            EditText editText2 = (EditText) ViewBindings.findChildViewById(view, R.id.edt_board);
            if (editText2 != null) {
                i5 = R.id.edt_brand;
                EditText editText3 = (EditText) ViewBindings.findChildViewById(view, R.id.edt_brand);
                if (editText3 != null) {
                    i5 = R.id.edt_device;
                    EditText editText4 = (EditText) ViewBindings.findChildViewById(view, R.id.edt_device);
                    if (editText4 != null) {
                        i5 = R.id.edt_display;
                        EditText editText5 = (EditText) ViewBindings.findChildViewById(view, R.id.edt_display);
                        if (editText5 != null) {
                            i5 = R.id.edt_fingerprint;
                            EditText editText6 = (EditText) ViewBindings.findChildViewById(view, R.id.edt_fingerprint);
                            if (editText6 != null) {
                                i5 = R.id.edt_id;
                                EditText editText7 = (EditText) ViewBindings.findChildViewById(view, R.id.edt_id);
                                if (editText7 != null) {
                                    i5 = R.id.edt_imei;
                                    EditText editText8 = (EditText) ViewBindings.findChildViewById(view, R.id.edt_imei);
                                    if (editText8 != null) {
                                        i5 = R.id.edt_imsi;
                                        EditText editText9 = (EditText) ViewBindings.findChildViewById(view, R.id.edt_imsi);
                                        if (editText9 != null) {
                                            i5 = R.id.edt_mac;
                                            EditText editText10 = (EditText) ViewBindings.findChildViewById(view, R.id.edt_mac);
                                            if (editText10 != null) {
                                                i5 = R.id.edt_manufacturer;
                                                EditText editText11 = (EditText) ViewBindings.findChildViewById(view, R.id.edt_manufacturer);
                                                if (editText11 != null) {
                                                    i5 = R.id.edt_model;
                                                    EditText editText12 = (EditText) ViewBindings.findChildViewById(view, R.id.edt_model);
                                                    if (editText12 != null) {
                                                        i5 = R.id.edt_name;
                                                        EditText editText13 = (EditText) ViewBindings.findChildViewById(view, R.id.edt_name);
                                                        if (editText13 != null) {
                                                            i5 = R.id.edt_serial;
                                                            EditText editText14 = (EditText) ViewBindings.findChildViewById(view, R.id.edt_serial);
                                                            if (editText14 != null) {
                                                                return new ActivityMockDeviceBinding((LinearLayout) view, editText, editText2, editText3, editText4, editText5, editText6, editText7, editText8, editText9, editText10, editText11, editText12, editText13, editText14);
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
    public static ActivityMockDeviceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityMockDeviceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_mock_device, viewGroup, false);
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
