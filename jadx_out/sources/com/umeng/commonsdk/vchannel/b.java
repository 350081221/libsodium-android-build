package com.umeng.commonsdk.vchannel;

import android.content.Context;
import com.umeng.commonsdk.service.UMGlobalContext;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private String f13522b;

    /* renamed from: a, reason: collision with root package name */
    private String f13521a = "_$unknown";

    /* renamed from: c, reason: collision with root package name */
    private long f13523c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f13524d = 0;

    /* renamed from: e, reason: collision with root package name */
    private String f13525e = a.f13520j;

    /* renamed from: f, reason: collision with root package name */
    private Map<String, Object> f13526f = null;

    public b(Context context) {
        this.f13522b = UMGlobalContext.getInstance(context).getProcessName(context);
    }

    public String a() {
        return this.f13521a;
    }

    public long b() {
        return this.f13523c;
    }

    public Map<String, Object> c() {
        return this.f13526f;
    }

    public JSONObject d() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", this.f13521a);
            jSONObject.put("pn", this.f13522b);
            jSONObject.put("ds", this.f13524d);
            jSONObject.put("ts", this.f13523c);
            Map<String, Object> map = this.f13526f;
            if (map != null && map.size() > 0) {
                for (String str : this.f13526f.keySet()) {
                    jSONObject.put(str, this.f13526f.get(str));
                }
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(this.f13525e, jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("ekv", jSONArray2);
            return jSONObject3;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        sb.append("id:" + this.f13521a + ",");
        sb.append("pn:" + this.f13522b + ",");
        sb.append("ts:" + this.f13523c + ",");
        Map<String, Object> map = this.f13526f;
        if (map != null && map.size() > 0) {
            for (String str2 : this.f13526f.keySet()) {
                Object obj = this.f13526f.get(str2);
                if (obj == null) {
                    str = str2 + ": null,";
                } else {
                    str = str2 + ": " + obj.toString() + ",";
                }
                sb.append(str);
            }
        }
        sb.append("ds:" + this.f13524d + "]");
        return sb.toString();
    }

    public void a(String str) {
        this.f13521a = str;
    }

    public void a(long j5) {
        this.f13523c = j5;
    }

    public void a(Map<String, Object> map) {
        this.f13526f = map;
    }
}
