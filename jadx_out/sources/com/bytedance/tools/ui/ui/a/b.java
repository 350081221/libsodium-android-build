package com.bytedance.tools.ui.ui.a;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tools.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class b extends a {

    /* renamed from: l, reason: collision with root package name */
    private List<Pair<String, String>> f6392l;

    /* renamed from: m, reason: collision with root package name */
    private List<TextView> f6393m;

    public b(Context context) {
        super(context, R.layout.I);
        this.f6393m = new ArrayList();
    }

    private void e() {
        List<Pair<String, String>> list = this.f6392l;
        if (list != null && !list.isEmpty()) {
            LinearLayout linearLayout = (LinearLayout) a();
            if (linearLayout instanceof LinearLayout) {
                for (Pair<String, String> pair : this.f6392l) {
                    linearLayout.addView(g((String) pair.first, (String) pair.second), new LinearLayout.LayoutParams(-1, -2));
                }
            }
        }
    }

    private View g(String str, String str2) {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.L, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.f5836z1)).setText(str + ":");
        EditText editText = (EditText) inflate.findViewById(R.id.N4);
        if (str2 == null) {
            str2 = "";
        }
        editText.setText(str2);
        this.f6393m.add(editText);
        return inflate;
    }

    public void h(List<Pair<String, String>> list) {
        this.f6392l = list;
    }

    public String i() {
        String str;
        StringBuilder sb = new StringBuilder();
        for (TextView textView : this.f6393m) {
            if (textView.getText() != null) {
                str = textView.getText().toString().trim();
            } else {
                str = "";
            }
            sb.append(str);
            sb.append(",");
        }
        return sb.substring(0, sb.length() - 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.tools.ui.ui.a.a, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e();
    }

    @Override // com.bytedance.tools.ui.ui.a.a, android.app.Dialog
    public void show() {
        super.show();
    }
}
