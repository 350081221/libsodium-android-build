package com.tendcloud.tenddata;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huawei.agconnect.apms.collect.model.EventType;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class cz extends cy {

    /* renamed from: a, reason: collision with root package name */
    public static final String f11649a = "TalkingData";

    /* renamed from: c, reason: collision with root package name */
    public static final String f11650c = "SaaS";

    /* renamed from: d, reason: collision with root package name */
    public static final int f11651d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f11652e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f11653f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f11654g = 3;

    /* renamed from: h, reason: collision with root package name */
    public static final int f11655h = 4;

    /* renamed from: i, reason: collision with root package name */
    public static final int f11656i = 5;

    /* renamed from: j, reason: collision with root package name */
    public static final int f11657j = 6;

    /* renamed from: k, reason: collision with root package name */
    public static final int f11658k = 7;

    /* renamed from: l, reason: collision with root package name */
    public static final int f11659l = 8;

    /* renamed from: n, reason: collision with root package name */
    private static String f11660n = "";

    /* renamed from: o, reason: collision with root package name */
    private static int f11661o = 4;

    /* renamed from: m, reason: collision with root package name */
    private final String f11662m = "Android";

    public cz() {
        a("version", (Object) 5);
        a("minorVersion", (Object) 0);
        a("build", (Object) 28);
        if (!y.b(ab.f11366v)) {
            try {
                a("jobNum", Integer.valueOf(Integer.parseInt(ab.f11366v)));
            } catch (Throwable unused) {
            }
        }
        a(i0.b.f16186z0, f11650c);
        a(EventType.PLATFORM, "Android");
        a("type", f11649a);
        a("framework", f11660n);
        int i5 = f11661o;
        if (i5 > 0) {
            a(TypedValues.TransitionType.S_FROM, Integer.valueOf(i5));
        }
    }

    public String a() {
        return f11660n;
    }

    public void setFrameWork(String str) {
        f11660n = str;
    }

    public void setRule(int i5) {
        a("rule", Integer.valueOf(i5));
    }

    public void a(String str, String str2, String str3) {
        JSONArray jSONArray;
        if (this.f11648b.isNull("features")) {
            jSONArray = new JSONArray();
        } else {
            try {
                jSONArray = this.f11648b.getJSONArray("features");
            } catch (JSONException e5) {
                e5.printStackTrace();
                jSONArray = null;
            }
        }
        if (jSONArray != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("name", str);
                jSONObject.put("version", str2);
                jSONObject.put("minorVersion", str3);
                jSONArray.put(jSONObject);
            } catch (JSONException e6) {
                e6.printStackTrace();
            }
            a("features", jSONArray);
        }
    }
}
