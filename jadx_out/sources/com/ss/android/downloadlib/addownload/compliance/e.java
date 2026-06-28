package com.ss.android.downloadlib.addownload.compliance;

import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.ss.android.downloadlib.g.m;
import com.umeng.analytics.pro.bi;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private boolean f9749a;

    /* renamed from: b, reason: collision with root package name */
    private a f9750b;

    /* renamed from: c, reason: collision with root package name */
    private int f9751c;

    /* renamed from: d, reason: collision with root package name */
    private int f9752d;

    /* renamed from: e, reason: collision with root package name */
    private int f9753e = 15;

    /* renamed from: f, reason: collision with root package name */
    private int f9754f;

    /* renamed from: g, reason: collision with root package name */
    private String f9755g;

    /* renamed from: h, reason: collision with root package name */
    private String f9756h;

    /* renamed from: i, reason: collision with root package name */
    private int f9757i;

    /* renamed from: j, reason: collision with root package name */
    private String f9758j;

    /* renamed from: k, reason: collision with root package name */
    private long f9759k;

    /* renamed from: l, reason: collision with root package name */
    private String f9760l;

    /* renamed from: m, reason: collision with root package name */
    private String f9761m;

    /* renamed from: n, reason: collision with root package name */
    private b f9762n;

    /* renamed from: o, reason: collision with root package name */
    private String f9763o;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f9764a;

        /* renamed from: b, reason: collision with root package name */
        private String f9765b;

        /* renamed from: c, reason: collision with root package name */
        private long f9766c;

        /* renamed from: d, reason: collision with root package name */
        private long f9767d;

        /* renamed from: e, reason: collision with root package name */
        private String f9768e;

        /* renamed from: f, reason: collision with root package name */
        private String f9769f;

        /* renamed from: g, reason: collision with root package name */
        private List<C0184a> f9770g;

        /* renamed from: h, reason: collision with root package name */
        private String f9771h;

        /* renamed from: i, reason: collision with root package name */
        private String f9772i;

        /* renamed from: j, reason: collision with root package name */
        private String f9773j;

        /* renamed from: k, reason: collision with root package name */
        private String f9774k;

        /* renamed from: l, reason: collision with root package name */
        private String f9775l;

        /* renamed from: com.ss.android.downloadlib.addownload.compliance.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0184a {

            /* renamed from: a, reason: collision with root package name */
            private String f9776a;

            /* renamed from: b, reason: collision with root package name */
            private String f9777b;

            public void a(String str) {
                this.f9776a = str;
            }

            public void b(String str) {
                this.f9777b = str;
            }
        }

        public void a(String str) {
            this.f9764a = str;
        }

        public void b(String str) {
            this.f9765b = str;
        }

        public void c(String str) {
            this.f9768e = str;
        }

        public void d(String str) {
            this.f9769f = str;
        }

        public void e(String str) {
            this.f9771h = str;
        }

        public void f(String str) {
            this.f9772i = str;
        }

        public void g(String str) {
            this.f9773j = str;
        }

        public void h(String str) {
            this.f9774k = str;
        }

        public void i(String str) {
            this.f9775l = str;
        }

        public void a(long j5) {
            this.f9766c = j5;
        }

        public void b(long j5) {
            this.f9767d = j5;
        }

        public void a(List<C0184a> list) {
            this.f9770g = list;
        }
    }

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private int f9778a;

        /* renamed from: b, reason: collision with root package name */
        private String f9779b;

        public void a(int i5) {
            this.f9778a = i5;
        }

        public void a(String str) {
            this.f9779b = str;
        }
    }

    public static e g(String str) {
        e eVar = new e();
        try {
            JSONObject jSONObject = new JSONObject(str);
            a a5 = a(jSONObject);
            b b5 = b(jSONObject);
            eVar.a(a5);
            eVar.a(b5);
            boolean z4 = false;
            if (jSONObject.optInt("show_auth", 0) == 1) {
                z4 = true;
            }
            eVar.a(z4);
            eVar.a(jSONObject.optInt("download_permit"));
            eVar.b(jSONObject.optInt("appstore_permit"));
            eVar.c(jSONObject.optInt("market_online_status", 15));
            eVar.d(jSONObject.optInt("hijack_permit"));
            eVar.a(jSONObject.optString(bi.f12269o));
            eVar.b(jSONObject.optString("hijack_url"));
            eVar.e(jSONObject.optInt(PluginConstants.KEY_ERROR_CODE));
            eVar.c(jSONObject.optString(CrashHianalyticsData.MESSAGE));
            eVar.a(jSONObject.optLong("request_duration", 0L));
            eVar.d(jSONObject.optString("back_web_url"));
            eVar.e(jSONObject.optString("hw_app_id"));
            eVar.f(jSONObject.optString("deep_link"));
        } catch (Exception e5) {
            com.ss.android.downloadlib.e.c.a().a(e5, "ComplianceResult fromJson");
        }
        return eVar;
    }

    public void a(boolean z4) {
        this.f9749a = z4;
    }

    public void b(int i5) {
        this.f9752d = i5;
    }

    public void c(int i5) {
        this.f9753e = i5;
    }

    public void d(int i5) {
        this.f9754f = i5;
    }

    public void e(int i5) {
        this.f9757i = i5;
    }

    public void f(String str) {
        this.f9761m = str;
    }

    public String toString() {
        return a(this);
    }

    public void a(a aVar) {
        this.f9750b = aVar;
    }

    public void b(String str) {
        this.f9756h = str;
    }

    public void c(String str) {
        this.f9758j = str;
    }

    public void d(String str) {
        this.f9763o = str;
    }

    public void e(String str) {
        this.f9760l = str;
    }

    private static JSONArray c(a aVar) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        List<a.C0184a> list = aVar.f9770g;
        if (list != null && list.size() > 0) {
            for (a.C0184a c0184a : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("permission_name", c0184a.f9776a);
                jSONObject.putOpt("permission_desc", c0184a.f9777b);
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray;
    }

    public void a(int i5) {
        this.f9751c = i5;
    }

    public String b() {
        return this.f9761m;
    }

    private static JSONObject b(a aVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (aVar != null) {
            jSONObject.putOpt("app_name", aVar.f9764a);
            jSONObject.putOpt("version_name", aVar.f9765b);
            jSONObject.putOpt("update_time", Long.valueOf(aVar.f9766c));
            jSONObject.putOpt("size", Long.valueOf(aVar.f9767d));
            jSONObject.putOpt("developer_name", aVar.f9768e);
            jSONObject.putOpt("policy_url", aVar.f9772i);
            jSONObject.putOpt("icon_url", aVar.f9773j);
            jSONObject.putOpt("download_url", aVar.f9774k);
            jSONObject.putOpt("permissions", c(aVar));
            jSONObject.putOpt("permission_classify_url", aVar.f9771h);
            jSONObject.putOpt("desc_url", aVar.f9775l);
        }
        return jSONObject;
    }

    public void a(String str) {
        this.f9755g = str;
    }

    public int a() {
        return this.f9757i;
    }

    public void a(long j5) {
        this.f9759k = j5;
    }

    public void a(b bVar) {
        this.f9762n = bVar;
    }

    public static String a(e eVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("show_auth", Integer.valueOf(eVar.f9749a ? 1 : 0));
            jSONObject.putOpt("download_permit", Integer.valueOf(eVar.f9751c));
            jSONObject.putOpt("appstore_permit", Integer.valueOf(eVar.f9752d));
            jSONObject.putOpt("market_online_status", Integer.valueOf(eVar.f9753e));
            jSONObject.putOpt("hijack_permit", Integer.valueOf(eVar.f9754f));
            jSONObject.putOpt(bi.f12269o, eVar.f9755g);
            jSONObject.putOpt("hijack_url", eVar.f9756h);
            jSONObject.putOpt(PluginConstants.KEY_ERROR_CODE, Integer.valueOf(eVar.f9757i));
            jSONObject.putOpt(CrashHianalyticsData.MESSAGE, eVar.f9758j);
            jSONObject.putOpt("request_duration", Long.valueOf(eVar.f9759k));
            jSONObject.putOpt("auth_info", b(eVar.f9750b));
            jSONObject.putOpt("status", b(eVar.f9762n));
            jSONObject.putOpt("back_web_url", eVar.f9763o);
            jSONObject.putOpt("hw_app_id", eVar.f9760l);
            jSONObject.putOpt("deep_link", eVar.f9761m);
        } catch (JSONException e5) {
            com.ss.android.downloadlib.e.c.a().a(e5, "ComplianceResult toJson");
        }
        return jSONObject.toString();
    }

    private static b b(JSONObject jSONObject) {
        b bVar = new b();
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("status");
            if (optJSONObject != null) {
                bVar.a(optJSONObject.optInt("status"));
                bVar.a(optJSONObject.optString(CrashHianalyticsData.MESSAGE));
            }
        } catch (Exception e5) {
            com.ss.android.downloadlib.e.c.a().a(e5, "ComplianceResult getStatus");
        }
        return bVar;
    }

    private static JSONObject b(b bVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (bVar != null) {
            jSONObject.putOpt("status", Integer.valueOf(bVar.f9778a));
            jSONObject.putOpt(CrashHianalyticsData.MESSAGE, bVar.f9779b);
        }
        return jSONObject;
    }

    private static a a(JSONObject jSONObject) {
        a aVar = new a();
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("auth_info");
            if (optJSONObject != null) {
                aVar.a(optJSONObject.optString("app_name"));
                aVar.b(optJSONObject.optString("version_name"));
                aVar.a(m.a(optJSONObject, "update_time"));
                aVar.b(m.a(optJSONObject, "size"));
                aVar.c(optJSONObject.optString("developer_name"));
                aVar.d(optJSONObject.optString(bi.f12269o));
                JSONArray optJSONArray = optJSONObject.optJSONArray("permissions");
                if (optJSONArray != null) {
                    ArrayList arrayList = new ArrayList();
                    a(optJSONArray, arrayList);
                    aVar.a(arrayList);
                }
                aVar.e(optJSONObject.optString("permission_classify_url"));
                aVar.f(optJSONObject.optString("policy_url"));
                aVar.g(optJSONObject.optString("icon_url"));
                aVar.h(optJSONObject.optString("download_url"));
                aVar.i(optJSONObject.optString("desc_url"));
            }
        } catch (Exception e5) {
            com.ss.android.downloadlib.e.c.a().a(e5, "ComplianceResult getAuthInfo");
        }
        return aVar;
    }

    private static void a(JSONArray jSONArray, List<a.C0184a> list) {
        if (jSONArray == null || list == null) {
            return;
        }
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i5);
            if (optJSONObject != null) {
                a.C0184a c0184a = new a.C0184a();
                c0184a.a(optJSONObject.optString("permission_name"));
                c0184a.b(optJSONObject.optString("permission_desc"));
                list.add(c0184a);
            }
        }
    }
}
