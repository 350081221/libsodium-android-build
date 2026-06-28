package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.concurrent.ConcurrentHashMap;
import y0.a;

@Instrumented
/* loaded from: classes2.dex */
public class APayEntranceActivity extends Activity {

    /* renamed from: d, reason: collision with root package name */
    public static final String f2946d = "ap_order_info";

    /* renamed from: e, reason: collision with root package name */
    public static final String f2947e = "ap_target_packagename";

    /* renamed from: f, reason: collision with root package name */
    public static final String f2948f = "ap_session";

    /* renamed from: g, reason: collision with root package name */
    public static final String f2949g = "ap_local_info";

    /* renamed from: h, reason: collision with root package name */
    public static final ConcurrentHashMap<String, a> f2950h = new ConcurrentHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    public String f2951a;

    /* renamed from: b, reason: collision with root package name */
    public String f2952b;

    /* renamed from: c, reason: collision with root package name */
    public y0.a f2953c;

    /* loaded from: classes2.dex */
    public interface a {
        void a(String str);
    }

    @Override // android.app.Activity
    public void finish() {
        String str = this.f2952b;
        i0.a.d(this.f2953c, i0.b.f16157l, "BSAFinish", str + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + TextUtils.isEmpty(this.f2951a));
        if (TextUtils.isEmpty(this.f2951a)) {
            this.f2951a = g0.b.a();
            y0.a aVar = this.f2953c;
            if (aVar != null) {
                aVar.l(true);
            }
        }
        if (str != null) {
            a remove = f2950h.remove(str);
            if (remove != null) {
                remove.a(this.f2951a);
            } else {
                i0.a.i(this.f2953c, "wr", "refNull", "session=" + str);
            }
        }
        try {
            super.finish();
        } catch (Throwable th) {
            i0.a.e(this.f2953c, "wr", "APStartFinish", th);
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i5, int i6, Intent intent) {
        super.onActivityResult(i5, i6, intent);
        i0.a.d(this.f2953c, i0.b.f16157l, "BSAOnAR", this.f2952b + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i5 + "," + i6);
        if (i5 == 1000) {
            if (intent != null) {
                try {
                    this.f2951a = intent.getStringExtra("result");
                } catch (Throwable unused) {
                }
            }
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        TraceManager.startActivityTrace(getClass().getName());
        super.onCreate(bundle);
        try {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                finish();
                AppInstrumentation.onActivityCreateEnd();
                return;
            }
            String string = extras.getString(f2946d);
            String string2 = extras.getString(f2947e);
            this.f2952b = extras.getString(f2948f);
            String string3 = extras.getString(f2949g, "{}");
            if (!TextUtils.isEmpty(this.f2952b)) {
                y0.a b5 = a.C0667a.b(this.f2952b);
                this.f2953c = b5;
                i0.a.d(b5, i0.b.f16157l, "BSAEntryCreate", this.f2952b + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + SystemClock.elapsedRealtime());
            }
            Intent intent = new Intent();
            intent.putExtra("order_info", string);
            intent.putExtra("localInfo", string3);
            intent.setClassName(string2, "com.alipay.android.app.flybird.ui.window.FlyBirdWindowActivity");
            try {
                startActivityForResult(intent, 1000);
            } catch (Throwable th) {
                i0.a.e(this.f2953c, "wr", "APStartEx", th);
                finish();
            }
            if (this.f2953c != null) {
                Context applicationContext = getApplicationContext();
                y0.a aVar = this.f2953c;
                i0.a.b(applicationContext, aVar, string, aVar.f22662d);
                this.f2953c.g(true);
            }
            AppInstrumentation.onActivityCreateEnd();
        } catch (Throwable unused) {
            finish();
            AppInstrumentation.onActivityCreateEnd();
        }
    }

    @Override // android.app.Activity
    protected void onRestart() {
        AppInstrumentation.onActivityRestartBegin(getClass().getName());
        super.onRestart();
        AppInstrumentation.onActivityRestartEnd();
    }

    @Override // android.app.Activity
    protected void onResume() {
        AppInstrumentation.onActivityResumeBegin(getClass().getName());
        super.onResume();
        AppInstrumentation.onActivityResumeEnd();
    }

    @Override // android.app.Activity
    protected void onStart() {
        AppInstrumentation.onActivityStartBegin(getClass().getName());
        super.onStart();
        AppInstrumentation.onActivityStartEnd();
    }
}
