package com.umeng.analytics;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.pro.d;
import com.umeng.analytics.pro.i;
import com.umeng.analytics.pro.j;
import com.umeng.analytics.pro.k;
import com.umeng.analytics.pro.l;
import com.umeng.analytics.pro.m;
import com.umeng.analytics.pro.n;
import com.umeng.analytics.pro.o;
import com.umeng.analytics.pro.p;
import com.umeng.analytics.pro.s;
import com.umeng.analytics.pro.t;
import com.umeng.analytics.pro.u;
import com.umeng.analytics.pro.v;
import com.umeng.analytics.pro.y;
import com.umeng.common.ISysListener;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.microedition.khronos.opengles.GL10;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class b implements n, t {
    private static final String A = "umsp_2";
    private static final String B = "umsp_3";
    private static final String C = "umsp_4";
    private static final String D = "umsp_5";

    /* renamed from: a, reason: collision with root package name */
    private static Context f12065a = null;

    /* renamed from: h, reason: collision with root package name */
    private static final String f12066h = "sp_uapp";

    /* renamed from: i, reason: collision with root package name */
    private static final String f12067i = "prepp_uapp";

    /* renamed from: o, reason: collision with root package name */
    private static final int f12068o = 128;

    /* renamed from: p, reason: collision with root package name */
    private static final int f12069p = 256;

    /* renamed from: q, reason: collision with root package name */
    private static String f12070q = "";

    /* renamed from: r, reason: collision with root package name */
    private static String f12071r = "";

    /* renamed from: t, reason: collision with root package name */
    private static final String f12073t = "ekv_bl_ver";

    /* renamed from: w, reason: collision with root package name */
    private static final String f12075w = "ekv_wl_ver";

    /* renamed from: z, reason: collision with root package name */
    private static final String f12076z = "umsp_1";

    /* renamed from: b, reason: collision with root package name */
    private ISysListener f12077b;

    /* renamed from: c, reason: collision with root package name */
    private p f12078c;

    /* renamed from: d, reason: collision with root package name */
    private v f12079d;

    /* renamed from: e, reason: collision with root package name */
    private k f12080e;

    /* renamed from: f, reason: collision with root package name */
    private u f12081f;

    /* renamed from: g, reason: collision with root package name */
    private l f12082g;

    /* renamed from: j, reason: collision with root package name */
    private boolean f12083j;

    /* renamed from: k, reason: collision with root package name */
    private volatile JSONObject f12084k;

    /* renamed from: l, reason: collision with root package name */
    private volatile JSONObject f12085l;

    /* renamed from: m, reason: collision with root package name */
    private volatile JSONObject f12086m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f12087n;

    /* renamed from: u, reason: collision with root package name */
    private com.umeng.analytics.filter.a f12088u;

    /* renamed from: x, reason: collision with root package name */
    private com.umeng.analytics.filter.b f12089x;

    /* renamed from: y, reason: collision with root package name */
    private m f12090y;

    /* renamed from: s, reason: collision with root package name */
    private static final String f12072s = d.ar;

    /* renamed from: v, reason: collision with root package name */
    private static final String f12074v = d.as;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final b f12091a = new b();

        private a() {
        }
    }

    static {
        Context appContext = UMGlobalContext.getAppContext();
        if (appContext != null) {
            f12065a = appContext.getApplicationContext();
        }
    }

    public static b a() {
        return a.f12091a;
    }

    private void i(Context context) {
        try {
            if (context == null) {
                MLog.e("unexpected null context in getNativeSuperProperties");
                return;
            }
            if (f12065a == null) {
                f12065a = context.getApplicationContext();
            }
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            if (this.f12084k == null) {
                this.f12084k = new JSONObject();
            }
            if (this.f12085l == null) {
                this.f12085l = new JSONObject();
            }
            String string = sharedPreferences.getString(f12067i, null);
            if (!TextUtils.isEmpty(string)) {
                try {
                    this.f12086m = new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            if (this.f12086m == null) {
                this.f12086m = new JSONObject();
            }
        } catch (Throwable unused2) {
        }
    }

    public JSONObject b() {
        return this.f12084k;
    }

    public JSONObject c() {
        return this.f12086m;
    }

    public JSONObject d() {
        return this.f12085l;
    }

    public void e() {
        this.f12085l = null;
    }

    public String f() {
        if (!UMUtils.isMainProgress(f12065a)) {
            MLog.e("getOnResumedActivityName can not be called in child process");
            return null;
        }
        return f12070q;
    }

    public String g() {
        if (!UMUtils.isMainProgress(f12065a)) {
            MLog.e("getOnPausedActivityName can not be called in child process");
            return null;
        }
        return f12071r;
    }

    public void h() {
        try {
            Context context = f12065a;
            if (context != null) {
                if (!UMUtils.isMainProgress(context)) {
                    MLog.e("onStartSessionInternal can not be called in child process");
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                Context context2 = f12065a;
                UMWorkDispatch.sendEvent(context2, 4352, CoreProtocol.getInstance(context2), Long.valueOf(currentTimeMillis));
                Context context3 = f12065a;
                UMWorkDispatch.sendEvent(context3, o.a.f12697g, CoreProtocol.getInstance(context3), Long.valueOf(currentTimeMillis));
            }
            ISysListener iSysListener = this.f12077b;
            if (iSysListener != null) {
                iSysListener.onAppResume();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        try {
            Context context = f12065a;
            if (context == null) {
                return;
            }
            if (!UMUtils.isMainProgress(context)) {
                MLog.e("onProfileSignOff can not be called in child process");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ts", currentTimeMillis);
            Context context2 = f12065a;
            UMWorkDispatch.sendEvent(context2, o.a.f12696f, CoreProtocol.getInstance(context2), jSONObject);
            Context context3 = f12065a;
            UMWorkDispatch.sendEvent(context3, o.a.f12705o, CoreProtocol.getInstance(context3), jSONObject);
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.e(" Excepthon  in  onProfileSignOff", th);
            }
        }
    }

    public synchronized void k() {
        Context context;
        try {
            context = f12065a;
        } catch (Throwable unused) {
        }
        if (context == null) {
            return;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.e("unregisterSuperPropertyByCoreProtocol can not be called in child process");
            return;
        }
        if (this.f12084k != null) {
            SharedPreferences.Editor edit = PreferenceWrapper.getDefault(f12065a).edit();
            edit.putString(f12066h, this.f12084k.toString());
            edit.commit();
        } else {
            this.f12084k = new JSONObject();
        }
    }

    public synchronized JSONObject l() {
        Context context;
        try {
            context = f12065a;
        } catch (Throwable unused) {
        }
        if (context == null) {
            return null;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.e("getSuperPropertiesJSONObject can not be called in child process");
            return null;
        }
        if (this.f12084k == null) {
            this.f12084k = new JSONObject();
        }
        return this.f12084k;
    }

    public synchronized void m() {
        try {
            Context context = f12065a;
            if (context != null) {
                if (!UMUtils.isMainProgress(context)) {
                    MLog.e("clearSuperPropertiesByCoreProtocol can not be called in child process");
                } else {
                    SharedPreferences.Editor edit = PreferenceWrapper.getDefault(f12065a).edit();
                    edit.remove(f12066h);
                    edit.commit();
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.umeng.analytics.pro.n
    public void n() {
        UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> onIntoBackground triggered.");
        if (AnalyticsConfig.enable && FieldManager.b()) {
            if (FieldManager.allow(com.umeng.commonsdk.utils.d.D)) {
                if (!UMWorkDispatch.eventHasExist(o.a.B)) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> 退出时发送策略 被触发！");
                    Context context = f12065a;
                    UMWorkDispatch.sendEvent(context, o.a.B, CoreProtocol.getInstance(context), null);
                    return;
                }
                return;
            }
            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> 退出发送策略: 云控控制字关闭。功能不生效");
        }
    }

    private b() {
        this.f12078c = new p();
        this.f12079d = new v();
        this.f12080e = new k();
        this.f12081f = u.a();
        this.f12082g = null;
        this.f12083j = false;
        this.f12084k = null;
        this.f12085l = null;
        this.f12086m = null;
        this.f12087n = false;
        this.f12088u = null;
        this.f12089x = null;
        this.f12090y = null;
        this.f12078c.a(this);
    }

    private boolean e(String str) {
        if (this.f12088u.enabled() && this.f12088u.matchHit(str)) {
            return true;
        }
        if (!this.f12089x.enabled()) {
            return false;
        }
        if (!this.f12089x.matchHit(str)) {
            return true;
        }
        UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> white list match! id = " + str);
        return false;
    }

    public void a(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (f12065a == null) {
                f12065a = context.getApplicationContext();
            }
            if (this.f12088u == null) {
                com.umeng.analytics.filter.a aVar = new com.umeng.analytics.filter.a(f12072s, "ekv_bl_ver");
                this.f12088u = aVar;
                aVar.register(f12065a);
            }
            if (this.f12089x == null) {
                com.umeng.analytics.filter.b bVar = new com.umeng.analytics.filter.b(f12074v, "ekv_wl_ver");
                this.f12089x = bVar;
                bVar.register(f12065a);
            }
            if (UMUtils.isMainProgress(f12065a)) {
                if (!this.f12083j) {
                    this.f12083j = true;
                    i(f12065a);
                }
                synchronized (this) {
                    if (!this.f12087n) {
                        l a5 = l.a(context);
                        this.f12082g = a5;
                        if (a5.a()) {
                            this.f12087n = true;
                        }
                        this.f12090y = m.a();
                        try {
                            m.a(context);
                            this.f12090y.a(this);
                        } catch (Throwable unused) {
                        }
                    }
                }
                if (UMConfigure.isDebugLog()) {
                    UMLog.mutlInfo(j.B, 3, "", null, null);
                }
                UMWorkDispatch.registerConnStateObserver(CoreProtocol.getInstance(f12065a));
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str) {
        if (!UMUtils.isMainProgress(f12065a)) {
            MLog.e("onPageEnd can not be called in child process");
            return;
        }
        try {
            if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION != MobclickAgent.PageMode.LEGACY_AUTO) {
                this.f12079d.b(str);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(Context context) {
        if (context == null) {
            UMLog.aq(j.f12627p, 0, "\\|");
            return;
        }
        if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.AUTO) {
            return;
        }
        if (f12065a == null) {
            f12065a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f12065a)) {
            MLog.e("onPause can not be called in child process");
            return;
        }
        if (UMConfigure.isDebugLog() && !(context instanceof Activity)) {
            UMLog.aq(j.f12628q, 2, "\\|");
        }
        try {
            if (!this.f12083j || !this.f12087n) {
                a(context);
            }
            if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION != MobclickAgent.PageMode.LEGACY_MANUAL) {
                this.f12080e.b(context.getClass().getName());
            }
            i();
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.e("Exception occurred in Mobclick.onRause(). ", th);
            }
        }
        if (UMConfigure.isDebugLog() && (context instanceof Activity)) {
            f12071r = context.getClass().getName();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (f12065a == null) {
                f12065a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f12065a)) {
                MLog.e("onKillProcess can not be called in child process");
                return;
            }
            l lVar = this.f12082g;
            if (lVar != null) {
                lVar.c();
            }
            l.a(context, "onKillProcess");
            k kVar = this.f12080e;
            if (kVar != null) {
                kVar.b();
            }
            v vVar = this.f12079d;
            if (vVar != null) {
                vVar.b();
            }
            Context context2 = f12065a;
            if (context2 != null) {
                u uVar = this.f12081f;
                if (uVar != null) {
                    uVar.c(context2, Long.valueOf(System.currentTimeMillis()));
                }
                o.a(f12065a).d();
                v.a(f12065a);
                if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.AUTO) {
                    l.c(f12065a);
                }
                PreferenceWrapper.getDefault(f12065a).edit().commit();
            }
        } catch (Throwable unused) {
        }
    }

    public synchronized void f(Context context) {
        if (context == null) {
            UMLog.aq(j.ah, 0, "\\|");
            return;
        }
        if (f12065a == null) {
            f12065a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f12065a)) {
            MLog.e("clearSuperProperties can not be called in child process");
            return;
        }
        if (!this.f12083j || !this.f12087n) {
            a(f12065a);
        }
        this.f12084k = new JSONObject();
        Context context2 = f12065a;
        UMWorkDispatch.sendEvent(context2, o.a.f12711u, CoreProtocol.getInstance(context2), null);
    }

    public synchronized void g(Context context) {
        if (context == null) {
            UMLog.aq(j.ap, 0, "\\|");
            return;
        }
        if (f12065a == null) {
            f12065a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f12065a)) {
            MLog.e("clearPreProperties can not be called in child process");
            return;
        }
        if (!this.f12083j || !this.f12087n) {
            a(f12065a);
        }
        if (this.f12086m.length() > 0) {
            Context context2 = f12065a;
            UMWorkDispatch.sendEvent(context2, o.a.f12715y, CoreProtocol.getInstance(context2), null);
        }
        this.f12086m = new JSONObject();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Context context) {
        if (context == null) {
            MLog.e("unexpected null context in onResume");
            return;
        }
        if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.AUTO) {
            return;
        }
        if (f12065a == null) {
            f12065a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f12065a)) {
            MLog.e("onResume can not be called in child process");
            return;
        }
        if (UMConfigure.isDebugLog() && !(context instanceof Activity)) {
            UMLog.aq(j.f12626o, 2, "\\|");
        }
        try {
            if (!this.f12083j || !this.f12087n) {
                a(context);
            }
            if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION != MobclickAgent.PageMode.LEGACY_MANUAL) {
                this.f12080e.a(context.getClass().getName());
            }
            h();
            if (UMConfigure.isDebugLog() && (context instanceof Activity)) {
                f12070q = context.getClass().getName();
            }
        } catch (Throwable th) {
            MLog.e("Exception occurred in Mobclick.onResume(). ", th);
        }
    }

    public synchronized Object e(Context context, String str) {
        if (context == null) {
            UMLog.aq(j.ai, 0, "\\|");
            return null;
        }
        if (f12065a == null) {
            f12065a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f12065a)) {
            MLog.e("getSuperProperty can not be called in child process");
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            UMLog.aq(j.ag, 0, "\\|");
            return null;
        }
        if (!str.equals(f12076z) && !str.equals(A) && !str.equals(B) && !str.equals(C) && !str.equals(D)) {
            MLog.e("please check key or value, must be correct!");
            return null;
        }
        if (this.f12084k != null) {
            if (this.f12084k.has(str)) {
                return this.f12084k.opt(str);
            }
        } else {
            this.f12084k = new JSONObject();
        }
        return null;
    }

    public synchronized JSONObject h(Context context) {
        if (context == null) {
            UMLog.aq(j.aq, 0, "\\|");
            return null;
        }
        if (f12065a == null) {
            f12065a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f12065a)) {
            MLog.e("getPreProperties can not be called in child process");
            return null;
        }
        if (!this.f12083j || !this.f12087n) {
            a(f12065a);
        }
        if (this.f12086m == null) {
            this.f12086m = new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        if (this.f12086m.length() > 0) {
            try {
                jSONObject = new JSONObject(this.f12086m.toString());
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public void i() {
        try {
            Context context = f12065a;
            if (context != null) {
                if (!UMUtils.isMainProgress(context)) {
                    MLog.e("onEndSessionInternal can not be called in child process");
                    return;
                }
                Context context2 = f12065a;
                UMWorkDispatch.sendEvent(context2, o.a.f12698h, CoreProtocol.getInstance(context2), Long.valueOf(System.currentTimeMillis()));
                Context context3 = f12065a;
                UMWorkDispatch.sendEvent(context3, 4100, CoreProtocol.getInstance(context3), null);
                Context context4 = f12065a;
                UMWorkDispatch.sendEvent(context4, 4099, CoreProtocol.getInstance(context4), null);
                Context context5 = f12065a;
                UMWorkDispatch.sendEvent(context5, o.a.f12699i, CoreProtocol.getInstance(context5), null);
            }
        } catch (Throwable unused) {
        }
        ISysListener iSysListener = this.f12077b;
        if (iSysListener != null) {
            iSysListener.onAppPause();
        }
    }

    public synchronized void f(Context context, String str) {
        if (context == null) {
            UMLog.aq(j.an, 0, "\\|");
            return;
        }
        if (f12065a == null) {
            f12065a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f12065a)) {
            MLog.e("unregisterPreProperty can not be called in child process");
            return;
        }
        if (!this.f12083j || !this.f12087n) {
            a(f12065a);
        }
        if (this.f12086m == null) {
            this.f12086m = new JSONObject();
        }
        if (str != null && str.length() > 0) {
            if (this.f12086m.has(str)) {
                this.f12086m.remove(str);
                Context context2 = f12065a;
                UMWorkDispatch.sendEvent(context2, 8200, CoreProtocol.getInstance(context2), this.f12086m.toString());
            } else if (UMConfigure.isDebugLog()) {
                UMLog.aq(j.ao, 0, "\\|");
            }
            return;
        }
        MLog.e("please check propertics, property is null!");
    }

    private boolean g(String str) {
        if (str != null) {
            try {
                int length = str.trim().getBytes().length;
                if (length >= 0 && length < 256) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        MLog.e("The length of profile value must be less than 256 bytes.");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(Context context, String str) {
        if (context == null) {
            UMLog.aq(j.f12637z, 0, "\\|");
            return;
        }
        if (f12065a == null) {
            f12065a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f12065a)) {
            MLog.e("setSecret can not be called in child process");
            return;
        }
        if (!this.f12083j || !this.f12087n) {
            a(f12065a);
        }
        AnalyticsConfig.a(f12065a, str);
    }

    public synchronized void d(Context context, String str) {
        try {
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (context == null) {
            UMLog.aq(j.ah, 0, "\\|");
            return;
        }
        if (f12065a == null) {
            f12065a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f12065a)) {
            MLog.e("unregisterSuperProperty can not be called in child process");
            return;
        }
        if (!this.f12083j || !this.f12087n) {
            a(f12065a);
        }
        if (TextUtils.isEmpty(str)) {
            UMLog.aq(j.ag, 0, "\\|");
            return;
        }
        if (!str.equals(f12076z) && !str.equals(A) && !str.equals(B) && !str.equals(C) && !str.equals(D)) {
            MLog.e("please check key or value, must be correct!");
            return;
        }
        if (this.f12084k == null) {
            this.f12084k = new JSONObject();
        }
        if (this.f12084k.has(str)) {
            this.f12084k.remove(str);
            Context context2 = f12065a;
            UMWorkDispatch.sendEvent(context2, 8197, CoreProtocol.getInstance(context2), str);
        }
    }

    public void b(Context context, String str) {
        try {
            if (context == null) {
                UMLog.aq(j.N, 0, "\\|");
                return;
            }
            if (f12065a == null) {
                f12065a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f12065a)) {
                MLog.e("onDeepLinkReceived can not be called in child process");
                return;
            }
            if (!this.f12083j || !this.f12087n) {
                a(f12065a);
            }
            if (!TextUtils.isEmpty(str)) {
                HashMap hashMap = new HashMap();
                hashMap.put(d.aK, str);
                a(f12065a, d.aJ, (Map<String, Object>) hashMap, -1L, false);
                return;
            }
            UMLog.aq(j.O, 0, "\\|");
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.e(th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        if (!UMUtils.isMainProgress(f12065a)) {
            MLog.e("onPageStart can not be called in child process");
            return;
        }
        try {
            if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION != MobclickAgent.PageMode.LEGACY_AUTO) {
                this.f12079d.a(str);
            }
        } catch (Throwable unused) {
        }
    }

    private boolean c(String str, Object obj) {
        int i5;
        if (TextUtils.isEmpty(str)) {
            MLog.e("key is " + str + ", please check key, illegal");
            return false;
        }
        try {
            i5 = str.getBytes("UTF-8").length;
        } catch (UnsupportedEncodingException unused) {
            i5 = 0;
        }
        if (i5 > 128) {
            MLog.e("key length is " + i5 + ", please check key, illegal");
            return false;
        }
        if (obj instanceof String) {
            if (((String) obj).getBytes("UTF-8").length <= 256) {
                return true;
            }
            MLog.e("value length is " + ((String) obj).getBytes("UTF-8").length + ", please check value, illegal");
            return false;
        }
        if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof Float)) {
            return true;
        }
        MLog.e("value is " + obj + ", please check value, type illegal");
        return false;
    }

    public synchronized String e(Context context) {
        if (context == null) {
            UMLog.aq(j.ai, 0, "\\|");
            return null;
        }
        if (f12065a == null) {
            f12065a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f12065a)) {
            MLog.e("getSuperProperties can not be called in child process");
            return null;
        }
        if (this.f12084k != null) {
            return this.f12084k.toString();
        }
        this.f12084k = new JSONObject();
        return null;
    }

    public void a(ISysListener iSysListener) {
        if (!UMUtils.isMainProgress(f12065a)) {
            MLog.e("setSysListener can not be called in child process");
        } else {
            this.f12077b = iSysListener;
        }
    }

    public void a(Context context, int i5) {
        if (context == null) {
            MLog.e("unexpected null context in setVerticalType");
            return;
        }
        if (f12065a == null) {
            f12065a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f12065a)) {
            MLog.e("setVerticalType can not be called in child process");
            return;
        }
        if (!this.f12083j || !this.f12087n) {
            a(f12065a);
        }
        AnalyticsConfig.a(f12065a, i5);
    }

    private void b(String str, Object obj) {
        try {
            if (this.f12084k == null) {
                this.f12084k = new JSONObject();
            }
            int i5 = 0;
            if (obj.getClass().isArray()) {
                if (obj instanceof String[]) {
                    String[] strArr = (String[]) obj;
                    if (strArr.length > 10) {
                        return;
                    }
                    JSONArray jSONArray = new JSONArray();
                    while (i5 < strArr.length) {
                        String str2 = strArr[i5];
                        if (str2 != null && !HelperUtils.checkStrLen(str2, 256)) {
                            jSONArray.put(strArr[i5]);
                        }
                        i5++;
                    }
                    this.f12084k.put(str, jSONArray);
                    return;
                }
                if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    JSONArray jSONArray2 = new JSONArray();
                    while (i5 < jArr.length) {
                        jSONArray2.put(jArr[i5]);
                        i5++;
                    }
                    this.f12084k.put(str, jSONArray2);
                    return;
                }
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    JSONArray jSONArray3 = new JSONArray();
                    while (i5 < iArr.length) {
                        jSONArray3.put(iArr[i5]);
                        i5++;
                    }
                    this.f12084k.put(str, jSONArray3);
                    return;
                }
                if (obj instanceof float[]) {
                    float[] fArr = (float[]) obj;
                    JSONArray jSONArray4 = new JSONArray();
                    while (i5 < fArr.length) {
                        jSONArray4.put(fArr[i5]);
                        i5++;
                    }
                    this.f12084k.put(str, jSONArray4);
                    return;
                }
                if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    JSONArray jSONArray5 = new JSONArray();
                    while (i5 < dArr.length) {
                        jSONArray5.put(dArr[i5]);
                        i5++;
                    }
                    this.f12084k.put(str, jSONArray5);
                    return;
                }
                if (obj instanceof short[]) {
                    short[] sArr = (short[]) obj;
                    JSONArray jSONArray6 = new JSONArray();
                    while (i5 < sArr.length) {
                        jSONArray6.put((int) sArr[i5]);
                        i5++;
                    }
                    this.f12084k.put(str, jSONArray6);
                    return;
                }
                return;
            }
            if (obj instanceof List) {
                List list = (List) obj;
                JSONArray jSONArray7 = new JSONArray();
                while (i5 < list.size()) {
                    Object obj2 = list.get(i5);
                    if ((obj2 instanceof String) || (obj2 instanceof Long) || (obj2 instanceof Integer) || (obj2 instanceof Float) || (obj2 instanceof Double) || (obj2 instanceof Short)) {
                        jSONArray7.put(list.get(i5));
                    }
                    i5++;
                }
                this.f12084k.put(str, jSONArray7);
                return;
            }
            if ((obj instanceof String) || (obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Float) || (obj instanceof Double) || (obj instanceof Short)) {
                this.f12084k.put(str, obj);
            }
        } catch (Throwable unused) {
        }
    }

    private boolean f(String str) {
        if (str != null) {
            try {
                int length = str.trim().getBytes().length;
                if (length > 0 && length < 128) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        MLog.e("The length of profile key must be less than 128 bytes.");
        return false;
    }

    public void c(String str) {
        if (g(str)) {
            a(d.O, (Object) str);
        }
    }

    public void a(Context context, String str, HashMap<String, Object> hashMap) {
        if (context == null) {
            return;
        }
        try {
            if (f12065a == null) {
                f12065a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f12065a)) {
                MLog.e("onGKVEvent can not be called in child process");
                return;
            }
            if (!this.f12083j || !this.f12087n) {
                a(f12065a);
            }
            String str2 = "";
            if (this.f12084k == null) {
                this.f12084k = new JSONObject();
            } else {
                str2 = this.f12084k.toString();
            }
            s.a(f12065a).a(str, hashMap, str2);
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.e(th);
            }
        }
    }

    public void d(String str) {
        if (g(str)) {
            a(d.P, (Object) str);
        }
    }

    void a(Context context, String str) {
        if (context == null) {
            UMLog.aq(j.f12634w, 0, "\\|");
            return;
        }
        if (f12065a == null) {
            f12065a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f12065a)) {
            MLog.e("reportError can not be called in child process");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            if (UMConfigure.isDebugLog()) {
                UMLog.aq(j.f12635x, 0, "\\|");
                return;
            }
            return;
        }
        try {
            if (!this.f12083j || !this.f12087n) {
                a(f12065a);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ts", System.currentTimeMillis());
            jSONObject.put(d.W, 2);
            jSONObject.put(d.X, str);
            jSONObject.put("__ii", this.f12081f.c());
            Context context2 = f12065a;
            UMWorkDispatch.sendEvent(context2, o.a.f12700j, CoreProtocol.getInstance(context2), jSONObject);
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.e(th);
            }
        }
    }

    void a(Context context, Throwable th) {
        if (context != null && th != null) {
            if (f12065a == null) {
                f12065a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f12065a)) {
                MLog.e("reportError can not be called in child process");
                return;
            }
            try {
                if (!this.f12083j || !this.f12087n) {
                    a(f12065a);
                }
                a(f12065a, DataHelper.convertExceptionToString(th));
                return;
            } catch (Exception e5) {
                if (MLog.DEBUG) {
                    MLog.e(e5);
                    return;
                }
                return;
            }
        }
        UMLog.aq(j.f12636y, 0, "\\|");
    }

    public void a(Context context, String str, String str2, long j5, int i5) {
        if (context == null) {
            return;
        }
        try {
            if (f12065a == null) {
                f12065a = context.getApplicationContext();
            }
            if (!this.f12083j || !this.f12087n) {
                a(f12065a);
            }
            if (e(str)) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> filter ekv [" + str + "].");
                return;
            }
            String str3 = "";
            if (this.f12084k == null) {
                this.f12084k = new JSONObject();
            } else {
                str3 = this.f12084k.toString();
            }
            s.a(f12065a).a(str, str2, j5, i5, str3);
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.e(th);
            }
        }
    }

    public synchronized void b(Object obj) {
        Context context;
        try {
            context = f12065a;
        } catch (Throwable unused) {
        }
        if (context == null) {
            return;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.e("updateNativePrePropertiesByCoreProtocol can not be called in child process");
            return;
        }
        SharedPreferences.Editor edit = PreferenceWrapper.getDefault(f12065a).edit();
        if (obj != null) {
            String str = (String) obj;
            if (edit != null && !TextUtils.isEmpty(str)) {
                edit.putString(f12067i, str).commit();
            }
        } else if (edit != null) {
            edit.remove(f12067i).commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Context context, String str, Map<String, Object> map, long j5) {
        try {
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.e(th);
            }
        }
        if (!TextUtils.isEmpty(str)) {
            if (Arrays.asList(d.aL).contains(str)) {
                UMLog.aq(j.f12613b, 0, "\\|");
                return;
            }
            if (map.isEmpty()) {
                UMLog.aq(j.f12615d, 0, "\\|");
                return;
            }
            Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (Arrays.asList(d.aL).contains(it.next().getKey())) {
                    UMLog.aq(j.f12616e, 0, "\\|");
                    return;
                }
            }
            a(context, str, map, j5, false);
            return;
        }
        UMLog.aq(j.f12614c, 0, "\\|");
    }

    public void a(Context context, String str, Map<String, Object> map) {
        a(context, str, map, -1L, true);
    }

    private void a(Context context, String str, Map<String, Object> map, long j5, boolean z4) {
        try {
            if (context == null) {
                MLog.e("context is null in onEventNoCheck, please check!");
                return;
            }
            if (f12065a == null) {
                f12065a = context.getApplicationContext();
            }
            if (!this.f12083j || !this.f12087n) {
                a(f12065a);
            }
            if (e(str)) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> filter ekv [" + str + "].");
                return;
            }
            String str2 = "";
            if (this.f12084k == null) {
                this.f12084k = new JSONObject();
            } else {
                str2 = this.f12084k.toString();
            }
            s.a(f12065a).a(str, map, j5, str2, z4);
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.e(th);
            }
        }
    }

    @Override // com.umeng.analytics.pro.t
    public void a(Throwable th) {
        try {
            Context context = f12065a;
            if (context == null) {
                return;
            }
            if (!UMUtils.isMainProgress(context)) {
                MLog.e("onAppCrash can not be called in child process");
                return;
            }
            if (AnalyticsConfig.enable) {
                v vVar = this.f12079d;
                if (vVar != null) {
                    vVar.b();
                }
                l.a(f12065a, "onAppCrash");
                k kVar = this.f12080e;
                if (kVar != null) {
                    kVar.b();
                }
                l lVar = this.f12082g;
                if (lVar != null) {
                    lVar.c();
                }
                u uVar = this.f12081f;
                if (uVar != null) {
                    uVar.c(f12065a, Long.valueOf(System.currentTimeMillis()));
                }
                if (th != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("ts", System.currentTimeMillis());
                    jSONObject.put(d.W, 1);
                    jSONObject.put(d.X, DataHelper.convertExceptionToString(th));
                    i.a(f12065a).a(this.f12081f.c(), jSONObject.toString(), 1);
                }
                o.a(f12065a).d();
                v.a(f12065a);
                if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.AUTO) {
                    l.c(f12065a);
                }
                PreferenceWrapper.getDefault(f12065a).edit().commit();
            }
        } catch (Exception e5) {
            if (MLog.DEBUG) {
                MLog.e("Exception in onAppCrash", e5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, String str2) {
        try {
            Context context = f12065a;
            if (context == null) {
                return;
            }
            if (!UMUtils.isMainProgress(context)) {
                MLog.e("onProfileSignIn can not be called in child process");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("provider", str);
            jSONObject.put("uid", str2);
            jSONObject.put("ts", currentTimeMillis);
            Context context2 = f12065a;
            UMWorkDispatch.sendEvent(context2, o.a.f12695e, CoreProtocol.getInstance(context2), jSONObject);
            Context context3 = f12065a;
            UMWorkDispatch.sendEvent(context3, o.a.f12705o, CoreProtocol.getInstance(context3), jSONObject);
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.e(" Excepthon  in  onProfileSignIn", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z4) {
        Context context = f12065a;
        if (context == null) {
            return;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.e("setCatchUncaughtExceptions can not be called in child process");
        } else {
            if (AnalyticsConfig.CHANGE_CATCH_EXCEPTION_NOTALLOW) {
                return;
            }
            AnalyticsConfig.CATCH_EXCEPTION = z4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(GL10 gl10) {
        String[] gpu = UMUtils.getGPU(gl10);
        if (gpu.length == 2) {
            AnalyticsConfig.GPU_VENDER = gpu[0];
            AnalyticsConfig.GPU_RENDERER = gpu[1];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(double d5, double d6) {
        Context context = f12065a;
        if (context == null) {
            return;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.e("setLocation can not be called in child process");
            return;
        }
        if (AnalyticsConfig.f12042a == null) {
            AnalyticsConfig.f12042a = new double[2];
        }
        double[] dArr = AnalyticsConfig.f12042a;
        dArr[0] = d5;
        dArr[1] = d6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Context context, MobclickAgent.EScenarioType eScenarioType) {
        if (context == null) {
            MLog.e("unexpected null context in setScenarioType");
            return;
        }
        if (f12065a == null) {
            f12065a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f12065a)) {
            MLog.e("setScenarioType can not be called in child process");
            return;
        }
        if (eScenarioType != null) {
            a(f12065a, eScenarioType.toValue());
        }
        if (this.f12083j && this.f12087n) {
            return;
        }
        a(f12065a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(long j5) {
        Context context = f12065a;
        if (context == null) {
            return;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.e("setSessionContinueMillis can not be called in child process");
        } else {
            AnalyticsConfig.kContinueSessionMillis = j5;
            y.a().a(AnalyticsConfig.kContinueSessionMillis);
        }
    }

    public synchronized void a(Context context, String str, Object obj) {
        int i5 = 0;
        if (context == null) {
            UMLog.aq(j.af, 0, "\\|");
            return;
        }
        if (f12065a == null) {
            f12065a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f12065a)) {
            MLog.e("registerSuperProperty can not be called in child process");
            return;
        }
        if (!this.f12083j || !this.f12087n) {
            a(f12065a);
        }
        if (!TextUtils.isEmpty(str) && obj != null) {
            if (!str.equals(f12076z) && !str.equals(A) && !str.equals(B) && !str.equals(C) && !str.equals(D)) {
                MLog.e("property name is " + str + ", please check key, must be correct!");
                return;
            }
            if ((obj instanceof String) && !HelperUtils.checkStrLen(obj.toString(), 256)) {
                MLog.e("property value is " + obj + ", please check value, lawless!");
                return;
            }
            try {
                if (this.f12084k == null) {
                    this.f12084k = new JSONObject();
                }
                if (obj.getClass().isArray()) {
                    if (obj instanceof String[]) {
                        String[] strArr = (String[]) obj;
                        if (strArr.length > 10) {
                            MLog.e("please check value, size is " + strArr.length + ", overstep 10!");
                            return;
                        }
                        JSONArray jSONArray = new JSONArray();
                        while (i5 < strArr.length) {
                            String str2 = strArr[i5];
                            if (str2 != null && HelperUtils.checkStrLen(str2, 256)) {
                                jSONArray.put(strArr[i5]);
                                i5++;
                            }
                            MLog.e("please check value, length is " + strArr[i5].length() + ", overlength 256!");
                            return;
                        }
                        this.f12084k.put(str, jSONArray);
                    } else if (obj instanceof long[]) {
                        long[] jArr = (long[]) obj;
                        if (jArr.length > 10) {
                            MLog.e("please check value, size is " + jArr.length + ", overstep 10!");
                            return;
                        }
                        JSONArray jSONArray2 = new JSONArray();
                        while (i5 < jArr.length) {
                            jSONArray2.put(jArr[i5]);
                            i5++;
                        }
                        this.f12084k.put(str, jSONArray2);
                    } else if (obj instanceof int[]) {
                        int[] iArr = (int[]) obj;
                        if (iArr.length > 10) {
                            MLog.e("please check value, size is " + iArr.length + ", overstep 10!");
                            return;
                        }
                        JSONArray jSONArray3 = new JSONArray();
                        while (i5 < iArr.length) {
                            jSONArray3.put(iArr[i5]);
                            i5++;
                        }
                        this.f12084k.put(str, jSONArray3);
                    } else if (obj instanceof float[]) {
                        float[] fArr = (float[]) obj;
                        if (fArr.length > 10) {
                            MLog.e("please check value, size is " + fArr.length + ", overstep 10!");
                            return;
                        }
                        JSONArray jSONArray4 = new JSONArray();
                        while (i5 < fArr.length) {
                            jSONArray4.put(fArr[i5]);
                            i5++;
                        }
                        this.f12084k.put(str, jSONArray4);
                    } else if (obj instanceof double[]) {
                        double[] dArr = (double[]) obj;
                        if (dArr.length > 10) {
                            MLog.e("please check value, size is " + dArr.length + ", overstep 10!");
                            return;
                        }
                        JSONArray jSONArray5 = new JSONArray();
                        while (i5 < dArr.length) {
                            jSONArray5.put(dArr[i5]);
                            i5++;
                        }
                        this.f12084k.put(str, jSONArray5);
                    } else if (obj instanceof short[]) {
                        short[] sArr = (short[]) obj;
                        if (sArr.length > 10) {
                            MLog.e("please check value, size is " + sArr.length + ", overstep 10!");
                            return;
                        }
                        JSONArray jSONArray6 = new JSONArray();
                        while (i5 < sArr.length) {
                            jSONArray6.put((int) sArr[i5]);
                            i5++;
                        }
                        this.f12084k.put(str, jSONArray6);
                    } else {
                        MLog.e("please check value, illegal type!");
                        return;
                    }
                } else {
                    if (!(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Integer) && !(obj instanceof Float) && !(obj instanceof Double) && !(obj instanceof Short)) {
                        MLog.e("please check value, illegal type!");
                        return;
                    }
                    this.f12084k.put(str, obj);
                }
            } catch (Throwable unused) {
            }
            Context context2 = f12065a;
            UMWorkDispatch.sendEvent(context2, o.a.f12710t, CoreProtocol.getInstance(context2), this.f12084k.toString());
            return;
        }
        UMLog.aq(j.ag, 0, "\\|");
    }

    public synchronized void a(Object obj) {
        Context context;
        try {
            context = f12065a;
        } catch (Throwable unused) {
        }
        if (context == null) {
            return;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.e("registerSuperPropertyByCoreProtocol can not be called in child process");
            return;
        }
        if (obj != null) {
            String str = (String) obj;
            SharedPreferences.Editor edit = PreferenceWrapper.getDefault(f12065a).edit();
            if (edit != null && !TextUtils.isEmpty(str)) {
                edit.putString(f12066h, this.f12084k.toString()).commit();
            }
        }
    }

    public synchronized void a(Context context, List<String> list) {
        try {
        } catch (Throwable th) {
            MLog.e(th);
        }
        if (context == null) {
            UMLog.aq(j.aj, 0, "\\|");
            return;
        }
        if (f12065a == null) {
            f12065a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f12065a)) {
            MLog.e("setFirstLaunchEvent can not be called in child process");
            return;
        }
        if (!this.f12083j || !this.f12087n) {
            a(f12065a);
        }
        s.a(f12065a).a(list);
    }

    public synchronized void a(Context context, JSONObject jSONObject) {
        JSONObject jSONObject2;
        String obj;
        Object obj2;
        if (context == null) {
            UMLog.aq(j.al, 0, "\\|");
            return;
        }
        if (f12065a == null) {
            f12065a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f12065a)) {
            MLog.e("registerPreProperties can not be called in child process");
            return;
        }
        if (!this.f12083j || !this.f12087n) {
            a(f12065a);
        }
        if (this.f12086m == null) {
            this.f12086m = new JSONObject();
        }
        if (jSONObject != null && jSONObject.length() > 0) {
            try {
                jSONObject2 = new JSONObject(this.f12086m.toString());
            } catch (Exception unused) {
                jSONObject2 = null;
            }
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            Iterator<String> keys = jSONObject.keys();
            if (keys != null) {
                while (keys.hasNext()) {
                    try {
                        obj = keys.next().toString();
                        obj2 = jSONObject.get(obj);
                    } catch (Exception unused2) {
                    }
                    if (c(obj, obj2)) {
                        jSONObject2.put(obj, obj2);
                        if (jSONObject2.length() > 10) {
                            MLog.e("please check propertics, size overlength!");
                            return;
                        }
                        continue;
                    } else {
                        return;
                    }
                }
            }
            this.f12086m = jSONObject2;
            if (this.f12086m.length() > 0) {
                Context context2 = f12065a;
                UMWorkDispatch.sendEvent(context2, o.a.f12713w, CoreProtocol.getInstance(context2), this.f12086m.toString());
            }
            return;
        }
        UMLog.aq(j.am, 0, "\\|");
    }

    public void a(String str, Object obj) {
        if (f(str)) {
            if (!(obj instanceof String) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Short) && !(obj instanceof Float) && !(obj instanceof Double)) {
                MLog.e("userProfile: Invalid value type, please check!");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(d.S, str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (str2.length() > 0) {
                        str2 = str2.trim();
                    }
                    if (!g(str2)) {
                        return;
                    } else {
                        jSONObject.put(d.T, str2);
                    }
                } else {
                    jSONObject.put(d.T, obj);
                }
                Context context = f12065a;
                UMWorkDispatch.sendEvent(context, o.a.f12707q, CoreProtocol.getInstance(context), jSONObject);
            } catch (Throwable unused) {
            }
        }
    }
}
