package com.tendcloud.tenddata;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class cw extends cy {

    /* renamed from: a, reason: collision with root package name */
    private static HashMap<String, Object> f11643a = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private static HashMap<String, Object> f11644c = new HashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private static volatile cw f11645f = null;

    /* renamed from: d, reason: collision with root package name */
    private final String[] f11646d = {"PUSH", "EAuth"};

    /* renamed from: e, reason: collision with root package name */
    private final String[] f11647e = {GrsBaseInfo.CountryCodeSource.APP, "TRACKING", "GAME", "BG", "SDK"};

    private cw() {
        a("displayName", g.a().h(ab.f11351g));
        a("globalId", g.a().a(ab.f11351g));
        a(TTDownloadField.TT_VERSION_NAME, i.k());
        a(TTDownloadField.TT_VERSION_CODE, Integer.valueOf(i.j()));
        a("installTime", Long.valueOf(g.a().d(ab.f11351g)));
        a("updateTime", Long.valueOf(g.a().e(ab.f11351g)));
    }

    private ArrayList<a> c() {
        ArrayList<a> arrayList = new ArrayList<>();
        try {
            Iterator<Map.Entry<String, Object>> it = f11643a.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(a.valueOf(it.next().getKey().toString()));
            }
        } catch (Throwable unused) {
        }
        return arrayList;
    }

    public void a(Object obj, a aVar) {
        f11643a.put(aVar.name(), obj);
    }

    public void b(Object obj, a aVar) {
        f11644c.put(aVar.name(), obj);
    }

    public void setAppChannel(String str) {
        a("channel", str);
    }

    public void setSubmitAppId(a aVar) {
        if (aVar != null) {
            try {
                Object obj = f11643a.get(aVar.name());
                if (obj == null && f11643a.size() > 0) {
                    obj = a(aVar);
                }
                a("appKey", obj);
            } catch (Throwable unused) {
            }
        }
    }

    public void setSubmitChannelId(a aVar) {
        if (aVar != null) {
            try {
                Object obj = f11644c.get(aVar.name());
                if (obj == null && f11644c.size() > 0) {
                    obj = f11644c.get(c().get(0).name());
                }
                a("channel", obj);
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        setAppChannel("Default");
    }

    public void setUniqueId(String str) {
        a("uniqueId", str);
    }

    private Object a(a aVar) {
        Object obj = null;
        obj = null;
        if (aVar != null) {
            try {
                if (Arrays.asList(this.f11646d).contains(aVar.name())) {
                    JSONArray jSONArray = new JSONArray();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("appKey", (Object) null);
                    jSONObject.put("service", (Object) null);
                    jSONArray.put(jSONObject);
                    try {
                        if (!y.b((String) null)) {
                            a(jSONArray, aVar);
                        }
                    } catch (Throwable unused) {
                    }
                    obj = jSONArray;
                } else if (Arrays.asList(this.f11647e).contains(aVar.name())) {
                    String a5 = ab.a(ab.f11351g, aVar);
                    boolean b5 = y.b(a5);
                    obj = a5;
                    if (!b5) {
                        a((Object) a5, aVar);
                        obj = a5;
                    }
                } else {
                    obj = f11643a.get(c().get(0).name());
                }
            } catch (Throwable unused2) {
            }
        }
        return obj;
    }

    public static cw a() {
        if (f11645f == null) {
            synchronized (cp.class) {
                if (f11645f == null) {
                    f11645f = new cw();
                }
            }
        }
        return f11645f;
    }
}
