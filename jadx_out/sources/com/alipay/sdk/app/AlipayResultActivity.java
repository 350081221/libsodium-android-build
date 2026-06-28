package com.alipay.sdk.app;

import a1.l;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.umeng.analytics.pro.d;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import y0.a;

@Instrumented
/* loaded from: classes2.dex */
public class AlipayResultActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap<String, a> f2954a = new ConcurrentHashMap<>();

    /* loaded from: classes2.dex */
    public interface a {
        void a(int i5, String str, String str2);
    }

    private void a(String str, Bundle bundle) {
        a remove = f2954a.remove(str);
        if (remove == null) {
            return;
        }
        try {
            remove.a(bundle.getInt("endCode"), bundle.getString(l.f147b), bundle.getString("result"));
        } finally {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        Intent intent;
        String stringExtra;
        Bundle bundleExtra;
        String stringExtra2;
        y0.a b5;
        Throwable th;
        TraceManager.startActivityTrace(getClass().getName());
        super.onCreate(bundle);
        try {
            intent = getIntent();
            try {
                stringExtra = intent.getStringExtra(d.aC);
                bundleExtra = intent.getBundleExtra("result");
                stringExtra2 = intent.getStringExtra("scene");
                b5 = a.C0667a.b(stringExtra);
            } catch (Throwable th2) {
                i0.a.e(null, i0.b.f16157l, "BSPSerError", th2);
                i0.a.e(null, i0.b.f16157l, i0.b.f16170r0, th2);
                finish();
                AppInstrumentation.onActivityCreateEnd();
                return;
            }
        } catch (Throwable unused) {
            finish();
        }
        if (b5 == null) {
            finish();
            AppInstrumentation.onActivityCreateEnd();
            return;
        }
        i0.a.d(b5, i0.b.f16157l, "BSPSession", stringExtra + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + SystemClock.elapsedRealtime());
        if (TextUtils.equals("mqpSchemePay", stringExtra2)) {
            a(stringExtra, bundleExtra);
            AppInstrumentation.onActivityCreateEnd();
            return;
        }
        if ((TextUtils.isEmpty(stringExtra) || bundleExtra == null) && intent.getData() != null) {
            try {
                JSONObject jSONObject = new JSONObject(new String(Base64.decode(intent.getData().getQuery(), 2), "UTF-8"));
                JSONObject jSONObject2 = jSONObject.getJSONObject("result");
                stringExtra = jSONObject.getString(d.aC);
                i0.a.d(b5, i0.b.f16157l, "BSPUriSession", stringExtra);
                Bundle bundle2 = new Bundle();
                try {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        bundle2.putString(next, jSONObject2.getString(next));
                    }
                    bundleExtra = bundle2;
                } catch (Throwable th3) {
                    th = th3;
                    bundleExtra = bundle2;
                    i0.a.e(b5, i0.b.f16157l, "BSPResEx", th);
                    i0.a.e(b5, i0.b.f16157l, i0.b.f16172s0, th);
                    if (TextUtils.isEmpty(stringExtra)) {
                    }
                    i0.a.h(this, b5, "", b5.f22662d);
                    finish();
                    AppInstrumentation.onActivityCreateEnd();
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        if (TextUtils.isEmpty(stringExtra) && bundleExtra != null) {
            try {
                i0.a.d(b5, i0.b.f16157l, i0.b.V, "" + SystemClock.elapsedRealtime());
                i0.a.d(b5, i0.b.f16157l, i0.b.W, bundleExtra.getInt("endCode", -1) + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + bundleExtra.getString(l.f147b, "-"));
                b.d(stringExtra, 9000, "OK", bundleExtra);
                i0.a.h(this, b5, "", b5.f22662d);
                finish();
            } catch (Throwable th5) {
                i0.a.h(this, b5, "", b5.f22662d);
                finish();
                AppInstrumentation.onActivityCreateEnd();
                throw th5;
            }
        } else {
            i0.a.h(this, b5, "", b5.f22662d);
            finish();
        }
        AppInstrumentation.onActivityCreateEnd();
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
