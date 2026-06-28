package com.bytedance.mtesttools.c;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.bytedance.tools.R;

/* loaded from: classes2.dex */
public class b extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    RadioGroup f4189a;

    /* renamed from: b, reason: collision with root package name */
    TextView f4190b;

    /* renamed from: c, reason: collision with root package name */
    TextView f4191c;

    /* renamed from: d, reason: collision with root package name */
    RadioButton f4192d;

    /* renamed from: e, reason: collision with root package name */
    RadioButton f4193e;

    /* renamed from: f, reason: collision with root package name */
    int f4194f;

    /* renamed from: g, reason: collision with root package name */
    d f4195g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements RadioGroup.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i5) {
            if (i5 == R.id.f5837z2) {
                b.this.f4194f = 2;
            } else if (i5 == R.id.f5817v2) {
                b.this.f4194f = 1;
            } else if (i5 == R.id.f5822w2) {
                b.this.f4194f = 3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bytedance.mtesttools.c.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class ViewOnClickListenerC0110b implements View.OnClickListener {
        ViewOnClickListenerC0110b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.this.dismiss();
            d dVar = b.this.f4195g;
            if (dVar != null) {
                dVar.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.this.dismiss();
            b bVar = b.this;
            d dVar = bVar.f4195g;
            if (dVar != null) {
                dVar.a(bVar.f4194f);
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface d {
        void a();

        void a(int i5);
    }

    public b(Context context, int i5, d dVar) {
        super(context);
        this.f4194f = 2;
        setContentView(R.layout.J0);
        this.f4195g = dVar;
        this.f4189a = (RadioGroup) findViewById(R.id.f5827x2);
        this.f4190b = (TextView) findViewById(R.id.f5792r0);
        this.f4191c = (TextView) findViewById(R.id.f5830y0);
        this.f4192d = (RadioButton) findViewById(R.id.f5817v2);
        this.f4193e = (RadioButton) findViewById(R.id.f5822w2);
        if (i5 == 7) {
            this.f4192d.setText("模版（模版2.0）");
            this.f4193e.setVisibility(8);
        } else {
            this.f4192d.setText("模板（含广点通1.0）");
            this.f4193e.setVisibility(0);
        }
        a();
    }

    private void a() {
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
        }
        setCanceledOnTouchOutside(false);
        this.f4189a.setOnCheckedChangeListener(new a());
        this.f4190b.setOnClickListener(new ViewOnClickListenerC0110b());
        this.f4191c.setOnClickListener(new c());
    }
}
