package com.huawei.hms.analytics;

import com.huawei.hms.analytics.core.crypto.RandomUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ap {
    private final String ghi;
    private final String hij;
    private final String ijk;
    private final String ikl;
    private final String klm;
    private final String lmn;

    public ap(String str, String str2, String str3, ao aoVar) {
        this.lmn = str == null ? "" : str;
        this.klm = str2 == null ? "" : str2;
        this.ikl = str3 == null ? "" : str3;
        this.hij = aoVar.lmn;
        String str4 = aoVar.klm;
        this.ijk = str4 != null ? str4 : "";
        this.ghi = RandomUtil.getInstance().generateSecureRandomStr(16);
    }

    public final JSONObject lmn() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("$PushMsgId", this.lmn);
            jSONObject.put("$PushCmdType", this.klm);
            jSONObject.put("$PushNotifyId", this.ikl);
            jSONObject.put("$CampaignPushInfo", this.ijk);
            jSONObject.put(com.umeng.analytics.pro.bi.aL, this.hij);
            jSONObject.put("f", this.ghi);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
