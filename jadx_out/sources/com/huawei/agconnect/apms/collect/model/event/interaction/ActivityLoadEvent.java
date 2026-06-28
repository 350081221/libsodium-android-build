package com.huawei.agconnect.apms.collect.model.event.interaction;

import com.huawei.agconnect.apms.Agent;
import com.huawei.agconnect.apms.abc;
import com.huawei.agconnect.apms.collect.model.EventType;
import com.huawei.agconnect.apms.collect.model.event.Event;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class ActivityLoadEvent extends Event {
    public String activityName;
    public long loadCost;
    public String loadType;
    public long viewLoadCost;
    public long viewPreparedCost;

    /* loaded from: classes3.dex */
    public interface LoadType {
        public static final String COLD_LOAD = "cold_load";
    }

    public ActivityLoadEvent(long j5, String str, String str2, long j6, long j7, long j8) {
        this.timestamp = j5;
        this.eventName = EventType.ACTIVITY_LOAD;
        this.activityName = str;
        this.loadType = str2;
        this.loadCost = j6;
        this.viewPreparedCost = j7;
        this.viewLoadCost = j8;
        this.runtimeEnvInformation = Agent.getRuntimeEnvInformation();
    }

    @Override // com.huawei.agconnect.apms.collect.model.event.Event, com.huawei.agconnect.apms.collect.type.CollectableArray
    public JSONArray asJsonArray() {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.runtimeEnvInformation.asJsonArray());
        abc.abc(this.timestamp, jSONArray);
        String str = this.activityName;
        String str2 = "null";
        if (str == null) {
            str = "null";
        }
        jSONArray.put(str);
        String str3 = this.loadType;
        if (str3 != null) {
            str2 = str3;
        }
        jSONArray.put(str2);
        abc.abc(this.loadCost, jSONArray);
        abc.abc(this.viewPreparedCost, jSONArray);
        abc.abc(this.viewLoadCost, jSONArray);
        return jSONArray;
    }
}
