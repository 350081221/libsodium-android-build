package com.alipay.sdk.app;

import a1.e;
import a1.n;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.alipay.sdk.m.x.c;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;
import g0.d;
import java.lang.ref.WeakReference;
import y0.a;

@Instrumented
/* loaded from: classes2.dex */
public class H5PayActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    public c f2960a;

    /* renamed from: b, reason: collision with root package name */
    public String f2961b;

    /* renamed from: c, reason: collision with root package name */
    public String f2962c;

    /* renamed from: d, reason: collision with root package name */
    public String f2963d;

    /* renamed from: e, reason: collision with root package name */
    public String f2964e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2965f;

    /* renamed from: g, reason: collision with root package name */
    public String f2966g;

    /* renamed from: h, reason: collision with root package name */
    public WeakReference<y0.a> f2967h;

    private void b() {
        try {
            super.requestWindowFeature(1);
            getWindow().addFlags(8192);
        } catch (Throwable th) {
            e.d(th);
        }
    }

    public void a() {
        Object obj = PayTask.f2980h;
        synchronized (obj) {
            try {
                obj.notify();
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.app.Activity
    public void finish() {
        a();
        super.finish();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i5, int i6, Intent intent) {
        super.onActivityResult(i5, i6, intent);
        if (i5 == 1010) {
            d.a((y0.a) n.i(this.f2967h), i5, i6, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        c cVar = this.f2960a;
        if (cVar == null) {
            finish();
            return;
        }
        if (cVar.m()) {
            cVar.n();
            return;
        }
        if (!cVar.n()) {
            super.onBackPressed();
        }
        g0.b.c(g0.b.a());
        finish();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        TraceManager.startActivityTrace(getClass().getName());
        b();
        super.onCreate(bundle);
        try {
            y0.a a5 = a.C0667a.a(getIntent());
            if (a5 == null) {
                finish();
                AppInstrumentation.onActivityCreateEnd();
                return;
            }
            this.f2967h = new WeakReference<>(a5);
            if (!m0.a.J().F()) {
                setRequestedOrientation(1);
            } else {
                setRequestedOrientation(3);
            }
            try {
                Bundle extras = getIntent().getExtras();
                String string = extras.getString("url", null);
                this.f2961b = string;
                if (!n.Y(string)) {
                    finish();
                    AppInstrumentation.onActivityCreateEnd();
                    return;
                }
                this.f2963d = extras.getString("cookie", null);
                this.f2962c = extras.getString("method", null);
                this.f2964e = extras.getString(com.alipay.sdk.m.x.d.f3030v, null);
                this.f2966g = extras.getString("version", c.f3016c);
                this.f2965f = extras.getBoolean("backisexit", false);
                try {
                    com.alipay.sdk.m.x.d dVar = new com.alipay.sdk.m.x.d(this, a5, this.f2966g);
                    setContentView(dVar);
                    dVar.r(this.f2964e, this.f2962c, this.f2965f);
                    dVar.l(this.f2961b, this.f2963d);
                    dVar.k(this.f2961b);
                    this.f2960a = dVar;
                    AppInstrumentation.onActivityCreateEnd();
                } catch (Throwable th) {
                    i0.a.e(a5, i0.b.f16157l, "GetInstalledAppEx", th);
                    finish();
                    AppInstrumentation.onActivityCreateEnd();
                }
            } catch (Exception unused) {
                finish();
                AppInstrumentation.onActivityCreateEnd();
            }
        } catch (Exception unused2) {
            finish();
            AppInstrumentation.onActivityCreateEnd();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c cVar = this.f2960a;
        if (cVar != null) {
            cVar.o();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onRestart() {
        AppInstrumentation.onActivityRestartBegin(getClass().getName());
        super.onRestart();
        AppInstrumentation.onActivityRestartEnd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onResume() {
        AppInstrumentation.onActivityResumeBegin(getClass().getName());
        super.onResume();
        AppInstrumentation.onActivityResumeEnd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStart() {
        AppInstrumentation.onActivityStartBegin(getClass().getName());
        super.onStart();
        AppInstrumentation.onActivityStartEnd();
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i5) {
        try {
            super.setRequestedOrientation(i5);
        } catch (Throwable th) {
            try {
                i0.a.e((y0.a) n.i(this.f2967h), i0.b.f16157l, i0.b.B, th);
            } catch (Throwable unused) {
            }
        }
    }
}
