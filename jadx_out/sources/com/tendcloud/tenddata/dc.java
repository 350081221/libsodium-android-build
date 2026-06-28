package com.tendcloud.tenddata;

import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class dc extends cy {
    public dc() {
        a("tid", j.a(ab.f11351g));
    }

    public void a() {
        a("serialNo", l.a("serialNo"));
        a("adId", l.b(ab.f11351g));
        try {
            JSONArray A = o.A(ab.f11351g);
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            JSONArray jSONArray4 = new JSONArray();
            if (A != null && A.length() > 0) {
                JSONObject jSONObject = A.getJSONObject(0);
                if (jSONObject.has("imei")) {
                    jSONArray.put(jSONObject.get("imei"));
                }
                if (jSONObject.has("imei5")) {
                    jSONArray2.put(jSONObject.get("imei5"));
                }
                if (jSONObject.has("meid")) {
                    jSONArray3.put(jSONObject.get("meid"));
                }
                if (jSONObject.has("meid5")) {
                    jSONArray4.put(jSONObject.get("meid5"));
                }
                if (A.length() == 2) {
                    JSONObject jSONObject2 = A.getJSONObject(1);
                    if (jSONObject2.has("imei")) {
                        jSONArray.put(jSONObject2.get("imei"));
                    }
                    if (jSONObject2.has("imei5")) {
                        jSONArray2.put(jSONObject2.get("imei5"));
                    }
                    if (jSONObject2.has("meid")) {
                        jSONArray3.put(jSONObject2.get("meid"));
                    }
                    if (jSONObject2.has("meid5")) {
                        jSONArray4.put(jSONObject2.get("meid5"));
                    }
                }
            }
            a("imeis", jSONArray);
            a("imeis5", jSONArray2);
            a("meids", jSONArray3);
            a("meids5", jSONArray4);
        } catch (Exception unused) {
        }
        JSONArray jSONArray5 = new JSONArray();
        jSONArray5.put(l.a("mac"));
        a("wifiMacs", jSONArray5);
        JSONArray jSONArray6 = new JSONArray();
        jSONArray6.put(l.a("ethMac"));
        a("ethMacs", jSONArray6);
        a("androidId", l.a("androidId"));
        a("msaIds", df.a().b());
    }
}
