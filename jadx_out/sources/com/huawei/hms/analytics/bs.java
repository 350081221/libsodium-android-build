package com.huawei.hms.analytics;

import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.framework.config.EvtHeaderAttributeCollector;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class bs implements EvtHeaderAttributeCollector {
    private String ikl;
    private String klm;
    private JSONObject lmn;

    public bs(JSONObject jSONObject, String str, String str2) {
        this.lmn = jSONObject;
        this.klm = str;
        this.ikl = str2;
    }

    @Override // com.huawei.hms.analytics.framework.config.EvtHeaderAttributeCollector
    public final JSONObject doCollector() {
        if (this.lmn == null) {
            return null;
        }
        at atVar = ar.lmn().lmn;
        String str = atVar.f8152n.ikl;
        String lmn = atVar.lmn(this.klm);
        try {
            JSONObject jSONObject = this.lmn;
            if (str == null) {
                str = "";
            }
            jSONObject.put("productid", str);
            JSONObject jSONObject2 = this.lmn;
            if (lmn == null) {
                lmn = "";
            }
            jSONObject2.put("pubkey_version", lmn);
            if (("_openness_config_tag".equals(this.ikl) || "AGC_TAG".equals(this.ikl)) && "CN".equals(this.klm)) {
                this.lmn.put("wxappid", atVar.f8159u);
            }
        } catch (JSONException unused) {
            HiLog.e("OpennessHeaderGathering", "doCollector JSONException");
        }
        return this.lmn;
    }
}
