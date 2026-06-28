package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.process.UMProcessDBHelper;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.common.ReportPolicy;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.statistics.internal.StatTracer;
import com.umeng.commonsdk.statistics.noise.ABTest;
import com.umeng.commonsdk.statistics.noise.Defcon;
import com.umeng.commonsdk.utils.JSONArraySortUtil;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.umcrash.UMCrashUtils;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private static Context f12665a = null;

    /* renamed from: l, reason: collision with root package name */
    private static final String f12666l = "first_activate_time";

    /* renamed from: m, reason: collision with root package name */
    private static final String f12667m = "ana_is_f";

    /* renamed from: n, reason: collision with root package name */
    private static final String f12668n = "thtstart";

    /* renamed from: o, reason: collision with root package name */
    private static final String f12669o = "dstk_last_time";

    /* renamed from: p, reason: collision with root package name */
    private static final String f12670p = "dstk_cnt";

    /* renamed from: q, reason: collision with root package name */
    private static final String f12671q = "gkvc";

    /* renamed from: r, reason: collision with root package name */
    private static final String f12672r = "ekvc";

    /* renamed from: t, reason: collision with root package name */
    private static final String f12673t = "-1";

    /* renamed from: x, reason: collision with root package name */
    private static final String f12674x = "com.umeng.umcrash.UMCrashUtils";

    /* renamed from: y, reason: collision with root package name */
    private static Class<?> f12675y;

    /* renamed from: z, reason: collision with root package name */
    private static Method f12676z;

    /* renamed from: b, reason: collision with root package name */
    private c f12677b;

    /* renamed from: c, reason: collision with root package name */
    private SharedPreferences f12678c;

    /* renamed from: d, reason: collision with root package name */
    private String f12679d;

    /* renamed from: e, reason: collision with root package name */
    private String f12680e;

    /* renamed from: f, reason: collision with root package name */
    private int f12681f;

    /* renamed from: g, reason: collision with root package name */
    private JSONArray f12682g;

    /* renamed from: h, reason: collision with root package name */
    private final int f12683h;

    /* renamed from: i, reason: collision with root package name */
    private int f12684i;

    /* renamed from: j, reason: collision with root package name */
    private int f12685j;

    /* renamed from: k, reason: collision with root package name */
    private long f12686k;

    /* renamed from: s, reason: collision with root package name */
    private final long f12687s;

    /* renamed from: u, reason: collision with root package name */
    private boolean f12688u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f12689v;

    /* renamed from: w, reason: collision with root package name */
    private Object f12690w;

    /* loaded from: classes3.dex */
    public static class a {
        public static final int A = 8209;
        public static final int B = 8210;
        public static final int C = 8211;
        public static final int D = 8212;
        public static final int E = 8213;
        public static final int F = 8214;
        public static final int G = 8215;

        /* renamed from: a, reason: collision with root package name */
        public static final int f12691a = 4097;

        /* renamed from: b, reason: collision with root package name */
        public static final int f12692b = 4098;

        /* renamed from: c, reason: collision with root package name */
        public static final int f12693c = 4099;

        /* renamed from: d, reason: collision with root package name */
        public static final int f12694d = 4100;

        /* renamed from: e, reason: collision with root package name */
        public static final int f12695e = 4101;

        /* renamed from: f, reason: collision with root package name */
        public static final int f12696f = 4102;

        /* renamed from: g, reason: collision with root package name */
        public static final int f12697g = 4103;

        /* renamed from: h, reason: collision with root package name */
        public static final int f12698h = 4104;

        /* renamed from: i, reason: collision with root package name */
        public static final int f12699i = 4105;

        /* renamed from: j, reason: collision with root package name */
        public static final int f12700j = 4106;

        /* renamed from: k, reason: collision with root package name */
        public static final int f12701k = 4352;

        /* renamed from: l, reason: collision with root package name */
        public static final int f12702l = 4353;

        /* renamed from: m, reason: collision with root package name */
        public static final int f12703m = 4354;

        /* renamed from: n, reason: collision with root package name */
        public static final int f12704n = 4355;

        /* renamed from: o, reason: collision with root package name */
        public static final int f12705o = 4356;

        /* renamed from: p, reason: collision with root package name */
        public static final int f12706p = 4357;

        /* renamed from: q, reason: collision with root package name */
        public static final int f12707q = 4358;

        /* renamed from: r, reason: collision with root package name */
        public static final int f12708r = 8193;

        /* renamed from: s, reason: collision with root package name */
        public static final int f12709s = 8194;

        /* renamed from: t, reason: collision with root package name */
        public static final int f12710t = 8195;

        /* renamed from: u, reason: collision with root package name */
        public static final int f12711u = 8196;

        /* renamed from: v, reason: collision with root package name */
        public static final int f12712v = 8197;

        /* renamed from: w, reason: collision with root package name */
        public static final int f12713w = 8199;

        /* renamed from: x, reason: collision with root package name */
        public static final int f12714x = 8200;

        /* renamed from: y, reason: collision with root package name */
        public static final int f12715y = 8201;

        /* renamed from: z, reason: collision with root package name */
        public static final int f12716z = 8208;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final o f12717a = new o();

        private b() {
        }
    }

    static {
        h();
    }

    public static o a(Context context) {
        if (f12665a == null && context != null) {
            f12665a = context.getApplicationContext();
        }
        return b.f12717a;
    }

    private void b(JSONObject jSONObject) {
        JSONObject f5;
        if (i.a(UMGlobalContext.getAppContext(f12665a)).c() || (f5 = i.a(UMGlobalContext.getAppContext(f12665a)).f()) == null) {
            return;
        }
        String optString = f5.optString("__av");
        String optString2 = f5.optString("__vc");
        try {
            if (TextUtils.isEmpty(optString)) {
                jSONObject.put(com.umeng.commonsdk.statistics.b.a("app_version"), UMUtils.getAppVersionName(f12665a));
            } else {
                jSONObject.put(com.umeng.commonsdk.statistics.b.a("app_version"), optString);
            }
            if (TextUtils.isEmpty(optString2)) {
                jSONObject.put(com.umeng.commonsdk.statistics.b.a("version_code"), UMUtils.getAppVersionCode(f12665a));
            } else {
                jSONObject.put(com.umeng.commonsdk.statistics.b.a("version_code"), optString2);
            }
        } catch (Throwable unused) {
        }
    }

    private void e(Object obj) {
        try {
            JSONObject jSONObject = (JSONObject) obj;
            if (2050 == jSONObject.getInt("__t")) {
                if (!a(this.f12686k, this.f12684i)) {
                    return;
                } else {
                    this.f12684i++;
                }
            } else if (2049 == jSONObject.getInt("__t")) {
                if (!a(this.f12686k, this.f12685j)) {
                    return;
                } else {
                    this.f12685j++;
                }
            }
            if (AnalyticsConfig.isRealTimeDebugMode()) {
                if (this.f12682g == null) {
                    this.f12682g = new JSONArray();
                }
                this.f12682g.put(jSONObject);
                i.a(f12665a).a(this.f12682g);
                this.f12682g = new JSONArray();
                return;
            }
            if (this.f12682g.length() >= this.f12681f) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>>*** 超过10个事件，事件落库。");
                i.a(f12665a).a(this.f12682g);
                this.f12682g = new JSONArray();
            }
            if (this.f12686k == 0) {
                this.f12686k = System.currentTimeMillis();
            }
            this.f12682g.put(jSONObject);
        } catch (Throwable th) {
            MLog.e(th);
        }
    }

    private void f(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        try {
            if (jSONObject.getJSONObject(com.umeng.commonsdk.statistics.b.a("header")).has(com.umeng.analytics.pro.d.aH)) {
                if (jSONObject.has("content")) {
                    jSONObject = jSONObject.getJSONObject("content");
                }
                if (jSONObject.has(com.umeng.commonsdk.statistics.b.a("analytics"))) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(com.umeng.commonsdk.statistics.b.a("analytics"));
                    if (jSONObject2.has(com.umeng.analytics.pro.d.f12492n) && (optJSONObject2 = jSONObject2.getJSONArray(com.umeng.analytics.pro.d.f12492n).optJSONObject(0)) != null) {
                        String optString = optJSONObject2.optString("id");
                        if (!TextUtils.isEmpty(optString)) {
                            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> removeAllInstantData: really delete instant session data");
                            i.a(f12665a).b(optString);
                        }
                    }
                }
                i.a(f12665a).b();
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> removeAllInstantData: send INSTANT_SESSION_START_CONTINUE event because OVERSIZE.");
                Context context = f12665a;
                UMWorkDispatch.sendEvent(context, a.f12702l, CoreProtocol.getInstance(context), null);
                return;
            }
            if (jSONObject.has("content")) {
                jSONObject = jSONObject.getJSONObject("content");
            }
            if (jSONObject.has(com.umeng.commonsdk.statistics.b.a("analytics")) && (optJSONObject = jSONObject.optJSONObject(com.umeng.commonsdk.statistics.b.a("analytics"))) != null && optJSONObject.length() > 0 && optJSONObject.has(com.umeng.analytics.pro.d.f12492n)) {
                i.a(f12665a).a(true, false);
            }
            i.a(f12665a).b();
        } catch (Exception unused) {
        }
    }

    private static void h() {
        try {
            f12675y = UMCrashUtils.class;
            Method declaredMethod = UMCrashUtils.class.getDeclaredMethod("setPuidAndProvider", String.class, String.class);
            if (declaredMethod != null) {
                f12676z = declaredMethod;
            }
        } catch (Throwable unused) {
        }
    }

    private void i() {
        JSONObject b5 = b(UMEnvelopeBuild.maxDataSpace(f12665a));
        if (b5 != null && b5.length() >= 1) {
            JSONObject jSONObject = (JSONObject) b5.opt("header");
            JSONObject jSONObject2 = (JSONObject) b5.opt("content");
            if (f12665a != null && jSONObject != null && jSONObject2 != null) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> constructInstantMessage: request build envelope.");
                JSONObject buildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(f12665a, jSONObject, jSONObject2);
                if (buildEnvelopeWithExtHeader != null) {
                    try {
                        if (buildEnvelopeWithExtHeader.has("exception")) {
                            UMRTLog.i(UMRTLog.RTLOG_TAG, "Build envelope error code: " + buildEnvelopeWithExtHeader.getInt("exception"));
                        }
                    } catch (Throwable unused) {
                    }
                    if (UMConfigure.isDebugLog()) {
                        e(buildEnvelopeWithExtHeader);
                    }
                    b((Object) buildEnvelopeWithExtHeader);
                }
            }
        }
    }

    private void j() {
        JSONObject buildEnvelopeWithExtHeader;
        JSONObject a5 = a(UMEnvelopeBuild.maxDataSpace(f12665a));
        if (a5 != null && a5.length() >= 1) {
            JSONObject jSONObject = (JSONObject) a5.opt("header");
            JSONObject jSONObject2 = (JSONObject) a5.opt("content");
            Context context = f12665a;
            if (context != null && jSONObject != null && jSONObject2 != null && (buildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(context, jSONObject, jSONObject2)) != null) {
                try {
                    if (buildEnvelopeWithExtHeader.has("exception")) {
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "Build envelope error code: " + buildEnvelopeWithExtHeader.getInt("exception"));
                    }
                } catch (Throwable unused) {
                }
                if (UMConfigure.isDebugLog()) {
                    d(buildEnvelopeWithExtHeader);
                }
                a((Object) buildEnvelopeWithExtHeader);
            }
        }
    }

    private JSONObject k() {
        JSONObject l5 = l();
        if (l5 != null) {
            try {
                l5.put("st", "1");
            } catch (Throwable unused) {
            }
        }
        return l5;
    }

    private JSONObject l() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (AnalyticsConfig.mWrapperType != null && AnalyticsConfig.mWrapperVersion != null) {
                jSONObject.put(com.umeng.commonsdk.statistics.b.a("wrapper_version"), AnalyticsConfig.mWrapperVersion);
                jSONObject.put(com.umeng.commonsdk.statistics.b.a("wrapper_type"), AnalyticsConfig.mWrapperType);
            }
            int verticalType = AnalyticsConfig.getVerticalType(f12665a);
            jSONObject.put(com.umeng.commonsdk.statistics.b.a(com.umeng.analytics.pro.d.f12487i), verticalType);
            String str = "9.6.5";
            if (verticalType == 1) {
                String gameSdkVersion = AnalyticsConfig.getGameSdkVersion(f12665a);
                if (!TextUtils.isEmpty(gameSdkVersion)) {
                    str = gameSdkVersion;
                }
                jSONObject.put(com.umeng.commonsdk.statistics.b.a("sdk_version"), str);
            } else {
                jSONObject.put(com.umeng.commonsdk.statistics.b.a("sdk_version"), "9.6.5");
            }
            String MD5 = HelperUtils.MD5(AnalyticsConfig.getSecretKey(f12665a));
            if (!TextUtils.isEmpty(MD5)) {
                jSONObject.put(com.umeng.commonsdk.statistics.b.a("secret"), MD5);
            }
            String imprintProperty = UMEnvelopeBuild.imprintProperty(f12665a, "pr_ve", null);
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f12665a);
            String imprintProperty2 = UMEnvelopeBuild.imprintProperty(f12665a, com.umeng.analytics.pro.d.at, "");
            if (!TextUtils.isEmpty(imprintProperty2)) {
                if (AnalyticsConfig.CLEAR_EKV_BL) {
                    jSONObject.put(com.umeng.commonsdk.statistics.b.a(com.umeng.analytics.pro.d.av), "");
                } else {
                    jSONObject.put(com.umeng.commonsdk.statistics.b.a(com.umeng.analytics.pro.d.av), imprintProperty2);
                }
            }
            String imprintProperty3 = UMEnvelopeBuild.imprintProperty(f12665a, com.umeng.analytics.pro.d.au, "");
            if (!TextUtils.isEmpty(imprintProperty3)) {
                if (AnalyticsConfig.CLEAR_EKV_WL) {
                    jSONObject.put(com.umeng.commonsdk.statistics.b.a(com.umeng.analytics.pro.d.aw), "");
                } else {
                    jSONObject.put(com.umeng.commonsdk.statistics.b.a(com.umeng.analytics.pro.d.aw), imprintProperty3);
                }
            }
            jSONObject.put(com.umeng.commonsdk.statistics.b.a(com.umeng.analytics.pro.d.an), "1.0.0");
            if (s()) {
                jSONObject.put(com.umeng.commonsdk.statistics.b.a(com.umeng.analytics.pro.d.ap), "1");
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putLong(f12667m, 0L).commit();
                }
            }
            jSONObject.put(com.umeng.commonsdk.statistics.b.a(com.umeng.analytics.pro.d.f12490l), m());
            jSONObject.put(com.umeng.commonsdk.statistics.b.a(com.umeng.analytics.pro.d.f12491m), n());
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString("vers_name", "");
                if (!TextUtils.isEmpty(string)) {
                    String format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
                    if (TextUtils.isEmpty(imprintProperty)) {
                        jSONObject.put(com.umeng.commonsdk.statistics.b.a(com.umeng.analytics.pro.d.f12490l), sharedPreferences.getString("vers_pre_version", "0"));
                        jSONObject.put(com.umeng.commonsdk.statistics.b.a(com.umeng.analytics.pro.d.f12491m), sharedPreferences.getString("vers_date", format));
                    }
                    sharedPreferences.edit().putString("pre_version", string).putString("cur_version", DeviceConfig.getAppVersionName(f12665a)).putString("pre_date", format).remove("vers_name").remove("vers_code").remove("vers_date").remove("vers_pre_version").commit();
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    private String m() {
        String str = "0";
        String str2 = null;
        try {
            str2 = UMEnvelopeBuild.imprintProperty(f12665a, "pr_ve", null);
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(str2)) {
            if (!TextUtils.isEmpty(this.f12679d)) {
                return this.f12679d;
            }
            if (this.f12678c == null) {
                this.f12678c = PreferenceWrapper.getDefault(f12665a);
            }
            String string = this.f12678c.getString("pre_version", "");
            String appVersionName = DeviceConfig.getAppVersionName(f12665a);
            if (TextUtils.isEmpty(string)) {
                this.f12678c.edit().putString("pre_version", "0").putString("cur_version", appVersionName).commit();
            } else {
                str = this.f12678c.getString("cur_version", "");
                if (!appVersionName.equals(str)) {
                    this.f12678c.edit().putString("pre_version", str).putString("cur_version", appVersionName).commit();
                } else {
                    str = string;
                }
            }
            this.f12679d = str;
            return str;
        }
        str = str2;
        this.f12679d = str;
        return str;
    }

    private String n() {
        String str = null;
        try {
            str = UMEnvelopeBuild.imprintProperty(f12665a, "ud_da", null);
            if (TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(this.f12680e)) {
                    return this.f12680e;
                }
                if (this.f12678c == null) {
                    this.f12678c = PreferenceWrapper.getDefault(f12665a);
                }
                String string = this.f12678c.getString("pre_date", "");
                if (TextUtils.isEmpty(string)) {
                    string = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
                    this.f12678c.edit().putString("pre_date", string).commit();
                } else {
                    String format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
                    if (!string.equals(format)) {
                        this.f12678c.edit().putString("pre_date", format).commit();
                        str = format;
                    }
                }
                str = string;
            }
        } catch (Throwable unused) {
        }
        this.f12680e = str;
        return str;
    }

    private void o() {
        try {
            this.f12684i = 0;
            this.f12685j = 0;
            this.f12686k = System.currentTimeMillis();
            PreferenceWrapper.getDefault(f12665a).edit().putLong(f12669o, System.currentTimeMillis()).putInt(f12670p, 0).commit();
        } catch (Throwable unused) {
        }
    }

    private boolean p() {
        try {
            if (!TextUtils.isEmpty(u.a().b())) {
                b(f12665a);
            }
            if (this.f12682g.length() <= 0) {
                return false;
            }
            for (int i5 = 0; i5 < this.f12682g.length(); i5++) {
                JSONObject optJSONObject = this.f12682g.optJSONObject(i5);
                if (optJSONObject != null && optJSONObject.length() > 0) {
                    String optString = optJSONObject.optString("__i");
                    if (TextUtils.isEmpty(optString) || f12673t.equals(optString)) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    private void q() {
        if (this.f12682g.length() > 0) {
            JSONArray jSONArray = new JSONArray();
            for (int i5 = 0; i5 < this.f12682g.length(); i5++) {
                try {
                    JSONObject jSONObject = this.f12682g.getJSONObject(i5);
                    if (jSONObject != null && jSONObject.length() > 0) {
                        String optString = jSONObject.optString("__i");
                        boolean isEmpty = TextUtils.isEmpty(optString);
                        String str = f12673t;
                        if (isEmpty || f12673t.equals(optString)) {
                            String b5 = u.a().b();
                            if (!TextUtils.isEmpty(b5)) {
                                str = b5;
                            }
                            jSONObject.put("__i", str);
                        }
                        jSONArray.put(jSONObject);
                    } else {
                        jSONArray.put(jSONObject);
                    }
                } catch (Throwable unused) {
                }
            }
            this.f12682g = jSONArray;
        }
    }

    private void r() {
        Context context;
        SharedPreferences sharedPreferences;
        try {
            if (s() && (context = f12665a) != null && (sharedPreferences = PreferenceWrapper.getDefault(context)) != null && sharedPreferences.getLong(f12666l, 0L) == 0) {
                sharedPreferences.edit().putLong(f12666l, System.currentTimeMillis()).commit();
            }
        } catch (Throwable unused) {
        }
    }

    private boolean s() {
        SharedPreferences sharedPreferences;
        try {
            Context context = f12665a;
            if (context != null && (sharedPreferences = PreferenceWrapper.getDefault(context)) != null) {
                if (sharedPreferences.getLong(f12667m, -1L) != 0) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public void b() {
    }

    public void c() {
        b(f12665a);
        d();
        a(true);
    }

    public void d() {
        try {
            if (this.f12682g.length() > 0) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>>*** flushMemoryData: 事件落库。");
                i.a(f12665a).a(this.f12682g);
                this.f12682g = new JSONArray();
            }
            PreferenceWrapper.getDefault(f12665a).edit().putLong(f12668n, this.f12686k).putInt(f12671q, this.f12684i).putInt(f12672r, this.f12685j).commit();
        } catch (Throwable unused) {
        }
    }

    private o() {
        this.f12677b = null;
        this.f12678c = null;
        this.f12679d = null;
        this.f12680e = null;
        this.f12681f = 10;
        this.f12682g = new JSONArray();
        this.f12683h = com.alipay.sdk.app.b.f3003h;
        this.f12684i = 0;
        this.f12685j = 0;
        this.f12686k = 0L;
        this.f12687s = 28800000L;
        this.f12688u = false;
        this.f12689v = false;
        this.f12690w = new Object();
        try {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f12665a);
            this.f12686k = sharedPreferences.getLong(f12668n, 0L);
            this.f12684i = sharedPreferences.getInt(f12671q, 0);
            this.f12685j = sharedPreferences.getInt(f12672r, 0);
            this.f12677b = new c();
        } catch (Throwable unused) {
        }
    }

    private void g(JSONObject jSONObject) {
        JSONObject optJSONObject;
        try {
            if (jSONObject.getJSONObject(com.umeng.commonsdk.statistics.b.a("header")).has(com.umeng.analytics.pro.d.aH)) {
                if (jSONObject.has("content")) {
                    jSONObject = jSONObject.getJSONObject("content");
                }
                if (jSONObject.has(com.umeng.commonsdk.statistics.b.a("analytics"))) {
                    if (jSONObject.getJSONObject(com.umeng.commonsdk.statistics.b.a("analytics")).has(com.umeng.analytics.pro.d.f12492n)) {
                        i.a(f12665a).i();
                        i.a(f12665a).h();
                        i.a(f12665a).b(true, false);
                        i.a(f12665a).a();
                        return;
                    }
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> Error, Should not go to this branch.");
                    return;
                }
                return;
            }
            if (jSONObject.has("content")) {
                jSONObject = jSONObject.getJSONObject("content");
            }
            if (jSONObject.has(com.umeng.commonsdk.statistics.b.a("analytics")) && (optJSONObject = jSONObject.optJSONObject(com.umeng.commonsdk.statistics.b.a("analytics"))) != null && optJSONObject.length() > 0) {
                if (optJSONObject.has(com.umeng.analytics.pro.d.f12492n)) {
                    i.a(f12665a).b(true, false);
                }
                if (optJSONObject.has("ekv") || optJSONObject.has(com.umeng.analytics.pro.d.Z)) {
                    i.a(f12665a).h();
                }
                if (optJSONObject.has(com.umeng.analytics.pro.d.U)) {
                    i.a(f12665a).i();
                }
            }
            i.a(f12665a).a();
        } catch (Exception unused) {
        }
    }

    /* loaded from: classes3.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private ReportPolicy.ReportStrategy f12718a = null;

        /* renamed from: b, reason: collision with root package name */
        private int f12719b = -1;

        /* renamed from: c, reason: collision with root package name */
        private int f12720c = -1;

        /* renamed from: d, reason: collision with root package name */
        private int f12721d = -1;

        /* renamed from: e, reason: collision with root package name */
        private int f12722e = -1;

        /* renamed from: f, reason: collision with root package name */
        private ABTest f12723f;

        public c() {
            this.f12723f = null;
            this.f12723f = ABTest.getService(o.f12665a);
        }

        public void a() {
            try {
                int[] a5 = a(-1, -1);
                this.f12719b = a5[0];
                this.f12720c = a5[1];
            } catch (Throwable unused) {
            }
        }

        protected void b() {
            int i5;
            ReportPolicy.ReportStrategy defconPolicy;
            Defcon service = Defcon.getService(o.f12665a);
            if (!service.isOpen()) {
                boolean z4 = Integer.valueOf(UMEnvelopeBuild.imprintProperty(o.f12665a, "integrated_test", o.f12673t)).intValue() == 1;
                if (UMConfigure.isDebugLog() && z4 && !MLog.DEBUG) {
                    UMLog.mutlInfo(j.K, 3, "\\|", null, null);
                }
                if (MLog.DEBUG && z4) {
                    this.f12718a = new ReportPolicy.DebugPolicy(StatTracer.getInstance(o.f12665a));
                } else if (this.f12723f.isInTest() && "RPT".equals(this.f12723f.getTestName())) {
                    if (this.f12723f.getTestPolicy() == 6) {
                        if (Integer.valueOf(UMEnvelopeBuild.imprintProperty(o.f12665a, "test_report_interval", o.f12673t)).intValue() != -1) {
                            i5 = a(90000);
                        } else {
                            i5 = this.f12720c;
                            if (i5 <= 0) {
                                i5 = this.f12722e;
                            }
                        }
                    } else {
                        i5 = 0;
                    }
                    this.f12718a = b(this.f12723f.getTestPolicy(), i5);
                } else {
                    int i6 = this.f12721d;
                    int i7 = this.f12722e;
                    int i8 = this.f12719b;
                    if (i8 != -1) {
                        i7 = this.f12720c;
                        i6 = i8;
                    }
                    this.f12718a = b(i6, i7);
                }
            } else {
                ReportPolicy.ReportStrategy reportStrategy = this.f12718a;
                if (!((reportStrategy instanceof ReportPolicy.DefconPolicy) && reportStrategy.isValid())) {
                    defconPolicy = new ReportPolicy.DefconPolicy(StatTracer.getInstance(o.f12665a), service);
                } else {
                    defconPolicy = this.f12718a;
                }
                this.f12718a = defconPolicy;
            }
            if (UMConfigure.isDebugLog()) {
                try {
                    ReportPolicy.ReportStrategy reportStrategy2 = this.f12718a;
                    if (reportStrategy2 instanceof ReportPolicy.ReportAtLaunch) {
                        UMLog.mutlInfo(j.I, 3, "", null, null);
                    } else if (reportStrategy2 instanceof ReportPolicy.ReportByInterval) {
                        UMLog.mutlInfo(j.J, 3, "", new String[]{"@"}, new String[]{String.valueOf(((ReportPolicy.ReportByInterval) reportStrategy2).getReportInterval() / 1000)});
                    } else if (reportStrategy2 instanceof ReportPolicy.DebugPolicy) {
                        UMLog.mutlInfo(j.L, 3, "", null, null);
                    } else if (reportStrategy2 instanceof ReportPolicy.ReportQuasiRealtime) {
                        String[] strArr = {String.valueOf(((ReportPolicy.ReportQuasiRealtime) reportStrategy2).getReportInterval() / 1000)};
                        UMLog uMLog = UMConfigure.umDebugLog;
                        UMLog.mutlInfo(j.M, 3, "", new String[]{"@"}, strArr);
                    } else {
                        boolean z5 = reportStrategy2 instanceof ReportPolicy.DefconPolicy;
                    }
                } catch (Throwable unused) {
                }
            }
        }

        public ReportPolicy.ReportStrategy c() {
            b();
            return this.f12718a;
        }

        public int[] a(int i5, int i6) {
            int intValue = Integer.valueOf(UMEnvelopeBuild.imprintProperty(o.f12665a, "report_policy", o.f12673t)).intValue();
            int intValue2 = Integer.valueOf(UMEnvelopeBuild.imprintProperty(o.f12665a, "report_interval", o.f12673t)).intValue();
            if (intValue == -1 || !ReportPolicy.isValid(intValue)) {
                return new int[]{i5, i6};
            }
            if (6 == intValue) {
                if (intValue2 == -1 || intValue2 < 90 || intValue2 > 86400) {
                    intValue2 = 90;
                }
                return new int[]{intValue, intValue2 * 1000};
            }
            if (11 != intValue) {
                return new int[]{i5, i6};
            }
            if (intValue2 == -1 || intValue2 < 15 || intValue2 > 3600) {
                intValue2 = 15;
            }
            return new int[]{intValue, intValue2 * 1000};
        }

        public int a(int i5) {
            int intValue = Integer.valueOf(UMEnvelopeBuild.imprintProperty(o.f12665a, "test_report_interval", o.f12673t)).intValue();
            return (intValue == -1 || intValue < 90 || intValue > 86400) ? i5 : intValue * 1000;
        }

        private ReportPolicy.ReportStrategy b(int i5, int i6) {
            if (i5 == 0) {
                ReportPolicy.ReportStrategy reportStrategy = this.f12718a;
                return reportStrategy instanceof ReportPolicy.ReportRealtime ? reportStrategy : new ReportPolicy.ReportRealtime();
            }
            if (i5 == 1) {
                ReportPolicy.ReportStrategy reportStrategy2 = this.f12718a;
                return reportStrategy2 instanceof ReportPolicy.ReportAtLaunch ? reportStrategy2 : new ReportPolicy.ReportAtLaunch();
            }
            if (i5 == 4) {
                ReportPolicy.ReportStrategy reportStrategy3 = this.f12718a;
                return reportStrategy3 instanceof ReportPolicy.ReportDaily ? reportStrategy3 : new ReportPolicy.ReportDaily(StatTracer.getInstance(o.f12665a));
            }
            if (i5 == 5) {
                ReportPolicy.ReportStrategy reportStrategy4 = this.f12718a;
                return reportStrategy4 instanceof ReportPolicy.ReportWifiOnly ? reportStrategy4 : new ReportPolicy.ReportWifiOnly(o.f12665a);
            }
            if (i5 == 6) {
                ReportPolicy.ReportStrategy reportStrategy5 = this.f12718a;
                if (reportStrategy5 instanceof ReportPolicy.ReportByInterval) {
                    ((ReportPolicy.ReportByInterval) reportStrategy5).setReportInterval(i6);
                    return reportStrategy5;
                }
                return new ReportPolicy.ReportByInterval(StatTracer.getInstance(o.f12665a), i6);
            }
            if (i5 == 8) {
                ReportPolicy.ReportStrategy reportStrategy6 = this.f12718a;
                return reportStrategy6 instanceof ReportPolicy.SmartPolicy ? reportStrategy6 : new ReportPolicy.SmartPolicy(StatTracer.getInstance(o.f12665a));
            }
            if (i5 != 11) {
                ReportPolicy.ReportStrategy reportStrategy7 = this.f12718a;
                return reportStrategy7 instanceof ReportPolicy.ReportAtLaunch ? reportStrategy7 : new ReportPolicy.ReportAtLaunch();
            }
            ReportPolicy.ReportStrategy reportStrategy8 = this.f12718a;
            if (reportStrategy8 instanceof ReportPolicy.ReportQuasiRealtime) {
                ((ReportPolicy.ReportQuasiRealtime) reportStrategy8).setReportInterval(i6);
                return reportStrategy8;
            }
            ReportPolicy.ReportQuasiRealtime reportQuasiRealtime = new ReportPolicy.ReportQuasiRealtime();
            reportQuasiRealtime.setReportInterval(i6);
            return reportQuasiRealtime;
        }
    }

    private void c(JSONObject jSONObject) {
        try {
            if (!i.a(f12665a).e()) {
                JSONObject g5 = i.a(f12665a).g();
                if (g5 != null) {
                    String optString = g5.optString("__av");
                    String optString2 = g5.optString("__vc");
                    if (TextUtils.isEmpty(optString)) {
                        jSONObject.put(com.umeng.commonsdk.statistics.b.a("app_version"), UMUtils.getAppVersionName(f12665a));
                    } else {
                        jSONObject.put(com.umeng.commonsdk.statistics.b.a("app_version"), optString);
                    }
                    if (TextUtils.isEmpty(optString2)) {
                        jSONObject.put(com.umeng.commonsdk.statistics.b.a("version_code"), UMUtils.getAppVersionCode(f12665a));
                        return;
                    } else {
                        jSONObject.put(com.umeng.commonsdk.statistics.b.a("version_code"), optString2);
                        return;
                    }
                }
                return;
            }
            jSONObject.put(com.umeng.commonsdk.statistics.b.a("app_version"), UMUtils.getAppVersionName(f12665a));
            jSONObject.put(com.umeng.commonsdk.statistics.b.a("version_code"), UMUtils.getAppVersionCode(f12665a));
        } catch (Throwable unused) {
        }
    }

    public void a() {
        if (f12665a != null) {
            synchronized (this.f12690w) {
                if (this.f12688u) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> network is now available, rebuild instant session data packet.");
                    Context context = f12665a;
                    UMWorkDispatch.sendEvent(context, a.f12702l, CoreProtocol.getInstance(context), null);
                }
            }
            synchronized (this.f12690w) {
                if (this.f12689v) {
                    Context context2 = f12665a;
                    UMWorkDispatch.sendEvent(context2, a.f12703m, CoreProtocol.getInstance(context2), null);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private Map<String, Object> f12724a;

        /* renamed from: b, reason: collision with root package name */
        private String f12725b;

        /* renamed from: c, reason: collision with root package name */
        private String f12726c;

        /* renamed from: d, reason: collision with root package name */
        private long f12727d;

        private d() {
            this.f12724a = null;
            this.f12725b = null;
            this.f12726c = null;
            this.f12727d = 0L;
        }

        public Map<String, Object> a() {
            return this.f12724a;
        }

        public String b() {
            return this.f12726c;
        }

        public String c() {
            return this.f12725b;
        }

        public long d() {
            return this.f12727d;
        }

        public d(String str, Map<String, Object> map, String str2, long j5) {
            this.f12724a = map;
            this.f12725b = str;
            this.f12727d = j5;
            this.f12726c = str2;
        }
    }

    private void h(Object obj) {
        try {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject == null || jSONObject.length() <= 0 || !jSONObject.has("__ii")) {
                return;
            }
            String optString = jSONObject.optString("__ii");
            jSONObject.remove("__ii");
            if (TextUtils.isEmpty(optString)) {
                return;
            }
            i.a(f12665a).a(optString, obj.toString(), 2);
        } catch (Throwable unused) {
        }
    }

    private void d(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.length() <= 0) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            if (jSONObject.has(com.umeng.commonsdk.statistics.b.a("analytics"))) {
                JSONObject jSONObject4 = jSONObject.getJSONObject(com.umeng.commonsdk.statistics.b.a("analytics"));
                if (jSONObject4.has("ekv")) {
                    jSONObject3.put("ekv", jSONObject4.getJSONArray("ekv"));
                    if (jSONObject3.length() > 0) {
                        if (AnalyticsConfig.isRealTimeDebugMode()) {
                            MLog.d("[埋点验证模式]事件:" + jSONObject3.toString());
                        } else {
                            MLog.d("事件:" + jSONObject3.toString());
                        }
                        jSONObject3 = new JSONObject();
                    }
                }
                if (jSONObject4.has(com.umeng.analytics.pro.d.Z)) {
                    jSONObject3.put(com.umeng.analytics.pro.d.Z, jSONObject4.getJSONArray(com.umeng.analytics.pro.d.Z));
                    if (jSONObject3.length() > 0) {
                        if (AnalyticsConfig.isRealTimeDebugMode()) {
                            MLog.d("[埋点验证模式]游戏事件:" + jSONObject3.toString());
                        } else {
                            MLog.d("游戏事件:" + jSONObject3.toString());
                        }
                        jSONObject3 = new JSONObject();
                    }
                }
                if (jSONObject4.has(com.umeng.analytics.pro.d.U)) {
                    jSONObject3.put(com.umeng.analytics.pro.d.U, jSONObject4.getJSONArray(com.umeng.analytics.pro.d.U));
                    if (jSONObject3.length() > 0) {
                        if (AnalyticsConfig.isRealTimeDebugMode()) {
                            MLog.d("[埋点验证模式]错误:" + jSONObject3.toString());
                        } else {
                            MLog.d("错误:" + jSONObject3.toString());
                        }
                        jSONObject3 = new JSONObject();
                    }
                }
                if (jSONObject4.has(com.umeng.analytics.pro.d.f12492n)) {
                    JSONArray jSONArray = jSONObject4.getJSONArray(com.umeng.analytics.pro.d.f12492n);
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                        JSONObject jSONObject5 = jSONArray.getJSONObject(i5);
                        if (jSONObject5 != null && jSONObject5.length() > 0) {
                            if (jSONObject5.has(com.umeng.analytics.pro.d.f12499u)) {
                                jSONObject5.remove(com.umeng.analytics.pro.d.f12499u);
                            }
                            jSONArray2.put(jSONObject5);
                        }
                    }
                    jSONObject3.put(com.umeng.analytics.pro.d.f12492n, jSONArray2);
                    if (jSONObject3.length() > 0) {
                        if (AnalyticsConfig.isRealTimeDebugMode()) {
                            MLog.d("[埋点验证模式]会话:" + jSONObject3.toString());
                        } else {
                            MLog.d("会话:" + jSONObject3.toString());
                        }
                        jSONObject3 = new JSONObject();
                    }
                }
                if (jSONObject4.has(com.umeng.analytics.pro.d.I)) {
                    jSONObject3.put(com.umeng.analytics.pro.d.I, jSONObject4.getJSONObject(com.umeng.analytics.pro.d.I));
                }
                if (jSONObject4.has(com.umeng.analytics.pro.d.L)) {
                    jSONObject3.put(com.umeng.analytics.pro.d.L, jSONObject4.getJSONObject(com.umeng.analytics.pro.d.L));
                    if (jSONObject3.length() > 0) {
                        if (AnalyticsConfig.isRealTimeDebugMode()) {
                            MLog.d("[埋点验证模式]账号:" + jSONObject3.toString());
                        } else {
                            MLog.d("账号:" + jSONObject3.toString());
                        }
                        jSONObject3 = new JSONObject();
                    }
                }
            }
            if (jSONObject.has("dplus")) {
                jSONObject3.put("dplus", jSONObject.getJSONObject("dplus"));
            }
            if (jSONObject.has(com.umeng.commonsdk.statistics.b.a("header")) && (jSONObject2 = jSONObject.getJSONObject(com.umeng.commonsdk.statistics.b.a("header"))) != null && jSONObject2.length() > 0) {
                if (jSONObject2.has(com.umeng.commonsdk.statistics.b.a("sdk_version"))) {
                    jSONObject3.put("sdk_version", jSONObject2.getString(com.umeng.commonsdk.statistics.b.a("sdk_version")));
                }
                if (jSONObject2.has(com.umeng.commonsdk.statistics.b.a("device_id"))) {
                    jSONObject3.put("device_id", jSONObject2.getString(com.umeng.commonsdk.statistics.b.a("device_id")));
                }
                if (jSONObject2.has(com.umeng.commonsdk.statistics.b.a("device_model"))) {
                    jSONObject3.put("device_model", jSONObject2.getString(com.umeng.commonsdk.statistics.b.a("device_model")));
                }
                if (jSONObject2.has(com.umeng.commonsdk.statistics.b.a("version_code"))) {
                    jSONObject3.put("version", jSONObject2.getInt(com.umeng.commonsdk.statistics.b.a("version_code")));
                }
                if (jSONObject2.has(com.umeng.commonsdk.statistics.b.a("appkey"))) {
                    jSONObject3.put("appkey", jSONObject2.getString(com.umeng.commonsdk.statistics.b.a("appkey")));
                }
                if (jSONObject2.has(com.umeng.commonsdk.statistics.b.a("channel"))) {
                    jSONObject3.put("channel", jSONObject2.getString(com.umeng.commonsdk.statistics.b.a("channel")));
                }
                if (jSONObject3.length() > 0) {
                    MLog.d("基础信息:" + jSONObject3.toString());
                    jSONObject3 = new JSONObject();
                }
            }
            jSONObject3.length();
        } catch (Throwable th) {
            MLog.e(th);
        }
    }

    public JSONObject b(long j5) {
        if (TextUtils.isEmpty(y.a().d(UMGlobalContext.getAppContext(f12665a)))) {
            return null;
        }
        JSONObject b5 = i.a(UMGlobalContext.getAppContext(f12665a)).b(false);
        String[] a5 = com.umeng.analytics.c.a(f12665a);
        if (a5 != null && !TextUtils.isEmpty(a5[0]) && !TextUtils.isEmpty(a5[1])) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("provider", a5[0]);
                jSONObject.put(com.umeng.analytics.pro.d.N, a5[1]);
                if (jSONObject.length() > 0) {
                    b5.put(com.umeng.analytics.pro.d.L, jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
        int a6 = r.a().a(f12665a);
        if (b5.length() == 1 && b5.optJSONObject(com.umeng.analytics.pro.d.L) != null && a6 != 3) {
            return null;
        }
        r.a().b(b5, f12665a);
        if (b5.length() <= 0 && a6 != 3) {
            return null;
        }
        JSONObject k5 = k();
        if (k5 != null) {
            b(k5);
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            if (a6 == 3) {
                jSONObject3.put("analytics", new JSONObject());
            } else if (b5.length() > 0) {
                jSONObject3.put("analytics", b5);
            }
            if (k5 != null && k5.length() > 0) {
                jSONObject2.put("header", k5);
            }
            if (jSONObject3.length() > 0) {
                jSONObject2.put("content", jSONObject3);
            }
            return b(jSONObject2, j5);
        } catch (Throwable unused2) {
            return jSONObject2;
        }
    }

    private boolean c(boolean z4) {
        if (s() || AnalyticsConfig.isRealTimeDebugMode()) {
            return true;
        }
        if (this.f12677b == null) {
            this.f12677b = new c();
        }
        this.f12677b.a();
        ReportPolicy.ReportStrategy c5 = this.f12677b.c();
        boolean shouldSendMessage = c5.shouldSendMessage(z4);
        if (shouldSendMessage) {
            if (((c5 instanceof ReportPolicy.ReportByInterval) || (c5 instanceof ReportPolicy.DebugPolicy) || (c5 instanceof ReportPolicy.ReportQuasiRealtime)) && p()) {
                d();
            }
            if ((c5 instanceof ReportPolicy.DefconPolicy) && p()) {
                d();
            }
            if (UMConfigure.isDebugLog()) {
                MLog.d("数据发送策略 : " + c5.getClass().getSimpleName());
            }
        }
        return shouldSendMessage;
    }

    private void a(String str, String str2) {
        Method method;
        Class<?> cls = f12675y;
        if (cls == null || (method = f12676z) == null) {
            return;
        }
        try {
            method.invoke(cls, str, str2);
        } catch (Throwable unused) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> reflect call setPuidAndProvider method of crash lib failed.");
        }
    }

    private void e(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.length() <= 0) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            if (jSONObject.has(com.umeng.commonsdk.statistics.b.a("analytics"))) {
                JSONObject jSONObject4 = jSONObject.getJSONObject(com.umeng.commonsdk.statistics.b.a("analytics"));
                if (jSONObject4.has(com.umeng.analytics.pro.d.f12492n)) {
                    JSONArray jSONArray = jSONObject4.getJSONArray(com.umeng.analytics.pro.d.f12492n);
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                        JSONObject jSONObject5 = jSONArray.getJSONObject(i5);
                        if (jSONObject5 != null && jSONObject5.length() > 0) {
                            jSONArray2.put(jSONObject5);
                        }
                    }
                    jSONObject3.put(com.umeng.analytics.pro.d.f12492n, jSONArray2);
                    if (jSONObject3.length() > 0) {
                        MLog.d("本次启动会话:" + jSONObject3.toString());
                        jSONObject3 = new JSONObject();
                    }
                }
                if (jSONObject4.has(com.umeng.analytics.pro.d.L)) {
                    jSONObject3.put(com.umeng.analytics.pro.d.L, jSONObject4.getJSONObject(com.umeng.analytics.pro.d.L));
                    if (jSONObject3.length() > 0) {
                        MLog.d("本次启动账号:" + jSONObject3.toString());
                        jSONObject3 = new JSONObject();
                    }
                }
            }
            if (jSONObject.has(com.umeng.commonsdk.statistics.b.a("header")) && jSONObject.has(com.umeng.commonsdk.statistics.b.a("header")) && (jSONObject2 = jSONObject.getJSONObject(com.umeng.commonsdk.statistics.b.a("header"))) != null && jSONObject2.length() > 0) {
                if (jSONObject2.has(com.umeng.commonsdk.statistics.b.a("sdk_version"))) {
                    jSONObject3.put("sdk_version", jSONObject2.getString(com.umeng.commonsdk.statistics.b.a("sdk_version")));
                }
                if (jSONObject2.has(com.umeng.commonsdk.statistics.b.a("device_id"))) {
                    jSONObject3.put("device_id", jSONObject2.getString(com.umeng.commonsdk.statistics.b.a("device_id")));
                }
                if (jSONObject2.has(com.umeng.commonsdk.statistics.b.a("device_model"))) {
                    jSONObject3.put("device_model", jSONObject2.getString(com.umeng.commonsdk.statistics.b.a("device_model")));
                }
                if (jSONObject2.has(com.umeng.commonsdk.statistics.b.a("version_code"))) {
                    jSONObject3.put("version", jSONObject2.getInt(com.umeng.commonsdk.statistics.b.a("version_code")));
                }
                if (jSONObject2.has(com.umeng.commonsdk.statistics.b.a("appkey"))) {
                    jSONObject3.put("appkey", jSONObject2.getString(com.umeng.commonsdk.statistics.b.a("appkey")));
                }
                if (jSONObject2.has(com.umeng.commonsdk.statistics.b.a("channel"))) {
                    jSONObject3.put("channel", jSONObject2.getString(com.umeng.commonsdk.statistics.b.a("channel")));
                }
                if (jSONObject3.length() > 0) {
                    MLog.d("本次启动基础信息:" + jSONObject3.toString());
                    jSONObject3 = new JSONObject();
                }
            }
            jSONObject3.length();
        } catch (Throwable th) {
            MLog.e(th);
        }
    }

    public void a(Object obj, int i5) {
        if (com.umeng.commonsdk.utils.c.a()) {
            if (i5 != 4357) {
                return;
            }
            try {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> clean db in silent mode.");
                h.a(f12665a);
                com.umeng.commonsdk.utils.c.c(f12665a);
            } catch (Throwable unused) {
            }
        }
        if (AnalyticsConfig.enable) {
            try {
                if (i5 != 4358) {
                    switch (i5) {
                        case 4097:
                            if (UMUtils.isMainProgress(f12665a)) {
                                if (obj != null) {
                                    e(obj);
                                }
                                if (f12673t.equals(((JSONObject) obj).optString("__i"))) {
                                    return;
                                }
                                a(false);
                                return;
                            }
                            UMProcessDBHelper.getInstance(f12665a).insertEventsInSubProcess(UMFrUtils.getSubProcessName(f12665a), new JSONArray().put(obj));
                            return;
                        case 4098:
                            if (obj != null) {
                                e(obj);
                            }
                            if (f12673t.equals(((JSONObject) obj).optString("__i"))) {
                                return;
                            }
                            a(false);
                            return;
                        case 4099:
                            v.a(f12665a);
                            return;
                        case 4100:
                            l.c(f12665a);
                            return;
                        case a.f12695e /* 4101 */:
                            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> PROFILE_SIGNIN");
                            a((Object) null, true);
                            g(obj);
                            return;
                        case a.f12696f /* 4102 */:
                            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> PROFILE_SIGNOFF");
                            a((Object) null, true);
                            f(obj);
                            return;
                        case a.f12697g /* 4103 */:
                            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> START_SESSION");
                            u.a().a(f12665a, obj);
                            synchronized (this.f12690w) {
                                this.f12689v = true;
                            }
                            return;
                        case a.f12698h /* 4104 */:
                            u.a().c(f12665a, obj);
                            return;
                        case a.f12699i /* 4105 */:
                            d();
                            return;
                        case a.f12700j /* 4106 */:
                            h(obj);
                            return;
                        default:
                            switch (i5) {
                                case 4352:
                                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> INSTANT_SESSION_START");
                                    u.a().b(f12665a, obj);
                                    synchronized (this.f12690w) {
                                        this.f12688u = true;
                                    }
                                    return;
                                case a.f12702l /* 4353 */:
                                    a(obj, true);
                                    return;
                                case a.f12703m /* 4354 */:
                                    c();
                                    return;
                                case a.f12704n /* 4355 */:
                                    if (!UMUtils.isMainProgress(f12665a)) {
                                        UMProcessDBHelper.getInstance(f12665a).insertEventsInSubProcess(UMFrUtils.getSubProcessName(f12665a), new JSONArray().put(obj));
                                        return;
                                    } else {
                                        if (obj != null) {
                                            e(obj);
                                            d();
                                            return;
                                        }
                                        return;
                                    }
                                case a.f12705o /* 4356 */:
                                    if (obj == null || f12675y == null || f12676z == null) {
                                        return;
                                    }
                                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> PROFILE_CHANGE_NOTIFY");
                                    String str = "";
                                    String str2 = "";
                                    if (obj instanceof JSONObject) {
                                        JSONObject jSONObject = (JSONObject) obj;
                                        if (jSONObject.has("uid") && jSONObject.has("provider")) {
                                            str = jSONObject.getString("provider");
                                            str2 = jSONObject.getString("uid");
                                        }
                                        a(str2, str);
                                        return;
                                    }
                                    return;
                                default:
                                    switch (i5) {
                                        case a.f12710t /* 8195 */:
                                            com.umeng.analytics.b.a().a(obj);
                                            return;
                                        case a.f12711u /* 8196 */:
                                            com.umeng.analytics.b.a().m();
                                            return;
                                        case 8197:
                                            com.umeng.analytics.b.a().k();
                                            return;
                                        default:
                                            switch (i5) {
                                                case a.f12713w /* 8199 */:
                                                case 8200:
                                                    com.umeng.analytics.b.a().b(obj);
                                                    return;
                                                case a.f12715y /* 8201 */:
                                                    com.umeng.analytics.b.a().b((Object) null);
                                                    return;
                                                default:
                                                    switch (i5) {
                                                        case a.f12716z /* 8208 */:
                                                            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> receive DELAY_BUILD_ENVELOPE event.");
                                                            Context context = f12665a;
                                                            UMWorkDispatch.sendEvent(context, a.A, CoreProtocol.getInstance(context), null);
                                                            Context context2 = f12665a;
                                                            UMWorkDispatch.sendEvent(context2, a.f12703m, CoreProtocol.getInstance(context2), null);
                                                            return;
                                                        case a.A /* 8209 */:
                                                            a(obj, false);
                                                            return;
                                                        case a.B /* 8210 */:
                                                            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> recv BUILD_ENVELOPE_IMMEDIATELY.");
                                                            if (!UMUtils.isMainProgress(f12665a) || (this.f12677b.c() instanceof ReportPolicy.ReportQuasiRealtime)) {
                                                                return;
                                                            }
                                                            a(true);
                                                            return;
                                                        default:
                                                            switch (i5) {
                                                                case a.E /* 8213 */:
                                                                    if (FieldManager.allow(com.umeng.commonsdk.utils.d.E)) {
                                                                        if (DeviceConfig.getGlobleActivity(f12665a) != null) {
                                                                            u.b(f12665a);
                                                                        }
                                                                        Context context3 = f12665a;
                                                                        UMWorkDispatch.sendEventEx(context3, a.E, CoreProtocol.getInstance(context3), null, 5000L);
                                                                        return;
                                                                    }
                                                                    return;
                                                                case a.F /* 8214 */:
                                                                    if (obj != null && (obj instanceof JSONObject)) {
                                                                        String optString = ((JSONObject) obj).optString(AnalyticsConfig.RTD_START_TIME);
                                                                        String optString2 = ((JSONObject) obj).optString("period");
                                                                        String optString3 = ((JSONObject) obj).optString("debugkey");
                                                                        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2) || TextUtils.isEmpty(optString3)) {
                                                                            return;
                                                                        }
                                                                        Context context4 = f12665a;
                                                                        String str3 = AnalyticsConfig.RTD_SP_FILE;
                                                                        com.umeng.common.b.a(context4, str3, AnalyticsConfig.RTD_START_TIME, optString);
                                                                        com.umeng.common.b.a(f12665a, str3, "period", optString2);
                                                                        com.umeng.common.b.a(f12665a, str3, "debugkey", optString3);
                                                                        return;
                                                                    }
                                                                    return;
                                                                case a.G /* 8215 */:
                                                                    com.umeng.common.b.a(f12665a, AnalyticsConfig.RTD_SP_FILE);
                                                                    return;
                                                                default:
                                                                    return;
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
                }
                if (obj != null && (obj instanceof JSONObject)) {
                    String optString4 = ((JSONObject) obj).optString(com.umeng.analytics.pro.d.S);
                    Object opt = ((JSONObject) obj).opt(com.umeng.analytics.pro.d.T);
                    if (TextUtils.isEmpty(optString4)) {
                        return;
                    }
                    String[] a5 = com.umeng.analytics.c.a(f12665a);
                    if (a5 != null && !TextUtils.isEmpty(a5[0]) && !TextUtils.isEmpty(a5[1])) {
                        if (com.umeng.analytics.pro.d.O.equals(optString4)) {
                            com.umeng.analytics.c.a((String) opt);
                            return;
                        } else if (com.umeng.analytics.pro.d.P.equals(optString4)) {
                            com.umeng.analytics.c.b((String) opt);
                            return;
                        } else {
                            com.umeng.analytics.c.a(optString4, opt);
                            return;
                        }
                    }
                    MLog.e("Please call MobclickAgent.onProfileSignIn() function before set user profile property.");
                }
            } catch (Throwable unused2) {
            }
        }
    }

    private void g(Object obj) {
        try {
            b(f12665a);
            d();
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject != null && jSONObject.length() > 0) {
                String string = jSONObject.getString("provider");
                String string2 = jSONObject.getString("uid");
                long j5 = jSONObject.getLong("ts");
                String[] a5 = com.umeng.analytics.c.a(f12665a);
                if (a5 != null && string.equals(a5[0]) && string2.equals(a5[1])) {
                    return;
                }
                u.a().a(f12665a, j5);
                String c5 = y.a().c(f12665a);
                boolean b5 = u.a().b(f12665a, j5, false);
                com.umeng.analytics.c.a(f12665a, string, string2);
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> onProfileSignIn: force generate new session: session id = " + c5);
                u.a().a(f12665a, j5, true);
                if (b5) {
                    u.a().b(f12665a, j5);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public long f() {
        SharedPreferences sharedPreferences;
        long j5 = 0;
        try {
            Context context = f12665a;
            if (context == null || (sharedPreferences = PreferenceWrapper.getDefault(context)) == null) {
                return 0L;
            }
            long j6 = sharedPreferences.getLong(f12666l, 0L);
            if (j6 == 0) {
                try {
                    j5 = System.currentTimeMillis();
                    sharedPreferences.edit().putLong(f12666l, j5).commit();
                    return j5;
                } catch (Throwable unused) {
                }
            }
            return j6;
        } catch (Throwable unused2) {
            return j5;
        }
    }

    public void c(Object obj) {
        b(f12665a);
        d();
        if (d(false)) {
            j();
        }
    }

    private void f(Object obj) {
        try {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject != null && jSONObject.length() > 0) {
                long j5 = jSONObject.getLong("ts");
                b(f12665a);
                d();
                String[] a5 = com.umeng.analytics.c.a(f12665a);
                if (a5 == null || TextUtils.isEmpty(a5[0]) || TextUtils.isEmpty(a5[1])) {
                    return;
                }
                u.a().a(f12665a, j5);
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> onProfileSignIn: force generate new session: session id = " + y.a().c(f12665a));
                boolean b5 = u.a().b(f12665a, j5, false);
                com.umeng.analytics.c.b(f12665a);
                u.a().a(f12665a, j5, true);
                if (b5) {
                    u.a().b(f12665a, j5);
                }
            }
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.e(" Excepthon  in  onProfileSignOff", th);
            }
        }
    }

    private JSONObject b(JSONObject jSONObject, long j5) {
        try {
            if (q.a(jSONObject) <= j5) {
                return jSONObject;
            }
            jSONObject = null;
            i.a(f12665a).a(true, false);
            i.a(f12665a).b();
            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> Instant session packet overload !!! ");
            return null;
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    public JSONObject b(boolean z4) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONObject jSONObject = null;
        try {
            jSONObject = i.a(f12665a).a(z4);
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            } else {
                try {
                    boolean has = jSONObject.has(com.umeng.analytics.pro.d.f12492n);
                    jSONObject = jSONObject;
                    if (has) {
                        JSONArray jSONArray3 = jSONObject.getJSONArray(com.umeng.analytics.pro.d.f12492n);
                        JSONArray jSONArray4 = new JSONArray();
                        int i5 = 0;
                        while (i5 < jSONArray3.length()) {
                            JSONObject jSONObject2 = (JSONObject) jSONArray3.get(i5);
                            JSONArray optJSONArray = jSONObject2.optJSONArray(com.umeng.analytics.pro.d.f12498t);
                            JSONArray optJSONArray2 = jSONObject2.optJSONArray(com.umeng.analytics.pro.d.f12499u);
                            if (optJSONArray == null && optJSONArray2 != null) {
                                jSONObject2.put(com.umeng.analytics.pro.d.f12498t, optJSONArray2);
                                jSONObject2.remove(com.umeng.analytics.pro.d.f12499u);
                            }
                            if (optJSONArray != null && optJSONArray2 != null) {
                                ArrayList arrayList = new ArrayList();
                                for (int i6 = 0; i6 < optJSONArray.length(); i6++) {
                                    arrayList.add((JSONObject) optJSONArray.get(i6));
                                }
                                for (int i7 = 0; i7 < optJSONArray2.length(); i7++) {
                                    arrayList.add((JSONObject) optJSONArray2.get(i7));
                                }
                                JSONArraySortUtil jSONArraySortUtil = new JSONArraySortUtil();
                                jSONArraySortUtil.setCompareKey(com.umeng.analytics.pro.d.f12502x);
                                Collections.sort(arrayList, jSONArraySortUtil);
                                JSONArray jSONArray5 = new JSONArray();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    jSONArray5.put((JSONObject) it.next());
                                }
                                jSONObject2.put(com.umeng.analytics.pro.d.f12498t, jSONArray5);
                                jSONObject2.remove(com.umeng.analytics.pro.d.f12499u);
                            }
                            if (jSONObject2.has(com.umeng.analytics.pro.d.f12498t)) {
                                JSONArray optJSONArray3 = jSONObject2.optJSONArray(com.umeng.analytics.pro.d.f12498t);
                                int i8 = 0;
                                while (i8 < optJSONArray3.length()) {
                                    JSONObject jSONObject3 = optJSONArray3.getJSONObject(i8);
                                    if (jSONObject3.has(com.umeng.analytics.pro.d.f12502x)) {
                                        jSONArray2 = jSONArray3;
                                        jSONObject3.put("ts", jSONObject3.getLong(com.umeng.analytics.pro.d.f12502x));
                                        jSONObject3.remove(com.umeng.analytics.pro.d.f12502x);
                                    } else {
                                        jSONArray2 = jSONArray3;
                                    }
                                    i8++;
                                    jSONArray3 = jSONArray2;
                                }
                                jSONArray = jSONArray3;
                                jSONObject2.put(com.umeng.analytics.pro.d.f12498t, optJSONArray3);
                                jSONObject2.put(com.umeng.analytics.pro.d.f12504z, optJSONArray3.length());
                            } else {
                                jSONArray = jSONArray3;
                                jSONObject2.put(com.umeng.analytics.pro.d.f12504z, 0);
                            }
                            jSONArray4.put(jSONObject2);
                            i5++;
                            jSONArray3 = jSONArray;
                        }
                        jSONObject.put(com.umeng.analytics.pro.d.f12492n, jSONArray4);
                        jSONObject = jSONObject;
                    }
                } catch (Exception e5) {
                    MLog.e("merge pages error");
                    e5.printStackTrace();
                    jSONObject = jSONObject;
                }
            }
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f12665a);
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString("userlevel", "");
                if (!TextUtils.isEmpty(string)) {
                    jSONObject.put("userlevel", string);
                }
            }
            String[] a5 = com.umeng.analytics.c.a(f12665a);
            if (a5 != null && !TextUtils.isEmpty(a5[0]) && !TextUtils.isEmpty(a5[1])) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("provider", a5[0]);
                jSONObject4.put(com.umeng.analytics.pro.d.N, a5[1]);
                if (jSONObject4.length() > 0) {
                    JSONObject jSONObject5 = new JSONObject();
                    String a6 = com.umeng.analytics.c.a();
                    if (a6 != null) {
                        jSONObject5.put(com.umeng.analytics.pro.d.O, a6);
                    }
                    String b5 = com.umeng.analytics.c.b();
                    if (b5 != null) {
                        jSONObject5.put(com.umeng.analytics.pro.d.P, b5);
                    }
                    Map<String, Object> c5 = com.umeng.analytics.c.c(f12665a);
                    if (c5 != null && c5.size() > 0) {
                        for (String str : c5.keySet()) {
                            jSONObject5.put(str, c5.get(str));
                        }
                    }
                    if (jSONObject5.length() > 0) {
                        jSONObject4.put(com.umeng.analytics.pro.d.R, jSONObject5);
                    }
                    jSONObject.put(com.umeng.analytics.pro.d.L, jSONObject4);
                }
            }
            if (ABTest.getService(f12665a).isInTest()) {
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put(ABTest.getService(f12665a).getTestName(), ABTest.getService(f12665a).getGroupInfo());
                jSONObject.put(com.umeng.analytics.pro.d.K, jSONObject6);
            }
            r.a().a(jSONObject, f12665a);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public void e() {
        if (d(false)) {
            j();
        }
    }

    public void d(Object obj) {
        r();
        m();
        n();
        a(true);
    }

    private boolean d(boolean z4) {
        if (this.f12677b == null) {
            this.f12677b = new c();
        }
        ReportPolicy.ReportStrategy c5 = this.f12677b.c();
        if (!(c5 instanceof ReportPolicy.DefconPolicy)) {
            return true;
        }
        if (z4) {
            return ((ReportPolicy.DefconPolicy) c5).shouldSendMessageByInstant();
        }
        return c5.shouldSendMessage(false);
    }

    public void b(Object obj) {
        if (obj != null) {
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.length() > 0) {
                    if (jSONObject.has("exception")) {
                        if (101 != jSONObject.getInt("exception")) {
                            f(jSONObject);
                        }
                    } else {
                        f(jSONObject);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void b(Context context) {
        try {
            i.a(context).d();
            q();
        } catch (Throwable unused) {
        }
    }

    public void a(boolean z4) {
        if (c(z4)) {
            if (!(this.f12677b.c() instanceof ReportPolicy.ReportQuasiRealtime)) {
                if (UMEnvelopeBuild.isReadyBuild(f12665a, UMLogDataProtocol.UMBusinessType.U_APP)) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> constructMessage()");
                    j();
                    return;
                }
                return;
            }
            if (z4) {
                if (UMEnvelopeBuild.isOnline(f12665a)) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> send session start in policy ReportQuasiRealtime.");
                    j();
                    return;
                }
                return;
            }
            if (UMEnvelopeBuild.isReadyBuild(f12665a, UMLogDataProtocol.UMBusinessType.U_APP)) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> send normal data in policy ReportQuasiRealtime.");
                j();
            }
        }
    }

    private boolean a(JSONArray jSONArray) {
        int length = jSONArray.length();
        List asList = Arrays.asList("$$_onUMengEnterForeground", "$$_onUMengEnterBackground", "$$_onUMengEnterForegroundInitError");
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            try {
                JSONObject optJSONObject = jSONArray.optJSONObject(i6);
                if (optJSONObject != null && asList.contains(optJSONObject.optString("id"))) {
                    i5++;
                }
            } catch (Throwable unused) {
            }
        }
        return i5 >= length;
    }

    private boolean a(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("ekv");
        int length = optJSONArray.length();
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            try {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i6);
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray(keys.next());
                    if (optJSONArray2 != null && a(optJSONArray2)) {
                        i5++;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return i5 >= length;
    }

    public JSONObject a(long j5) {
        if (TextUtils.isEmpty(y.a().d(f12665a))) {
            return null;
        }
        JSONObject b5 = b(false);
        int a5 = r.a().a(f12665a);
        if (b5.length() > 0) {
            if (b5.length() == 1) {
                if (b5.optJSONObject(com.umeng.analytics.pro.d.L) != null && a5 != 3) {
                    return null;
                }
                if (!TextUtils.isEmpty(b5.optString("userlevel")) && a5 != 3) {
                    return null;
                }
            } else if (b5.length() == 2 && b5.optJSONObject(com.umeng.analytics.pro.d.L) != null && !TextUtils.isEmpty(b5.optString("userlevel")) && a5 != 3) {
                return null;
            }
            String optString = b5.optString(com.umeng.analytics.pro.d.f12492n);
            String optString2 = b5.optString(com.umeng.analytics.pro.d.Z);
            String optString3 = b5.optString("ekv");
            if (TextUtils.isEmpty(optString) && TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString3) && a(b5)) {
                return null;
            }
        } else if (a5 != 3) {
            return null;
        }
        JSONObject l5 = l();
        if (l5 != null) {
            c(l5);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (a5 == 3) {
                jSONObject2.put("analytics", new JSONObject());
            } else if (b5.length() > 0) {
                jSONObject2.put("analytics", b5);
            }
            if (l5 != null && l5.length() > 0) {
                jSONObject.put("header", l5);
            }
            if (jSONObject2.length() > 0) {
                jSONObject.put("content", jSONObject2);
            }
            return a(jSONObject, j5);
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    private JSONObject a(JSONObject jSONObject, long j5) {
        try {
            if (q.a(jSONObject) <= j5) {
                return jSONObject;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("header");
            jSONObject2.put(com.umeng.analytics.pro.d.aH, q.a(jSONObject));
            jSONObject.put("header", jSONObject2);
            return q.a(f12665a, j5, jSONObject);
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    private boolean a(long j5, int i5) {
        if (j5 == 0) {
            return true;
        }
        if (System.currentTimeMillis() - j5 <= 28800000) {
            return i5 < 5000;
        }
        o();
        return true;
    }

    public void a(Object obj) {
        if (obj != null) {
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.length() > 0) {
                    if (jSONObject.has("exception")) {
                        if (101 != jSONObject.getInt("exception")) {
                            g(jSONObject);
                        }
                    } else {
                        g(jSONObject);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void a(Object obj, boolean z4) {
        if (z4) {
            if (d(true)) {
                i();
            }
        } else if (UMEnvelopeBuild.isOnline(f12665a) && d(true)) {
            i();
        }
    }
}
