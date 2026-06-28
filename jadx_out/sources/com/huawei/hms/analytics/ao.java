package com.huawei.hms.analytics;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ao {
    private String ghi;
    private String hij;
    private String ijk;
    private String ikl;
    String klm;
    String lmn;

    public ao(String str) {
        JSONObject jSONObject = new JSONObject(str);
        this.ikl = jSONObject.optString("activityId");
        this.ijk = jSONObject.optString("nodeId");
        this.hij = jSONObject.optString("source");
        this.ghi = jSONObject.optString("medium");
        this.lmn = jSONObject.optString("endTime", "0");
        this.klm = str;
    }

    public final JSONObject lmn() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("aid", this.ikl);
            jSONObject.putOpt("nid", this.ijk);
            jSONObject.putOpt(com.umeng.analytics.pro.bi.aE, this.hij);
            jSONObject.putOpt("m", this.ghi);
            jSONObject.putOpt(com.umeng.analytics.pro.bi.aL, this.lmn);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
