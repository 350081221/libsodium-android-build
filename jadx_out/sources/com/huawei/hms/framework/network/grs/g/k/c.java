package com.huawei.hms.framework.network.grs.g.k;

import android.content.Context;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final GrsBaseInfo f8500a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f8501b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<String> f8502c = new HashSet();

    public c(GrsBaseInfo grsBaseInfo, Context context) {
        this.f8500a = grsBaseInfo;
        this.f8501b = context;
    }

    private String e() {
        Set<String> b5 = com.huawei.hms.framework.network.grs.f.b.a(this.f8501b.getPackageName(), this.f8500a).b();
        if (b5.isEmpty()) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = b5.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        try {
            jSONObject.put("services", jSONArray);
            Logger.i("GrsRequestInfo", "post service list is:%s", jSONObject.toString());
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    private String f() {
        Logger.v("GrsRequestInfo", "getGeoipService enter");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = this.f8502c.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        try {
            jSONObject.put("services", jSONArray);
            Logger.v("GrsRequestInfo", "post query service list is:%s", jSONObject.toString());
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public Context a() {
        return this.f8501b;
    }

    public void a(String str) {
        this.f8502c.add(str);
    }

    public GrsBaseInfo b() {
        return this.f8500a;
    }

    public String c() {
        return this.f8502c.size() == 0 ? e() : f();
    }

    public Set<String> d() {
        return this.f8502c;
    }
}
