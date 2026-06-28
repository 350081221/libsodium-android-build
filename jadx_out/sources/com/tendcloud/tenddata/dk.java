package com.tendcloud.tenddata;

import android.util.EventLogTags;
import android.util.Pair;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class dk {

    /* renamed from: c, reason: collision with root package name */
    private static cw f11694c;

    /* renamed from: d, reason: collision with root package name */
    private static cz f11695d;

    /* renamed from: e, reason: collision with root package name */
    private static dd f11696e = new dd();

    /* renamed from: f, reason: collision with root package name */
    private static da f11697f = null;

    /* renamed from: h, reason: collision with root package name */
    private static volatile dk f11698h = null;

    /* renamed from: a, reason: collision with root package name */
    public JSONObject f11699a = null;

    /* renamed from: b, reason: collision with root package name */
    public JSONObject f11700b = null;

    /* renamed from: g, reason: collision with root package name */
    private dh f11701g = null;

    public static dk b() {
        if (f11698h == null) {
            synchronized (dk.class) {
                if (f11698h == null) {
                    f11698h = new dk();
                }
            }
        }
        return f11698h;
    }

    public synchronized JSONObject a(cv cvVar, boolean z4) {
        return a(cvVar, z4, null);
    }

    public synchronized JSONObject a(cv cvVar, boolean z4, a aVar) {
        return a(cvVar, z4, aVar, null);
    }

    public synchronized JSONObject a(cv cvVar, boolean z4, a aVar, Pair<String, JSONArray> pair) {
        JSONObject jSONObject;
        if (cvVar != null) {
            if (cvVar.b() != null) {
                synchronized (EventLogTags.class) {
                    jSONObject = new JSONObject();
                    try {
                        this.f11699a = new JSONObject();
                        this.f11700b = new JSONObject();
                        try {
                            if (f11694c == null) {
                                f11694c = cw.a();
                                f11694c.setUniqueId(dj.a(ab.f11351g, ab.f11351g.getPackageName()));
                            }
                            f11694c.setSubmitAppId(aVar);
                            f11694c.setSubmitChannelId(aVar);
                            if (f11696e == null) {
                                f11696e = new dd();
                            }
                            dd.f11670a.a();
                            f11696e.c().setSlots(o.B(ab.f11351g));
                            if (f11695d == null) {
                                f11695d = new cz();
                            }
                            f11695d.setRule(ab.T.getRules());
                            if (f11697f == null) {
                                da daVar = new da();
                                f11697f = daVar;
                                daVar.a();
                            }
                        } catch (Throwable unused) {
                        }
                        jSONObject.put("version", "2.0");
                        jSONObject.put("action", cvVar.b());
                        jSONObject.put("device", f11696e.b());
                        jSONObject.put("app", f11694c.b());
                        jSONObject.put(com.umeng.ccg.a.f12839r, f11695d.b());
                        jSONObject.put("appContext", ct.a().b());
                        jSONObject.put("user", f11697f.b());
                        jSONObject.put("sharingFilterPermission", ab.f11365u.ordinal());
                        long currentTimeMillis = System.currentTimeMillis();
                        jSONObject.put("ts", currentTimeMillis);
                        jSONObject.put("fingerprint", y.c(currentTimeMillis + dj.a(ab.f11351g) + f11696e.a().a() + f11696e.a().c()));
                        if (z4) {
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.put(new dh(di.WIFI).b());
                            if (this.f11701g == null) {
                                this.f11701g = new dh(di.CELLULAR);
                            }
                            jSONArray.put(this.f11701g.b());
                            try {
                                if (y.b(ab.f11351g, "android.permission.BLUETOOTH")) {
                                    jSONArray.put(new dh(di.BLUETOOTH).b());
                                }
                            } catch (Throwable unused2) {
                            }
                            jSONObject.put("networks", jSONArray);
                            jSONObject.put(com.umeng.analytics.pro.d.B, new cx().b());
                        }
                    } catch (Throwable unused3) {
                    }
                }
                return jSONObject;
            }
        }
        return null;
    }

    public void a() {
        da daVar = f11697f;
        if (daVar != null) {
            daVar.c();
        }
    }
}
