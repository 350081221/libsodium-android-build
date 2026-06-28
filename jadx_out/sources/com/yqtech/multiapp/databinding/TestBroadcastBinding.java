package com.yqtech.multiapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.yqtech.multiapp.R;

/* loaded from: classes3.dex */
public final class TestBroadcastBinding implements ViewBinding {

    @NonNull
    public final Button btnSendAll;

    @NonNull
    public final Button btnSendHost;

    @NonNull
    public final Button btnSendVapp0;

    @NonNull
    public final Button btnSendVapp1;

    @NonNull
    public final EditText pkg;

    @NonNull
    public final TextView recv;

    @NonNull
    private final LinearLayout rootView;

    private TestBroadcastBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull Button button2, @NonNull Button button3, @NonNull Button button4, @NonNull EditText editText, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.btnSendAll = button;
        this.btnSendHost = button2;
        this.btnSendVapp0 = button3;
        this.btnSendVapp1 = button4;
        this.pkg = editText;
        this.recv = textView;
    }

    @NonNull
    public static TestBroadcastBinding bind(@NonNull View view) {
        int i5 = R.id.btn_send_all;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_send_all);
        if (button != null) {
            i5 = R.id.btn_send_host;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.btn_send_host);
            if (button2 != null) {
                i5 = R.id.btn_send_vapp0;
                Button button3 = (Button) ViewBindings.findChildViewById(view, R.id.btn_send_vapp0);
                if (button3 != null) {
                    i5 = R.id.btn_send_vapp1;
                    Button button4 = (Button) ViewBindings.findChildViewById(view, R.id.btn_send_vapp1);
                    if (button4 != null) {
                        i5 = R.id.pkg;
                        EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.pkg);
                        if (editText != null) {
                            i5 = R.id.recv;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.recv);
                            if (textView != null) {
                                return new TestBroadcastBinding((LinearLayout) view, button, button2, button3, button4, editText, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i5)));
    }

    @NonNull
    public static TestBroadcastBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static TestBroadcastBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.test_broadcast, viewGroup, false);
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
