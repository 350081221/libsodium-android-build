package y0;

import a1.e;
import a1.n;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.umeng.analytics.pro.bi;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {
    public static final String A = "act_info";
    public static final String B = "UTF-8";
    public static final String C = "new_external_info==";

    /* renamed from: m, reason: collision with root package name */
    public static final String f22645m = "\"&";

    /* renamed from: n, reason: collision with root package name */
    public static final String f22646n = "&";

    /* renamed from: o, reason: collision with root package name */
    public static final String f22647o = "bizcontext=\"";

    /* renamed from: p, reason: collision with root package name */
    public static final String f22648p = "bizcontext=";

    /* renamed from: q, reason: collision with root package name */
    public static final String f22649q = "\"";

    /* renamed from: r, reason: collision with root package name */
    public static final String f22650r = "appkey";

    /* renamed from: s, reason: collision with root package name */
    public static final String f22651s = "ty";

    /* renamed from: t, reason: collision with root package name */
    public static final String f22652t = "sv";

    /* renamed from: u, reason: collision with root package name */
    public static final String f22653u = "an";

    /* renamed from: v, reason: collision with root package name */
    public static final String f22654v = "setting";

    /* renamed from: w, reason: collision with root package name */
    public static final String f22655w = "av";

    /* renamed from: x, reason: collision with root package name */
    public static final String f22656x = "sdk_start_time";

    /* renamed from: y, reason: collision with root package name */
    public static final String f22657y = "extInfo";

    /* renamed from: z, reason: collision with root package name */
    public static final String f22658z = "ap_link_token";

    /* renamed from: a, reason: collision with root package name */
    public String f22659a;

    /* renamed from: b, reason: collision with root package name */
    public String f22660b;

    /* renamed from: c, reason: collision with root package name */
    public Context f22661c;

    /* renamed from: d, reason: collision with root package name */
    public final String f22662d;

    /* renamed from: e, reason: collision with root package name */
    public final long f22663e;

    /* renamed from: f, reason: collision with root package name */
    public final int f22664f;

    /* renamed from: g, reason: collision with root package name */
    public final String f22665g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f22666h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f22667i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f22668j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ActivityInfo f22669k;

    /* renamed from: l, reason: collision with root package name */
    public final i0.b f22670l;

    /* renamed from: y0.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0667a {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap<UUID, a> f22671a = new HashMap<>();

        /* renamed from: b, reason: collision with root package name */
        public static final HashMap<String, a> f22672b = new HashMap<>();

        /* renamed from: c, reason: collision with root package name */
        public static final String f22673c = "i_uuid_b_c";

        public static a a(Intent intent) {
            if (intent == null) {
                return null;
            }
            Serializable serializableExtra = intent.getSerializableExtra(f22673c);
            if (!(serializableExtra instanceof UUID)) {
                return null;
            }
            return f22671a.remove((UUID) serializableExtra);
        }

        public static a b(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return f22672b.remove(str);
        }

        public static void c(a aVar, Intent intent) {
            if (aVar != null && intent != null) {
                UUID randomUUID = UUID.randomUUID();
                f22671a.put(randomUUID, aVar);
                intent.putExtra(f22673c, randomUUID);
            }
        }

        public static void d(a aVar, String str) {
            if (aVar != null && !TextUtils.isEmpty(str)) {
                f22672b.put(str, aVar);
            }
        }
    }

    public a(Context context, String str, String str2) {
        String str3;
        this.f22659a = "";
        this.f22660b = "";
        this.f22661c = null;
        boolean isEmpty = TextUtils.isEmpty(str2);
        this.f22670l = new i0.b(context, isEmpty);
        String j5 = j(str, this.f22660b);
        this.f22662d = j5;
        this.f22663e = SystemClock.elapsedRealtime();
        this.f22664f = n.Z();
        ActivityInfo g5 = n.g(context);
        this.f22669k = g5;
        this.f22665g = str2;
        if (!isEmpty) {
            i0.a.d(this, i0.b.f16157l, "eptyp", str2 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + j5);
            if (g5 != null) {
                str3 = g5.name + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + g5.launchMode;
            } else {
                str3 = "null";
            }
            i0.a.d(this, i0.b.f16157l, "actInfo", str3);
            i0.a.d(this, i0.b.f16157l, NotificationCompat.CATEGORY_SYSTEM, n.n(this));
            i0.a.d(this, i0.b.f16157l, "sdkv", "9eef93b-clean");
        }
        try {
            this.f22661c = context.getApplicationContext();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            this.f22659a = packageInfo.versionName;
            this.f22660b = packageInfo.packageName;
        } catch (Exception e5) {
            e.d(e5);
        }
        if (!isEmpty) {
            i0.a.c(this, i0.b.f16157l, bi.aK + n.Z());
            i0.a.d(this, i0.b.f16157l, i0.b.Q, "" + SystemClock.elapsedRealtime());
            i0.a.b(context, this, str, this.f22662d);
        }
        if (!isEmpty && m0.a.J().z()) {
            m0.a.J().h(this, this.f22661c, true, 2);
        }
    }

    private String c(String str, String str2) {
        return str + e(new JSONObject()) + str2;
    }

    private String d(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(str2);
        for (int i5 = 0; i5 < split.length; i5++) {
            if (!TextUtils.isEmpty(split[i5]) && split[i5].startsWith(str3)) {
                return split[i5];
            }
        }
        return null;
    }

    public static HashMap<String, String> f(a aVar) {
        HashMap<String, String> hashMap = new HashMap<>();
        if (aVar != null) {
            hashMap.put(HiAnalyticsConstant.BI_KEY_SDK_VER, "15.8.17");
            hashMap.put("app_name", aVar.f22660b);
            hashMap.put("token", aVar.f22662d);
            hashMap.put("call_type", aVar.f22665g);
            hashMap.put("ts_api_invoke", String.valueOf(aVar.f22663e));
            a1.a.d(aVar, hashMap);
        }
        return hashMap;
    }

    private String i(String str) throws JSONException {
        return e(new JSONObject(str));
    }

    public static String j(String str, String str2) {
        try {
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[4];
            if (str == null) {
                str = "";
            }
            objArr[0] = str;
            if (str2 == null) {
                str2 = "";
            }
            objArr[1] = str2;
            objArr[2] = Long.valueOf(System.currentTimeMillis());
            objArr[3] = UUID.randomUUID().toString();
            return String.format("EP%s%s_%s", "1", n.b0(String.format(locale, "%s%s%d%s", objArr)), Long.valueOf(System.currentTimeMillis()));
        } catch (Throwable unused) {
            return "-";
        }
    }

    private String k(String str, String str2, String str3) throws JSONException {
        JSONObject jSONObject;
        String substring = str.substring(str2.length());
        boolean z4 = false;
        String substring2 = substring.substring(0, substring.length() - str3.length());
        if (substring2.length() >= 2 && substring2.startsWith("\"") && substring2.endsWith("\"")) {
            jSONObject = new JSONObject(substring2.substring(1, substring2.length() - 1));
            z4 = true;
        } else {
            jSONObject = new JSONObject(substring2);
        }
        String e5 = e(jSONObject);
        if (z4) {
            e5 = "\"" + e5 + "\"";
        }
        return str2 + e5 + str3;
    }

    private String n(String str) {
        try {
            String d5 = d(str, "&", f22648p);
            if (TextUtils.isEmpty(d5)) {
                str = str + "&" + c(f22648p, "");
            } else {
                int indexOf = str.indexOf(d5);
                str = str.substring(0, indexOf) + k(d5, f22648p, "") + str.substring(indexOf + d5.length());
            }
        } catch (Throwable th) {
            i0.a.f(this, i0.b.f16157l, "fmt1", th, str);
        }
        return str;
    }

    private String p(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str.substring(19));
            jSONObject.put("bizcontext", i(jSONObject.optString("bizcontext")));
            return C + jSONObject.toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    private String r(String str) {
        try {
            String d5 = d(str, f22645m, f22647o);
            if (TextUtils.isEmpty(d5)) {
                return str + "&" + c(f22647o, "\"");
            }
            if (!d5.endsWith("\"")) {
                d5 = d5 + "\"";
            }
            int indexOf = str.indexOf(d5);
            return str.substring(0, indexOf) + k(d5, f22647o, "\"") + str.substring(indexOf + d5.length());
        } catch (Throwable th) {
            i0.a.f(this, i0.b.f16157l, "fmt2", th, str);
            return str;
        }
    }

    private boolean u(String str) {
        return !str.contains(f22645m);
    }

    private JSONObject v() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(f22658z, this.f22662d);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public static a w() {
        return null;
    }

    public Context a() {
        return this.f22661c;
    }

    public String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.startsWith(C)) {
            return p(str);
        }
        if (u(str)) {
            return n(str);
        }
        return r(str);
    }

    public String e(JSONObject jSONObject) {
        String str;
        try {
            if (!jSONObject.has("appkey")) {
                jSONObject.put("appkey", k0.a.f19000g);
            }
            if (!jSONObject.has(f22651s)) {
                jSONObject.put(f22651s, "and_lite");
            }
            if (!jSONObject.has(f22652t)) {
                jSONObject.put(f22652t, "h.a.3.8.17");
            }
            if (!jSONObject.has(f22653u)) {
                jSONObject.put(f22653u, this.f22660b);
            }
            if (!jSONObject.has(f22655w)) {
                jSONObject.put(f22655w, this.f22659a);
            }
            if (!jSONObject.has(f22656x)) {
                jSONObject.put(f22656x, System.currentTimeMillis());
            }
            if (!jSONObject.has(f22657y)) {
                jSONObject.put(f22657y, v());
            }
            if (!jSONObject.has(A)) {
                if (this.f22669k != null) {
                    str = this.f22669k.name + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.f22669k.launchMode;
                } else {
                    str = "null";
                }
                jSONObject.put(A, str);
            }
            return jSONObject.toString();
        } catch (Throwable th) {
            i0.a.f(this, i0.b.f16157l, "fmt3", th, String.valueOf(jSONObject));
            e.d(th);
            if (jSONObject != null) {
                return jSONObject.toString();
            }
            return "{}";
        }
    }

    public void g(boolean z4) {
        this.f22667i = z4;
    }

    public String h() {
        return this.f22660b;
    }

    public void l(boolean z4) {
        this.f22666h = z4;
    }

    public String m() {
        return this.f22659a;
    }

    public void o(boolean z4) {
        this.f22668j = z4;
    }

    public boolean q() {
        return this.f22667i;
    }

    public boolean s() {
        return this.f22666h;
    }

    public boolean t() {
        return this.f22668j;
    }
}
