package com.ss.android.downloadlib.addownload.a;

import android.app.Activity;
import android.app.Dialog;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.gromore.R;

/* loaded from: classes3.dex */
public class e extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private TextView f9595a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f9596b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f9597c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f9598d;

    /* renamed from: e, reason: collision with root package name */
    private d f9599e;

    /* renamed from: f, reason: collision with root package name */
    private c f9600f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f9601g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f9602h;

    /* renamed from: i, reason: collision with root package name */
    private Activity f9603i;

    /* renamed from: j, reason: collision with root package name */
    private String f9604j;

    /* renamed from: k, reason: collision with root package name */
    private String f9605k;

    /* renamed from: l, reason: collision with root package name */
    private String f9606l;

    /* renamed from: m, reason: collision with root package name */
    private String f9607m;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private Activity f9611a;

        /* renamed from: b, reason: collision with root package name */
        private String f9612b;

        /* renamed from: c, reason: collision with root package name */
        private String f9613c;

        /* renamed from: d, reason: collision with root package name */
        private String f9614d;

        /* renamed from: e, reason: collision with root package name */
        private String f9615e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f9616f;

        /* renamed from: g, reason: collision with root package name */
        private d f9617g;

        /* renamed from: h, reason: collision with root package name */
        private c f9618h;

        public a(Activity activity) {
            this.f9611a = activity;
        }

        public a a(String str) {
            this.f9612b = str;
            return this;
        }

        public a b(String str) {
            this.f9613c = str;
            return this;
        }

        public a c(String str) {
            this.f9614d = str;
            return this;
        }

        public a d(String str) {
            this.f9615e = str;
            return this;
        }

        public a a(boolean z4) {
            this.f9616f = z4;
            return this;
        }

        public a a(d dVar) {
            this.f9617g = dVar;
            return this;
        }

        public a a(c cVar) {
            this.f9618h = cVar;
            return this;
        }

        public e a() {
            return new e(this.f9611a, this.f9612b, this.f9613c, this.f9614d, this.f9615e, this.f9616f, this.f9617g, this.f9618h);
        }
    }

    public e(@NonNull Activity activity, String str, String str2, String str3, String str4, boolean z4, @NonNull d dVar, c cVar) {
        super(activity, R.style.m6);
        this.f9603i = activity;
        this.f9599e = dVar;
        this.f9604j = str;
        this.f9605k = str2;
        this.f9606l = str3;
        this.f9607m = str4;
        this.f9600f = cVar;
        setCanceledOnTouchOutside(z4);
        d();
    }

    private void d() {
        setContentView(LayoutInflater.from(this.f9603i.getApplicationContext()).inflate(a(), (ViewGroup) null));
        this.f9595a = (TextView) findViewById(b());
        this.f9596b = (TextView) findViewById(c());
        this.f9597c = (TextView) findViewById(R.id.f3567o0);
        this.f9598d = (TextView) findViewById(R.id.N);
        if (!TextUtils.isEmpty(this.f9605k)) {
            this.f9595a.setText(this.f9605k);
        }
        if (!TextUtils.isEmpty(this.f9606l)) {
            this.f9596b.setText(this.f9606l);
        }
        if (!TextUtils.isEmpty(this.f9607m)) {
            this.f9598d.setText(this.f9607m);
        } else {
            this.f9598d.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.f9604j)) {
            this.f9597c.setText(this.f9604j);
        }
        this.f9595a.setOnClickListener(new View.OnClickListener() { // from class: com.ss.android.downloadlib.addownload.a.e.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                e.this.e();
            }
        });
        this.f9596b.setOnClickListener(new View.OnClickListener() { // from class: com.ss.android.downloadlib.addownload.a.e.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                e.this.g();
            }
        });
        this.f9598d.setOnClickListener(new View.OnClickListener() { // from class: com.ss.android.downloadlib.addownload.a.e.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                e.this.f();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        this.f9601g = true;
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f9602h = true;
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        dismiss();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        if (!this.f9603i.isFinishing()) {
            this.f9603i.finish();
        }
        if (this.f9601g) {
            this.f9599e.a();
        } else if (this.f9602h) {
            this.f9600f.a();
        } else {
            this.f9599e.b();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public int a() {
        return R.layout.f3608a0;
    }

    public int b() {
        return R.id.F;
    }

    public int c() {
        return R.id.C;
    }
}
