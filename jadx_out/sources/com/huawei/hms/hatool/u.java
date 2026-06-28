package com.huawei.hms.hatool;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public String f8681a;

    /* renamed from: b, reason: collision with root package name */
    public String f8682b;

    /* renamed from: c, reason: collision with root package name */
    public String f8683c;

    /* renamed from: d, reason: collision with root package name */
    public List<q> f8684d;

    /* renamed from: e, reason: collision with root package name */
    public String f8685e;

    public u(String str, String str2, String str3, List<q> list, String str4) {
        this.f8681a = str;
        this.f8682b = str2;
        this.f8683c = str3;
        this.f8684d = list;
        this.f8685e = str4;
    }

    public final String a(String str, String str2) {
        String str3;
        String f5 = c.f(str, str2);
        if (TextUtils.isEmpty(f5)) {
            y.a("hmsSdk", "No report address,TAG : %s,TYPE: %s ", str, str2);
            return "";
        }
        if ("oper".equals(str2)) {
            str3 = "{url}/common/hmshioperqrt";
        } else if ("maint".equals(str2)) {
            str3 = "{url}/common/hmshimaintqrt";
        } else {
            if (!"diffprivacy".equals(str2)) {
                return "";
            }
            str3 = "{url}/common/common2";
        }
        return str3.replace("{url}", f5);
    }

    public void a() {
        n0 l0Var;
        o0 c5;
        String str;
        String a5 = a(this.f8681a, this.f8682b);
        if (!TextUtils.isEmpty(a5) || "preins".equals(this.f8682b)) {
            if (!"_hms_config_tag".equals(this.f8681a) && !"_openness_config_tag".equals(this.f8681a)) {
                b();
            }
            C0670r d5 = d();
            if (d5 != null) {
                byte[] a6 = a(d5);
                if (a6.length == 0) {
                    str = "request body is empty";
                } else {
                    l0Var = new i0(a6, a5, this.f8681a, this.f8682b, this.f8685e, this.f8684d);
                    c5 = o0.b();
                }
            } else {
                l0Var = new l0(this.f8684d, this.f8681a, this.f8685e, this.f8682b);
                c5 = o0.c();
            }
            c5.a(l0Var);
            return;
        }
        str = "collectUrl is empty";
        y.e("hmsSdk", str);
    }

    public final byte[] a(C0670r c0670r) {
        String str;
        try {
            JSONObject a5 = c0670r.a();
            if (a5 != null) {
                return t0.a(a5.toString().getBytes("UTF-8"));
            }
            y.e("hmsSdk", "uploadEvents is null");
            return new byte[0];
        } catch (UnsupportedEncodingException unused) {
            str = "sendData(): getBytes - Unsupported coding format!!";
            y.e("hmsSdk", str);
            return new byte[0];
        } catch (JSONException unused2) {
            str = "uploadEvents to json error";
            y.e("hmsSdk", str);
            return new byte[0];
        }
    }

    public final void b() {
        if (q0.a(b.i(), "backup_event", 5242880)) {
            y.d("hmsSdk", "backup file reach max limited size, discard new event ");
            return;
        }
        JSONArray c5 = c();
        String a5 = u0.a(this.f8681a, this.f8682b, this.f8685e);
        y.c("hmsSdk", "Update data cached into backup,spKey: " + a5);
        g0.b(b.i(), "backup_event", a5, c5.toString());
    }

    public final JSONArray c() {
        JSONArray jSONArray = new JSONArray();
        Iterator<q> it = this.f8684d.iterator();
        while (it.hasNext()) {
            try {
                jSONArray.put(it.next().d());
            } catch (JSONException unused) {
                y.c("hmsSdk", "handleEvents: json error,Abandon this data");
            }
        }
        return jSONArray;
    }

    public final C0670r d() {
        return d1.a(this.f8684d, this.f8681a, this.f8682b, this.f8685e, this.f8683c);
    }
}
