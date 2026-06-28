package com.bytedance.tools.ui.ui.a;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.tools.R;

/* loaded from: classes2.dex */
public class a extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private ImageView f6379a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f6380b;

    /* renamed from: c, reason: collision with root package name */
    private Button f6381c;

    /* renamed from: d, reason: collision with root package name */
    private Button f6382d;

    /* renamed from: e, reason: collision with root package name */
    private View f6383e;

    /* renamed from: f, reason: collision with root package name */
    private int f6384f;

    /* renamed from: g, reason: collision with root package name */
    private int f6385g;

    /* renamed from: h, reason: collision with root package name */
    private String f6386h;

    /* renamed from: i, reason: collision with root package name */
    private String f6387i;

    /* renamed from: j, reason: collision with root package name */
    private String f6388j;

    /* renamed from: k, reason: collision with root package name */
    public c f6389k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tools.ui.ui.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class ViewOnClickListenerC0133a implements View.OnClickListener {
        ViewOnClickListenerC0133a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c cVar = a.this.f6389k;
            if (cVar != null) {
                cVar.a();
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
            c cVar = a.this.f6389k;
            if (cVar != null) {
                cVar.b();
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        void a();

        void b();
    }

    public a(Context context, int i5) {
        super(context, R.style.o6);
        this.f6385g = -1;
        this.f6384f = i5;
    }

    private void d() {
        this.f6382d.setOnClickListener(new ViewOnClickListenerC0133a());
        this.f6381c.setOnClickListener(new b());
    }

    private void e() {
        if (this.f6380b != null) {
            if (!TextUtils.isEmpty(this.f6386h)) {
                this.f6380b.setText(this.f6386h);
                this.f6380b.setVisibility(0);
            } else {
                this.f6380b.setVisibility(8);
            }
        }
        if (this.f6382d != null) {
            if (!TextUtils.isEmpty(this.f6387i)) {
                this.f6382d.setText(this.f6387i);
            } else {
                this.f6382d.setText("确定");
            }
        }
        if (this.f6381c != null) {
            if (!TextUtils.isEmpty(this.f6388j)) {
                this.f6381c.setText(this.f6388j);
            } else {
                this.f6381c.setText("取消");
            }
        }
        ImageView imageView = this.f6379a;
        if (imageView != null) {
            int i5 = this.f6385g;
            if (i5 != -1) {
                imageView.setImageResource(i5);
                this.f6379a.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
    }

    private void f() {
        this.f6381c = (Button) findViewById(R.id.S1);
        this.f6382d = (Button) findViewById(R.id.f5728g2);
        this.f6380b = (TextView) findViewById(R.id.Z3);
        this.f6379a = (ImageView) findViewById(R.id.f5727g1);
        if (this.f6384f > 0) {
            ViewStub viewStub = (ViewStub) findViewById(R.id.E0);
            viewStub.setLayoutResource(this.f6384f);
            this.f6383e = viewStub.inflate();
        }
    }

    public View a() {
        return this.f6383e;
    }

    public a b(c cVar) {
        this.f6389k = cVar;
        return this;
    }

    public a c(String str) {
        this.f6386h = str;
        return this;
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.G);
        setCanceledOnTouchOutside(false);
        f();
        e();
        d();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        e();
    }
}
