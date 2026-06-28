package com.ss.android.downloadlib.addownload.compliance;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.gromore.R;
import com.ss.android.downloadlib.addownload.compliance.d;
import com.ss.android.downloadlib.addownload.k;
import com.ss.android.downloadlib.g.m;
import com.ss.android.downloadlib.guide.install.ClipImageView;

/* loaded from: classes3.dex */
public class a extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private TextView f9712a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f9713b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f9714c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f9715d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f9716e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f9717f;

    /* renamed from: g, reason: collision with root package name */
    private ClipImageView f9718g;

    /* renamed from: h, reason: collision with root package name */
    private LinearLayout f9719h;

    /* renamed from: i, reason: collision with root package name */
    private Activity f9720i;

    /* renamed from: j, reason: collision with root package name */
    private final long f9721j;

    /* renamed from: k, reason: collision with root package name */
    private long f9722k;

    /* renamed from: l, reason: collision with root package name */
    private final com.ss.android.downloadlib.addownload.b.b f9723l;

    public a(@NonNull Activity activity, long j5) {
        super(activity);
        this.f9720i = activity;
        this.f9721j = j5;
        this.f9723l = c.a().get(Long.valueOf(j5));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        com.ss.android.socialbase.appdownloader.c.a(this.f9720i);
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f9723l == null) {
            dismiss();
            return;
        }
        requestWindowFeature(1);
        setContentView(R.layout.Z);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(R.drawable.W0);
        }
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        this.f9722k = this.f9723l.f9632b;
        a();
        g.b("lp_app_dialog_show", this.f9722k);
        setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.ss.android.downloadlib.addownload.compliance.a.1
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                g.a("lp_app_dialog_cancel", a.this.f9722k);
            }
        });
    }

    private void a() {
        this.f9712a = (TextView) findViewById(R.id.H1);
        this.f9713b = (TextView) findViewById(R.id.J1);
        this.f9714c = (TextView) findViewById(R.id.G1);
        this.f9715d = (TextView) findViewById(R.id.F1);
        this.f9716e = (TextView) findViewById(R.id.I1);
        this.f9717f = (TextView) findViewById(R.id.L1);
        this.f9718g = (ClipImageView) findViewById(R.id.f3528b0);
        this.f9719h = (LinearLayout) findViewById(R.id.f3558l0);
        this.f9712a.setText(m.a(this.f9723l.f9635e, "--"));
        this.f9713b.setText("版本号：" + m.a(this.f9723l.f9636f, "--"));
        this.f9714c.setText("开发者：" + m.a(this.f9723l.f9637g, "应用信息正在完善中"));
        this.f9718g.setRoundRadius(m.a(k.a(), 8.0f));
        this.f9718g.setBackgroundColor(Color.parseColor("#EBEBEB"));
        d.a().a(this.f9721j, new d.a() { // from class: com.ss.android.downloadlib.addownload.compliance.a.2
            @Override // com.ss.android.downloadlib.addownload.compliance.d.a
            public void a(Bitmap bitmap) {
                if (bitmap != null) {
                    a.this.f9718g.setImageBitmap(bitmap);
                } else {
                    g.a(8, a.this.f9722k);
                }
            }
        });
        this.f9715d.setOnClickListener(new View.OnClickListener() { // from class: com.ss.android.downloadlib.addownload.compliance.a.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                b.a().a(a.this.f9720i);
                AppDetailInfoActivity.a(a.this.f9720i, a.this.f9721j);
                g.a("lp_app_dialog_click_detail", a.this.f9722k);
            }
        });
        this.f9716e.setOnClickListener(new View.OnClickListener() { // from class: com.ss.android.downloadlib.addownload.compliance.a.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                b.a().a(a.this.f9720i);
                AppPrivacyPolicyActivity.a(a.this.f9720i, a.this.f9721j);
                g.a("lp_app_dialog_click_privacy", a.this.f9722k);
            }
        });
        this.f9717f.setOnClickListener(new View.OnClickListener() { // from class: com.ss.android.downloadlib.addownload.compliance.a.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                a.this.dismiss();
                g.a("lp_app_dialog_click_giveup", a.this.f9722k);
            }
        });
        this.f9719h.setOnClickListener(new View.OnClickListener() { // from class: com.ss.android.downloadlib.addownload.compliance.a.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                g.a("lp_app_dialog_click_download", a.this.f9722k);
                b.a().b(a.this.f9722k);
                a.this.dismiss();
            }
        });
    }
}
