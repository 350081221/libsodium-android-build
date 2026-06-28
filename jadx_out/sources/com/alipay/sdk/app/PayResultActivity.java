package com.alipay.sdk.app;

import a1.e;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import y0.a;

@Instrumented
/* loaded from: classes2.dex */
public final class PayResultActivity extends Activity {

    /* renamed from: b, reason: collision with root package name */
    public static final String f2968b = "{\"isLogin\":\"false\"}";

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap<String, Object> f2969c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    public static final String f2970d = "hk.alipay.wallet";

    /* renamed from: e, reason: collision with root package name */
    public static final String f2971e = "phonecashier.pay.hash";

    /* renamed from: f, reason: collision with root package name */
    public static final String f2972f = "orderSuffix";

    /* renamed from: g, reason: collision with root package name */
    public static final String f2973g = "externalPkgName";

    /* renamed from: h, reason: collision with root package name */
    public static final String f2974h = "phonecashier.pay.result";

    /* renamed from: i, reason: collision with root package name */
    public static final String f2975i = "phonecashier.pay.resultOrderHash";

    /* renamed from: a, reason: collision with root package name */
    public y0.a f2976a = null;

    /* loaded from: classes2.dex */
    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f2977a;

        public a(Activity activity) {
            this.f2977a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2977a.finish();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static volatile String f2978a;

        /* renamed from: b, reason: collision with root package name */
        public static volatile String f2979b;
    }

    public static void a(Activity activity, int i5) {
        new Handler().postDelayed(new a(activity), i5);
    }

    public static void b(Activity activity, String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            Intent intent = new Intent();
            try {
                intent.setPackage("hk.alipay.wallet");
                intent.setData(Uri.parse("alipayhk://platformapi/startApp?appId=20000125&schemePaySession=" + URLEncoder.encode(str, "UTF-8") + "&orderSuffix=" + URLEncoder.encode(str2, "UTF-8") + "&packageName=" + URLEncoder.encode(str3, "UTF-8") + "&externalPkgName=" + URLEncoder.encode(str3, "UTF-8")));
            } catch (UnsupportedEncodingException e5) {
                e.d(e5);
            }
            if (activity != null) {
                try {
                    activity.startActivity(intent);
                } catch (Throwable unused) {
                    activity.finish();
                }
            }
        }
    }

    public static void c(String str) {
        b.f2979b = g0.b.a();
        e(f2969c, str);
    }

    public static void d(String str, String str2) {
        b.f2979b = str;
        e(f2969c, str2);
    }

    public static boolean e(HashMap<String, Object> hashMap, String str) {
        Object obj;
        if (hashMap == null || str == null || (obj = hashMap.get(str)) == null) {
            return false;
        }
        synchronized (obj) {
            obj.notifyAll();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        TraceManager.startActivityTrace(PayResultActivity.class.getName());
        super.onCreate(bundle);
        try {
            Intent intent = getIntent();
            if (!TextUtils.isEmpty(intent.getStringExtra(f2972f))) {
                b.f2978a = intent.getStringExtra(f2971e);
                String stringExtra = intent.getStringExtra(f2972f);
                String stringExtra2 = intent.getStringExtra(f2973g);
                y0.a a5 = a.C0667a.a(intent);
                this.f2976a = a5;
                if (a5 == null) {
                    finish();
                }
                b(this, b.f2978a, stringExtra, stringExtra2);
                a(this, 300);
                AppInstrumentation.onActivityCreateEnd();
                return;
            }
            if (this.f2976a == null) {
                finish();
            }
            String stringExtra3 = intent.getStringExtra(f2974h);
            int intExtra = intent.getIntExtra(f2975i, 0);
            if (intExtra != 0 && TextUtils.equals(b.f2978a, String.valueOf(intExtra))) {
                if (!TextUtils.isEmpty(stringExtra3)) {
                    d(stringExtra3, b.f2978a);
                } else {
                    c(b.f2978a);
                }
                b.f2978a = "";
                a(this, 300);
                AppInstrumentation.onActivityCreateEnd();
                return;
            }
            i0.a.i(this.f2976a, i0.b.f16157l, i0.b.f16158l0, "Expected " + b.f2978a + ", got " + intExtra);
            c(b.f2978a);
            a(this, 300);
            AppInstrumentation.onActivityCreateEnd();
        } catch (Throwable unused) {
            finish();
            AppInstrumentation.onActivityCreateEnd();
        }
    }

    @Override // android.app.Activity
    protected void onRestart() {
        AppInstrumentation.onActivityRestartBegin(PayResultActivity.class.getName());
        super.onRestart();
        AppInstrumentation.onActivityRestartEnd();
    }

    @Override // android.app.Activity
    protected void onResume() {
        AppInstrumentation.onActivityResumeBegin(PayResultActivity.class.getName());
        super.onResume();
        AppInstrumentation.onActivityResumeEnd();
    }

    @Override // android.app.Activity
    protected void onStart() {
        AppInstrumentation.onActivityStartBegin(PayResultActivity.class.getName());
        super.onStart();
        AppInstrumentation.onActivityStartEnd();
    }
}
