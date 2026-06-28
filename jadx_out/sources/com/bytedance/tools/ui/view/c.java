package com.bytedance.tools.ui.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.bytedance.tools.R;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class c extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private RadioGroup f6447a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f6448b;

    /* renamed from: c, reason: collision with root package name */
    private RadioButton f6449c;

    /* renamed from: d, reason: collision with root package name */
    protected LinearLayout f6450d;

    /* renamed from: e, reason: collision with root package name */
    protected com.bytedance.tools.c.b f6451e;

    /* renamed from: f, reason: collision with root package name */
    protected List<com.bytedance.tools.c.b> f6452f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.this.f6449c.setChecked(true);
            c.this.f6447a.check(c.this.getId());
        }
    }

    public c(Context context, RadioGroup radioGroup, com.bytedance.tools.c.b bVar, List<com.bytedance.tools.c.b> list) {
        super(context);
        View.inflate(context, R.layout.f5867l0, this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        b(radioGroup, bVar, list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(RadioGroup radioGroup, com.bytedance.tools.c.b bVar, List<com.bytedance.tools.c.b> list) {
        this.f6447a = radioGroup;
        this.f6448b = (TextView) findViewById(R.id.f5812u2);
        this.f6449c = (RadioButton) findViewById(R.id.f5800s2);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.f5806t2);
        this.f6450d = linearLayout;
        linearLayout.setVisibility(8);
        this.f6451e = bVar;
        this.f6452f = list;
        setOnClickListener(new a());
    }

    public abstract boolean d();

    public abstract com.bytedance.tools.c.b getConfigModel();

    public abstract String getImageMode();

    public void setChecked(boolean z4) {
        int i5;
        LinearLayout linearLayout = this.f6450d;
        if (z4) {
            i5 = 0;
        } else {
            i5 = 8;
        }
        linearLayout.setVisibility(i5);
        this.f6449c.setChecked(z4);
    }

    public void setTitle(String str) {
        this.f6448b.setText(str);
    }
}
