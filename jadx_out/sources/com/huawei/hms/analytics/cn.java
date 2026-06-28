package com.huawei.hms.analytics;

import androidx.core.app.NotificationCompat;
import com.huawei.hms.analytics.core.crypto.RandomUtil;
import com.huawei.hms.analytics.database.LogEvent;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class cn {
    String fgh;
    int ghi;
    boolean ikl;
    JSONArray lmn = new JSONArray();
    final List<Long> klm = new ArrayList();
    final List<Long> ijk = new ArrayList();
    String hij = RandomUtil.getInstance().generateSecureRandomStr(16);

    /* JADX INFO: Access modifiers changed from: package-private */
    public cn(int i5) {
        this.ghi = i5;
    }

    public final void hij() {
        this.ijk.clear();
        this.fgh = "";
    }

    public final void ijk() {
        this.klm.clear();
        this.hij = RandomUtil.getInstance().generateSecureRandomStr(16);
        this.lmn = new JSONArray();
    }

    public final boolean ikl() {
        return this.ikl && this.ijk.size() == this.ghi;
    }

    public final JSONObject klm() {
        JSONObject jSONObject = new JSONObject();
        at atVar = ar.lmn().lmn;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("protocol_version", "1");
        jSONObject2.put("productid", atVar.f8152n.ikl);
        jSONObject2.put("chifer", "");
        jSONObject2.put("appid", atVar.f8152n.klm);
        jSONObject2.put("requestid", this.hij);
        jSONObject2.put("servicetag", "_openness_log_tag");
        jSONObject2.put("compress_mode", "0");
        jSONObject2.put("serviceid", "hmshimaintqrt");
        jSONObject2.put("timestamp", String.valueOf(System.currentTimeMillis()));
        jSONObject.put("header", jSONObject2);
        jSONObject.put(NotificationCompat.CATEGORY_EVENT, this.lmn);
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int lmn(JSONArray jSONArray, List<LogEvent> list) {
        if (list == null || list.size() == 0) {
            throw new IllegalArgumentException("log events is empty");
        }
        int i5 = 0;
        for (LogEvent logEvent : list) {
            i5++;
            this.klm.add(logEvent.getId());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_EVENT, logEvent.getEventId());
            jSONObject.put("eventtime", logEvent.getEvtTime());
            try {
                jSONObject.put("properties", new JSONObject(logEvent.getContent()));
                jSONArray.put(jSONObject);
            } catch (JSONException unused) {
            }
            if (this.klm.size() >= 300) {
                break;
            }
        }
        return i5;
    }

    public final boolean lmn() {
        return this.lmn.length() != 0;
    }
}
