package com.huawei.hms.analytics;

import com.huawei.hms.analytics.database.LogConfig;
import java.io.Serializable;
import java.util.Comparator;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class df implements Serializable, Comparator<ax> {

    /* loaded from: classes3.dex */
    public static class klm implements Serializable, Comparator<LogConfig> {
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(LogConfig logConfig, LogConfig logConfig2) {
            return logConfig.getRegion().compareTo(logConfig2.getRegion());
        }
    }

    /* loaded from: classes3.dex */
    public static class lmn implements Serializable, Comparator<JSONObject> {
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(JSONObject jSONObject, JSONObject jSONObject2) {
            long parseLong = Long.parseLong(jSONObject.optString(com.umeng.analytics.pro.bi.aL, "0"));
            long parseLong2 = Long.parseLong(jSONObject2.optString(com.umeng.analytics.pro.bi.aL, "0"));
            if (parseLong > parseLong2) {
                return 1;
            }
            return parseLong == parseLong2 ? 0 : -1;
        }
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(ax axVar, ax axVar2) {
        return axVar.lmn.compareTo(axVar2.lmn);
    }
}
