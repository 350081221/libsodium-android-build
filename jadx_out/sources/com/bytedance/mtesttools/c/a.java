package com.bytedance.mtesttools.c;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.bytedance.tools.R;

/* loaded from: classes2.dex */
public class a extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    RadioGroup f4181a;

    /* renamed from: b, reason: collision with root package name */
    TextView f4182b;

    /* renamed from: c, reason: collision with root package name */
    TextView f4183c;

    /* renamed from: d, reason: collision with root package name */
    int f4184d;

    /* renamed from: e, reason: collision with root package name */
    d f4185e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bytedance.mtesttools.c.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0109a implements RadioGroup.OnCheckedChangeListener {
        C0109a() {
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i5) {
            if (i5 == R.id.A2) {
                a.this.f4184d = 1;
            } else if (i5 == R.id.f5832y2) {
                a.this.f4184d = 2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.dismiss();
            d dVar = a.this.f4185e;
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
            a.this.dismiss();
            a aVar = a.this;
            d dVar = aVar.f4185e;
            if (dVar != null) {
                dVar.a(aVar.f4184d);
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface d {
        void a();

        void a(int i5);
    }

    public a(Context context, d dVar) {
        super(context);
        this.f4184d = 1;
        setContentView(R.layout.I0);
        this.f4185e = dVar;
        this.f4181a = (RadioGroup) findViewById(R.id.f5827x2);
        this.f4182b = (TextView) findViewById(R.id.f5792r0);
        this.f4183c = (TextView) findViewById(R.id.f5830y0);
        a();
    }

    private void a() {
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
        }
        setCanceledOnTouchOutside(false);
        this.f4181a.setOnCheckedChangeListener(new C0109a());
        this.f4182b.setOnClickListener(new b());
        this.f4183c.setOnClickListener(new c());
    }
}
