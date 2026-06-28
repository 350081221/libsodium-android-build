package com.alipay.sdk.app;

import a1.e;
import a1.n;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.analytics.AnalyticsConfig;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import m0.a;
import org.json.JSONException;
import org.json.JSONObject;
import y0.a;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final Map<String, InterfaceC0096b> f3000e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public static long f3001f = -1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f3002g = 9000;

    /* renamed from: h, reason: collision with root package name */
    public static final int f3003h = 5000;

    /* renamed from: i, reason: collision with root package name */
    public static final int f3004i = 4001;

    /* renamed from: j, reason: collision with root package name */
    public static final int f3005j = 4000;

    /* renamed from: k, reason: collision with root package name */
    public static final int f3006k = 122;

    /* renamed from: b, reason: collision with root package name */
    public final Activity f3008b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0096b f3009c;

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f3007a = false;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f3010d = new Handler(Looper.getMainLooper());

    /* loaded from: classes2.dex */
    public enum a {
        Invoice("20000920"),
        AccountAuth("20000067"),
        Deduct("60000157");

        public String appId;

        a(String str) {
            this.appId = str;
        }
    }

    /* renamed from: com.alipay.sdk.app.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0096b {
        void a(int i5, String str, Bundle bundle);
    }

    /* loaded from: classes2.dex */
    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3011a;

        static {
            int[] iArr = new int[a.values().length];
            f3011a = iArr;
            try {
                iArr[a.Deduct.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3011a[a.AccountAuth.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3011a[a.Invoice.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final int f3012a;

        /* renamed from: b, reason: collision with root package name */
        public final String f3013b;

        /* renamed from: c, reason: collision with root package name */
        public final Bundle f3014c;

        public /* synthetic */ d(b bVar, int i5, String str, Bundle bundle, c cVar) {
            this(i5, str, bundle);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f3009c != null) {
                b.this.f3009c.a(this.f3012a, this.f3013b, this.f3014c);
            }
        }

        public d(int i5, String str, Bundle bundle) {
            this.f3012a = i5;
            this.f3013b = str;
            this.f3014c = bundle;
        }
    }

    public b(Activity activity) {
        this.f3008b = activity;
        y0.b.e().b(activity);
    }

    private String b(long j5, String str, a aVar, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AnalyticsConfig.RTD_START_TIME, String.valueOf(j5));
        jSONObject.put(com.umeng.analytics.pro.d.aC, str);
        jSONObject.put("package", this.f3008b.getPackageName());
        if (aVar != null) {
            jSONObject.put("appId", aVar.appId);
        }
        jSONObject.put("sdkVersion", "h.a.3.8.17");
        jSONObject.put("mqpURL", str2);
        return Base64.encodeToString(jSONObject.toString().getBytes(Charset.forName("UTF-8")), 2);
    }

    private String c(a aVar, Map<String, String> map) {
        if (aVar != null) {
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme("alipays").authority("platformapi").path("startapp").appendQueryParameter("appId", aVar.appId);
            if (c.f3011a[aVar.ordinal()] == 1) {
                appendQueryParameter.appendQueryParameter("appClearTop", "false").appendQueryParameter("startMultApp", "YES");
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                appendQueryParameter.appendQueryParameter(entry.getKey(), entry.getValue());
            }
            return appendQueryParameter.build().toString();
        }
        throw new RuntimeException("missing bizType");
    }

    public static void d(String str, int i5, String str2, Bundle bundle) {
        InterfaceC0096b remove = f3000e.remove(str);
        if (remove != null) {
            try {
                remove.a(i5, str2, bundle);
            } catch (Throwable th) {
                e.d(th);
            }
        }
    }

    private boolean e(y0.a aVar, String str, a aVar2, Map<String, String> map, boolean z4) {
        PackageInfo packageInfo;
        String str2;
        if (this.f3007a) {
            this.f3010d.post(new d(this, 4000, "该 OpenAuthTask 已在执行", null, null));
            return true;
        }
        this.f3007a = true;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - f3001f <= a1.b.f90a) {
            this.f3010d.post(new d(this, f3003h, "3s 内重复支付", null, null));
            return true;
        }
        f3001f = elapsedRealtime;
        g0.a.b("");
        String j5 = n.j(32);
        HashMap hashMap = new HashMap(map);
        hashMap.put("mqpPkgName", this.f3008b.getPackageName());
        hashMap.put("mqpScene", com.umeng.ccg.a.f12839r);
        List<a.b> t5 = m0.a.J().t();
        if (!m0.a.J().f20771g || t5 == null) {
            t5 = g0.a.f16089d;
        }
        n.c f5 = n.f(aVar, this.f3008b, t5);
        if (f5 != null && !f5.b(aVar) && !f5.a() && (packageInfo = f5.f163a) != null) {
            try {
                if (packageInfo.versionCode >= 122) {
                    try {
                        HashMap<String, String> f6 = y0.a.f(aVar);
                        f6.put("ts_scheme", String.valueOf(SystemClock.elapsedRealtime()));
                        hashMap.put("mqpLoc", new JSONObject(f6).toString());
                    } catch (Throwable th) {
                        i0.a.e(aVar, i0.b.f16157l, "OpenAuthLocEx", th);
                    }
                    String c5 = c(aVar2, hashMap);
                    f3000e.put(j5, this.f3009c);
                    try {
                        str2 = b(elapsedRealtime, j5, aVar2, c5);
                    } catch (JSONException e5) {
                        i0.a.e(aVar, i0.b.f16157l, i0.b.f16168q0, e5);
                        str2 = null;
                    }
                    if (TextUtils.isEmpty(str2)) {
                        this.f3010d.post(new d(this, 4000, "参数错误", null, null));
                        return true;
                    }
                    Intent intent = new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("alipays").authority("platformapi").path("startapp").appendQueryParameter("appId", "20001129").appendQueryParameter("payload", str2).build());
                    intent.addFlags(268435456);
                    intent.setPackage(f5.f163a.packageName);
                    try {
                        i0.a.d(aVar, i0.b.f16157l, i0.b.Y, "" + elapsedRealtime);
                        a.C0667a.d(aVar, j5);
                        this.f3008b.startActivity(intent);
                    } catch (Throwable th2) {
                        i0.a.e(aVar, i0.b.f16157l, "StartWalletEx", th2);
                    }
                    return false;
                }
            } catch (Throwable unused) {
                this.f3010d.post(new d(this, 4000, "业务参数错误", null, null));
                return true;
            }
        }
        if (z4) {
            hashMap.put("mqpScheme", String.valueOf(str));
            hashMap.put("mqpNotifyName", j5);
            hashMap.put("mqpScene", "landing");
            String c6 = c(aVar2, hashMap);
            Intent intent2 = new Intent(this.f3008b, (Class<?>) H5OpenAuthActivity.class);
            intent2.putExtra("url", String.format("https://render.alipay.com/p/s/i?scheme=%s", Uri.encode(c6)));
            a.C0667a.c(aVar, intent2);
            this.f3008b.startActivity(intent2);
            return false;
        }
        this.f3010d.post(new d(this, 4001, "支付宝未安装或签名错误", null, null));
        return true;
    }

    public void f(String str, a aVar, Map<String, String> map, InterfaceC0096b interfaceC0096b, boolean z4) {
        y0.a aVar2 = new y0.a(this.f3008b, String.valueOf(map), "oa-" + aVar);
        this.f3009c = interfaceC0096b;
        if (e(aVar2, str, aVar, map, z4)) {
            i0.a.h(this.f3008b, aVar2, "", aVar2.f22662d);
        }
    }
}
