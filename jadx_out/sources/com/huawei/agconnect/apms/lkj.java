package com.huawei.agconnect.apms;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class lkj {
    public String abc;
    public int bcd;
    public long cde;

    public lkj(String str, int i5, long j5) {
        this.abc = str;
        this.bcd = i5;
        this.cde = j5;
    }

    public JSONObject abc() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.abc);
        jSONObject.put("state", this.bcd);
        jSONObject.put(CrashHianalyticsData.TIME, this.cde);
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lkj.class == obj.getClass()) {
            return this.abc.equals(((lkj) obj).abc);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.abc);
    }

    public lkj(JSONObject jSONObject) {
        this.abc = jSONObject.optString("id", "");
        this.bcd = jSONObject.optInt("state", 0);
        this.cde = jSONObject.optLong(CrashHianalyticsData.TIME, 0L);
    }
}
