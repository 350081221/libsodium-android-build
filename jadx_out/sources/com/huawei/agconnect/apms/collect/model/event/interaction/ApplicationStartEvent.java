package com.huawei.agconnect.apms.collect.model.event.interaction;

import com.huawei.agconnect.apms.Agent;
import com.huawei.agconnect.apms.abc;
import com.huawei.agconnect.apms.c;
import com.huawei.agconnect.apms.collect.model.event.Event;
import com.huawei.agconnect.apms.ghi;
import com.huawei.agconnect.apms.l0;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ApplicationStartEvent extends Event {
    public String activityName;
    public long appCreateTime;
    public long appStartTime;
    public long contextInitTime;
    public long mainActivityCreateTime;
    public long mainActivityResumeTime;
    public l0 pageLoadInfo;
    public String startType;

    /* loaded from: classes3.dex */
    public interface StartType {
        public static final String COLD_START = "cold_start";
        public static final String HOT_START = "hot_start";
    }

    public ApplicationStartEvent(long j5, String str, String str2, long j6, long j7, long j8, long j9, long j10) {
        this.timestamp = j5;
        this.activityName = str;
        this.startType = str2;
        this.appStartTime = j6;
        this.contextInitTime = j7;
        this.appCreateTime = j8;
        this.mainActivityCreateTime = j9;
        this.mainActivityResumeTime = j10;
        this.runtimeEnvInformation = Agent.getRuntimeEnvInformation();
    }

    private long computeAppStartTime() {
        l0 l0Var = this.pageLoadInfo;
        if (l0Var != null) {
            long j5 = this.appStartTime;
            c cVar = l0Var.def;
            long j6 = cVar.bcd - cVar.abc;
            if (j5 > j6) {
                this.appStartTime = j6;
            }
        }
        return this.appStartTime;
    }

    private boolean isSlowStart() {
        if ("cold_start".equals(this.startType)) {
            if (computeAppStartTime() > ghi.def().abc.getInt("DEFAULT_VALUE_MAX_COLD_START_THRESHOLD", 3000)) {
                return true;
            }
            return false;
        }
        long computeAppStartTime = computeAppStartTime();
        ghi.def().abc();
        if (computeAppStartTime > 1000) {
            return true;
        }
        return false;
    }

    @Override // com.huawei.agconnect.apms.collect.model.event.Event, com.huawei.agconnect.apms.collect.type.CollectableArray
    public JSONArray asJsonArray() {
        JSONObject jSONObject;
        l0 l0Var;
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.runtimeEnvInformation.asJsonArray());
        abc.abc(this.timestamp, jSONArray);
        String str = this.activityName;
        String str2 = "null";
        if (str == null) {
            str = "null";
        }
        jSONArray.put(str);
        String str3 = this.startType;
        if (str3 != null) {
            str2 = str3;
        }
        jSONArray.put(str2);
        abc.abc(isSlowStart() ? 1 : 0, jSONArray);
        abc.abc(computeAppStartTime(), jSONArray);
        abc.abc(this.contextInitTime, jSONArray);
        abc.abc(this.appCreateTime, jSONArray);
        abc.abc(this.mainActivityCreateTime, jSONArray);
        abc.abc(this.mainActivityResumeTime, jSONArray);
        if (isSlowStart() && (l0Var = this.pageLoadInfo) != null) {
            jSONObject = l0Var.asJsonObject();
        } else {
            jSONObject = new JSONObject();
        }
        jSONArray.put(jSONObject);
        return jSONArray;
    }

    public void setPageLoadInfo(l0 l0Var) {
        this.pageLoadInfo = l0Var;
    }
}
