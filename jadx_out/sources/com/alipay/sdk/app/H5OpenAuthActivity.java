package com.alipay.sdk.app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;
import y0.a;

@Instrumented
/* loaded from: classes2.dex */
public class H5OpenAuthActivity extends H5PayActivity {

    /* renamed from: i, reason: collision with root package name */
    public boolean f2959i = false;

    @Override // com.alipay.sdk.app.H5PayActivity
    public void a() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.alipay.sdk.app.H5PayActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        TraceManager.startActivityTrace(getClass().getName());
        super.onCreate(bundle);
        AppInstrumentation.onActivityCreateEnd();
    }

    @Override // com.alipay.sdk.app.H5PayActivity, android.app.Activity
    public void onDestroy() {
        if (this.f2959i) {
            try {
                y0.a a5 = a.C0667a.a(getIntent());
                if (a5 != null) {
                    i0.a.h(this, a5, "", a5.f22662d);
                }
            } catch (Throwable unused) {
            }
        }
        super.onDestroy();
    }

    @Override // com.alipay.sdk.app.H5PayActivity, android.app.Activity
    protected void onRestart() {
        AppInstrumentation.onActivityRestartBegin(getClass().getName());
        super.onRestart();
        AppInstrumentation.onActivityRestartEnd();
    }

    @Override // com.alipay.sdk.app.H5PayActivity, android.app.Activity
    protected void onResume() {
        AppInstrumentation.onActivityResumeBegin(getClass().getName());
        super.onResume();
        AppInstrumentation.onActivityResumeEnd();
    }

    @Override // com.alipay.sdk.app.H5PayActivity, android.app.Activity
    protected void onStart() {
        AppInstrumentation.onActivityStartBegin(getClass().getName());
        super.onStart();
        AppInstrumentation.onActivityStartEnd();
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        String str;
        Uri uri;
        try {
            y0.a a5 = a.C0667a.a(intent);
            try {
                super.startActivity(intent);
                if (intent != null) {
                    uri = intent.getData();
                } else {
                    uri = null;
                }
                if (uri != null && uri.toString().startsWith("alipays://platformapi/startapp")) {
                    finish();
                }
            } catch (Throwable th) {
                if (intent != null && intent.getData() != null) {
                    str = intent.getData().toString();
                } else {
                    str = "null";
                }
                if (a5 != null) {
                    i0.a.f(a5, i0.b.f16157l, i0.b.f16166p0, th, str);
                }
                this.f2959i = true;
                throw th;
            }
        } catch (Throwable unused) {
            finish();
        }
    }
}
